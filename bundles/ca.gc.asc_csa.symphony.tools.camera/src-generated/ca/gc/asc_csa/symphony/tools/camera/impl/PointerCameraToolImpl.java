/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

import javax.vecmath.Color3f;
import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeApiAdapter;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.listeners.AbstractVariableFeatureReferenceListener;
import ca.gc.asc_csa.eclipse.images.core.AbstractEImage;
import ca.gc.asc_csa.symphony.core.AbsolutePoseProvider;
import ca.gc.asc_csa.symphony.core.PoseProvider;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.tools.camera.Activator;
import ca.gc.asc_csa.symphony.tools.camera.CameraToolList;
import ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration;
import ca.gc.asc_csa.symphony.tools.camera.PointerCameraTool;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsFactory;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import ca.gc.asc_csa.symphony.tools.camera.ToolTipTextProvider;
import ca.gc.asc_csa.topology.bindings.AbstractTopologyBinding;
import ca.gc.space.math.MathFacade;
import ca.gc.space.math.Matrix4x4;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.sensors.fov.FovPackage;
import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.space.mrt.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;
import ca.gc.space.mrt.sensors.imaging.ImageSnapshot;
import ca.gc.space.topology.GroupNode;
import ca.gc.space.topology.TopologyFacade;
import ca.gc.space.topology.TopologyPackage;
import ca.gc.space.topology.TransformNode;
import ca.gc.space.topology.core.primitives.PrimitivesFactory;
import ca.gc.space.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointer Camera Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.PointerCameraToolImpl#getPoseTransform <em>Pose Transform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.PointerCameraToolImpl#getFov <em>Fov</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.PointerCameraToolImpl#getVectorColor <em>Vector Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.PointerCameraToolImpl#getIntersectionDistance <em>Intersection Distance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointerCameraToolImpl extends CameraToolImpl implements PointerCameraTool 
{
	private AbstractVariableFeatureReferenceListener abstractVariableFeatureReferenceListener = null;

	
	private ca.gc.space.topology.core.primitives.PickVector vector;
	private TransformNode vectorTransformNode = null;	
	private ImageSnapshot imageSnapshot;	
	private DecimalFormat distanceFormat = new DecimalFormat("0.00");	
//	private double distance = Double.NaN;
	
	
	/**
	 * The cached value of the '{@link #getPoseTransform() <em>Pose Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseTransform()
	 * @generated
	 * @ordered
	 */
	protected Matrix4x4 poseTransform;
	
	/**
	 * The cached value of the '{@link #getFov() <em>Fov</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFov()
	 * @generated
	 * @ordered
	 */
	protected RectangularFrustrumFieldOfView fov;

	/**
	 * The default value of the '{@link #getVectorColor() <em>Vector Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f VECTOR_COLOR_EDEFAULT = (Color3f)SymphonyCameraToolsFactory.eINSTANCE.createFromString(SymphonyCameraToolsPackage.eINSTANCE.getColor3f(), "0.0,1.0,0.0");

	/**
	 * The cached value of the '{@link #getVectorColor() <em>Vector Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f vectorColor = VECTOR_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntersectionDistance() <em>Intersection Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersectionDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double INTERSECTION_DISTANCE_EDEFAULT = 0.0;


	/**
	 * The cached value of the '{@link #getIntersectionDistance() <em>Intersection Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersectionDistance()
	 * @generated
	 * @ordered
	 */
	protected double intersectionDistance = INTERSECTION_DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointerCameraToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCameraToolsPackage.Literals.POINTER_CAMERA_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4x4 getPoseTransform() {
		return poseTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoseTransform(Matrix4x4 newPoseTransform, NotificationChain msgs) {
		Matrix4x4 oldPoseTransform = poseTransform;
		poseTransform = newPoseTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__POSE_TRANSFORM, oldPoseTransform, newPoseTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoseTransform(Matrix4x4 newPoseTransform) {
		if (newPoseTransform != poseTransform) {
			NotificationChain msgs = null;
			if (poseTransform != null)
				msgs = ((InternalEObject)poseTransform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__POSE_TRANSFORM, null, msgs);
			if (newPoseTransform != null)
				msgs = ((InternalEObject)newPoseTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__POSE_TRANSFORM, null, msgs);
			msgs = basicSetPoseTransform(newPoseTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__POSE_TRANSFORM, newPoseTransform, newPoseTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularFrustrumFieldOfView getFov() {
		if (fov != null && fov.eIsProxy()) {
			InternalEObject oldFov = (InternalEObject)fov;
			fov = (RectangularFrustrumFieldOfView)eResolveProxy(oldFov);
			if (fov != oldFov) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__FOV, oldFov, fov));
			}
		}
		return fov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularFrustrumFieldOfView basicGetFov() {
		return fov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setFov(RectangularFrustrumFieldOfView newFov)
	{						
		// Remove Vector from previous FOV if applicable.
		if(fov != null)
		{
			GroupNode parent = (GroupNode) fov.getParent();
			if(parent != null) parent.getChildren().remove(getVectorTransformNode());
		}
		
		setFovGen(newFov);
		
		// Adds Vector to new FOV if applicable.
		if(newFov != null)
		{			
			GroupNode parent = (GroupNode) newFov.getParent();
			if(parent != null)
			{
				parent.getChildren().add(getVectorTransformNode());				
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFovGen(RectangularFrustrumFieldOfView newFov) {
		RectangularFrustrumFieldOfView oldFov = fov;
		fov = newFov;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__FOV, oldFov, fov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getVectorColor() {
		return vectorColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setVectorColor(Color3f newVectorColor) 
	{
		setVectorColorGen(newVectorColor);
		updateVectorColor(newVectorColor);
	}
	
	@Override
	public void setCameraToolList(CameraToolList newCameraToolList) 
	{	
		super.setCameraToolList(newCameraToolList);
		
		if(newCameraToolList != null)
		{
			try
			{
				getAbstractVariableFeatureReferenceListener().setVariableFeatureReference(newCameraToolList.getCameraViewConfiguration());
				setFov(resolveFOV());
			}
			catch(Throwable t)
			{
				Logger.INSTANCE.log(Activator.ID, this, "Error occured while setting the CameraToolList!", EventSeverity.ERROR, t);
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorColorGen(Color3f newVectorColor) {
		Color3f oldVectorColor = vectorColor;
		vectorColor = newVectorColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__VECTOR_COLOR, oldVectorColor, vectorColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIntersectionDistance() {
		return intersectionDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntersectionDistance(double newIntersectionDistance) {
		double oldIntersectionDistance = intersectionDistance;
		intersectionDistance = newIntersectionDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__INTERSECTION_DISTANCE, oldIntersectionDistance, intersectionDistance));
	}

	@Override
	public void setVisible(boolean newVisible) 
	{	
		super.setVisible(newVisible);
		updateVectorVisibility(newVisible);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */	
	public String getToolTipText(AbstractCamera camera, ImageSnapshot imageSnapshot, int mouseButton, int x, int y) 
	{
		if(!Double.isNaN(getIntersectionDistance()))
		{
			return "distance = " + distanceFormat.format(getIntersectionDistance());
		}
		else
		{
			return "No intersection";
		}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__POSE_TRANSFORM:
				return basicSetPoseTransform(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__POSE_TRANSFORM:
				return getPoseTransform();
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__FOV:
				if (resolve) return getFov();
				return basicGetFov();
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__VECTOR_COLOR:
				return getVectorColor();
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__INTERSECTION_DISTANCE:
				return getIntersectionDistance();
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
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__POSE_TRANSFORM:
				setPoseTransform((Matrix4x4)newValue);
				return;
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__FOV:
				setFov((RectangularFrustrumFieldOfView)newValue);
				return;
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__VECTOR_COLOR:
				setVectorColor((Color3f)newValue);
				return;
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__INTERSECTION_DISTANCE:
				setIntersectionDistance((Double)newValue);
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
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__POSE_TRANSFORM:
				setPoseTransform((Matrix4x4)null);
				return;
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__FOV:
				setFov((RectangularFrustrumFieldOfView)null);
				return;
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__VECTOR_COLOR:
				setVectorColor(VECTOR_COLOR_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__INTERSECTION_DISTANCE:
				setIntersectionDistance(INTERSECTION_DISTANCE_EDEFAULT);
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
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__POSE_TRANSFORM:
				return poseTransform != null;
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__FOV:
				return fov != null;
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__VECTOR_COLOR:
				return VECTOR_COLOR_EDEFAULT == null ? vectorColor != null : !VECTOR_COLOR_EDEFAULT.equals(vectorColor);
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__INTERSECTION_DISTANCE:
				return intersectionDistance != INTERSECTION_DISTANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ToolTipTextProvider.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PoseProvider.class) {
			switch (derivedFeatureID) {
				case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__POSE_TRANSFORM: return SymphonyCorePackage.POSE_PROVIDER__POSE_TRANSFORM;
				default: return -1;
			}
		}
		if (baseClass == AbsolutePoseProvider.class) {
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ToolTipTextProvider.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PoseProvider.class) {
			switch (baseFeatureID) {
				case SymphonyCorePackage.POSE_PROVIDER__POSE_TRANSFORM: return SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL__POSE_TRANSFORM;
				default: return -1;
			}
		}
		if (baseClass == AbsolutePoseProvider.class) {
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ToolTipTextProvider.class) {
			switch (baseOperationID) {
				case SymphonyCameraToolsPackage.TOOL_TIP_TEXT_PROVIDER___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT: return SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT;
				default: return -1;
			}
		}
		if (baseClass == PoseProvider.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AbsolutePoseProvider.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SymphonyCameraToolsPackage.POINTER_CAMERA_TOOL___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT:
				return getToolTipText((AbstractCamera)arguments.get(0), (ImageSnapshot)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (vectorColor: ");
		result.append(vectorColor);
		result.append(", intersectionDistance: ");
		result.append(intersectionDistance);
		result.append(')');
		return result.toString();
	}	
	
	@Override
	public void initializeCamera(AbstractCamera camera) 
	{
		setFov(resolveFOV(camera));	
		
		// Sets color of vector.
		updateVectorColor(getVectorColor());
	}
	
	@Override
	public void updateImageSnapshot(ImageSnapshot imageSnapshot) 
	{
		this.imageSnapshot = imageSnapshot;				
	}
	
	@Override
	public void mouseMoved(AbstractEImage cameraImage, int mouseButton, int x, int y) 
	{			
		if(mouseButton == 1)
		{
			updatePointer(cameraImage, imageSnapshot, x, y);
			setIntersectionDistance(getVector().getIntersectionDistance());
		}				
	}
	
	@Override
	public void positionSelected(AbstractEImage cameraImage, int mouseButton, int x, int y) 
	{
		updatePointer(cameraImage, imageSnapshot, x, y);	
		setIntersectionDistance(getVector().getIntersectionDistance());
	}		
	
	@Override
	public void dispose() 
	{
		// Remove vector from topology.
		if(getFov() != null)
		{
			GroupNode parent = (GroupNode) fov.getParent();
			if(parent != null) 
			{
				parent.getChildren().remove(getVectorTransformNode());
			}						
		}
		
		super.dispose();
	}
	
	public RGB convert(Color3f color)
	{
		int red = Math.round((color.getX() * 255));
		int green = Math.round((color.getY() * 255));
		int blue = Math.round((color.getZ() * 255));
		return new RGB(red, green, blue);		
	}
	
	protected void updateVectorColor(Color3f color)
	{
		NodePresentation nodePresentation = ca.gc.space.topology.ui.Activator.getTopologyPresentationRegistry().getPresentationNode(getVector());
		if(nodePresentation != null)
		{
			nodePresentation.setColor(convert(color));
		}
	}
	
	protected void updateVectorVisibility(boolean visible)
	{
		// Sets the visibility of the Vector.
		NodePresentation nodePresentation = ca.gc.space.topology.ui.Activator.getTopologyPresentationRegistry().getPresentationNode(getVector());				
		if(nodePresentation != null)
		{
			nodePresentation.setVisible(visible);
		}
	}
	
	protected void updatePointer(AbstractEImage cameraImage, ImageSnapshot imageSnapshot, int x, int y)
	{				
		if(imageSnapshot != null && cameraImage != null)
		{								
			double xRotation = -imageSnapshot.convertToHorizontalAngle(x);
			double yRotation = imageSnapshot.convertToVerticalAngle(y);
									
			Matrix3d xRot = new Matrix3d();
			xRot.setIdentity();
			xRot.rotX(xRotation);
			
			Matrix3d yRot = new Matrix3d();
			yRot.setIdentity();
			yRot.rotY(yRotation);
						
			Matrix3d rotation = new Matrix3d();
			rotation.setIdentity();
			
			rotation.mul(xRot);
			rotation.mul(yRot);
			
			// Updates rotation matrix.
			getVectorTransformNode().setRotationMatrix(MathFacade.INSTANCE.createMatrix3x3(rotation));
			
			// Force update of vector.
			vector.setLength(100);
						
			// Updates the absolute pose.
			if(vector.getAbsoluteIntersectionPosition() != null)
			{
				Matrix4d m = new Matrix4d();
				m.setIdentity();
				m.set(new Vector3d(vector.getAbsoluteIntersectionPosition()));	
				Matrix4x4 pose = MathFacade.INSTANCE.createMatrix4x4(m);
				setPoseTransform(pose);			
			}
			else
			{
				setPoseTransform(null);
			}
						
			// FIXME Forces the vector color to udpate
			setVectorColor(getVectorColor());
		}
	}
	
	protected RectangularFrustrumFieldOfView resolveFOV(AbstractCamera camera)
	{
		if(camera == null)
		{
			return null;
		}
		else
		{
			RectangularFrustrumFieldOfView fov = null;					
			List<AbstractTopologyBinding> bindings = ca.gc.asc_csa.topology.bindings.Activator.getBindedBindings();
			Iterator<AbstractTopologyBinding> it = bindings.iterator();
			 		
			/*
			 * Searches the list of topology bindings for the RectangularFrustrumFieldOfViewBinding that binds the 
			 * camera FOV to a FOV in the topology.
			 */
			while(it.hasNext() && fov == null)
			{
				AbstractTopologyBinding next = it.next();
				
				if(next instanceof RectangularFrustrumFieldOfViewBinding)
				{
					RectangularFrustrumFieldOfViewBinding fovBinding = (RectangularFrustrumFieldOfViewBinding) next;
					
					// Gets the fov to which the fovBinding is binded.
					if(fovBinding.getFeatureNodeAdapter().getCurrentValue() instanceof RectangularFrustrumFieldOfView)
					{
						RectangularFrustrumFieldOfView bindedFOV = (RectangularFrustrumFieldOfView) fovBinding.getFeatureNodeAdapter().getCurrentValue();
						
						// If the binded FOV is the one of the camera, we have found the FOV (in the topology) associated with the camera.
						if(bindedFOV == camera.getFieldOfView())
						{
							fov = fovBinding.getFov();
						}
					}
				}
			}
			
			return fov;
		}
	}		
	
	protected TransformNode getVectorTransformNode()
	{
		if(vectorTransformNode == null)
		{
			Matrix4d m = new Matrix4d();
			m.setIdentity();
			
			Vector3d position = new Vector3d(0,0,0.01);
			m.set(position);
			
			vectorTransformNode = TopologyFacade.INSTANCE.createTransformNode(m);
			vectorTransformNode.setDescription("PointerCamera Vector Transform");						
			vectorTransformNode.getChildren().add(getVector());
		}
		return vectorTransformNode;
	}
	
	protected ca.gc.space.topology.core.primitives.PickVector getVector()
	{
		if(vector == null)
		{
			// Creates a vector of lenght 100 along the Z axis.
			vector =  PrimitivesFactory.eINSTANCE.createPickVector();
			vector.getNodeTypesInIntersection().add(Data3dPackage.eINSTANCE.getCartesianCoordinatesMesh());
			vector.getNodeTypesInIntersection().add(TopologyPackage.eINSTANCE.getContentNode());
			
			vector.setLength(100);
			vector.setXRotation(0);
			vector.setYRotation(Math.toRadians(-90));
			vector.setZRotation(0);				
			
			// Exclude RectangularFrustrumFieldOfView from selected objects.
			vector.getNodeTypesToExcludeFromIntersection().add(FovPackage.Literals.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW);
			
			
			// Updates the Vector color.
			setVectorColor(getVectorColor());
		}
		
		return vector;
	}
	
	protected RectangularFrustrumFieldOfView resolveFOV()
	{
		RectangularFrustrumFieldOfView fov = null;
		
		if(getCameraToolList() != null)
		{
			CameraViewConfiguration cameraViewConfiguration = getCameraToolList().getCameraViewConfiguration();
			if(cameraViewConfiguration != null)
			{
				AbstractCamera abstractCamera = cameraViewConfiguration.getCamera();
				if(abstractCamera != null)
				{
					fov = abstractCamera.getFieldOfView();
				}
			}
		}
		
		return fov;
	}

	protected AbstractVariableFeatureReferenceListener getAbstractVariableFeatureReferenceListener() 
	{
		if(abstractVariableFeatureReferenceListener == null)
		{
			abstractVariableFeatureReferenceListener = new AbstractVariableFeatureReferenceListener(getCameraToolList().getCameraViewConfiguration())
			{
				@Override
				protected void instanceChanged(EObject oldInstance,	EObject newInstance) 
				{
					setFov(resolveFOV());
				}
				
				@Override
				protected void contextChanged(Context oldContext, Context newContext) 
				{
					setFov(resolveFOV());
				}
				
				@Override
				protected void typeApiAdapterChanged(TypeApiAdapter oldTypeApiAdapter,TypeApiAdapter newTypeApiAdapter) 
				{
					setFov(resolveFOV());
				}
				
				@Override
				protected void variableChanged(Variable oldVariable, Variable newVariable)
				{
					setFov(resolveFOV());
				}
			  
				@Override
				protected void listRootNodeChanged()
				{
					setFov(resolveFOV());
				}				  				
			};
		}
		return abstractVariableFeatureReferenceListener;
	}
		
} //PointerCameraToolImpl
