/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.gps.provider;

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

import org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSFactory;
import org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage;

import org.eclipse.symphony.addons.sensors.gps.util.Symphony__AddonsSensorsGPSAdapterFactory;

import org.eclipse.symphony.common.topology.AggregateContentNode;
import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.ContentNode;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;

import org.eclipse.symphony.common.topology.util.Symphony__CommonTopologySwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsGPSItemProviderAdapterFactory extends Symphony__AddonsSensorsGPSAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(Symphony__AddonsSensorsGPSEditPlugin.INSTANCE, Symphony__AddonsSensorsGPSPackage.eNS_URI);

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
	public Symphony__AddonsSensorsGPSItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.gps.GPSReading} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPSReadingItemProvider gpsReadingItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.gps.GPSReading}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGPSReadingAdapter() {
		if (gpsReadingItemProvider == null) {
			gpsReadingItemProvider = new GPSReadingItemProvider(this);
		}

		return gpsReadingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPSPoseSensorItemProvider gpsPoseSensorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.gps.GPSPoseSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGPSPoseSensorAdapter() {
		if (gpsPoseSensorItemProvider == null) {
			gpsPoseSensorItemProvider = new GPSPoseSensorItemProvider(this);
		}

		return gpsPoseSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.gps.GPS} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPSItemProvider gpsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.gps.GPS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGPSAdapter() {
		if (gpsItemProvider == null) {
			gpsItemProvider = new GPSItemProvider(this);
		}

		return gpsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.gps.MarkedGPS} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkedGPSItemProvider markedGPSItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.gps.MarkedGPS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMarkedGPSAdapter() {
		if (markedGPSItemProvider == null) {
			markedGPSItemProvider = new MarkedGPSItemProvider(this);
		}

		return markedGPSItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSFacade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__AddonsSensorsGPSFacadeItemProvider symphony__AddonsSensorsGPSFacadeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSFacade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymphony__AddonsSensorsGPSFacadeAdapter() {
		if (symphony__AddonsSensorsGPSFacadeItemProvider == null) {
			symphony__AddonsSensorsGPSFacadeItemProvider = new Symphony__AddonsSensorsGPSFacadeItemProvider(this);
		}

		return symphony__AddonsSensorsGPSFacadeItemProvider;
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
		if (gpsReadingItemProvider != null) gpsReadingItemProvider.dispose();
		if (gpsPoseSensorItemProvider != null) gpsPoseSensorItemProvider.dispose();
		if (gpsItemProvider != null) gpsItemProvider.dispose();
		if (markedGPSItemProvider != null) markedGPSItemProvider.dispose();
		if (symphony__AddonsSensorsGPSFacadeItemProvider != null) symphony__AddonsSensorsGPSFacadeItemProvider.dispose();
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
						 Symphony__AddonsSensorsGPSFactory.eINSTANCE.createGPSReading()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsGPSFactory.eINSTANCE.createGPSPoseSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsGPSFactory.eINSTANCE.createGPS()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsGPSFactory.eINSTANCE.createMarkedGPS()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsGPSFactory.eINSTANCE.createSymphony__AddonsSensorsGPSFacade()));

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
						 Symphony__AddonsSensorsGPSFactory.eINSTANCE.createGPSReading()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsGPSFactory.eINSTANCE.createGPSPoseSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsGPSFactory.eINSTANCE.createGPS()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsGPSFactory.eINSTANCE.createMarkedGPS()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsGPSFactory.eINSTANCE.createSymphony__AddonsSensorsGPSFacade()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseGroupNode(GroupNode object) {
				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 Symphony__AddonsSensorsGPSFactory.eINSTANCE.createGPSPoseSensor()));

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
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 Symphony__AddonsSensorsGPSFactory.eINSTANCE.createGPSPoseSensor()));

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
			return Symphony__AddonsSensorsGPSEditPlugin.INSTANCE;
		}
	}

}
