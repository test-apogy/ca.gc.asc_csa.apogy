/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui.impl;

import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.layers.RenderableLayer;
import gov.nasa.worldwind.render.BasicShapeAttributes;
import gov.nasa.worldwind.render.Material;
import gov.nasa.worldwind.render.Polyline;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;
import org.eclipse.symphony.core.environment.orbit.earth.CorridorPoint;
import org.eclipse.symphony.core.environment.orbit.earth.SpacecraftSwathCorridor;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentFactory;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage;
import org.eclipse.symphony.core.environment.orbit.earth.ui.utils.WorldWindUtils;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.Timed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spacecraft Swath World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl#getTimeSource <em>Time Source</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl#getForwardPropagationDuration <em>Forward Propagation Duration</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl#getBackwardPropagationDuration <em>Backward Propagation Duration</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl#getLeftSwathAngle <em>Left Swath Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl#getRightSwathAngle <em>Right Swath Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl#isShowGroundTrace <em>Show Ground Trace</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl#getForwardSpacecraftSwathCorridor <em>Forward Spacecraft Swath Corridor</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl#getBackwardSpacecraftSwathCorridor <em>Backward Spacecraft Swath Corridor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpacecraftSwathWorldWindLayerImpl extends AbstractWorldWindLayerImpl implements SpacecraftSwathWorldWindLayer 
{
	public static final short GROUND_TRACE_STIPPLE_PATTERN = 0x00FF;
	public static final int GROUND_TRACE_STIPPLE_FACTOR = 1;	
	private Adapter timedAdapter = null;
	
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
	 * The cached value of the '{@link #getTimeSource() <em>Time Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSource()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.symphony.common.emf.Timed timeSource;

	/**
	 * The default value of the '{@link #getForwardPropagationDuration() <em>Forward Propagation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardPropagationDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double FORWARD_PROPAGATION_DURATION_EDEFAULT = 43200.0;

	/**
	 * The cached value of the '{@link #getForwardPropagationDuration() <em>Forward Propagation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardPropagationDuration()
	 * @generated
	 * @ordered
	 */
	protected double forwardPropagationDuration = FORWARD_PROPAGATION_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackwardPropagationDuration() <em>Backward Propagation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackwardPropagationDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double BACKWARD_PROPAGATION_DURATION_EDEFAULT = 43200.0;

	/**
	 * The cached value of the '{@link #getBackwardPropagationDuration() <em>Backward Propagation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackwardPropagationDuration()
	 * @generated
	 * @ordered
	 */
	protected double backwardPropagationDuration = BACKWARD_PROPAGATION_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_INTERVAL_EDEFAULT = 600.0;

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
	 * The default value of the '{@link #isShowGroundTrace() <em>Show Ground Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowGroundTrace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_GROUND_TRACE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isShowGroundTrace() <em>Show Ground Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowGroundTrace()
	 * @generated
	 * @ordered
	 */
	protected boolean showGroundTrace = SHOW_GROUND_TRACE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getForwardSpacecraftSwathCorridor() <em>Forward Spacecraft Swath Corridor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardSpacecraftSwathCorridor()
	 * @generated
	 * @ordered
	 */
	protected SpacecraftSwathCorridor forwardSpacecraftSwathCorridor;

	/**
	 * The cached value of the '{@link #getBackwardSpacecraftSwathCorridor() <em>Backward Spacecraft Swath Corridor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackwardSpacecraftSwathCorridor()
	 * @generated
	 * @ordered
	 */
	protected SpacecraftSwathCorridor backwardSpacecraftSwathCorridor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftSwathWorldWindLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentUIPackage.Literals.SPACECRAFT_SWATH_WORLD_WIND_LAYER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__ORBIT_MODEL, oldOrbitModel, orbitModel));
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
	 * @generated_NOT
	 */
	public void setOrbitModel(OrbitModel newOrbitModel)
	{
		setOrbitModelGen(newOrbitModel);
		
		// Update renderableLayer.
		if (isAutoUpdateEnabled()) update();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrbitModelGen(OrbitModel newOrbitModel) {
		OrbitModel oldOrbitModel = orbitModel;
		orbitModel = newOrbitModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__ORBIT_MODEL, oldOrbitModel, orbitModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.symphony.common.emf.Timed getTimeSource() {
		if (timeSource != null && timeSource.eIsProxy()) {
			InternalEObject oldTimeSource = (InternalEObject)timeSource;
			timeSource = (org.eclipse.symphony.common.emf.Timed)eResolveProxy(oldTimeSource);
			if (timeSource != oldTimeSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_SOURCE, oldTimeSource, timeSource));
			}
		}
		return timeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.symphony.common.emf.Timed basicGetTimeSource() {
		return timeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSource(org.eclipse.symphony.common.emf.Timed newTimeSource) {
		org.eclipse.symphony.common.emf.Timed oldTimeSource = timeSource;
		timeSource = newTimeSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_SOURCE, oldTimeSource, timeSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setTimeSource(Timed newTimeSource)
	{
		// Unregister from previous timed if applicable.
		if(timeSource != null)
		{
			timeSource.eAdapters().remove(getTimedAdapter());
		}
		
		// Updates timesource
		setTimeSourceGen(newTimeSource);
		
		// Register to new timed if applicable.
		if(newTimeSource != null)
		{
			if (isAutoUpdateEnabled()) update();
			
			newTimeSource.eAdapters().add(getTimedAdapter());
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getForwardPropagationDuration() {
		return forwardPropagationDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setForwardPropagationDuration(double newForwardPropagationDuration)
	{
		setForwardPropagationDurationGen(newForwardPropagationDuration);
		
		// Update renderableLayer.
		if (isAutoUpdateEnabled()) update();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardPropagationDurationGen(double newForwardPropagationDuration) {
		double oldForwardPropagationDuration = forwardPropagationDuration;
		forwardPropagationDuration = newForwardPropagationDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION, oldForwardPropagationDuration, forwardPropagationDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBackwardPropagationDuration() {
		return backwardPropagationDuration;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setBackwardPropagationDuration(double newBackwardPropagationDuration) 
	{
		setBackwardPropagationDurationGen(newBackwardPropagationDuration);
		
		// Update renderableLayer.
		if (isAutoUpdateEnabled()) update();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackwardPropagationDurationGen(double newBackwardPropagationDuration) {
		double oldBackwardPropagationDuration = backwardPropagationDuration;
		backwardPropagationDuration = newBackwardPropagationDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION, oldBackwardPropagationDuration, backwardPropagationDuration));
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
	 * @generated_NOT
	 */
	public void setTimeInterval(double newTimeInterval)
	{
		setTimeIntervalGen(newTimeInterval);
		
		if (isAutoUpdateEnabled()) update();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeIntervalGen(double newTimeInterval) {
		double oldTimeInterval = timeInterval;
		timeInterval = newTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_INTERVAL, oldTimeInterval, timeInterval));
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
	 * @generated_NOT
	 */
	public void setLeftSwathAngle(double newLeftSwathAngle)
	{
		setLeftSwathAngleGen(newLeftSwathAngle);
		
		if (isAutoUpdateEnabled()) update();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftSwathAngleGen(double newLeftSwathAngle) {
		double oldLeftSwathAngle = leftSwathAngle;
		leftSwathAngle = newLeftSwathAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__LEFT_SWATH_ANGLE, oldLeftSwathAngle, leftSwathAngle));
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
	 * @generated_NOT
	 */
	public void setRightSwathAngle(double newRightSwathAngle)
	{
		setRightSwathAngleGen(newRightSwathAngle);
		
		if (isAutoUpdateEnabled()) update();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightSwathAngleGen(double newRightSwathAngle) {
		double oldRightSwathAngle = rightSwathAngle;
		rightSwathAngle = newRightSwathAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__RIGHT_SWATH_ANGLE, oldRightSwathAngle, rightSwathAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowGroundTrace() {
		return showGroundTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setShowGroundTrace(boolean newShowGroundTrace) 
	{
		setShowGroundTraceGen(newShowGroundTrace);	
		
		if (isAutoUpdateEnabled()) update();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowGroundTraceGen(boolean newShowGroundTrace) {
		boolean oldShowGroundTrace = showGroundTrace;
		showGroundTrace = newShowGroundTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__SHOW_GROUND_TRACE, oldShowGroundTrace, showGroundTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftSwathCorridor getForwardSpacecraftSwathCorridor() {
		return forwardSpacecraftSwathCorridor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForwardSpacecraftSwathCorridor(SpacecraftSwathCorridor newForwardSpacecraftSwathCorridor, NotificationChain msgs) {
		SpacecraftSwathCorridor oldForwardSpacecraftSwathCorridor = forwardSpacecraftSwathCorridor;
		forwardSpacecraftSwathCorridor = newForwardSpacecraftSwathCorridor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR, oldForwardSpacecraftSwathCorridor, newForwardSpacecraftSwathCorridor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardSpacecraftSwathCorridor(SpacecraftSwathCorridor newForwardSpacecraftSwathCorridor) {
		if (newForwardSpacecraftSwathCorridor != forwardSpacecraftSwathCorridor) {
			NotificationChain msgs = null;
			if (forwardSpacecraftSwathCorridor != null)
				msgs = ((InternalEObject)forwardSpacecraftSwathCorridor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR, null, msgs);
			if (newForwardSpacecraftSwathCorridor != null)
				msgs = ((InternalEObject)newForwardSpacecraftSwathCorridor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR, null, msgs);
			msgs = basicSetForwardSpacecraftSwathCorridor(newForwardSpacecraftSwathCorridor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR, newForwardSpacecraftSwathCorridor, newForwardSpacecraftSwathCorridor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftSwathCorridor getBackwardSpacecraftSwathCorridor() {
		return backwardSpacecraftSwathCorridor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackwardSpacecraftSwathCorridor(SpacecraftSwathCorridor newBackwardSpacecraftSwathCorridor, NotificationChain msgs) {
		SpacecraftSwathCorridor oldBackwardSpacecraftSwathCorridor = backwardSpacecraftSwathCorridor;
		backwardSpacecraftSwathCorridor = newBackwardSpacecraftSwathCorridor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR, oldBackwardSpacecraftSwathCorridor, newBackwardSpacecraftSwathCorridor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackwardSpacecraftSwathCorridor(SpacecraftSwathCorridor newBackwardSpacecraftSwathCorridor) {
		if (newBackwardSpacecraftSwathCorridor != backwardSpacecraftSwathCorridor) {
			NotificationChain msgs = null;
			if (backwardSpacecraftSwathCorridor != null)
				msgs = ((InternalEObject)backwardSpacecraftSwathCorridor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR, null, msgs);
			if (newBackwardSpacecraftSwathCorridor != null)
				msgs = ((InternalEObject)newBackwardSpacecraftSwathCorridor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR, null, msgs);
			msgs = basicSetBackwardSpacecraftSwathCorridor(newBackwardSpacecraftSwathCorridor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR, newBackwardSpacecraftSwathCorridor, newBackwardSpacecraftSwathCorridor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR:
				return basicSetForwardSpacecraftSwathCorridor(null, msgs);
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR:
				return basicSetBackwardSpacecraftSwathCorridor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__ORBIT_MODEL:
				if (resolve) return getOrbitModel();
				return basicGetOrbitModel();
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_SOURCE:
				if (resolve) return getTimeSource();
				return basicGetTimeSource();
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION:
				return getForwardPropagationDuration();
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION:
				return getBackwardPropagationDuration();
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_INTERVAL:
				return getTimeInterval();
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__LEFT_SWATH_ANGLE:
				return getLeftSwathAngle();
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__RIGHT_SWATH_ANGLE:
				return getRightSwathAngle();
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__SHOW_GROUND_TRACE:
				return isShowGroundTrace();
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR:
				return getForwardSpacecraftSwathCorridor();
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR:
				return getBackwardSpacecraftSwathCorridor();
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
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__ORBIT_MODEL:
				setOrbitModel((OrbitModel)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_SOURCE:
				setTimeSource((org.eclipse.symphony.common.emf.Timed)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION:
				setForwardPropagationDuration((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION:
				setBackwardPropagationDuration((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_INTERVAL:
				setTimeInterval((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__LEFT_SWATH_ANGLE:
				setLeftSwathAngle((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__RIGHT_SWATH_ANGLE:
				setRightSwathAngle((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__SHOW_GROUND_TRACE:
				setShowGroundTrace((Boolean)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR:
				setForwardSpacecraftSwathCorridor((SpacecraftSwathCorridor)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR:
				setBackwardSpacecraftSwathCorridor((SpacecraftSwathCorridor)newValue);
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
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__ORBIT_MODEL:
				setOrbitModel((OrbitModel)null);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_SOURCE:
				setTimeSource((org.eclipse.symphony.common.emf.Timed)null);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION:
				setForwardPropagationDuration(FORWARD_PROPAGATION_DURATION_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION:
				setBackwardPropagationDuration(BACKWARD_PROPAGATION_DURATION_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_INTERVAL:
				setTimeInterval(TIME_INTERVAL_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__LEFT_SWATH_ANGLE:
				setLeftSwathAngle(LEFT_SWATH_ANGLE_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__RIGHT_SWATH_ANGLE:
				setRightSwathAngle(RIGHT_SWATH_ANGLE_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__SHOW_GROUND_TRACE:
				setShowGroundTrace(SHOW_GROUND_TRACE_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR:
				setForwardSpacecraftSwathCorridor((SpacecraftSwathCorridor)null);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR:
				setBackwardSpacecraftSwathCorridor((SpacecraftSwathCorridor)null);
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
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__ORBIT_MODEL:
				return orbitModel != null;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_SOURCE:
				return timeSource != null;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION:
				return forwardPropagationDuration != FORWARD_PROPAGATION_DURATION_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION:
				return backwardPropagationDuration != BACKWARD_PROPAGATION_DURATION_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_INTERVAL:
				return timeInterval != TIME_INTERVAL_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__LEFT_SWATH_ANGLE:
				return leftSwathAngle != LEFT_SWATH_ANGLE_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__RIGHT_SWATH_ANGLE:
				return rightSwathAngle != RIGHT_SWATH_ANGLE_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__SHOW_GROUND_TRACE:
				return showGroundTrace != SHOW_GROUND_TRACE_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR:
				return forwardSpacecraftSwathCorridor != null;
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR:
				return backwardSpacecraftSwathCorridor != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (forwardPropagationDuration: ");
		result.append(forwardPropagationDuration);
		result.append(", backwardPropagationDuration: ");
		result.append(backwardPropagationDuration);
		result.append(", timeInterval: ");
		result.append(timeInterval);
		result.append(", leftSwathAngle: ");
		result.append(leftSwathAngle);
		result.append(", rightSwathAngle: ");
		result.append(rightSwathAngle);
		result.append(", showGroundTrace: ");
		result.append(showGroundTrace);
		result.append(')');
		return result.toString();
	}

	@Override
	protected void updateRenderableLayer() 
	{
		if(!isUpdating())
		{
			setUpdating(true);
			
			RenderableLayer layer = getRenderableLayer();
			layer.removeAllRenderables();
			
			Job job = new Job("SpacecraftSwathWorldWindLayer updateRenderableLayer")
			{
				@Override
				protected IStatus run(IProgressMonitor monitor) 
				{
					monitor.beginTask("Update", 2);
					
					try
					{
						if(getOrbitModel() != null && getTimeSource() != null && isVisible())
						{					
							// Generate backward orbit.
							if(getBackwardPropagationDuration() > 0)
							{						
								// Reset backward SpacecraftSwathCorridor.
								setBackwardSpacecraftSwathCorridor(null);
								
								long duration =  Math.round(getBackwardPropagationDuration() * 1000.0);
								Date startDate = new Date(getTimeSource().getTime().getTime() - duration);
								Date endDate = getTimeSource().getTime();	
								
								System.out.println("Backward ----------------");
								System.out.println("Start Time : "   + startDate);
								System.out.println("End Time : "      + endDate);
								System.out.println("Duration (s) : "  + duration * 0.001);
								
								SpacecraftSwathCorridor spacecraftSwathCorridor = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createSpacecraftSwathCorridor();
								spacecraftSwathCorridor.setStartTime(startDate);
								spacecraftSwathCorridor.setEndTime(endDate);
								spacecraftSwathCorridor.setOrbitModel(getOrbitModel());
								spacecraftSwathCorridor.setTimeInterval(getTimeInterval());
								spacecraftSwathCorridor.setLeftSwathAngle(getLeftSwathAngle());
								spacecraftSwathCorridor.setRightSwathAngle(getRightSwathAngle());
								
								// Forces the corridor to update.
								spacecraftSwathCorridor.update();
								
								System.out.println("Backward " + spacecraftSwathCorridor.getCorridor());
								
								// If the ground trace is to be showed.
								if(isShowGroundTrace())
								{
									// Gets the displayed corridor.								
									List<GeographicCoordinates> center =  new ArrayList<GeographicCoordinates>();
									for(CorridorPoint p : spacecraftSwathCorridor.getCorridor().getPoints())
									{							
										
										center.add(p.getCenter());									
									}
									
									List<Polyline> centerPolylines = WorldWindUtils.createPolyLineFromGeographicCoordinatesListNoWrapAround(center);
									for(Polyline line : centerPolylines)
									{
										line.setColor(Color.YELLOW);
										line.setFollowTerrain(true);										
										line.setStippleFactor(GROUND_TRACE_STIPPLE_FACTOR);
										line.setStipplePattern(GROUND_TRACE_STIPPLE_PATTERN);
										layer.addRenderable(line);
									}
								}
																
								
								// Create polygons showing the swath.
								List<gov.nasa.worldwind.render.ExtrudedPolygon> polygons = WorldWindUtils.createExtrudedPolygons(spacecraftSwathCorridor.getCorridor(), 5000.0);												
								
								BasicShapeAttributes attributes = new BasicShapeAttributes();
								attributes.setDrawOutline(false);
								Material outlineMat = new Material(new Color(1, 1, 0, 0.2f));
								attributes.setOutlineMaterial(outlineMat);
								attributes.setOutlineOpacity(0.2);
								
								Material interiorMat = new Material(new Color(1f, 1f, 0, 0.2f));
								attributes.setInteriorMaterial(interiorMat);
								attributes.setInteriorOpacity(0.2f);						
								
								for(gov.nasa.worldwind.render.ExtrudedPolygon polygon : polygons)
								{
									polygon.setAttributes(attributes);							
									layer.addRenderable(polygon);
								}						
								
								// Update the backward SpacecraftSwathCorridor.
								setBackwardSpacecraftSwathCorridor(spacecraftSwathCorridor);
							}							
							monitor.worked(1);
							
							// Generate forward orbit.
							if(getForwardPropagationDuration() > 0)
							{
								// Reset forward SpacecraftSwathCorridor.
								setForwardSpacecraftSwathCorridor(null);
								
								long duration =  Math.round(getForwardPropagationDuration() * 1000.0);
								Date startDate = getTimeSource().getTime();										
								Date endDate = new Date(getTimeSource().getTime().getTime() + duration);	
								
								SpacecraftSwathCorridor spacecraftSwathCorridor = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createSpacecraftSwathCorridor();
								spacecraftSwathCorridor.setStartTime(startDate);
								spacecraftSwathCorridor.setEndTime(endDate);
								spacecraftSwathCorridor.setOrbitModel(getOrbitModel());
								spacecraftSwathCorridor.setTimeInterval(getTimeInterval());
								spacecraftSwathCorridor.setLeftSwathAngle(getLeftSwathAngle());
								spacecraftSwathCorridor.setRightSwathAngle(getRightSwathAngle());
								
								// Forces the corridor to update.
								spacecraftSwathCorridor.update();
								
								System.out.println("Forward " + spacecraftSwathCorridor.getCorridor());
								
								// If the ground trace is to be showed.
								if(isShowGroundTrace())
								{
									// Gets the displayed corridor.								
									List<GeographicCoordinates> center =  new ArrayList<GeographicCoordinates>();
									for(CorridorPoint p : spacecraftSwathCorridor.getCorridor().getPoints())
									{							
										
										center.add(p.getCenter());									
									}
									
									List<Polyline> centerPolylines = WorldWindUtils.createPolyLineFromGeographicCoordinatesListNoWrapAround(center);
									for(Polyline line : centerPolylines)
									{
										line.setColor(Color.RED);											
										line.setFollowTerrain(true);										
										line.setStippleFactor(GROUND_TRACE_STIPPLE_FACTOR);
										line.setStipplePattern(GROUND_TRACE_STIPPLE_PATTERN);
										layer.addRenderable(line);
										layer.addRenderable(line);
									}
								}
								
								// Gets the displayed corridor.					
								List<gov.nasa.worldwind.render.ExtrudedPolygon> polygons = WorldWindUtils.createExtrudedPolygons(spacecraftSwathCorridor.getCorridor(), 5000.0);												
								
								BasicShapeAttributes attributes = new BasicShapeAttributes();
								attributes.setDrawOutline(false);
								Material outlineMat = new Material(new Color(1, 0, 0, 0.2f));
								attributes.setOutlineMaterial(outlineMat);
								attributes.setOutlineOpacity(0.2f);
								
								Material interiorMat = new Material(new Color(1f, 0, 0, 0.2f));
								attributes.setInteriorMaterial(interiorMat);
								attributes.setInteriorOpacity(0.2f);						
								
								for(gov.nasa.worldwind.render.ExtrudedPolygon polygon : polygons)
								{
									polygon.setAttributes(attributes);							
									layer.addRenderable(polygon);
								}						
								
								// Update the forward SpacecraftSwathCorridor.
								setForwardSpacecraftSwathCorridor(spacecraftSwathCorridor);
							}
							monitor.worked(1);
							monitor.done();
						}	
					}
					catch(Exception e)
					{
						e.printStackTrace();				
					}
					
					// Force layer to update.
					getRenderableLayer().firePropertyChange(AVKey.LAYER, null, this);
					
					setUpdating(false);
					return Status.OK_STATUS;
				}
			};
			job.schedule();								
		}		
	}		
	
	protected Adapter getTimedAdapter() 
	{
		if(timedAdapter == null)
		{
			timedAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{				
					if(msg.getNotifier() instanceof Timed)
					{
						int featureId = msg.getFeatureID(Timed.class);
						
						switch (featureId) 
						{
							case EMFEcorePackage.TIMED__TIME:
								if(isAutoUpdateEnabled()) updateRenderableLayer();
							break;

							default:
							break;
						}
					}						
				}
			};
		}
		return timedAdapter;
	}
} //SpacecraftSwathWorldWindLayerImpl
