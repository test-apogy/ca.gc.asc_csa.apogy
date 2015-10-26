/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.addons.vehicle.ui.Activator;
import org.eclipse.symphony.addons.vehicle.ui.SymphonyToolsVehicleUIPackage;
import org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation;
import org.eclipse.symphony.addons.vehicle.ui.ThrusterSceneObject;
import org.eclipse.symphony.addons.vehicle.ui.preferences.VehicleUIPreferencesConstants;
import org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thruster Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.ui.impl.ThrusterPresentationImpl#isPlumeEnvelopeVisible <em>Plume Envelope Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.ui.impl.ThrusterPresentationImpl#getPlumeEnvelopeLenght <em>Plume Envelope Lenght</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThrusterPresentationImpl extends NodePresentationImpl implements ThrusterPresentation
{
	protected IPropertyChangeListener preferencesListener = null;
	
  /**
	 * The default value of the '{@link #isPlumeEnvelopeVisible() <em>Plume Envelope Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlumeEnvelopeVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLUME_ENVELOPE_VISIBLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isPlumeEnvelopeVisible() <em>Plume Envelope Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlumeEnvelopeVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean plumeEnvelopeVisible = PLUME_ENVELOPE_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlumeEnvelopeLenght() <em>Plume Envelope Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlumeEnvelopeLenght()
	 * @generated
	 * @ordered
	 */
	protected static final double PLUME_ENVELOPE_LENGHT_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getPlumeEnvelopeLenght() <em>Plume Envelope Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlumeEnvelopeLenght()
	 * @generated
	 * @ordered
	 */
	protected double plumeEnvelopeLenght = PLUME_ENVELOPE_LENGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected ThrusterPresentationImpl()
	{
		super();
		
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
		return SymphonyToolsVehicleUIPackage.Literals.THRUSTER_PRESENTATION;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPlumeEnvelopeVisible() {
		return plumeEnvelopeVisible;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlumeEnvelopeVisible(boolean newPlumeEnvelopeVisible) {
		boolean oldPlumeEnvelopeVisible = plumeEnvelopeVisible;
		plumeEnvelopeVisible = newPlumeEnvelopeVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_VISIBLE, oldPlumeEnvelopeVisible, plumeEnvelopeVisible));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPlumeEnvelopeLenght() {
		return plumeEnvelopeLenght;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlumeEnvelopeLenght(double newPlumeEnvelopeLenght) {
		double oldPlumeEnvelopeLenght = plumeEnvelopeLenght;
		plumeEnvelopeLenght = newPlumeEnvelopeLenght;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGHT, oldPlumeEnvelopeLenght, plumeEnvelopeLenght));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_VISIBLE:
				return isPlumeEnvelopeVisible();
			case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGHT:
				return getPlumeEnvelopeLenght();
		}
		return super.eGet(featureID, resolve, coreType);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_VISIBLE:
				setPlumeEnvelopeVisible((Boolean)newValue);
				return;
			case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGHT:
				setPlumeEnvelopeLenght((Double)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_VISIBLE:
				setPlumeEnvelopeVisible(PLUME_ENVELOPE_VISIBLE_EDEFAULT);
				return;
			case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGHT:
				setPlumeEnvelopeLenght(PLUME_ENVELOPE_LENGHT_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_VISIBLE:
				return plumeEnvelopeVisible != PLUME_ENVELOPE_VISIBLE_EDEFAULT;
			case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGHT:
				return plumeEnvelopeLenght != PLUME_ENVELOPE_LENGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (plumeEnvelopeVisible: ");
		result.append(plumeEnvelopeVisible);
		result.append(", plumeEnvelopeLenght: ");
		result.append(plumeEnvelopeLenght);
		result.append(')');
		return result.toString();
	}

	@Override
	protected void applyPreferences() 
	{		  
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		// Plume Envelope Color
		setColor(PreferenceConverter.getColor(store, VehicleUIPreferencesConstants.DEFAULT_THRUSTER_PLUME_ENVELOPE_COLOR_ID));
		
		// Plume Envelope Visibility
		setPlumeEnvelopeVisible(store.getBoolean(VehicleUIPreferencesConstants.DEFAULT_THRUSTER_PLUME_ENVELOPE_VISIBILITY_ID));
		
		// Plume Envelope Length
		setPlumeEnvelopeLenght(store.getDouble(VehicleUIPreferencesConstants.DEFAULT_THRUSTER_PLUME_ENVELOPE_LENGTH_ID));
		  
		super.applyPreferences();
	}	
	
 	@Override
  	protected void updateSceneObject(Notification notification) 
  	{
		if (sceneObject != null) 
		{
			ThrusterSceneObject thrusterSceneObject = (ThrusterSceneObject) sceneObject;
			
			int featureID = notification.getFeatureID(ThrusterPresentation.class);
			
			switch (featureID) 
			{
				case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_VISIBLE:
					thrusterSceneObject.setPlumeEnvelopeVisible(notification.getNewBooleanValue());
				break;
								
				case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGHT:
					thrusterSceneObject.setPlumeEnvelopeLenght(notification.getNewDoubleValue());
				break;
				
				case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__COLOR:
					if(notification.getNewValue() instanceof RGB)
					{
						RGB color = (RGB) notification.getNewValue();
						thrusterSceneObject.setColor(color);	
					}					
				break;
				
				default:
				break;
			}
		}
		
		super.updateSceneObject(notification);
	}
  	
  	@Override
  	protected void initialSceneObject() 
  	{
  		ThrusterSceneObject thrusterSceneObject = (ThrusterSceneObject) sceneObject;
    		
  		// Plume Envelope
  		thrusterSceneObject.setPlumeEnvelopeVisible(isPlumeEnvelopeVisible());	
  		thrusterSceneObject.setPlumeEnvelopeLenght(getPlumeEnvelopeLenght());
  		thrusterSceneObject.setColor(getColor());
  		
  		super.initialSceneObject();
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
	  
	@Override
	protected void finalize() throws Throwable 
	{
		Activator.getDefault().getPreferenceStore().removePropertyChangeListener(getPreferencesListener());
		super.finalize();
	}
} //ThrusterPresentationImpl
