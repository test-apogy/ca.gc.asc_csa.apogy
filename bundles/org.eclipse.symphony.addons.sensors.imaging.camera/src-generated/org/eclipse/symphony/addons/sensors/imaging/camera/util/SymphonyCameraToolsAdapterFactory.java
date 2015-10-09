/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.AbstractTool;
import org.eclipse.symphony.addons.sensors.imaging.camera.*;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.core.AbsolutePoseProvider;
import org.eclipse.symphony.core.PoseProvider;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;
import org.eclipse.symphony.core.invocator.VariableFeatureReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage
 * @generated
 */
public class SymphonyCameraToolsAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static SymphonyCameraToolsPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyCameraToolsAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = SymphonyCameraToolsPackage.eINSTANCE;
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
  protected SymphonyCameraToolsSwitch<Adapter> modelSwitch =
    new SymphonyCameraToolsSwitch<Adapter>() {
			@Override
			public Adapter caseCameraViewUtilities(CameraViewUtilities object) {
				return createCameraViewUtilitiesAdapter();
			}
			@Override
			public Adapter caseCameraViewConfigurationList(CameraViewConfigurationList object) {
				return createCameraViewConfigurationListAdapter();
			}
			@Override
			public Adapter caseCameraViewConfiguration(CameraViewConfiguration object) {
				return createCameraViewConfigurationAdapter();
			}
			@Override
			public Adapter caseFilterList(FilterList object) {
				return createFilterListAdapter();
			}
			@Override
			public Adapter caseImageFilter(ImageFilter object) {
				return createImageFilterAdapter();
			}
			@Override
			public Adapter caseGrayScaleFilter(GrayScaleFilter object) {
				return createGrayScaleFilterAdapter();
			}
			@Override
			public Adapter caseEdgeFilter(EdgeFilter object) {
				return createEdgeFilterAdapter();
			}
			@Override
			public Adapter caseContrastAndBrightnessFilter(ContrastAndBrightnessFilter object) {
				return createContrastAndBrightnessFilterAdapter();
			}
			@Override
			public Adapter caseExposureFilter(ExposureFilter object) {
				return createExposureFilterAdapter();
			}
			@Override
			public Adapter caseGainFilter(GainFilter object) {
				return createGainFilterAdapter();
			}
			@Override
			public Adapter caseInvertFilter(InvertFilter object) {
				return createInvertFilterAdapter();
			}
			@Override
			public Adapter caseRescaleFilter(RescaleFilter object) {
				return createRescaleFilterAdapter();
			}
			@Override
			public Adapter caseCameraImageAnnotation(CameraImageAnnotation object) {
				return createCameraImageAnnotationAdapter();
			}
			@Override
			public Adapter caseCameraOverlayList(CameraOverlayList object) {
				return createCameraOverlayListAdapter();
			}
			@Override
			public Adapter caseCameraOverlay(CameraOverlay object) {
				return createCameraOverlayAdapter();
			}
			@Override
			public Adapter caseDrawnCameraOverlay(DrawnCameraOverlay object) {
				return createDrawnCameraOverlayAdapter();
			}
			@Override
			public Adapter caseAbstractTextOverlay(AbstractTextOverlay object) {
				return createAbstractTextOverlayAdapter();
			}
			@Override
			public Adapter caseEMFFeatureOverlay(EMFFeatureOverlay object) {
				return createEMFFeatureOverlayAdapter();
			}
			@Override
			public Adapter caseCameraNameOverlay(CameraNameOverlay object) {
				return createCameraNameOverlayAdapter();
			}
			@Override
			public Adapter caseImageCountOverlay(ImageCountOverlay object) {
				return createImageCountOverlayAdapter();
			}
			@Override
			public Adapter caseImageFrozenOverlay(ImageFrozenOverlay object) {
				return createImageFrozenOverlayAdapter();
			}
			@Override
			public Adapter caseImageCameraOverlay(ImageCameraOverlay object) {
				return createImageCameraOverlayAdapter();
			}
			@Override
			public Adapter caseURLImageOverlay(URLImageOverlay object) {
				return createURLImageOverlayAdapter();
			}
			@Override
			public Adapter caseSymphonyLogoOverlay(SymphonyLogoOverlay object) {
				return createSymphonyLogoOverlayAdapter();
			}
			@Override
			public Adapter caseFOVOverlay(FOVOverlay object) {
				return createFOVOverlayAdapter();
			}
			@Override
			public Adapter caseAzimuthElevationFOVOverlay(AzimuthElevationFOVOverlay object) {
				return createAzimuthElevationFOVOverlayAdapter();
			}
			@Override
			public Adapter caseEMFFeatureAzimuthElevationFOVOverlay(EMFFeatureAzimuthElevationFOVOverlay object) {
				return createEMFFeatureAzimuthElevationFOVOverlayAdapter();
			}
			@Override
			public Adapter caseAzimuthFeatureReference(AzimuthFeatureReference object) {
				return createAzimuthFeatureReferenceAdapter();
			}
			@Override
			public Adapter caseElevationFeatureReference(ElevationFeatureReference object) {
				return createElevationFeatureReferenceAdapter();
			}
			@Override
			public Adapter caseToolTipTextProvider(ToolTipTextProvider object) {
				return createToolTipTextProviderAdapter();
			}
			@Override
			public Adapter caseCameraTool(CameraTool object) {
				return createCameraToolAdapter();
			}
			@Override
			public Adapter caseCameraToolList(CameraToolList object) {
				return createCameraToolListAdapter();
			}
			@Override
			public Adapter casePointerCameraTool(PointerCameraTool object) {
				return createPointerCameraToolAdapter();
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
			public Adapter caseVariableFeatureReference(VariableFeatureReference object) {
				return createVariableFeatureReferenceAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseAbstractTool(AbstractTool object) {
				return createAbstractToolAdapter();
			}
			@Override
			public Adapter casePoseProvider(PoseProvider object) {
				return createPoseProviderAdapter();
			}
			@Override
			public Adapter caseAbsolutePoseProvider(AbsolutePoseProvider object) {
				return createAbsolutePoseProviderAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities <em>Camera View Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities
	 * @generated
	 */
	public Adapter createCameraViewUtilitiesAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfigurationList <em>Camera View Configuration List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfigurationList
	 * @generated
	 */
  public Adapter createCameraViewConfigurationListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration <em>Camera View Configuration</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration
	 * @generated
	 */
  public Adapter createCameraViewConfigurationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FilterList <em>Filter List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FilterList
	 * @generated
	 */
  public Adapter createFilterListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter <em>Image Filter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter
	 * @generated
	 */
  public Adapter createImageFilterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.GrayScaleFilter <em>Gray Scale Filter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.GrayScaleFilter
	 * @generated
	 */
  public Adapter createGrayScaleFilterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EdgeFilter <em>Edge Filter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.EdgeFilter
	 * @generated
	 */
  public Adapter createEdgeFilterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ContrastAndBrightnessFilter <em>Contrast And Brightness Filter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ContrastAndBrightnessFilter
	 * @generated
	 */
  public Adapter createContrastAndBrightnessFilterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ExposureFilter <em>Exposure Filter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ExposureFilter
	 * @generated
	 */
  public Adapter createExposureFilterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.GainFilter <em>Gain Filter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.GainFilter
	 * @generated
	 */
  public Adapter createGainFilterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.InvertFilter <em>Invert Filter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.InvertFilter
	 * @generated
	 */
  public Adapter createInvertFilterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.RescaleFilter <em>Rescale Filter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.RescaleFilter
	 * @generated
	 */
  public Adapter createRescaleFilterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraImageAnnotation <em>Camera Image Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraImageAnnotation
	 * @generated
	 */
	public Adapter createCameraImageAnnotationAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList <em>Camera Overlay List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList
	 * @generated
	 */
  public Adapter createCameraOverlayListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay <em>Camera Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay
	 * @generated
	 */
  public Adapter createCameraOverlayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.DrawnCameraOverlay <em>Drawn Camera Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.DrawnCameraOverlay
	 * @generated
	 */
  public Adapter createDrawnCameraOverlayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay <em>Abstract Text Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay
	 * @generated
	 */
  public Adapter createAbstractTextOverlayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay <em>EMF Feature Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay
	 * @generated
	 */
  public Adapter createEMFFeatureOverlayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraNameOverlay <em>Camera Name Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraNameOverlay
	 * @generated
	 */
  public Adapter createCameraNameOverlayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageCountOverlay <em>Image Count Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageCountOverlay
	 * @generated
	 */
	public Adapter createImageCountOverlayAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay <em>Image Frozen Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay
	 * @generated
	 */
	public Adapter createImageFrozenOverlayAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageCameraOverlay <em>Image Camera Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageCameraOverlay
	 * @generated
	 */
  public Adapter createImageCameraOverlayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.URLImageOverlay <em>URL Image Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.URLImageOverlay
	 * @generated
	 */
	public Adapter createURLImageOverlayAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyLogoOverlay <em>Symphony Logo Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyLogoOverlay
	 * @generated
	 */
  public Adapter createSymphonyLogoOverlayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay <em>FOV Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay
	 * @generated
	 */
	public Adapter createFOVOverlayAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay <em>Azimuth Elevation FOV Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay
	 * @generated
	 */
	public Adapter createAzimuthElevationFOVOverlayAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay <em>EMF Feature Azimuth Elevation FOV Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay
	 * @generated
	 */
	public Adapter createEMFFeatureAzimuthElevationFOVOverlayAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthFeatureReference <em>Azimuth Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthFeatureReference
	 * @generated
	 */
	public Adapter createAzimuthFeatureReferenceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ElevationFeatureReference <em>Elevation Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ElevationFeatureReference
	 * @generated
	 */
	public Adapter createElevationFeatureReferenceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ToolTipTextProvider <em>Tool Tip Text Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ToolTipTextProvider
	 * @generated
	 */
	public Adapter createToolTipTextProviderAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool <em>Camera Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool
	 * @generated
	 */
	public Adapter createCameraToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList <em>Camera Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList
	 * @generated
	 */
	public Adapter createCameraToolListAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.PointerCameraTool <em>Pointer Camera Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.PointerCameraTool
	 * @generated
	 */
	public Adapter createPointerCameraToolAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.invocator.VariableFeatureReference <em>Variable Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.invocator.VariableFeatureReference
	 * @generated
	 */
  public Adapter createVariableFeatureReferenceAdapter()
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.AbstractTool <em>Abstract Tool</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.AbstractTool
	 * @generated
	 */
  public Adapter createAbstractToolAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.PoseProvider <em>Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.PoseProvider
	 * @generated
	 */
	public Adapter createPoseProviderAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.AbsolutePoseProvider <em>Absolute Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.AbsolutePoseProvider
	 * @generated
	 */
	public Adapter createAbsolutePoseProviderAdapter() {
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

} //SymphonyCameraToolsAdapterFactory
