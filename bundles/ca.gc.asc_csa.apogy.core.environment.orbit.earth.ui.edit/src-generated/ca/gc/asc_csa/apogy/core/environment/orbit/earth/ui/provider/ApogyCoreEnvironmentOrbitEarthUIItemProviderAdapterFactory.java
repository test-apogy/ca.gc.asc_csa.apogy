package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.provider;
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
import java.util.List;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import ca.gc.asc_csa.apogy.common.topology.AggregateContentNode;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.util.ApogyCommonTopologySwitch;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIFactory;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.util.ApogyCoreEnvironmentOrbitEarthUIAdapterFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ToolsList;
import ca.gc.asc_csa.apogy.core.invocator.util.ApogyCoreInvocatorSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentOrbitEarthUIItemProviderAdapterFactory extends ApogyCoreEnvironmentOrbitEarthUIAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(ApogyCoreEnvironmentOrbitEarthUIEditPlugin.INSTANCE, ApogyCoreEnvironmentOrbitEarthUIPackage.eNS_URI);

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
	public ApogyCoreEnvironmentOrbitEarthUIItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfigurationList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthViewConfigurationListItemProvider earthViewConfigurationListItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfigurationList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEarthViewConfigurationListAdapter() {
		if (earthViewConfigurationListItemProvider == null) {
			earthViewConfigurationListItemProvider = new EarthViewConfigurationListItemProvider(this);
		}

		return earthViewConfigurationListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthViewConfigurationItemProvider earthViewConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEarthViewConfigurationAdapter() {
		if (earthViewConfigurationItemProvider == null) {
			earthViewConfigurationItemProvider = new EarthViewConfigurationItemProvider(this);
		}

		return earthViewConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftLocationWorldWindLayerItemProvider spacecraftLocationWorldWindLayerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpacecraftLocationWorldWindLayerAdapter() {
		if (spacecraftLocationWorldWindLayerItemProvider == null) {
			spacecraftLocationWorldWindLayerItemProvider = new SpacecraftLocationWorldWindLayerItemProvider(this);
		}

		return spacecraftLocationWorldWindLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrbitModelWorldWindLayerItemProvider orbitModelWorldWindLayerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrbitModelWorldWindLayerAdapter() {
		if (orbitModelWorldWindLayerItemProvider == null) {
			orbitModelWorldWindLayerItemProvider = new OrbitModelWorldWindLayerItemProvider(this);
		}

		return orbitModelWorldWindLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftSwathWorldWindLayerItemProvider spacecraftSwathWorldWindLayerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpacecraftSwathWorldWindLayerAdapter() {
		if (spacecraftSwathWorldWindLayerItemProvider == null) {
			spacecraftSwathWorldWindLayerItemProvider = new SpacecraftSwathWorldWindLayerItemProvider(this);
		}

		return spacecraftSwathWorldWindLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthSurfaceLocationWorldWindLayerItemProvider earthSurfaceLocationWorldWindLayerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEarthSurfaceLocationWorldWindLayerAdapter() {
		if (earthSurfaceLocationWorldWindLayerItemProvider == null) {
			earthSurfaceLocationWorldWindLayerItemProvider = new EarthSurfaceLocationWorldWindLayerItemProvider(this);
		}

		return earthSurfaceLocationWorldWindLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationWorldWindLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundStationWorldWindLayerItemProvider groundStationWorldWindLayerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationWorldWindLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroundStationWorldWindLayerAdapter() {
		if (groundStationWorldWindLayerItemProvider == null) {
			groundStationWorldWindLayerItemProvider = new GroundStationWorldWindLayerItemProvider(this);
		}

		return groundStationWorldWindLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GeographicCoordinatesWorldWindLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeographicCoordinatesWorldWindLayerItemProvider geographicCoordinatesWorldWindLayerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GeographicCoordinatesWorldWindLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeographicCoordinatesWorldWindLayerAdapter() {
		if (geographicCoordinatesWorldWindLayerItemProvider == null) {
			geographicCoordinatesWorldWindLayerItemProvider = new GeographicCoordinatesWorldWindLayerItemProvider(this);
		}

		return geographicCoordinatesWorldWindLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftVisibilityPassViewConfigurationListItemProvider spacecraftVisibilityPassViewConfigurationListItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpacecraftVisibilityPassViewConfigurationListAdapter() {
		if (spacecraftVisibilityPassViewConfigurationListItemProvider == null) {
			spacecraftVisibilityPassViewConfigurationListItemProvider = new SpacecraftVisibilityPassViewConfigurationListItemProvider(this);
		}

		return spacecraftVisibilityPassViewConfigurationListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftVisibilityPassViewConfigurationItemProvider spacecraftVisibilityPassViewConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpacecraftVisibilityPassViewConfigurationAdapter() {
		if (spacecraftVisibilityPassViewConfigurationItemProvider == null) {
			spacecraftVisibilityPassViewConfigurationItemProvider = new SpacecraftVisibilityPassViewConfigurationItemProvider(this);
		}

		return spacecraftVisibilityPassViewConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewUtilities} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthViewUtilitiesItemProvider earthViewUtilitiesItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewUtilities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEarthViewUtilitiesAdapter() {
		if (earthViewUtilitiesItemProvider == null) {
			earthViewUtilitiesItemProvider = new EarthViewUtilitiesItemProvider(this);
		}

		return earthViewUtilitiesItemProvider;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
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
		if (earthViewConfigurationListItemProvider != null) earthViewConfigurationListItemProvider.dispose();
		if (earthViewConfigurationItemProvider != null) earthViewConfigurationItemProvider.dispose();
		if (spacecraftLocationWorldWindLayerItemProvider != null) spacecraftLocationWorldWindLayerItemProvider.dispose();
		if (orbitModelWorldWindLayerItemProvider != null) orbitModelWorldWindLayerItemProvider.dispose();
		if (spacecraftSwathWorldWindLayerItemProvider != null) spacecraftSwathWorldWindLayerItemProvider.dispose();
		if (earthSurfaceLocationWorldWindLayerItemProvider != null) earthSurfaceLocationWorldWindLayerItemProvider.dispose();
		if (groundStationWorldWindLayerItemProvider != null) groundStationWorldWindLayerItemProvider.dispose();
		if (geographicCoordinatesWorldWindLayerItemProvider != null) geographicCoordinatesWorldWindLayerItemProvider.dispose();
		if (spacecraftVisibilityPassViewConfigurationListItemProvider != null) spacecraftVisibilityPassViewConfigurationListItemProvider.dispose();
		if (spacecraftVisibilityPassViewConfigurationItemProvider != null) spacecraftVisibilityPassViewConfigurationItemProvider.dispose();
		if (earthViewUtilitiesItemProvider != null) earthViewUtilitiesItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link ApogyCoreInvocatorPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ApogyCoreInvocatorChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ApogyCoreInvocatorSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseToolsList(ToolsList object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCoreInvocatorPackage.Literals.TOOLS_LIST__TOOLS_LIST_CONTAINERS,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createEarthViewConfigurationList()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCoreInvocatorPackage.Literals.TOOLS_LIST__TOOLS_LIST_CONTAINERS,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createSpacecraftVisibilityPassViewConfigurationList()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return ApogyCoreEnvironmentOrbitEarthUIEditPlugin.INSTANCE;
		}
	}

	/**
	 * A child creation extender for the {@link ApogyCommonTopologyPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ApogyCommonTopologyChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ApogyCommonTopologySwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public <T> Object caseContentNode(ContentNode<T> object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createEarthViewConfigurationList()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createEarthViewConfiguration()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createSpacecraftLocationWorldWindLayer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createOrbitModelWorldWindLayer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createSpacecraftSwathWorldWindLayer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createEarthSurfaceLocationWorldWindLayer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createGroundStationWorldWindLayer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createGeographicCoordinatesWorldWindLayer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createSpacecraftVisibilityPassViewConfigurationList()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createSpacecraftVisibilityPassViewConfiguration()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createEarthViewUtilities()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public <T> Object caseAggregateContentNode(AggregateContentNode<T> object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createEarthViewConfigurationList()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createEarthViewConfiguration()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createSpacecraftLocationWorldWindLayer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createOrbitModelWorldWindLayer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createSpacecraftSwathWorldWindLayer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createEarthSurfaceLocationWorldWindLayer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createGroundStationWorldWindLayer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createGeographicCoordinatesWorldWindLayer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createSpacecraftVisibilityPassViewConfigurationList()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createSpacecraftVisibilityPassViewConfiguration()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitEarthUIFactory.eINSTANCE.createEarthViewUtilities()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return ApogyCoreEnvironmentOrbitEarthUIEditPlugin.INSTANCE;
		}
	}

}
