/**
 * Canadian Space Agency 2007.
 *
 * $Id: SphericalPolygonImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import ca.gc.asc_csa.apogy.common.geometry.data.impl.PolygonImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spherical Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SphericalPolygonImpl extends PolygonImpl<SphericalCoordinates> implements SphericalPolygon {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SphericalPolygonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.SPHERICAL_POLYGON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<SphericalCoordinates> getVertices() {
		if (vertices == null) {
			vertices = new EObjectEList<SphericalCoordinates>(SphericalCoordinates.class, this, ApogyCommonGeometryData3DPackage.SPHERICAL_POLYGON__VERTICES);
		}
		return vertices;
	}

} //SphericalPolygonImpl
