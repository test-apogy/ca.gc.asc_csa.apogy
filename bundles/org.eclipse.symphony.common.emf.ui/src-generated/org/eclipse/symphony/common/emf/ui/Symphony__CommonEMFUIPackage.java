/**
 */
package org.eclipse.symphony.common.emf.ui;

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
 * @see org.eclipse.symphony.common.emf.ui.Symphony__CommonEMFUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CommonEMFUI' childCreationExtenders='true' modelName='Symphony__CommonEMFUI' modelDirectory='/org.eclipse.symphony.common.emf.ui/src-generated' editDirectory='/org.eclipse.symphony.common.emf.ui.edit/src-generated' basePackage='org.eclipse.symphony.common.emf'"
 * @generated
 */
public interface Symphony__CommonEMFUIPackage extends EPackage
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
  String eNS_URI = "org.eclipse.symphony.common.emf.ui";

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
  Symphony__CommonEMFUIPackage eINSTANCE = org.eclipse.symphony.common.emf.ui.impl.Symphony__CommonEMFUIPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.ui.impl.EMFEcoreUIFacadeImpl <em>EMF Ecore UI Facade</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.ui.impl.EMFEcoreUIFacadeImpl
	 * @see org.eclipse.symphony.common.emf.ui.impl.Symphony__CommonEMFUIPackageImpl#getEMFEcoreUIFacade()
	 * @generated
	 */
  int EMF_ECORE_UI_FACADE = 0;

  /**
	 * The number of structural features of the '<em>EMF Ecore UI Facade</em>' class.
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
	 * The number of operations of the '<em>EMF Ecore UI Facade</em>' class.
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
	 * @see org.eclipse.symphony.common.emf.ui.impl.Symphony__CommonEMFUIPackageImpl#getColor()
	 * @generated
	 */
  int COLOR = 1;


  /**
	 * The meta object id for the '<em>Unit</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.measure.unit.Unit
	 * @see org.eclipse.symphony.common.emf.ui.impl.Symphony__CommonEMFUIPackageImpl#getUnit()
	 * @generated
	 */
  int UNIT = 2;


  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.ui.EMFEcoreUIFacade <em>EMF Ecore UI Facade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Ecore UI Facade</em>'.
	 * @see org.eclipse.symphony.common.emf.ui.EMFEcoreUIFacade
	 * @generated
	 */
  EClass getEMFEcoreUIFacade();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.ui.EMFEcoreUIFacade#getColorForRange(org.eclipse.symphony.common.emf.Ranges) <em>Get Color For Range</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Color For Range</em>' operation.
	 * @see org.eclipse.symphony.common.emf.ui.EMFEcoreUIFacade#getColorForRange(org.eclipse.symphony.common.emf.Ranges)
	 * @generated
	 */
  EOperation getEMFEcoreUIFacade__GetColorForRange__Ranges();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.ui.EMFEcoreUIFacade#getDisplayUnits(org.eclipse.emf.ecore.ETypedElement) <em>Get Display Units</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Display Units</em>' operation.
	 * @see org.eclipse.symphony.common.emf.ui.EMFEcoreUIFacade#getDisplayUnits(org.eclipse.emf.ecore.ETypedElement)
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
	 * @model instanceClass="javax.measure.unit.Unit<?>"
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
	Symphony__CommonEMFUIFactory getSymphony__CommonEMFUIFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.ui.impl.EMFEcoreUIFacadeImpl <em>EMF Ecore UI Facade</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.ui.impl.EMFEcoreUIFacadeImpl
		 * @see org.eclipse.symphony.common.emf.ui.impl.Symphony__CommonEMFUIPackageImpl#getEMFEcoreUIFacade()
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
		 * @see org.eclipse.symphony.common.emf.ui.impl.Symphony__CommonEMFUIPackageImpl#getColor()
		 * @generated
		 */
    EDataType COLOR = eINSTANCE.getColor();

    /**
		 * The meta object literal for the '<em>Unit</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.measure.unit.Unit
		 * @see org.eclipse.symphony.common.emf.ui.impl.Symphony__CommonEMFUIPackageImpl#getUnit()
		 * @generated
		 */
    EDataType UNIT = eINSTANCE.getUnit();

  }

} //Symphony__CommonEMFUIPackage
