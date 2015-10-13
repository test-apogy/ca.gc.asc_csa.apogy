/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.viewer.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.topology.ui.NodeSelection;
import org.eclipse.symphony.common.topology.ui.viewer.Activator;
import org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer;
import org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerPackage;
import org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerRegistry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.viewer.impl.TopologyViewerRegistryImpl#isVerbose <em>Verbose</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.viewer.impl.TopologyViewerRegistryImpl#getITopologyViewers <em>ITopology Viewers</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.viewer.impl.TopologyViewerRegistryImpl#getLatestNodeSelection <em>Latest Node Selection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologyViewerRegistryImpl extends MinimalEObjectImpl.Container implements TopologyViewerRegistry 
{
	/**
	 * The default value of the '{@link #isVerbose() <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerbose()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERBOSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerbose() <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerbose()
	 * @generated
	 * @ordered
	 */
	protected boolean verbose = VERBOSE_EDEFAULT;

	private ISelectionChangedListener selectionChangedListener = null;
	
	/**
	 * The cached value of the '{@link #getITopologyViewers() <em>ITopology Viewers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getITopologyViewers()
	 * @generated
	 * @ordered
	 */
	protected EList<ITopologyViewer> iTopologyViewers;

	/**
	 * The cached value of the '{@link #getLatestNodeSelection() <em>Latest Node Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestNodeSelection()
	 * @generated
	 * @ordered
	 */
	protected NodeSelection latestNodeSelection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyViewerRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyViewerPackage.Literals.TOPOLOGY_VIEWER_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerbose() {
		return verbose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerbose(boolean newVerbose) {
		boolean oldVerbose = verbose;
		verbose = newVerbose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__VERBOSE, oldVerbose, verbose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ITopologyViewer> getITopologyViewers() {
		if (iTopologyViewers == null) {
			iTopologyViewers = new EDataTypeEList<ITopologyViewer>(ITopologyViewer.class, this, TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__ITOPOLOGY_VIEWERS);
		}
		return iTopologyViewers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSelection getLatestNodeSelection() {
		if (latestNodeSelection != null && latestNodeSelection.eIsProxy()) {
			InternalEObject oldLatestNodeSelection = (InternalEObject)latestNodeSelection;
			latestNodeSelection = (NodeSelection)eResolveProxy(oldLatestNodeSelection);
			if (latestNodeSelection != oldLatestNodeSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__LATEST_NODE_SELECTION, oldLatestNodeSelection, latestNodeSelection));
			}
		}
		return latestNodeSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSelection basicGetLatestNodeSelection() {
		return latestNodeSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestNodeSelection(NodeSelection newLatestNodeSelection) {
		NodeSelection oldLatestNodeSelection = latestNodeSelection;
		latestNodeSelection = newLatestNodeSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__LATEST_NODE_SELECTION, oldLatestNodeSelection, latestNodeSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void registerITopologyViewer(ITopologyViewer iTopologyViewer) 
	{
		if(iTopologyViewer != null)
		{
			if(!getITopologyViewers().contains(iTopologyViewer))
			{
				if(isVerbose())
				{
					Logger.INSTANCE.log(Activator.ID, this, "Registering <" + iTopologyViewer + ">.", EventSeverity.INFO);
				}
				
				getITopologyViewers().add(iTopologyViewer);
				
				iTopologyViewer.addSelectionChangedListener(getSelectionChangedListener());
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void unRegisterITopologyViewer(ITopologyViewer iTopologyViewer) 
	{
		if(iTopologyViewer != null)
		{
			if(isVerbose())
			{
				Logger.INSTANCE.log(Activator.ID, this, "Un-Registering <" + iTopologyViewer + ">.", EventSeverity.INFO);
			}
			
			getITopologyViewers().remove(iTopologyViewer);
			
			iTopologyViewer.removeSelectionChangedListener(getSelectionChangedListener());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__VERBOSE:
				return isVerbose();
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__ITOPOLOGY_VIEWERS:
				return getITopologyViewers();
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__LATEST_NODE_SELECTION:
				if (resolve) return getLatestNodeSelection();
				return basicGetLatestNodeSelection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__VERBOSE:
				setVerbose((Boolean)newValue);
				return;
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__ITOPOLOGY_VIEWERS:
				getITopologyViewers().clear();
				getITopologyViewers().addAll((Collection<? extends ITopologyViewer>)newValue);
				return;
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__LATEST_NODE_SELECTION:
				setLatestNodeSelection((NodeSelection)newValue);
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
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__VERBOSE:
				setVerbose(VERBOSE_EDEFAULT);
				return;
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__ITOPOLOGY_VIEWERS:
				getITopologyViewers().clear();
				return;
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__LATEST_NODE_SELECTION:
				setLatestNodeSelection((NodeSelection)null);
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
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__VERBOSE:
				return verbose != VERBOSE_EDEFAULT;
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__ITOPOLOGY_VIEWERS:
				return iTopologyViewers != null && !iTopologyViewers.isEmpty();
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__LATEST_NODE_SELECTION:
				return latestNodeSelection != null;
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
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY___REGISTER_ITOPOLOGY_VIEWER__ITOPOLOGYVIEWER:
				registerITopologyViewer((ITopologyViewer)arguments.get(0));
				return null;
			case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY___UN_REGISTER_ITOPOLOGY_VIEWER__ITOPOLOGYVIEWER:
				unRegisterITopologyViewer((ITopologyViewer)arguments.get(0));
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
		result.append(" (verbose: ");
		result.append(verbose);
		result.append(", iTopologyViewers: ");
		result.append(iTopologyViewers);
		result.append(')');
		return result.toString();
	}

	private ISelectionChangedListener getSelectionChangedListener() 
	{
		if(selectionChangedListener == null)
		{
			selectionChangedListener = new ISelectionChangedListener() {
				
				@Override
				public void selectionChanged(SelectionChangedEvent event) 
				{
					if(event != null)
					{
						if(event.getSelection() instanceof IStructuredSelection)
						{
							IStructuredSelection sel = (IStructuredSelection) event.getSelection();
							if(sel.getFirstElement() instanceof NodeSelection)
							{
								NodeSelection nodeSelection = (NodeSelection) sel.getFirstElement();
								
								if(isVerbose())
								{
									String message = new String();
									message += "Selected Node     : " + nodeSelection.getSelectedNode() + "\n";
									message += "Relative Position : " + nodeSelection.getRelativeIntersectionPoint() + "\n";
									message += "Absolute Position : " + nodeSelection.getAbsoluteIntersectionPoint() + "\n";
									message += "Relative Normal   : " + nodeSelection.getRelativeIntersectionNormal() + "\n";
									message += "Absolute Normal   : " + nodeSelection.getAbsoluteIntersectionNormal() + "\n";
									
									Logger.INSTANCE.log(Activator.ID, this, "New Selection <\n" + message + ">.", EventSeverity.INFO);
								}
																																						
								setLatestNodeSelection(nodeSelection);
							}
						}
					}
				}
			};
		}
		return selectionChangedListener;
	}
	
} //TopologyViewerRegistryImpl
