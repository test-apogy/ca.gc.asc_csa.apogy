/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.emf.AbstractFeatureNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Watch Feature Node Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * WatchFeatureNodeAdapter
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#getFeatureNode <em>Feature Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#isResolved <em>Resolved</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getWatchFeatureNodeAdapter()
 * @model
 * @generated
 */
public interface WatchFeatureNodeAdapter extends EObject
{
  /**
	 * Returns the value of the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object onto which to apply the WatchFeatureNodeAdapter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Object</em>' reference.
	 * @see #setSourceObject(EObject)
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getWatchFeatureNodeAdapter_SourceObject()
	 * @model
	 * @generated
	 */
  EObject getSourceObject();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#getSourceObject <em>Source Object</em>}' reference.
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
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FeatureNode defining which feature to monitor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Node</em>' reference.
	 * @see #setFeatureNode(AbstractFeatureNode)
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getWatchFeatureNodeAdapter_FeatureNode()
	 * @model
	 * @generated
	 */
  AbstractFeatureNode getFeatureNode();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#getFeatureNode <em>Feature Node</em>}' reference.
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
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current value of the monitored feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Value</em>' attribute.
	 * @see #setCurrentValue(Object)
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getWatchFeatureNodeAdapter_CurrentValue()
	 * @model unique="false"
	 * @generated
	 */
  Object getCurrentValue();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#getCurrentValue <em>Current Value</em>}' attribute.
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
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether or not the featureNode is currently resolved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getWatchFeatureNodeAdapter_Resolved()
	 * @model default="false" unique="false"
	 * @generated
	 */
  boolean isResolved();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
  void setResolved(boolean value);

} // WatchFeatureNodeAdapter
