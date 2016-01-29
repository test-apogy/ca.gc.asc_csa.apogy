/**
 * Canadian Space Agency 2007.
 *
 * $Id: Mesh25DImpl.java,v 1.4.4.3 2015/09/22 19:39:38 rlarcheveque Exp $
 */
package ca.gc.asc_csa.apogy.common.geometry.data25d.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshImpl;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Mesh25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Polygon25D;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh25 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Mesh25DImpl extends MeshImpl<Coordinates25D, Polygon25D> implements Mesh25D {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mesh25DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData25DPackage.Literals.MESH25_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Polygon25D> getPolygons() {
		if (polygons == null) {
			polygons = new EObjectContainmentEList<Polygon25D>(Polygon25D.class, this, ApogyCommonGeometryData25DPackage.MESH25_D__POLYGONS);
		}
		return polygons;
	}

} //Mesh25DImpl