/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import ca.gc.asc_csa.apogy.common.topology.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.RotationNodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.adapters.TransformNodeSceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.preferences.PreferencesConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotation Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.RotationNodePresentationImpl#isAxisVisible <em>Axis Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.RotationNodePresentationImpl#getAxisLength <em>Axis Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotationNodePresentationImpl extends NodePresentationImpl implements RotationNodePresentation {
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
	 * The default value of the '{@link #getAxisLength() <em>Axis Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLength()
	 * @generated
	 * @ordered
	 */
	protected static final double AXIS_LENGTH_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getAxisLength() <em>Axis Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLength()
	 * @generated
	 * @ordered
	 */
	protected double axisLength = AXIS_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotationNodePresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyUIPackage.Literals.ROTATION_NODE_PRESENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_VISIBLE, oldAxisVisible, axisVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAxisLength() {
		return axisLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisLength(double newAxisLength) {
		double oldAxisLength = axisLength;
		axisLength = newAxisLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_LENGTH, oldAxisLength, axisLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_VISIBLE:
				return isAxisVisible();
			case ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_LENGTH:
				return getAxisLength();
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
			case ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_VISIBLE:
				setAxisVisible((Boolean)newValue);
				return;
			case ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_LENGTH:
				setAxisLength((Double)newValue);
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
			case ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_VISIBLE:
				setAxisVisible(AXIS_VISIBLE_EDEFAULT);
				return;
			case ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_LENGTH:
				setAxisLength(AXIS_LENGTH_EDEFAULT);
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
			case ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_VISIBLE:
				return axisVisible != AXIS_VISIBLE_EDEFAULT;
			case ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_LENGTH:
				return axisLength != AXIS_LENGTH_EDEFAULT;
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
		result.append(", axisLength: ");
		result.append(axisLength);
		result.append(')');
		return result.toString();
	}

	@Override
	protected void initialSceneObject() 
	{				
		if (sceneObject instanceof TransformNodeSceneObject) {
			TransformNodeSceneObject rotationNodeObject = (TransformNodeSceneObject) sceneObject;
			rotationNodeObject.setAxisVisible(isAxisVisible());
			rotationNodeObject.setAxisLength(getAxisLength());
		}
		
		super.initialSceneObject();
	}

	@Override
	protected void updateSceneObject(Notification notification) 
	{
		if (getSceneObject() instanceof TransformNodeSceneObject) 
		{
			TransformNodeSceneObject object = (TransformNodeSceneObject) getSceneObject();

			if (notification.getFeatureID(RotationNodePresentation.class) == ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_VISIBLE) 
			{
				object.setAxisVisible(isAxisVisible());
			}
			else if(notification.getFeatureID(RotationNodePresentation.class) == ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION__AXIS_LENGTH) 
			{
				object.setAxisLength(getAxisLength());
			}
		}

		super.updateSceneObject(notification);	
	}

	@Override
	protected void applyPreferences() 
	{	
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Change axis visibility.
		setAxisVisible(store.getBoolean(PreferencesConstants.DEFAULT_ROTATION_NODE_AXIS_VISIBILITY_ID));
				
		// Change Axis Length
		setAxisLength(store.getDouble(PreferencesConstants.DEFAULT_ROTATION_NODE_AXIS_LENGTH_ID));

		
		super.applyPreferences();
	}
} //RotationNodePresentationImpl
