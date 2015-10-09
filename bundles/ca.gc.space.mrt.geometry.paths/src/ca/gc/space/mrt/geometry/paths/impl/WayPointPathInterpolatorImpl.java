/**
 * Canadian Space Agency 2007.
 *
 * $Id: WayPointPathInterpolatorImpl.java,v 1.2.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package ca.gc.space.mrt.geometry.paths.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.processors.impl.ProcessorImpl;

import ca.gc.space.mrt.geometry.paths.PathsPackage;
import ca.gc.space.mrt.geometry.paths.WayPointPath;
import ca.gc.space.mrt.geometry.paths.WayPointPathInterpolator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Way Point Path Interpolator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class WayPointPathInterpolatorImpl extends ProcessorImpl<WayPointPath, WayPointPath> implements WayPointPathInterpolator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

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
		return PathsPackage.Literals.WAY_POINT_PATH_INTERPOLATOR;
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
