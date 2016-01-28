/**
 */
package ca.gc.asc_csa.apogy.common.emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Node Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Feature Tree
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#getFeatureNode <em>Feature Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#isResolved <em>Resolved</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getFeatureNodeAdapter()
 * @model
 * @generated
 */
public interface FeatureNodeAdapter extends EObject
{
  /**
	 * Returns the value of the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object onto which to apply the FeatureNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Object</em>' reference.
	 * @see #setSourceObject(EObject)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getFeatureNodeAdapter_SourceObject()
	 * @model
	 * @generated
	 */
  EObject getSourceObject();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#getSourceObject <em>Source Object</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Object</em>' reference.
	 * @see #getSourceObject()
	 * @generated
	 */
  void setSourceObject(EObject value);

  /**
	 * Returns the value of the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FeatureNode defining which feature to monitor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Node</em>' reference.
	 * @see #setFeatureNode(AbstractFeatureNode)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getFeatureNodeAdapter_FeatureNode()
	 * @model
	 * @generated
	 */
  AbstractFeatureNode getFeatureNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#getFeatureNode <em>Feature Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Node</em>' reference.
	 * @see #getFeatureNode()
	 * @generated
	 */
  void setFeatureNode(AbstractFeatureNode value);

  /**
	 * Returns the value of the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' attribute.
	 * @see #setCurrentValue(Object)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getFeatureNodeAdapter_CurrentValue()
	 * @model unique="false"
	 * @generated
	 */
  Object getCurrentValue();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#getCurrentValue <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' attribute.
	 * @see #getCurrentValue()
	 * @generated
	 */
  void setCurrentValue(Object value);

  /**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether or not the featureNode is currently resolved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getFeatureNodeAdapter_Resolved()
	 * @model default="false" unique="false"
	 * @generated
	 */
  boolean isResolved();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
  void setResolved(boolean value);

} // FeatureNodeAdapter
