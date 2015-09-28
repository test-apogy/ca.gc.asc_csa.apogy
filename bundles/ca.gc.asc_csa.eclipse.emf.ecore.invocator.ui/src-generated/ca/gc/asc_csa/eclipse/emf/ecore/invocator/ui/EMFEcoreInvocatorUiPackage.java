/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='EMFEcoreInvocatorUi' childCreationExtenders='true' modelName='EMFEcoreInvocatorUi' modelDirectory='/ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui/src-generated' editDirectory='/ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.edit/src-generated' basePackage='ca.gc.asc_csa.eclipse.emf.ecore.invocator'"
 * @generated
 */
public interface EMFEcoreInvocatorUiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMFEcoreInvocatorUiPackage eINSTANCE = ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.impl.EMFEcoreInvocatorUiPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.impl.EMFEcoreInvocatorUiFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.impl.EMFEcoreInvocatorUiFacadeImpl
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.impl.EMFEcoreInvocatorUiPackageImpl#getEMFEcoreInvocatorUiFacade()
	 * @generated
	 */
	int EMF_ECORE_INVOCATOR_UI_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ECORE_INVOCATOR_UI_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Copy Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ECORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__CONTEXT_CONTEXT = 0;

	/**
	 * The operation id for the '<em>Copy Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ECORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__ABSTRACTTYPEIMPLEMENTATION_ABSTRACTTYPEIMPLEMENTATION_COMPOUNDCOMMAND = 1;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ECORE_INVOCATOR_UI_FACADE_OPERATION_COUNT = 2;


	/**
	 * The meta object id for the '<em>Compound Command</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.command.CompoundCommand
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.impl.EMFEcoreInvocatorUiPackageImpl#getCompoundCommand()
	 * @generated
	 */
	int COMPOUND_COMMAND = 1;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiFacade
	 * @generated
	 */
	EClass getEMFEcoreInvocatorUiFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiFacade#copyInitializationData(ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context, ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context) <em>Copy Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Initialization Data</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiFacade#copyInitializationData(ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context, ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context)
	 * @generated
	 */
	EOperation getEMFEcoreInvocatorUiFacade__CopyInitializationData__Context_Context();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiFacade#copyInitializationData(ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation, ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation, org.eclipse.emf.common.command.CompoundCommand) <em>Copy Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Initialization Data</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiFacade#copyInitializationData(ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation, ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation, org.eclipse.emf.common.command.CompoundCommand)
	 * @generated
	 */
	EOperation getEMFEcoreInvocatorUiFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.command.CompoundCommand <em>Compound Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Compound Command</em>'.
	 * @see org.eclipse.emf.common.command.CompoundCommand
	 * @model instanceClass="org.eclipse.emf.common.command.CompoundCommand"
	 * @generated
	 */
	EDataType getCompoundCommand();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EMFEcoreInvocatorUiFactory getEMFEcoreInvocatorUiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.impl.EMFEcoreInvocatorUiFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.impl.EMFEcoreInvocatorUiFacadeImpl
		 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.impl.EMFEcoreInvocatorUiPackageImpl#getEMFEcoreInvocatorUiFacade()
		 * @generated
		 */
		EClass EMF_ECORE_INVOCATOR_UI_FACADE = eINSTANCE.getEMFEcoreInvocatorUiFacade();
		/**
		 * The meta object literal for the '<em><b>Copy Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMF_ECORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__CONTEXT_CONTEXT = eINSTANCE.getEMFEcoreInvocatorUiFacade__CopyInitializationData__Context_Context();
		/**
		 * The meta object literal for the '<em><b>Copy Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMF_ECORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__ABSTRACTTYPEIMPLEMENTATION_ABSTRACTTYPEIMPLEMENTATION_COMPOUNDCOMMAND = eINSTANCE.getEMFEcoreInvocatorUiFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand();
		/**
		 * The meta object literal for the '<em>Compound Command</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.command.CompoundCommand
		 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.impl.EMFEcoreInvocatorUiPackageImpl#getCompoundCommand()
		 * @generated
		 */
		EDataType COMPOUND_COMMAND = eINSTANCE.getCompoundCommand();

	}

} //EMFEcoreInvocatorUiPackage
