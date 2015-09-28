/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display;




/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Plot Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract Display that show a value as a plot.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.AbstractPlotDisplay#isRepeatLastValue <em>Repeat Last Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.AbstractPlotDisplay#isUseDataBuffering <em>Use Data Buffering</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.AbstractPlotDisplay#getHistoryLength <em>History Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.EMFEcoreInvocatorDisplayPackage#getAbstractPlotDisplay()
 * @model abstract="true"
 * @generated
 */
public interface AbstractPlotDisplay extends AbstractFeatureDisplay, HistoryDataHandler
{
  /**
	 * Returns the value of the '<em><b>Repeat Last Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repeat Last Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Last Value</em>' attribute.
	 * @see #setRepeatLastValue(boolean)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.EMFEcoreInvocatorDisplayPackage#getAbstractPlotDisplay_RepeatLastValue()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isRepeatLastValue();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.AbstractPlotDisplay#isRepeatLastValue <em>Repeat Last Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Last Value</em>' attribute.
	 * @see #isRepeatLastValue()
	 * @generated
	 */
  void setRepeatLastValue(boolean value);

  /**
	 * Returns the value of the '<em><b>Use Data Buffering</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Data Buffering</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Data Buffering</em>' attribute.
	 * @see #setUseDataBuffering(boolean)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.EMFEcoreInvocatorDisplayPackage#getAbstractPlotDisplay_UseDataBuffering()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isUseDataBuffering();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.AbstractPlotDisplay#isUseDataBuffering <em>Use Data Buffering</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Data Buffering</em>' attribute.
	 * @see #isUseDataBuffering()
	 * @generated
	 */
  void setUseDataBuffering(boolean value);

  /**
	 * Returns the value of the '<em><b>History Length</b></em>' attribute.
	 * The default value is <code>"60.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>History Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>History Length</em>' attribute.
	 * @see #setHistoryLength(double)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.EMFEcoreInvocatorDisplayPackage#getAbstractPlotDisplay_HistoryLength()
	 * @model default="60.0" unique="false"
	 * @generated
	 */
  double getHistoryLength();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.AbstractPlotDisplay#getHistoryLength <em>History Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Length</em>' attribute.
	 * @see #getHistoryLength()
	 * @generated
	 */
  void setHistoryLength(double value);

} // AbstractPlotDisplay
