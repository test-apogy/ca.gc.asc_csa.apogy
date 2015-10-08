/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.Updatable;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentFactory;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;
import org.eclipse.symphony.core.environment.orbit.earth.Activator;
import org.eclipse.symphony.core.environment.orbit.earth.Corridor;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitFacade;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.earth.SpacecraftSwathCorridor;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentFactory;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import org.orekit.bodies.BodyShape;
import org.orekit.bodies.GeodeticPoint;
import org.orekit.bodies.OneAxisEllipsoid;
import org.orekit.errors.OrekitException;
import org.orekit.errors.PropagationException;
import org.orekit.frames.FramesFactory;
import org.orekit.frames.Transform;
import org.orekit.propagation.Propagator;
import org.orekit.propagation.sampling.OrekitFixedStepHandler;
import org.orekit.time.AbsoluteDate;
import org.orekit.utils.Constants;
import org.orekit.utils.IERSConventions;
import org.orekit.utils.PVCoordinates;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spacecraft Swath Corridor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl#isUpdating <em>Updating</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl#isAutoUpdateEnabled <em>Auto Update Enabled</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl#getLeftSwathAngle <em>Left Swath Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl#getRightSwathAngle <em>Right Swath Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl#getCorridor <em>Corridor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpacecraftSwathCorridorImpl extends MinimalEObjectImpl.Container implements SpacecraftSwathCorridor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isUpdating() <em>Updating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPDATING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUpdating() <em>Updating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdating()
	 * @generated
	 * @ordered
	 */
	protected boolean updating = UPDATING_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoUpdateEnabled() <em>Auto Update Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoUpdateEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_UPDATE_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoUpdateEnabled() <em>Auto Update Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoUpdateEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean autoUpdateEnabled = AUTO_UPDATE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated_NOT
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_INTERVAL_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected double timeInterval = TIME_INTERVAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrbitModel() <em>Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitModel()
	 * @generated
	 * @ordered
	 */
	protected OrbitModel orbitModel;

	/**
	 * The default value of the '{@link #getLeftSwathAngle() <em>Left Swath Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSwathAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double LEFT_SWATH_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLeftSwathAngle() <em>Left Swath Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSwathAngle()
	 * @generated
	 * @ordered
	 */
	protected double leftSwathAngle = LEFT_SWATH_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightSwathAngle() <em>Right Swath Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSwathAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double RIGHT_SWATH_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRightSwathAngle() <em>Right Swath Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSwathAngle()
	 * @generated
	 * @ordered
	 */
	protected double rightSwathAngle = RIGHT_SWATH_ANGLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCorridor() <em>Corridor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorridor()
	 * @generated
	 * @ordered
	 */
	protected Corridor corridor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftSwathCorridorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentPackage.Literals.SPACECRAFT_SWATH_CORRIDOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpdating() {
		return updating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdating(boolean newUpdating) {
		boolean oldUpdating = updating;
		updating = newUpdating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__UPDATING, oldUpdating, updating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoUpdateEnabled() {
		return autoUpdateEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoUpdateEnabled(boolean newAutoUpdateEnabled) {
		boolean oldAutoUpdateEnabled = autoUpdateEnabled;
		autoUpdateEnabled = newAutoUpdateEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__AUTO_UPDATE_ENABLED, oldAutoUpdateEnabled, autoUpdateEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(Date newEndTime) {
		Date oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeInterval() {
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeInterval(double newTimeInterval) {
		double oldTimeInterval = timeInterval;
		timeInterval = newTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__TIME_INTERVAL, oldTimeInterval, timeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModel getOrbitModel() {
		if (orbitModel != null && orbitModel.eIsProxy()) {
			InternalEObject oldOrbitModel = (InternalEObject)orbitModel;
			orbitModel = (OrbitModel)eResolveProxy(oldOrbitModel);
			if (orbitModel != oldOrbitModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__ORBIT_MODEL, oldOrbitModel, orbitModel));
			}
		}
		return orbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModel basicGetOrbitModel() {
		return orbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrbitModel(OrbitModel newOrbitModel) {
		OrbitModel oldOrbitModel = orbitModel;
		orbitModel = newOrbitModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__ORBIT_MODEL, oldOrbitModel, orbitModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLeftSwathAngle() {
		return leftSwathAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftSwathAngle(double newLeftSwathAngle) {
		double oldLeftSwathAngle = leftSwathAngle;
		leftSwathAngle = newLeftSwathAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__LEFT_SWATH_ANGLE, oldLeftSwathAngle, leftSwathAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRightSwathAngle() {
		return rightSwathAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightSwathAngle(double newRightSwathAngle) {
		double oldRightSwathAngle = rightSwathAngle;
		rightSwathAngle = newRightSwathAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__RIGHT_SWATH_ANGLE, oldRightSwathAngle, rightSwathAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Corridor getCorridor() {
		return corridor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorridor(Corridor newCorridor, NotificationChain msgs) {
		Corridor oldCorridor = corridor;
		corridor = newCorridor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__CORRIDOR, oldCorridor, newCorridor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorridor(Corridor newCorridor) {
		if (newCorridor != corridor) {
			NotificationChain msgs = null;
			if (corridor != null)
				msgs = ((InternalEObject)corridor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__CORRIDOR, null, msgs);
			if (newCorridor != null)
				msgs = ((InternalEObject)newCorridor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__CORRIDOR, null, msgs);
			msgs = basicSetCorridor(newCorridor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__CORRIDOR, newCorridor, newCorridor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean getDefaultAutoUpdateEnabled() 
	{
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__NAME:
				return getName();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__DESCRIPTION:
				return getDescription();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__UPDATING:
				return isUpdating();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__AUTO_UPDATE_ENABLED:
				return isAutoUpdateEnabled();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__START_TIME:
				return getStartTime();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__END_TIME:
				return getEndTime();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__TIME_INTERVAL:
				return getTimeInterval();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__ORBIT_MODEL:
				if (resolve) return getOrbitModel();
				return basicGetOrbitModel();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__LEFT_SWATH_ANGLE:
				return getLeftSwathAngle();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__RIGHT_SWATH_ANGLE:
				return getRightSwathAngle();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__CORRIDOR:
				return getCorridor();
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
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__NAME:
				setName((String)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__UPDATING:
				setUpdating((Boolean)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__AUTO_UPDATE_ENABLED:
				setAutoUpdateEnabled((Boolean)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__START_TIME:
				setStartTime((Date)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__END_TIME:
				setEndTime((Date)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__TIME_INTERVAL:
				setTimeInterval((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__ORBIT_MODEL:
				setOrbitModel((OrbitModel)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__LEFT_SWATH_ANGLE:
				setLeftSwathAngle((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__RIGHT_SWATH_ANGLE:
				setRightSwathAngle((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__CORRIDOR:
				setCorridor((Corridor)newValue);
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
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__UPDATING:
				setUpdating(UPDATING_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__AUTO_UPDATE_ENABLED:
				setAutoUpdateEnabled(AUTO_UPDATE_ENABLED_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__TIME_INTERVAL:
				setTimeInterval(TIME_INTERVAL_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__ORBIT_MODEL:
				setOrbitModel((OrbitModel)null);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__LEFT_SWATH_ANGLE:
				setLeftSwathAngle(LEFT_SWATH_ANGLE_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__RIGHT_SWATH_ANGLE:
				setRightSwathAngle(RIGHT_SWATH_ANGLE_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__CORRIDOR:
				setCorridor((Corridor)null);
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
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__UPDATING:
				return updating != UPDATING_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__AUTO_UPDATE_ENABLED:
				return autoUpdateEnabled != AUTO_UPDATE_ENABLED_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__TIME_INTERVAL:
				return timeInterval != TIME_INTERVAL_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__ORBIT_MODEL:
				return orbitModel != null;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__LEFT_SWATH_ANGLE:
				return leftSwathAngle != LEFT_SWATH_ANGLE_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__RIGHT_SWATH_ANGLE:
				return rightSwathAngle != RIGHT_SWATH_ANGLE_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__CORRIDOR:
				return corridor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Updatable.class) {
			switch (derivedFeatureID) {
				case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__UPDATING: return SymphonyCorePackage.UPDATABLE__UPDATING;
				case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__AUTO_UPDATE_ENABLED: return SymphonyCorePackage.UPDATABLE__AUTO_UPDATE_ENABLED;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Updatable.class) {
			switch (baseFeatureID) {
				case SymphonyCorePackage.UPDATABLE__UPDATING: return SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__UPDATING;
				case SymphonyCorePackage.UPDATABLE__AUTO_UPDATE_ENABLED: return SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__AUTO_UPDATE_ENABLED;
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
		if (baseClass == Described.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Updatable.class) {
			switch (baseOperationID) {
				case SymphonyCorePackage.UPDATABLE___GET_DEFAULT_AUTO_UPDATE_ENABLED: return SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR___GET_DEFAULT_AUTO_UPDATE_ENABLED;
				case SymphonyCorePackage.UPDATABLE___UPDATE: return SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR___UPDATE;
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
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR___GET_DEFAULT_AUTO_UPDATE_ENABLED:
				return getDefaultAutoUpdateEnabled();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR___UPDATE:
				try {
					update();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", updating: ");
		result.append(updating);
		result.append(", autoUpdateEnabled: ");
		result.append(autoUpdateEnabled);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", timeInterval: ");
		result.append(timeInterval);
		result.append(", leftSwathAngle: ");
		result.append(leftSwathAngle);
		result.append(", rightSwathAngle: ");
		result.append(rightSwathAngle);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void update()
	{
		try
		{
			EarthOrbitPropagator earthOrbitPropagator = (EarthOrbitPropagator) getOrbitModel().getPropagator();
			Propagator propagator = earthOrbitPropagator.getOreKitPropagator();
									
			Corridor corridor = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createCorridor();			
			
			// Checks that the specified dates falls within the propagator valid interval.
			if(!earthOrbitPropagator.isDateInValidRange(getStartTime()))
			{
				String message = "Start date is outside the validity range !";
																
				Logger.INSTANCE.log(Activator.ID, this, "Start date is outside the validity range !", EventSeverity.ERROR);
		
				// Throw an exception.	
				throw new Exception(message);
			}
			
			if(!earthOrbitPropagator.isDateInValidRange(getEndTime()))
			{			
				String message = "End date is outside the validity range !";
				
				// Throw an exception.
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
				
				throw new Exception(message);	
			}
			
			// Computes the duration.
			double duration = (getEndTime().getTime() - getStartTime().getTime()) * 0.001;
	
			// Adds a fixed step handler to record the SpacecraftStates.
			CorridorHandler corridorHandler = new CorridorHandler(getStartTime(), getEndTime(), leftSwathAngle, rightSwathAngle);
			propagator.setMasterMode(getTimeInterval(), corridorHandler);						
			AbsoluteDate startAbsoluteDate = EarthOrbitFacade.INSTANCE.createAbsoluteDate(getStartTime());
			
			try 
			{						
				// Start orbit propagation.
				propagator.propagate(new AbsoluteDate(startAbsoluteDate, duration));	
							
				// Gets the point from the corridor handler.
				for(SpacecraftSwathCorridorImpl.CorridorPoint point : corridorHandler.getCorridor())
				{
					AbsoluteDate absoluteDate = point.getDate();
					Date date = EarthOrbitFacade.INSTANCE.createDate(absoluteDate);
					
					GeodeticPoint left = point.getLeft();				
					GeographicCoordinates leftCoord = SymphonyEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
					leftCoord.setElevation(left.getAltitude());
					leftCoord.setLatitude(left.getLatitude());
					leftCoord.setLongitude(left.getLongitude());					

					GeodeticPoint center = point.getCenter();				
					GeographicCoordinates centerCoord = SymphonyEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
					centerCoord.setElevation(center.getAltitude());
					centerCoord.setLatitude(center.getLatitude());
					centerCoord.setLongitude(center.getLongitude());					
										
					GeodeticPoint right = point.getRight();
					GeographicCoordinates rightCoord = SymphonyEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
					rightCoord.setElevation(right.getAltitude());
					rightCoord.setLatitude(right.getLatitude());
					rightCoord.setLongitude(right.getLongitude());
					
					org.eclipse.symphony.core.environment.orbit.earth.CorridorPoint newPoint = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createCorridorPoint();
					newPoint.setTime(date);
					newPoint.setLeft(leftCoord);
					newPoint.setCenter(centerCoord);
					newPoint.setRight(rightCoord);
					
					// Adds the point to the corridor.
					corridor.getPoints().add(newPoint);
				}
				
				setCorridor(corridor);
			} 
			catch (PropagationException e1) 
			{			
				e1.printStackTrace();
				
				Logger.INSTANCE.log(Activator.ID, this, "Error occured during execution !", EventSeverity.ERROR, e1);
				
				throw e1;
			}		
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}	
	}
	
    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFT_SWATH_CORRIDOR__CORRIDOR:
				return basicSetCorridor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/** 
     * Step handler storing corridor points.
     * https://www.orekit.org/projects/orekit/repository/revisions/6a1957016f90fe88ed77f72538bf66f9118c1f96/entry/src/tutorials/java/fr/cs/examples/propagation/TrackCorridor.java
     */

    private static class CorridorHandler implements OrekitFixedStepHandler 
    {
    	private Date startDate;
    	
    	private Date endDate;
    	
    	private double leftSwathAngle = 0; 
    	private double rightSwathAngle = 0;
    	
        /** Earth model. */
        private final BodyShape earth;

        /** Corridor. */
        private final List<CorridorPoint> corridor;
        
        /** simple constructor.
         * @param angle angular offset of corridor boundaries
         * @exception OrekitException if Earth frame cannot be built
         */

        public CorridorHandler(final Date startDate, final Date endDate, final double leftSwathAngle, final double rightSwathAngle) throws OrekitException 
        {
        	this.startDate = startDate;
        	this.endDate = endDate;
        	
        	this.leftSwathAngle = leftSwathAngle;
        	this.rightSwathAngle = rightSwathAngle;
        	
            // set up Earth model
            earth = new OneAxisEllipsoid(Constants.WGS84_EARTH_EQUATORIAL_RADIUS, Constants.WGS84_EARTH_FLATTENING, FramesFactory.getITRF(IERSConventions.IERS_2010, false)); 
            // prepare an empty corridor
            corridor = new ArrayList<CorridorPoint>();
        }

    	@Override
		public void init(org.orekit.propagation.SpacecraftState arg0, AbsoluteDate absoluteDate) throws PropagationException 
		{		
    		// Nothing to do.
		}

        /** {@inheritDoc} */

        public void handleStep(org.orekit.propagation.SpacecraftState currentState, boolean isLast) throws PropagationException 
        {
            try 
            {
            	// Checks that the state falls inside the specified range.
            	Date currentDate = EarthOrbitFacade.INSTANCE.createDate(currentState.getDate());
				if(currentDate.getTime() >= startDate.getTime() && endDate.getTime() >= currentDate.getTime())
				{
	                // compute sub-satellite track=
	                AbsoluteDate  date    = currentState.getDate();
	                PVCoordinates pvInert = currentState.getPVCoordinates();
	                Transform     t       = currentState.getFrame().getTransformTo(earth.getBodyFrame(), date);
	                Vector3D      p       = t.transformPosition(pvInert.getPosition());
	                Vector3D      v       = t.transformVector(pvInert.getVelocity());
	                	                
	                
	                // Computes center line.
	                Vector3D      nadir      = p.normalize().negate();	                	               
	                Line          centerLine   = new Line(p, new Vector3D(0,0,0));
	                GeodeticPoint centerPoint = earth.getIntersectionPoint(centerLine, p, earth.getBodyFrame(), date);
	
	                // Computes the cross track vector (perpendicular to both p and velocity)
	                Vector3D      crossTrack = p.crossProduct(v).normalize();
	                
	                // Computes the left earth center angle.
	                double r = p.getNorm();
	                	              
	                // Compute left corridor.
	                double deltaR = Math.cos(leftSwathAngle) * r;
	                double deltaC = Math.sin(leftSwathAngle) * r;	                
	                Line  leftLine   = new Line(p, new Vector3D(1.0, p, deltaR, nadir, deltaC, crossTrack));	              
	                GeodeticPoint left = earth.getIntersectionPoint(leftLine, p, earth.getBodyFrame(), date);
	                	                
	                // Computes right corridor.
	                deltaR = Math.cos(rightSwathAngle) * r;
	                deltaC = Math.sin(rightSwathAngle) * r;	    
	                Line rightLine  = new Line(p, new Vector3D(1.0, p, deltaR, nadir, -deltaC, crossTrack));	                
	                GeodeticPoint right = earth.getIntersectionPoint(rightLine, p, earth.getBodyFrame(), date);	                      	                        
	                                                
	                // add the corridor points
	                corridor.add(new CorridorPoint(date, left, centerPoint, right));
				}
            } 
            catch (OrekitException oe) 
            {
                throw new PropagationException(oe);
            }
        }

        /** 
         * Get the corridor.
         * @return build corridor
         */
        public List<CorridorPoint> getCorridor() 
        {
            return corridor;
        }
    }

    /** 
     * Container for corridor points. 
     * @see https://www.orekit.org/projects/orekit/repository/revisions/6a1957016f90fe88ed77f72538bf66f9118c1f96/entry/src/tutorials/java/fr/cs/examples/propagation/TrackCorridor.java
     */

    private static class CorridorPoint 
    {

        /** Point date. */
        private final AbsoluteDate date;

        /** Left limit. */
        private final GeodeticPoint left;

        /** Central track point. */

        private final GeodeticPoint center;

        /** Right limit. */

        private final GeodeticPoint right;

        /** Simple constructor.

         * @param date point date

         * @param left left limit

         * @param center central track point

         * @param right right limit

         */

        public CorridorPoint(AbsoluteDate date, GeodeticPoint left, GeodeticPoint center, GeodeticPoint right)
        {
            this.date   = date;
            this.left   = left;
            this.center = center;
            this.right  = right;

        }

        /** Get point date. */

        public AbsoluteDate getDate() 
        {
            return date;
        }

        /** Get left limit. */

        public GeodeticPoint getLeft() 
        {
            return left;
        }

        /** Get central track point. */

        public GeodeticPoint getCenter() 
        {
            return center;
        }

        /** Get right limit. */

        public GeodeticPoint getRight() 
        {
            return right;
        }
    }
} //SpacecraftSwathCorridorImpl
