package cn.dlb.bim.ifc.idm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import cn.dlb.bim.ifc.emf.PackageMetaData;
import cn.dlb.bim.models.ifc2x3tc1.Ifc2x3tc1Package;
import nl.tue.buildingsmart.schema.Attribute;
import nl.tue.buildingsmart.schema.EntityDefinition;
import nl.tue.buildingsmart.schema.InverseAttribute;

public class AbstractObjectIDM implements ObjectIDM {

	private final Set<EClass> includedClasses = new HashSet<EClass>();
	private final Map<EClass, Set<EStructuralFeature>> includedFeatures = new HashMap<EClass, Set<EStructuralFeature>>();
	private final Map<EClass, AbstractObjectIDM> originMap = new HashMap<EClass, AbstractObjectIDM>();
	private PackageMetaData packageMetaData;

	public AbstractObjectIDM(PackageMetaData packageMetaData) {
		this.packageMetaData = packageMetaData;
	}
	
	public void includeAllClasses() {
		for (EClassifier eClassifier : Ifc2x3tc1Package.eINSTANCE.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				includedClasses.add((EClass)eClassifier);
			}
		}
	}
	
	public void exclude(EClass eClass) {
		includedClasses.remove(eClass);
		for (EClass subClass : packageMetaData.getDirectSubClasses(eClass)) {
			exclude(subClass);
		}
	}
	
	public void include(EClass eClass) {
		includedClasses.add(eClass);
		for (EClass subClass : packageMetaData.getDirectSubClasses(eClass)) {
			include(subClass);
		}
	}

	public AbstractObjectIDM getOrigin(EClass originalClass) {
		if (!originMap.containsKey(originalClass)) {
			AbstractObjectIDM originObjectIdm = new AbstractObjectIDM(packageMetaData);
			originMap.put(originalClass, originObjectIdm);
			return originObjectIdm;
		}
		return originMap.get(originalClass);
	}
	
	protected boolean isInverse(EStructuralFeature eStructuralFeature) throws ObjectIDMException {
		if (eStructuralFeature instanceof EReference && eStructuralFeature.getEContainingClass().getEAnnotation("wrapped") == null) {
			if (eStructuralFeature.getEAnnotation("hidden") == null && eStructuralFeature.getEContainingClass().getEAnnotation("hidden") == null) {
				EntityDefinition entityBN = packageMetaData.getSchemaDefinition().getEntityBN(eStructuralFeature.getEContainingClass().getName());
				if (entityBN == null) {
					throw new ObjectIDMException(eStructuralFeature.getEContainingClass().getName() + " not found");
				}
				Attribute attribute = entityBN.getAttributeBNWithSuper(eStructuralFeature.getName());
				return attribute instanceof InverseAttribute;
			} else {
				return false;
			}
		}
		return false;
	}
	
	public void include(EClass eClass, EStructuralFeature eStructuralFeature) {
		if (!includedFeatures.containsKey(eClass)) {
			includedFeatures.put(eClass, new HashSet<EStructuralFeature>());
		}
		includedFeatures.get(eClass).add(eStructuralFeature);
		for (EClass subClass : packageMetaData.getDirectSubClasses(eClass)) {
			include(subClass, eStructuralFeature);
		}
	}
	
	public void exclude(EClass eClass, EStructuralFeature eStructuralFeature) {
		if (includedFeatures.containsKey(eClass)) {
			includedFeatures.get(eClass).remove(eStructuralFeature);
		}
		for (EClass subClass : packageMetaData.getDirectSubClasses(eClass)) {
			exclude(subClass, eStructuralFeature);
		}
	}
	
	@Override
	public boolean shouldFollowReference(EClass originalClass, EClass eClass, EStructuralFeature eStructuralFeature) {
		if (originMap.containsKey(originalClass)) {
			return originMap.get(originalClass).shouldFollowReference(originalClass, eClass, eStructuralFeature);
		} else {
			return includedFeatures.containsKey(eClass) && includedFeatures.get(eClass).contains(eStructuralFeature);
		}
	}

	@Override
	public boolean shouldIncludeClass(EClass originalClass, EClass eClass) {
		if (originMap.containsKey(originalClass)) {
			return originMap.get(originalClass).shouldIncludeClass(originalClass, eClass);
		} else {
			return includedClasses.contains(eClass);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Included classes:\n");
		for (EClass eClass : includedClasses) {
			sb.append("  " + eClass.getName() + "\n");
		}
		sb.append("Included features:\n");
		for (EClass eClass : includedFeatures.keySet()) {
			sb.append("  " + eClass.getName() + "\n");
			for (EStructuralFeature eStructuralFeature : includedFeatures.get(eClass)) {
				sb.append("    " + eStructuralFeature.getName() + "\n");
			}
		}
		return sb.toString();
	}
}