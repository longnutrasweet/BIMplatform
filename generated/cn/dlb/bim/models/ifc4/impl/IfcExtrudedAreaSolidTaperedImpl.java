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
import cn.dlb.bim.models.ifc4.IfcExtrudedAreaSolidTapered;
import cn.dlb.bim.models.ifc4.IfcProfileDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Extruded Area Solid Tapered</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cn.dlb.bim.models.ifc4.impl.IfcExtrudedAreaSolidTaperedImpl#getEndSweptArea <em>End Swept Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcExtrudedAreaSolidTaperedImpl extends IfcExtrudedAreaSolidImpl implements IfcExtrudedAreaSolidTapered {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcExtrudedAreaSolidTaperedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_EXTRUDED_AREA_SOLID_TAPERED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getEndSweptArea() {
		return (IfcProfileDef) eGet(Ifc4Package.Literals.IFC_EXTRUDED_AREA_SOLID_TAPERED__END_SWEPT_AREA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndSweptArea(IfcProfileDef newEndSweptArea) {
		eSet(Ifc4Package.Literals.IFC_EXTRUDED_AREA_SOLID_TAPERED__END_SWEPT_AREA, newEndSweptArea);
	}

} //IfcExtrudedAreaSolidTaperedImpl
