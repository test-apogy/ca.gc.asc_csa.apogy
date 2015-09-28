/**
 * Canadian Space Agency 2008
 *
 * $Id: FieldOfViewPresentationImpl.java,v 1.1.4.2 2015/05/21 15:50:53 pallard Exp $
 */
package ca.gc.space.mrt.sensors.fov.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.RGB;

import ca.gc.space.mrt.sensors.fov.ui.Activator;
import ca.gc.space.mrt.sensors.fov.ui.FieldOfViewPresentation;
import ca.gc.space.mrt.sensors.fov.ui.FovUIPackage;
import ca.gc.space.mrt.sensors.fov.ui.scene_objects.FieldOfViewSceneObject;
import ca.gc.space.topology.ui.MeshPresentationMode;
import ca.gc.space.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Of View Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.ui.impl.FieldOfViewPresentationImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.ui.impl.FieldOfViewPresentationImpl#getPresentationMode <em>Presentation Mode</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.ui.impl.FieldOfViewPresentationImpl#isShowOutlineOnly <em>Show Outline Only</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.ui.impl.FieldOfViewPresentationImpl#isShowProjection <em>Show Projection</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.ui.impl.FieldOfViewPresentationImpl#getProjectionColor <em>Projection Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FieldOfViewPresentationImpl extends NodePresentationImpl implements FieldOfViewPresentation
{
	protected IPropertyChangeListener preferencesListener = null;
	
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
	 * The default value of the '{@link #getPresentationMode() <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationMode()
	 * @generated
	 * @ordered
	 */
	protected static final MeshPresentationMode PRESENTATION_MODE_EDEFAULT = MeshPresentationMode.POINTS;

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
	 * The default value of the '{@link #isShowOutlineOnly() <em>Show Outline Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowOutlineOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_OUTLINE_ONLY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowOutlineOnly() <em>Show Outline Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowOutlineOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean showOutlineOnly = SHOW_OUTLINE_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowProjection() <em>Show Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowProjection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_PROJECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowProjection() <em>Show Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowProjection()
	 * @generated
	 * @ordered
	 */
	protected boolean showProjection = SHOW_PROJECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectionColor() <em>Projection Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionColor()
	 * @generated
	 * @ordered
	 */
	protected static final RGB PROJECTION_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectionColor() <em>Projection Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionColor()
	 * @generated
	 * @ordered
	 */
	protected RGB projectionColor = PROJECTION_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected FieldOfViewPresentationImpl()
	{
		super();				
		
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
		return FovUIPackage.Literals.FIELD_OF_VIEW_PRESENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FovUIPackage.FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY, oldTransparency, transparency));
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
	 * @generated_NOT
	 */
	public void setPresentationMode(MeshPresentationMode newPresentationMode)
	{
		setPresentationModeGen(newPresentationMode);		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationModeGen(MeshPresentationMode newPresentationMode)
	{
		MeshPresentationMode oldPresentationMode = presentationMode;
		presentationMode = newPresentationMode == null ? PRESENTATION_MODE_EDEFAULT : newPresentationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FovUIPackage.FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE, oldPresentationMode, presentationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowOutlineOnly()
	{
		return showOutlineOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowOutlineOnly(boolean newShowOutlineOnly)
	{
		boolean oldShowOutlineOnly = showOutlineOnly;
		showOutlineOnly = newShowOutlineOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FovUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY, oldShowOutlineOnly, showOutlineOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowProjection() {
		return showProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowProjection(boolean newShowProjection) {
		boolean oldShowProjection = showProjection;
		showProjection = newShowProjection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FovUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION, oldShowProjection, showProjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGB getProjectionColor() {
		return projectionColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectionColor(RGB newProjectionColor) {
		RGB oldProjectionColor = projectionColor;
		projectionColor = newProjectionColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FovUIPackage.FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR, oldProjectionColor, projectionColor));
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
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY:
				return getTransparency();
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE:
				return getPresentationMode();
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY:
				return isShowOutlineOnly();
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION:
				return isShowProjection();
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR:
				return getProjectionColor();
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
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY:
				setTransparency((Float)newValue);
				return;
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode((MeshPresentationMode)newValue);
				return;
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY:
				setShowOutlineOnly((Boolean)newValue);
				return;
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION:
				setShowProjection((Boolean)newValue);
				return;
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR:
				setProjectionColor((RGB)newValue);
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
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY:
				setTransparency(TRANSPARENCY_EDEFAULT);
				return;
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode(PRESENTATION_MODE_EDEFAULT);
				return;
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY:
				setShowOutlineOnly(SHOW_OUTLINE_ONLY_EDEFAULT);
				return;
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION:
				setShowProjection(SHOW_PROJECTION_EDEFAULT);
				return;
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR:
				setProjectionColor(PROJECTION_COLOR_EDEFAULT);
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
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY:
				return transparency != TRANSPARENCY_EDEFAULT;
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE:
				return presentationMode != PRESENTATION_MODE_EDEFAULT;
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY:
				return showOutlineOnly != SHOW_OUTLINE_ONLY_EDEFAULT;
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION:
				return showProjection != SHOW_PROJECTION_EDEFAULT;
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR:
				return PROJECTION_COLOR_EDEFAULT == null ? projectionColor != null : !PROJECTION_COLOR_EDEFAULT.equals(projectionColor);
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
		result.append(" (transparency: ");
		result.append(transparency);
		result.append(", presentationMode: ");
		result.append(presentationMode);
		result.append(", showOutlineOnly: ");
		result.append(showOutlineOnly);
		result.append(", showProjection: ");
		result.append(showProjection);
		result.append(", projectionColor: ");
		result.append(projectionColor);
		result.append(')');
		return result.toString();
	}

	@Override
	protected void initialSceneObject() 
	{
		FieldOfViewSceneObject fieldOfViewSceneObject = (FieldOfViewSceneObject) getSceneObject();				
		
		fieldOfViewSceneObject.setPresentationMode(this.getPresentationMode());		
		fieldOfViewSceneObject.setTransparency(this.getTransparency());
		fieldOfViewSceneObject.setShowOutlineOnly(this.isShowOutlineOnly());
		fieldOfViewSceneObject.setShowProjection(this.isShowProjection());
		fieldOfViewSceneObject.setProjectionColor(this.getProjectionColor());
		
		super.initialSceneObject();
	}
	
	@Override
	protected void updateSceneObject(Notification notification) 
	{			
		FieldOfViewSceneObject fieldOfViewSceneObject = (FieldOfViewSceneObject) getSceneObject();
		
		if(notification.getNotifier() instanceof FieldOfViewPresentation)
		{
			int featureId = notification.getFeatureID(FieldOfViewPresentation.class);
			
			switch (featureId) 
			{
				case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE:
					fieldOfViewSceneObject.setPresentationMode(this.getPresentationMode());
				break;
			
				case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY:
					fieldOfViewSceneObject.setTransparency(this.getTransparency());
				break;

				case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY:
					fieldOfViewSceneObject.setShowOutlineOnly(this.isShowOutlineOnly());
				break;
				
				case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION:
					fieldOfViewSceneObject.setShowProjection(this.isShowProjection());
				break;
			
				case FovUIPackage.FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR:
					fieldOfViewSceneObject.setProjectionColor(this.getProjectionColor());
				break;

				
				default:
				break;
			}
		}		
		
		super.updateSceneObject(notification);
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
	
	protected void applyPreferences()
	{
		// Must be overidden.
		super.applyPreferences();
	}
	
	@Override
	protected void finalize() throws Throwable 
	{
		Activator.getDefault().getPreferenceStore().removePropertyChangeListener(getPreferencesListener());
		super.finalize();
	}
} //FieldOfViewPresentationImpl
