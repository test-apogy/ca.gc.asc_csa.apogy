package ca.gc.asc_csa.apogy.core.environment.ui.provider;
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
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry;
import ca.gc.asc_csa.apogy.common.topology.ui.util.ApogyCommonTopologyUISwitch;
import ca.gc.asc_csa.apogy.common.topology.util.ApogyCommonTopologySwitch;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFactory;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.ui.util.ApogyCoreEnvironmentUIAdapterFactory;
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
public class ApogyCoreEnvironmentUIItemProviderAdapterFactory extends ApogyCoreEnvironmentUIAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
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
  protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(ApogyCoreEnvironmentUIEditPlugin.INSTANCE, ApogyCoreEnvironmentUIPackage.eNS_URI);

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
  public ApogyCoreEnvironmentUIItemProviderAdapterFactory()
  {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.StarFieldPresentation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected StarFieldPresentationItemProvider starFieldPresentationItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.StarFieldPresentation}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.SunPresentation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SunPresentationItemProvider sunPresentationItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.SunPresentation}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EarthSurfaceWorksitePresentationItemProvider earthSurfaceWorksitePresentationItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSkyPresentation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EarthSkyPresentationItemProvider earthSkyPresentationItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSkyPresentation}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.MoonPresentation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MoonPresentationItemProvider moonPresentationItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.MoonPresentation}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.FeatureOfInterestNodePresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureOfInterestNodePresentationItemProvider featureOfInterestNodePresentationItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.FeatureOfInterestNodePresentation}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.EnvironmentUIUtilities} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EnvironmentUIUtilitiesItemProvider environmentUIUtilitiesItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.EnvironmentUIUtilities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnvironmentUIUtilitiesAdapter() {
		if (environmentUIUtilitiesItemProvider == null) {
			environmentUIUtilitiesItemProvider = new EnvironmentUIUtilitiesItemProvider(this);
		}

		return environmentUIUtilitiesItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFacade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreEnvironmentUIFacadeItemProvider apogyCoreEnvironmentUIFacadeItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFacade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApogyCoreEnvironmentUIFacadeAdapter() {
		if (apogyCoreEnvironmentUIFacadeItemProvider == null) {
			apogyCoreEnvironmentUIFacadeItemProvider = new ApogyCoreEnvironmentUIFacadeItemProvider(this);
		}

		return apogyCoreEnvironmentUIFacadeItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.MapViewConfigurationList} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MapViewConfigurationListItemProvider mapViewConfigurationListItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.MapViewConfigurationList}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.MapViewConfiguration} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MapViewConfigurationItemProvider mapViewConfigurationItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.MapViewConfiguration}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.FeaturesOfInterestMapLayerPresentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturesOfInterestMapLayerPresentationItemProvider featuresOfInterestMapLayerPresentationItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.FeaturesOfInterestMapLayerPresentation}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.MapRuler} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MapRulerItemProvider mapRulerItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.MapRuler}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryPickingTool} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TrajectoryPickingToolItemProvider trajectoryPickingToolItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryPickingTool}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.DefaultVariableTrajectoryProvider} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DefaultVariableTrajectoryProviderItemProvider defaultVariableTrajectoryProviderItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.DefaultVariableTrajectoryProvider}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.PoseVariableAnnotation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PoseVariableAnnotationItemProvider poseVariableAnnotationItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.PoseVariableAnnotation}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.VariableTrajectoryAnnotation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VariableTrajectoryAnnotationItemProvider variableTrajectoryAnnotationItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.VariableTrajectoryAnnotation}.
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
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.core.environment.ui.VehicleVariableAnnotation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VehicleVariableAnnotationItemProvider vehicleVariableAnnotationItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ui.VehicleVariableAnnotation}.
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
		if (environmentUIUtilitiesItemProvider != null) environmentUIUtilitiesItemProvider.dispose();
		if (apogyCoreEnvironmentUIFacadeItemProvider != null) apogyCoreEnvironmentUIFacadeItemProvider.dispose();
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
	 * A child creation extender for the {@link ApogyCommonTopologyUIPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ApogyCommonTopologyUIChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ApogyCommonTopologyUISwitch<Object> {
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
						(ApogyCommonTopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createStarFieldPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createSunPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createEarthSurfaceWorksitePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createEarthSkyPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createMoonPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createFeatureOfInterestNodePresentation()));

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
			return ApogyCoreEnvironmentUIEditPlugin.INSTANCE;
		}
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
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createMapViewConfigurationList()));

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
			return ApogyCoreEnvironmentUIEditPlugin.INSTANCE;
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
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createStarFieldPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createSunPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createEarthSurfaceWorksitePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createEarthSkyPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createMoonPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createFeatureOfInterestNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createEnvironmentUIUtilities()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createApogyCoreEnvironmentUIFacade()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createMapViewConfigurationList()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createMapViewConfiguration()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createMapRuler()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createFeaturesOfInterestMapLayerPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createTrajectoryPickingTool()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createDefaultVariableTrajectoryProvider()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createPoseVariableAnnotation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createVariableTrajectoryAnnotation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createVehicleVariableAnnotation()));

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
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createStarFieldPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createSunPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createEarthSurfaceWorksitePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createEarthSkyPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createMoonPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createFeatureOfInterestNodePresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createEnvironmentUIUtilities()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createApogyCoreEnvironmentUIFacade()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createMapViewConfigurationList()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createMapViewConfiguration()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createMapRuler()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createFeaturesOfInterestMapLayerPresentation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createTrajectoryPickingTool()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createDefaultVariableTrajectoryProvider()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createPoseVariableAnnotation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createVariableTrajectoryAnnotation()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCoreEnvironmentUIFactory.eINSTANCE.createVehicleVariableAnnotation()));

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
			return ApogyCoreEnvironmentUIEditPlugin.INSTANCE;
		}
	}

}
