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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.invocator.AbstractPlayer;
import org.eclipse.symphony.core.invocator.AbstractRecorder;
import org.eclipse.symphony.core.invocator.ChannelsList;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.RecordingToolsContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recording Tools Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.RecordingToolsContainerImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.RecordingToolsContainerImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.RecordingToolsContainerImpl#getChannelsLists <em>Channels Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordingToolsContainerImpl extends AbstractToolsListContainerImpl implements RecordingToolsContainer {
	/**
	 * The cached value of the '{@link #getRecorder() <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorder()
	 * @generated
	 * @ordered
	 */
	protected AbstractRecorder recorder;

	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected AbstractPlayer player;

	/**
	 * The cached value of the '{@link #getChannelsLists() <em>Channels Lists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelsLists()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelsList> channelsLists;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordingToolsContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreInvocatorPackage.Literals.RECORDING_TOOLS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRecorder getRecorder() {
		return recorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecorder(AbstractRecorder newRecorder, NotificationChain msgs) {
		AbstractRecorder oldRecorder = recorder;
		recorder = newRecorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER, oldRecorder, newRecorder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorder(AbstractRecorder newRecorder) {
		if (newRecorder != recorder) {
			NotificationChain msgs = null;
			if (recorder != null)
				msgs = ((InternalEObject)recorder).eInverseRemove(this, EMFEcoreInvocatorPackage.ABSTRACT_RECORDER__RECORDING_TOOLS_CONTAINER, AbstractRecorder.class, msgs);
			if (newRecorder != null)
				msgs = ((InternalEObject)newRecorder).eInverseAdd(this, EMFEcoreInvocatorPackage.ABSTRACT_RECORDER__RECORDING_TOOLS_CONTAINER, AbstractRecorder.class, msgs);
			msgs = basicSetRecorder(newRecorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER, newRecorder, newRecorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPlayer getPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayer(AbstractPlayer newPlayer, NotificationChain msgs) {
		AbstractPlayer oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER, oldPlayer, newPlayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayer(AbstractPlayer newPlayer) {
		if (newPlayer != player) {
			NotificationChain msgs = null;
			if (player != null)
				msgs = ((InternalEObject)player).eInverseRemove(this, EMFEcoreInvocatorPackage.ABSTRACT_PLAYER__RECORDING_TOOLS_CONTAINER, AbstractPlayer.class, msgs);
			if (newPlayer != null)
				msgs = ((InternalEObject)newPlayer).eInverseAdd(this, EMFEcoreInvocatorPackage.ABSTRACT_PLAYER__RECORDING_TOOLS_CONTAINER, AbstractPlayer.class, msgs);
			msgs = basicSetPlayer(newPlayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER, newPlayer, newPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelsList> getChannelsLists() {
		if (channelsLists == null) {
			channelsLists = new EObjectContainmentWithInverseEList<ChannelsList>(ChannelsList.class, this, EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS, EMFEcoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER);
		}
		return channelsLists;
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
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER:
				if (recorder != null)
					msgs = ((InternalEObject)recorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER, null, msgs);
				return basicSetRecorder((AbstractRecorder)otherEnd, msgs);
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER:
				if (player != null)
					msgs = ((InternalEObject)player).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER, null, msgs);
				return basicSetPlayer((AbstractPlayer)otherEnd, msgs);
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChannelsLists()).basicAdd(otherEnd, msgs);
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
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER:
				return basicSetRecorder(null, msgs);
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER:
				return basicSetPlayer(null, msgs);
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS:
				return ((InternalEList<?>)getChannelsLists()).basicRemove(otherEnd, msgs);
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
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER:
				return getRecorder();
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER:
				return getPlayer();
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS:
				return getChannelsLists();
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
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER:
				setRecorder((AbstractRecorder)newValue);
				return;
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER:
				setPlayer((AbstractPlayer)newValue);
				return;
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS:
				getChannelsLists().clear();
				getChannelsLists().addAll((Collection<? extends ChannelsList>)newValue);
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
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER:
				setRecorder((AbstractRecorder)null);
				return;
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER:
				setPlayer((AbstractPlayer)null);
				return;
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS:
				getChannelsLists().clear();
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
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER:
				return recorder != null;
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER:
				return player != null;
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS:
				return channelsLists != null && !channelsLists.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecordingToolsContainerImpl
