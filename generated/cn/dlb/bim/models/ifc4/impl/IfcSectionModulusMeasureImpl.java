/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cn.dlb.bim.models.ifc4.impl;

import org.eclipse.emf.ecore.EClass;

import cn.dlb.bim.ifc.emf.IdEObjectImpl;
import cn.dlb.bim.models.ifc4.Ifc4Package;
import cn.dlb.bim.models.ifc4.IfcSectionModulusMeasure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Section Modulus Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcSectionModulusMeasureImpl#getWrappedValue <em>Wrapped Value</em>}</li>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcSectionModulusMeasureImpl#getWrappedValueAsString <em>Wrapped Value As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcSectionModulusMeasureImpl extends IdEObjectImpl implements IfcSectionModulusMeasure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSectionModulusMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_SECTION_MODULUS_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWrappedValue() {
		return (Double) eGet(Ifc4Package.Literals.IFC_SECTION_MODULUS_MEASURE__WRAPPED_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrappedValue(double newWrappedValue) {
		eSet(Ifc4Package.Literals.IFC_SECTION_MODULUS_MEASURE__WRAPPED_VALUE, newWrappedValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrappedValue() {
		eUnset(Ifc4Package.Literals.IFC_SECTION_MODULUS_MEASURE__WRAPPED_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrappedValue() {
		return eIsSet(Ifc4Package.Literals.IFC_SECTION_MODULUS_MEASURE__WRAPPED_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWrappedValueAsString() {
		return (String) eGet(Ifc4Package.Literals.IFC_SECTION_MODULUS_MEASURE__WRAPPED_VALUE_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrappedValueAsString(String newWrappedValueAsString) {
		eSet(Ifc4Package.Literals.IFC_SECTION_MODULUS_MEASURE__WRAPPED_VALUE_AS_STRING, newWrappedValueAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrappedValueAsString() {
		eUnset(Ifc4Package.Literals.IFC_SECTION_MODULUS_MEASURE__WRAPPED_VALUE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrappedValueAsString() {
		return eIsSet(Ifc4Package.Literals.IFC_SECTION_MODULUS_MEASURE__WRAPPED_VALUE_AS_STRING);
	}

} //IfcSectionModulusMeasureImpl
