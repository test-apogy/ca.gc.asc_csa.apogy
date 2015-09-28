/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.provider;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.EMFEcoreExampleCameraFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.EMFEcoreExampleCameraPackage;
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

import ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.util.EMFEcoreExampleCameraAdapterFactory;
import ca.gc.space.topology.AggregateGroupNode;
import ca.gc.space.topology.ContentNode;
import ca.gc.space.topology.GroupNode;
import ca.gc.space.topology.TopologyPackage;
import ca.gc.space.topology.util.TopologySwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreExampleCameraItemProviderAdapterFactory extends EMFEcoreExampleCameraAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
{
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
  protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(EMFEcoreExampleCameraEditPlugin.INSTANCE, EMFEcoreExampleCameraPackage.eNS_URI);

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
  public EMFEcoreExampleCameraItemProviderAdapterFactory()
  {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.CameraStub} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraStubItemProvider cameraStubItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.CameraStub}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCameraStubAdapter() {
		if (cameraStubItemProvider == null) {
			cameraStubItemProvider = new CameraStubItemProvider(this);
		}

		return cameraStubItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.CameraSimulated} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraSimulatedItemProvider cameraSimulatedItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.CameraSimulated}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCameraSimulatedAdapter() {
		if (cameraSimulatedItemProvider == null) {
			cameraSimulatedItemProvider = new CameraSimulatedItemProvider(this);
		}

		return cameraSimulatedItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.PTUCameraStub} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTUCameraStubItemProvider ptuCameraStubItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.PTUCameraStub}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPTUCameraStubAdapter() {
		if (ptuCameraStubItemProvider == null) {
			ptuCameraStubItemProvider = new PTUCameraStubItemProvider(this);
		}

		return ptuCameraStubItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.PTUCameraSimulated} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTUCameraSimulatedItemProvider ptuCameraSimulatedItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.PTUCameraSimulated}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPTUCameraSimulatedAdapter() {
		if (ptuCameraSimulatedItemProvider == null) {
			ptuCameraSimulatedItemProvider = new PTUCameraSimulatedItemProvider(this);
		}

		return ptuCameraSimulatedItemProvider;
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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public List<IChildCreationExtender> getChildCreationExtenders()
  {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain)
  {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResourceLocator getResourceLocator()
  {
		return childCreationExtenderManager;
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
		if (cameraStubItemProvider != null) cameraStubItemProvider.dispose();
		if (cameraSimulatedItemProvider != null) cameraSimulatedItemProvider.dispose();
		if (ptuCameraStubItemProvider != null) ptuCameraStubItemProvider.dispose();
		if (ptuCameraSimulatedItemProvider != null) ptuCameraSimulatedItemProvider.dispose();
	}

  /**
	 * A child creation extender for the {@link TopologyPackage}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static class TopologyChildCreationExtender implements IChildCreationExtender
  {
    /**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    protected static class CreationSwitch extends TopologySwitch<Object>
    {
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
      CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) 
      {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
      /**
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      @Override
      public <T> Object caseContentNode(ContentNode<T> object)
      {
				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 EMFEcoreExampleCameraFactory.eINSTANCE.createCameraStub()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 EMFEcoreExampleCameraFactory.eINSTANCE.createCameraSimulated()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 EMFEcoreExampleCameraFactory.eINSTANCE.createPTUCameraStub()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 EMFEcoreExampleCameraFactory.eINSTANCE.createPTUCameraSimulated()));

				return null;
			}
 
      /**
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      @Override
      public Object caseGroupNode(GroupNode object)
      {
				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 EMFEcoreExampleCameraFactory.eINSTANCE.createCameraStub()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 EMFEcoreExampleCameraFactory.eINSTANCE.createCameraSimulated()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 EMFEcoreExampleCameraFactory.eINSTANCE.createPTUCameraStub()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 EMFEcoreExampleCameraFactory.eINSTANCE.createPTUCameraSimulated()));

				return null;
			}
 
      /**
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      @Override
      public Object caseAggregateGroupNode(AggregateGroupNode object)
      {
				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 EMFEcoreExampleCameraFactory.eINSTANCE.createCameraStub()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 EMFEcoreExampleCameraFactory.eINSTANCE.createCameraSimulated()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 EMFEcoreExampleCameraFactory.eINSTANCE.createPTUCameraStub()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 EMFEcoreExampleCameraFactory.eINSTANCE.createPTUCameraSimulated()));

				return null;
			}
 
      /**
			 * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
			 * @generated
			 */
      protected CommandParameter createChildParameter(Object feature, Object child)
      {
				return new CommandParameter(null, feature, child);
			}

    }

    /**
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain)
    {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

    /**
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    public ResourceLocator getResourceLocator()
    {
			return EMFEcoreExampleCameraEditPlugin.INSTANCE;
		}
  }

}
