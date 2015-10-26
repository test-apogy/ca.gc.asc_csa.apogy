/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;

import javax.vecmath.Color3f;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Ruler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tool that shows the distance between two point on the map. The use needs to
 * selects two positions on the map by clicking using the left button on the mouse.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.MapRuler#getRulerColor <em>Ruler Color</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getMapRuler()
 * @model
 * @generated
 */
public interface MapRuler extends MapTool
{

  /**
	 * Returns the value of the '<em><b>Ruler Color</b></em>' attribute.
	 * The default value is <code>"0.0,1.0,0.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The color of the ruler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruler Color</em>' attribute.
	 * @see #setRulerColor(Color3f)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getMapRuler_RulerColor()
	 * @model default="0.0,1.0,0.0" unique="false" dataType="org.eclipse.symphony.core.environment.ui.Color3f"
	 * @generated
	 */
  Color3f getRulerColor();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.MapRuler#getRulerColor <em>Ruler Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruler Color</em>' attribute.
	 * @see #getRulerColor()
	 * @generated
	 */
  void setRulerColor(Color3f value);
} // MapRuler
