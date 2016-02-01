/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.provider;

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
import ca.gc.asc_csa.apogy.core.OrbitModelsList;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFactory;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.util.ApogyCoreEnvironmentOrbitAdapterFactory;
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
public class ApogyCoreEnvironmentOrbitItemProviderAdapterFactory extends ApogyCoreEnvironmentOrbitAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(ApogyCoreEnvironmentOrbitEditPlugin.INSTANCE, ApogyCoreEnvironmentOrbitPackage.eNS_URI);

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
	public ApogyCoreEnvironmentOrbitItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PVACoordinatesItemProvider pvaCoordinatesItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedPVACoordinates} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedStampedPVACoordinatesItemProvider timedStampedPVACoordinatesItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedPVACoordinates}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.AngularCoordinates} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngularCoordinatesItemProvider angularCoordinatesItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.AngularCoordinates}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedAngularCoordinates} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedStampedAngularCoordinatesItemProvider timedStampedAngularCoordinatesItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedAngularCoordinates}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftAttitude} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftAttitudeItemProvider spacecraftAttitudeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftAttitude}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftStateItemProvider spacecraftStateItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.InitialOrbitContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialOrbitContainerItemProvider initialOrbitContainerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.InitialOrbitContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInitialOrbitContainerAdapter() {
		if (initialOrbitContainerItemProvider == null) {
			initialOrbitContainerItemProvider = new InitialOrbitContainerItemProvider(this);
		}

		return initialOrbitContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrbitModelItemProvider orbitModelItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFacade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreEnvironmentOrbitFacadeItemProvider apogyCoreEnvironmentOrbitFacadeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFacade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApogyCoreEnvironmentOrbitFacadeAdapter() {
		if (apogyCoreEnvironmentOrbitFacadeItemProvider == null) {
			apogyCoreEnvironmentOrbitFacadeItemProvider = new ApogyCoreEnvironmentOrbitFacadeItemProvider(this);
		}

		return apogyCoreEnvironmentOrbitFacadeItemProvider;
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
		if (initialOrbitContainerItemProvider != null) initialOrbitContainerItemProvider.dispose();
		if (orbitModelItemProvider != null) orbitModelItemProvider.dispose();
		if (apogyCoreEnvironmentOrbitFacadeItemProvider != null) apogyCoreEnvironmentOrbitFacadeItemProvider.dispose();
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
			public Object caseOrbitModelsList(OrbitModelsList object) {
				newChildDescriptors.add
					(createChildParameter
						(ApogyCorePackage.Literals.ORBIT_MODELS_LIST__ORBIT_MODELS,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createOrbitModel()));

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
			return ApogyCoreEnvironmentOrbitEditPlugin.INSTANCE;
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
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createPVACoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createTimedStampedPVACoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createAngularCoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createTimedStampedAngularCoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createSpacecraftAttitude()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createSpacecraftState()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createInitialOrbitContainer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createOrbitModel()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createApogyCoreEnvironmentOrbitFacade()));

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
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createPVACoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createTimedStampedPVACoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createAngularCoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createTimedStampedAngularCoordinates()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createSpacecraftAttitude()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createSpacecraftState()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createInitialOrbitContainer()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createOrbitModel()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentOrbitFactory.eINSTANCE.createApogyCoreEnvironmentOrbitFacade()));

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
			return ApogyCoreEnvironmentOrbitEditPlugin.INSTANCE;
		}
	}

}
