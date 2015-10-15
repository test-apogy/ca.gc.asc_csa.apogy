/**
 * <copyright>
 * </copyright>
 *
 * $Id: GPSPoseSensorImpl.java,v 1.2.4.3 2015/09/22 19:39:37 rlarcheveque Exp $
 */
package org.eclipse.symphony.addons.sensors.gps.impl;

import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.addons.sensors.SensorStatus;
import org.eclipse.symphony.addons.sensors.gps.Activator;
import org.eclipse.symphony.addons.sensors.gps.GPS;
import org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor;
import org.eclipse.symphony.addons.sensors.gps.GPSReading;
import org.eclipse.symphony.addons.sensors.gps.GPSStatus;
import org.eclipse.symphony.addons.sensors.gps.GpsPackage;
import org.eclipse.symphony.addons.sensors.gps.MarkedGPS;
import org.eclipse.symphony.addons.sensors.pose.impl.PoseSensorImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Data3dFactory;
import org.eclipse.symphony.common.geometry.data3d.Pose;
import org.eclipse.symphony.common.geometry.data3d.PositionMarker;
import org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker;
import org.eclipse.symphony.common.lang.java.Timer;
import org.eclipse.symphony.common.math.GeometricUtils;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.obsolete.eclipse.emf.DefaultListEventDelegate;
import org.eclipse.symphony.common.obsolete.eclipse.emf.EListAdapter;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ListEventDelegate;
import org.eclipse.symphony.common.obsolete.mrt.CommonPackage;
import org.eclipse.symphony.common.obsolete.mrt.Server;
import org.eclipse.symphony.common.obsolete.mrt.Startable;
import org.gavaghan.geodesy.Ellipsoid;
import org.gavaghan.geodesy.GeodeticCalculator;
import org.gavaghan.geodesy.GeodeticCurve;
import org.gavaghan.geodesy.GlobalCoordinates;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>GPS Pose Sensor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSPoseSensorImpl#isStarted <em>Started</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSPoseSensorImpl#getServerJob <em>Server Job</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSPoseSensorImpl#getGps <em>Gps</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSPoseSensorImpl#getOriginLatitude <em>Origin Latitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSPoseSensorImpl#getOriginLongitude <em>Origin Longitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSPoseSensorImpl#getNeAngle <em>Ne Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSPoseSensorImpl#getOriginElevation <em>Origin Elevation</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSPoseSensorImpl#getMaxInitTime <em>Max Init Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GPSPoseSensorImpl extends PoseSensorImpl implements GPSPoseSensor {

	/**
	 * The default value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STARTED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected boolean started = STARTED_EDEFAULT;
	/**
	 * The default value of the '{@link #getServerJob() <em>Server Job</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getServerJob()
	 * @generated
	 * @ordered
	 */
	protected static final Job SERVER_JOB_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getServerJob() <em>Server Job</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getServerJob()
	 * @generated
	 * @ordered
	 */
	protected Job serverJob = SERVER_JOB_EDEFAULT;
	private RigidBodyPoseTracker rigidBodyPoseTracker = null;
	/**
	 * The reference matrix contains the reference position and rotation of the
	 * sensor. The readings are given with respect to that matrix.
	 */
	private Matrix4d referenceMatrix;

	/**
	 * The cached value of the '{@link #getGps() <em>Gps</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGps()
	 * @generated
	 * @ordered
	 */
	protected EList<MarkedGPS> gps;

	/**
	 * The default value of the '{@link #getOriginLatitude() <em>Origin Latitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOriginLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIGIN_LATITUDE_EDEFAULT = 45.518206644445;

	/**
	 * The cached value of the '{@link #getOriginLatitude() <em>Origin Latitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOriginLatitude()
	 * @generated
	 * @ordered
	 */
	protected double originLatitude = ORIGIN_LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginLongitude() <em>Origin Longitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOriginLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIGIN_LONGITUDE_EDEFAULT = -73.393904468182;

	/**
	 * The cached value of the '{@link #getOriginLongitude() <em>Origin Longitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOriginLongitude()
	 * @generated
	 * @ordered
	 */
	protected double originLongitude = ORIGIN_LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeAngle() <em>Ne Angle</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNeAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double NE_ANGLE_EDEFAULT = 0.5940676;

	/**
	 * The cached value of the '{@link #getNeAngle() <em>Ne Angle</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNeAngle()
	 * @generated
	 * @ordered
	 */
	protected double neAngle = NE_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginElevation() <em>Origin Elevation</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOriginElevation()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIGIN_ELEVATION_EDEFAULT = 33.0985;

	/**
	 * The cached value of the '{@link #getOriginElevation() <em>Origin Elevation</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOriginElevation()
	 * @generated
	 * @ordered
	 */
	protected double originElevation = ORIGIN_ELEVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxInitTime() <em>Max Init Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMaxInitTime()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_INIT_TIME_EDEFAULT = 10000L;

	/**
	 * The cached value of the '{@link #getMaxInitTime() <em>Max Init Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxInitTime()
	 * @generated
	 * @ordered
	 */
	protected long maxInitTime = MAX_INIT_TIME_EDEFAULT;
	private Adapter gpsListener;
	private ListEventDelegate<GPS> gpsListDelegate;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GPSPoseSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpsPackage.Literals.GPS_POSE_SENSOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setStarted(boolean newStarted) {
		boolean oldStarted = started;
		started = newStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GpsPackage.GPS_POSE_SENSOR__STARTED, oldStarted, started));

		if (started && newStarted != oldStarted) {
			getServerJob().schedule();
		} else if (!started && newStarted != oldStarted) {
			getServerJob().cancel();
		}
	}

	@Override
	public Pose getPose() {

		if (!isStarted()) {
			setStarted(true);
		}

		return super.getPose();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Job getServerJob() {
		if (serverJob == null) {
			serverJob = new Job("GPS Pose Sensor") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {

					IStatus status = Status.OK_STATUS;

					try {
						monitor.beginTask("GPS", IProgressMonitor.UNKNOWN);

						monitor.subTask("Initializing");

						initialize();

						monitor.subTask("Updating");

						Timer timer = new Timer();

						// A 1 Hz frequency.
						long periodTime = 1000;

						while (isStarted() || !monitor.isCanceled()) {

							// We target a 1 Hz update rate.
							timer.start();
							updatePose();
							long time = timer.stop();

							long delta = periodTime - time;

							// We pause for the remaining of the period.
							if (delta > 0) {
								try {
									Thread.sleep(delta);
								} catch (InterruptedException e) {
								}
							}
						}

						monitor.done();

					} catch (RuntimeException e) {
						status = new Status(Status.ERROR, Activator.ID,
								"Error while initializing", e);
					}

					return status;
				}
			};
		}
		return serverJob;
	}

	private void updatePose() {

		if (getStatus() == SensorStatus.READY) {

			try {
				// For the moment, we only support one gps.
				if (getGps().isEmpty()) {
					throw new IllegalArgumentException(
							"At least one gps is needed");
				}

				Pose currentPose = null;

				if (getGps().size() == 1) {
					currentPose = computePoseOneGPS(getGps().get(0));
				} else if (getGps().size() == 2) {
					currentPose = computePoseTwoGPS();
				} else if (getGps().size() >= 3) {
					currentPose = computePoseNGPS();
				}

				if (currentPose != null) {
					currentPose = convertToLocalFrame(currentPose);

					Tuple3d position = MathFacade.INSTANCE
							.createTuple3d(new Vector3d(currentPose.getX(),
									currentPose.getY(), currentPose.getZ()));

					setPosition(position);

					// We set the rotation.
					Matrix3d rotMat = GeometricUtils.packXYZ(currentPose
							.getXRotation(), currentPose.getYRotation(),
							currentPose.getZRotation());

					if (getGps().size() == 1) {
						currentPose = computePoseOneGPS(getGps().get(0));
					} else if (getGps().size() == 2) {
						currentPose = computePoseTwoGPS();
					} else if (getGps().size() >= 3) {
						currentPose = computePoseNGPS();
					}

					Matrix3x3 mat = MathFacade.INSTANCE.createMatrix3x3(rotMat);

					setRotationMatrix(mat);
				}
			} catch (Throwable t) {
				setStatus(SensorStatus.FAILED);

				Tuple3d newPosition = MathFacade.INSTANCE.createTuple3d(0.0,
						0.0, 0.0);

				setPosition(newPosition);

				Matrix3d newRotationMatrix = new Matrix3d();
				newRotationMatrix.setIdentity();

				Matrix3x3 newMat = MathFacade.INSTANCE
						.createMatrix3x3(newRotationMatrix);

				setRotationMatrix(newMat);
			}
		} else { // We pause for 100 ms
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

	/**
	 * The initialze method initializes the following elements:
	 * <ul>
	 * <li>Sets the sensor to BUSY state.</li>
	 * <li>Starts every gps.</li>
	 * <li>Wait for a reading from every gps. If a reading does not arrive
	 * within {@link #getMaxInitTime()}, the sensor is put into FAILED state and
	 * a {@link RuntimeException} is thrown.</li>
	 * <li>Sets the sensor to READY state.</li>
	 * </ul>
	 */
	private void initialize() {
		setStatus(SensorStatus.BUSY);

		// We start every gps.
		for (MarkedGPS gps : getGps()) {
			gps.start();
		}

		// Maximum time for initialisation is 2 seconds.

		// We read from every gps.
		for (MarkedGPS gps : getGps()) {

			boolean done = false;

			Timer timer = new Timer();

			// For every gps, we try to read from it.
			// If we wait for too long, i.e., greater than MAX_INIT_TIME,
			// We throw a RuntimeException.

			timer.start();

			while (!done) {

				GPSReading reading = gps.getReading();

				if (reading == null) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}
				} else {
					done = true;
				}

				if (timer.elapsed() > getMaxInitTime()) {
					setStatus(SensorStatus.FAILED);
					throw new RuntimeException(
							"Cannot initialize device, unable to read from gps "
									+ gps.getMarker().getIdentifier());
				}
			}
		}

		setStatus(SensorStatus.READY);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<MarkedGPS> getGps() {
		if (gps == null) {
			gps = new EObjectContainmentEList<MarkedGPS>(MarkedGPS.class, this,
					GpsPackage.GPS_POSE_SENSOR__GPS);

			// We add a listener to the list.
			EListAdapter<GPS> adapter = new EListAdapter<GPS>(
					GpsPackage.GPS_POSE_SENSOR__GPS, getGpsListDelegate(),
					GPSPoseSensor.class);

			this.eAdapters().add(adapter);
		}
		return gps;
	}

	/**
	 * 
	 * @return the delegate that gets the events when the list of gps is
	 *         modified.
	 */
	private ListEventDelegate<GPS> getGpsListDelegate() {
		if (gpsListDelegate == null) {
			gpsListDelegate = new DefaultListEventDelegate<GPS>() {
				@Override
				public void added(GPS element) {
					element.eAdapters().add(getGpsListener());
				}

				@Override
				public void removed(GPS element) {
					element.eAdapters().remove(getGpsListener());
				}
			};
		}

		return gpsListDelegate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getOriginLatitude() {
		return originLatitude;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginLatitude(double newOriginLatitude) {
		double oldOriginLatitude = originLatitude;
		originLatitude = newOriginLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_POSE_SENSOR__ORIGIN_LATITUDE, oldOriginLatitude, originLatitude));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getOriginLongitude() {
		return originLongitude;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginLongitude(double newOriginLongitude) {
		double oldOriginLongitude = originLongitude;
		originLongitude = newOriginLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_POSE_SENSOR__ORIGIN_LONGITUDE, oldOriginLongitude, originLongitude));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getNeAngle() {
		return neAngle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeAngle(double newNeAngle) {
		double oldNeAngle = neAngle;
		neAngle = newNeAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_POSE_SENSOR__NE_ANGLE, oldNeAngle, neAngle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getOriginElevation() {
		return originElevation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginElevation(double newOriginElevation) {
		double oldOriginElevation = originElevation;
		originElevation = newOriginElevation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_POSE_SENSOR__ORIGIN_ELEVATION, oldOriginElevation, originElevation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxInitTime() {
		return maxInitTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInitTime(long newMaxInitTime) {
		long oldMaxInitTime = maxInitTime;
		maxInitTime = newMaxInitTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_POSE_SENSOR__MAX_INIT_TIME, oldMaxInitTime, maxInitTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GpsPackage.GPS_POSE_SENSOR__GPS:
				return ((InternalEList<?>)getGps()).basicRemove(otherEnd, msgs);
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
			case GpsPackage.GPS_POSE_SENSOR__STARTED:
				return isStarted();
			case GpsPackage.GPS_POSE_SENSOR__SERVER_JOB:
				return getServerJob();
			case GpsPackage.GPS_POSE_SENSOR__GPS:
				return getGps();
			case GpsPackage.GPS_POSE_SENSOR__ORIGIN_LATITUDE:
				return getOriginLatitude();
			case GpsPackage.GPS_POSE_SENSOR__ORIGIN_LONGITUDE:
				return getOriginLongitude();
			case GpsPackage.GPS_POSE_SENSOR__NE_ANGLE:
				return getNeAngle();
			case GpsPackage.GPS_POSE_SENSOR__ORIGIN_ELEVATION:
				return getOriginElevation();
			case GpsPackage.GPS_POSE_SENSOR__MAX_INIT_TIME:
				return getMaxInitTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GpsPackage.GPS_POSE_SENSOR__STARTED:
				setStarted((Boolean)newValue);
				return;
			case GpsPackage.GPS_POSE_SENSOR__GPS:
				getGps().clear();
				getGps().addAll((Collection<? extends MarkedGPS>)newValue);
				return;
			case GpsPackage.GPS_POSE_SENSOR__ORIGIN_LATITUDE:
				setOriginLatitude((Double)newValue);
				return;
			case GpsPackage.GPS_POSE_SENSOR__ORIGIN_LONGITUDE:
				setOriginLongitude((Double)newValue);
				return;
			case GpsPackage.GPS_POSE_SENSOR__NE_ANGLE:
				setNeAngle((Double)newValue);
				return;
			case GpsPackage.GPS_POSE_SENSOR__ORIGIN_ELEVATION:
				setOriginElevation((Double)newValue);
				return;
			case GpsPackage.GPS_POSE_SENSOR__MAX_INIT_TIME:
				setMaxInitTime((Long)newValue);
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
			case GpsPackage.GPS_POSE_SENSOR__STARTED:
				setStarted(STARTED_EDEFAULT);
				return;
			case GpsPackage.GPS_POSE_SENSOR__GPS:
				getGps().clear();
				return;
			case GpsPackage.GPS_POSE_SENSOR__ORIGIN_LATITUDE:
				setOriginLatitude(ORIGIN_LATITUDE_EDEFAULT);
				return;
			case GpsPackage.GPS_POSE_SENSOR__ORIGIN_LONGITUDE:
				setOriginLongitude(ORIGIN_LONGITUDE_EDEFAULT);
				return;
			case GpsPackage.GPS_POSE_SENSOR__NE_ANGLE:
				setNeAngle(NE_ANGLE_EDEFAULT);
				return;
			case GpsPackage.GPS_POSE_SENSOR__ORIGIN_ELEVATION:
				setOriginElevation(ORIGIN_ELEVATION_EDEFAULT);
				return;
			case GpsPackage.GPS_POSE_SENSOR__MAX_INIT_TIME:
				setMaxInitTime(MAX_INIT_TIME_EDEFAULT);
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
			case GpsPackage.GPS_POSE_SENSOR__STARTED:
				return started != STARTED_EDEFAULT;
			case GpsPackage.GPS_POSE_SENSOR__SERVER_JOB:
				return SERVER_JOB_EDEFAULT == null ? serverJob != null : !SERVER_JOB_EDEFAULT.equals(serverJob);
			case GpsPackage.GPS_POSE_SENSOR__GPS:
				return gps != null && !gps.isEmpty();
			case GpsPackage.GPS_POSE_SENSOR__ORIGIN_LATITUDE:
				return originLatitude != ORIGIN_LATITUDE_EDEFAULT;
			case GpsPackage.GPS_POSE_SENSOR__ORIGIN_LONGITUDE:
				return originLongitude != ORIGIN_LONGITUDE_EDEFAULT;
			case GpsPackage.GPS_POSE_SENSOR__NE_ANGLE:
				return neAngle != NE_ANGLE_EDEFAULT;
			case GpsPackage.GPS_POSE_SENSOR__ORIGIN_ELEVATION:
				return originElevation != ORIGIN_ELEVATION_EDEFAULT;
			case GpsPackage.GPS_POSE_SENSOR__MAX_INIT_TIME:
				return maxInitTime != MAX_INIT_TIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Startable.class) {
			switch (derivedFeatureID) {
				case GpsPackage.GPS_POSE_SENSOR__STARTED: return CommonPackage.STARTABLE__STARTED;
				default: return -1;
			}
		}
		if (baseClass == Server.class) {
			switch (derivedFeatureID) {
				case GpsPackage.GPS_POSE_SENSOR__SERVER_JOB: return CommonPackage.SERVER__SERVER_JOB;
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
		if (baseClass == Startable.class) {
			switch (baseFeatureID) {
				case CommonPackage.STARTABLE__STARTED: return GpsPackage.GPS_POSE_SENSOR__STARTED;
				default: return -1;
			}
		}
		if (baseClass == Server.class) {
			switch (baseFeatureID) {
				case CommonPackage.SERVER__SERVER_JOB: return GpsPackage.GPS_POSE_SENSOR__SERVER_JOB;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (started: ");
		result.append(started);
		result.append(", serverJob: ");
		result.append(serverJob);
		result.append(", originLatitude: ");
		result.append(originLatitude);
		result.append(", originLongitude: ");
		result.append(originLongitude);
		result.append(", neAngle: ");
		result.append(neAngle);
		result.append(", originElevation: ");
		result.append(originElevation);
		result.append(", maxInitTime: ");
		result.append(maxInitTime);
		result.append(')');
		return result.toString();
	}

	private Pose computePoseNGPS() {

		List<PositionMarker> listPositionMarker = new ArrayList<PositionMarker>();

		for (int i = 0; i < getGps().size(); i++) {
			GPSReading reading = getGps().get(i).getReading();
			Vector3d gpsPosition = convertGpsToXYZ(reading);
			PositionMarker marker = Data3dFactory.eINSTANCE
					.createPositionMarker();
			marker.setX(gpsPosition.getX());
			marker.setY(gpsPosition.getY());
			marker.setZ(gpsPosition.getZ());
			marker.setIdentifier(getGps().get(i).getMarker().getIdentifier());
			listPositionMarker.add(marker);
		}

		Matrix4d roverPose = new Matrix4d();
		try {
			roverPose = getPoseTracker().computeTransformation(
					listPositionMarker);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(roverPose);

		Matrix3d roverRotationMatrix = new Matrix3d();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				roverRotationMatrix
						.setElement(i, j, roverPose.getElement(i, j));
			}
		}

		Vector3d rollPitchYaw = GeometricUtils
				.extractRotationFromZYXRotMatrix(roverRotationMatrix);
		Pose pose1 = Data3dFactory.eINSTANCE.createPose();
		pose1.setXRotation(rollPitchYaw.getX());
		pose1.setYRotation(rollPitchYaw.getY());
		pose1.setZRotation(rollPitchYaw.getZ());
		pose1.setX(roverPose.m03);
		pose1.setY(roverPose.m13);
		pose1.setZ(roverPose.m23);

		return pose1;
	}

	private RigidBodyPoseTracker getPoseTracker() {
		if (rigidBodyPoseTracker == null) {
			rigidBodyPoseTracker = Data3dFactory.eINSTANCE
					.createRigidBodyPoseTracker();
			// Initialize markers
			List<PositionMarker> listPositionMarkerAtOrigin = new ArrayList<PositionMarker>();
			for (int i = 0; i < getGps().size(); i++) {
				PositionMarker marker = getGps().get(i).getMarker();
				listPositionMarkerAtOrigin.add(marker);
			}
			try {
				rigidBodyPoseTracker
						.addPositionMarkers(listPositionMarkerAtOrigin);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rigidBodyPoseTracker;
	}

	/**
	 * If newOrientation is null, identity is assigned to the orientation.
	 */
	@Override
	public void resetOrientation(CartesianOrientationCoordinates newOrientation)
			throws Exception {

		Matrix3d rotationMatrix = null;

		if (newOrientation != null) {

			double rx = newOrientation.getXRotation();
			double ry = newOrientation.getYRotation();
			double rz = newOrientation.getZRotation();

			rotationMatrix = GeometricUtils.packXYZ(rx, ry, rz);
		} else { // newOrientation == null, we set the orientation to be
			// identity.
			rotationMatrix = new Matrix3d();
			rotationMatrix.setIdentity();
		}

		getReferenceMatrix().setRotation(rotationMatrix);
	}

	/**
	 * <p>
	 * Sets the reference frame of the pose sensor. Subsequent readings from the
	 * sensor are with respect to this new reference frame. The following
	 * post-condition are verified once this method has been called: If
	 * 'newPose' is <code>null</code>: {@link #getReferenceMatrix()} is set to
	 * identity, i.e., position is set to 0.0, 0.0, 0.0 and orientation is set
	 * to 0.0, 0.0, 0.0.
	 * </p>
	 * 
	 * <p>
	 * If 'newPose" is not <code>null</code>
	 * <ul>
	 * <li>{@link #resetOrientation(CartesianOrientationCoordinates)} is called
	 * with parameters {@link Pose#getXRotation()},{@link Pose#getYRotation()},
	 * {@link Pose#getZRotation()}</li>
	 * <li>{@link #resetPosition(CartesianPositionCoordinates)} is called with
	 * parameters {@link Pose#getX()}, {@link Pose#getY()}, {@link Pose#getZ()}</li>
	 * </ul>
	 * </p>
	 */
	@Override
	public void resetPose(Pose newPose) throws Exception {

		if (newPose == null) { // We set the reference matrix to identity.
			getReferenceMatrix().setIdentity();
		} else {
			double x = newPose.getX();
			double y = newPose.getY();
			double z = newPose.getZ();

			CartesianPositionCoordinates newPosition = Data3dFacade.INSTANCE
					.createCartesianPositionCoordinates(x, y, z);

			double rx = newPose.getXRotation();
			double ry = newPose.getYRotation();
			double rz = newPose.getZRotation();

			CartesianOrientationCoordinates newOrientation = Data3dFacade.INSTANCE
					.createCartesianOrientationCoordinates(rx, ry, rz);

			resetPosition(newPosition);
			resetOrientation(newOrientation);
		}
	}

	/**
	 * If newPosition is null, 0,0,0 is assigned to the reference matrix.
	 */
	@Override
	public void resetPosition(CartesianPositionCoordinates newPosition)
			throws Exception {

		Vector3d translation = null;

		if (newPosition != null) {

			double x = newPosition.getX();
			double y = newPosition.getY();
			double z = newPosition.getZ();

			translation = new Vector3d(x, y, z);
		} else {
			translation = new Vector3d(0.0, 0.0, 0.0);
		}

		getReferenceMatrix().setTranslation(translation);
	}

	/**
	 * Computes the pose based on one gps. Meaning that only the translation in
	 * x,y,z will be computed.
	 * 
	 * @param gps
	 *            the gps we wish to read from.
	 * @return the pose with only the translational component, in meters, with
	 *         respect to the origin latitude and longitude. <code>null</code>
	 *         if the gps reading is invalid.
	 */
	private Pose computePoseOneGPS(GPS gps) {

		Pose pose = null;

		// We take a reading from the gps.
		GPSReading reading = gps.getReading();

		if (reading != null) {

			// If the reading is valid, we process the data.
			if (reading.getQuality().getValue() > 0) {

				Vector3d xyz = convertGpsToXYZ(reading);
				pose = Data3dFactory.eINSTANCE.createPose();
				pose.setX(xyz.getX());
				pose.setY(xyz.getY());
				pose.setZ(xyz.getZ());
			}

		}

		return pose;
	}

	/**
	 * Computes the pose based on two gps. Meaning that only the translation in
	 * x,y,z will be computed based on the average of the two gps.
	 * 
	 * @return the pose with only the translational component, in meters, with
	 *         respect to the origin latitude and longitude. <code>null</code>
	 *         if the gps reading is invalid.
	 */
	private Pose computePoseTwoGPS() {

		Pose pose = null;

		// We take a reading from the gps.
		GPSReading reading1 = getGps().get(0).getReading();
		GPSReading reading2 = getGps().get(1).getReading();

		if (reading1 != null && reading2 != null) {

			// If the reading is valid, we process the data.
			if (reading1.getQuality().getValue() > 0
					&& reading2.getQuality().getValue() > 0) {

				Vector3d xyz1 = convertGpsToXYZ(reading1);
				Vector3d xyz2 = convertGpsToXYZ(reading2);

				pose = Data3dFactory.eINSTANCE.createPose();
				// set the average as output
				pose.setX((xyz1.getX() + xyz2.getX()) / 2);
				pose.setY((xyz1.getY() + xyz2.getY()) / 2);
				pose.setZ((xyz1.getZ() + xyz2.getZ()) / 2);
			}

		}

		return pose;
	}

	/**
	 * Converts a gps reading, in latitude, longitude and elevation into xyz
	 * coordinates.
	 * 
	 * @param reading
	 *            the gps reading to convert.
	 * @return the gps reading, in latitude, longitude and elevation converted
	 *         into xyz coordinates.
	 * @throw IllegalArgumentException if <code>reading</code> is
	 *        <code>null</code>.
	 */
	private Vector3d convertGpsToXYZ(GPSReading reading) {

		if (reading == null) {
			throw new IllegalArgumentException("reading is null");
		}

		// set MET origin coordinates
		GlobalCoordinates origin;
		origin = new GlobalCoordinates(getOriginLatitude(),
				getOriginLongitude());

		Vector3d result = new Vector3d();

		// instantiate the calculator
		GeodeticCalculator geoCalc = new GeodeticCalculator();

		// select a reference elllipsoid, for more information go to:
		// http://en.wikipedia.org/wiki/World_Geodetic_System
		Ellipsoid reference = Ellipsoid.WGS84;

		// set Rover coordinates
		GlobalCoordinates Rover;
		Rover = new GlobalCoordinates(reading.getLatitude(), reading
				.getLongitude());

		// calculate the geodetic curve
		GeodeticCurve geoCurve = geoCalc.calculateGeodeticCurve(reference,
				origin, Rover);
		double DN = -geoCurve.getEllipsoidalDistance()
				* Math.cos(Math.toRadians(geoCurve.getAzimuth()));// alessio
		double DE = -geoCurve.getEllipsoidalDistance()
				* Math.sin(Math.toRadians(geoCurve.getAzimuth()));// alessio
		double xGPS = DN * Math.cos(Math.toRadians(getNeAngle())) + DE
				* Math.sin(Math.toRadians(getNeAngle()));
		double yGPS = -1
				* (-DN * Math.sin(Math.toRadians(getNeAngle())) + DE
						* Math.cos(Math.toRadians(getNeAngle())));

		double zGPS = reading.getElevation() - getOriginElevation();

		result.setX(xGPS);
		result.setY(yGPS);
		result.setZ(zGPS);

		return result;

	}

	/**
	 * Converts the pose with respect to the reference frame.
	 * 
	 * @param pose
	 *            the pose to convert, expressed in world frame.
	 * @return the pose converted in the local frame.
	 */
	private Pose convertToLocalFrame(Pose pose) {

		Pose localFramePose = Data3dFactory.eINSTANCE.createPose();

		// The pose is with respect to the reference position.
		Matrix4d refInvert = new Matrix4d();
		refInvert.invert(getReferenceMatrix());

		// The pose matrix.
		Matrix4d poseMat = new Matrix4d();
		poseMat.setIdentity();
		double rx = pose.getXRotation();
		double ry = pose.getYRotation();
		double rz = pose.getZRotation();
		Matrix3d rotMat = GeometricUtils.packXYZ(rx, ry, rz);
		poseMat.setRotation(rotMat);
		poseMat.setTranslation(new Vector3d(pose.asPoint3d()));

		// We multiply it by the invert of the reference position.
		// We now have the pose with respect to the reference frame.
		poseMat.mul(refInvert);

		// The rotational component.
		rotMat = new Matrix3d();
		poseMat.get(rotMat);

		// The translational component.
		Vector3d tr = new Vector3d();
		poseMat.get(tr);

		// We extract the rotation.
		Vector3d rotations = GeometricUtils
				.extractRotationFromXYZRotMatrix(rotMat);

		localFramePose.setXRotation(rotations.getX());
		localFramePose.setYRotation(rotations.getY());
		localFramePose.setZRotation(rotations.getZ());

		localFramePose.setX(tr.getX());
		localFramePose.setY(tr.getY());
		localFramePose.setZ(tr.getZ());

		return localFramePose;
	}

	private Matrix4d getReferenceMatrix() {
		if (referenceMatrix == null) {
			referenceMatrix = new Matrix4d();
			referenceMatrix.setIdentity();
		}
		return referenceMatrix;
	}

	/**
	 * This listener listens for state changes in the GPS objects contained in
	 * {@link #getGps()}.
	 * 
	 * @return
	 */
	private Adapter getGpsListener() {
		if (gpsListener == null) {
			gpsListener = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					int featureId = msg.getFeatureID(GPSPoseSensor.class);

					if (featureId == GpsPackage.GPS__STATUS) {
						if (msg.getNewValue() == GPSStatus.RECONNECTING) {
							// The gps is trying to reconnect, we fall into
							// 'busy' state.
							setStatus(SensorStatus.BUSY);
						}

						// If the gps falls into 'RUNNING' state, we verify that
						// all the gps are in RUNNING state.
						// If that's the case, we switch into 'READY' state.
						if (msg.getNewValue() == GPSStatus.RUNNING) {
							// We make sure all gps are in RUNNING state.
							if (verifyAllGpsStatus(GPSStatus.RUNNING)) {
								setStatus(SensorStatus.READY);
							}
						}
					}
				}
			};
		}
		return gpsListener;
	}

	/**
	 * This method verifies that all the GPS objects contained in
	 * {@link #getGps()} are in state 'expectedStatus'.
	 * 
	 * @param expectedStatus
	 * @return true if all GPS objects contained in {@link #getGps()} are in
	 *         state 'expectedStatus'.
	 */
	private boolean verifyAllGpsStatus(GPSStatus expectedStatus) {

		boolean valid = true;

		for (GPS gps : getGps()) {
			valid = gps.getStatus() == expectedStatus;

			if (!valid) {
				break;
			}
		}

		return valid;

	}

} // GPSPoseSensorImpl
