/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.ui.Ruler3dToolNodePresentation;
import ca.gc.asc_csa.apogy.addons.ui.ApogyAddonsUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ruler3d Tool Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Ruler3dToolNodePresentationImpl extends NodePresentationImpl implements Ruler3dToolNodePresentation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ruler3dToolNodePresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsUIPackage.Literals.RULER3D_TOOL_NODE_PRESENTATION;
	}

	@Override
	protected void updateSceneObject(Notification notification) 
	{
		// TODO
		super.updateSceneObject(notification);
	}	
} //Ruler3dToolNodePresentationImpl
