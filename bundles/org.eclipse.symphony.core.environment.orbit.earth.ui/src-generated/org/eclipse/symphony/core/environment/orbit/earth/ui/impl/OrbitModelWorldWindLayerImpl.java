/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui.impl;

import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.layers.RenderableLayer;
import gov.nasa.worldwind.render.Polyline;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;
import org.eclipse.symphony.core.environment.orbit.SpacecraftState;
import org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage;
import org.eclipse.symphony.core.environment.orbit.earth.ui.utils.WorldWindUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orbit Model World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.OrbitModelWorldWindLayerImpl#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.OrbitModelWorldWindLayerImpl#getTimeSource <em>Time Source</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.OrbitModelWorldWindLayerImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.OrbitModelWorldWindLayerImpl#getForwardPropagationDuration <em>Forward Propagation Duration</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.OrbitModelWorldWindLayerImpl#getBackwardPropagationDuration <em>Backward Propagation Duration</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.OrbitModelWorldWindLayerImpl#isShowGroundTrace <em>Show Ground Trace</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.OrbitModelWorldWindLayerImpl#isShowOrbit <em>Show Orbit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrbitModelWorldWindLayerImpl extends AbstractWorldWindLayerImpl implements OrbitModelWorldWindLayer 
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
	 * The default value of the '{@link #isShowOrbit() <em>Show Orbit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowOrbit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_ORBIT_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isShowOrbit() <em>Show Orbit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowOrbit()
	 * @generated
	 * @ordered
	 */
	protected boolean showOrbit = SHOW_ORBIT_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrbitModelWorldWindLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentUIPackage.Literals.ORBIT_MODEL_WORLD_WIND_LAYER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__ORBIT_MODEL, oldOrbitModel, orbitModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__ORBIT_MODEL, oldOrbitModel, orbitModel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_SOURCE, oldTimeSource, timeSource));
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
	public void setTimeSourceGen(org.eclipse.symphony.common.emf.Timed newTimeSource) {
		org.eclipse.symphony.common.emf.Timed oldTimeSource = timeSource;
		timeSource = newTimeSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_SOURCE, oldTimeSource, timeSource));
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
			update();
			
			newTimeSource.eAdapters().add(getTimedAdapter());
		}
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_INTERVAL, oldTimeInterval, timeInterval));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION, oldForwardPropagationDuration, forwardPropagationDuration));
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
		if(isAutoUpdateEnabled()) updateRenderableLayer();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION, oldBackwardPropagationDuration, backwardPropagationDuration));
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
		
		if(isAutoUpdateEnabled()) updateRenderableLayer();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_GROUND_TRACE, oldShowGroundTrace, showGroundTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowOrbit() {
		return showOrbit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowOrbit(boolean newShowOrbit) {
		boolean oldShowOrbit = showOrbit;
		showOrbit = newShowOrbit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_ORBIT, oldShowOrbit, showOrbit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__ORBIT_MODEL:
				if (resolve) return getOrbitModel();
				return basicGetOrbitModel();
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_SOURCE:
				if (resolve) return getTimeSource();
				return basicGetTimeSource();
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_INTERVAL:
				return getTimeInterval();
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION:
				return getForwardPropagationDuration();
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION:
				return getBackwardPropagationDuration();
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_GROUND_TRACE:
				return isShowGroundTrace();
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_ORBIT:
				return isShowOrbit();
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
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__ORBIT_MODEL:
				setOrbitModel((OrbitModel)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_SOURCE:
				setTimeSource((org.eclipse.symphony.common.emf.Timed)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_INTERVAL:
				setTimeInterval((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION:
				setForwardPropagationDuration((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION:
				setBackwardPropagationDuration((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_GROUND_TRACE:
				setShowGroundTrace((Boolean)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_ORBIT:
				setShowOrbit((Boolean)newValue);
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
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__ORBIT_MODEL:
				setOrbitModel((OrbitModel)null);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_SOURCE:
				setTimeSource((org.eclipse.symphony.common.emf.Timed)null);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_INTERVAL:
				setTimeInterval(TIME_INTERVAL_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION:
				setForwardPropagationDuration(FORWARD_PROPAGATION_DURATION_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION:
				setBackwardPropagationDuration(BACKWARD_PROPAGATION_DURATION_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_GROUND_TRACE:
				setShowGroundTrace(SHOW_GROUND_TRACE_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_ORBIT:
				setShowOrbit(SHOW_ORBIT_EDEFAULT);
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
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__ORBIT_MODEL:
				return orbitModel != null;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_SOURCE:
				return timeSource != null;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__TIME_INTERVAL:
				return timeInterval != TIME_INTERVAL_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION:
				return forwardPropagationDuration != FORWARD_PROPAGATION_DURATION_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION:
				return backwardPropagationDuration != BACKWARD_PROPAGATION_DURATION_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_GROUND_TRACE:
				return showGroundTrace != SHOW_GROUND_TRACE_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_ORBIT:
				return showOrbit != SHOW_ORBIT_EDEFAULT;
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
		result.append(" (timeInterval: ");
		result.append(timeInterval);
		result.append(", forwardPropagationDuration: ");
		result.append(forwardPropagationDuration);
		result.append(", backwardPropagationDuration: ");
		result.append(backwardPropagationDuration);
		result.append(", showGroundTrace: ");
		result.append(showGroundTrace);
		result.append(", showOrbit: ");
		result.append(showOrbit);
		result.append(')');
		return result.toString();
	}

	@Override
	public void dispose() 
	{
		if(getTimeSource() != null) getTimeSource().eAdapters().remove(getTimedAdapter());
		
		setOrbitModel(null);
				
		super.dispose();
	}
	
	@Override
	protected void updateRenderableLayer()
	{
		if(!isUpdating())
		{
			setUpdating(true);
			RenderableLayer layer = getRenderableLayer();
			layer.removeAllRenderables();
					
			Job job = new Job("OrbitModelWorldWindLayer updateRenderableLayer")
			{
				@Override
				protected IStatus run(IProgressMonitor monitor) 
				{
					try
					{
						if(getOrbitModel() != null && getTimeSource() != null && isVisible())
						{					
							// Generate backward orbit.
							if(getBackwardPropagationDuration() > 0)
							{
								long duration =  Math.round(getBackwardPropagationDuration() * 1000.0);
								Date startDate = new Date(getTimeSource().getTime().getTime() - duration);
								Date endDate = getTimeSource().getTime();						
								List<SpacecraftState> states = getOrbitModel().getPropagator().getSpacecraftStates(startDate, endDate, getTimeInterval());
								List<Polyline> polylines = WorldWindUtils.createPolyLineWithNoWrapAround(states);	
								
								if(isShowOrbit())
								{
									for(Polyline line : polylines)
									{
										line.setColor(Color.YELLOW);	
										layer.addRenderable(line);
									}					
								}
								
								if(isShowGroundTrace())
								{
									for(Polyline line : polylines)
									{
										Polyline groundTrace = new Polyline(line.getPositions());
										groundTrace.setFollowTerrain(true);
										groundTrace.setColor(Color.YELLOW);
										groundTrace.setStippleFactor(GROUND_TRACE_STIPPLE_FACTOR);
										groundTrace.setStipplePattern(GROUND_TRACE_STIPPLE_PATTERN);
										layer.addRenderable(groundTrace);
									}	
								}
							}
							
							// Generate forward orbit.
							if(getForwardPropagationDuration() > 0)
							{
								long duration =  Math.round(getForwardPropagationDuration() * 1000.0);
								Date startDate = getTimeSource().getTime();										
								Date endDate = new Date(getTimeSource().getTime().getTime() + duration);						
								List<SpacecraftState> states = getOrbitModel().getPropagator().getSpacecraftStates(startDate, endDate, getTimeInterval());
								List<Polyline> polylines = WorldWindUtils.createPolyLineWithNoWrapAround(states);	
								
								if(isShowOrbit())
								{
									for(Polyline line : polylines)
									{
										line.setColor(Color.RED);	
										layer.addRenderable(line);
									}
								}
								
								if(isShowGroundTrace())
								{
									for(Polyline line : polylines)
									{
										Polyline groundTrace = new Polyline(line.getPositions());
										groundTrace.setFollowTerrain(true);
										groundTrace.setColor(Color.RED);
										groundTrace.setStippleFactor(GROUND_TRACE_STIPPLE_FACTOR);
										groundTrace.setStipplePattern(GROUND_TRACE_STIPPLE_PATTERN);
										layer.addRenderable(groundTrace);
									}	
								}
							}				
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
} //OrbitModelWorldWindLayerImpl
