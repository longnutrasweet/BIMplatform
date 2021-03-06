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

import cn.dlb.bim.models.ifc4.Ifc4Package;
import cn.dlb.bim.models.ifc4.IfcAxis2Placement3D;
import cn.dlb.bim.models.ifc4.IfcProfileDef;
import cn.dlb.bim.models.ifc4.IfcSweptAreaSolid;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Swept Area Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcSweptAreaSolidImpl#getSweptArea <em>Swept Area</em>}</li>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcSweptAreaSolidImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcSweptAreaSolidImpl extends IfcSolidModelImpl implements IfcSweptAreaSolid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSweptAreaSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_SWEPT_AREA_SOLID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getSweptArea() {
		return (IfcProfileDef) eGet(Ifc4Package.Literals.IFC_SWEPT_AREA_SOLID__SWEPT_AREA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSweptArea(IfcProfileDef newSweptArea) {
		eSet(Ifc4Package.Literals.IFC_SWEPT_AREA_SOLID__SWEPT_AREA, newSweptArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getPosition() {
		return (IfcAxis2Placement3D) eGet(Ifc4Package.Literals.IFC_SWEPT_AREA_SOLID__POSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IfcAxis2Placement3D newPosition) {
		eSet(Ifc4Package.Literals.IFC_SWEPT_AREA_SOLID__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPosition() {
		eUnset(Ifc4Package.Literals.IFC_SWEPT_AREA_SOLID__POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPosition() {
		return eIsSet(Ifc4Package.Literals.IFC_SWEPT_AREA_SOLID__POSITION);
	}

} //IfcSweptAreaSolidImpl
