/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.geometry.paths.ui;

import org.eclipse.symphony.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Way Point Path Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation#getPointSize <em>Point Size</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation#getPresentationMode <em>Presentation Mode</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation#getEndPointsRadius <em>End Points Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.geometry.paths.ui.Symphony__AddonsGeometryPathsUIPackage#getWayPointPathPresentation()
 * @model
 * @generated
 */
public interface WayPointPathPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Point Size</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Size</em>' attribute.
	 * @see #setPointSize(int)
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.Symphony__AddonsGeometryPathsUIPackage#getWayPointPathPresentation_PointSize()
	 * @model default="2" unique="false"
	 * @generated
	 */
	int getPointSize();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation#getPointSize <em>Point Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Size</em>' attribute.
	 * @see #getPointSize()
	 * @generated
	 */
	void setPointSize(int value);

	/**
	 * Returns the value of the '<em><b>Presentation Mode</b></em>' attribute.
	 * The default value is <code>"Points Lines"</code>.
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.geometry.paths.ui.PathPresentationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Mode</em>' attribute.
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.PathPresentationMode
	 * @see #setPresentationMode(PathPresentationMode)
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.Symphony__AddonsGeometryPathsUIPackage#getWayPointPathPresentation_PresentationMode()
	 * @model default="Points Lines" unique="false"
	 * @generated
	 */
	PathPresentationMode getPresentationMode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation#getPresentationMode <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Mode</em>' attribute.
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.PathPresentationMode
	 * @see #getPresentationMode()
	 * @generated
	 */
	void setPresentationMode(PathPresentationMode value);

	/**
	 * Returns the value of the '<em><b>End Points Radius</b></em>' attribute.
	 * The default value is <code>"0.02"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Points Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Points Radius</em>' attribute.
	 * @see #setEndPointsRadius(float)
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.Symphony__AddonsGeometryPathsUIPackage#getWayPointPathPresentation_EndPointsRadius()
	 * @model default="0.02" unique="false"
	 * @generated
	 */
	float getEndPointsRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation#getEndPointsRadius <em>End Points Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Points Radius</em>' attribute.
	 * @see #getEndPointsRadius()
	 * @generated
	 */
	void setEndPointsRadius(float value);

} // WayPointPathPresentation
