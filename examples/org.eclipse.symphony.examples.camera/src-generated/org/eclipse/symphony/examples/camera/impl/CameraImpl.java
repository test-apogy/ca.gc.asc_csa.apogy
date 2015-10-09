/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.camera.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;
import org.eclipse.symphony.examples.camera.Camera;
import org.eclipse.symphony.examples.camera.EMFEcoreExampleCameraPackage;

import ca.gc.space.mrt.sensors.imaging.ImageSnapshot;
import ca.gc.space.mrt.sensors.imaging.MRTSensorsImagingPackage;
import ca.gc.space.mrt.sensors.imaging.Zoomable;
import ca.gc.space.mrt.sensors.imaging.impl.AbstractCameraImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.camera.impl.CameraImpl#getCurrentZoom <em>Current Zoom</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.camera.impl.CameraImpl#getCommandedZoom <em>Commanded Zoom</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.camera.impl.CameraImpl#getFov <em>Fov</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.camera.impl.CameraImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.camera.impl.CameraImpl#isStreamingEnabled <em>Streaming Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CameraImpl extends AbstractCameraImpl implements Camera
{
	/**
	 * The default value of the '{@link #getCurrentZoom() <em>Current Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentZoom()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_ZOOM_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getCurrentZoom() <em>Current Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentZoom()
	 * @generated
	 * @ordered
	 */
	protected double currentZoom = CURRENT_ZOOM_EDEFAULT;
	/**
	 * The default value of the '{@link #getCommandedZoom() <em>Commanded Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandedZoom()
	 * @generated
	 * @ordered
	 */
	protected static final double COMMANDED_ZOOM_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getCommandedZoom() <em>Commanded Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandedZoom()
	 * @generated
	 * @ordered
	 */
	protected double commandedZoom = COMMANDED_ZOOM_EDEFAULT;
	/**
	 * The cached value of the '{@link #getFov() <em>Fov</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFov()
	 * @generated
	 * @ordered
	 */
	protected RectangularFrustrumFieldOfView fov;

	
	/**
	 * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected boolean initialized = INITIALIZED_EDEFAULT;


	/**
	 * The default value of the '{@link #isStreamingEnabled() <em>Streaming Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStreamingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STREAMING_ENABLED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isStreamingEnabled() <em>Streaming Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStreamingEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean streamingEnabled = STREAMING_ENABLED_EDEFAULT;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return EMFEcoreExampleCameraPackage.Literals.CAMERA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentZoom()
	{
		return currentZoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentZoom(double newCurrentZoom)
	{
		double oldCurrentZoom = currentZoom;
		currentZoom = newCurrentZoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleCameraPackage.CAMERA__CURRENT_ZOOM, oldCurrentZoom, currentZoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCommandedZoom()
	{
		return commandedZoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandedZoom(double newCommandedZoom)
	{
		double oldCommandedZoom = commandedZoom;
		commandedZoom = newCommandedZoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleCameraPackage.CAMERA__COMMANDED_ZOOM, oldCommandedZoom, commandedZoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularFrustrumFieldOfView getFov()
	{
		return fov;
	}
  
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFov(RectangularFrustrumFieldOfView newFov, NotificationChain msgs)
	{
		RectangularFrustrumFieldOfView oldFov = fov;
		fov = newFov;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreExampleCameraPackage.CAMERA__FOV, oldFov, newFov);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFov(RectangularFrustrumFieldOfView newFov)
	{
		if (newFov != fov) {
			NotificationChain msgs = null;
			if (fov != null)
				msgs = ((InternalEObject)fov).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleCameraPackage.CAMERA__FOV, null, msgs);
			if (newFov != null)
				msgs = ((InternalEObject)newFov).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleCameraPackage.CAMERA__FOV, null, msgs);
			msgs = basicSetFov(newFov, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleCameraPackage.CAMERA__FOV, newFov, newFov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialized() {
		return initialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialized(boolean newInitialized) {
		boolean oldInitialized = initialized;
		initialized = newInitialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleCameraPackage.CAMERA__INITIALIZED, oldInitialized, initialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStreamingEnabled() {
		return streamingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreamingEnabled(boolean newStreamingEnabled) {
		boolean oldStreamingEnabled = streamingEnabled;
		streamingEnabled = newStreamingEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleCameraPackage.CAMERA__STREAMING_ENABLED, oldStreamingEnabled, streamingEnabled));
	}

	/**
	 * This operation performs any required initialization
	 * operations for the camera.  This is typically called
	 * before any other operation.
	 * @return True if the initialization was successful, false otherwise.
	 * @generated_NOT
	 */
	abstract public boolean init();
  
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean commandStreaming(boolean streamingEnabled) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Command the camera zoom, attempting to change it
	 * to the given zoom value.
	 * @param newZoom The desired level of zoom
	 * @return Whether or not the current zoom level was updated.
	 * @see #getMaximumZoom()
	 * @see #getMinimumZoom()
	 * @generated_NOT
	 */
	abstract public boolean commandZoom(double newZoom);

	/**
	 * This operation returns the minimum zoom level permitted by this camera.
	 * @return The camera's minimum allowed zoom level
	 * @see #getMaximumZoom()
	 * @see #commandZoom(double)
	 * @generated_NOT
	 */
	abstract public double getMinimumZoom();

	/**
	 * This operation returns the maximum zoom level permitted by this camera.
	 * @return The camera's maximum allowed zoom level
	 * @see #getMinimumZoom()
	 * @see #commandZoom(double)
	 * @generated_NOT
	 */
	abstract public double getMaximumZoom();

	/**
	 * This method is used to order the camera to take and return a snapshot.
	 * @return A snapshot taken by the camera.
	 * @generated_NOT
	 */
	@Override
	abstract public ImageSnapshot takeSnapshot();
	
	/**
	 * Gets the current field of view (FOV) of the camera.
	 * @return The camera's current field of view.
	 * @generated_NOT 
	 */
	@Override
	abstract public RectangularFrustrumFieldOfView getFieldOfView();
	
	/**
	 * This method is 
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case EMFEcoreExampleCameraPackage.CAMERA__FOV:
				return basicSetFov(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case EMFEcoreExampleCameraPackage.CAMERA__CURRENT_ZOOM:
				return getCurrentZoom();
			case EMFEcoreExampleCameraPackage.CAMERA__COMMANDED_ZOOM:
				return getCommandedZoom();
			case EMFEcoreExampleCameraPackage.CAMERA__FOV:
				return getFov();
			case EMFEcoreExampleCameraPackage.CAMERA__INITIALIZED:
				return isInitialized();
			case EMFEcoreExampleCameraPackage.CAMERA__STREAMING_ENABLED:
				return isStreamingEnabled();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case EMFEcoreExampleCameraPackage.CAMERA__CURRENT_ZOOM:
				setCurrentZoom((Double)newValue);
				return;
			case EMFEcoreExampleCameraPackage.CAMERA__COMMANDED_ZOOM:
				setCommandedZoom((Double)newValue);
				return;
			case EMFEcoreExampleCameraPackage.CAMERA__FOV:
				setFov((RectangularFrustrumFieldOfView)newValue);
				return;
			case EMFEcoreExampleCameraPackage.CAMERA__INITIALIZED:
				setInitialized((Boolean)newValue);
				return;
			case EMFEcoreExampleCameraPackage.CAMERA__STREAMING_ENABLED:
				setStreamingEnabled((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case EMFEcoreExampleCameraPackage.CAMERA__CURRENT_ZOOM:
				setCurrentZoom(CURRENT_ZOOM_EDEFAULT);
				return;
			case EMFEcoreExampleCameraPackage.CAMERA__COMMANDED_ZOOM:
				setCommandedZoom(COMMANDED_ZOOM_EDEFAULT);
				return;
			case EMFEcoreExampleCameraPackage.CAMERA__FOV:
				setFov((RectangularFrustrumFieldOfView)null);
				return;
			case EMFEcoreExampleCameraPackage.CAMERA__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
				return;
			case EMFEcoreExampleCameraPackage.CAMERA__STREAMING_ENABLED:
				setStreamingEnabled(STREAMING_ENABLED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case EMFEcoreExampleCameraPackage.CAMERA__CURRENT_ZOOM:
				return currentZoom != CURRENT_ZOOM_EDEFAULT;
			case EMFEcoreExampleCameraPackage.CAMERA__COMMANDED_ZOOM:
				return commandedZoom != COMMANDED_ZOOM_EDEFAULT;
			case EMFEcoreExampleCameraPackage.CAMERA__FOV:
				return fov != null;
			case EMFEcoreExampleCameraPackage.CAMERA__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
			case EMFEcoreExampleCameraPackage.CAMERA__STREAMING_ENABLED:
				return streamingEnabled != STREAMING_ENABLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == Zoomable.class) {
			switch (derivedFeatureID) {
				case EMFEcoreExampleCameraPackage.CAMERA__CURRENT_ZOOM: return MRTSensorsImagingPackage.ZOOMABLE__CURRENT_ZOOM;
				case EMFEcoreExampleCameraPackage.CAMERA__COMMANDED_ZOOM: return MRTSensorsImagingPackage.ZOOMABLE__COMMANDED_ZOOM;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == Zoomable.class) {
			switch (baseFeatureID) {
				case MRTSensorsImagingPackage.ZOOMABLE__CURRENT_ZOOM: return EMFEcoreExampleCameraPackage.CAMERA__CURRENT_ZOOM;
				case MRTSensorsImagingPackage.ZOOMABLE__COMMANDED_ZOOM: return EMFEcoreExampleCameraPackage.CAMERA__COMMANDED_ZOOM;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
	{
		if (baseClass == Zoomable.class) {
			switch (baseOperationID) {
				case MRTSensorsImagingPackage.ZOOMABLE___COMMAND_ZOOM__DOUBLE: return EMFEcoreExampleCameraPackage.CAMERA___COMMAND_ZOOM__DOUBLE;
				case MRTSensorsImagingPackage.ZOOMABLE___GET_MINIMUM_ZOOM: return EMFEcoreExampleCameraPackage.CAMERA___GET_MINIMUM_ZOOM;
				case MRTSensorsImagingPackage.ZOOMABLE___GET_MAXIMUM_ZOOM: return EMFEcoreExampleCameraPackage.CAMERA___GET_MAXIMUM_ZOOM;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID) {
			case EMFEcoreExampleCameraPackage.CAMERA___INIT:
				return init();
			case EMFEcoreExampleCameraPackage.CAMERA___COMMAND_STREAMING__BOOLEAN:
				return commandStreaming((Boolean)arguments.get(0));
			case EMFEcoreExampleCameraPackage.CAMERA___COMMAND_ZOOM__DOUBLE:
				return commandZoom((Double)arguments.get(0));
			case EMFEcoreExampleCameraPackage.CAMERA___GET_MINIMUM_ZOOM:
				return getMinimumZoom();
			case EMFEcoreExampleCameraPackage.CAMERA___GET_MAXIMUM_ZOOM:
				return getMaximumZoom();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (currentZoom: ");
		result.append(currentZoom);
		result.append(", commandedZoom: ");
		result.append(commandedZoom);
		result.append(", initialized: ");
		result.append(initialized);
		result.append(", streamingEnabled: ");
		result.append(streamingEnabled);
		result.append(')');
		return result.toString();
	}
  
} //CameraImpl
