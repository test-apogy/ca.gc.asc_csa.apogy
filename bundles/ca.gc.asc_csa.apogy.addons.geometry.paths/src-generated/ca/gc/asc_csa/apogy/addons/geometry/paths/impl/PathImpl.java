/**
 * Canadian Space Agency 2007.
 *
 * $Id: PathImpl.java,v 1.4.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.geometry.paths.impl;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.geometry.paths.Path;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage;
import ca.gc.asc_csa.apogy.common.topology.impl.NodeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Path</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class PathImpl extends NodeImpl implements Path {
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
		return ApogyAddonsGeometryPathsPackage.Literals.PATH;
	}

} // PathImpl
