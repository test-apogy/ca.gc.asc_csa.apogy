/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.topology.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;

import ca.gc.space.topology.ui.Activator;
import ca.gc.space.topology.ui.MeshPresentationMode;
import ca.gc.space.topology.ui.TopologyUIPackage;
import ca.gc.space.topology.ui.URLNodePresentation;
import ca.gc.space.topology.ui.adapters.URLNodeSceneObject;
import ca.gc.space.topology.ui.preferences.PreferencesConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URL Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.topology.ui.impl.URLNodePresentationImpl#isAxisVisible <em>Axis Visible</em>}</li>
 *   <li>{@link ca.gc.space.topology.ui.impl.URLNodePresentationImpl#getAxisLenght <em>Axis Lenght</em>}</li>
 *   <li>{@link ca.gc.space.topology.ui.impl.URLNodePresentationImpl#getPresentationMode <em>Presentation Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URLNodePresentationImpl extends NodePresentationImpl implements URLNodePresentation {
	/**
	 * The default value of the '{@link #isAxisVisible() <em>Axis Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAxisVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AXIS_VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAxisVisible() <em>Axis Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAxisVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean axisVisible = AXIS_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAxisLenght() <em>Axis Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLenght()
	 * @generated
	 * @ordered
	 */
	protected static final double AXIS_LENGHT_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getAxisLenght() <em>Axis Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLenght()
	 * @generated
	 * @ordered
	 */
	protected double axisLenght = AXIS_LENGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresentationMode() <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationMode()
	 * @generated
	 * @ordered
	 */
	protected static final MeshPresentationMode PRESENTATION_MODE_EDEFAULT = MeshPresentationMode.SURFACE;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLNodePresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyUIPackage.Literals.URL_NODE_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAxisVisible() {
		return axisVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisVisible(boolean newAxisVisible) {
		boolean oldAxisVisible = axisVisible;
		axisVisible = newAxisVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.URL_NODE_PRESENTATION__AXIS_VISIBLE, oldAxisVisible, axisVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAxisLenght() {
		return axisLenght;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisLenght(double newAxisLenght) {
		double oldAxisLenght = axisLenght;
		axisLenght = newAxisLenght;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.URL_NODE_PRESENTATION__AXIS_LENGHT, oldAxisLenght, axisLenght));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshPresentationMode getPresentationMode() {
		return presentationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationMode(MeshPresentationMode newPresentationMode) {
		MeshPresentationMode oldPresentationMode = presentationMode;
		presentationMode = newPresentationMode == null ? PRESENTATION_MODE_EDEFAULT : newPresentationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.URL_NODE_PRESENTATION__PRESENTATION_MODE, oldPresentationMode, presentationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopologyUIPackage.URL_NODE_PRESENTATION__AXIS_VISIBLE:
				return isAxisVisible();
			case TopologyUIPackage.URL_NODE_PRESENTATION__AXIS_LENGHT:
				return getAxisLenght();
			case TopologyUIPackage.URL_NODE_PRESENTATION__PRESENTATION_MODE:
				return getPresentationMode();
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
			case TopologyUIPackage.URL_NODE_PRESENTATION__AXIS_VISIBLE:
				setAxisVisible((Boolean)newValue);
				return;
			case TopologyUIPackage.URL_NODE_PRESENTATION__AXIS_LENGHT:
				setAxisLenght((Double)newValue);
				return;
			case TopologyUIPackage.URL_NODE_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode((MeshPresentationMode)newValue);
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
			case TopologyUIPackage.URL_NODE_PRESENTATION__AXIS_VISIBLE:
				setAxisVisible(AXIS_VISIBLE_EDEFAULT);
				return;
			case TopologyUIPackage.URL_NODE_PRESENTATION__AXIS_LENGHT:
				setAxisLenght(AXIS_LENGHT_EDEFAULT);
				return;
			case TopologyUIPackage.URL_NODE_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode(PRESENTATION_MODE_EDEFAULT);
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
			case TopologyUIPackage.URL_NODE_PRESENTATION__AXIS_VISIBLE:
				return axisVisible != AXIS_VISIBLE_EDEFAULT;
			case TopologyUIPackage.URL_NODE_PRESENTATION__AXIS_LENGHT:
				return axisLenght != AXIS_LENGHT_EDEFAULT;
			case TopologyUIPackage.URL_NODE_PRESENTATION__PRESENTATION_MODE:
				return presentationMode != PRESENTATION_MODE_EDEFAULT;
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
		result.append(" (axisVisible: ");
		result.append(axisVisible);
		result.append(", axisLenght: ");
		result.append(axisLenght);
		result.append(", presentationMode: ");
		result.append(presentationMode);
		result.append(')');
		return result.toString();
	}

	@Override
	protected void initialSceneObject() 
	{
		if (getSceneObject() instanceof URLNodeSceneObject) 
		{
			URLNodeSceneObject object = (URLNodeSceneObject) getSceneObject();
			object.setAxisVisible(isAxisVisible());
			object.setAxisLength(getAxisLenght());
			object.setPresentationMode(getPresentationMode());
		}
		super.initialSceneObject();
	}
	
	@Override
	protected void updateSceneObject(Notification notification) 
	{
		if (getSceneObject() instanceof URLNodeSceneObject) 
		{							
			URLNodeSceneObject object = (URLNodeSceneObject) getSceneObject();

			if (notification.getFeatureID(URLNodePresentation.class) == TopologyUIPackage.URL_NODE_PRESENTATION__AXIS_VISIBLE) 
			{
				object.setAxisVisible(isAxisVisible());
			}
			else if(notification.getFeatureID(URLNodePresentation.class) == TopologyUIPackage.URL_NODE_PRESENTATION__AXIS_LENGHT)
			{
				object.setAxisLength(getAxisLenght());
			}
			else if(notification.getFeatureID(URLNodePresentation.class) == TopologyUIPackage.URL_NODE_PRESENTATION__PRESENTATION_MODE)
			{
				object.setPresentationMode(getPresentationMode());
			}
		}
		
		super.updateSceneObject(notification);
	}
	
	@Override
	protected void applyPreferences() {
	
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		// Change axis visibility.
		setAxisVisible(store.getBoolean(PreferencesConstants.DEFAULT_URL_NODE_AXIS_VISIBILITY_ID));
		
		// Change Axis Lenght.
		setAxisLenght(store.getDouble(PreferencesConstants.DEFAULT_URL_NODE_AXIS_LENGHT_ID));
		
		super.applyPreferences();
	}

} //URLNodePresentationImpl
