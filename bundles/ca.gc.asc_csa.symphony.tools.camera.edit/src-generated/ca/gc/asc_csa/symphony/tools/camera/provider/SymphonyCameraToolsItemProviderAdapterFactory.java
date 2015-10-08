/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.provider;

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
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.ToolsList;
import org.eclipse.symphony.core.invocator.util.EMFEcoreInvocatorSwitch;

import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsFactory;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import ca.gc.asc_csa.symphony.tools.camera.util.SymphonyCameraToolsAdapterFactory;
import ca.gc.space.topology.ContentNode;
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
public class SymphonyCameraToolsItemProviderAdapterFactory extends SymphonyCameraToolsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
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
  protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(SymphonyCameraToolsEditPlugin.INSTANCE, SymphonyCameraToolsPackage.eNS_URI);

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
  public SymphonyCameraToolsItemProviderAdapterFactory()
  {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.CameraViewUtilities} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraViewUtilitiesItemProvider cameraViewUtilitiesItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.CameraViewUtilities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCameraViewUtilitiesAdapter() {
		if (cameraViewUtilitiesItemProvider == null) {
			cameraViewUtilitiesItemProvider = new CameraViewUtilitiesItemProvider(this);
		}

		return cameraViewUtilitiesItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfigurationList} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CameraViewConfigurationListItemProvider cameraViewConfigurationListItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfigurationList}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createCameraViewConfigurationListAdapter()
  {
		if (cameraViewConfigurationListItemProvider == null) {
			cameraViewConfigurationListItemProvider = new CameraViewConfigurationListItemProvider(this);
		}

		return cameraViewConfigurationListItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CameraViewConfigurationItemProvider cameraViewConfigurationItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createCameraViewConfigurationAdapter()
  {
		if (cameraViewConfigurationItemProvider == null) {
			cameraViewConfigurationItemProvider = new CameraViewConfigurationItemProvider(this);
		}

		return cameraViewConfigurationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.FilterList} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FilterListItemProvider filterListItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.FilterList}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createFilterListAdapter()
  {
		if (filterListItemProvider == null) {
			filterListItemProvider = new FilterListItemProvider(this);
		}

		return filterListItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.GrayScaleFilter} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected GrayScaleFilterItemProvider grayScaleFilterItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.GrayScaleFilter}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createGrayScaleFilterAdapter()
  {
		if (grayScaleFilterItemProvider == null) {
			grayScaleFilterItemProvider = new GrayScaleFilterItemProvider(this);
		}

		return grayScaleFilterItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.EdgeFilter} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EdgeFilterItemProvider edgeFilterItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.EdgeFilter}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createEdgeFilterAdapter()
  {
		if (edgeFilterItemProvider == null) {
			edgeFilterItemProvider = new EdgeFilterItemProvider(this);
		}

		return edgeFilterItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.ContrastAndBrightnessFilter} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ContrastAndBrightnessFilterItemProvider contrastAndBrightnessFilterItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.ContrastAndBrightnessFilter}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createContrastAndBrightnessFilterAdapter()
  {
		if (contrastAndBrightnessFilterItemProvider == null) {
			contrastAndBrightnessFilterItemProvider = new ContrastAndBrightnessFilterItemProvider(this);
		}

		return contrastAndBrightnessFilterItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.ExposureFilter} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ExposureFilterItemProvider exposureFilterItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.ExposureFilter}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createExposureFilterAdapter()
  {
		if (exposureFilterItemProvider == null) {
			exposureFilterItemProvider = new ExposureFilterItemProvider(this);
		}

		return exposureFilterItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.GainFilter} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected GainFilterItemProvider gainFilterItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.GainFilter}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createGainFilterAdapter()
  {
		if (gainFilterItemProvider == null) {
			gainFilterItemProvider = new GainFilterItemProvider(this);
		}

		return gainFilterItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.InvertFilter} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InvertFilterItemProvider invertFilterItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.InvertFilter}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createInvertFilterAdapter()
  {
		if (invertFilterItemProvider == null) {
			invertFilterItemProvider = new InvertFilterItemProvider(this);
		}

		return invertFilterItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.RescaleFilter} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RescaleFilterItemProvider rescaleFilterItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.RescaleFilter}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createRescaleFilterAdapter()
  {
		if (rescaleFilterItemProvider == null) {
			rescaleFilterItemProvider = new RescaleFilterItemProvider(this);
		}

		return rescaleFilterItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.CameraOverlayList} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CameraOverlayListItemProvider cameraOverlayListItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.CameraOverlayList}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createCameraOverlayListAdapter()
  {
		if (cameraOverlayListItemProvider == null) {
			cameraOverlayListItemProvider = new CameraOverlayListItemProvider(this);
		}

		return cameraOverlayListItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.EMFFeatureOverlay} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EMFFeatureOverlayItemProvider emfFeatureOverlayItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.EMFFeatureOverlay}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createEMFFeatureOverlayAdapter()
  {
		if (emfFeatureOverlayItemProvider == null) {
			emfFeatureOverlayItemProvider = new EMFFeatureOverlayItemProvider(this);
		}

		return emfFeatureOverlayItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.CameraNameOverlay} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CameraNameOverlayItemProvider cameraNameOverlayItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.CameraNameOverlay}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createCameraNameOverlayAdapter()
  {
		if (cameraNameOverlayItemProvider == null) {
			cameraNameOverlayItemProvider = new CameraNameOverlayItemProvider(this);
		}

		return cameraNameOverlayItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.ImageCountOverlay} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageCountOverlayItemProvider imageCountOverlayItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.ImageCountOverlay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageCountOverlayAdapter() {
		if (imageCountOverlayItemProvider == null) {
			imageCountOverlayItemProvider = new ImageCountOverlayItemProvider(this);
		}

		return imageCountOverlayItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.ImageFrozenOverlay} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageFrozenOverlayItemProvider imageFrozenOverlayItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.ImageFrozenOverlay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageFrozenOverlayAdapter() {
		if (imageFrozenOverlayItemProvider == null) {
			imageFrozenOverlayItemProvider = new ImageFrozenOverlayItemProvider(this);
		}

		return imageFrozenOverlayItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.URLImageOverlay} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLImageOverlayItemProvider urlImageOverlayItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.URLImageOverlay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createURLImageOverlayAdapter() {
		if (urlImageOverlayItemProvider == null) {
			urlImageOverlayItemProvider = new URLImageOverlayItemProvider(this);
		}

		return urlImageOverlayItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.SymphonyLogoOverlay} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SymphonyLogoOverlayItemProvider symphonyLogoOverlayItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.SymphonyLogoOverlay}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createSymphonyLogoOverlayAdapter()
  {
		if (symphonyLogoOverlayItemProvider == null) {
			symphonyLogoOverlayItemProvider = new SymphonyLogoOverlayItemProvider(this);
		}

		return symphonyLogoOverlayItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.FOVOverlay} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FOVOverlayItemProvider fovOverlayItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.FOVOverlay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFOVOverlayAdapter() {
		if (fovOverlayItemProvider == null) {
			fovOverlayItemProvider = new FOVOverlayItemProvider(this);
		}

		return fovOverlayItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.AzimuthElevationFOVOverlay} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AzimuthElevationFOVOverlayItemProvider azimuthElevationFOVOverlayItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.AzimuthElevationFOVOverlay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAzimuthElevationFOVOverlayAdapter() {
		if (azimuthElevationFOVOverlayItemProvider == null) {
			azimuthElevationFOVOverlayItemProvider = new AzimuthElevationFOVOverlayItemProvider(this);
		}

		return azimuthElevationFOVOverlayItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.EMFFeatureAzimuthElevationFOVOverlay} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFFeatureAzimuthElevationFOVOverlayItemProvider emfFeatureAzimuthElevationFOVOverlayItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.EMFFeatureAzimuthElevationFOVOverlay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEMFFeatureAzimuthElevationFOVOverlayAdapter() {
		if (emfFeatureAzimuthElevationFOVOverlayItemProvider == null) {
			emfFeatureAzimuthElevationFOVOverlayItemProvider = new EMFFeatureAzimuthElevationFOVOverlayItemProvider(this);
		}

		return emfFeatureAzimuthElevationFOVOverlayItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.AzimuthFeatureReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AzimuthFeatureReferenceItemProvider azimuthFeatureReferenceItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.AzimuthFeatureReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAzimuthFeatureReferenceAdapter() {
		if (azimuthFeatureReferenceItemProvider == null) {
			azimuthFeatureReferenceItemProvider = new AzimuthFeatureReferenceItemProvider(this);
		}

		return azimuthFeatureReferenceItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.ElevationFeatureReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElevationFeatureReferenceItemProvider elevationFeatureReferenceItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.ElevationFeatureReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElevationFeatureReferenceAdapter() {
		if (elevationFeatureReferenceItemProvider == null) {
			elevationFeatureReferenceItemProvider = new ElevationFeatureReferenceItemProvider(this);
		}

		return elevationFeatureReferenceItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.ToolTipTextProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolTipTextProviderItemProvider toolTipTextProviderItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.ToolTipTextProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToolTipTextProviderAdapter() {
		if (toolTipTextProviderItemProvider == null) {
			toolTipTextProviderItemProvider = new ToolTipTextProviderItemProvider(this);
		}

		return toolTipTextProviderItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.CameraToolList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraToolListItemProvider cameraToolListItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.CameraToolList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCameraToolListAdapter() {
		if (cameraToolListItemProvider == null) {
			cameraToolListItemProvider = new CameraToolListItemProvider(this);
		}

		return cameraToolListItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.symphony.tools.camera.PointerCameraTool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointerCameraToolItemProvider pointerCameraToolItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.PointerCameraTool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPointerCameraToolAdapter() {
		if (pointerCameraToolItemProvider == null) {
			pointerCameraToolItemProvider = new PointerCameraToolItemProvider(this);
		}

		return pointerCameraToolItemProvider;
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
		if (cameraViewUtilitiesItemProvider != null) cameraViewUtilitiesItemProvider.dispose();
		if (cameraViewConfigurationListItemProvider != null) cameraViewConfigurationListItemProvider.dispose();
		if (cameraViewConfigurationItemProvider != null) cameraViewConfigurationItemProvider.dispose();
		if (filterListItemProvider != null) filterListItemProvider.dispose();
		if (grayScaleFilterItemProvider != null) grayScaleFilterItemProvider.dispose();
		if (edgeFilterItemProvider != null) edgeFilterItemProvider.dispose();
		if (contrastAndBrightnessFilterItemProvider != null) contrastAndBrightnessFilterItemProvider.dispose();
		if (exposureFilterItemProvider != null) exposureFilterItemProvider.dispose();
		if (gainFilterItemProvider != null) gainFilterItemProvider.dispose();
		if (invertFilterItemProvider != null) invertFilterItemProvider.dispose();
		if (rescaleFilterItemProvider != null) rescaleFilterItemProvider.dispose();
		if (cameraOverlayListItemProvider != null) cameraOverlayListItemProvider.dispose();
		if (emfFeatureOverlayItemProvider != null) emfFeatureOverlayItemProvider.dispose();
		if (cameraNameOverlayItemProvider != null) cameraNameOverlayItemProvider.dispose();
		if (imageCountOverlayItemProvider != null) imageCountOverlayItemProvider.dispose();
		if (imageFrozenOverlayItemProvider != null) imageFrozenOverlayItemProvider.dispose();
		if (urlImageOverlayItemProvider != null) urlImageOverlayItemProvider.dispose();
		if (symphonyLogoOverlayItemProvider != null) symphonyLogoOverlayItemProvider.dispose();
		if (fovOverlayItemProvider != null) fovOverlayItemProvider.dispose();
		if (azimuthElevationFOVOverlayItemProvider != null) azimuthElevationFOVOverlayItemProvider.dispose();
		if (emfFeatureAzimuthElevationFOVOverlayItemProvider != null) emfFeatureAzimuthElevationFOVOverlayItemProvider.dispose();
		if (azimuthFeatureReferenceItemProvider != null) azimuthFeatureReferenceItemProvider.dispose();
		if (elevationFeatureReferenceItemProvider != null) elevationFeatureReferenceItemProvider.dispose();
		if (toolTipTextProviderItemProvider != null) toolTipTextProviderItemProvider.dispose();
		if (cameraToolListItemProvider != null) cameraToolListItemProvider.dispose();
		if (pointerCameraToolItemProvider != null) pointerCameraToolItemProvider.dispose();
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
						 SymphonyCameraToolsFactory.eINSTANCE.createCameraViewUtilities()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createCameraViewConfigurationList()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createCameraViewConfiguration()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createFilterList()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createGrayScaleFilter()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createEdgeFilter()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createContrastAndBrightnessFilter()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createExposureFilter()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createGainFilter()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createInvertFilter()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createRescaleFilter()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createCameraOverlayList()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createEMFFeatureOverlay()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createCameraNameOverlay()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createImageCountOverlay()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createImageFrozenOverlay()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createURLImageOverlay()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createSymphonyLogoOverlay()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createFOVOverlay()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createAzimuthElevationFOVOverlay()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createEMFFeatureAzimuthElevationFOVOverlay()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createAzimuthFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createElevationFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createToolTipTextProvider()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createCameraToolList()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 SymphonyCameraToolsFactory.eINSTANCE.createPointerCameraTool()));

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
			return SymphonyCameraToolsEditPlugin.INSTANCE;
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
						 SymphonyCameraToolsFactory.eINSTANCE.createCameraViewConfigurationList()));

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
			return SymphonyCameraToolsEditPlugin.INSTANCE;
		}
  }

}
