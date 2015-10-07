/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.Updatable;
import org.eclipse.symphony.core.environment.orbit.earth.Activator;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.earth.GroundStation;
import org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.symphony.environment.orbit.OrbitModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spacecrafts Visibility Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl#isUpdating <em>Updating</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl#isAutoUpdateEnabled <em>Auto Update Enabled</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl#getOrbitModels <em>Orbit Models</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl#getGroundStations <em>Ground Stations</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl#getPasses <em>Passes</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl#getGroundStationToVisibilityMap <em>Ground Station To Visibility Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpacecraftsVisibilitySetImpl extends MinimalEObjectImpl.Container implements SpacecraftsVisibilitySet 
{
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
	 * @generated_NOT
	 * @ordered
	 */
	protected boolean autoUpdateEnabled = getDefaultAutoUpdateEnabled();

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
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
	 * @generated_NOT
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
	 * The cached value of the '{@link #getOrbitModels() <em>Orbit Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitModels()
	 * @generated
	 * @ordered
	 */
	protected EList<OrbitModel> orbitModels;

	/**
	 * The cached value of the '{@link #getGroundStations() <em>Ground Stations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundStations()
	 * @generated
	 * @ordered
	 */
	protected EList<GroundStation> groundStations;

	/**
	 * The cached value of the '{@link #getPasses() <em>Passes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasses()
	 * @generated
	 * @ordered
	 */
	protected EList<VisibilityPass> passes;

	/**
	 * The cached value of the '{@link #getGroundStationToVisibilityMap() <em>Ground Station To Visibility Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundStationToVisibilityMap()
	 * @generated
	 * @ordered
	 */
	protected Map<GroundStation, List<VisibilityPass>> groundStationToVisibilityMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftsVisibilitySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentPackage.Literals.SPACECRAFTS_VISIBILITY_SET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__UPDATING, oldUpdating, updating));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__AUTO_UPDATE_ENABLED, oldAutoUpdateEnabled, autoUpdateEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Date getStartTime() 
	{
		Date tmp = getStartTimeGen();
		if(tmp == null)
		{
			tmp = new Date();
			setStartTime(tmp);
		}
		
		return tmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTimeGen() {
		return startTime;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setStartTime(Date newStartTime) 
	{
		setStartTimeGen(newStartTime);
		
		if(isAutoUpdateEnabled()) update();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTimeGen(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Date getEndTime() 
	{
		Date tmp = getEndTimeGen();
		if(tmp == null)
		{
			tmp = new Date(getStartTime().getTime() + 24*60*60*1000);
			setEndTime(tmp);
			
			if(isAutoUpdateEnabled()) update();
		}
		return tmp;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndTimeGen() 
	{
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setEndTime(Date newEndTime) 
	{
		setEndTimeGen(newEndTime);
		
		if(isAutoUpdateEnabled()) update();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTimeGen(Date newEndTime) {
		Date oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrbitModel> getOrbitModels() {
		if (orbitModels == null) {
			orbitModels = new EObjectResolvingEList<OrbitModel>(OrbitModel.class, this, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__ORBIT_MODELS);
		}
		return orbitModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroundStation> getGroundStations() {
		if (groundStations == null) {
			groundStations = new EObjectResolvingEList<GroundStation>(GroundStation.class, this, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__GROUND_STATIONS);
		}
		return groundStations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisibilityPass> getPasses() {
		if (passes == null) {
			passes = new EObjectContainmentEList<VisibilityPass>(VisibilityPass.class, this, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__PASSES);
		}
		return passes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<GroundStation, List<VisibilityPass>> getGroundStationToVisibilityMap() {
		return groundStationToVisibilityMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundStationToVisibilityMap(Map<GroundStation, List<VisibilityPass>> newGroundStationToVisibilityMap) {
		Map<GroundStation, List<VisibilityPass>> oldGroundStationToVisibilityMap = groundStationToVisibilityMap;
		groundStationToVisibilityMap = newGroundStationToVisibilityMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__GROUND_STATION_TO_VISIBILITY_MAP, oldGroundStationToVisibilityMap, groundStationToVisibilityMap));
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
	 * @generated_NOT
	 */
	public synchronized void update() 
	{
		if(!isUpdating())
		{
			setUpdating(true);
			
			Job job = new  Job("SpacecraftsVisibilitySet update.")
			{
				@Override
				protected IStatus run(IProgressMonitor monitor) 
				{										
					try
					{
						monitor.beginTask("SpacecraftsVisibilitySet update.",  getGroundStations().size());
						
						List<VisibilityPass> allPasses = new ArrayList<VisibilityPass>();
						Map<GroundStation, List<VisibilityPass>> map = new HashMap<GroundStation, List<VisibilityPass>>();
						
						// For each Ground station.
						for(GroundStation groundStation : getGroundStations())
						{
							Logger.INSTANCE.log(Activator.ID, SpacecraftsVisibilitySetImpl.this, "Computing passes for GroundStation <" + groundStation.getName() + ">...", EventSeverity.INFO);
							
							// Computes the visibility of each spacecraft for the ground station.
							List<VisibilityPass> groundStationPasses = new ArrayList<VisibilityPass>();
							for(OrbitModel model : getOrbitModels())
							{
								try
								{
									if(model.getPropagator() instanceof EarthOrbitPropagator)
									{
										EarthOrbitPropagator propagator = (EarthOrbitPropagator) model.getPropagator();
										groundStationPasses.addAll(propagator.getGroundStationPasses(groundStation, getStartTime(), getEndTime()));
									}
								}
								catch(Throwable t)
								{
									t.printStackTrace();
								}
							}
							
							Logger.INSTANCE.log(Activator.ID, SpacecraftsVisibilitySetImpl.this, "Found <" + groundStationPasses.size() + "> passes for GroundStation <" + groundStation.getName() + ">.", EventSeverity.OK);							
							
							allPasses.addAll(groundStationPasses);							
							map.put(groundStation, groundStationPasses);
							
							monitor.worked(1);
						}
						
						// Updates the passes.
						getPasses().clear();
						getPasses().addAll(allPasses);
						
						// Updates the map.
						setGroundStationToVisibilityMap(map);												
					}
					catch(Throwable t)
					{
						t.printStackTrace();
					}
					setUpdating(false);
					
					return Status.OK_STATUS;
				}
			};
			job.schedule();						
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
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__PASSES:
				return ((InternalEList<?>)getPasses()).basicRemove(otherEnd, msgs);
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
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__NAME:
				return getName();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__DESCRIPTION:
				return getDescription();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__UPDATING:
				return isUpdating();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__AUTO_UPDATE_ENABLED:
				return isAutoUpdateEnabled();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__START_TIME:
				return getStartTime();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__END_TIME:
				return getEndTime();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__ORBIT_MODELS:
				return getOrbitModels();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__GROUND_STATIONS:
				return getGroundStations();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__PASSES:
				return getPasses();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__GROUND_STATION_TO_VISIBILITY_MAP:
				return getGroundStationToVisibilityMap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__NAME:
				setName((String)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__UPDATING:
				setUpdating((Boolean)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__AUTO_UPDATE_ENABLED:
				setAutoUpdateEnabled((Boolean)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__START_TIME:
				setStartTime((Date)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__END_TIME:
				setEndTime((Date)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__ORBIT_MODELS:
				getOrbitModels().clear();
				getOrbitModels().addAll((Collection<? extends OrbitModel>)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__GROUND_STATIONS:
				getGroundStations().clear();
				getGroundStations().addAll((Collection<? extends GroundStation>)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__PASSES:
				getPasses().clear();
				getPasses().addAll((Collection<? extends VisibilityPass>)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__GROUND_STATION_TO_VISIBILITY_MAP:
				setGroundStationToVisibilityMap((Map<GroundStation, List<VisibilityPass>>)newValue);
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
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__UPDATING:
				setUpdating(UPDATING_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__AUTO_UPDATE_ENABLED:
				setAutoUpdateEnabled(AUTO_UPDATE_ENABLED_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__ORBIT_MODELS:
				getOrbitModels().clear();
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__GROUND_STATIONS:
				getGroundStations().clear();
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__PASSES:
				getPasses().clear();
				return;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__GROUND_STATION_TO_VISIBILITY_MAP:
				setGroundStationToVisibilityMap((Map<GroundStation, List<VisibilityPass>>)null);
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
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__UPDATING:
				return updating != UPDATING_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__AUTO_UPDATE_ENABLED:
				return autoUpdateEnabled != AUTO_UPDATE_ENABLED_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__ORBIT_MODELS:
				return orbitModels != null && !orbitModels.isEmpty();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__GROUND_STATIONS:
				return groundStations != null && !groundStations.isEmpty();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__PASSES:
				return passes != null && !passes.isEmpty();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__GROUND_STATION_TO_VISIBILITY_MAP:
				return groundStationToVisibilityMap != null;
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
				case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Updatable.class) {
			switch (derivedFeatureID) {
				case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__UPDATING: return SymphonyCorePackage.UPDATABLE__UPDATING;
				case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__AUTO_UPDATE_ENABLED: return SymphonyCorePackage.UPDATABLE__AUTO_UPDATE_ENABLED;
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
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Updatable.class) {
			switch (baseFeatureID) {
				case SymphonyCorePackage.UPDATABLE__UPDATING: return SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__UPDATING;
				case SymphonyCorePackage.UPDATABLE__AUTO_UPDATE_ENABLED: return SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__AUTO_UPDATE_ENABLED;
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
				case SymphonyCorePackage.UPDATABLE___GET_DEFAULT_AUTO_UPDATE_ENABLED: return SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET___GET_DEFAULT_AUTO_UPDATE_ENABLED;
				case SymphonyCorePackage.UPDATABLE___UPDATE: return SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET___UPDATE;
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
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET___GET_DEFAULT_AUTO_UPDATE_ENABLED:
				return getDefaultAutoUpdateEnabled();
			case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET___UPDATE:
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
		result.append(", groundStationToVisibilityMap: ");
		result.append(groundStationToVisibilityMap);
		result.append(')');
		return result.toString();
	}

} //SpacecraftsVisibilitySetImpl
