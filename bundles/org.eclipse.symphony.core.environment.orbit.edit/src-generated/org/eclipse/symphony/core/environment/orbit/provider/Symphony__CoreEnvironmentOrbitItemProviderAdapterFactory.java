/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.provider;

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
import org.eclipse.symphony.common.topology.AggregateContentNode;
import org.eclipse.symphony.common.topology.ContentNode;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;
import org.eclipse.symphony.common.topology.util.Symphony__CommonTopologySwitch;
import org.eclipse.symphony.core.OrbitModelsList;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitFactory;
import org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage;
import org.eclipse.symphony.core.environment.orbit.util.Symphony__CoreEnvironmentOrbitAdapterFactory;
import org.eclipse.symphony.core.util.Symphony__CoreSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreEnvironmentOrbitItemProviderAdapterFactory extends Symphony__CoreEnvironmentOrbitAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(Symphony__CoreEnvironmentOrbitEditPlugin.INSTANCE, Symphony__CoreEnvironmentOrbitPackage.eNS_URI);

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
	public Symphony__CoreEnvironmentOrbitItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.orbit.PVACoordinates} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PVACoordinatesItemProvider pvaCoordinatesItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.orbit.PVACoordinates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPVACoordinatesAdapter() {
		if (pvaCoordinatesItemProvider == null) {
			pvaCoordinatesItemProvider = new PVACoordinatesItemProvider(this);
		}

		return pvaCoordinatesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.orbit.TimedStampedPVACoordinates} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedStampedPVACoordinatesItemProvider timedStampedPVACoordinatesItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.orbit.TimedStampedPVACoordinates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedStampedPVACoordinatesAdapter() {
		if (timedStampedPVACoordinatesItemProvider == null) {
			timedStampedPVACoordinatesItemProvider = new TimedStampedPVACoordinatesItemProvider(this);
		}

		return timedStampedPVACoordinatesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.orbit.AngularCoordinates} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngularCoordinatesItemProvider angularCoordinatesItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.orbit.AngularCoordinates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAngularCoordinatesAdapter() {
		if (angularCoordinatesItemProvider == null) {
			angularCoordinatesItemProvider = new AngularCoordinatesItemProvider(this);
		}

		return angularCoordinatesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.orbit.TimedStampedAngularCoordinates} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedStampedAngularCoordinatesItemProvider timedStampedAngularCoordinatesItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.orbit.TimedStampedAngularCoordinates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedStampedAngularCoordinatesAdapter() {
		if (timedStampedAngularCoordinatesItemProvider == null) {
			timedStampedAngularCoordinatesItemProvider = new TimedStampedAngularCoordinatesItemProvider(this);
		}

		return timedStampedAngularCoordinatesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftAttitudeItemProvider spacecraftAttitudeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpacecraftAttitudeAdapter() {
		if (spacecraftAttitudeItemProvider == null) {
			spacecraftAttitudeItemProvider = new SpacecraftAttitudeItemProvider(this);
		}

		return spacecraftAttitudeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.orbit.SpacecraftState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftStateItemProvider spacecraftStateItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.orbit.SpacecraftState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpacecraftStateAdapter() {
		if (spacecraftStateItemProvider == null) {
			spacecraftStateItemProvider = new SpacecraftStateItemProvider(this);
		}

		return spacecraftStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.orbit.OrbitModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrbitModelItemProvider orbitModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.orbit.OrbitModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrbitModelAdapter() {
		if (orbitModelItemProvider == null) {
			orbitModelItemProvider = new OrbitModelItemProvider(this);
		}

		return orbitModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitFacade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__CoreEnvironmentOrbitFacadeItemProvider symphony__CoreEnvironmentOrbitFacadeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitFacade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymphony__CoreEnvironmentOrbitFacadeAdapter() {
		if (symphony__CoreEnvironmentOrbitFacadeItemProvider == null) {
			symphony__CoreEnvironmentOrbitFacadeItemProvider = new Symphony__CoreEnvironmentOrbitFacadeItemProvider(this);
		}

		return symphony__CoreEnvironmentOrbitFacadeItemProvider;
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
		if (pvaCoordinatesItemProvider != null) pvaCoordinatesItemProvider.dispose();
		if (timedStampedPVACoordinatesItemProvider != null) timedStampedPVACoordinatesItemProvider.dispose();
		if (angularCoordinatesItemProvider != null) angularCoordinatesItemProvider.dispose();
		if (timedStampedAngularCoordinatesItemProvider != null) timedStampedAngularCoordinatesItemProvider.dispose();
		if (spacecraftAttitudeItemProvider != null) spacecraftAttitudeItemProvider.dispose();
		if (spacecraftStateItemProvider != null) spacecraftStateItemProvider.dispose();
		if (orbitModelItemProvider != null) orbitModelItemProvider.dispose();
		if (symphony__CoreEnvironmentOrbitFacadeItemProvider != null) symphony__CoreEnvironmentOrbitFacadeItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link Symphony__CorePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Symphony__CoreChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends Symphony__CoreSwitch<Object> {
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
			public Object caseOrbitModelsList(OrbitModelsList object) {
				newChildDescriptors.add
					(createChildParameter
						(Symphony__CorePackage.Literals.ORBIT_MODELS_LIST__ORBIT_MODELS,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createOrbitModel()));

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
			return Symphony__CoreEnvironmentOrbitEditPlugin.INSTANCE;
		}
	}

	/**
	 * A child creation extender for the {@link Symphony__CommonTopologyPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Symphony__CommonTopologyChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends Symphony__CommonTopologySwitch<Object> {
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
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createPVACoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createTimedStampedPVACoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createAngularCoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createTimedStampedAngularCoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createSpacecraftAttitude()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createSpacecraftState()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createOrbitModel()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createSymphony__CoreEnvironmentOrbitFacade()));

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
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createPVACoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createTimedStampedPVACoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createAngularCoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createTimedStampedAngularCoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createSpacecraftAttitude()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createSpacecraftState()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createOrbitModel()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__CoreEnvironmentOrbitFactory.eINSTANCE.createSymphony__CoreEnvironmentOrbitFacade()));

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
			return Symphony__CoreEnvironmentOrbitEditPlugin.INSTANCE;
		}
	}

}