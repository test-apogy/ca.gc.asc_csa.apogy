/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.impl;

import javax.vecmath.AxisAngle4d;
import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.symphony.addons.FeatureOfInterestPickingTool;
import org.eclipse.symphony.addons.Symphony__AddonsPackage;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.common.topology.ui.NodeSelection;
import org.eclipse.symphony.core.FeatureOfInterest;
import org.eclipse.symphony.core.FeatureOfInterestList;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.environment.FeaturesOfInterestMapLayer;
import org.eclipse.symphony.core.environment.ui.dialogs.FeatureOfInterestCreationDialog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Of Interest Picking Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.impl.FeatureOfInterestPickingToolImpl#getFeatureOfInterestList <em>Feature Of Interest List</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.FeatureOfInterestPickingToolImpl#getPickAbsolutePosition <em>Pick Absolute Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.FeatureOfInterestPickingToolImpl#getPickRelativePosition <em>Pick Relative Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.FeatureOfInterestPickingToolImpl#getPickedNode <em>Picked Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.FeatureOfInterestPickingToolImpl#getPickAbsoluteNormal <em>Pick Absolute Normal</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.FeatureOfInterestPickingToolImpl#getPickRelativeNormal <em>Pick Relative Normal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureOfInterestPickingToolImpl extends Simple3DToolImpl implements FeatureOfInterestPickingTool {
	/**
	 * The cached value of the '{@link #getFeatureOfInterestList() <em>Feature Of Interest List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterestList()
	 * @generated
	 * @ordered
	 */
	protected FeatureOfInterestList featureOfInterestList;

	/**
	 * The cached value of the '{@link #getPickAbsolutePosition() <em>Pick Absolute Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickAbsolutePosition()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d pickAbsolutePosition;

	/**
	 * The cached value of the '{@link #getPickRelativePosition() <em>Pick Relative Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickRelativePosition()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d pickRelativePosition;

	/**
	 * The cached value of the '{@link #getPickedNode() <em>Picked Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickedNode()
	 * @generated
	 * @ordered
	 */
	protected Node pickedNode;

	/**
	 * The cached value of the '{@link #getPickAbsoluteNormal() <em>Pick Absolute Normal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickAbsoluteNormal()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d pickAbsoluteNormal;

	/**
	 * The cached value of the '{@link #getPickRelativeNormal() <em>Pick Relative Normal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickRelativeNormal()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d pickRelativeNormal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureOfInterestPickingToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsPackage.Literals.FEATURE_OF_INTEREST_PICKING_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestList getFeatureOfInterestList() {
		if (featureOfInterestList != null && featureOfInterestList.eIsProxy()) {
			InternalEObject oldFeatureOfInterestList = (InternalEObject)featureOfInterestList;
			featureOfInterestList = (FeatureOfInterestList)eResolveProxy(oldFeatureOfInterestList);
			if (featureOfInterestList != oldFeatureOfInterestList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__FEATURE_OF_INTEREST_LIST, oldFeatureOfInterestList, featureOfInterestList));
			}
		}
		return featureOfInterestList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestList basicGetFeatureOfInterestList() {
		return featureOfInterestList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOfInterestList(FeatureOfInterestList newFeatureOfInterestList) {
		FeatureOfInterestList oldFeatureOfInterestList = featureOfInterestList;
		featureOfInterestList = newFeatureOfInterestList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__FEATURE_OF_INTEREST_LIST, oldFeatureOfInterestList, featureOfInterestList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getPickAbsolutePosition() {
		if (pickAbsolutePosition != null && pickAbsolutePosition.eIsProxy()) {
			InternalEObject oldPickAbsolutePosition = (InternalEObject)pickAbsolutePosition;
			pickAbsolutePosition = (Tuple3d)eResolveProxy(oldPickAbsolutePosition);
			if (pickAbsolutePosition != oldPickAbsolutePosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_POSITION, oldPickAbsolutePosition, pickAbsolutePosition));
			}
		}
		return pickAbsolutePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d basicGetPickAbsolutePosition() {
		return pickAbsolutePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPickAbsolutePosition(Tuple3d newPickAbsolutePosition) {
		Tuple3d oldPickAbsolutePosition = pickAbsolutePosition;
		pickAbsolutePosition = newPickAbsolutePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_POSITION, oldPickAbsolutePosition, pickAbsolutePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getPickRelativePosition() {
		if (pickRelativePosition != null && pickRelativePosition.eIsProxy()) {
			InternalEObject oldPickRelativePosition = (InternalEObject)pickRelativePosition;
			pickRelativePosition = (Tuple3d)eResolveProxy(oldPickRelativePosition);
			if (pickRelativePosition != oldPickRelativePosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_POSITION, oldPickRelativePosition, pickRelativePosition));
			}
		}
		return pickRelativePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d basicGetPickRelativePosition() {
		return pickRelativePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPickRelativePosition(Tuple3d newPickRelativePosition) {
		Tuple3d oldPickRelativePosition = pickRelativePosition;
		pickRelativePosition = newPickRelativePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_POSITION, oldPickRelativePosition, pickRelativePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getPickedNode() {
		if (pickedNode != null && pickedNode.eIsProxy()) {
			InternalEObject oldPickedNode = (InternalEObject)pickedNode;
			pickedNode = (Node)eResolveProxy(oldPickedNode);
			if (pickedNode != oldPickedNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICKED_NODE, oldPickedNode, pickedNode));
			}
		}
		return pickedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetPickedNode() {
		return pickedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPickedNode(Node newPickedNode) {
		Node oldPickedNode = pickedNode;
		pickedNode = newPickedNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICKED_NODE, oldPickedNode, pickedNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getPickAbsoluteNormal() {
		if (pickAbsoluteNormal != null && pickAbsoluteNormal.eIsProxy()) {
			InternalEObject oldPickAbsoluteNormal = (InternalEObject)pickAbsoluteNormal;
			pickAbsoluteNormal = (Tuple3d)eResolveProxy(oldPickAbsoluteNormal);
			if (pickAbsoluteNormal != oldPickAbsoluteNormal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_NORMAL, oldPickAbsoluteNormal, pickAbsoluteNormal));
			}
		}
		return pickAbsoluteNormal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d basicGetPickAbsoluteNormal() {
		return pickAbsoluteNormal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPickAbsoluteNormal(Tuple3d newPickAbsoluteNormal) {
		Tuple3d oldPickAbsoluteNormal = pickAbsoluteNormal;
		pickAbsoluteNormal = newPickAbsoluteNormal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_NORMAL, oldPickAbsoluteNormal, pickAbsoluteNormal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getPickRelativeNormal() {
		if (pickRelativeNormal != null && pickRelativeNormal.eIsProxy()) {
			InternalEObject oldPickRelativeNormal = (InternalEObject)pickRelativeNormal;
			pickRelativeNormal = (Tuple3d)eResolveProxy(oldPickRelativeNormal);
			if (pickRelativeNormal != oldPickRelativeNormal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_NORMAL, oldPickRelativeNormal, pickRelativeNormal));
			}
		}
		return pickRelativeNormal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d basicGetPickRelativeNormal() {
		return pickRelativeNormal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPickRelativeNormal(Tuple3d newPickRelativeNormal) {
		Tuple3d oldPickRelativeNormal = pickRelativeNormal;
		pickRelativeNormal = newPickRelativeNormal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_NORMAL, oldPickRelativeNormal, pickRelativeNormal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__FEATURE_OF_INTEREST_LIST:
				if (resolve) return getFeatureOfInterestList();
				return basicGetFeatureOfInterestList();
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_POSITION:
				if (resolve) return getPickAbsolutePosition();
				return basicGetPickAbsolutePosition();
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_POSITION:
				if (resolve) return getPickRelativePosition();
				return basicGetPickRelativePosition();
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICKED_NODE:
				if (resolve) return getPickedNode();
				return basicGetPickedNode();
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_NORMAL:
				if (resolve) return getPickAbsoluteNormal();
				return basicGetPickAbsoluteNormal();
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_NORMAL:
				if (resolve) return getPickRelativeNormal();
				return basicGetPickRelativeNormal();
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
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__FEATURE_OF_INTEREST_LIST:
				setFeatureOfInterestList((FeatureOfInterestList)newValue);
				return;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_POSITION:
				setPickAbsolutePosition((Tuple3d)newValue);
				return;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_POSITION:
				setPickRelativePosition((Tuple3d)newValue);
				return;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICKED_NODE:
				setPickedNode((Node)newValue);
				return;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_NORMAL:
				setPickAbsoluteNormal((Tuple3d)newValue);
				return;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_NORMAL:
				setPickRelativeNormal((Tuple3d)newValue);
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
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__FEATURE_OF_INTEREST_LIST:
				setFeatureOfInterestList((FeatureOfInterestList)null);
				return;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_POSITION:
				setPickAbsolutePosition((Tuple3d)null);
				return;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_POSITION:
				setPickRelativePosition((Tuple3d)null);
				return;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICKED_NODE:
				setPickedNode((Node)null);
				return;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_NORMAL:
				setPickAbsoluteNormal((Tuple3d)null);
				return;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_NORMAL:
				setPickRelativeNormal((Tuple3d)null);
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
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__FEATURE_OF_INTEREST_LIST:
				return featureOfInterestList != null;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_POSITION:
				return pickAbsolutePosition != null;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_POSITION:
				return pickRelativePosition != null;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICKED_NODE:
				return pickedNode != null;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_NORMAL:
				return pickAbsoluteNormal != null;
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_NORMAL:
				return pickRelativeNormal != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void selectionChanged(NodeSelection nodeSelection) 
	{
		try
		{
			setPickedNode(nodeSelection.getSelectedNode());
			
			if(nodeSelection.getRelativeIntersectionPoint() != null)
			{
				setPickRelativePosition(MathFacade.INSTANCE.createTuple3d(nodeSelection.getRelativeIntersectionPoint()));
			}
			else
			{
				setPickRelativePosition(null);
			}
			
			if(nodeSelection.getAbsoluteIntersectionNormal() != null)
			{				
				setPickAbsoluteNormal(MathFacade.INSTANCE.createTuple3d(nodeSelection.getAbsoluteIntersectionNormal().x, nodeSelection.getAbsoluteIntersectionNormal().y, nodeSelection.getAbsoluteIntersectionNormal().z));
			}
			else
			{
				setPickAbsoluteNormal(null);
			}
			
			if(getPickedNode() != null && getFeatureOfInterestList() != null)
			{				
				Matrix4x4 pose = createFOIPose(getPickedNode(), getPickRelativePosition(), getPickAbsoluteNormal());
							
				// Opens pop-up to edit FOI
				final Shell shell = Display.getCurrent().getActiveShell();
				
				FeaturesOfInterestMapLayer featuresOfInterestMapLayer = null;
				if(getFeatureOfInterestList() != null && getFeatureOfInterestList().eContainer() instanceof FeaturesOfInterestMapLayer)
				{
					featuresOfInterestMapLayer = (FeaturesOfInterestMapLayer) getFeatureOfInterestList().eContainer();
				}
				
				FeatureOfInterestCreationDialog mapSelectionDialog = new FeatureOfInterestCreationDialog(shell, pose, featuresOfInterestMapLayer);					
				
				if(mapSelectionDialog.open() == Window.OK)		
				{
					FeatureOfInterest foi = mapSelectionDialog.getFeatureOfInterest();
					
					// Gets the Editing Domain.
					EditingDomain editingDomain = org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain.getEditingDomainFor(getFeatureOfInterestList());
					
					// Creates an ADD command to add the FeatureOfInterest.
					Command addCommand = AddCommand.create(editingDomain, getFeatureOfInterestList(), SymphonyCorePackage.Literals.FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST, foi);
					
					// Executes the command.
					editingDomain.getCommandStack().execute(addCommand);
				}
			}
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
	
//	@Override
//	public void selectionChanged(Node node, Tuple3d relativePosition, Tuple3d normal) 
//	{
//		try
//		{
//			setPickedNode(node);
//			setPickRelativePosition(relativePosition);
//			
//			setPickAbsoluteNormal(normal);
//			
//			if(node != null && getFeatureOfInterestList() != null)
//			{				
//				Matrix4x4 pose = createFOIPose(node, relativePosition, normal);
//							
//				// Opens pop-up to edit FOI
//				final Shell shell = Display.getCurrent().getActiveShell();
//				
//				FeaturesOfInterestMapLayer featuresOfInterestMapLayer = null;
//				if(getFeatureOfInterestList() != null && getFeatureOfInterestList().eContainer() instanceof FeaturesOfInterestMapLayer)
//				{
//					featuresOfInterestMapLayer = (FeaturesOfInterestMapLayer) getFeatureOfInterestList().eContainer();
//				}
//				
//				FeatureOfInterestCreationDialog mapSelectionDialog = new FeatureOfInterestCreationDialog(shell, pose, featuresOfInterestMapLayer);					
//				
//				if(mapSelectionDialog.open() == Window.OK)		
//				{
//					FeatureOfInterest foi = mapSelectionDialog.getFeatureOfInterest();
//					
//					// Gets the Editing Domain.
//					EditingDomain editingDomain = org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain.getEditingDomainFor(getFeatureOfInterestList());
//					
//					// Creates an ADD command to add the FeatureOfInterest.
//					Command addCommand = AddCommand.create(editingDomain, getFeatureOfInterestList(), SymphonyCorePackage.Literals.FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST, foi);
//					
//					// Executes the command.
//					editingDomain.getCommandStack().execute(addCommand);
//				}
//			}
//		}
//		catch(Throwable t)
//		{
//			t.printStackTrace();
//		}
//	}
	
	private Matrix4x4 createFOIPose(Node node, Tuple3d relativePosition, Tuple3d normal)
	{
		Matrix4x4 pose = null;
		
		// Gets the transform of the selected point relative to the root.
		Matrix4d transform = TopologyFacade.INSTANCE.expressNodeInRootFrame(node);
		
		Point3d selectedPoint = new Point3d();
		if(relativePosition != null)
		{
			selectedPoint = new Point3d(relativePosition.asTuple3d());				
		}
		
		// Applies transform to the point.
		transform.transform(selectedPoint);
		
		// Updates absolute position
		Tuple3d absolutePosition = MathFacade.INSTANCE.createTuple3d(selectedPoint);
		setPickAbsolutePosition(absolutePosition);
		
		// Gets the rotation matrix associated with the normal.
		Matrix3x3 rotation = MathFacade.INSTANCE.createMatrix3x3(createFOIOrientation(normal));
				
		// Creates the pose of the FeatureOfInterest to be created.								
		TransformNode t = TopologyFacade.INSTANCE.createTransformNodeXYZ(selectedPoint.x, selectedPoint.y, selectedPoint.z, 0, 0, 0);
		t.setRotationMatrix(rotation);
				
		pose = MathFacade.INSTANCE.createMatrix4x4(t.asMatrix4d());
		
		return pose;
	}
	
	private Matrix3d createFOIOrientation(Tuple3d normal)
	{
		  Matrix3d orientation = new Matrix3d();
		  orientation.setIdentity();

		  // The Z axis
		  Vector3d planeOriginal = new Vector3d(0, 0, 1);
		  
		  // The normal
		  Vector3d planeContact = new Vector3d(normal.asTuple3d());
		  		  	  		  
		  // Computes angle between both vectors.
		  double dotProduct = planeContact.dot(planeOriginal);
		  
		  // If the angle is defined
		  if(-1.0 <= dotProduct && dotProduct<= 1.0)
		  {
			  double theta = Math.acos(dotProduct);
			  		  
			  // If theta is not 0, computes rotation matrix.
			  if(theta != 0)
			  {
				  // Computes the vector orthogonal to both planes normals.
				  Vector3d cross = new Vector3d();
				  cross.cross(planeContact, planeOriginal);	  
				  cross.normalize();	  	  
				  
				  // Creates a rotation of theta around the orthogonal vector.
				  AxisAngle4d axisAngle = new AxisAngle4d(cross, theta);  
				  
				  // Converts rotation around vector to rotation matrix.
				  orientation.set(axisAngle);
				  
				  // Invert the rotation to provide the correction.
				  orientation.invert();
			  }	  	  	 
		  }
		  
		  return orientation;
	}
} //FeatureOfInterestPickingToolImpl
