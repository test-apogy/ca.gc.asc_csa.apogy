/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.SymphonyEnvironment;

import ca.gc.asc_csa.symphony.tools.core.Simple3DTool;
import ca.gc.asc_csa.symphony.tools.core.SymphonyToolsCorePackage;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodeSelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple3 DTool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.core.impl.Simple3DToolImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.core.impl.Simple3DToolImpl#getRootNode <em>Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class Simple3DToolImpl extends SimpleToolImpl implements Simple3DTool 
{
	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRootNode() <em>Root Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootNode()
	 * @generated
	 * @ordered
	 */
	protected Node rootNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Simple3DToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyToolsCorePackage.Literals.SIMPLE3_DTOOL;
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.SIMPLE3_DTOOL__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getRootNode() {
		if (rootNode != null && rootNode.eIsProxy()) {
			InternalEObject oldRootNode = (InternalEObject)rootNode;
			rootNode = (Node)eResolveProxy(oldRootNode);
			if (rootNode != oldRootNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyToolsCorePackage.SIMPLE3_DTOOL__ROOT_NODE, oldRootNode, rootNode));
			}
		}
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetRootNode() {
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootNode(Node newRootNode) {
		Node oldRootNode = rootNode;
		rootNode = newRootNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.SIMPLE3_DTOOL__ROOT_NODE, oldRootNode, rootNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void selectionChanged(NodeSelection nodeSelection) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyToolsCorePackage.SIMPLE3_DTOOL__VISIBLE:
				return isVisible();
			case SymphonyToolsCorePackage.SIMPLE3_DTOOL__ROOT_NODE:
				if (resolve) return getRootNode();
				return basicGetRootNode();
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
			case SymphonyToolsCorePackage.SIMPLE3_DTOOL__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case SymphonyToolsCorePackage.SIMPLE3_DTOOL__ROOT_NODE:
				setRootNode((Node)newValue);
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
			case SymphonyToolsCorePackage.SIMPLE3_DTOOL__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case SymphonyToolsCorePackage.SIMPLE3_DTOOL__ROOT_NODE:
				setRootNode((Node)null);
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
			case SymphonyToolsCorePackage.SIMPLE3_DTOOL__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case SymphonyToolsCorePackage.SIMPLE3_DTOOL__ROOT_NODE:
				return rootNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SymphonyToolsCorePackage.SIMPLE3_DTOOL___SELECTION_CHANGED__NODESELECTION:
				selectionChanged((NodeSelection)arguments.get(0));
				return null;
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
		result.append(" (visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setActive(boolean newActive) 
	{
		if(newActive)
		{
			ca.gc.asc_csa.symphony.tools.core.Activator.registerSimple3DTool(this);
			
			// Attempts to find the root node of the UNIVERSE for the tool.
			setRootNode(resolveRootNode());
		}
		else
		{
			ca.gc.asc_csa.symphony.tools.core.Activator.unregisterSimple3DTool(this);
		}
		super.setActive(newActive);
	}
	
	private Node resolveRootNode()
	{
		Node root = null;
		
		try
		{
			if(getToolList().getToolsList().getInvocatorSession().getEnvironment() instanceof SymphonyEnvironment)
			{
				SymphonyEnvironment se = (SymphonyEnvironment) getToolList().getToolsList().getInvocatorSession().getEnvironment();
				if(se.getSymphonyTopology() != null)
				{
					root = se.getSymphonyTopology().getRootNode();
				}
			}
		}
		catch(Throwable t)
		{			
		}
		
		return root;
	}
	
} //Simple3DToolImpl
