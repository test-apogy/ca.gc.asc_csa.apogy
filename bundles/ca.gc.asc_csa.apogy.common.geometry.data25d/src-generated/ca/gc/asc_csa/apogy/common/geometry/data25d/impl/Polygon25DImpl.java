/**
 * Canadian Space Agency 2007.
 *
 * $Id: Polygon25DImpl.java,v 1.4.4.3 2015/09/22 19:39:38 rlarcheveque Exp $
 */
package ca.gc.asc_csa.apogy.common.geometry.data25d.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import ca.gc.asc_csa.apogy.common.geometry.data.impl.PolygonImpl;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Polygon25D;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon25 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Polygon25DImpl extends PolygonImpl<Coordinates25D> implements Polygon25D {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Polygon25DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData25DPackage.Literals.POLYGON25_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Coordinates25D> getVertices() {
		if (vertices == null) {
			vertices = new EObjectEList<Coordinates25D>(Coordinates25D.class, this, ApogyCommonGeometryData25DPackage.POLYGON25_D__VERTICES);
		}
		return vertices;
	}

} //Polygon25DImpl
