/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.geometry.paths;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage
 * @generated
 */
public interface Symphony__AddonsGeometryPathsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsGeometryPathsFactory eINSTANCE = org.eclipse.symphony.addons.geometry.paths.impl.Symphony__AddonsGeometryPathsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Way Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Way Point</em>'.
	 * @generated
	 */
	WayPoint createWayPoint();

	/**
	 * Returns a new object of class '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path</em>'.
	 * @generated
	 */
	Path createPath();

	/**
	 * Returns a new object of class '<em>Way Point Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Way Point Path</em>'.
	 * @generated
	 */
	WayPointPath createWayPointPath();

	/**
	 * Returns a new object of class '<em>Catmull Rom Way Point Path Interpolator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catmull Rom Way Point Path Interpolator</em>'.
	 * @generated
	 */
	CatmullRomWayPointPathInterpolator createCatmullRomWayPointPathInterpolator();

	/**
	 * Returns a new object of class '<em>Segment Way Point Path Interpolator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment Way Point Path Interpolator</em>'.
	 * @generated
	 */
	SegmentWayPointPathInterpolator createSegmentWayPointPathInterpolator();

	/**
	 * Returns a new object of class '<em>Minimum Distance Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minimum Distance Filter</em>'.
	 * @generated
	 */
	MinimumDistanceFilter createMinimumDistanceFilter();

	/**
	 * Returns a new object of class '<em>Uniform Distance Way Point Path Interpolator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniform Distance Way Point Path Interpolator</em>'.
	 * @generated
	 */
	UniformDistanceWayPointPathInterpolator createUniformDistanceWayPointPathInterpolator();

	/**
	 * Returns a new object of class '<em>Paths Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paths Facade</em>'.
	 * @generated
	 */
	PathsFacade createPathsFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__AddonsGeometryPathsPackage getSymphony__AddonsGeometryPathsPackage();

} //Symphony__AddonsGeometryPathsFactory
