/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationReferencesList;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlan;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList;
import ca.gc.asc_csa.apogy.examples.satellite.SatellitesList;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Constellation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationImpl#getSatellitesList <em>Satellites List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationImpl#getGroundStationsReferencesList <em>Ground Stations References List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationImpl#getDownlinksLists <em>Downlinks Lists</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationImpl#getConstellationRequestsList <em>Constellation Requests List</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractConstellationImpl extends MinimalEObjectImpl.Container implements AbstractConstellation {
	/**
	 * The cached value of the '{@link #getSatellitesList() <em>Satellites List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatellitesList()
	 * @generated
	 * @ordered
	 */
	protected SatellitesList satellitesList;

	/**
	 * The cached value of the '{@link #getGroundStationsReferencesList() <em>Ground Stations References List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundStationsReferencesList()
	 * @generated
	 * @ordered
	 */
	protected GroundStationReferencesList groundStationsReferencesList;

	/**
	 * The cached value of the '{@link #getDownlinksLists() <em>Downlinks Lists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownlinksLists()
	 * @generated
	 * @ordered
	 */
	protected ConstellationDownlinksList downlinksLists;

	/**
	 * The cached value of the '{@link #getConstellationRequestsList() <em>Constellation Requests List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationRequestsList()
	 * @generated
	 * @ordered
	 */
	protected ConstellationRequestsList constellationRequestsList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractConstellationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.ABSTRACT_CONSTELLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatellitesList getSatellitesList() {
		return satellitesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSatellitesList(SatellitesList newSatellitesList, NotificationChain msgs) {
		SatellitesList oldSatellitesList = satellitesList;
		satellitesList = newSatellitesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__SATELLITES_LIST, oldSatellitesList, newSatellitesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatellitesList(SatellitesList newSatellitesList) {
		if (newSatellitesList != satellitesList) {
			NotificationChain msgs = null;
			if (satellitesList != null)
				msgs = ((InternalEObject)satellitesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__SATELLITES_LIST, null, msgs);
			if (newSatellitesList != null)
				msgs = ((InternalEObject)newSatellitesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__SATELLITES_LIST, null, msgs);
			msgs = basicSetSatellitesList(newSatellitesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__SATELLITES_LIST, newSatellitesList, newSatellitesList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundStationReferencesList getGroundStationsReferencesList() {
		return groundStationsReferencesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroundStationsReferencesList(GroundStationReferencesList newGroundStationsReferencesList, NotificationChain msgs) {
		GroundStationReferencesList oldGroundStationsReferencesList = groundStationsReferencesList;
		groundStationsReferencesList = newGroundStationsReferencesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST, oldGroundStationsReferencesList, newGroundStationsReferencesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundStationsReferencesList(GroundStationReferencesList newGroundStationsReferencesList) {
		if (newGroundStationsReferencesList != groundStationsReferencesList) {
			NotificationChain msgs = null;
			if (groundStationsReferencesList != null)
				msgs = ((InternalEObject)groundStationsReferencesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST, null, msgs);
			if (newGroundStationsReferencesList != null)
				msgs = ((InternalEObject)newGroundStationsReferencesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST, null, msgs);
			msgs = basicSetGroundStationsReferencesList(newGroundStationsReferencesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST, newGroundStationsReferencesList, newGroundStationsReferencesList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationDownlinksList getDownlinksLists() {
		return downlinksLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDownlinksLists(ConstellationDownlinksList newDownlinksLists, NotificationChain msgs) {
		ConstellationDownlinksList oldDownlinksLists = downlinksLists;
		downlinksLists = newDownlinksLists;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__DOWNLINKS_LISTS, oldDownlinksLists, newDownlinksLists);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownlinksLists(ConstellationDownlinksList newDownlinksLists) {
		if (newDownlinksLists != downlinksLists) {
			NotificationChain msgs = null;
			if (downlinksLists != null)
				msgs = ((InternalEObject)downlinksLists).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__DOWNLINKS_LISTS, null, msgs);
			if (newDownlinksLists != null)
				msgs = ((InternalEObject)newDownlinksLists).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__DOWNLINKS_LISTS, null, msgs);
			msgs = basicSetDownlinksLists(newDownlinksLists, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__DOWNLINKS_LISTS, newDownlinksLists, newDownlinksLists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationRequestsList getConstellationRequestsList() {
		return constellationRequestsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstellationRequestsList(ConstellationRequestsList newConstellationRequestsList, NotificationChain msgs) {
		ConstellationRequestsList oldConstellationRequestsList = constellationRequestsList;
		constellationRequestsList = newConstellationRequestsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST, oldConstellationRequestsList, newConstellationRequestsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationRequestsList(ConstellationRequestsList newConstellationRequestsList) {
		if (newConstellationRequestsList != constellationRequestsList) {
			NotificationChain msgs = null;
			if (constellationRequestsList != null)
				msgs = ((InternalEObject)constellationRequestsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST, null, msgs);
			if (newConstellationRequestsList != null)
				msgs = ((InternalEObject)newConstellationRequestsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST, null, msgs);
			msgs = basicSetConstellationRequestsList(newConstellationRequestsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST, newConstellationRequestsList, newConstellationRequestsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationCommandPlan plan(Date startDate, Date endDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationCommandPlan plan(List<AbstractConstellationRequest> requests, Date startDate, Date endDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void commit(List<AbstractSatelliteCommand> satelliteCommands) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void apply(ConstellationDownlink downlink) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void add(AbstractConstellationRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAll(List<AbstractConstellationRequest> requests) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remove(AbstractConstellationRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAll(List<AbstractConstellationRequest> requests) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__SATELLITES_LIST:
				return basicSetSatellitesList(null, msgs);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST:
				return basicSetGroundStationsReferencesList(null, msgs);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__DOWNLINKS_LISTS:
				return basicSetDownlinksLists(null, msgs);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST:
				return basicSetConstellationRequestsList(null, msgs);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__SATELLITES_LIST:
				return getSatellitesList();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST:
				return getGroundStationsReferencesList();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__DOWNLINKS_LISTS:
				return getDownlinksLists();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST:
				return getConstellationRequestsList();
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__SATELLITES_LIST:
				setSatellitesList((SatellitesList)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST:
				setGroundStationsReferencesList((GroundStationReferencesList)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__DOWNLINKS_LISTS:
				setDownlinksLists((ConstellationDownlinksList)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST:
				setConstellationRequestsList((ConstellationRequestsList)newValue);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__SATELLITES_LIST:
				setSatellitesList((SatellitesList)null);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST:
				setGroundStationsReferencesList((GroundStationReferencesList)null);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__DOWNLINKS_LISTS:
				setDownlinksLists((ConstellationDownlinksList)null);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST:
				setConstellationRequestsList((ConstellationRequestsList)null);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__SATELLITES_LIST:
				return satellitesList != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST:
				return groundStationsReferencesList != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__DOWNLINKS_LISTS:
				return downlinksLists != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST:
				return constellationRequestsList != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION___PLAN__DATE_DATE:
				return plan((Date)arguments.get(0), (Date)arguments.get(1));
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION___PLAN__LIST_DATE_DATE:
				return plan((List<AbstractConstellationRequest>)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION___COMMIT__LIST:
				commit((List<AbstractSatelliteCommand>)arguments.get(0));
				return null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION___APPLY__CONSTELLATIONDOWNLINK:
				apply((ConstellationDownlink)arguments.get(0));
				return null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION___ADD__ABSTRACTCONSTELLATIONREQUEST:
				add((AbstractConstellationRequest)arguments.get(0));
				return null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION___ADD_ALL__LIST:
				addAll((List<AbstractConstellationRequest>)arguments.get(0));
				return null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION___REMOVE__ABSTRACTCONSTELLATIONREQUEST:
				remove((AbstractConstellationRequest)arguments.get(0));
				return null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION___REMOVE_ALL__LIST:
				removeAll((List<AbstractConstellationRequest>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractConstellationImpl
