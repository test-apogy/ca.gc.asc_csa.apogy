/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.symphony.common.topology.ui.impl.TransformNodePresentationImpl;
import org.eclipse.symphony.core.ui.Activator;
import org.eclipse.symphony.core.ui.ResultNodePresentation;
import org.eclipse.symphony.core.ui.ResultNodeSceneObject;
import org.eclipse.symphony.core.ui.Symphony__CoreUIPackage;
import org.eclipse.symphony.core.ui.preferences.SymphonyCorePreferencesConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.ui.impl.ResultNodePresentationImpl#getPoleHeight <em>Pole Height</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.impl.ResultNodePresentationImpl#isFlagVisible <em>Flag Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultNodePresentationImpl extends TransformNodePresentationImpl implements ResultNodePresentation
{
	protected IPropertyChangeListener preferencesListener = null;
	
  /**
	 * The default value of the '{@link #getPoleHeight() <em>Pole Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPoleHeight()
	 * @generated
	 * @ordered
	 */
  protected static final float POLE_HEIGHT_EDEFAULT = 1.0F;

  /**
	 * The cached value of the '{@link #getPoleHeight() <em>Pole Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPoleHeight()
	 * @generated
	 * @ordered
	 */
  protected float poleHeight = POLE_HEIGHT_EDEFAULT;

  /**
	 * The default value of the '{@link #isFlagVisible() <em>Flag Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isFlagVisible()
	 * @generated
	 * @ordered
	 */
  protected static final boolean FLAG_VISIBLE_EDEFAULT = true;

  /**
	 * The cached value of the '{@link #isFlagVisible() <em>Flag Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isFlagVisible()
	 * @generated
	 * @ordered
	 */
  protected boolean flagVisible = FLAG_VISIBLE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected ResultNodePresentationImpl()
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
		return Symphony__CoreUIPackage.Literals.RESULT_NODE_PRESENTATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public float getPoleHeight()
  {
		return poleHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoleHeight(float newPoleHeight) {
		float oldPoleHeight = poleHeight;
		poleHeight = newPoleHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreUIPackage.RESULT_NODE_PRESENTATION__POLE_HEIGHT, oldPoleHeight, poleHeight));
	}
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isFlagVisible()
  {
		return flagVisible;
	}

  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFlagVisible(boolean newFlagVisible)
  {
		boolean oldFlagVisible = flagVisible;
		flagVisible = newFlagVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreUIPackage.RESULT_NODE_PRESENTATION__FLAG_VISIBLE, oldFlagVisible, flagVisible));
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
			case Symphony__CoreUIPackage.RESULT_NODE_PRESENTATION__POLE_HEIGHT:
				return getPoleHeight();
			case Symphony__CoreUIPackage.RESULT_NODE_PRESENTATION__FLAG_VISIBLE:
				return isFlagVisible();
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
			case Symphony__CoreUIPackage.RESULT_NODE_PRESENTATION__POLE_HEIGHT:
				setPoleHeight((Float)newValue);
				return;
			case Symphony__CoreUIPackage.RESULT_NODE_PRESENTATION__FLAG_VISIBLE:
				setFlagVisible((Boolean)newValue);
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
			case Symphony__CoreUIPackage.RESULT_NODE_PRESENTATION__POLE_HEIGHT:
				setPoleHeight(POLE_HEIGHT_EDEFAULT);
				return;
			case Symphony__CoreUIPackage.RESULT_NODE_PRESENTATION__FLAG_VISIBLE:
				setFlagVisible(FLAG_VISIBLE_EDEFAULT);
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
			case Symphony__CoreUIPackage.RESULT_NODE_PRESENTATION__POLE_HEIGHT:
				return poleHeight != POLE_HEIGHT_EDEFAULT;
			case Symphony__CoreUIPackage.RESULT_NODE_PRESENTATION__FLAG_VISIBLE:
				return flagVisible != FLAG_VISIBLE_EDEFAULT;
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
		result.append(" (poleHeight: ");
		result.append(poleHeight);
		result.append(", flagVisible: ");
		result.append(flagVisible);
		result.append(')');
		return result.toString();
	}

	@Override
	protected void initialSceneObject() 
	{
		ResultNodeSceneObject j3DObject = ((ResultNodeSceneObject) sceneObject);		
		j3DObject.setFlagPoleHeight(getPoleHeight());
		j3DObject.setFlagVisible(isFlagVisible());
		super.initialSceneObject();
	}
	
	@Override
	protected void applyPreferences() 
	{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
					
		// Change visibility.
		setFlagVisible(store.getBoolean(SymphonyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_VISIBILITY_ID));
		
		// Change flag pole height		
		setPoleHeight(store.getFloat(SymphonyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_POLE_HEIGHT_ID));			
			  	 		
		super.applyPreferences();
	}
	
	@Override
	protected void updateSceneObject(Notification notification) 
	{
		ResultNodeSceneObject resultNodeSceneObject = ((ResultNodeSceneObject) sceneObject);
		
		if(notification.getNotifier() instanceof ResultNodePresentation)
		{
			int featureId = notification.getFeatureID(ResultNodePresentation.class);
			
			switch (featureId) 
			{
				case Symphony__CoreUIPackage.RESULT_NODE_PRESENTATION__FLAG_VISIBLE:
					resultNodeSceneObject.setFlagVisible(this.isFlagVisible());
				break;
								
				case Symphony__CoreUIPackage.RESULT_NODE_PRESENTATION__POLE_HEIGHT:
					resultNodeSceneObject.setFlagPoleHeight(this.getPoleHeight());
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
} //ResultNodePresentationImpl
