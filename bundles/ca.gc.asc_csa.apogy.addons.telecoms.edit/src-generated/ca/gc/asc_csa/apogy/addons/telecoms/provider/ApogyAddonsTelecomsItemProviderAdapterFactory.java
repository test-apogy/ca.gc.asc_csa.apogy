package ca.gc.asc_csa.apogy.addons.telecoms.provider;
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
import ca.gc.asc_csa.apogy.addons.SimpleToolList;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsFactory;
import ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage;
import ca.gc.asc_csa.apogy.addons.telecoms.util.ApogyAddonsTelecomsAdapterFactory;
import ca.gc.asc_csa.apogy.addons.util.ApogyAddonsSwitch;
import ca.gc.asc_csa.apogy.common.topology.AggregateContentNode;
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;
import ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase;
import ca.gc.asc_csa.apogy.common.topology.bindings.util.ApogyCommonTopologyBindingsSwitch;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.util.ApogyCommonTopologySwitch;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.AssemblyLink;
import ca.gc.asc_csa.apogy.core.TopologyRoot;
import ca.gc.asc_csa.apogy.core.environment.Map;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.util.ApogyCoreEnvironmentSwitch;
import ca.gc.asc_csa.apogy.core.util.ApogyCoreSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsTelecomsItemProviderAdapterFactory extends ApogyAddonsTelecomsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(ApogyAddonsTelecomsEditPlugin.INSTANCE, ApogyAddonsTelecomsPackage.eNS_URI);

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
	public ApogyAddonsTelecomsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelecomNodeItemProvider telecomNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTelecomNodeAdapter() {
		if (telecomNodeItemProvider == null) {
			telecomNodeItemProvider = new TelecomNodeItemProvider(this);
		}

		return telecomNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelecomStatusMonitorToolItemProvider telecomStatusMonitorToolItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTelecomStatusMonitorToolAdapter() {
		if (telecomStatusMonitorToolItemProvider == null) {
			telecomStatusMonitorToolItemProvider = new TelecomStatusMonitorToolItemProvider(this);
		}

		return telecomStatusMonitorToolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorToolList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelecomStatusMonitorToolListItemProvider telecomStatusMonitorToolListItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorToolList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTelecomStatusMonitorToolListAdapter() {
		if (telecomStatusMonitorToolListItemProvider == null) {
			telecomStatusMonitorToolListItemProvider = new TelecomStatusMonitorToolListItemProvider(this);
		}

		return telecomStatusMonitorToolListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.telecoms.IsotropicAntenna} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsotropicAntennaItemProvider isotropicAntennaItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.telecoms.IsotropicAntenna}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIsotropicAntennaAdapter() {
		if (isotropicAntennaItemProvider == null) {
			isotropicAntennaItemProvider = new IsotropicAntennaItemProvider(this);
		}

		return isotropicAntennaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.telecoms.DipoleAntennaRadiationPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DipoleAntennaRadiationPatternItemProvider dipoleAntennaRadiationPatternItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.telecoms.DipoleAntennaRadiationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDipoleAntennaRadiationPatternAdapter() {
		if (dipoleAntennaRadiationPatternItemProvider == null) {
			dipoleAntennaRadiationPatternItemProvider = new DipoleAntennaRadiationPatternItemProvider(this);
		}

		return dipoleAntennaRadiationPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.telecoms.HalfWaveDipoleAntennaRadiationPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HalfWaveDipoleAntennaRadiationPatternItemProvider halfWaveDipoleAntennaRadiationPatternItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.telecoms.HalfWaveDipoleAntennaRadiationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHalfWaveDipoleAntennaRadiationPatternAdapter() {
		if (halfWaveDipoleAntennaRadiationPatternItemProvider == null) {
			halfWaveDipoleAntennaRadiationPatternItemProvider = new HalfWaveDipoleAntennaRadiationPatternItemProvider(this);
		}

		return halfWaveDipoleAntennaRadiationPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.telecoms.SimpleConicalRadiationPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleConicalRadiationPatternItemProvider simpleConicalRadiationPatternItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.telecoms.SimpleConicalRadiationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleConicalRadiationPatternAdapter() {
		if (simpleConicalRadiationPatternItemProvider == null) {
			simpleConicalRadiationPatternItemProvider = new SimpleConicalRadiationPatternItemProvider(this);
		}

		return simpleConicalRadiationPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.telecoms.SimpleRectangularFrustumRadiationPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleRectangularFrustumRadiationPatternItemProvider simpleRectangularFrustumRadiationPatternItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.telecoms.SimpleRectangularFrustumRadiationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleRectangularFrustumRadiationPatternAdapter() {
		if (simpleRectangularFrustumRadiationPatternItemProvider == null) {
			simpleRectangularFrustumRadiationPatternItemProvider = new SimpleRectangularFrustumRadiationPatternItemProvider(this);
		}

		return simpleRectangularFrustumRadiationPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.telecoms.URlBasedAntennaRadiationPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URlBasedAntennaRadiationPatternItemProvider uRlBasedAntennaRadiationPatternItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.telecoms.URlBasedAntennaRadiationPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createURlBasedAntennaRadiationPatternAdapter() {
		if (uRlBasedAntennaRadiationPatternItemProvider == null) {
			uRlBasedAntennaRadiationPatternItemProvider = new URlBasedAntennaRadiationPatternItemProvider(this);
		}

		return uRlBasedAntennaRadiationPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.addons.telecoms.AntennaRadiationPatternImageMapLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntennaRadiationPatternImageMapLayerItemProvider antennaRadiationPatternImageMapLayerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.addons.telecoms.AntennaRadiationPatternImageMapLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAntennaRadiationPatternImageMapLayerAdapter() {
		if (antennaRadiationPatternImageMapLayerItemProvider == null) {
			antennaRadiationPatternImageMapLayerItemProvider = new AntennaRadiationPatternImageMapLayerItemProvider(this);
		}

		return antennaRadiationPatternImageMapLayerItemProvider;
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
		if (telecomNodeItemProvider != null) telecomNodeItemProvider.dispose();
		if (telecomStatusMonitorToolItemProvider != null) telecomStatusMonitorToolItemProvider.dispose();
		if (telecomStatusMonitorToolListItemProvider != null) telecomStatusMonitorToolListItemProvider.dispose();
		if (isotropicAntennaItemProvider != null) isotropicAntennaItemProvider.dispose();
		if (dipoleAntennaRadiationPatternItemProvider != null) dipoleAntennaRadiationPatternItemProvider.dispose();
		if (halfWaveDipoleAntennaRadiationPatternItemProvider != null) halfWaveDipoleAntennaRadiationPatternItemProvider.dispose();
		if (simpleConicalRadiationPatternItemProvider != null) simpleConicalRadiationPatternItemProvider.dispose();
		if (simpleRectangularFrustumRadiationPatternItemProvider != null) simpleRectangularFrustumRadiationPatternItemProvider.dispose();
		if (uRlBasedAntennaRadiationPatternItemProvider != null) uRlBasedAntennaRadiationPatternItemProvider.dispose();
		if (antennaRadiationPatternImageMapLayerItemProvider != null) antennaRadiationPatternImageMapLayerItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link ApogyAddonsPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ApogyAddonsChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ApogyAddonsSwitch<Object> {
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
			public Object caseSimpleToolList(SimpleToolList object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyAddonsPackage.Literals.SIMPLE_TOOL_LIST__SIMPLE_TOOLS,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createTelecomStatusMonitorToolList()));

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
			return ApogyAddonsTelecomsEditPlugin.INSTANCE;
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
						 ApogyAddonsTelecomsFactory.eINSTANCE.createTelecomNode()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createTelecomStatusMonitorTool()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createTelecomStatusMonitorToolList()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createIsotropicAntenna()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createDipoleAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createHalfWaveDipoleAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createSimpleConicalRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createSimpleRectangularFrustumRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createURlBasedAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createAntennaRadiationPatternImageMapLayer()));

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
						 ApogyAddonsTelecomsFactory.eINSTANCE.createTelecomNode()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createTelecomStatusMonitorTool()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createTelecomStatusMonitorToolList()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createIsotropicAntenna()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createDipoleAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createHalfWaveDipoleAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createSimpleConicalRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createSimpleRectangularFrustumRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createURlBasedAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createAntennaRadiationPatternImageMapLayer()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseAggregateGroupNode(AggregateGroupNode object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createIsotropicAntenna()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createDipoleAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createHalfWaveDipoleAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createSimpleConicalRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createSimpleRectangularFrustumRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createURlBasedAntennaRadiationPattern()));

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
			return ApogyAddonsTelecomsEditPlugin.INSTANCE;
		}
	}

	/**
	 * A child creation extender for the {@link ApogyCoreEnvironmentPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ApogyCoreEnvironmentChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ApogyCoreEnvironmentSwitch<Object> {
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
			public Object caseMap(Map object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCoreEnvironmentPackage.Literals.MAP__LAYERS,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createAntennaRadiationPatternImageMapLayer()));

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
			return ApogyAddonsTelecomsEditPlugin.INSTANCE;
		}
	}

	/**
	 * A child creation extender for the {@link ApogyCorePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ApogyCoreChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ApogyCoreSwitch<Object> {
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
			public Object caseTopologyRoot(TopologyRoot object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createIsotropicAntenna()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createDipoleAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createHalfWaveDipoleAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createSimpleConicalRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createSimpleRectangularFrustumRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.TOPOLOGY_ROOT__ORIGIN_NODE,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createURlBasedAntennaRadiationPattern()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseAssemblyLink(AssemblyLink object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createIsotropicAntenna()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createDipoleAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createHalfWaveDipoleAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createSimpleConicalRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createSimpleRectangularFrustumRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createURlBasedAntennaRadiationPattern()));

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
			return ApogyAddonsTelecomsEditPlugin.INSTANCE;
		}
	}

	/**
	 * A child creation extender for the {@link ApogyCommonTopologyBindingsPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ApogyCommonTopologyBindingsChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ApogyCommonTopologyBindingsSwitch<Object> {
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
			public Object caseEnumerationCase(EnumerationCase object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createIsotropicAntenna()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createDipoleAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createHalfWaveDipoleAntennaRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createSimpleConicalRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createSimpleRectangularFrustumRadiationPattern()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
						 ApogyAddonsTelecomsFactory.eINSTANCE.createURlBasedAntennaRadiationPattern()));

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
			return ApogyAddonsTelecomsEditPlugin.INSTANCE;
		}
	}

}
