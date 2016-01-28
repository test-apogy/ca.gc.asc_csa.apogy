/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons;

import javax.vecmath.Color3f;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ruler3 DTool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A 3D tool used to measure distance between two points.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getRulerColor <em>Ruler Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getExtremitiesRadius <em>Extremities Radius</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getMinorTickColor <em>Minor Tick Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getMinorTickSpacing <em>Minor Tick Spacing</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getMinorTickLength <em>Minor Tick Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getMajorTickColor <em>Major Tick Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getMajorTickSpacing <em>Major Tick Spacing</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getMajorTickLength <em>Major Tick Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getRuler3dToolNode <em>Ruler3d Tool Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getRuler3DTool()
 * @model
 * @generated
 */
public interface Ruler3DTool extends AbstractTwoPoints3DTool {

	/**
	 * Returns the value of the '<em><b>Ruler3d Tool Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.Ruler3dToolNode#getRuler3DTool <em>Ruler3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruler3d Tool Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Topology Node associated with the tool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruler3d Tool Node</em>' reference.
	 * @see #setRuler3dToolNode(Ruler3dToolNode)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getRuler3DTool_Ruler3dToolNode()
	 * @see ca.gc.asc_csa.apogy.addons.Ruler3dToolNode#getRuler3DTool
	 * @model opposite="ruler3DTool" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='true' property='Readonly' propertyCategory='RULER_PROPERTIES'"
	 * @generated
	 */
	Ruler3dToolNode getRuler3dToolNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getRuler3dToolNode <em>Ruler3d Tool Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruler3d Tool Node</em>' reference.
	 * @see #getRuler3dToolNode()
	 * @generated
	 */
	void setRuler3dToolNode(Ruler3dToolNode value);

	/**
	 * Returns the value of the '<em><b>Ruler Color</b></em>' attribute.
	 * The default value is <code>"0.0,1.0,0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The ruler color.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruler Color</em>' attribute.
	 * @see #setRulerColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getRuler3DTool_RulerColor()
	 * @model default="0.0,1.0,0.0" unique="false" dataType="ca.gc.asc_csa.apogy.addons.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='RULER_PROPERTIES'"
	 * @generated
	 */
	Color3f getRulerColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getRulerColor <em>Ruler Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruler Color</em>' attribute.
	 * @see #getRulerColor()
	 * @generated
	 */
	void setRulerColor(Color3f value);

	/**
	 * Returns the value of the '<em><b>Extremities Radius</b></em>' attribute.
	 * The default value is <code>"0.01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Radius of sphere used as ruler end points.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extremities Radius</em>' attribute.
	 * @see #setExtremitiesRadius(double)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getRuler3DTool_ExtremitiesRadius()
	 * @model default="0.01" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' apogy_units='m' propertyCategory='RULER_PROPERTIES'"
	 * @generated
	 */
	double getExtremitiesRadius();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getExtremitiesRadius <em>Extremities Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extremities Radius</em>' attribute.
	 * @see #getExtremitiesRadius()
	 * @generated
	 */
	void setExtremitiesRadius(double value);

	/**
	 * Returns the value of the '<em><b>Minor Tick Color</b></em>' attribute.
	 * The default value is <code>"0.0,1.0,0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Minor tick color.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minor Tick Color</em>' attribute.
	 * @see #setMinorTickColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getRuler3DTool_MinorTickColor()
	 * @model default="0.0,1.0,0.0" unique="false" dataType="ca.gc.asc_csa.apogy.addons.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='MINOR_TICKS_PROPERTIES'"
	 * @generated
	 */
	Color3f getMinorTickColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getMinorTickColor <em>Minor Tick Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Tick Color</em>' attribute.
	 * @see #getMinorTickColor()
	 * @generated
	 */
	void setMinorTickColor(Color3f value);

	/**
	 * Returns the value of the '<em><b>Minor Tick Spacing</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minor Tick Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Spacing between minor tick mark.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minor Tick Spacing</em>' attribute.
	 * @see #setMinorTickSpacing(double)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getRuler3DTool_MinorTickSpacing()
	 * @model default="0.1" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' apogy_units='m' propertyCategory='MINOR_TICKS_PROPERTIES'"
	 * @generated
	 */
	double getMinorTickSpacing();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getMinorTickSpacing <em>Minor Tick Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Tick Spacing</em>' attribute.
	 * @see #getMinorTickSpacing()
	 * @generated
	 */
	void setMinorTickSpacing(double value);

	/**
	 * Returns the value of the '<em><b>Minor Tick Length</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Length of the minor tick marks as displayed on the ruler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minor Tick Length</em>' attribute.
	 * @see #setMinorTickLength(double)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getRuler3DTool_MinorTickLength()
	 * @model default="0.1" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' apogy_units='m' propertyCategory='MINOR_TICKS_PROPERTIES'"
	 * @generated
	 */
	double getMinorTickLength();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getMinorTickLength <em>Minor Tick Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Tick Length</em>' attribute.
	 * @see #getMinorTickLength()
	 * @generated
	 */
	void setMinorTickLength(double value);

	/**
	 * Returns the value of the '<em><b>Major Tick Color</b></em>' attribute.
	 * The default value is <code>"0.0,1.0,0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Major tick color.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Major Tick Color</em>' attribute.
	 * @see #setMajorTickColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getRuler3DTool_MajorTickColor()
	 * @model default="0.0,1.0,0.0" unique="false" dataType="ca.gc.asc_csa.apogy.addons.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='MAJOR_TICKS_PROPERTIES'"
	 * @generated
	 */
	Color3f getMajorTickColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getMajorTickColor <em>Major Tick Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Tick Color</em>' attribute.
	 * @see #getMajorTickColor()
	 * @generated
	 */
	void setMajorTickColor(Color3f value);

	/**
	 * Returns the value of the '<em><b>Major Tick Spacing</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major Tick Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Spacing between major tick mark.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Major Tick Spacing</em>' attribute.
	 * @see #setMajorTickSpacing(double)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getRuler3DTool_MajorTickSpacing()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' apogy_units='m' propertyCategory='MAJOR_TICKS_PROPERTIES'"
	 * @generated
	 */
	double getMajorTickSpacing();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getMajorTickSpacing <em>Major Tick Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Tick Spacing</em>' attribute.
	 * @see #getMajorTickSpacing()
	 * @generated
	 */
	void setMajorTickSpacing(double value);

	/**
	 * Returns the value of the '<em><b>Major Tick Length</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Length of the major tick marks as displayed on the ruler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Major Tick Length</em>' attribute.
	 * @see #setMajorTickLength(double)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getRuler3DTool_MajorTickLength()
	 * @model default="0.2" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' apogy_units='m' propertyCategory='MAJOR_TICKS_PROPERTIES'"
	 * @generated
	 */
	double getMajorTickLength();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getMajorTickLength <em>Major Tick Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Tick Length</em>' attribute.
	 * @see #getMajorTickLength()
	 * @generated
	 */
	void setMajorTickLength(double value);
} // Ruler3DTool
