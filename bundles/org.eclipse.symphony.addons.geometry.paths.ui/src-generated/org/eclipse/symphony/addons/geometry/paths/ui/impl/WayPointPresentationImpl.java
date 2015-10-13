/**
 * <copyright>
 * </copyright>
 *
 * $Id: WayPointPresentationImpl.java,v 1.1.4.2 2015/05/21 15:50:31 pallard Exp $
 */
package org.eclipse.symphony.addons.geometry.paths.ui.impl;

import javax.vecmath.Point3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.geometry.paths.ui.PathsUIPackage;
import org.eclipse.symphony.addons.geometry.paths.ui.WayPointPresentation;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl;

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
		return PathsUIPackage.Literals.WAY_POINT_PRESENTATION;
	}
	
	@Override
	public Tuple3d getCentroid()
	{
		Point3d point3d = new Point3d();
		
		if(sceneObject != null)
		{
			point3d = sceneObject.getCentroid();
		}
		
		return MathFacade.INSTANCE.createTuple3d(point3d);
	}
	
} //WayPointPresentationImpl
