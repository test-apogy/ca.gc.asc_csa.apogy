/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.core.environment.orbit.AbstractFrame;
import org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.AttitudeProvider;
import org.eclipse.symphony.core.environment.orbit.Orbit;
import org.eclipse.symphony.core.environment.orbit.SpacecraftState;
import org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.AbstractOrbitPropagatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.AbstractOrbitPropagatorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.AbstractOrbitPropagatorImpl#getReferenceFrame <em>Reference Frame</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.AbstractOrbitPropagatorImpl#getAttitudeProvider <em>Attitude Provider</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.AbstractOrbitPropagatorImpl#getInitialOrbit <em>Initial Orbit</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.AbstractOrbitPropagatorImpl#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.AbstractOrbitPropagatorImpl#getValidToDate <em>Valid To Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractOrbitPropagatorImpl extends MinimalEObjectImpl.Container implements AbstractOrbitPropagator {
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
	 * The cached value of the '{@link #getReferenceFrame() <em>Reference Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceFrame()
	 * @generated
	 * @ordered
	 */
	protected AbstractFrame referenceFrame;

	/**
	 * The cached value of the '{@link #getAttitudeProvider() <em>Attitude Provider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitudeProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<AttitudeProvider> attitudeProvider;

	/**
	 * The cached value of the '{@link #getInitialOrbit() <em>Initial Orbit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialOrbit()
	 * @generated
	 * @ordered
	 */
	protected Orbit initialOrbit;

	/**
	 * The default value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date validFromDate = VALID_FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidToDate() <em>Valid To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidToDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_TO_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidToDate() <em>Valid To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidToDate()
	 * @generated
	 * @ordered
	 */
	protected Date validToDate = VALID_TO_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractOrbitPropagatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyOrbitEnvironmentPackage.Literals.ABSTRACT_ORBIT_PROPAGATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFrame getReferenceFrame() {
		return referenceFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceFrame(AbstractFrame newReferenceFrame, NotificationChain msgs) {
		AbstractFrame oldReferenceFrame = referenceFrame;
		referenceFrame = newReferenceFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME, oldReferenceFrame, newReferenceFrame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceFrame(AbstractFrame newReferenceFrame) {
		if (newReferenceFrame != referenceFrame) {
			NotificationChain msgs = null;
			if (referenceFrame != null)
				msgs = ((InternalEObject)referenceFrame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME, null, msgs);
			if (newReferenceFrame != null)
				msgs = ((InternalEObject)newReferenceFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME, null, msgs);
			msgs = basicSetReferenceFrame(newReferenceFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME, newReferenceFrame, newReferenceFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttitudeProvider> getAttitudeProvider() {
		if (attitudeProvider == null) {
			attitudeProvider = new EObjectContainmentEList<AttitudeProvider>(AttitudeProvider.class, this, SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER);
		}
		return attitudeProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orbit getInitialOrbit() {
		if (initialOrbit != null && initialOrbit.eIsProxy()) {
			InternalEObject oldInitialOrbit = (InternalEObject)initialOrbit;
			initialOrbit = (Orbit)eResolveProxy(oldInitialOrbit);
			if (initialOrbit != oldInitialOrbit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__INITIAL_ORBIT, oldInitialOrbit, initialOrbit));
			}
		}
		return initialOrbit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orbit basicGetInitialOrbit() {
		return initialOrbit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialOrbit(Orbit newInitialOrbit) {
		Orbit oldInitialOrbit = initialOrbit;
		initialOrbit = newInitialOrbit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__INITIAL_ORBIT, oldInitialOrbit, initialOrbit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidFromDate() {
		return validFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFromDate(Date newValidFromDate) {
		Date oldValidFromDate = validFromDate;
		validFromDate = newValidFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__VALID_FROM_DATE, oldValidFromDate, validFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidToDate() {
		return validToDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidToDate(Date newValidToDate) {
		Date oldValidToDate = validToDate;
		validToDate = newValidToDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__VALID_TO_DATE, oldValidToDate, validToDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftState propagate(Date targetDate) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<SpacecraftState> getSpacecraftStates(Date startDate, Date endDate, double timeInterval) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean isDateInValidRange(Date date) 
	{
		// Checks that the specified date falls within the propagator valid interval.
		if(getValidFromDate() != null)
		{
			if(date.getTime() < getValidFromDate().getTime())
			{
				return false;
			}
		}
		
		if(getValidToDate() != null)
		{
			if(date.getTime() > getValidToDate().getTime())
			{
				return false;
			}
		}	
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME:
				return basicSetReferenceFrame(null, msgs);
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER:
				return ((InternalEList<?>)getAttitudeProvider()).basicRemove(otherEnd, msgs);
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
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__NAME:
				return getName();
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION:
				return getDescription();
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME:
				return getReferenceFrame();
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER:
				return getAttitudeProvider();
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__INITIAL_ORBIT:
				if (resolve) return getInitialOrbit();
				return basicGetInitialOrbit();
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				return getValidFromDate();
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__VALID_TO_DATE:
				return getValidToDate();
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
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__NAME:
				setName((String)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME:
				setReferenceFrame((AbstractFrame)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER:
				getAttitudeProvider().clear();
				getAttitudeProvider().addAll((Collection<? extends AttitudeProvider>)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__INITIAL_ORBIT:
				setInitialOrbit((Orbit)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				setValidFromDate((Date)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__VALID_TO_DATE:
				setValidToDate((Date)newValue);
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
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME:
				setReferenceFrame((AbstractFrame)null);
				return;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER:
				getAttitudeProvider().clear();
				return;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__INITIAL_ORBIT:
				setInitialOrbit((Orbit)null);
				return;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				setValidFromDate(VALID_FROM_DATE_EDEFAULT);
				return;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__VALID_TO_DATE:
				setValidToDate(VALID_TO_DATE_EDEFAULT);
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
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME:
				return referenceFrame != null;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER:
				return attitudeProvider != null && !attitudeProvider.isEmpty();
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__INITIAL_ORBIT:
				return initialOrbit != null;
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				return VALID_FROM_DATE_EDEFAULT == null ? validFromDate != null : !VALID_FROM_DATE_EDEFAULT.equals(validFromDate);
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__VALID_TO_DATE:
				return VALID_TO_DATE_EDEFAULT == null ? validToDate != null : !VALID_TO_DATE_EDEFAULT.equals(validToDate);
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
				case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
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
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR___PROPAGATE__DATE:
				try {
					return propagate((Date)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE:
				try {
					return getSpacecraftStates((Date)arguments.get(0), (Date)arguments.get(1), (Double)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyOrbitEnvironmentPackage.ABSTRACT_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE:
				return isDateInValidRange((Date)arguments.get(0));
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
		result.append(", validFromDate: ");
		result.append(validFromDate);
		result.append(", validToDate: ");
		result.append(validToDate);
		result.append(')');
		return result.toString();
	}

} //AbstractOrbitPropagatorImpl
