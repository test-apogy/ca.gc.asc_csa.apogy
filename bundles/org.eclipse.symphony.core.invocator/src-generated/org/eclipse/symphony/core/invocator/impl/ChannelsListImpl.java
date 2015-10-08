/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.invocator.AbstractChannel;
import org.eclipse.symphony.core.invocator.ChannelsList;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.RecordingToolsContainer;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channels List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ChannelsListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ChannelsListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ChannelsListImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ChannelsListImpl#getRecordingToolsContainer <em>Recording Tools Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelsListImpl extends MinimalEObjectImpl.Container implements ChannelsList {
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
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractChannel> channels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelsListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreInvocatorPackage.Literals.CHANNELS_LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.CHANNELS_LIST__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.CHANNELS_LIST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractChannel> getChannels() {
		if (channels == null) {
			channels = new EObjectContainmentWithInverseEList<AbstractChannel>(AbstractChannel.class, this, EMFEcoreInvocatorPackage.CHANNELS_LIST__CHANNELS, EMFEcoreInvocatorPackage.ABSTRACT_CHANNEL__CHANNELS_LIST);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordingToolsContainer getRecordingToolsContainer() {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER) return null;
		return (RecordingToolsContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordingToolsContainer basicGetRecordingToolsContainer() {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER) return null;
		return (RecordingToolsContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordingToolsContainer(RecordingToolsContainer newRecordingToolsContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRecordingToolsContainer, EMFEcoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordingToolsContainer(RecordingToolsContainer newRecordingToolsContainer) {
		if (newRecordingToolsContainer != eInternalContainer() || (eContainerFeatureID() != EMFEcoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER && newRecordingToolsContainer != null)) {
			if (EcoreUtil.isAncestor(this, newRecordingToolsContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRecordingToolsContainer != null)
				msgs = ((InternalEObject)newRecordingToolsContainer).eInverseAdd(this, EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS, RecordingToolsContainer.class, msgs);
			msgs = basicSetRecordingToolsContainer(newRecordingToolsContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER, newRecordingToolsContainer, newRecordingToolsContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__CHANNELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChannels()).basicAdd(otherEnd, msgs);
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRecordingToolsContainer((RecordingToolsContainer)otherEnd, msgs);
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
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER:
				return basicSetRecordingToolsContainer(null, msgs);
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
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER:
				return eInternalContainer().eInverseRemove(this, EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS, RecordingToolsContainer.class, msgs);
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
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__NAME:
				return getName();
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__DESCRIPTION:
				return getDescription();
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__CHANNELS:
				return getChannels();
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER:
				if (resolve) return getRecordingToolsContainer();
				return basicGetRecordingToolsContainer();
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
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__NAME:
				setName((String)newValue);
				return;
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends AbstractChannel>)newValue);
				return;
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER:
				setRecordingToolsContainer((RecordingToolsContainer)newValue);
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
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__CHANNELS:
				getChannels().clear();
				return;
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER:
				setRecordingToolsContainer((RecordingToolsContainer)null);
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
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__CHANNELS:
				return channels != null && !channels.isEmpty();
			case EMFEcoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER:
				return basicGetRecordingToolsContainer() != null;
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
				case EMFEcoreInvocatorPackage.CHANNELS_LIST__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
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
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return EMFEcoreInvocatorPackage.CHANNELS_LIST__DESCRIPTION;
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
		result.append(')');
		return result.toString();
	}

} //ChannelsListImpl
