/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data25d.provider;

import ca.gc.space.mrt.geometry.data25d.Data25dFactory;
import ca.gc.space.mrt.geometry.data25d.Data25dPackage;
import ca.gc.space.mrt.geometry.data25d.util.Data25dAdapterFactory;

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
import org.eclipse.symphony.common.geometry.data.Coordinates;
import org.eclipse.symphony.common.geometry.data.CoordinatesSet;
import org.eclipse.symphony.common.geometry.data.DataPackage;
import org.eclipse.symphony.common.geometry.data.Mesh;
import org.eclipse.symphony.common.geometry.data.Polygon;
import org.eclipse.symphony.common.geometry.data.util.DataSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Data25dItemProviderAdapterFactory extends Data25dAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(Data25dEditPlugin.INSTANCE, Data25dPackage.eNS_URI);

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
	public Data25dItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.mrt.geometry.data25d.Coordinates25D} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Coordinates25DItemProvider coordinates25DItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.mrt.geometry.data25d.Coordinates25D}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoordinates25DAdapter() {
		if (coordinates25DItemProvider == null) {
			coordinates25DItemProvider = new Coordinates25DItemProvider(this);
		}

		return coordinates25DItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.mrt.geometry.data25d.CoordinatesSet25D} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinatesSet25DItemProvider coordinatesSet25DItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.mrt.geometry.data25d.CoordinatesSet25D}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoordinatesSet25DAdapter() {
		if (coordinatesSet25DItemProvider == null) {
			coordinatesSet25DItemProvider = new CoordinatesSet25DItemProvider(this);
		}

		return coordinatesSet25DItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.mrt.geometry.data25d.VolumetricCoordinatesSet25D} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumetricCoordinatesSet25DItemProvider volumetricCoordinatesSet25DItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.mrt.geometry.data25d.VolumetricCoordinatesSet25D}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVolumetricCoordinatesSet25DAdapter() {
		if (volumetricCoordinatesSet25DItemProvider == null) {
			volumetricCoordinatesSet25DItemProvider = new VolumetricCoordinatesSet25DItemProvider(this);
		}

		return volumetricCoordinatesSet25DItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.mrt.geometry.data25d.Polygon25D} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Polygon25DItemProvider polygon25DItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.mrt.geometry.data25d.Polygon25D}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolygon25DAdapter() {
		if (polygon25DItemProvider == null) {
			polygon25DItemProvider = new Polygon25DItemProvider(this);
		}

		return polygon25DItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.mrt.geometry.data25d.Mesh25D} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mesh25DItemProvider mesh25DItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.mrt.geometry.data25d.Mesh25D}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMesh25DAdapter() {
		if (mesh25DItemProvider == null) {
			mesh25DItemProvider = new Mesh25DItemProvider(this);
		}

		return mesh25DItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.mrt.geometry.data25d.VolumetricMesh25D} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumetricMesh25DItemProvider volumetricMesh25DItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.mrt.geometry.data25d.VolumetricMesh25D}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVolumetricMesh25DAdapter() {
		if (volumetricMesh25DItemProvider == null) {
			volumetricMesh25DItemProvider = new VolumetricMesh25DItemProvider(this);
		}

		return volumetricMesh25DItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.mrt.geometry.data25d.DataFacade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFacadeItemProvider dataFacadeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.mrt.geometry.data25d.DataFacade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataFacadeAdapter() {
		if (dataFacadeItemProvider == null) {
			dataFacadeItemProvider = new DataFacadeItemProvider(this);
		}

		return dataFacadeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.space.mrt.geometry.data25d.Data25DIO} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Data25DIOItemProvider data25DIOItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.space.mrt.geometry.data25d.Data25DIO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createData25DIOAdapter() {
		if (data25DIOItemProvider == null) {
			data25DIOItemProvider = new Data25DIOItemProvider(this);
		}

		return data25DIOItemProvider;
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
		if (coordinates25DItemProvider != null) coordinates25DItemProvider.dispose();
		if (coordinatesSet25DItemProvider != null) coordinatesSet25DItemProvider.dispose();
		if (volumetricCoordinatesSet25DItemProvider != null) volumetricCoordinatesSet25DItemProvider.dispose();
		if (polygon25DItemProvider != null) polygon25DItemProvider.dispose();
		if (mesh25DItemProvider != null) mesh25DItemProvider.dispose();
		if (volumetricMesh25DItemProvider != null) volumetricMesh25DItemProvider.dispose();
		if (dataFacadeItemProvider != null) dataFacadeItemProvider.dispose();
		if (data25DIOItemProvider != null) data25DIOItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link DataPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class DataChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends DataSwitch<Object> {
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
			public <T extends Coordinates> Object caseCoordinatesSet(CoordinatesSet<T> object) {
				newChildDescriptors.add
					(createChildParameter
						(DataPackage.Literals.COORDINATES_SET__POINTS,
						 Data25dFactory.eINSTANCE.createCoordinates25D()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> Object caseMesh(Mesh<CoordinatesType, PolygonType> object) {
				newChildDescriptors.add
					(createChildParameter
						(DataPackage.Literals.MESH__POLYGONS,
						 Data25dFactory.eINSTANCE.createPolygon25D()));

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
			return Data25dEditPlugin.INSTANCE;
		}
	}

}
