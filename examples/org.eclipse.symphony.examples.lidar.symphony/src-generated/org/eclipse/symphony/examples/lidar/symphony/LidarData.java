/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lidar.symphony;

import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;
import org.eclipse.symphony.core.SymphonyInitializationData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lidar Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is specifies the initialization data that Symphony
 * should be interested in when (re)initializing the Lidar unit
 * antenna with the API Adapter (which in this case is
 * {@link org.eclipse.symphony.examples.lidar.symphony.LidarSymphonySystemApiAdapter})
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.lidar.symphony.LidarData#getFov <em>Fov</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lidar.symphony.LidarData#isInitialized <em>Initialized</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.examples.lidar.symphony.SymphonyExampleLidarPackage#getLidarData()
 * @model
 * @generated
 */
public interface LidarData extends SymphonyInitializationData {
	/**
	 * Returns the value of the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the field of view (FOV) for the Lidar unit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fov</em>' containment reference.
	 * @see #setFov(RectangularFrustrumFieldOfView)
	 * @see org.eclipse.symphony.examples.lidar.symphony.SymphonyExampleLidarPackage#getLidarData_Fov()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Editable' propertyCategory='Field Of View'"
	 * @generated
	 */
	RectangularFrustrumFieldOfView getFov();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lidar.symphony.LidarData#getFov <em>Fov</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fov</em>' containment reference.
	 * @see #getFov()
	 * @generated
	 */
	void setFov(RectangularFrustrumFieldOfView value);

	/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the whether or not the Lidar unit has been initialized
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see org.eclipse.symphony.examples.lidar.symphony.SymphonyExampleLidarPackage#getLidarData_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lidar.symphony.LidarData#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

} // LidarData
