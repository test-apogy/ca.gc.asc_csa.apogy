package ca.gc.asc_csa.apogy.core.ui.provider;
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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import ca.gc.asc_csa.apogy.core.ui.util.ApogyCoreUIAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreUIItemProviderAdapterFactory extends ApogyCoreUIAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreUIItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreUIFacadeItemProvider apogyCoreUIFacadeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApogyCoreUIFacadeAdapter() {
		if (apogyCoreUIFacadeItemProvider == null) {
			apogyCoreUIFacadeItemProvider = new ApogyCoreUIFacadeItemProvider(this);
		}

		return apogyCoreUIFacadeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyResourceSettingsItemProvider apogyResourceSettingsItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApogyResourceSettingsAdapter() {
		if (apogyResourceSettingsItemProvider == null) {
			apogyResourceSettingsItemProvider = new ApogyResourceSettingsItemProvider(this);
		}

		return apogyResourceSettingsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewApogyProjectSettingsItemProvider newApogyProjectSettingsItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNewApogyProjectSettingsAdapter() {
		if (newApogyProjectSettingsItemProvider == null) {
			newApogyProjectSettingsItemProvider = new NewApogyProjectSettingsItemProvider(this);
		}

		return newApogyProjectSettingsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewApogySessionSettingsItemProvider newApogySessionSettingsItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNewApogySessionSettingsAdapter() {
		if (newApogySessionSettingsItemProvider == null) {
			newApogySessionSettingsItemProvider = new NewApogySessionSettingsItemProvider(this);
		}

		return newApogySessionSettingsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewApogySystemSettingsItemProvider newApogySystemSettingsItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNewApogySystemSettingsAdapter() {
		if (newApogySystemSettingsItemProvider == null) {
			newApogySystemSettingsItemProvider = new NewApogySystemSettingsItemProvider(this);
		}

		return newApogySystemSettingsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultNodePresentationItemProvider resultNodePresentationItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResultNodePresentationAdapter() {
		if (resultNodePresentationItemProvider == null) {
			resultNodePresentationItemProvider = new ResultNodePresentationItemProvider(this);
		}

		return resultNodePresentationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (apogyCoreUIFacadeItemProvider != null) apogyCoreUIFacadeItemProvider.dispose();
		if (apogyResourceSettingsItemProvider != null) apogyResourceSettingsItemProvider.dispose();
		if (newApogyProjectSettingsItemProvider != null) newApogyProjectSettingsItemProvider.dispose();
		if (newApogySessionSettingsItemProvider != null) newApogySessionSettingsItemProvider.dispose();
		if (newApogySystemSettingsItemProvider != null) newApogySystemSettingsItemProvider.dispose();
		if (resultNodePresentationItemProvider != null) resultNodePresentationItemProvider.dispose();
	}

}
