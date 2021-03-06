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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import cn.dlb.bim.ifc.emf.IdEObjectImpl;
import cn.dlb.bim.models.ifc4.Ifc4Package;
import cn.dlb.bim.models.ifc4.IfcActorRole;
import cn.dlb.bim.models.ifc4.IfcOrganization;
import cn.dlb.bim.models.ifc4.IfcPerson;
import cn.dlb.bim.models.ifc4.IfcPersonAndOrganization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Person And Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcPersonAndOrganizationImpl#getThePerson <em>The Person</em>}</li>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcPersonAndOrganizationImpl#getTheOrganization <em>The Organization</em>}</li>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcPersonAndOrganizationImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcPersonAndOrganizationImpl extends IdEObjectImpl implements IfcPersonAndOrganization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPersonAndOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_PERSON_AND_ORGANIZATION;
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
	public IfcPerson getThePerson() {
		return (IfcPerson) eGet(Ifc4Package.Literals.IFC_PERSON_AND_ORGANIZATION__THE_PERSON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThePerson(IfcPerson newThePerson) {
		eSet(Ifc4Package.Literals.IFC_PERSON_AND_ORGANIZATION__THE_PERSON, newThePerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganization getTheOrganization() {
		return (IfcOrganization) eGet(Ifc4Package.Literals.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheOrganization(IfcOrganization newTheOrganization) {
		eSet(Ifc4Package.Literals.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION, newTheOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcActorRole> getRoles() {
		return (EList<IfcActorRole>) eGet(Ifc4Package.Literals.IFC_PERSON_AND_ORGANIZATION__ROLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRoles() {
		eUnset(Ifc4Package.Literals.IFC_PERSON_AND_ORGANIZATION__ROLES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoles() {
		return eIsSet(Ifc4Package.Literals.IFC_PERSON_AND_ORGANIZATION__ROLES);
	}

} //IfcPersonAndOrganizationImpl
