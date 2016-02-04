package ca.gc.asc_csa.apogy.addons.sensors.pose.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.sensors.Sensor;
import ca.gc.asc_csa.apogy.addons.sensors.SensorStatus;
import ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.Activator;
import ca.gc.asc_csa.apogy.addons.sensors.pose.OrientationSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseDataLogger;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PositionSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.SelfPlaceSensor;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Pose;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.GeometricUtils;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.common.topology.impl.TransformNodeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Sensor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.PoseSensorImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.PoseSensorImpl#getPositionCoordinates <em>Position Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.PoseSensorImpl#getOrientationCoordinates <em>Orientation Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.PoseSensorImpl#getPose <em>Pose</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.PoseSensorImpl#getDataLogger <em>Data Logger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoseSensorImpl extends TransformNodeImpl implements PoseSensor {

	private Adapter positionAdapter = null;
	private Adapter orientationAdapter = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final SensorStatus STATUS_EDEFAULT = SensorStatus.OFF;
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SensorStatus status = STATUS_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPositionCoordinates() <em>Position Coordinates</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPositionCoordinates()
	 * @generated
	 * @ordered
	 */
	protected CartesianPositionCoordinates positionCoordinates;
	/**
	 * The cached value of the '{@link #getOrientationCoordinates() <em>Orientation Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationCoordinates()
	 * @generated
	 * @ordered
	 */
	protected CartesianOrientationCoordinates orientationCoordinates;

	private Pose pose;

	/**
	 * The cached value of the '{@link #getDataLogger() <em>Data Logger</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataLogger()
	 * @generated
	 * @ordered
	 */
	protected PoseDataLogger dataLogger;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected PoseSensorImpl() {
		super();

		// Register listener to keep position, orientation and pose up to date.
		eAdapters().add(getPositionAdapter());
		eAdapters().add(getOrientationAdapter());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsPosePackage.Literals.POSE_SENSOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SensorStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(SensorStatus newStatus) {
		SensorStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.POSE_SENSOR__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianPositionCoordinates getPositionCoordinates() {
		if (positionCoordinates == null) {
			positionCoordinates = ApogyCommonGeometryData3DFactory.eINSTANCE
					.createCartesianPositionCoordinates();
		}
		return positionCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates basicGetPositionCoordinates() {
		return positionCoordinates;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianOrientationCoordinates getOrientationCoordinates() {
		if (orientationCoordinates == null) {
			orientationCoordinates = ApogyCommonGeometryData3DFactory.eINSTANCE
					.createCartesianOrientationCoordinates();
		}
		return orientationCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianOrientationCoordinates basicGetOrientationCoordinates() {
		return orientationCoordinates;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Pose getPose() {
		if (pose == null) {
			pose = ApogyCommonGeometryData3DFactory.eINSTANCE.createPose();

			// Adds adapter for position and orienatation if not already there.
			if (!eAdapters().contains(getPositionAdapter()))
				eAdapters().add(getPositionAdapter());
			if (!eAdapters().contains(getOrientationAdapter()))
				eAdapters().add(getOrientationAdapter());
		}

		// We log the data everytime the pose is retrieved.
		logPose();

		return pose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pose basicGetPose() {
		return pose;
	}

	/**
	 * This method logs the current values that are in {@link #pose}. If the
	 * attribute {@link #dataLogger} is null, no data is logged.
	 */
	private void logPose() {
		if (getDataLogger() != null && pose != null) {
			try {
				getDataLogger().logPose(pose);
			} catch (IOException e) {
				Logger.INSTANCE.log(Activator.ID, this, "Error while logging the data: " + e.getMessage(), EventSeverity.ERROR, e);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PoseDataLogger getDataLogger() {
		return dataLogger;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataLogger(PoseDataLogger newDataLogger,
			NotificationChain msgs) {
		PoseDataLogger oldDataLogger = dataLogger;
		dataLogger = newDataLogger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.POSE_SENSOR__DATA_LOGGER, oldDataLogger, newDataLogger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataLogger(PoseDataLogger newDataLogger) {
		if (newDataLogger != dataLogger) {
			NotificationChain msgs = null;
			if (dataLogger != null)
				msgs = ((InternalEObject)dataLogger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsPosePackage.POSE_SENSOR__DATA_LOGGER, null, msgs);
			if (newDataLogger != null)
				msgs = ((InternalEObject)newDataLogger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsPosePackage.POSE_SENSOR__DATA_LOGGER, null, msgs);
			msgs = basicSetDataLogger(newDataLogger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.POSE_SENSOR__DATA_LOGGER, newDataLogger, newDataLogger));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void resetPose(Pose newPose) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void resetOrientation(CartesianOrientationCoordinates newOrientation)
			throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianOrientationCoordinates extractOrientationFromMatrix(
			Matrix3x3 matrix) {
		Vector3d rotation = GeometricUtils
				.extractRotationFromXYZRotMatrix(matrix.asMatrix3d());
		CartesianOrientationCoordinates orientation = ApogyCommonGeometryData3DFacade.INSTANCE
				.createCartesianOrientationCoordinates(rotation.x, rotation.y,
						rotation.z);
		return orientation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void resetPosition(CartesianPositionCoordinates newPosition)
			throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__DATA_LOGGER:
				return basicSetDataLogger(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__STATUS:
				return getStatus();
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__POSITION_COORDINATES:
				if (resolve) return getPositionCoordinates();
				return basicGetPositionCoordinates();
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__ORIENTATION_COORDINATES:
				if (resolve) return getOrientationCoordinates();
				return basicGetOrientationCoordinates();
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__POSE:
				if (resolve) return getPose();
				return basicGetPose();
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__DATA_LOGGER:
				return getDataLogger();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__STATUS:
				setStatus((SensorStatus)newValue);
				return;
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__DATA_LOGGER:
				setDataLogger((PoseDataLogger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__DATA_LOGGER:
				setDataLogger((PoseDataLogger)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__STATUS:
				return status != STATUS_EDEFAULT;
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__POSITION_COORDINATES:
				return positionCoordinates != null;
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__ORIENTATION_COORDINATES:
				return orientationCoordinates != null;
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__POSE:
				return pose != null;
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR__DATA_LOGGER:
				return dataLogger != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Sensor.class) {
			switch (derivedFeatureID) {
				case ApogyAddonsSensorsPosePackage.POSE_SENSOR__STATUS: return ApogyAddonsSensorsPackage.SENSOR__STATUS;
				default: return -1;
			}
		}
		if (baseClass == SelfPlaceSensor.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PositionSensor.class) {
			switch (derivedFeatureID) {
				case ApogyAddonsSensorsPosePackage.POSE_SENSOR__POSITION_COORDINATES: return ApogyAddonsSensorsPosePackage.POSITION_SENSOR__POSITION_COORDINATES;
				default: return -1;
			}
		}
		if (baseClass == OrientationSensor.class) {
			switch (derivedFeatureID) {
				case ApogyAddonsSensorsPosePackage.POSE_SENSOR__ORIENTATION_COORDINATES: return ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR__ORIENTATION_COORDINATES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Sensor.class) {
			switch (baseFeatureID) {
				case ApogyAddonsSensorsPackage.SENSOR__STATUS: return ApogyAddonsSensorsPosePackage.POSE_SENSOR__STATUS;
				default: return -1;
			}
		}
		if (baseClass == SelfPlaceSensor.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PositionSensor.class) {
			switch (baseFeatureID) {
				case ApogyAddonsSensorsPosePackage.POSITION_SENSOR__POSITION_COORDINATES: return ApogyAddonsSensorsPosePackage.POSE_SENSOR__POSITION_COORDINATES;
				default: return -1;
			}
		}
		if (baseClass == OrientationSensor.class) {
			switch (baseFeatureID) {
				case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR__ORIENTATION_COORDINATES: return ApogyAddonsSensorsPosePackage.POSE_SENSOR__ORIENTATION_COORDINATES;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Sensor.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == SelfPlaceSensor.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == PositionSensor.class) {
			switch (baseOperationID) {
				case ApogyAddonsSensorsPosePackage.POSITION_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES: return ApogyAddonsSensorsPosePackage.POSE_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES;
				default: return -1;
			}
		}
		if (baseClass == OrientationSensor.class) {
			switch (baseOperationID) {
				case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES: return ApogyAddonsSensorsPosePackage.POSE_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES;
				case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3: return ApogyAddonsSensorsPosePackage.POSE_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR___RESET_POSE__POSE:
				try {
					resetPose((Pose)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES:
				try {
					resetOrientation((CartesianOrientationCoordinates)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3:
				return extractOrientationFromMatrix((Matrix3x3)arguments.get(0));
			case ApogyAddonsSensorsPosePackage.POSE_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES:
				try {
					resetPosition((CartesianPositionCoordinates)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

	private Adapter getPositionAdapter() {
		if (positionAdapter == null) {
			positionAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeatureID(TransformNode.class) == ApogyCommonTopologyPackage.TRANSFORM_NODE__POSITION) {
						// Updates the current Orientation data with the new
						// values.
						Tuple3d newPose = (Tuple3d) msg.getNewValue();

						// Update position coordinates.
						getPositionCoordinates().setX(newPose.getX());
						getPositionCoordinates().setY(newPose.getY());
						getPositionCoordinates().setZ(newPose.getZ());

						// Update orientation coordinates.
						getPose().setX(newPose.getX());
						getPose().setY(newPose.getY());
						getPose().setZ(newPose.getZ());
					}
				}
			};
		}
		return positionAdapter;
	}

	private Adapter getOrientationAdapter() {
		if (orientationAdapter == null) {
			orientationAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeatureID(TransformNode.class) == ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX) {
						// Extracts the rotation from the rotation matrix.
						CartesianOrientationCoordinates newOrientation = extractOrientationFromMatrix((Matrix3x3) msg
								.getNewValue());

						// Updates the rotation coordinates.
						getOrientationCoordinates().setXRotation(
								newOrientation.getXRotation());
						getOrientationCoordinates().setYRotation(
								newOrientation.getYRotation());
						getOrientationCoordinates().setZRotation(
								newOrientation.getZRotation());

						// Update Pose orientation
						getPose().setXRotation(newOrientation.getXRotation());
						getPose().setYRotation(newOrientation.getYRotation());
						getPose().setZRotation(newOrientation.getZRotation());
					}
				}
			};
		}
		return orientationAdapter;
	}
} // PoseSensorImpl
