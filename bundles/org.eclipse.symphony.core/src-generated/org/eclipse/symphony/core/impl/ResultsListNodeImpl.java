/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.Activator;
import org.eclipse.symphony.core.Positioned;
import org.eclipse.symphony.core.PositionedResult;
import org.eclipse.symphony.core.ResultNode;
import org.eclipse.symphony.core.ResultsListNode;
import org.eclipse.symphony.core.SymphonyCoreFacade;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.invocator.AbstractResult;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.ResultsList;

import ca.gc.space.topology.GroupNode;
import ca.gc.space.topology.TopologyFacade;
import ca.gc.space.topology.TransformNode;
import ca.gc.space.topology.impl.AggregateGroupNodeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Results List Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.ResultsListNodeImpl#getResultsList <em>Results List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultsListNodeImpl extends AggregateGroupNodeImpl implements ResultsListNode 
{
	private Adapter adapter;
	private Adapter positionnedAdapter;
	private Map<PositionedResult, ResultNode> resultToNodeMap = new HashMap<PositionedResult, ResultNode>();

	/**
	 * The cached value of the '{@link #getResultsList() <em>Results List</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResultsList()
	 * @generated
	 * @ordered
	 */
	protected ResultsList resultsList;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsListNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCorePackage.Literals.RESULTS_LIST_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsList getResultsList() {
		if (resultsList != null && resultsList.eIsProxy()) {
			InternalEObject oldResultsList = (InternalEObject)resultsList;
			resultsList = (ResultsList)eResolveProxy(oldResultsList);
			if (resultsList != oldResultsList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyCorePackage.RESULTS_LIST_NODE__RESULTS_LIST, oldResultsList, resultsList));
			}
		}
		return resultsList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsList basicGetResultsList() {
		return resultsList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setResultsList(ResultsList newResultsList) {

		ResultsList oldResultsList = getResultsList();

		setResultsListGen(newResultsList);

		updateResultsList(oldResultsList, newResultsList);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultsListGen(ResultsList newResultsList) {
		ResultsList oldResultsList = resultsList;
		resultsList = newResultsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.RESULTS_LIST_NODE__RESULTS_LIST, oldResultsList, resultsList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyCorePackage.RESULTS_LIST_NODE__RESULTS_LIST:
				if (resolve) return getResultsList();
				return basicGetResultsList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymphonyCorePackage.RESULTS_LIST_NODE__RESULTS_LIST:
				setResultsList((ResultsList)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SymphonyCorePackage.RESULTS_LIST_NODE__RESULTS_LIST:
				setResultsList((ResultsList)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SymphonyCorePackage.RESULTS_LIST_NODE__RESULTS_LIST:
				return resultsList != null;
		}
		return super.eIsSet(featureID);
	}

	private void updateResultsList(ResultsList oldResultsList,
			ResultsList newResultsList) {
		// Clears topology
		clearTopology();

		if (oldResultsList != null) {
			oldResultsList.eAdapters().remove(getAdapter());
		}

		if (newResultsList != null) {
			newResultsList.eAdapters().add(getAdapter());

			for (AbstractResult abstractResult : newResultsList.getResults()) {
				addResult(abstractResult);
			}
		}
	}

	private void clearTopology() {
		getChildren().clear();
		resultToNodeMap.clear();
	}

	private void addResult(AbstractResult abstractResult) 
	{
		if (abstractResult instanceof PositionedResult) 
		{
			PositionedResult positionedResult = (PositionedResult) abstractResult;

			// Creates a ResultNode.
			ResultNode resultNode = SymphonyCoreFacade.INSTANCE.createResultNode(positionedResult);

			TransformNode transform = TopologyFacade.INSTANCE.createTransformNode(positionedResult.getPose().asMatrix4d());
			if(positionedResult.getTime() != null)
			{
				String description = Long.toString(positionedResult.getTime().getTime());
				transform.setDescription(description);
			}
			transform.getChildren().add(resultNode);

			// Attaches the result this node.
			getChildren().add(transform);

			// Adds the result to the map.
			resultToNodeMap.put(positionedResult, resultNode);
			
			// Register adapter to the result and its pose.
			positionedResult.eAdapters().add(getPositionnedAdapter()) ;			
			if(positionedResult.getPose() != null) positionedResult.getPose().eAdapters().add(getPositionnedAdapter()) ; 

			Logger.INSTANCE.log(Activator.ID, this, "Added PositionResult time tagged <"	+ positionedResult.getTime() + ">.", EventSeverity.INFO);
		}
	}

	private void removeResult(AbstractResult abstractResult) {
		if (abstractResult instanceof PositionedResult) {
			PositionedResult positionedResult = (PositionedResult) abstractResult;

			// Retrieves the ResultNode associated with the PositionedResult
			ResultNode resultNode = resultToNodeMap.get(positionedResult);

			if (resultNode != null) 
			{
				GroupNode parent = (GroupNode) resultNode.getParent();
				parent.getChildren().remove(resultNode);

				getChildren().remove(parent);

				// UnRegister adapter from the result and its pose.
				positionedResult.eAdapters().remove(getPositionnedAdapter()) ;			
				if(positionedResult.getPose() != null) positionedResult.getPose().eAdapters().remove(getPositionnedAdapter()) ; 
				
				Logger.INSTANCE.log(Activator.ID, this,"Removed PositionResult time tagged <"+ positionedResult.getTime() + ">.",EventSeverity.INFO);
			}						
		}
	}

	private void updateResultPosition(PositionedResult abstractResult, Matrix4x4 newPose)
	{
		if(newPose != null)
		{		
			ResultNode resultNode = resultToNodeMap.get(abstractResult);
			if(resultNode != null)
			{
				if(resultNode.getParent() instanceof TransformNode)
				{
					TransformNode transformNode = (TransformNode) resultNode.getParent();										
					transformNode.setTransformation(newPose.asMatrix4d());
				}
			}
		}
	}
	
	private Adapter getAdapter() 
	{
		if (adapter == null) 
		{
			adapter = new AdapterImpl() 
			{
				@SuppressWarnings("unchecked")
				@Override
				public void notifyChanged(Notification msg) 
				{
					if (msg.getNotifier() instanceof ResultsList) {
						if (msg.getFeatureID(ResultsList.class) == EMFEcoreInvocatorPackage.RESULTS_LIST__RESULTS) {
							switch (msg.getEventType()) {
							case Notification.ADD: {
								AbstractResult resultAdded = (AbstractResult) msg
										.getNewValue();
								addResult(resultAdded);
								break;
							}
							case Notification.ADD_MANY: {
								Collection<? extends AbstractResult> resultsAdded = (Collection<? extends AbstractResult>) msg
										.getNewValue();
								for (AbstractResult abstractMapLayer : resultsAdded) {
									addResult(abstractMapLayer);
								}
								break;
							}
							case Notification.REMOVE: {
								AbstractResult resultRemoved = (AbstractResult) msg
										.getOldValue();
								removeResult(resultRemoved);
								break;
							}
							case Notification.REMOVE_MANY: {
								Collection<? extends AbstractResult> resultsRemoved = (Collection<? extends AbstractResult>) msg
										.getOldValue();
								for (AbstractResult abstractMapLayer : resultsRemoved) {
									removeResult(abstractMapLayer);
								}
								break;
							}
							default: {
							}
							}
						}
					}
				}
			};
		}

		return adapter;
	}
	
	private Adapter getPositionnedAdapter() 
	{
		if(positionnedAdapter == null)
		{
			positionnedAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof PositionedResult)
					{
						PositionedResult positionedResult = (PositionedResult) msg.getNotifier();
						
						int featureID = msg.getFeatureID(Positioned.class);
						
						if(featureID == SymphonyCorePackage.POSITIONED_RESULT__POSE)
						{
							// Unregister from previous pose.
							if(msg.getOldValue() instanceof Matrix4x4)
							{
								Matrix4x4 oldMatrix = (Matrix4x4) msg.getOldValue();
								oldMatrix.eAdapters().remove(getPositionnedAdapter());
							}
							
							// Register to new pose.
							if(msg.getNewValue() instanceof Matrix4x4)
							{
								Matrix4x4 newMatrix = (Matrix4x4) msg.getNewValue();
								newMatrix.eAdapters().add(getPositionnedAdapter());
								updateResultPosition(positionedResult, newMatrix);
							}
						}
					}
					else if(msg.getNotifier() instanceof Matrix4x4)
					{
						Matrix4x4 matrix = (Matrix4x4) msg.getNotifier();
						
						if(matrix.eContainer() instanceof PositionedResult)
						{
							PositionedResult positionedResult = (PositionedResult) matrix.eContainer();
							updateResultPosition(positionedResult, matrix);
						}
					}
				}
			};
		}
		return positionnedAdapter;
	}
	
	

} // ResultsListNodeImpl
