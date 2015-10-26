/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.geometry.paths.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.geometry.paths.ui.Symphony__AddonsGeometryPathsUIPackage
 * @generated
 */
public interface Symphony__AddonsGeometryPathsUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsGeometryPathsUIFactory eINSTANCE = org.eclipse.symphony.addons.geometry.paths.ui.impl.Symphony__AddonsGeometryPathsUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Way Point Path Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Way Point Path Presentation</em>'.
	 * @generated
	 */
	WayPointPathPresentation createWayPointPathPresentation();

	/**
	 * Returns a new object of class '<em>Way Point Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Way Point Presentation</em>'.
	 * @generated
	 */
	WayPointPresentation createWayPointPresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__AddonsGeometryPathsUIPackage getSymphony__AddonsGeometryPathsUIPackage();

} //Symphony__AddonsGeometryPathsUIFactory
