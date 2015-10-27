/**
 */
package org.eclipse.symphony.core.invocator.ui;

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
 * @see org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CoreInvocatorUI' childCreationExtenders='true' modelName='Symphony__CoreInvocatorUI' modelDirectory='/org.eclipse.symphony.core.invocator.ui/src-generated' editDirectory='/org.eclipse.symphony.core.invocator.ui.edit/src-generated' basePackage='org.eclipse.symphony.core.invocator'"
 * @generated
 */
public interface Symphony__CoreInvocatorUIPackage extends EPackage {
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
	String eNS_URI = "org.eclipse.symphony.core.invocator.ui";

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
	Symphony__CoreInvocatorUIPackage eINSTANCE = org.eclipse.symphony.core.invocator.ui.impl.Symphony__CoreInvocatorUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.ui.impl.Symphony__CoreInvocatorUIFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.ui.impl.Symphony__CoreInvocatorUIFacadeImpl
	 * @see org.eclipse.symphony.core.invocator.ui.impl.Symphony__CoreInvocatorUIPackageImpl#getSymphony__CoreInvocatorUIFacade()
	 * @generated
	 */
	int SYMPHONY_CORE_INVOCATOR_UI_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_INVOCATOR_UI_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Copy Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__CONTEXT_CONTEXT = 0;

	/**
	 * The operation id for the '<em>Copy Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__ABSTRACTTYPEIMPLEMENTATION_ABSTRACTTYPEIMPLEMENTATION_COMPOUNDCOMMAND = 1;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_INVOCATOR_UI_FACADE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '<em>Compound Command</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.command.CompoundCommand
	 * @see org.eclipse.symphony.core.invocator.ui.impl.Symphony__CoreInvocatorUIPackageImpl#getCompoundCommand()
	 * @generated
	 */
	int COMPOUND_COMMAND = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIFacade
	 * @generated
	 */
	EClass getSymphony__CoreInvocatorUIFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIFacade#copyInitializationData(org.eclipse.symphony.core.invocator.Context, org.eclipse.symphony.core.invocator.Context) <em>Copy Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Initialization Data</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIFacade#copyInitializationData(org.eclipse.symphony.core.invocator.Context, org.eclipse.symphony.core.invocator.Context)
	 * @generated
	 */
	EOperation getSymphony__CoreInvocatorUIFacade__CopyInitializationData__Context_Context();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIFacade#copyInitializationData(org.eclipse.symphony.core.invocator.AbstractTypeImplementation, org.eclipse.symphony.core.invocator.AbstractTypeImplementation, org.eclipse.emf.common.command.CompoundCommand) <em>Copy Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Initialization Data</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIFacade#copyInitializationData(org.eclipse.symphony.core.invocator.AbstractTypeImplementation, org.eclipse.symphony.core.invocator.AbstractTypeImplementation, org.eclipse.emf.common.command.CompoundCommand)
	 * @generated
	 */
	EOperation getSymphony__CoreInvocatorUIFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand();

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
	Symphony__CoreInvocatorUIFactory getSymphony__CoreInvocatorUIFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.ui.impl.Symphony__CoreInvocatorUIFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.ui.impl.Symphony__CoreInvocatorUIFacadeImpl
		 * @see org.eclipse.symphony.core.invocator.ui.impl.Symphony__CoreInvocatorUIPackageImpl#getSymphony__CoreInvocatorUIFacade()
		 * @generated
		 */
		EClass SYMPHONY_CORE_INVOCATOR_UI_FACADE = eINSTANCE.getSymphony__CoreInvocatorUIFacade();
		/**
		 * The meta object literal for the '<em><b>Copy Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__CONTEXT_CONTEXT = eINSTANCE.getSymphony__CoreInvocatorUIFacade__CopyInitializationData__Context_Context();
		/**
		 * The meta object literal for the '<em><b>Copy Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__ABSTRACTTYPEIMPLEMENTATION_ABSTRACTTYPEIMPLEMENTATION_COMPOUNDCOMMAND = eINSTANCE.getSymphony__CoreInvocatorUIFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand();
		/**
		 * The meta object literal for the '<em>Compound Command</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.command.CompoundCommand
		 * @see org.eclipse.symphony.core.invocator.ui.impl.Symphony__CoreInvocatorUIPackageImpl#getCompoundCommand()
		 * @generated
		 */
		EDataType COMPOUND_COMMAND = eINSTANCE.getCompoundCommand();

	}

} //Symphony__CoreInvocatorUIPackage
