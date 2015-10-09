/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui.provider;

import ca.gc.space.topology.AggregateContentNode;
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
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIFactory;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage;
import org.eclipse.symphony.core.environment.ui.util.SymphonyEnvironmentUIAdapterFactory;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.ToolsList;
import org.eclipse.symphony.core.invocator.util.EMFEcoreInvocatorSwitch;

import ca.gc.space.topology.ContentNode;
import ca.gc.space.topology.TopologyPackage;
import ca.gc.space.topology.ui.TopologyPresentationRegistry;
import ca.gc.space.topology.ui.TopologyUIPackage;
import ca.gc.space.topology.ui.util.TopologyUISwitch;
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
public class SymphonyEnvironmentUIItemProviderAdapterFactory extends SymphonyEnvironmentUIAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
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
  protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(SymphonyEnvironmentUIEditPlugin.INSTANCE, SymphonyEnvironmentUIPackage.eNS_URI);

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
  public SymphonyEnvironmentUIItemProviderAdapterFactory()
  {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.StarFieldPresentation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected StarFieldPresentationItemProvider starFieldPresentationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.StarFieldPresentation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createStarFieldPresentationAdapter()
  {
		if (starFieldPresentationItemProvider == null) {
			starFieldPresentationItemProvider = new StarFieldPresentationItemProvider(this);
		}

		return starFieldPresentationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.SunPresentation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SunPresentationItemProvider sunPresentationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.SunPresentation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createSunPresentationAdapter()
  {
		if (sunPresentationItemProvider == null) {
			sunPresentationItemProvider = new SunPresentationItemProvider(this);
		}

		return sunPresentationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EarthSurfaceWorksitePresentationItemProvider earthSurfaceWorksitePresentationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createEarthSurfaceWorksitePresentationAdapter()
  {
		if (earthSurfaceWorksitePresentationItemProvider == null) {
			earthSurfaceWorksitePresentationItemProvider = new EarthSurfaceWorksitePresentationItemProvider(this);
		}

		return earthSurfaceWorksitePresentationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.EarthSkyPresentation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EarthSkyPresentationItemProvider earthSkyPresentationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.EarthSkyPresentation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createEarthSkyPresentationAdapter()
  {
		if (earthSkyPresentationItemProvider == null) {
			earthSkyPresentationItemProvider = new EarthSkyPresentationItemProvider(this);
		}

		return earthSkyPresentationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.MoonPresentation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MoonPresentationItemProvider moonPresentationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.MoonPresentation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createMoonPresentationAdapter()
  {
		if (moonPresentationItemProvider == null) {
			moonPresentationItemProvider = new MoonPresentationItemProvider(this);
		}

		return moonPresentationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.FeatureOfInterestNodePresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureOfInterestNodePresentationItemProvider featureOfInterestNodePresentationItemProvider;

		/**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.FeatureOfInterestNodePresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureOfInterestNodePresentationAdapter() {
		if (featureOfInterestNodePresentationItemProvider == null) {
			featureOfInterestNodePresentationItemProvider = new FeatureOfInterestNodePresentationItemProvider(this);
		}

		return featureOfInterestNodePresentationItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EnvironmentUiUtilitiesItemProvider environmentUiUtilitiesItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createEnvironmentUiUtilitiesAdapter()
  {
		if (environmentUiUtilitiesItemProvider == null) {
			environmentUiUtilitiesItemProvider = new EnvironmentUiUtilitiesItemProvider(this);
		}

		return environmentUiUtilitiesItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EnvironmentUiFacadeItemProvider environmentUiFacadeItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createEnvironmentUiFacadeAdapter()
  {
		if (environmentUiFacadeItemProvider == null) {
			environmentUiFacadeItemProvider = new EnvironmentUiFacadeItemProvider(this);
		}

		return environmentUiFacadeItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.MapViewConfigurationList} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MapViewConfigurationListItemProvider mapViewConfigurationListItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.MapViewConfigurationList}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createMapViewConfigurationListAdapter()
  {
		if (mapViewConfigurationListItemProvider == null) {
			mapViewConfigurationListItemProvider = new MapViewConfigurationListItemProvider(this);
		}

		return mapViewConfigurationListItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.MapViewConfiguration} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MapViewConfigurationItemProvider mapViewConfigurationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.MapViewConfiguration}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createMapViewConfigurationAdapter()
  {
		if (mapViewConfigurationItemProvider == null) {
			mapViewConfigurationItemProvider = new MapViewConfigurationItemProvider(this);
		}

		return mapViewConfigurationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.FeaturesOfInterestMapLayerPresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturesOfInterestMapLayerPresentationItemProvider featuresOfInterestMapLayerPresentationItemProvider;

		/**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.FeaturesOfInterestMapLayerPresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeaturesOfInterestMapLayerPresentationAdapter() {
		if (featuresOfInterestMapLayerPresentationItemProvider == null) {
			featuresOfInterestMapLayerPresentationItemProvider = new FeaturesOfInterestMapLayerPresentationItemProvider(this);
		}

		return featuresOfInterestMapLayerPresentationItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.MapRuler} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MapRulerItemProvider mapRulerItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.MapRuler}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createMapRulerAdapter()
  {
		if (mapRulerItemProvider == null) {
			mapRulerItemProvider = new MapRulerItemProvider(this);
		}

		return mapRulerItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.TrajectoryPickingTool} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TrajectoryPickingToolItemProvider trajectoryPickingToolItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.TrajectoryPickingTool}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createTrajectoryPickingToolAdapter()
  {
		if (trajectoryPickingToolItemProvider == null) {
			trajectoryPickingToolItemProvider = new TrajectoryPickingToolItemProvider(this);
		}

		return trajectoryPickingToolItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DefaultVariableTrajectoryProviderItemProvider defaultVariableTrajectoryProviderItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createDefaultVariableTrajectoryProviderAdapter()
  {
		if (defaultVariableTrajectoryProviderItemProvider == null) {
			defaultVariableTrajectoryProviderItemProvider = new DefaultVariableTrajectoryProviderItemProvider(this);
		}

		return defaultVariableTrajectoryProviderItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PoseVariableAnnotationItemProvider poseVariableAnnotationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createPoseVariableAnnotationAdapter()
  {
		if (poseVariableAnnotationItemProvider == null) {
			poseVariableAnnotationItemProvider = new PoseVariableAnnotationItemProvider(this);
		}

		return poseVariableAnnotationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryAnnotation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VariableTrajectoryAnnotationItemProvider variableTrajectoryAnnotationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryAnnotation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createVariableTrajectoryAnnotationAdapter()
  {
		if (variableTrajectoryAnnotationItemProvider == null) {
			variableTrajectoryAnnotationItemProvider = new VariableTrajectoryAnnotationItemProvider(this);
		}

		return variableTrajectoryAnnotationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VehicleVariableAnnotationItemProvider vehicleVariableAnnotationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createVehicleVariableAnnotationAdapter()
  {
		if (vehicleVariableAnnotationItemProvider == null) {
			vehicleVariableAnnotationItemProvider = new VehicleVariableAnnotationItemProvider(this);
		}

		return vehicleVariableAnnotationItemProvider;
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
		if (starFieldPresentationItemProvider != null) starFieldPresentationItemProvider.dispose();
		if (sunPresentationItemProvider != null) sunPresentationItemProvider.dispose();
		if (earthSurfaceWorksitePresentationItemProvider != null) earthSurfaceWorksitePresentationItemProvider.dispose();
		if (earthSkyPresentationItemProvider != null) earthSkyPresentationItemProvider.dispose();
		if (moonPresentationItemProvider != null) moonPresentationItemProvider.dispose();
		if (featureOfInterestNodePresentationItemProvider != null) featureOfInterestNodePresentationItemProvider.dispose();
		if (environmentUiUtilitiesItemProvider != null) environmentUiUtilitiesItemProvider.dispose();
		if (environmentUiFacadeItemProvider != null) environmentUiFacadeItemProvider.dispose();
		if (mapViewConfigurationListItemProvider != null) mapViewConfigurationListItemProvider.dispose();
		if (mapViewConfigurationItemProvider != null) mapViewConfigurationItemProvider.dispose();
		if (mapRulerItemProvider != null) mapRulerItemProvider.dispose();
		if (featuresOfInterestMapLayerPresentationItemProvider != null) featuresOfInterestMapLayerPresentationItemProvider.dispose();
		if (trajectoryPickingToolItemProvider != null) trajectoryPickingToolItemProvider.dispose();
		if (defaultVariableTrajectoryProviderItemProvider != null) defaultVariableTrajectoryProviderItemProvider.dispose();
		if (poseVariableAnnotationItemProvider != null) poseVariableAnnotationItemProvider.dispose();
		if (variableTrajectoryAnnotationItemProvider != null) variableTrajectoryAnnotationItemProvider.dispose();
		if (vehicleVariableAnnotationItemProvider != null) vehicleVariableAnnotationItemProvider.dispose();
	}

  /**
	 * A child creation extender for the {@link TopologyUIPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class TopologyUIChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends TopologyUISwitch<Object> {
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
			public Object caseTopologyPresentationRegistry(TopologyPresentationRegistry object) {
				newChildDescriptors.add
					(createChildParameter
						(TopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createStarFieldPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createSunPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createEarthSurfaceWorksitePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createEarthSkyPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createMoonPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createFeatureOfInterestNodePresentation()));

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
			return SymphonyEnvironmentUIEditPlugin.INSTANCE;
		}
	}

		/**
	 * A child creation extender for the {@link EMFEcoreInvocatorPackage}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static class EMFEcoreInvocatorChildCreationExtender implements IChildCreationExtender
  {
    /**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    protected static class CreationSwitch extends EMFEcoreInvocatorSwitch<Object>
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
      public Object caseToolsList(ToolsList object)
      {
				newChildDescriptors.add
					(createChildParameter
						(EMFEcoreInvocatorPackage.Literals.TOOLS_LIST__TOOLS_LIST_CONTAINERS,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createMapViewConfigurationList()));

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
			return SymphonyEnvironmentUIEditPlugin.INSTANCE;
		}
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
						 SymphonyEnvironmentUIFactory.eINSTANCE.createStarFieldPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createSunPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createEarthSurfaceWorksitePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createEarthSkyPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createMoonPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createFeatureOfInterestNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createEnvironmentUiUtilities()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createEnvironmentUiFacade()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createMapViewConfigurationList()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createMapViewConfiguration()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createMapRuler()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createFeaturesOfInterestMapLayerPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createTrajectoryPickingTool()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createDefaultVariableTrajectoryProvider()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createPoseVariableAnnotation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createVariableTrajectoryAnnotation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createVehicleVariableAnnotation()));

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
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createStarFieldPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createSunPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createEarthSurfaceWorksitePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createEarthSkyPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createMoonPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createFeatureOfInterestNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createEnvironmentUiUtilities()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createEnvironmentUiFacade()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createMapViewConfigurationList()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createMapViewConfiguration()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createMapRuler()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createFeaturesOfInterestMapLayerPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createTrajectoryPickingTool()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createDefaultVariableTrajectoryProvider()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createPoseVariableAnnotation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createVariableTrajectoryAnnotation()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 SymphonyEnvironmentUIFactory.eINSTANCE.createVehicleVariableAnnotation()));

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
			return SymphonyEnvironmentUIEditPlugin.INSTANCE;
		}
  }

}
