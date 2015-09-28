/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore.ui;

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
 * @see ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='EMFEcoreUI' childCreationExtenders='true' modelName='EMFEcoreUI' modelDirectory='/ca.gc.asc_csa.eclipse.emf.ecore.ui/src-generated' editDirectory='/ca.gc.asc_csa.eclipse.emf.ecore.ui.edit/src-generated' basePackage='ca.gc.asc_csa.eclipse.emf.ecore'"
 * @generated
 */
public interface EMFEcoreUIPackage extends EPackage
{
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
  String eNS_URI = "ca.gc.asc_csa.eclipse.emf.ecore.ui";

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
  EMFEcoreUIPackage eINSTANCE = ca.gc.asc_csa.eclipse.emf.ecore.ui.impl.EMFEcoreUIPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.eclipse.emf.ecore.ui.impl.EMFEcoreUIFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.ui.impl.EMFEcoreUIFacadeImpl
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.ui.impl.EMFEcoreUIPackageImpl#getEMFEcoreUIFacade()
	 * @generated
	 */
  int EMF_ECORE_UI_FACADE = 0;

  /**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_UI_FACADE_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>Get Color For Range</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_UI_FACADE___GET_COLOR_FOR_RANGE__RANGES = 0;

  /**
	 * The operation id for the '<em>Get Display Units</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_UI_FACADE___GET_DISPLAY_UNITS__ETYPEDELEMENT = 1;

  /**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_UI_FACADE_OPERATION_COUNT = 2;

  /**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Color
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.ui.impl.EMFEcoreUIPackageImpl#getColor()
	 * @generated
	 */
  int COLOR = 1;


  /**
	 * The meta object id for the '<em>Unit</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.measure.unit.Unit
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.ui.impl.EMFEcoreUIPackageImpl#getUnit()
	 * @generated
	 */
  int UNIT = 2;


  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIFacade
	 * @generated
	 */
  EClass getEMFEcoreUIFacade();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIFacade#getColorForRange(ca.gc.asc_csa.eclipse.emf.ecore.Ranges) <em>Get Color For Range</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Color For Range</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIFacade#getColorForRange(ca.gc.asc_csa.eclipse.emf.ecore.Ranges)
	 * @generated
	 */
  EOperation getEMFEcoreUIFacade__GetColorForRange__Ranges();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIFacade#getDisplayUnits(org.eclipse.emf.ecore.ETypedElement) <em>Get Display Units</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Display Units</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIFacade#getDisplayUnits(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
  EOperation getEMFEcoreUIFacade__GetDisplayUnits__ETypedElement();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see org.eclipse.swt.graphics.Color
	 * @model instanceClass="org.eclipse.swt.graphics.Color"
	 * @generated
	 */
  EDataType getColor();

  /**
	 * Returns the meta object for data type '{@link javax.measure.unit.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit</em>'.
	 * @see javax.measure.unit.Unit
	 * @model instanceClass="javax.measure.unit.Unit"
	 * @generated
	 */
  EDataType getUnit();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  EMFEcoreUIFactory getEMFEcoreUIFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.eclipse.emf.ecore.ui.impl.EMFEcoreUIFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.emf.ecore.ui.impl.EMFEcoreUIFacadeImpl
		 * @see ca.gc.asc_csa.eclipse.emf.ecore.ui.impl.EMFEcoreUIPackageImpl#getEMFEcoreUIFacade()
		 * @generated
		 */
    EClass EMF_ECORE_UI_FACADE = eINSTANCE.getEMFEcoreUIFacade();

    /**
		 * The meta object literal for the '<em><b>Get Color For Range</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_UI_FACADE___GET_COLOR_FOR_RANGE__RANGES = eINSTANCE.getEMFEcoreUIFacade__GetColorForRange__Ranges();

    /**
		 * The meta object literal for the '<em><b>Get Display Units</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_UI_FACADE___GET_DISPLAY_UNITS__ETYPEDELEMENT = eINSTANCE.getEMFEcoreUIFacade__GetDisplayUnits__ETypedElement();

    /**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Color
		 * @see ca.gc.asc_csa.eclipse.emf.ecore.ui.impl.EMFEcoreUIPackageImpl#getColor()
		 * @generated
		 */
    EDataType COLOR = eINSTANCE.getColor();

    /**
		 * The meta object literal for the '<em>Unit</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.measure.unit.Unit
		 * @see ca.gc.asc_csa.eclipse.emf.ecore.ui.impl.EMFEcoreUIPackageImpl#getUnit()
		 * @generated
		 */
    EDataType UNIT = eINSTANCE.getUnit();

  }

} //EMFEcoreUIPackage
