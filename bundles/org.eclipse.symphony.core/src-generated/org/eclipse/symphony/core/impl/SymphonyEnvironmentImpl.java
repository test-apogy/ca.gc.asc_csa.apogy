/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.TimeSource;
import org.eclipse.symphony.common.emf.TimeSourcesList;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.core.AbstractWorksite;
import org.eclipse.symphony.core.SymphonyCoreFactory;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.SymphonyTopology;
import org.eclipse.symphony.core.WorksitesList;
import org.eclipse.symphony.core.invocator.impl.EnvironmentImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Symphony Environment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.SymphonyEnvironmentImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.SymphonyEnvironmentImpl#getWorksitesList <em>Worksites List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.SymphonyEnvironmentImpl#getActiveWorksite <em>Active Worksite</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.SymphonyEnvironmentImpl#getSymphonyTopology <em>Symphony Topology</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.SymphonyEnvironmentImpl#getTimeSourcesList <em>Time Sources List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.SymphonyEnvironmentImpl#getActiveTimeSource <em>Active Time Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymphonyEnvironmentImpl extends EnvironmentImpl implements
		SymphonyEnvironment {
	
	private Adapter timeSourceAdapter = null;
	
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorksitesList() <em>Worksites List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorksitesList()
	 * @generated
	 * @ordered
	 */
	protected WorksitesList worksitesList;

	/**
	 * The cached value of the '{@link #getActiveWorksite() <em>Active Worksite</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getActiveWorksite()
	 * @generated
	 * @ordered
	 */
	protected AbstractWorksite activeWorksite;

	/**
	 * The cached value of the '{@link #getSymphonyTopology() <em>Symphony Topology</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSymphonyTopology()
	 * @generated
	 * @ordered
	 */
	protected SymphonyTopology symphonyTopology;

	/**
	 * The cached value of the '{@link #getTimeSourcesList() <em>Time Sources List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSourcesList()
	 * @generated
	 * @ordered
	 */
	protected TimeSourcesList timeSourcesList;

	/**
	 * The cached value of the '{@link #getActiveTimeSource() <em>Active Time Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveTimeSource()
	 * @generated
	 * @ordered
	 */
	protected TimeSource activeTimeSource;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SymphonyEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCorePackage.Literals.SYMPHONY_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setTime(Date newTime) 
	{		
		if(getActiveWorksite() != null)
		{
			getActiveWorksite().setTime(newTime);
		}
		
		setTimeGen(newTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeGen(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public WorksitesList getWorksitesList() {
		return worksitesList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorksitesList(
			WorksitesList newWorksitesList, NotificationChain msgs) {
		WorksitesList oldWorksitesList = worksitesList;
		worksitesList = newWorksitesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.SYMPHONY_ENVIRONMENT__WORKSITES_LIST, oldWorksitesList, newWorksitesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorksitesList(WorksitesList newWorksitesList) {
		if (newWorksitesList != worksitesList) {
			NotificationChain msgs = null;
			if (worksitesList != null)
				msgs = ((InternalEObject)worksitesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyCorePackage.SYMPHONY_ENVIRONMENT__WORKSITES_LIST, null, msgs);
			if (newWorksitesList != null)
				msgs = ((InternalEObject)newWorksitesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyCorePackage.SYMPHONY_ENVIRONMENT__WORKSITES_LIST, null, msgs);
			msgs = basicSetWorksitesList(newWorksitesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.SYMPHONY_ENVIRONMENT__WORKSITES_LIST, newWorksitesList, newWorksitesList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractWorksite getActiveWorksite() {
		if (activeWorksite != null && activeWorksite.eIsProxy()) {
			InternalEObject oldActiveWorksite = (InternalEObject)activeWorksite;
			activeWorksite = (AbstractWorksite)eResolveProxy(oldActiveWorksite);
			if (activeWorksite != oldActiveWorksite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_WORKSITE, oldActiveWorksite, activeWorksite));
			}
		}
		return activeWorksite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractWorksite basicGetActiveWorksite() {
		return activeWorksite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveWorksite(AbstractWorksite newActiveWorksite) {
		AbstractWorksite oldActiveWorksite = activeWorksite;
		activeWorksite = newActiveWorksite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_WORKSITE, oldActiveWorksite, activeWorksite));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public SymphonyTopology getSymphonyTopology() {
		SymphonyTopology tmp = getSymphonyTopologyGen();
		if (tmp == null) {
			tmp = SymphonyCoreFactory.eINSTANCE.createSymphonyTopology();
			setSymphonyTopology(tmp);
		}

		return tmp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyTopology getSymphonyTopologyGen() {
		if (symphonyTopology != null && symphonyTopology.eIsProxy()) {
			InternalEObject oldSymphonyTopology = (InternalEObject)symphonyTopology;
			symphonyTopology = (SymphonyTopology)eResolveProxy(oldSymphonyTopology);
			if (symphonyTopology != oldSymphonyTopology) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyCorePackage.SYMPHONY_ENVIRONMENT__SYMPHONY_TOPOLOGY, oldSymphonyTopology, symphonyTopology));
			}
		}
		return symphonyTopology;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyTopology basicGetSymphonyTopology() {
		return symphonyTopology;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymphonyTopology(SymphonyTopology newSymphonyTopology) {
		SymphonyTopology oldSymphonyTopology = symphonyTopology;
		symphonyTopology = newSymphonyTopology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.SYMPHONY_ENVIRONMENT__SYMPHONY_TOPOLOGY, oldSymphonyTopology, symphonyTopology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSourcesList getTimeSourcesList() {
		return timeSourcesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSourcesList(TimeSourcesList newTimeSourcesList, NotificationChain msgs) {
		TimeSourcesList oldTimeSourcesList = timeSourcesList;
		timeSourcesList = newTimeSourcesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST, oldTimeSourcesList, newTimeSourcesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSourcesList(TimeSourcesList newTimeSourcesList) {
		if (newTimeSourcesList != timeSourcesList) {
			NotificationChain msgs = null;
			if (timeSourcesList != null)
				msgs = ((InternalEObject)timeSourcesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST, null, msgs);
			if (newTimeSourcesList != null)
				msgs = ((InternalEObject)newTimeSourcesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST, null, msgs);
			msgs = basicSetTimeSourcesList(newTimeSourcesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST, newTimeSourcesList, newTimeSourcesList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSource getActiveTimeSource() {
		if (activeTimeSource != null && activeTimeSource.eIsProxy()) {
			InternalEObject oldActiveTimeSource = (InternalEObject)activeTimeSource;
			activeTimeSource = (TimeSource)eResolveProxy(oldActiveTimeSource);
			if (activeTimeSource != oldActiveTimeSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_TIME_SOURCE, oldActiveTimeSource, activeTimeSource));
			}
		}
		return activeTimeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSource basicGetActiveTimeSource() {
		return activeTimeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setActiveTimeSource(TimeSource newActiveTimeSource)
	{
		if(activeTimeSource != null)
		{
			activeTimeSource.eAdapters().remove(getTimeSourceAdapter());
		}
		
		if(newActiveTimeSource != null)
		{
			newActiveTimeSource.eAdapters().add(getTimeSourceAdapter());
			setTime(newActiveTimeSource.getTime());
		}
		
		setActiveTimeSourceGen(newActiveTimeSource);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveTimeSourceGen(TimeSource newActiveTimeSource) {
		TimeSource oldActiveTimeSource = activeTimeSource;
		activeTimeSource = newActiveTimeSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_TIME_SOURCE, oldActiveTimeSource, activeTimeSource));
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__WORKSITES_LIST:
				return basicSetWorksitesList(null, msgs);
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST:
				return basicSetTimeSourcesList(null, msgs);
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
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME:
				return getTime();
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__WORKSITES_LIST:
				return getWorksitesList();
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_WORKSITE:
				if (resolve) return getActiveWorksite();
				return basicGetActiveWorksite();
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__SYMPHONY_TOPOLOGY:
				if (resolve) return getSymphonyTopology();
				return basicGetSymphonyTopology();
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST:
				return getTimeSourcesList();
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_TIME_SOURCE:
				if (resolve) return getActiveTimeSource();
				return basicGetActiveTimeSource();
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
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME:
				setTime((Date)newValue);
				return;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__WORKSITES_LIST:
				setWorksitesList((WorksitesList)newValue);
				return;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_WORKSITE:
				setActiveWorksite((AbstractWorksite)newValue);
				return;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__SYMPHONY_TOPOLOGY:
				setSymphonyTopology((SymphonyTopology)newValue);
				return;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST:
				setTimeSourcesList((TimeSourcesList)newValue);
				return;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_TIME_SOURCE:
				setActiveTimeSource((TimeSource)newValue);
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
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__WORKSITES_LIST:
				setWorksitesList((WorksitesList)null);
				return;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_WORKSITE:
				setActiveWorksite((AbstractWorksite)null);
				return;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__SYMPHONY_TOPOLOGY:
				setSymphonyTopology((SymphonyTopology)null);
				return;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST:
				setTimeSourcesList((TimeSourcesList)null);
				return;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_TIME_SOURCE:
				setActiveTimeSource((TimeSource)null);
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
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__WORKSITES_LIST:
				return worksitesList != null;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_WORKSITE:
				return activeWorksite != null;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__SYMPHONY_TOPOLOGY:
				return symphonyTopology != null;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST:
				return timeSourcesList != null;
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_TIME_SOURCE:
				return activeTimeSource != null;
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
		if (baseClass == Timed.class) {
			switch (derivedFeatureID) {
				case SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME: return EMFEcorePackage.TIMED__TIME;
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
		if (baseClass == Timed.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.TIMED__TIME: return SymphonyCorePackage.SYMPHONY_ENVIRONMENT__TIME;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

	private Adapter getTimeSourceAdapter()
	{
		if(timeSourceAdapter == null)
		{
			timeSourceAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof TimeSource)
					{
						int featureId = msg.getFeatureID(TimeSource.class);
						
						if(featureId == EMFEcorePackage.TIMED__TIME)
						{
							if(msg.getNewValue() instanceof Date)
							{
								Date newDate = (Date) msg.getNewValue();
								setTime(new Date(newDate.getTime()));
							}
						}
					}
				}
			};
		}
		
		return timeSourceAdapter;
	}
} // SymphonyEnvironmentImpl
