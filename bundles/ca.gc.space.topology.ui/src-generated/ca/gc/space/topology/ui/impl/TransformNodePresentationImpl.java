/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.topology.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;

import ca.gc.space.topology.ui.Activator;
import ca.gc.space.topology.ui.TopologyUIPackage;
import ca.gc.space.topology.ui.TransformNodePresentation;
import ca.gc.space.topology.ui.adapters.TransformNodeSceneObject;
import ca.gc.space.topology.ui.preferences.PreferencesConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.topology.ui.impl.TransformNodePresentationImpl#isAxisVisible <em>Axis Visible</em>}</li>
 *   <li>{@link ca.gc.space.topology.ui.impl.TransformNodePresentationImpl#getAxisLenght <em>Axis Lenght</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformNodePresentationImpl extends NodePresentationImpl implements TransformNodePresentation {
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
	protected TransformNodePresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyUIPackage.Literals.TRANSFORM_NODE_PRESENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE, oldAxisVisible, axisVisible));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_LENGHT, oldAxisLenght, axisLenght));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE:
				return isAxisVisible();
			case TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_LENGHT:
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
			case TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE:
				setAxisVisible((Boolean)newValue);
				return;
			case TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_LENGHT:
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
			case TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE:
				setAxisVisible(AXIS_VISIBLE_EDEFAULT);
				return;
			case TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_LENGHT:
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
			case TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE:
				return axisVisible != AXIS_VISIBLE_EDEFAULT;
			case TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_LENGHT:
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
		TransformNodeSceneObject transformNodeObject = (TransformNodeSceneObject) getSceneObject();
		transformNodeObject.setAxisVisible(isAxisVisible());
		transformNodeObject.setAxisLength(getAxisLenght());
		
		super.initialSceneObject();
	}

	@Override
	protected void updateSceneObject(Notification notification) 
	{
		if (getSceneObject() instanceof TransformNodeSceneObject) 
		{
			TransformNodeSceneObject object = (TransformNodeSceneObject) getSceneObject();

			if (notification.getFeatureID(TransformNodePresentation.class) == TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE) 
			{
				object.setAxisVisible(isAxisVisible());
			}
			else if(notification.getFeatureID(TransformNodePresentation.class) == TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_LENGHT) 
			{
				object.setAxisLength(getAxisLenght());
			}
		}

		super.updateSceneObject(notification);
	}

	@Override
	protected void applyPreferences() {
	
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		// Change axis visibility.
		setAxisVisible(store.getBoolean(PreferencesConstants.DEFAULT_TRANSFORM_NODE_AXIS_VISIBILITY_ID));
		
		// Change Axis Length
		setAxisLenght(store.getDouble(PreferencesConstants.DEFAULT_TRANSFORM_NODE_AXIS_LENGHT_ID));
		
		super.applyPreferences();
	}

} //TransformNodePresentationImpl
