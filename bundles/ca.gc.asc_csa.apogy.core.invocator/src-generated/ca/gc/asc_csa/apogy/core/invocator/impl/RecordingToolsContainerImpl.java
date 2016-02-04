package ca.gc.asc_csa.apogy.core.invocator.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.core.invocator.AbstractPlayer;
import ca.gc.asc_csa.apogy.core.invocator.AbstractRecorder;
import ca.gc.asc_csa.apogy.core.invocator.ChannelsList;
import ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recording Tools Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.RecordingToolsContainerImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.RecordingToolsContainerImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.RecordingToolsContainerImpl#getChannelsLists <em>Channels Lists</em>}</li>
 * </ul>
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
		return ApogyCoreInvocatorPackage.Literals.RECORDING_TOOLS_CONTAINER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER, oldRecorder, newRecorder);
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
				msgs = ((InternalEObject)recorder).eInverseRemove(this, ApogyCoreInvocatorPackage.ABSTRACT_RECORDER__RECORDING_TOOLS_CONTAINER, AbstractRecorder.class, msgs);
			if (newRecorder != null)
				msgs = ((InternalEObject)newRecorder).eInverseAdd(this, ApogyCoreInvocatorPackage.ABSTRACT_RECORDER__RECORDING_TOOLS_CONTAINER, AbstractRecorder.class, msgs);
			msgs = basicSetRecorder(newRecorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER, newRecorder, newRecorder));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER, oldPlayer, newPlayer);
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
				msgs = ((InternalEObject)player).eInverseRemove(this, ApogyCoreInvocatorPackage.ABSTRACT_PLAYER__RECORDING_TOOLS_CONTAINER, AbstractPlayer.class, msgs);
			if (newPlayer != null)
				msgs = ((InternalEObject)newPlayer).eInverseAdd(this, ApogyCoreInvocatorPackage.ABSTRACT_PLAYER__RECORDING_TOOLS_CONTAINER, AbstractPlayer.class, msgs);
			msgs = basicSetPlayer(newPlayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER, newPlayer, newPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelsList> getChannelsLists() {
		if (channelsLists == null) {
			channelsLists = new EObjectContainmentWithInverseEList<ChannelsList>(ChannelsList.class, this, ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS, ApogyCoreInvocatorPackage.CHANNELS_LIST__RECORDING_TOOLS_CONTAINER);
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
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER:
				if (recorder != null)
					msgs = ((InternalEObject)recorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER, null, msgs);
				return basicSetRecorder((AbstractRecorder)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER:
				if (player != null)
					msgs = ((InternalEObject)player).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER, null, msgs);
				return basicSetPlayer((AbstractPlayer)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS:
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
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER:
				return basicSetRecorder(null, msgs);
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER:
				return basicSetPlayer(null, msgs);
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS:
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
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER:
				return getRecorder();
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER:
				return getPlayer();
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS:
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
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER:
				setRecorder((AbstractRecorder)newValue);
				return;
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER:
				setPlayer((AbstractPlayer)newValue);
				return;
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS:
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
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER:
				setRecorder((AbstractRecorder)null);
				return;
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER:
				setPlayer((AbstractPlayer)null);
				return;
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS:
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
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__RECORDER:
				return recorder != null;
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__PLAYER:
				return player != null;
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS:
				return channelsLists != null && !channelsLists.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecordingToolsContainerImpl
