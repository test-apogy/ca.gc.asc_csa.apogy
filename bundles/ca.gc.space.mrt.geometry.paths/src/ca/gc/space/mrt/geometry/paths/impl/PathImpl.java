/**
 * Canadian Space Agency 2007.
 *
 * $Id: PathImpl.java,v 1.4.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package ca.gc.space.mrt.geometry.paths.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.topology.impl.NodeImpl;

import ca.gc.space.mrt.geometry.paths.Path;
import ca.gc.space.mrt.geometry.paths.PathsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Path</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PathImpl extends NodeImpl implements Path {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathsPackage.Literals.PATH;
	}

} // PathImpl
