/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.controllers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage
 * @generated
 */
public interface ApogyCoreProgramsControllersFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCoreProgramsControllersFactory eINSTANCE = ca.gc.asc_csa.apogy.core.programs.controllers.impl.ApogyCoreProgramsControllersFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCoreProgramsControllersFacade createApogyCoreProgramsControllersFacade();

		/**
	 * Returns a new object of class '<em>Controllers Configuration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controllers Configuration</em>'.
	 * @generated
	 */
  ControllersConfiguration createControllersConfiguration();

  /**
	 * Returns a new object of class '<em>Operation Call Controller Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Call Controller Binding</em>'.
	 * @generated
	 */
  OperationCallControllerBinding createOperationCallControllerBinding();

  /**
	 * Returns a new object of class '<em>Time Trigger</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Trigger</em>'.
	 * @generated
	 */
  TimeTrigger createTimeTrigger();

  /**
	 * Returns a new object of class '<em>Controller Edge Trigger</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller Edge Trigger</em>'.
	 * @generated
	 */
  ControllerEdgeTrigger createControllerEdgeTrigger();

  /**
	 * Returns a new object of class '<em>Controller State Trigger</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller State Trigger</em>'.
	 * @generated
	 */
  ControllerStateTrigger createControllerStateTrigger();

  /**
	 * Returns a new object of class '<em>Binded EData Type Argument</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binded EData Type Argument</em>'.
	 * @generated
	 */
  BindedEDataTypeArgument createBindedEDataTypeArgument();

  /**
	 * Returns a new object of class '<em>Fixed Value Source</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Value Source</em>'.
	 * @generated
	 */
  FixedValueSource createFixedValueSource();

  /**
	 * Returns a new object of class '<em>Toggle Value Source</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toggle Value Source</em>'.
	 * @generated
	 */
  ToggleValueSource createToggleValueSource();

  /**
	 * Returns a new object of class '<em>Controller Value Source</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller Value Source</em>'.
	 * @generated
	 */
  ControllerValueSource createControllerValueSource();

  /**
	 * Returns a new object of class '<em>Linear Input Conditioning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Input Conditioning</em>'.
	 * @generated
	 */
	LinearInputConditioning createLinearInputConditioning();

		/**
	 * Returns a new object of class '<em>Centered Linear Input Conditioning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Centered Linear Input Conditioning</em>'.
	 * @generated
	 */
	CenteredLinearInputConditioning createCenteredLinearInputConditioning();

		/**
	 * Returns a new object of class '<em>Parabolic Input Conditioning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parabolic Input Conditioning</em>'.
	 * @generated
	 */
	ParabolicInputConditioning createParabolicInputConditioning();

		/**
	 * Returns a new object of class '<em>Centered Parabolic Input Conditioning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Centered Parabolic Input Conditioning</em>'.
	 * @generated
	 */
	CenteredParabolicInputConditioning createCenteredParabolicInputConditioning();

		/**
	 * Returns a new object of class '<em>User Defined Input Conditioning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Defined Input Conditioning</em>'.
	 * @generated
	 */
	UserDefinedInputConditioning createUserDefinedInputConditioning();

		/**
	 * Returns a new object of class '<em>Custom Input Conditioning Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Input Conditioning Point</em>'.
	 * @generated
	 */
	CustomInputConditioningPoint createCustomInputConditioningPoint();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCoreProgramsControllersPackage getApogyCoreProgramsControllersPackage();

} //ApogyCoreProgramsControllersFactory
