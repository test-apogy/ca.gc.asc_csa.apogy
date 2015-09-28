/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.eclipse.images.core.AbstractEImage;
import ca.gc.asc_csa.symphony.tools.camera.CameraTool;
import ca.gc.asc_csa.symphony.tools.camera.CameraToolList;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;
import ca.gc.space.mrt.sensors.imaging.ImageSnapshot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraToolImpl#getCameraToolList <em>Camera Tool List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CameraToolImpl extends CameraImageAnnotationImpl implements CameraTool {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCameraToolsPackage.Literals.CAMERA_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraToolList getCameraToolList() {
		if (eContainerFeatureID() != SymphonyCameraToolsPackage.CAMERA_TOOL__CAMERA_TOOL_LIST) return null;
		return (CameraToolList)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraToolList basicGetCameraToolList() {
		if (eContainerFeatureID() != SymphonyCameraToolsPackage.CAMERA_TOOL__CAMERA_TOOL_LIST) return null;
		return (CameraToolList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCameraToolList(CameraToolList newCameraToolList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCameraToolList, SymphonyCameraToolsPackage.CAMERA_TOOL__CAMERA_TOOL_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCameraToolList(CameraToolList newCameraToolList) {
		if (newCameraToolList != eInternalContainer() || (eContainerFeatureID() != SymphonyCameraToolsPackage.CAMERA_TOOL__CAMERA_TOOL_LIST && newCameraToolList != null)) {
			if (EcoreUtil.isAncestor(this, newCameraToolList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCameraToolList != null)
				msgs = ((InternalEObject)newCameraToolList).eInverseAdd(this, SymphonyCameraToolsPackage.CAMERA_TOOL_LIST__TOOLS, CameraToolList.class, msgs);
			msgs = basicSetCameraToolList(newCameraToolList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_TOOL__CAMERA_TOOL_LIST, newCameraToolList, newCameraToolList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeCamera(AbstractCamera camera) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateImageSnapshot(ImageSnapshot imageSnapshot) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void mouseMoved(AbstractEImage cameraImage, int mouseButton, int x, int y) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void positionSelected(AbstractEImage cameraImage, int mouseButton, int x, int y) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_TOOL__CAMERA_TOOL_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCameraToolList((CameraToolList)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_TOOL__CAMERA_TOOL_LIST:
				return basicSetCameraToolList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SymphonyCameraToolsPackage.CAMERA_TOOL__CAMERA_TOOL_LIST:
				return eInternalContainer().eInverseRemove(this, SymphonyCameraToolsPackage.CAMERA_TOOL_LIST__TOOLS, CameraToolList.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_TOOL__CAMERA_TOOL_LIST:
				if (resolve) return getCameraToolList();
				return basicGetCameraToolList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_TOOL__CAMERA_TOOL_LIST:
				setCameraToolList((CameraToolList)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_TOOL__CAMERA_TOOL_LIST:
				setCameraToolList((CameraToolList)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_TOOL__CAMERA_TOOL_LIST:
				return basicGetCameraToolList() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SymphonyCameraToolsPackage.CAMERA_TOOL___INITIALIZE_CAMERA__ABSTRACTCAMERA:
				initializeCamera((AbstractCamera)arguments.get(0));
				return null;
			case SymphonyCameraToolsPackage.CAMERA_TOOL___UPDATE_IMAGE_SNAPSHOT__IMAGESNAPSHOT:
				updateImageSnapshot((ImageSnapshot)arguments.get(0));
				return null;
			case SymphonyCameraToolsPackage.CAMERA_TOOL___MOUSE_MOVED__ABSTRACTEIMAGE_INT_INT_INT:
				mouseMoved((AbstractEImage)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case SymphonyCameraToolsPackage.CAMERA_TOOL___POSITION_SELECTED__ABSTRACTEIMAGE_INT_INT_INT:
				positionSelected((AbstractEImage)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CameraToolImpl
