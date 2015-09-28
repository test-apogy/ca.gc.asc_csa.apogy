/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.symphony.tools.core.SymphonyToolsCorePackage
 * @generated
 */
public interface SymphonyToolsCoreFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SymphonyToolsCoreFactory eINSTANCE = ca.gc.asc_csa.symphony.tools.core.impl.SymphonyToolsCoreFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Simple Tool List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Tool List</em>'.
	 * @generated
	 */
	SimpleToolList createSimpleToolList();

		/**
	 * Returns a new object of class '<em>Ruler3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruler3 DTool</em>'.
	 * @generated
	 */
	Ruler3DTool createRuler3DTool();

		/**
	 * Returns a new object of class '<em>Ruler3d Tool Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruler3d Tool Node</em>'.
	 * @generated
	 */
	Ruler3dToolNode createRuler3dToolNode();

		/**
	 * Returns a new object of class '<em>Feature Of Interest Picking Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Of Interest Picking Tool</em>'.
	 * @generated
	 */
	FeatureOfInterestPickingTool createFeatureOfInterestPickingTool();

		/**
	 * Returns a new object of class '<em>Sun Vector3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sun Vector3 DTool</em>'.
	 * @generated
	 */
	SunVector3DTool createSunVector3DTool();

		/**
	 * Returns a new object of class '<em>Sun Vector3 DTool Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sun Vector3 DTool Node</em>'.
	 * @generated
	 */
	SunVector3DToolNode createSunVector3DToolNode();

		/**
	 * Returns a new object of class '<em>Trajectory3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trajectory3 DTool</em>'.
	 * @generated
	 */
	Trajectory3DTool createTrajectory3DTool();

		/**
	 * Returns a new object of class '<em>Trajectory3 DTool Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trajectory3 DTool Node</em>'.
	 * @generated
	 */
	Trajectory3DToolNode createTrajectory3DToolNode();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  SymphonyToolsCorePackage getSymphonyToolsCorePackage();

} //SymphonyToolsCoreFactory
