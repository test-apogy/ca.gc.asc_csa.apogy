/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera;

import javax.vecmath.Color3f;

import org.eclipse.symphony.core.AbsolutePoseProvider;

import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer Camera Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Tool that projects a ray going from the FOV origin through
 * the point selected on the Camera View Image. The ray is made visible as
 * a line in the 3D topology.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.PointerCameraTool#getFov <em>Fov</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.PointerCameraTool#getVectorColor <em>Vector Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.PointerCameraTool#getIntersectionDistance <em>Intersection Distance</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getPointerCameraTool()
 * @model
 * @generated
 */
public interface PointerCameraTool extends CameraTool, ToolTipTextProvider, AbsolutePoseProvider {
	/**
	 * Returns the value of the '<em><b>Fov</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fov</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fov</em>' reference.
	 * @see #setFov(RectangularFrustrumFieldOfView)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getPointerCameraTool_Fov()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='TOOL_PROPERTIES'"
	 * @generated
	 */
	RectangularFrustrumFieldOfView getFov();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.PointerCameraTool#getFov <em>Fov</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fov</em>' reference.
	 * @see #getFov()
	 * @generated
	 */
	void setFov(RectangularFrustrumFieldOfView value);

	/**
	 * Returns the value of the '<em><b>Vector Color</b></em>' attribute.
	 * The default value is <code>"0.0,1.0,0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Color</em>' attribute.
	 * @see #setVectorColor(Color3f)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getPointerCameraTool_VectorColor()
	 * @model default="0.0,1.0,0.0" unique="false" dataType="ca.gc.asc_csa.symphony.tools.camera.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TOOL_PROPERTIES'"
	 * @generated
	 */
	Color3f getVectorColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.PointerCameraTool#getVectorColor <em>Vector Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Color</em>' attribute.
	 * @see #getVectorColor()
	 * @generated
	 */
	void setVectorColor(Color3f value);

	/**
	 * Returns the value of the '<em><b>Intersection Distance</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current intersection distance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intersection Distance</em>' attribute.
	 * @see #setIntersectionDistance(double)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getPointerCameraTool_IntersectionDistance()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='TOOL_PROPERTIES' sca_units='m'"
	 * @generated
	 */
	double getIntersectionDistance();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.PointerCameraTool#getIntersectionDistance <em>Intersection Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intersection Distance</em>' attribute.
	 * @see #getIntersectionDistance()
	 * @generated
	 */
	void setIntersectionDistance(double value);

} // PointerCameraTool
