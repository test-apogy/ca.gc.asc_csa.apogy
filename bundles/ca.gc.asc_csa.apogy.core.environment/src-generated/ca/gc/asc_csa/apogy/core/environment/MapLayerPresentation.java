/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Layer Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class representing presentation attributes that are associated to a AbstractMapLayer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation#isVisible <em>Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation#getMapLayer <em>Map Layer</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getMapLayerPresentation()
 * @model abstract="true"
 * @generated
 */
public interface MapLayerPresentation extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Visibility
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getMapLayerPresentation_Visible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='PRESENTATION_SETTINGS'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Layer</em>' reference.
	 * @see #setMapLayer(AbstractMapLayer)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getMapLayerPresentation_MapLayer()
	 * @model
	 * @generated
	 */
	AbstractMapLayer getMapLayer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation#getMapLayer <em>Map Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Layer</em>' reference.
	 * @see #getMapLayer()
	 * @generated
	 */
	void setMapLayer(AbstractMapLayer value);

} // MapLayerPresentation
