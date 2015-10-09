/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.pathplanners.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.mobility.pathplanners.ui.PathPlannersUIPackage
 * @generated
 */
public interface PathPlannersUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PathPlannersUIFactory eINSTANCE = org.eclipse.symphony.addons.mobility.pathplanners.ui.impl.PathPlannersUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Circular Exclusion Zone Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circular Exclusion Zone Presentation</em>'.
	 * @generated
	 */
	CircularExclusionZonePresentation createCircularExclusionZonePresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PathPlannersUIPackage getPathPlannersUIPackage();

} //PathPlannersUIFactory
