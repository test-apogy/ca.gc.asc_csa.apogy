/**
 * Canadian Space Agency 2007.
 *
 * $Id: PoseItemProviderAdapterFactory.java,v 1.3.4.2 2015/05/21 15:50:00 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose.provider;

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
import org.eclipse.symphony.addons.sensors.pose.util.PoseAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PoseItemProviderAdapterFactory extends PoseAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

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
	public PoseItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.pose.PositionSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionSensorItemProvider positionSensorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.pose.PositionSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPositionSensorAdapter()
	{
		if (positionSensorItemProvider == null) {
			positionSensorItemProvider = new PositionSensorItemProvider(this);
		}

		return positionSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.pose.OrientationSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrientationSensorItemProvider orientationSensorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.pose.OrientationSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrientationSensorAdapter()
	{
		if (orientationSensorItemProvider == null) {
			orientationSensorItemProvider = new OrientationSensorItemProvider(this);
		}

		return orientationSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.pose.PoseSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoseSensorItemProvider poseSensorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.pose.PoseSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPoseSensorAdapter()
	{
		if (poseSensorItemProvider == null) {
			poseSensorItemProvider = new PoseSensorItemProvider(this);
		}

		return poseSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.pose.SelfPlaceSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfPlaceSensorItemProvider selfPlaceSensorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.pose.SelfPlaceSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelfPlaceSensorAdapter()
	{
		if (selfPlaceSensorItemProvider == null) {
			selfPlaceSensorItemProvider = new SelfPlaceSensorItemProvider(this);
		}

		return selfPlaceSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulatedPositionSensorItemProvider simulatedPositionSensorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimulatedPositionSensorAdapter()
	{
		if (simulatedPositionSensorItemProvider == null) {
			simulatedPositionSensorItemProvider = new SimulatedPositionSensorItemProvider(this);
		}

		return simulatedPositionSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulatedOrientationSensorItemProvider simulatedOrientationSensorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimulatedOrientationSensorAdapter()
	{
		if (simulatedOrientationSensorItemProvider == null) {
			simulatedOrientationSensorItemProvider = new SimulatedOrientationSensorItemProvider(this);
		}

		return simulatedOrientationSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulatedPoseSensorItemProvider simulatedPoseSensorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.pose.SimulatedPoseSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimulatedPoseSensorAdapter()
	{
		if (simulatedPoseSensorItemProvider == null) {
			simulatedPoseSensorItemProvider = new SimulatedPoseSensorItemProvider(this);
		}

		return simulatedPoseSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.pose.CSVDataLogger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSVDataLoggerItemProvider csvDataLoggerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.pose.CSVDataLogger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCSVDataLoggerAdapter() {
		if (csvDataLoggerItemProvider == null) {
			csvDataLoggerItemProvider = new CSVDataLoggerItemProvider(this);
		}

		return csvDataLoggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.pose.PoseFacade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoseFacadeItemProvider poseFacadeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.pose.PoseFacade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPoseFacadeAdapter() {
		if (poseFacadeItemProvider == null) {
			poseFacadeItemProvider = new PoseFacadeItemProvider(this);
		}

		return poseFacadeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InertialMeasurementUnitItemProvider inertialMeasurementUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.addons.sensors.pose.InertialMeasurementUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInertialMeasurementUnitAdapter() {
		if (inertialMeasurementUnitItemProvider == null) {
			inertialMeasurementUnitItemProvider = new InertialMeasurementUnitItemProvider(this);
		}

		return inertialMeasurementUnitItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory()
	{
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
	{
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type)
	{
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type)
	{
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type)
	{
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
	public void addListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification)
	{
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
	public void dispose()
	{
		if (positionSensorItemProvider != null) positionSensorItemProvider.dispose();
		if (orientationSensorItemProvider != null) orientationSensorItemProvider.dispose();
		if (poseSensorItemProvider != null) poseSensorItemProvider.dispose();
		if (selfPlaceSensorItemProvider != null) selfPlaceSensorItemProvider.dispose();
		if (simulatedPositionSensorItemProvider != null) simulatedPositionSensorItemProvider.dispose();
		if (simulatedOrientationSensorItemProvider != null) simulatedOrientationSensorItemProvider.dispose();
		if (simulatedPoseSensorItemProvider != null) simulatedPoseSensorItemProvider.dispose();
		if (csvDataLoggerItemProvider != null) csvDataLoggerItemProvider.dispose();
		if (poseFacadeItemProvider != null) poseFacadeItemProvider.dispose();
		if (inertialMeasurementUnitItemProvider != null) inertialMeasurementUnitItemProvider.dispose();
	}

}