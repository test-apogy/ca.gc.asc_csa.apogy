/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.core.environment.orbit.AbstractFrame;
import org.eclipse.symphony.core.environment.orbit.Orbit;
import org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orbit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.OrbitImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.OrbitImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.OrbitImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.OrbitImpl#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OrbitImpl extends MinimalEObjectImpl.Container implements Orbit {
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
	 * The cached value of the '{@link #getReferenceFrame() <em>Reference Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceFrame()
	 * @generated
	 * @ordered
	 */
	protected AbstractFrame referenceFrame;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrbitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyOrbitEnvironmentPackage.Literals.ORBIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ORBIT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ORBIT__DESCRIPTION, oldDescription, description));
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
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ORBIT__TIME, oldTime, time));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ORBIT__REFERENCE_FRAME, oldReferenceFrame, newReferenceFrame);
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
				msgs = ((InternalEObject)referenceFrame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ORBIT__REFERENCE_FRAME, null, msgs);
			if (newReferenceFrame != null)
				msgs = ((InternalEObject)newReferenceFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ORBIT__REFERENCE_FRAME, null, msgs);
			msgs = basicSetReferenceFrame(newReferenceFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ORBIT__REFERENCE_FRAME, newReferenceFrame, newReferenceFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyOrbitEnvironmentPackage.ORBIT__REFERENCE_FRAME:
				return basicSetReferenceFrame(null, msgs);
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
			case SymphonyOrbitEnvironmentPackage.ORBIT__NAME:
				return getName();
			case SymphonyOrbitEnvironmentPackage.ORBIT__DESCRIPTION:
				return getDescription();
			case SymphonyOrbitEnvironmentPackage.ORBIT__TIME:
				return getTime();
			case SymphonyOrbitEnvironmentPackage.ORBIT__REFERENCE_FRAME:
				return getReferenceFrame();
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
			case SymphonyOrbitEnvironmentPackage.ORBIT__NAME:
				setName((String)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.ORBIT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.ORBIT__TIME:
				setTime((Date)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.ORBIT__REFERENCE_FRAME:
				setReferenceFrame((AbstractFrame)newValue);
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
			case SymphonyOrbitEnvironmentPackage.ORBIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SymphonyOrbitEnvironmentPackage.ORBIT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SymphonyOrbitEnvironmentPackage.ORBIT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case SymphonyOrbitEnvironmentPackage.ORBIT__REFERENCE_FRAME:
				setReferenceFrame((AbstractFrame)null);
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
			case SymphonyOrbitEnvironmentPackage.ORBIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SymphonyOrbitEnvironmentPackage.ORBIT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SymphonyOrbitEnvironmentPackage.ORBIT__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case SymphonyOrbitEnvironmentPackage.ORBIT__REFERENCE_FRAME:
				return referenceFrame != null;
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
				case SymphonyOrbitEnvironmentPackage.ORBIT__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Timed.class) {
			switch (derivedFeatureID) {
				case SymphonyOrbitEnvironmentPackage.ORBIT__TIME: return EMFEcorePackage.TIMED__TIME;
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
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return SymphonyOrbitEnvironmentPackage.ORBIT__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Timed.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.TIMED__TIME: return SymphonyOrbitEnvironmentPackage.ORBIT__TIME;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //OrbitImpl
