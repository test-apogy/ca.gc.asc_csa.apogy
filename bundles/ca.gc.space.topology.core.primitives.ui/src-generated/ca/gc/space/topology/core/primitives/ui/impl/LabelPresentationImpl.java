/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.topology.core.primitives.ui.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.core.primitives.Label;
import ca.gc.space.topology.core.primitives.PrimitivesPackage;
import ca.gc.space.topology.core.primitives.ui.LabelPresentation;
import ca.gc.space.topology.core.primitives.ui.LabelSceneObject;
import ca.gc.space.topology.core.primitives.ui.TopologyUIPrimitivesPackage;
import ca.gc.space.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LabelPresentationImpl extends NodePresentationImpl implements LabelPresentation 
{
	private Adapter adapter;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelPresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyUIPrimitivesPackage.Literals.LABEL_PRESENTATION;
	}
	
	@Override
	protected void updateSceneObject(Notification notification) {
		if (sceneObject != null) {
			LabelSceneObject lableObject = (LabelSceneObject) sceneObject;

			if (notification.getFeatureID(Label.class) == PrimitivesPackage.LABEL__DESCRIPTION) {
				lableObject.setText(getNode().getDescription());
			}
		}
		super.updateSceneObject(notification);
	}
	
	@Override
	public void setNode(Node newNode) 
	{
		Node oldNode = getNode();
		if (adapter == null)
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					updateSceneObject(msg);
				}
			};

		if (oldNode != null)
			oldNode.eAdapters().remove(adapter);
		if (newNode != null)
			newNode.eAdapters().add(adapter);

		super.setNode(newNode);
	}
	
} //LabelPresentationImpl
