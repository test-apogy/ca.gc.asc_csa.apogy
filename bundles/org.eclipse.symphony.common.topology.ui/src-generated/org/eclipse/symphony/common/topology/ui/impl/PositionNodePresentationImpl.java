/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.symphony.common.topology.ui.Activator;
import org.eclipse.symphony.common.topology.ui.PositionNodePresentation;
import org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage;
import org.eclipse.symphony.common.topology.ui.adapters.TransformNodeSceneObject;
import org.eclipse.symphony.common.topology.ui.preferences.PreferencesConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.impl.PositionNodePresentationImpl#isAxisVisible <em>Axis Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.impl.PositionNodePresentationImpl#getAxisLenght <em>Axis Lenght</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionNodePresentationImpl extends NodePresentationImpl implements PositionNodePresentation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionNodePresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonTopologyUIPackage.Literals.POSITION_NODE_PRESENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonTopologyUIPackage.POSITION_NODE_PRESENTATION__AXIS_VISIBLE, oldAxisVisible, axisVisible));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonTopologyUIPackage.POSITION_NODE_PRESENTATION__AXIS_LENGHT, oldAxisLenght, axisLenght));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CommonTopologyUIPackage.POSITION_NODE_PRESENTATION__AXIS_VISIBLE:
				return isAxisVisible();
			case Symphony__CommonTopologyUIPackage.POSITION_NODE_PRESENTATION__AXIS_LENGHT:
				return getAxisLenght();
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
			case Symphony__CommonTopologyUIPackage.POSITION_NODE_PRESENTATION__AXIS_VISIBLE:
				setAxisVisible((Boolean)newValue);
				return;
			case Symphony__CommonTopologyUIPackage.POSITION_NODE_PRESENTATION__AXIS_LENGHT:
				setAxisLenght((Double)newValue);
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
			case Symphony__CommonTopologyUIPackage.POSITION_NODE_PRESENTATION__AXIS_VISIBLE:
				setAxisVisible(AXIS_VISIBLE_EDEFAULT);
				return;
			case Symphony__CommonTopologyUIPackage.POSITION_NODE_PRESENTATION__AXIS_LENGHT:
				setAxisLenght(AXIS_LENGHT_EDEFAULT);
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
			case Symphony__CommonTopologyUIPackage.POSITION_NODE_PRESENTATION__AXIS_VISIBLE:
				return axisVisible != AXIS_VISIBLE_EDEFAULT;
			case Symphony__CommonTopologyUIPackage.POSITION_NODE_PRESENTATION__AXIS_LENGHT:
				return axisLenght != AXIS_LENGHT_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}
	
	@Override
	protected void initialSceneObject() 
	{				
		if (sceneObject instanceof TransformNodeSceneObject) 
		{
			TransformNodeSceneObject transformNodeObject = (TransformNodeSceneObject) sceneObject;

			transformNodeObject.setAxisVisible(isAxisVisible());
			transformNodeObject.setAxisLength(getAxisLenght());
		}
		
		super.initialSceneObject();
	}

	@Override
	protected void updateSceneObject(Notification notification) 
	{
		if (getSceneObject() instanceof TransformNodeSceneObject) 
		{
			TransformNodeSceneObject object = (TransformNodeSceneObject) getSceneObject();

			if (notification.getFeatureID(PositionNodePresentation.class) == Symphony__CommonTopologyUIPackage.POSITION_NODE_PRESENTATION__AXIS_VISIBLE) 
			{
				object.setAxisVisible(isAxisVisible());
			}
			else if(notification.getFeatureID(PositionNodePresentation.class) == Symphony__CommonTopologyUIPackage.POSITION_NODE_PRESENTATION__AXIS_LENGHT) 
			{
				object.setAxisLength(getAxisLenght());
			}
		}

		super.updateSceneObject(notification);	
	}

	@Override
	protected void applyPreferences() 
	{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Change axis visibility.
		setAxisVisible(store.getBoolean(PreferencesConstants.DEFAULT_POSITION_NODE_AXIS_VISIBILITY_ID));
				
		// Change Axis Length
		setAxisLenght(store.getDouble(PreferencesConstants.DEFAULT_POSITION_NODE_AXIS_LENGHT_ID));
		
		super.applyPreferences();
	}
} //PositionNodePresentationImpl
