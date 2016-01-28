/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.converters.ui;

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
 * @see ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonConvertersUI' childCreationExtenders='true' extensibleProviderFactory='true' operationReflection='true' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='ApogyCommonConvertersUI' modelDirectory='/ca.gc.asc_csa.apogy.common.converters.ui/src-generated' basePackage='ca.gc.asc_csa.apogy.common.converters'"
 * @generated
 */
public interface ApogyCommonConvertersUIPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.common.converters.ui";

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
	ApogyCommonConvertersUIPackage eINSTANCE = ca.gc.asc_csa.apogy.common.converters.ui.impl.ApogyCommonConvertersUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.converters.ui.impl.ApogyCommonConvertersUIFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.converters.ui.impl.ApogyCommonConvertersUIFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.converters.ui.impl.ApogyCommonConvertersUIPackageImpl#getApogyCommonConvertersUIFacade()
	 * @generated
	 */
	int APOGY_COMMON_CONVERTERS_UI_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_UI_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Convert</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_UI_FACADE___CONVERT__ISELECTION_CLASS = 0;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_UI_FACADE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '<em>ISelection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.viewers.ISelection
	 * @see ca.gc.asc_csa.apogy.common.converters.ui.impl.ApogyCommonConvertersUIPackageImpl#getISelection()
	 * @generated
	 */
	int ISELECTION = 1;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade
	 * @generated
	 */
	EClass getApogyCommonConvertersUIFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade#convert(org.eclipse.jface.viewers.ISelection, java.lang.Class) <em>Convert</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade#convert(org.eclipse.jface.viewers.ISelection, java.lang.Class)
	 * @generated
	 */
	EOperation getApogyCommonConvertersUIFacade__Convert__ISelection_Class();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jface.viewers.ISelection <em>ISelection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ISelection</em>'.
	 * @see org.eclipse.jface.viewers.ISelection
	 * @model instanceClass="org.eclipse.jface.viewers.ISelection"
	 * @generated
	 */
	EDataType getISelection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonConvertersUIFactory getApogyCommonConvertersUIFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.converters.ui.impl.ApogyCommonConvertersUIFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.converters.ui.impl.ApogyCommonConvertersUIFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.converters.ui.impl.ApogyCommonConvertersUIPackageImpl#getApogyCommonConvertersUIFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_CONVERTERS_UI_FACADE = eINSTANCE.getApogyCommonConvertersUIFacade();

		/**
		 * The meta object literal for the '<em><b>Convert</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_UI_FACADE___CONVERT__ISELECTION_CLASS = eINSTANCE.getApogyCommonConvertersUIFacade__Convert__ISelection_Class();

		/**
		 * The meta object literal for the '<em>ISelection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jface.viewers.ISelection
		 * @see ca.gc.asc_csa.apogy.common.converters.ui.impl.ApogyCommonConvertersUIPackageImpl#getISelection()
		 * @generated
		 */
		EDataType ISELECTION = eINSTANCE.getISelection();

	}

} //ApogyCommonConvertersUIPackage
