/**
 * <copyright>
 * </copyright>
 *
 * $Id: WayPointPresentationImpl.java,v 1.1.4.2 2015/05/21 15:50:31 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.geometry.paths.ui.impl;

import javax.vecmath.Point3d;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.ApogyAddonsGeometryPathsUIPackage;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.WayPointPresentation;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Way Point Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WayPointPresentationImpl extends NodePresentationImpl implements WayPointPresentation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WayPointPresentationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ApogyAddonsGeometryPathsUIPackage.Literals.WAY_POINT_PRESENTATION;
	}
	
	@Override
	public Tuple3d getCentroid()
	{
		Point3d point3d = new Point3d();
		
		if(sceneObject != null)
		{
			point3d = sceneObject.getCentroid();
		}
		
		return ApogyCommonMathFacade.INSTANCE.createTuple3d(point3d);
	}
	
} //WayPointPresentationImpl
