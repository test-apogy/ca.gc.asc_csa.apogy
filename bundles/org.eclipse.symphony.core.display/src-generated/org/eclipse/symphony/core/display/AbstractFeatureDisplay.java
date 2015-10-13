/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display;

import java.awt.Point;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.symphony.common.emf.AbstractFeatureNode;
import org.eclipse.symphony.common.emf.Ranges;
import org.eclipse.symphony.core.invocator.AbstractDisplay;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for all displayed features.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#getAbstractFeatureNode <em>Abstract Feature Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#getMinimumWidth <em>Minimum Width</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#getMinimumHeight <em>Minimum Height</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage#getAbstractFeatureDisplay()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFeatureDisplay extends AbstractDisplay
{
  /**
	 * Returns the value of the '<em><b>Abstract Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature being displayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Feature Node</em>' reference.
	 * @see #setAbstractFeatureNode(AbstractFeatureNode)
	 * @see org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage#getAbstractFeatureDisplay_AbstractFeatureNode()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  AbstractFeatureNode getAbstractFeatureNode();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#getAbstractFeatureNode <em>Abstract Feature Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Feature Node</em>' reference.
	 * @see #getAbstractFeatureNode()
	 * @generated
	 */
	void setAbstractFeatureNode(AbstractFeatureNode value);

		/**
	 * Returns the value of the '<em><b>Minimum Width</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minimum Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Width</em>' attribute.
	 * @see #setMinimumWidth(int)
	 * @see org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage#getAbstractFeatureDisplay_MinimumWidth()
	 * @model default="-1" unique="false"
	 * @generated
	 */
  int getMinimumWidth();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#getMinimumWidth <em>Minimum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Width</em>' attribute.
	 * @see #getMinimumWidth()
	 * @generated
	 */
  void setMinimumWidth(int value);

  /**
	 * Returns the value of the '<em><b>Minimum Height</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minimum Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Height</em>' attribute.
	 * @see #setMinimumHeight(int)
	 * @see org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage#getAbstractFeatureDisplay_MinimumHeight()
	 * @model default="-1" unique="false"
	 * @generated
	 */
  int getMinimumHeight();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#getMinimumHeight <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Height</em>' attribute.
	 * @see #getMinimumHeight()
	 * @generated
	 */
  void setMinimumHeight(int value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a Control to display the feature.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.core.display.Control" unique="false" parentDataType="org.eclipse.symphony.core.display.Composite" parentUnique="false"
	 * @generated
	 */
  Control createControl(Composite parent);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the minimum size that Control should have to display the feature.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.core.display.Point" unique="false" controlDataType="org.eclipse.symphony.core.display.Control" controlUnique="false"
	 * @generated
	 */
  Point getControlMinimumSize(Control control);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binds the feature being displayed to the specified Control.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.core.display.DataBindingContext" unique="false" controlDataType="org.eclipse.symphony.core.display.Control" controlUnique="false"
	 * @generated
	 */
  DataBindingContext bindControl(Control control);

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Makes the Control to change its appearance to display the specified current Ranges.
	 * <!-- end-model-doc -->
	 * @model controlDataType="org.eclipse.symphony.core.display.Control" controlUnique="false" rangeUnique="false"
	 * @generated
	 */
	void updateRange(Control control, Ranges range);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Makes the Control to change its appearance to display to display whether or not the Control displayed value is resolved.
	 * <!-- end-model-doc -->
	 * @model controlDataType="org.eclipse.symphony.core.display.Control" controlUnique="false" resolvedUnique="false"
	 * @generated
	 */
  void updateResolved(Control control, boolean resolved);

} // AbstractFeatureDisplay
