/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class that describes a StructuralFeature of interest.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureSpecifier#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureSpecifier#isMultiValued <em>Multi Valued</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureSpecifier#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getAbstractFeatureSpecifier()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFeatureSpecifier extends EObject
{
  /**
	 * Returns the value of the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EStructuralFeature that is referred by this FeatureSpecifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Feature</em>' reference.
	 * @see #setStructuralFeature(EStructuralFeature)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getAbstractFeatureSpecifier_StructuralFeature()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  EStructuralFeature getStructuralFeature();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureSpecifier#getStructuralFeature <em>Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Feature</em>' reference.
	 * @see #getStructuralFeature()
	 * @generated
	 */
  void setStructuralFeature(EStructuralFeature value);

  /**
	 * Returns the value of the '<em><b>Multi Valued</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not this FeatureSpecifier refers to a multi-valued feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Valued</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getAbstractFeatureSpecifier_MultiValued()
	 * @model default="false" unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  boolean isMultiValued();

  /**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Index of the value if the EStructuralFeature referred to by this FeatureSpecifier if multi-valued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getAbstractFeatureSpecifier_Index()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  int getIndex();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureSpecifier#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
  void setIndex(int value);

} // AbstractFeatureSpecifier
