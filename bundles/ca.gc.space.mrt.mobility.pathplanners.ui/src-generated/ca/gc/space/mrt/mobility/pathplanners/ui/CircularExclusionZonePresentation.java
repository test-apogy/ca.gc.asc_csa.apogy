/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.mobility.pathplanners.ui;

import ca.gc.space.topology.ui.MeshPresentationMode;
import ca.gc.space.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circular Exclusion Zone Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation#getPresentationMode <em>Presentation Mode</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.mobility.pathplanners.ui.PathPlannersUIPackage#getCircularExclusionZonePresentation()
 * @model
 * @generated
 */
public interface CircularExclusionZonePresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transparency</em>' attribute.
	 * @see #setTransparency(float)
	 * @see ca.gc.space.mrt.mobility.pathplanners.ui.PathPlannersUIPackage#getCircularExclusionZonePresentation_Transparency()
	 * @model unique="false"
	 * @generated
	 */
	float getTransparency();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation#getTransparency <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparency</em>' attribute.
	 * @see #getTransparency()
	 * @generated
	 */
	void setTransparency(float value);

	/**
	 * Returns the value of the '<em><b>Presentation Mode</b></em>' attribute.
	 * The default value is <code>"SURFACE"</code>.
	 * The literals are from the enumeration {@link ca.gc.space.topology.ui.MeshPresentationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Mode</em>' attribute.
	 * @see ca.gc.space.topology.ui.MeshPresentationMode
	 * @see #setPresentationMode(MeshPresentationMode)
	 * @see ca.gc.space.mrt.mobility.pathplanners.ui.PathPlannersUIPackage#getCircularExclusionZonePresentation_PresentationMode()
	 * @model default="SURFACE" unique="false"
	 * @generated
	 */
	MeshPresentationMode getPresentationMode();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation#getPresentationMode <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Mode</em>' attribute.
	 * @see ca.gc.space.topology.ui.MeshPresentationMode
	 * @see #getPresentationMode()
	 * @generated
	 */
	void setPresentationMode(MeshPresentationMode value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see ca.gc.space.mrt.mobility.pathplanners.ui.PathPlannersUIPackage#getCircularExclusionZonePresentation_Height()
	 * @model default="10.0" unique="false"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

} // CircularExclusionZonePresentation
