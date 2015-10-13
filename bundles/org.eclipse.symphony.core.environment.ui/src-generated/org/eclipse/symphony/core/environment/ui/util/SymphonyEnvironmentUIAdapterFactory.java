/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.core.environment.RectangularRegionProvider;
import org.eclipse.symphony.core.environment.ui.*;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage
 * @generated
 */
public class SymphonyEnvironmentUIAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static SymphonyEnvironmentUIPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyEnvironmentUIAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = SymphonyEnvironmentUIPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SymphonyEnvironmentUISwitch<Adapter> modelSwitch =
    new SymphonyEnvironmentUISwitch<Adapter>() {
			@Override
			public Adapter caseStarFieldPresentation(StarFieldPresentation object) {
				return createStarFieldPresentationAdapter();
			}
			@Override
			public Adapter caseSunPresentation(SunPresentation object) {
				return createSunPresentationAdapter();
			}
			@Override
			public Adapter caseEarthSurfaceWorksitePresentation(EarthSurfaceWorksitePresentation object) {
				return createEarthSurfaceWorksitePresentationAdapter();
			}
			@Override
			public Adapter caseEarthSkyPresentation(EarthSkyPresentation object) {
				return createEarthSkyPresentationAdapter();
			}
			@Override
			public Adapter caseMoonPresentation(MoonPresentation object) {
				return createMoonPresentationAdapter();
			}
			@Override
			public Adapter caseFeatureOfInterestNodePresentation(FeatureOfInterestNodePresentation object) {
				return createFeatureOfInterestNodePresentationAdapter();
			}
			@Override
			public Adapter caseEnvironmentUiUtilities(EnvironmentUiUtilities object) {
				return createEnvironmentUiUtilitiesAdapter();
			}
			@Override
			public Adapter caseEnvironmentUiFacade(EnvironmentUiFacade object) {
				return createEnvironmentUiFacadeAdapter();
			}
			@Override
			public Adapter caseMapViewConfigurationList(MapViewConfigurationList object) {
				return createMapViewConfigurationListAdapter();
			}
			@Override
			public Adapter caseMapViewConfiguration(MapViewConfiguration object) {
				return createMapViewConfigurationAdapter();
			}
			@Override
			public Adapter caseMapViewItemPresentation(MapViewItemPresentation object) {
				return createMapViewItemPresentationAdapter();
			}
			@Override
			public Adapter caseMapAnnotation(MapAnnotation object) {
				return createMapAnnotationAdapter();
			}
			@Override
			public Adapter caseMapTool(MapTool object) {
				return createMapToolAdapter();
			}
			@Override
			public Adapter caseMapRuler(MapRuler object) {
				return createMapRulerAdapter();
			}
			@Override
			public Adapter caseFeaturesOfInterestMapLayerPresentation(FeaturesOfInterestMapLayerPresentation object) {
				return createFeaturesOfInterestMapLayerPresentationAdapter();
			}
			@Override
			public Adapter caseTrajectoryProvider(TrajectoryProvider object) {
				return createTrajectoryProviderAdapter();
			}
			@Override
			public Adapter caseAbstractTrajectoryTool(AbstractTrajectoryTool object) {
				return createAbstractTrajectoryToolAdapter();
			}
			@Override
			public Adapter caseTrajectoryPickingTool(TrajectoryPickingTool object) {
				return createTrajectoryPickingToolAdapter();
			}
			@Override
			public Adapter caseVariableTrajectoryProvider(VariableTrajectoryProvider object) {
				return createVariableTrajectoryProviderAdapter();
			}
			@Override
			public Adapter caseDefaultVariableTrajectoryProvider(DefaultVariableTrajectoryProvider object) {
				return createDefaultVariableTrajectoryProviderAdapter();
			}
			@Override
			public Adapter caseAbstractVariableAnnotation(AbstractVariableAnnotation object) {
				return createAbstractVariableAnnotationAdapter();
			}
			@Override
			public Adapter casePoseVariableAnnotation(PoseVariableAnnotation object) {
				return createPoseVariableAnnotationAdapter();
			}
			@Override
			public Adapter caseVariableTrajectoryAnnotation(VariableTrajectoryAnnotation object) {
				return createVariableTrajectoryAnnotationAdapter();
			}
			@Override
			public Adapter caseVehicleVariableAnnotation(VehicleVariableAnnotation object) {
				return createVehicleVariableAnnotationAdapter();
			}
			@Override
			public Adapter caseNodePresentation(NodePresentation object) {
				return createNodePresentationAdapter();
			}
			@Override
			public Adapter caseAbstractToolsListContainer(AbstractToolsListContainer object) {
				return createAbstractToolsListContainerAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseRectangularRegionProvider(RectangularRegionProvider object) {
				return createRectangularRegionProviderAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.StarFieldPresentation <em>Star Field Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.StarFieldPresentation
	 * @generated
	 */
  public Adapter createStarFieldPresentationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.SunPresentation <em>Sun Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.SunPresentation
	 * @generated
	 */
  public Adapter createSunPresentationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation <em>Earth Surface Worksite Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation
	 * @generated
	 */
  public Adapter createEarthSurfaceWorksitePresentationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.EarthSkyPresentation <em>Earth Sky Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.EarthSkyPresentation
	 * @generated
	 */
  public Adapter createEarthSkyPresentationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.MoonPresentation <em>Moon Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.MoonPresentation
	 * @generated
	 */
  public Adapter createMoonPresentationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.FeatureOfInterestNodePresentation <em>Feature Of Interest Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.FeatureOfInterestNodePresentation
	 * @generated
	 */
	public Adapter createFeatureOfInterestNodePresentationAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities <em>Environment Ui Utilities</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities
	 * @generated
	 */
  public Adapter createEnvironmentUiUtilitiesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade <em>Environment Ui Facade</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade
	 * @generated
	 */
  public Adapter createEnvironmentUiFacadeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.MapViewConfigurationList <em>Map View Configuration List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewConfigurationList
	 * @generated
	 */
  public Adapter createMapViewConfigurationListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.MapViewConfiguration <em>Map View Configuration</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewConfiguration
	 * @generated
	 */
  public Adapter createMapViewConfigurationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.MapViewItemPresentation <em>Map View Item Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewItemPresentation
	 * @generated
	 */
  public Adapter createMapViewItemPresentationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.FeaturesOfInterestMapLayerPresentation <em>Features Of Interest Map Layer Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.FeaturesOfInterestMapLayerPresentation
	 * @generated
	 */
	public Adapter createFeaturesOfInterestMapLayerPresentationAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.MapAnnotation <em>Map Annotation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.MapAnnotation
	 * @generated
	 */
  public Adapter createMapAnnotationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.MapTool <em>Map Tool</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.MapTool
	 * @generated
	 */
  public Adapter createMapToolAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.MapRuler <em>Map Ruler</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.MapRuler
	 * @generated
	 */
  public Adapter createMapRulerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider <em>Variable Trajectory Provider</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider
	 * @generated
	 */
  public Adapter createVariableTrajectoryProviderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider <em>Default Variable Trajectory Provider</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider
	 * @generated
	 */
  public Adapter createDefaultVariableTrajectoryProviderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation <em>Abstract Variable Annotation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation
	 * @generated
	 */
  public Adapter createAbstractVariableAnnotationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation <em>Pose Variable Annotation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation
	 * @generated
	 */
  public Adapter createPoseVariableAnnotationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryAnnotation <em>Variable Trajectory Annotation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.VariableTrajectoryAnnotation
	 * @generated
	 */
  public Adapter createVariableTrajectoryAnnotationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation <em>Vehicle Variable Annotation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation
	 * @generated
	 */
  public Adapter createVehicleVariableAnnotationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider <em>Trajectory Provider</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.TrajectoryProvider
	 * @generated
	 */
  public Adapter createTrajectoryProviderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.AbstractTrajectoryTool <em>Abstract Trajectory Tool</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.AbstractTrajectoryTool
	 * @generated
	 */
  public Adapter createAbstractTrajectoryToolAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.ui.TrajectoryPickingTool <em>Trajectory Picking Tool</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.ui.TrajectoryPickingTool
	 * @generated
	 */
  public Adapter createTrajectoryPickingToolAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.ui.NodePresentation <em>Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation
	 * @generated
	 */
  public Adapter createNodePresentationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.invocator.AbstractToolsListContainer <em>Abstract Tools List Container</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.invocator.AbstractToolsListContainer
	 * @generated
	 */
  public Adapter createAbstractToolsListContainerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Named
	 * @generated
	 */
  public Adapter createNamedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Described
	 * @generated
	 */
  public Adapter createDescribedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.RectangularRegionProvider <em>Rectangular Region Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.RectangularRegionProvider
	 * @generated
	 */
	public Adapter createRectangularRegionProviderAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //SymphonyEnvironmentUIAdapterFactory
