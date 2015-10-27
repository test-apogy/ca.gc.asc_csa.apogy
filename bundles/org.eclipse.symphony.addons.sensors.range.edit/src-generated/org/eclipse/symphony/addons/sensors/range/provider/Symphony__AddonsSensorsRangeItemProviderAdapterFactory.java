/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range.provider;

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

import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangeFactory;
import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage;

import org.eclipse.symphony.addons.sensors.range.util.Symphony__AddonsSensorsRangeAdapterFactory;

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
public class Symphony__AddonsSensorsRangeItemProviderAdapterFactory extends Symphony__AddonsSensorsRangeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(Symphony__AddonsSensorsRangeEditPlugin.INSTANCE, Symphony__AddonsSensorsRangePackage.eNS_URI);

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
	public Symphony__AddonsSensorsRangeItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.RayData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RayDataItemProvider rayDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.RayData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRayDataAdapter() {
		if (rayDataItemProvider == null) {
			rayDataItemProvider = new RayDataItemProvider(this);
		}

		return rayDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.RasterScanSettings} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RasterScanSettingsItemProvider rasterScanSettingsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.RasterScanSettings}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRasterScanSettingsAdapter() {
		if (rasterScanSettingsItemProvider == null) {
			rasterScanSettingsItemProvider = new RasterScanSettingsItemProvider(this);
		}

		return rasterScanSettingsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.RangeSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeSensorItemProvider rangeSensorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.RangeSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRangeSensorAdapter() {
		if (rangeSensorItemProvider == null) {
			rangeSensorItemProvider = new RangeSensorItemProvider(this);
		}

		return rangeSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.ContactSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactSensorItemProvider contactSensorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.ContactSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContactSensorAdapter() {
		if (contactSensorItemProvider == null) {
			contactSensorItemProvider = new ContactSensorItemProvider(this);
		}

		return contactSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.SimpleRangeSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleRangeSensorItemProvider simpleRangeSensorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.SimpleRangeSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleRangeSensorAdapter() {
		if (simpleRangeSensorItemProvider == null) {
			simpleRangeSensorItemProvider = new SimpleRangeSensorItemProvider(this);
		}

		return simpleRangeSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.SimpleSonar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSonarItemProvider simpleSonarItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.SimpleSonar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleSonarAdapter() {
		if (simpleSonarItemProvider == null) {
			simpleSonarItemProvider = new SimpleSonarItemProvider(this);
		}

		return simpleSonarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.LineRangeScanner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineRangeScannerItemProvider lineRangeScannerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.LineRangeScanner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLineRangeScannerAdapter() {
		if (lineRangeScannerItemProvider == null) {
			lineRangeScannerItemProvider = new LineRangeScannerItemProvider(this);
		}

		return lineRangeScannerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.SimpleLineRangeScanner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleLineRangeScannerItemProvider simpleLineRangeScannerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.SimpleLineRangeScanner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleLineRangeScannerAdapter() {
		if (simpleLineRangeScannerItemProvider == null) {
			simpleLineRangeScannerItemProvider = new SimpleLineRangeScannerItemProvider(this);
		}

		return simpleLineRangeScannerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.RangeScanner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeScannerItemProvider rangeScannerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.RangeScanner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRangeScannerAdapter() {
		if (rangeScannerItemProvider == null) {
			rangeScannerItemProvider = new RangeScannerItemProvider(this);
		}

		return rangeScannerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.RasterScanRangeSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RasterScanRangeSensorItemProvider rasterScanRangeSensorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.RasterScanRangeSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRasterScanRangeSensorAdapter() {
		if (rasterScanRangeSensorItemProvider == null) {
			rasterScanRangeSensorItemProvider = new RasterScanRangeSensorItemProvider(this);
		}

		return rasterScanRangeSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScanner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleRasterScanRangeScannerItemProvider simpleRasterScanRangeScannerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScanner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleRasterScanRangeScannerAdapter() {
		if (simpleRasterScanRangeScannerItemProvider == null) {
			simpleRasterScanRangeScannerItemProvider = new SimpleRasterScanRangeScannerItemProvider(this);
		}

		return simpleRasterScanRangeScannerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleRasterScanRangeScannerSimulatorItemProvider simpleRasterScanRangeScannerSimulatorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleRasterScanRangeScannerSimulatorAdapter() {
		if (simpleRasterScanRangeScannerSimulatorItemProvider == null) {
			simpleRasterScanRangeScannerSimulatorItemProvider = new SimpleRasterScanRangeScannerSimulatorItemProvider(this);
		}

		return simpleRasterScanRangeScannerSimulatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.RasterScanData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RasterScanDataItemProvider rasterScanDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.RasterScanData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRasterScanDataAdapter() {
		if (rasterScanDataItemProvider == null) {
			rasterScanDataItemProvider = new RasterScanDataItemProvider(this);
		}

		return rasterScanDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangeFacade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__AddonsSensorsRangeFacadeItemProvider symphony__AddonsSensorsRangeFacadeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangeFacade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymphony__AddonsSensorsRangeFacadeAdapter() {
		if (symphony__AddonsSensorsRangeFacadeItemProvider == null) {
			symphony__AddonsSensorsRangeFacadeItemProvider = new Symphony__AddonsSensorsRangeFacadeItemProvider(this);
		}

		return symphony__AddonsSensorsRangeFacadeItemProvider;
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
		if (rayDataItemProvider != null) rayDataItemProvider.dispose();
		if (rasterScanSettingsItemProvider != null) rasterScanSettingsItemProvider.dispose();
		if (rangeSensorItemProvider != null) rangeSensorItemProvider.dispose();
		if (contactSensorItemProvider != null) contactSensorItemProvider.dispose();
		if (simpleRangeSensorItemProvider != null) simpleRangeSensorItemProvider.dispose();
		if (simpleSonarItemProvider != null) simpleSonarItemProvider.dispose();
		if (lineRangeScannerItemProvider != null) lineRangeScannerItemProvider.dispose();
		if (simpleLineRangeScannerItemProvider != null) simpleLineRangeScannerItemProvider.dispose();
		if (rangeScannerItemProvider != null) rangeScannerItemProvider.dispose();
		if (rasterScanRangeSensorItemProvider != null) rasterScanRangeSensorItemProvider.dispose();
		if (simpleRasterScanRangeScannerItemProvider != null) simpleRasterScanRangeScannerItemProvider.dispose();
		if (simpleRasterScanRangeScannerSimulatorItemProvider != null) simpleRasterScanRangeScannerSimulatorItemProvider.dispose();
		if (rasterScanDataItemProvider != null) rasterScanDataItemProvider.dispose();
		if (symphony__AddonsSensorsRangeFacadeItemProvider != null) symphony__AddonsSensorsRangeFacadeItemProvider.dispose();
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
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRayData()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanSettings()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRangeSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createContactSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleRangeSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleSonar()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createLineRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleLineRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanRangeSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleRasterScanRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleRasterScanRangeScannerSimulator()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanData()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSymphony__AddonsSensorsRangeFacade()));

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
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRayData()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanSettings()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRangeSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createContactSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleRangeSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleSonar()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createLineRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleLineRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanRangeSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleRasterScanRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleRasterScanRangeScannerSimulator()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanData()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSymphony__AddonsSensorsRangeFacade()));

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
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanSettings()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRangeSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createContactSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleRangeSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleSonar()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createLineRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleLineRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanRangeSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleRasterScanRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleRasterScanRangeScannerSimulator()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanData()));

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
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanSettings()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRangeSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createContactSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleRangeSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleSonar()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createLineRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleLineRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanRangeSensor()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleRasterScanRangeScanner()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createSimpleRasterScanRangeScannerSimulator()));

				newChildDescriptors.add
					(createChildParameter
						(Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanData()));

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
			return Symphony__AddonsSensorsRangeEditPlugin.INSTANCE;
		}
	}

}
