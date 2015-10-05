/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.impl.VariableFeatureReferenceImpl;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.listeners.AbstractVariableFeatureReferenceListener;
import ca.gc.asc_csa.symphony.tools.camera.Activator;
import ca.gc.asc_csa.symphony.tools.camera.CameraImageAnnotation;
import ca.gc.asc_csa.symphony.tools.camera.CameraOverlayList;
import ca.gc.asc_csa.symphony.tools.camera.CameraToolList;
import ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration;
import ca.gc.asc_csa.symphony.tools.camera.CameraViewConfigurationList;
import ca.gc.asc_csa.symphony.tools.camera.FilterList;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsFactory;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import ca.gc.asc_csa.symphony.tools.core.AbstractTool;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera View Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewConfigurationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewConfigurationImpl#getCameraViewConfigurationList <em>Camera View Configuration List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewConfigurationImpl#getCamera <em>Camera</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewConfigurationImpl#getImageWidth <em>Image Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewConfigurationImpl#getImageHeight <em>Image Height</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewConfigurationImpl#getImageCount <em>Image Count</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewConfigurationImpl#isDisplayRectifiedImage <em>Display Rectified Image</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewConfigurationImpl#getOverlayList <em>Overlay List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewConfigurationImpl#getToolList <em>Tool List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewConfigurationImpl#getFilterList <em>Filter List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewConfigurationImpl#isImageAutoSaveEnable <em>Image Auto Save Enable</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewConfigurationImpl#isSaveImageWithOverlays <em>Save Image With Overlays</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewConfigurationImpl#getImageAutoSaveFolderPath <em>Image Auto Save Folder Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CameraViewConfigurationImpl extends VariableFeatureReferenceImpl implements CameraViewConfiguration
{
	private AbstractVariableFeatureReferenceListener abstractVariableFeatureReferenceListener = null;
	
  /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;
  	
  /**
	 * The cached value of the '{@link #getCamera() <em>Camera</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCamera()
	 * @generated
	 * @ordered
	 */
  protected AbstractCamera camera;
  /**
	 * The default value of the '{@link #getImageWidth() <em>Image Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImageWidth()
	 * @generated
	 * @ordered
	 */
  protected static final int IMAGE_WIDTH_EDEFAULT = 640;
  /**
	 * The cached value of the '{@link #getImageWidth() <em>Image Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImageWidth()
	 * @generated
	 * @ordered
	 */
  protected int imageWidth = IMAGE_WIDTH_EDEFAULT;
  /**
	 * The default value of the '{@link #getImageHeight() <em>Image Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImageHeight()
	 * @generated
	 * @ordered
	 */
  protected static final int IMAGE_HEIGHT_EDEFAULT = 480;
  /**
	 * The cached value of the '{@link #getImageHeight() <em>Image Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImageHeight()
	 * @generated
	 * @ordered
	 */
  protected int imageHeight = IMAGE_HEIGHT_EDEFAULT;
  /**
	 * The default value of the '{@link #getImageCount() <em>Image Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageCount()
	 * @generated
	 * @ordered
	 */
	protected static final int IMAGE_COUNT_EDEFAULT = 0;

		/**
	 * The cached value of the '{@link #getImageCount() <em>Image Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageCount()
	 * @generated
	 * @ordered
	 */
	protected int imageCount = IMAGE_COUNT_EDEFAULT;

		/**
	 * The default value of the '{@link #isDisplayRectifiedImage() <em>Display Rectified Image</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isDisplayRectifiedImage()
	 * @generated
	 * @ordered
	 */
  protected static final boolean DISPLAY_RECTIFIED_IMAGE_EDEFAULT = true;
  /**
	 * The cached value of the '{@link #isDisplayRectifiedImage() <em>Display Rectified Image</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isDisplayRectifiedImage()
	 * @generated
	 * @ordered
	 */
  protected boolean displayRectifiedImage = DISPLAY_RECTIFIED_IMAGE_EDEFAULT;

  /**
	 * The cached value of the '{@link #getOverlayList() <em>Overlay List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOverlayList()
	 * @generated
	 * @ordered
	 */
  protected CameraOverlayList overlayList;

  /**
	 * The cached value of the '{@link #getToolList() <em>Tool List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolList()
	 * @generated
	 * @ordered
	 */
	protected CameraToolList toolList;

		/**
	 * The cached value of the '{@link #getFilterList() <em>Filter List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFilterList()
	 * @generated
	 * @ordered
	 */
  protected FilterList filterList;
  /**
	 * The default value of the '{@link #isImageAutoSaveEnable() <em>Image Auto Save Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImageAutoSaveEnable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMAGE_AUTO_SAVE_ENABLE_EDEFAULT = false;

		/**
	 * The cached value of the '{@link #isImageAutoSaveEnable() <em>Image Auto Save Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImageAutoSaveEnable()
	 * @generated
	 * @ordered
	 */
	protected boolean imageAutoSaveEnable = IMAGE_AUTO_SAVE_ENABLE_EDEFAULT;

		/**
	 * The default value of the '{@link #isSaveImageWithOverlays() <em>Save Image With Overlays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSaveImageWithOverlays()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAVE_IMAGE_WITH_OVERLAYS_EDEFAULT = false;

		/**
	 * The cached value of the '{@link #isSaveImageWithOverlays() <em>Save Image With Overlays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSaveImageWithOverlays()
	 * @generated
	 * @ordered
	 */
	protected boolean saveImageWithOverlays = SAVE_IMAGE_WITH_OVERLAYS_EDEFAULT;
		/**
	 * The default value of the '{@link #getImageAutoSaveFolderPath() <em>Image Auto Save Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageAutoSaveFolderPath()
	 * @generated_NOT
	 * @ordered
	 */
	protected static final String IMAGE_AUTO_SAVE_FOLDER_PATH_EDEFAULT = System.getProperty("java.io.tmpdir");

		/**
	 * The cached value of the '{@link #getImageAutoSaveFolderPath() <em>Image Auto Save Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageAutoSaveFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String imageAutoSaveFolderPath = IMAGE_AUTO_SAVE_FOLDER_PATH_EDEFAULT;
		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CameraViewConfigurationImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SymphonyCameraToolsPackage.Literals.CAMERA_VIEW_CONFIGURATION;
	}
  
  
 /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription()
  {
		return description;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription)
  {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__DESCRIPTION, oldDescription, description));
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraViewConfigurationList getCameraViewConfigurationList() {
		if (eContainerFeatureID() != SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST) return null;
		return (CameraViewConfigurationList)eContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraViewConfigurationList basicGetCameraViewConfigurationList() {
		if (eContainerFeatureID() != SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST) return null;
		return (CameraViewConfigurationList)eInternalContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCameraViewConfigurationList(CameraViewConfigurationList newCameraViewConfigurationList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCameraViewConfigurationList, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST, msgs);
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCameraViewConfigurationList(CameraViewConfigurationList newCameraViewConfigurationList) {
		if (newCameraViewConfigurationList != eInternalContainer() || (eContainerFeatureID() != SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST && newCameraViewConfigurationList != null)) {
			if (EcoreUtil.isAncestor(this, newCameraViewConfigurationList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCameraViewConfigurationList != null)
				msgs = ((InternalEObject)newCameraViewConfigurationList).eInverseAdd(this, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION_LIST__CAMERA_VIEW_CONFIGURATIONS, CameraViewConfigurationList.class, msgs);
			msgs = basicSetCameraViewConfigurationList(newCameraViewConfigurationList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST, newCameraViewConfigurationList, newCameraViewConfigurationList));
	}

/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setVariable(Variable newVariable)
  {
	  super.setVariable(newVariable);
	  getAbstractVariableFeatureReferenceListener().setVariableFeatureReference(this);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractCamera getCamera()
  {
		if (camera != null && camera.eIsProxy()) {
			InternalEObject oldCamera = (InternalEObject)camera;
			camera = (AbstractCamera)eResolveProxy(oldCamera);
			if (camera != oldCamera) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA, oldCamera, camera));
			}
		}
		return camera;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractCamera basicGetCamera()
  {
		return camera;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCamera(AbstractCamera newCamera)
  {
		AbstractCamera oldCamera = camera;
		camera = newCamera;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA, oldCamera, camera));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getImageWidth()
  {
		return imageWidth;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setImageWidth(int newImageWidth)
  {
		int oldImageWidth = imageWidth;
		imageWidth = newImageWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_WIDTH, oldImageWidth, imageWidth));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getImageHeight()
  {
		return imageHeight;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setImageHeight(int newImageHeight)
  {
		int oldImageHeight = imageHeight;
		imageHeight = newImageHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_HEIGHT, oldImageHeight, imageHeight));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getImageCount() {
		return imageCount;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageCount(int newImageCount) {
		int oldImageCount = imageCount;
		imageCount = newImageCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_COUNT, oldImageCount, imageCount));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isDisplayRectifiedImage()
  {
		return displayRectifiedImage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDisplayRectifiedImage(boolean newDisplayRectifiedImage)
  {
		boolean oldDisplayRectifiedImage = displayRectifiedImage;
		displayRectifiedImage = newDisplayRectifiedImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__DISPLAY_RECTIFIED_IMAGE, oldDisplayRectifiedImage, displayRectifiedImage));
	}

  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public CameraOverlayList getOverlayList()
  {
	  CameraOverlayList tmp = getOverlayListGen();
	  if(tmp == null)
	  {
		  tmp = SymphonyCameraToolsFactory.eINSTANCE.createCameraOverlayList();
		  setOverlayList(tmp);
	  }
	  
	  return tmp;
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CameraOverlayList getOverlayListGen()
  {
		return overlayList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOverlayList(CameraOverlayList newOverlayList, NotificationChain msgs)
  {
		CameraOverlayList oldOverlayList = overlayList;
		overlayList = newOverlayList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST, oldOverlayList, newOverlayList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOverlayList(CameraOverlayList newOverlayList)
  {
		if (newOverlayList != overlayList) {
			NotificationChain msgs = null;
			if (overlayList != null)
				msgs = ((InternalEObject)overlayList).eInverseRemove(this, SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION, CameraOverlayList.class, msgs);
			if (newOverlayList != null)
				msgs = ((InternalEObject)newOverlayList).eInverseAdd(this, SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION, CameraOverlayList.class, msgs);
			msgs = basicSetOverlayList(newOverlayList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST, newOverlayList, newOverlayList));
	}

  	/**
 	 * <!-- begin-user-doc -->
 	 * <!-- end-user-doc -->
 	 * @generated_NOT
 	 */
 	public CameraToolList getToolList() 
 	{
 		CameraToolList tmp =  getToolListGen();
 		if(tmp == null)
 		{
 			tmp = SymphonyCameraToolsFactory.eINSTANCE.createCameraToolList();
 			setToolList(tmp);
 		}
 		
 		return tmp;
 	}
  
 	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraToolList getToolListGen() {
		return toolList;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolList(CameraToolList newToolList, NotificationChain msgs) {
		CameraToolList oldToolList = toolList;
		toolList = newToolList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__TOOL_LIST, oldToolList, newToolList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolList(CameraToolList newToolList) {
		if (newToolList != toolList) {
			NotificationChain msgs = null;
			if (toolList != null)
				msgs = ((InternalEObject)toolList).eInverseRemove(this, SymphonyCameraToolsPackage.CAMERA_TOOL_LIST__CAMERA_VIEW_CONFIGURATION, CameraToolList.class, msgs);
			if (newToolList != null)
				msgs = ((InternalEObject)newToolList).eInverseAdd(this, SymphonyCameraToolsPackage.CAMERA_TOOL_LIST__CAMERA_VIEW_CONFIGURATION, CameraToolList.class, msgs);
			msgs = basicSetToolList(newToolList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__TOOL_LIST, newToolList, newToolList));
	}

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public FilterList getFilterList()
  {
	  FilterList tmp = getFilterListGen();
	  if(tmp == null)
	  {
		  tmp = SymphonyCameraToolsFactory.eINSTANCE.createFilterList();
		  setFilterList(tmp);
	  }
	  
	  return tmp;
  }
  
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FilterList getFilterListGen()
  {
		return filterList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetFilterList(FilterList newFilterList, NotificationChain msgs)
  {
		FilterList oldFilterList = filterList;
		filterList = newFilterList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__FILTER_LIST, oldFilterList, newFilterList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFilterList(FilterList newFilterList)
  {
		if (newFilterList != filterList) {
			NotificationChain msgs = null;
			if (filterList != null)
				msgs = ((InternalEObject)filterList).eInverseRemove(this, SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION, FilterList.class, msgs);
			if (newFilterList != null)
				msgs = ((InternalEObject)newFilterList).eInverseAdd(this, SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION, FilterList.class, msgs);
			msgs = basicSetFilterList(newFilterList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__FILTER_LIST, newFilterList, newFilterList));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImageAutoSaveEnable() {
		return imageAutoSaveEnable;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageAutoSaveEnable(boolean newImageAutoSaveEnable) {
		boolean oldImageAutoSaveEnable = imageAutoSaveEnable;
		imageAutoSaveEnable = newImageAutoSaveEnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_ENABLE, oldImageAutoSaveEnable, imageAutoSaveEnable));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSaveImageWithOverlays() {
		return saveImageWithOverlays;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaveImageWithOverlays(boolean newSaveImageWithOverlays) {
		boolean oldSaveImageWithOverlays = saveImageWithOverlays;
		saveImageWithOverlays = newSaveImageWithOverlays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__SAVE_IMAGE_WITH_OVERLAYS, oldSaveImageWithOverlays, saveImageWithOverlays));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageAutoSaveFolderPath() {
		return imageAutoSaveFolderPath;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageAutoSaveFolderPath(String newImageAutoSaveFolderPath) {
		String oldImageAutoSaveFolderPath = imageAutoSaveFolderPath;
		imageAutoSaveFolderPath = newImageAutoSaveFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_FOLDER_PATH, oldImageAutoSaveFolderPath, imageAutoSaveFolderPath));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<CameraImageAnnotation> getCameraImageAnnotations() 
	{
		List<CameraImageAnnotation> list = new ArrayList<CameraImageAnnotation>();
		
		list.addAll(getOverlayList().getOverlays());
		list.addAll(getToolList().getTools());
		
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCameraViewConfigurationList((CameraViewConfigurationList)otherEnd, msgs);
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST:
				if (overlayList != null)
					msgs = ((InternalEObject)overlayList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST, null, msgs);
				return basicSetOverlayList((CameraOverlayList)otherEnd, msgs);
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__TOOL_LIST:
				if (toolList != null)
					msgs = ((InternalEObject)toolList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__TOOL_LIST, null, msgs);
				return basicSetToolList((CameraToolList)otherEnd, msgs);
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__FILTER_LIST:
				if (filterList != null)
					msgs = ((InternalEObject)filterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__FILTER_LIST, null, msgs);
				return basicSetFilterList((FilterList)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST:
				return basicSetCameraViewConfigurationList(null, msgs);
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST:
				return basicSetOverlayList(null, msgs);
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__TOOL_LIST:
				return basicSetToolList(null, msgs);
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__FILTER_LIST:
				return basicSetFilterList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST:
				return eInternalContainer().eInverseRemove(this, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION_LIST__CAMERA_VIEW_CONFIGURATIONS, CameraViewConfigurationList.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__DESCRIPTION:
				return getDescription();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST:
				if (resolve) return getCameraViewConfigurationList();
				return basicGetCameraViewConfigurationList();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA:
				if (resolve) return getCamera();
				return basicGetCamera();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_WIDTH:
				return getImageWidth();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_HEIGHT:
				return getImageHeight();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_COUNT:
				return getImageCount();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__DISPLAY_RECTIFIED_IMAGE:
				return isDisplayRectifiedImage();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST:
				return getOverlayList();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__TOOL_LIST:
				return getToolList();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__FILTER_LIST:
				return getFilterList();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_ENABLE:
				return isImageAutoSaveEnable();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__SAVE_IMAGE_WITH_OVERLAYS:
				return isSaveImageWithOverlays();
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_FOLDER_PATH:
				return getImageAutoSaveFolderPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */

  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST:
				setCameraViewConfigurationList((CameraViewConfigurationList)newValue);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA:
				setCamera((AbstractCamera)newValue);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_WIDTH:
				setImageWidth((Integer)newValue);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_HEIGHT:
				setImageHeight((Integer)newValue);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_COUNT:
				setImageCount((Integer)newValue);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__DISPLAY_RECTIFIED_IMAGE:
				setDisplayRectifiedImage((Boolean)newValue);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST:
				setOverlayList((CameraOverlayList)newValue);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__TOOL_LIST:
				setToolList((CameraToolList)newValue);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__FILTER_LIST:
				setFilterList((FilterList)newValue);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_ENABLE:
				setImageAutoSaveEnable((Boolean)newValue);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__SAVE_IMAGE_WITH_OVERLAYS:
				setSaveImageWithOverlays((Boolean)newValue);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_FOLDER_PATH:
				setImageAutoSaveFolderPath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST:
				setCameraViewConfigurationList((CameraViewConfigurationList)null);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA:
				setCamera((AbstractCamera)null);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_WIDTH:
				setImageWidth(IMAGE_WIDTH_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_HEIGHT:
				setImageHeight(IMAGE_HEIGHT_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_COUNT:
				setImageCount(IMAGE_COUNT_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__DISPLAY_RECTIFIED_IMAGE:
				setDisplayRectifiedImage(DISPLAY_RECTIFIED_IMAGE_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST:
				setOverlayList((CameraOverlayList)null);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__TOOL_LIST:
				setToolList((CameraToolList)null);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__FILTER_LIST:
				setFilterList((FilterList)null);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_ENABLE:
				setImageAutoSaveEnable(IMAGE_AUTO_SAVE_ENABLE_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__SAVE_IMAGE_WITH_OVERLAYS:
				setSaveImageWithOverlays(SAVE_IMAGE_WITH_OVERLAYS_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_FOLDER_PATH:
				setImageAutoSaveFolderPath(IMAGE_AUTO_SAVE_FOLDER_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST:
				return basicGetCameraViewConfigurationList() != null;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__CAMERA:
				return camera != null;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_WIDTH:
				return imageWidth != IMAGE_WIDTH_EDEFAULT;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_HEIGHT:
				return imageHeight != IMAGE_HEIGHT_EDEFAULT;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_COUNT:
				return imageCount != IMAGE_COUNT_EDEFAULT;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__DISPLAY_RECTIFIED_IMAGE:
				return displayRectifiedImage != DISPLAY_RECTIFIED_IMAGE_EDEFAULT;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST:
				return overlayList != null;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__TOOL_LIST:
				return toolList != null;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__FILTER_LIST:
				return filterList != null;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_ENABLE:
				return imageAutoSaveEnable != IMAGE_AUTO_SAVE_ENABLE_EDEFAULT;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__SAVE_IMAGE_WITH_OVERLAYS:
				return saveImageWithOverlays != SAVE_IMAGE_WITH_OVERLAYS_EDEFAULT;
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_FOLDER_PATH:
				return IMAGE_AUTO_SAVE_FOLDER_PATH_EDEFAULT == null ? imageAutoSaveFolderPath != null : !IMAGE_AUTO_SAVE_FOLDER_PATH_EDEFAULT.equals(imageAutoSaveFolderPath);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == AbstractTool.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == AbstractTool.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION___GET_CAMERA_IMAGE_ANNOTATIONS:
				return getCameraImageAnnotations();
		}
		return super.eInvoke(operationID, arguments);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", imageWidth: ");
		result.append(imageWidth);
		result.append(", imageHeight: ");
		result.append(imageHeight);
		result.append(", imageCount: ");
		result.append(imageCount);
		result.append(", displayRectifiedImage: ");
		result.append(displayRectifiedImage);
		result.append(", imageAutoSaveEnable: ");
		result.append(imageAutoSaveEnable);
		result.append(", saveImageWithOverlays: ");
		result.append(saveImageWithOverlays);
		result.append(", imageAutoSaveFolderPath: ");
		result.append(imageAutoSaveFolderPath);
		result.append(')');
		return result.toString();
	}
 
  private AbstractCamera resolveCamera()
  {	  
	  AbstractCamera cam = null;
	  
	  try
	  {
		  EObject instance = EMFEcoreInvocatorFacade.INSTANCE.getInstance(this);
	  
		  if(instance instanceof AbstractCamera)
		  {
			  cam = (AbstractCamera) instance;
		  }
	  }
	  catch(Throwable t)
	  {
		  Logger.INSTANCE.log(Activator.ID, this, "Failed to resolve camera!", EventSeverity.ERROR, t);		  
	  }
	  
	  return cam;
  }    
  
  private AbstractVariableFeatureReferenceListener getAbstractVariableFeatureReferenceListener()
  {
	  if(abstractVariableFeatureReferenceListener == null)
	  {
		  abstractVariableFeatureReferenceListener = new AbstractVariableFeatureReferenceListener(this)
		  {
				@Override
				protected void instanceChanged(EObject oldInstance, EObject newInstance) 
				{					
					// Attempts to resolve the camera.
					if(!(oldInstance == null && newInstance == null) )
					{						
						setCamera(resolveCamera());	
					}								
				}  
		  };
	  }
	  
	  return abstractVariableFeatureReferenceListener;
  }
  
} //CameraViewConfigurationImpl
