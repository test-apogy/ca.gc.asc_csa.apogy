/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeature#getStructuralFeature <em>Structural Feature</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeature#isMultiValued <em>Multi Valued</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeature#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getAbstractFeature()
 * @model
 * @generated
 */
public interface AbstractFeature extends EObject
{
  /**
   * Returns the value of the '<em><b>Structural Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The EStructuralFeature that is referred by the FeatureNode.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Structural Feature</em>' reference.
   * @see #setStructuralFeature(EStructuralFeature)
   * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getAbstractFeature_StructuralFeature()
   * @model required="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
   * @generated
   */
  EStructuralFeature getStructuralFeature();

  /**
   * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeature#getStructuralFeature <em>Structural Feature</em>}' reference.
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
   * Whether or not this FeatureNode refers to a multi-valued feature.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Multi Valued</em>' attribute.
   * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getAbstractFeature_MultiValued()
   * @model default="false" unique="false" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
   * @generated
   */
  boolean isMultiValued();

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * The default value is <code>"-1"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Index of the value if the EStructuralFeature referred to by this FeatureNode if multi-valued.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getAbstractFeature_Index()
   * @model default="-1" unique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeature#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

} // AbstractFeature
