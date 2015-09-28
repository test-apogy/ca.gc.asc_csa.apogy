/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.symphony.tools.ui.SymphonyToolsUIPackage
 * @generated
 */
public interface SymphonyToolsUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SymphonyToolsUIFactory eINSTANCE = ca.gc.asc_csa.symphony.tools.ui.impl.SymphonyToolsUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ruler3d Tool Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruler3d Tool Node Presentation</em>'.
	 * @generated
	 */
	Ruler3dToolNodePresentation createRuler3dToolNodePresentation();

	/**
	 * Returns a new object of class '<em>Sun Vector3 DTool Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sun Vector3 DTool Node Presentation</em>'.
	 * @generated
	 */
	SunVector3DToolNodePresentation createSunVector3DToolNodePresentation();

	/**
	 * Returns a new object of class '<em>Trajectory3 DTool Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trajectory3 DTool Node Presentation</em>'.
	 * @generated
	 */
	Trajectory3DToolNodePresentation createTrajectory3DToolNodePresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SymphonyToolsUIPackage getSymphonyToolsUIPackage();

} //SymphonyToolsUIFactory
