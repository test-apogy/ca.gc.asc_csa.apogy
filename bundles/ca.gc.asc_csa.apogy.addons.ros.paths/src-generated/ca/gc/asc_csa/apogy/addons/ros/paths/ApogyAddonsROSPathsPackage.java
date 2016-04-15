/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros.paths;

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
 * <!-- begin-model-doc -->
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca),
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsROSPaths' modelName='ApogyAddonsROSPaths' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)' modelDirectory='/ca.gc.asc_csa.apogy.addons.ros.paths/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.ros.paths.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons.ros'"
 * @generated
 */
public interface ApogyAddonsROSPathsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "paths";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.addons.ros.paths";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "paths";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsROSPathsPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.ros.paths.impl.ApogyAddonsROSPathsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.ros.paths.impl.ApogyAddonsROSPathFacadeImpl <em>Apogy Addons ROS Path Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.paths.impl.ApogyAddonsROSPathFacadeImpl
	 * @see ca.gc.asc_csa.apogy.addons.ros.paths.impl.ApogyAddonsROSPathsPackageImpl#getApogyAddonsROSPathFacade()
	 * @generated
	 */
	int APOGY_ADDONS_ROS_PATH_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Apogy Addons ROS Path Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_PATH_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Convert To Way Point Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_PATH_FACADE___CONVERT_TO_WAY_POINT_PATH__PATH = 0;

	/**
	 * The operation id for the '<em>Convert To ROS Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_PATH_FACADE___CONVERT_TO_ROS_PATH__WAYPOINTPATH_MESSAGEFACTORY = 1;

	/**
	 * The number of operations of the '<em>Apogy Addons ROS Path Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_PATH_FACADE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '<em>ROS Path</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nav_msgs.Path
	 * @see ca.gc.asc_csa.apogy.addons.ros.paths.impl.ApogyAddonsROSPathsPackageImpl#getROSPath()
	 * @generated
	 */
	int ROS_PATH = 1;

	/**
	 * The meta object id for the '<em>Message Factory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.message.MessageFactory
	 * @see ca.gc.asc_csa.apogy.addons.ros.paths.impl.ApogyAddonsROSPathsPackageImpl#getMessageFactory()
	 * @generated
	 */
	int MESSAGE_FACTORY = 2;

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathFacade <em>Apogy Addons ROS Path Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apogy Addons ROS Path Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathFacade
	 * @generated
	 */
	EClass getApogyAddonsROSPathFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathFacade#convertToWayPointPath(nav_msgs.Path) <em>Convert To Way Point Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Way Point Path</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathFacade#convertToWayPointPath(nav_msgs.Path)
	 * @generated
	 */
	EOperation getApogyAddonsROSPathFacade__ConvertToWayPointPath__Path();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathFacade#convertToROSPath(ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath, org.ros.message.MessageFactory) <em>Convert To ROS Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To ROS Path</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathFacade#convertToROSPath(ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath, org.ros.message.MessageFactory)
	 * @generated
	 */
	EOperation getApogyAddonsROSPathFacade__ConvertToROSPath__WayPointPath_MessageFactory();

	/**
	 * Returns the meta object for data type '{@link nav_msgs.Path <em>ROS Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ROS Path</em>'.
	 * @see nav_msgs.Path
	 * @model instanceClass="nav_msgs.Path"
	 * @generated
	 */
	EDataType getROSPath();

	/**
	 * Returns the meta object for data type '{@link org.ros.message.MessageFactory <em>Message Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Factory</em>'.
	 * @see org.ros.message.MessageFactory
	 * @model instanceClass="org.ros.message.MessageFactory"
	 * @generated
	 */
	EDataType getMessageFactory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyAddonsROSPathsFactory getApogyAddonsROSPathsFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.ros.paths.impl.ApogyAddonsROSPathFacadeImpl <em>Apogy Addons ROS Path Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.paths.impl.ApogyAddonsROSPathFacadeImpl
		 * @see ca.gc.asc_csa.apogy.addons.ros.paths.impl.ApogyAddonsROSPathsPackageImpl#getApogyAddonsROSPathFacade()
		 * @generated
		 */
		EClass APOGY_ADDONS_ROS_PATH_FACADE = eINSTANCE.getApogyAddonsROSPathFacade();

		/**
		 * The meta object literal for the '<em><b>Convert To Way Point Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_PATH_FACADE___CONVERT_TO_WAY_POINT_PATH__PATH = eINSTANCE.getApogyAddonsROSPathFacade__ConvertToWayPointPath__Path();

		/**
		 * The meta object literal for the '<em><b>Convert To ROS Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_PATH_FACADE___CONVERT_TO_ROS_PATH__WAYPOINTPATH_MESSAGEFACTORY = eINSTANCE.getApogyAddonsROSPathFacade__ConvertToROSPath__WayPointPath_MessageFactory();

		/**
		 * The meta object literal for the '<em>ROS Path</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nav_msgs.Path
		 * @see ca.gc.asc_csa.apogy.addons.ros.paths.impl.ApogyAddonsROSPathsPackageImpl#getROSPath()
		 * @generated
		 */
		EDataType ROS_PATH = eINSTANCE.getROSPath();

		/**
		 * The meta object literal for the '<em>Message Factory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.message.MessageFactory
		 * @see ca.gc.asc_csa.apogy.addons.ros.paths.impl.ApogyAddonsROSPathsPackageImpl#getMessageFactory()
		 * @generated
		 */
		EDataType MESSAGE_FACTORY = eINSTANCE.getMessageFactory();

	}

} //ApogyAddonsROSPathsPackage
