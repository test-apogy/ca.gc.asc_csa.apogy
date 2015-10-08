/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package org.eclipse.symphony.common.io.jinput.impl;

import net.java.games.input.Component;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.io.jinput.EComponent;
import org.eclipse.symphony.common.io.jinput.EComponents;
import org.eclipse.symphony.common.io.jinput.JInputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EComponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.impl.EComponentImpl#getDeadZone <em>Dead Zone</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.impl.EComponentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.impl.EComponentImpl#isRelative <em>Relative</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.impl.EComponentImpl#isAnalog <em>Analog</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.impl.EComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.impl.EComponentImpl#getPojoComponent <em>Pojo Component</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.impl.EComponentImpl#getPollData <em>Poll Data</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.impl.EComponentImpl#getEComponents <em>EComponents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EComponentImpl extends EObjectImpl implements EComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012. All rights reserved.";

	/**
	 * The default value of the '{@link #getDeadZone() <em>Dead Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadZone()
	 * @generated
	 * @ordered
	 */
	protected static final float DEAD_ZONE_EDEFAULT = 0.0F;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isRelative() <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELATIVE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAnalog() <em>Analog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnalog()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANALOG_EDEFAULT = false;

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
	 * The default value of the '{@link #getPojoComponent() <em>Pojo Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPojoComponent()
	 * @generated
	 * @ordered
	 */
	protected static final Component POJO_COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPojoComponent() <em>Pojo Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPojoComponent()
	 * @generated
	 * @ordered
	 */
	protected Component pojoComponent = POJO_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollData() <em>Poll Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollData()
	 * @generated
	 * @ordered
	 */
	protected static final float POLL_DATA_EDEFAULT = 0.0F;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JInputPackage.Literals.ECOMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public float getDeadZone() {
		return (float) (pojoComponent == null ? 0.0: pojoComponent.getDeadZone());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getIdentifier() {
		return (pojoComponent == null ? "": pojoComponent.getIdentifier().getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public boolean isRelative() {
		return pojoComponent == null ? false: pojoComponent.isRelative();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public boolean isAnalog() {
		return pojoComponent == null ? false: pojoComponent.isAnalog();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getName() {
		return pojoComponent == null ? "": pojoComponent.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getPojoComponent() {
		return pojoComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPojoComponent(Component newPojoComponent) {
		Component oldPojoComponent = pojoComponent;
		pojoComponent = newPojoComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JInputPackage.ECOMPONENT__POJO_COMPONENT, oldPojoComponent, pojoComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public float getPollData() {
		return pojoComponent.getPollData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EComponents getEComponents() {
		if (eContainerFeatureID() != JInputPackage.ECOMPONENT__ECOMPONENTS) return null;
		return (EComponents)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEComponents(EComponents newEComponents, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEComponents, JInputPackage.ECOMPONENT__ECOMPONENTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEComponents(EComponents newEComponents) {
		if (newEComponents != eInternalContainer() || (eContainerFeatureID() != JInputPackage.ECOMPONENT__ECOMPONENTS && newEComponents != null)) {
			if (EcoreUtil.isAncestor(this, newEComponents))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEComponents != null)
				msgs = ((InternalEObject)newEComponents).eInverseAdd(this, JInputPackage.ECOMPONENTS__COMPONENTS, EComponents.class, msgs);
			msgs = basicSetEComponents(newEComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JInputPackage.ECOMPONENT__ECOMPONENTS, newEComponents, newEComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JInputPackage.ECOMPONENT__ECOMPONENTS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEComponents((EComponents)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JInputPackage.ECOMPONENT__ECOMPONENTS:
				return basicSetEComponents(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JInputPackage.ECOMPONENT__ECOMPONENTS:
				return eInternalContainer().eInverseRemove(this, JInputPackage.ECOMPONENTS__COMPONENTS, EComponents.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JInputPackage.ECOMPONENT__DEAD_ZONE:
				return getDeadZone();
			case JInputPackage.ECOMPONENT__IDENTIFIER:
				return getIdentifier();
			case JInputPackage.ECOMPONENT__RELATIVE:
				return isRelative();
			case JInputPackage.ECOMPONENT__ANALOG:
				return isAnalog();
			case JInputPackage.ECOMPONENT__NAME:
				return getName();
			case JInputPackage.ECOMPONENT__POJO_COMPONENT:
				return getPojoComponent();
			case JInputPackage.ECOMPONENT__POLL_DATA:
				return getPollData();
			case JInputPackage.ECOMPONENT__ECOMPONENTS:
				return getEComponents();
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
			case JInputPackage.ECOMPONENT__POJO_COMPONENT:
				setPojoComponent((Component)newValue);
				return;
			case JInputPackage.ECOMPONENT__ECOMPONENTS:
				setEComponents((EComponents)newValue);
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
			case JInputPackage.ECOMPONENT__POJO_COMPONENT:
				setPojoComponent(POJO_COMPONENT_EDEFAULT);
				return;
			case JInputPackage.ECOMPONENT__ECOMPONENTS:
				setEComponents((EComponents)null);
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
			case JInputPackage.ECOMPONENT__DEAD_ZONE:
				return getDeadZone() != DEAD_ZONE_EDEFAULT;
			case JInputPackage.ECOMPONENT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? getIdentifier() != null : !IDENTIFIER_EDEFAULT.equals(getIdentifier());
			case JInputPackage.ECOMPONENT__RELATIVE:
				return isRelative() != RELATIVE_EDEFAULT;
			case JInputPackage.ECOMPONENT__ANALOG:
				return isAnalog() != ANALOG_EDEFAULT;
			case JInputPackage.ECOMPONENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case JInputPackage.ECOMPONENT__POJO_COMPONENT:
				return POJO_COMPONENT_EDEFAULT == null ? pojoComponent != null : !POJO_COMPONENT_EDEFAULT.equals(pojoComponent);
			case JInputPackage.ECOMPONENT__POLL_DATA:
				return getPollData() != POLL_DATA_EDEFAULT;
			case JInputPackage.ECOMPONENT__ECOMPONENTS:
				return getEComponents() != null;
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
		result.append(" (pojoComponent: ");
		result.append(pojoComponent);
		result.append(')');
		return result.toString();
	}

} //EComponentImpl
