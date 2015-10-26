/**
 * Canadian Space Agency 2007.
 *
 * $Id: WayPointPathInterpolatorImpl.java,v 1.2.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package org.eclipse.symphony.addons.geometry.paths.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.addons.geometry.paths.WayPointPathInterpolator;
import org.eclipse.symphony.common.processors.impl.ProcessorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Way Point Path Interpolator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class WayPointPathInterpolatorImpl extends ProcessorImpl<WayPointPath, WayPointPath> implements WayPointPathInterpolator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WayPointPathInterpolatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsGeometryPathsPackage.Literals.WAY_POINT_PATH_INTERPOLATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(WayPointPath newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(WayPointPath newOutput) {
		super.setOutput(newOutput);
	}

} //WayPointPathInterpolatorImpl
