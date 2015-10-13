/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.addons.sensors.imaging.ui.Activator;
import org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation;
import org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotSceneObject;
import org.eclipse.symphony.addons.sensors.imaging.ui.MRTSensorsImagingUIPackage;
import org.eclipse.symphony.addons.sensors.imaging.ui.preferences.MRTImagingPreferencesConstants;
import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;
import org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Snapshot Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.ui.impl.ImageSnapshotPresentationImpl#getPresentationMode <em>Presentation Mode</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.ui.impl.ImageSnapshotPresentationImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.ui.impl.ImageSnapshotPresentationImpl#isImageProjectionVisible <em>Image Projection Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.ui.impl.ImageSnapshotPresentationImpl#isImageProjectionOnFOVVisible <em>Image Projection On FOV Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageSnapshotPresentationImpl extends NodePresentationImpl implements ImageSnapshotPresentation
{
	protected IPropertyChangeListener preferencesListener = null;
	
  /**
   * The default value of the '{@link #getPresentationMode() <em>Presentation Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresentationMode()
   * @generated_NOT
   * @ordered
   */
  protected static final MeshPresentationMode PRESENTATION_MODE_EDEFAULT = MeshPresentationMode.WIREFRAME;
  /**
	 * The cached value of the '{@link #getPresentationMode() <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPresentationMode()
	 * @generated
	 * @ordered
	 */
  protected MeshPresentationMode presentationMode = PRESENTATION_MODE_EDEFAULT;
  /**
	 * The default value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
  protected static final float TRANSPARENCY_EDEFAULT = 0.0F;
  /**
	 * The cached value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
  protected float transparency = TRANSPARENCY_EDEFAULT;
  /**
	 * The default value of the '{@link #isImageProjectionVisible() <em>Image Projection Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isImageProjectionVisible()
	 * @generated
	 * @ordered
	 */
  protected static final boolean IMAGE_PROJECTION_VISIBLE_EDEFAULT = false;
  /**
	 * The cached value of the '{@link #isImageProjectionVisible() <em>Image Projection Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isImageProjectionVisible()
	 * @generated
	 * @ordered
	 */
  protected boolean imageProjectionVisible = IMAGE_PROJECTION_VISIBLE_EDEFAULT;

  /**
	 * The default value of the '{@link #isImageProjectionOnFOVVisible() <em>Image Projection On FOV Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImageProjectionOnFOVVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMAGE_PROJECTION_ON_FOV_VISIBLE_EDEFAULT = false;

		/**
	 * The cached value of the '{@link #isImageProjectionOnFOVVisible() <em>Image Projection On FOV Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImageProjectionOnFOVVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean imageProjectionOnFOVVisible = IMAGE_PROJECTION_ON_FOV_VISIBLE_EDEFAULT;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected ImageSnapshotPresentationImpl()
  {
		super();
		
		// Sets the values to the defaults defined in the preferences.
		applyPreferences();
		
		// Register a listener to the preference store
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(getPreferencesListener());	
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return MRTSensorsImagingUIPackage.Literals.IMAGE_SNAPSHOT_PRESENTATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MeshPresentationMode getPresentationMode()
  {
		return presentationMode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPresentationMode(MeshPresentationMode newPresentationMode)
  {
		MeshPresentationMode oldPresentationMode = presentationMode;
		presentationMode = newPresentationMode == null ? PRESENTATION_MODE_EDEFAULT : newPresentationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__PRESENTATION_MODE, oldPresentationMode, presentationMode));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public float getTransparency()
  {
		return transparency;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTransparency(float newTransparency)
  {
		float oldTransparency = transparency;
		transparency = newTransparency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__TRANSPARENCY, oldTransparency, transparency));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isImageProjectionVisible()
  {
		return imageProjectionVisible;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setImageProjectionVisible(boolean newImageProjectionVisible)
  {
		boolean oldImageProjectionVisible = imageProjectionVisible;
		imageProjectionVisible = newImageProjectionVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_VISIBLE, oldImageProjectionVisible, imageProjectionVisible));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImageProjectionOnFOVVisible() {
		return imageProjectionOnFOVVisible;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageProjectionOnFOVVisible(boolean newImageProjectionOnFOVVisible) {
		boolean oldImageProjectionOnFOVVisible = imageProjectionOnFOVVisible;
		imageProjectionOnFOVVisible = newImageProjectionOnFOVVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_ON_FOV_VISIBLE, oldImageProjectionOnFOVVisible, imageProjectionOnFOVVisible));
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
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__PRESENTATION_MODE:
				return getPresentationMode();
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__TRANSPARENCY:
				return getTransparency();
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_VISIBLE:
				return isImageProjectionVisible();
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_ON_FOV_VISIBLE:
				return isImageProjectionOnFOVVisible();
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
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode((MeshPresentationMode)newValue);
				return;
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__TRANSPARENCY:
				setTransparency((Float)newValue);
				return;
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_VISIBLE:
				setImageProjectionVisible((Boolean)newValue);
				return;
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_ON_FOV_VISIBLE:
				setImageProjectionOnFOVVisible((Boolean)newValue);
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
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode(PRESENTATION_MODE_EDEFAULT);
				return;
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__TRANSPARENCY:
				setTransparency(TRANSPARENCY_EDEFAULT);
				return;
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_VISIBLE:
				setImageProjectionVisible(IMAGE_PROJECTION_VISIBLE_EDEFAULT);
				return;
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_ON_FOV_VISIBLE:
				setImageProjectionOnFOVVisible(IMAGE_PROJECTION_ON_FOV_VISIBLE_EDEFAULT);
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
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__PRESENTATION_MODE:
				return presentationMode != PRESENTATION_MODE_EDEFAULT;
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__TRANSPARENCY:
				return transparency != TRANSPARENCY_EDEFAULT;
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_VISIBLE:
				return imageProjectionVisible != IMAGE_PROJECTION_VISIBLE_EDEFAULT;
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_ON_FOV_VISIBLE:
				return imageProjectionOnFOVVisible != IMAGE_PROJECTION_ON_FOV_VISIBLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (presentationMode: ");
		result.append(presentationMode);
		result.append(", transparency: ");
		result.append(transparency);
		result.append(", imageProjectionVisible: ");
		result.append(imageProjectionVisible);
		result.append(", imageProjectionOnFOVVisible: ");
		result.append(imageProjectionOnFOVVisible);
		result.append(')');
		return result.toString();
	}
  
  @Override
  protected void initialSceneObject()
  {
	  ImageSnapshotSceneObject imageSnapshotSceneObject = (ImageSnapshotSceneObject) getSceneObject();					
	  imageSnapshotSceneObject.setTransparency(this.transparency);	
	  imageSnapshotSceneObject.setPresentationMode(this.getPresentationMode());
	  imageSnapshotSceneObject.setImageProjectionEnabled(this.imageProjectionVisible);
	  imageSnapshotSceneObject.setImageProjectionOnFOVEnabled(this.isImageProjectionOnFOVVisible());
		
	  super.initialSceneObject();
  }
  
  @Override
  protected void updateSceneObject(Notification notification)
  {
		ImageSnapshotSceneObject imageSnapshotSceneObject = (ImageSnapshotSceneObject) getSceneObject();
		
		if(notification.getNotifier() instanceof ImageSnapshotPresentation)
		{
			int featureId = notification.getFeatureID(ImageSnapshotPresentation.class);
			
			switch (featureId) 
			{
				case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__PRESENTATION_MODE:
					imageSnapshotSceneObject.setPresentationMode(this.getPresentationMode());
				break;
				
				case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__TRANSPARENCY:
					imageSnapshotSceneObject.setTransparency(this.getTransparency());
				break;

				case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_VISIBLE:
					imageSnapshotSceneObject.setImageProjectionEnabled(this.isImageProjectionVisible());
				break;
				
				case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_ON_FOV_VISIBLE:
					imageSnapshotSceneObject.setImageProjectionOnFOVEnabled(this.isImageProjectionOnFOVVisible());
				break;
				
			default:
				break;
			}
		}
				
		super.updateSceneObject(notification);		
  }
  
  @Override
  protected void applyPreferences() 
  {	
	  IPreferenceStore store = Activator.getDefault().getPreferenceStore();
	
	  // Change color.
	  RGB rgb = PreferenceConverter.getColor(store, MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_FOV_COLOR_ID);
	  if(rgb != null) setColor(rgb);
	
	  // Change visibility.
	  setVisible(store.getBoolean(MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_VISIBILITY_ID));
	
	  // Change projection
	  setImageProjectionVisible(store.getBoolean(MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION_ID));			

	  // Change projection on FOV
	  setImageProjectionOnFOVVisible(store.getBoolean(MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION_ON_FOV_ID));			
	  
	  // Change mode.
	  setPresentationMode(MeshPresentationMode.get(store.getInt(MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_FOV_PRESENTATION_MODE_ID)));
		  	 
	  super.applyPreferences();
  }
  
	private IPropertyChangeListener getPreferencesListener()
	{
		if(preferencesListener == null)
		{
			preferencesListener = new IPropertyChangeListener() 
			{
				public void propertyChange(PropertyChangeEvent event) 
				{	
					applyPreferences();		
				}	
			};
		}
		
		return preferencesListener;
	}
	
} //ImageSnapshotPresentationImpl
