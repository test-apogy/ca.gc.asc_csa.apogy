/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.space.math.ui;

import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.symphony.common.math.ui.MathUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='MathUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)' modelName='MathUI' modelDirectory='/org.eclipse.symphony.common.math.ui/src-generated' editDirectory='/org.eclipse.symphony.common.math.ui.edit/src-generated' basePackage='org.eclipse.symphony.common.math'"
 * @generated
 */
public interface MathUIPackage extends EPackage
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
  String eNS_URI = "org.eclipse.symphony.common.math.ui";

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
  MathUIPackage eINSTANCE = ca.gc.space.math.ui.impl.MathUIPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.math.ui.impl.DummyImpl <em>Dummy</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.math.ui.impl.DummyImpl
	 * @see org.eclipse.symphony.common.math.ui.impl.MathUIPackageImpl#getDummy()
	 * @generated
	 */
  int DUMMY = 0;

  /**
	 * The number of structural features of the '<em>Dummy</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DUMMY_FEATURE_COUNT = 0;

  /**
	 * The number of operations of the '<em>Dummy</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DUMMY_OPERATION_COUNT = 0;


  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.math.ui.Dummy <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy</em>'.
	 * @see org.eclipse.symphony.common.math.ui.Dummy
	 * @generated
	 */
  EClass getDummy();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  MathUIFactory getMathUIFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.math.ui.impl.DummyImpl <em>Dummy</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.math.ui.impl.DummyImpl
		 * @see org.eclipse.symphony.common.math.ui.impl.MathUIPackageImpl#getDummy()
		 * @generated
		 */
    EClass DUMMY = eINSTANCE.getDummy();

  }

} //MathUIPackage
