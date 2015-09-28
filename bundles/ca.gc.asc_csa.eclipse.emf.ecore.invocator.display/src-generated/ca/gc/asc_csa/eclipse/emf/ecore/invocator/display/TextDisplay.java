/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Display that show a value as text.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.TextDisplay#getDecimalFormat <em>Decimal Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.EMFEcoreInvocatorDisplayPackage#getTextDisplay()
 * @model
 * @generated
 */
public interface TextDisplay extends AbstractFeatureDisplay
{
  /**
	 * Returns the value of the '<em><b>Decimal Format</b></em>' attribute.
	 * The default value is <code>"0.000"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The decimal format to use if the value is a Number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decimal Format</em>' attribute.
	 * @see #setDecimalFormat(String)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.EMFEcoreInvocatorDisplayPackage#getTextDisplay_DecimalFormat()
	 * @model default="0.000" unique="false"
	 * @generated
	 */
  String getDecimalFormat();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.TextDisplay#getDecimalFormat <em>Decimal Format</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Format</em>' attribute.
	 * @see #getDecimalFormat()
	 * @generated
	 */
  void setDecimalFormat(String value);

} // TextDisplay
