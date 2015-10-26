/**
 * Canadian Space Agency 2007.
 *
 * $Id: SphericalCoordinatesSetImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.symphony.common.geometry.data.impl.CoordinatesSetImpl;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.geometry.data3d.SphericalCoordinates;
import org.eclipse.symphony.common.geometry.data3d.SphericalCoordinatesSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spherical Coordinates Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SphericalCoordinatesSetImpl extends CoordinatesSetImpl<SphericalCoordinates> implements SphericalCoordinatesSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SphericalCoordinatesSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonGeometryData3DPackage.Literals.SPHERICAL_COORDINATES_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<SphericalCoordinates> getPoints() {
		if (points == null) {
			points = new EObjectContainmentEList<SphericalCoordinates>(SphericalCoordinates.class, this, Symphony__CommonGeometryData3DPackage.SPHERICAL_COORDINATES_SET__POINTS);
		}
		return points;
	}

} //SphericalCoordinatesSetImpl
