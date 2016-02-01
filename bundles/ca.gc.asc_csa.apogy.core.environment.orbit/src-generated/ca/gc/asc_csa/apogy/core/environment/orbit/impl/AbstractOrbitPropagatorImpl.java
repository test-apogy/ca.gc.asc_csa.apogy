/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.impl;

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
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.AbstractFrame;
import ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator;
import ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider;
import ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState;
import ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.AbstractOrbitPropagatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.AbstractOrbitPropagatorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.AbstractOrbitPropagatorImpl#getReferenceFrame <em>Reference Frame</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.AbstractOrbitPropagatorImpl#getAttitudeProvider <em>Attitude Provider</em>}</li>
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
		return ApogyCoreEnvironmentOrbitPackage.Literals.ABSTRACT_ORBIT_PROPAGATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME, oldReferenceFrame, newReferenceFrame);
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
				msgs = ((InternalEObject)referenceFrame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME, null, msgs);
			if (newReferenceFrame != null)
				msgs = ((InternalEObject)newReferenceFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME, null, msgs);
			msgs = basicSetReferenceFrame(newReferenceFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME, newReferenceFrame, newReferenceFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttitudeProvider> getAttitudeProvider() {
		if (attitudeProvider == null) {
			attitudeProvider = new EObjectContainmentEList<AttitudeProvider>(AttitudeProvider.class, this, ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER);
		}
		return attitudeProvider;
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
		if(getFromValidDate() != null)
		{
			if(date.getTime() < getFromValidDate().getTime())
			{
				return false;
			}
		}
		
		if(getToValidDate() != null)
		{
			if(date.getTime() > getToValidDate().getTime())
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
	public Date getFromValidDate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getToValidDate() {
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
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME:
				return basicSetReferenceFrame(null, msgs);
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER:
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
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__NAME:
				return getName();
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION:
				return getDescription();
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME:
				return getReferenceFrame();
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER:
				return getAttitudeProvider();
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
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME:
				setReferenceFrame((AbstractFrame)newValue);
				return;
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER:
				getAttitudeProvider().clear();
				getAttitudeProvider().addAll((Collection<? extends AttitudeProvider>)newValue);
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
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME:
				setReferenceFrame((AbstractFrame)null);
				return;
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER:
				getAttitudeProvider().clear();
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
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME:
				return referenceFrame != null;
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER:
				return attitudeProvider != null && !attitudeProvider.isEmpty();
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
				case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == ValidityRangeProvider.class) {
			switch (derivedFeatureID) {
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
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == ValidityRangeProvider.class) {
			switch (baseFeatureID) {
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
		if (baseClass == ValidityRangeProvider.class) {
			switch (baseOperationID) {
				case ApogyCoreEnvironmentOrbitPackage.VALIDITY_RANGE_PROVIDER___GET_FROM_VALID_DATE: return ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR___GET_FROM_VALID_DATE;
				case ApogyCoreEnvironmentOrbitPackage.VALIDITY_RANGE_PROVIDER___GET_TO_VALID_DATE: return ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR___GET_TO_VALID_DATE;
				case ApogyCoreEnvironmentOrbitPackage.VALIDITY_RANGE_PROVIDER___IS_DATE_IN_VALID_RANGE__DATE: return ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE;
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
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR___PROPAGATE__DATE:
				try {
					return propagate((Date)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE:
				try {
					return getSpacecraftStates((Date)arguments.get(0), (Date)arguments.get(1), (Double)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR___GET_FROM_VALID_DATE:
				return getFromValidDate();
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR___GET_TO_VALID_DATE:
				return getToValidDate();
			case ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE:
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
		result.append(')');
		return result.toString();
	}

} //AbstractOrbitPropagatorImpl
