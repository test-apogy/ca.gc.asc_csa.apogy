/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.antenna;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see ca.gc.asc_csa.apogy.examples.antenna.ApogyExamplesAntennaFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyExamplesAntenna' copyrightText='Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015' modelName='ApogyExamplesAntenna' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.examples.antenna/src-generated' editDirectory='/ca.gc.asc_csa.apogy.examples.antenna.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.examples'"
 * @generated
 */
public interface ApogyExamplesAntennaPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "antenna";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.apogy.examples.antenna";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "antenna";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyExamplesAntennaPackage eINSTANCE = ca.gc.asc_csa.apogy.examples.antenna.impl.ApogyExamplesAntennaPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.antenna.impl.AntennaImpl <em>Antenna</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.AntennaImpl
	 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.ApogyExamplesAntennaPackageImpl#getAntenna()
	 * @generated
	 */
  int ANTENNA = 0;

  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA__INITIALIZED = 0;

		/**
	 * The number of structural features of the '<em>Antenna</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANTENNA_FEATURE_COUNT = 1;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA___INIT = 0;

		/**
	 * The number of operations of the '<em>Antenna</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANTENNA_OPERATION_COUNT = 1;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.antenna.impl.DishAntennaImpl <em>Dish Antenna</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.DishAntennaImpl
	 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.ApogyExamplesAntennaPackageImpl#getDishAntenna()
	 * @generated
	 */
  int DISH_ANTENNA = 1;

  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_ANTENNA__INITIALIZED = ANTENNA__INITIALIZED;

		/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISH_ANTENNA__FOV = ANTENNA_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Dish Antenna</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISH_ANTENNA_FEATURE_COUNT = ANTENNA_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_ANTENNA___INIT = ANTENNA___INIT;

		/**
	 * The number of operations of the '<em>Dish Antenna</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISH_ANTENNA_OPERATION_COUNT = ANTENNA_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.antenna.impl.PTUDishAntennaImpl <em>PTU Dish Antenna</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.PTUDishAntennaImpl
	 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.ApogyExamplesAntennaPackageImpl#getPTUDishAntenna()
	 * @generated
	 */
  int PTU_DISH_ANTENNA = 2;

  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA__INITIALIZED = DISH_ANTENNA__INITIALIZED;

		/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_DISH_ANTENNA__FOV = DISH_ANTENNA__FOV;

  /**
	 * The feature id for the '<em><b>Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_DISH_ANTENNA__PAN_ANGLE = DISH_ANTENNA_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_DISH_ANTENNA__TILT_ANGLE = DISH_ANTENNA_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Tracking Sun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA__TRACKING_SUN = DISH_ANTENNA_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>PTU Dish Antenna</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_DISH_ANTENNA_FEATURE_COUNT = DISH_ANTENNA_FEATURE_COUNT + 3;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA___INIT = DISH_ANTENNA___INIT;

		/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_DISH_ANTENNA___MOVE_TO__DOUBLE_DOUBLE = DISH_ANTENNA_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Track Sun</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA___TRACK_SUN__BOOLEAN = DISH_ANTENNA_OPERATION_COUNT + 1;

		/**
	 * The number of operations of the '<em>PTU Dish Antenna</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PTU_DISH_ANTENNA_OPERATION_COUNT = DISH_ANTENNA_OPERATION_COUNT + 2;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.antenna.impl.PTUDishAntennaStubImpl <em>PTU Dish Antenna Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.PTUDishAntennaStubImpl
	 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.ApogyExamplesAntennaPackageImpl#getPTUDishAntennaStub()
	 * @generated
	 */
	int PTU_DISH_ANTENNA_STUB = 3;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_STUB__INITIALIZED = PTU_DISH_ANTENNA__INITIALIZED;

		/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_STUB__FOV = PTU_DISH_ANTENNA__FOV;

		/**
	 * The feature id for the '<em><b>Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_STUB__PAN_ANGLE = PTU_DISH_ANTENNA__PAN_ANGLE;

		/**
	 * The feature id for the '<em><b>Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_STUB__TILT_ANGLE = PTU_DISH_ANTENNA__TILT_ANGLE;

		/**
	 * The feature id for the '<em><b>Tracking Sun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_STUB__TRACKING_SUN = PTU_DISH_ANTENNA__TRACKING_SUN;

		/**
	 * The number of structural features of the '<em>PTU Dish Antenna Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_STUB_FEATURE_COUNT = PTU_DISH_ANTENNA_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_STUB___INIT = PTU_DISH_ANTENNA___INIT;

		/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_STUB___MOVE_TO__DOUBLE_DOUBLE = PTU_DISH_ANTENNA___MOVE_TO__DOUBLE_DOUBLE;

		/**
	 * The operation id for the '<em>Track Sun</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_STUB___TRACK_SUN__BOOLEAN = PTU_DISH_ANTENNA___TRACK_SUN__BOOLEAN;

		/**
	 * The number of operations of the '<em>PTU Dish Antenna Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_STUB_OPERATION_COUNT = PTU_DISH_ANTENNA_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.antenna.impl.PTUDishAntennaSimulatedImpl <em>PTU Dish Antenna Simulated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.PTUDishAntennaSimulatedImpl
	 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.ApogyExamplesAntennaPackageImpl#getPTUDishAntennaSimulated()
	 * @generated
	 */
	int PTU_DISH_ANTENNA_SIMULATED = 4;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SIMULATED__INITIALIZED = PTU_DISH_ANTENNA__INITIALIZED;

		/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SIMULATED__FOV = PTU_DISH_ANTENNA__FOV;

		/**
	 * The feature id for the '<em><b>Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SIMULATED__PAN_ANGLE = PTU_DISH_ANTENNA__PAN_ANGLE;

		/**
	 * The feature id for the '<em><b>Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SIMULATED__TILT_ANGLE = PTU_DISH_ANTENNA__TILT_ANGLE;

		/**
	 * The feature id for the '<em><b>Tracking Sun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SIMULATED__TRACKING_SUN = PTU_DISH_ANTENNA__TRACKING_SUN;

		/**
	 * The number of structural features of the '<em>PTU Dish Antenna Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SIMULATED_FEATURE_COUNT = PTU_DISH_ANTENNA_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SIMULATED___INIT = PTU_DISH_ANTENNA___INIT;

		/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SIMULATED___MOVE_TO__DOUBLE_DOUBLE = PTU_DISH_ANTENNA___MOVE_TO__DOUBLE_DOUBLE;

		/**
	 * The operation id for the '<em>Track Sun</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SIMULATED___TRACK_SUN__BOOLEAN = PTU_DISH_ANTENNA___TRACK_SUN__BOOLEAN;

		/**
	 * The number of operations of the '<em>PTU Dish Antenna Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_SIMULATED_OPERATION_COUNT = PTU_DISH_ANTENNA_OPERATION_COUNT + 0;

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.antenna.Antenna <em>Antenna</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antenna</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.Antenna
	 * @generated
	 */
  EClass getAntenna();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.antenna.Antenna#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.Antenna#isInitialized()
	 * @see #getAntenna()
	 * @generated
	 */
	EAttribute getAntenna_Initialized();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.antenna.Antenna#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.Antenna#init()
	 * @generated
	 */
	EOperation getAntenna__Init();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.antenna.DishAntenna <em>Dish Antenna</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dish Antenna</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.DishAntenna
	 * @generated
	 */
  EClass getDishAntenna();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.antenna.DishAntenna#getFov <em>Fov</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fov</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.DishAntenna#getFov()
	 * @see #getDishAntenna()
	 * @generated
	 */
  EReference getDishAntenna_Fov();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna <em>PTU Dish Antenna</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTU Dish Antenna</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna
	 * @generated
	 */
  EClass getPTUDishAntenna();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna#getPanAngle <em>Pan Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna#getPanAngle()
	 * @see #getPTUDishAntenna()
	 * @generated
	 */
  EAttribute getPTUDishAntenna_PanAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna#getTiltAngle <em>Tilt Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna#getTiltAngle()
	 * @see #getPTUDishAntenna()
	 * @generated
	 */
  EAttribute getPTUDishAntenna_TiltAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna#isTrackingSun <em>Tracking Sun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Sun</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna#isTrackingSun()
	 * @see #getPTUDishAntenna()
	 * @generated
	 */
	EAttribute getPTUDishAntenna_TrackingSun();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna#moveTo(double, double) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna#moveTo(double, double)
	 * @generated
	 */
  EOperation getPTUDishAntenna__MoveTo__double_double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna#trackSun(boolean) <em>Track Sun</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Track Sun</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna#trackSun(boolean)
	 * @generated
	 */
	EOperation getPTUDishAntenna__TrackSun__boolean();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaStub <em>PTU Dish Antenna Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTU Dish Antenna Stub</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaStub
	 * @generated
	 */
	EClass getPTUDishAntennaStub();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaSimulated <em>PTU Dish Antenna Simulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTU Dish Antenna Simulated</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaSimulated
	 * @generated
	 */
	EClass getPTUDishAntennaSimulated();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyExamplesAntennaFactory getApogyExamplesAntennaFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.antenna.impl.AntennaImpl <em>Antenna</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.AntennaImpl
		 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.ApogyExamplesAntennaPackageImpl#getAntenna()
		 * @generated
		 */
    EClass ANTENNA = eINSTANCE.getAntenna();

    /**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTENNA__INITIALIZED = eINSTANCE.getAntenna_Initialized();

				/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANTENNA___INIT = eINSTANCE.getAntenna__Init();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.antenna.impl.DishAntennaImpl <em>Dish Antenna</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.DishAntennaImpl
		 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.ApogyExamplesAntennaPackageImpl#getDishAntenna()
		 * @generated
		 */
    EClass DISH_ANTENNA = eINSTANCE.getDishAntenna();

    /**
		 * The meta object literal for the '<em><b>Fov</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DISH_ANTENNA__FOV = eINSTANCE.getDishAntenna_Fov();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.antenna.impl.PTUDishAntennaImpl <em>PTU Dish Antenna</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.PTUDishAntennaImpl
		 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.ApogyExamplesAntennaPackageImpl#getPTUDishAntenna()
		 * @generated
		 */
    EClass PTU_DISH_ANTENNA = eINSTANCE.getPTUDishAntenna();

    /**
		 * The meta object literal for the '<em><b>Pan Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PTU_DISH_ANTENNA__PAN_ANGLE = eINSTANCE.getPTUDishAntenna_PanAngle();

    /**
		 * The meta object literal for the '<em><b>Tilt Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PTU_DISH_ANTENNA__TILT_ANGLE = eINSTANCE.getPTUDishAntenna_TiltAngle();

    /**
		 * The meta object literal for the '<em><b>Tracking Sun</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTU_DISH_ANTENNA__TRACKING_SUN = eINSTANCE.getPTUDishAntenna_TrackingSun();

				/**
		 * The meta object literal for the '<em><b>Move To</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation PTU_DISH_ANTENNA___MOVE_TO__DOUBLE_DOUBLE = eINSTANCE.getPTUDishAntenna__MoveTo__double_double();

    /**
		 * The meta object literal for the '<em><b>Track Sun</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PTU_DISH_ANTENNA___TRACK_SUN__BOOLEAN = eINSTANCE.getPTUDishAntenna__TrackSun__boolean();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.antenna.impl.PTUDishAntennaStubImpl <em>PTU Dish Antenna Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.PTUDishAntennaStubImpl
		 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.ApogyExamplesAntennaPackageImpl#getPTUDishAntennaStub()
		 * @generated
		 */
		EClass PTU_DISH_ANTENNA_STUB = eINSTANCE.getPTUDishAntennaStub();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.antenna.impl.PTUDishAntennaSimulatedImpl <em>PTU Dish Antenna Simulated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.PTUDishAntennaSimulatedImpl
		 * @see ca.gc.asc_csa.apogy.examples.antenna.impl.ApogyExamplesAntennaPackageImpl#getPTUDishAntennaSimulated()
		 * @generated
		 */
		EClass PTU_DISH_ANTENNA_SIMULATED = eINSTANCE.getPTUDishAntennaSimulated();

  }

} //ApogyExamplesAntennaPackage
