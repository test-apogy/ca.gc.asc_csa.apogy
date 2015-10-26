/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.topology.impl.ReferencedGroupNodeImpl;
import org.eclipse.symphony.core.AbstractWorksite;
import org.eclipse.symphony.core.ResultsListNode;
import org.eclipse.symphony.core.SymphonyCoreFactory;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.environment.Worksite;
import org.eclipse.symphony.core.environment.WorksiteNode;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.ResultsList;
import org.eclipse.symphony.core.topology.SymphonyEnvironmentNode;
import org.eclipse.symphony.core.topology.SymphonySystemAPIsNode;
import org.eclipse.symphony.core.topology.SymphonyTopologyFactory;
import org.eclipse.symphony.core.topology.SymphonyTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.topology.impl.SymphonyEnvironmentNodeImpl#getSymphonyEnvironment <em>Symphony Environment</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.topology.impl.SymphonyEnvironmentNodeImpl#getWorksiteNode <em>Worksite Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.topology.impl.SymphonyEnvironmentNodeImpl#getResultsListNode <em>Results List Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.topology.impl.SymphonyEnvironmentNodeImpl#getSymphonySystemAPIsNode <em>Symphony System AP Is Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymphonyEnvironmentNodeImpl extends ReferencedGroupNodeImpl implements SymphonyEnvironmentNode
{
	/**
	 * The cached value of the '{@link #getSymphonyEnvironment() <em>Symphony Environment</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSymphonyEnvironment()
	 * @generated
	 * @ordered
	 */
  protected SymphonyEnvironment symphonyEnvironment;

  private Adapter adapter = null;
	
  /**
	 * The cached value of the '{@link #getWorksiteNode() <em>Worksite Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWorksiteNode()
	 * @generated
	 * @ordered
	 */
  protected WorksiteNode worksiteNode;

  /**
	 * The cached value of the '{@link #getResultsListNode() <em>Results List Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResultsListNode()
	 * @generated
	 * @ordered
	 */
  protected ResultsListNode resultsListNode;

  /**
	 * The cached value of the '{@link #getSymphonySystemAPIsNode() <em>Symphony System AP Is Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSymphonySystemAPIsNode()
	 * @generated
	 * @ordered
	 */
  protected SymphonySystemAPIsNode symphonySystemAPIsNode;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SymphonyEnvironmentNodeImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SymphonyTopologyPackage.Literals.SYMPHONY_ENVIRONMENT_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyEnvironment getSymphonyEnvironment()
  {
		if (symphonyEnvironment != null && symphonyEnvironment.eIsProxy()) {
			InternalEObject oldSymphonyEnvironment = (InternalEObject)symphonyEnvironment;
			symphonyEnvironment = (SymphonyEnvironment)eResolveProxy(oldSymphonyEnvironment);
			if (symphonyEnvironment != oldSymphonyEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_ENVIRONMENT, oldSymphonyEnvironment, symphonyEnvironment));
			}
		}
		return symphonyEnvironment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyEnvironment basicGetSymphonyEnvironment()
  {
		return symphonyEnvironment;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setSymphonyEnvironment(SymphonyEnvironment newSymphonyEnvironment)
  {
	  updateSymphonyEnvironment(getSymphonyEnvironment(), newSymphonyEnvironment);
	  setSymphonyEnvironmentGen(newSymphonyEnvironment);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSymphonyEnvironmentGen(SymphonyEnvironment newSymphonyEnvironment)
  {
		SymphonyEnvironment oldSymphonyEnvironment = symphonyEnvironment;
		symphonyEnvironment = newSymphonyEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_ENVIRONMENT, oldSymphonyEnvironment, symphonyEnvironment));
	}
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WorksiteNode getWorksiteNode()
  {
		if (worksiteNode != null && worksiteNode.eIsProxy()) {
			InternalEObject oldWorksiteNode = (InternalEObject)worksiteNode;
			worksiteNode = (WorksiteNode)eResolveProxy(oldWorksiteNode);
			if (worksiteNode != oldWorksiteNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__WORKSITE_NODE, oldWorksiteNode, worksiteNode));
			}
		}
		return worksiteNode;
	}
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WorksiteNode getWorksiteNodeGen()
  {
		if (worksiteNode != null && worksiteNode.eIsProxy()) {
			InternalEObject oldWorksiteNode = (InternalEObject)worksiteNode;
			worksiteNode = (WorksiteNode)eResolveProxy(oldWorksiteNode);
			if (worksiteNode != oldWorksiteNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__WORKSITE_NODE, oldWorksiteNode, worksiteNode));
			}
		}
		return worksiteNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WorksiteNode basicGetWorksiteNode()
  {
		return worksiteNode;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setWorksiteNode(WorksiteNode newWorksiteNode)
  {
	  // Detach previous worksite node if applicable.
	  if(getWorksiteNode() != null) getChildren().remove(getWorksiteNode());
	  
	  // Attache new worksite node if applicable.
	  if(newWorksiteNode != null) getChildren().add(newWorksiteNode);
	  
	  setWorksiteNodeGen(newWorksiteNode);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWorksiteNodeGen(WorksiteNode newWorksiteNode)
  {
		WorksiteNode oldWorksiteNode = worksiteNode;
		worksiteNode = newWorksiteNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__WORKSITE_NODE, oldWorksiteNode, worksiteNode));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public ResultsListNode getResultsListNode()
  {
	  if(getResultsListNodeGen() == null)
	  {
		  resultsListNode = SymphonyCoreFactory.eINSTANCE.createResultsListNode();
		  resultsListNode.setDescription("Results" + getNodeId());
		  resultsListNode.setNodeId("RESULTS");
		    
		  // Attaches the results.		  		  
		  getReferencedChildren().add(resultsListNode);	
		  resultsListNode.setParent(this);
	  }
	  
	  return getResultsListNodeGen();
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResultsListNode getResultsListNodeGen()
  {
		if (resultsListNode != null && resultsListNode.eIsProxy()) {
			InternalEObject oldResultsListNode = (InternalEObject)resultsListNode;
			resultsListNode = (ResultsListNode)eResolveProxy(oldResultsListNode);
			if (resultsListNode != oldResultsListNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__RESULTS_LIST_NODE, oldResultsListNode, resultsListNode));
			}
		}
		return resultsListNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResultsListNode basicGetResultsListNode()
  {
		return resultsListNode;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SymphonySystemAPIsNode getSymphonySystemAPIsNode()
  {
	  if(getSymphonySystemAPIsNodeGen() == null)
	  {
		  symphonySystemAPIsNode = SymphonyTopologyFactory.eINSTANCE.createSymphonySystemAPIsNode();
		  symphonySystemAPIsNode.setNodeId("SYSTEMS" + getNodeId());
		  symphonySystemAPIsNode.setDescription("Systems");
		  
		  // Attaches the Systems		  
		  getChildren().add(symphonySystemAPIsNode);
		  		  
		  symphonySystemAPIsNode.setSymphonyEnvironment(getSymphonyEnvironment());
	  }
	  
	  return getSymphonySystemAPIsNodeGen();
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonySystemAPIsNode getSymphonySystemAPIsNodeGen()
  {
		if (symphonySystemAPIsNode != null && symphonySystemAPIsNode.eIsProxy()) {
			InternalEObject oldSymphonySystemAPIsNode = (InternalEObject)symphonySystemAPIsNode;
			symphonySystemAPIsNode = (SymphonySystemAPIsNode)eResolveProxy(oldSymphonySystemAPIsNode);
			if (symphonySystemAPIsNode != oldSymphonySystemAPIsNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_SYSTEM_AP_IS_NODE, oldSymphonySystemAPIsNode, symphonySystemAPIsNode));
			}
		}
		return symphonySystemAPIsNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonySystemAPIsNode basicGetSymphonySystemAPIsNode()
  {
		return symphonySystemAPIsNode;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void dispose()
  {	 
	  setSymphonyEnvironment(null);	  
	  
	  getWorksiteNode().setWorksite(null);
	  setWorksiteNode(null);
	  
	  getResultsListNode().setResultsList(null);
	  
	  getSymphonySystemAPIsNode().setSymphonyEnvironment(null);
	  
	  getChildren().clear();
	  
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_ENVIRONMENT:
				if (resolve) return getSymphonyEnvironment();
				return basicGetSymphonyEnvironment();
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__WORKSITE_NODE:
				if (resolve) return getWorksiteNode();
				return basicGetWorksiteNode();
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__RESULTS_LIST_NODE:
				if (resolve) return getResultsListNode();
				return basicGetResultsListNode();
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_SYSTEM_AP_IS_NODE:
				if (resolve) return getSymphonySystemAPIsNode();
				return basicGetSymphonySystemAPIsNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */  
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_ENVIRONMENT:
				setSymphonyEnvironment((SymphonyEnvironment)newValue);
				return;
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__WORKSITE_NODE:
				setWorksiteNode((WorksiteNode)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_ENVIRONMENT:
				setSymphonyEnvironment((SymphonyEnvironment)null);
				return;
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__WORKSITE_NODE:
				setWorksiteNode((WorksiteNode)null);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_ENVIRONMENT:
				return symphonyEnvironment != null;
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__WORKSITE_NODE:
				return worksiteNode != null;
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__RESULTS_LIST_NODE:
				return resultsListNode != null;
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE__SYMPHONY_SYSTEM_AP_IS_NODE:
				return symphonySystemAPIsNode != null;
		}
		return super.eIsSet(featureID);
	}
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE___DISPOSE:
				dispose();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

  private void updateSymphonyEnvironment(SymphonyEnvironment oldSymphonyEnvironment, SymphonyEnvironment newSymphonyEnvironment)
  {	 
	  ResultsList oldResultsList = null;
	  ResultsList newResultsList = null;
	  
	  AbstractWorksite oldWorksite = null;
	  AbstractWorksite newWorksite = null;
	  
	  if(oldSymphonyEnvironment != null) 
	  {
		  // Unregister from old environment, if applicable.
		  oldSymphonyEnvironment.eAdapters().remove(getAdapter());
		  
		  // Gets the old worksite.
		  oldWorksite = oldSymphonyEnvironment.getActiveWorksite();
		  
		  // If the Context was set
		  if(oldSymphonyEnvironment.getActiveContext() != null)
		  { 
			  if(oldSymphonyEnvironment.getActiveContext().getDataProductsList() != null)
			  {
				  oldResultsList = oldSymphonyEnvironment.getActiveContext().getDataProductsList().getOperationCallResultsList();
			  }
		  }
	  }
	  		
	  // Sets up the newEnvironement	  	  
	  if(newSymphonyEnvironment != null) 
	  {
		  if(newSymphonyEnvironment.getName() != null)
		  {
			  setNodeId(newSymphonyEnvironment.getName());
		  }
		  
		  setDescription("Symphony Environment Node");
		  
		  // Gets the new Worksite.
		  newWorksite = newSymphonyEnvironment.getActiveWorksite();
			  
		  // Register listener to the new SymphonyEnvironment.
		  newSymphonyEnvironment.eAdapters().add(getAdapter());	 
		  
		  // If the context is set.
		  if(newSymphonyEnvironment.getActiveContext() != null)
		  {
			  newResultsList = newSymphonyEnvironment.getActiveContext().getDataProductsList().getOperationCallResultsList();
		  }
	  }
	  
	  // Updates Result list.
	  updateResultLists(oldResultsList, newResultsList);
	  
	  // Updates Worksite
	  updateWorksite(oldWorksite, newWorksite);
	  
	  // Updates the Systems.
	  updateSystems(oldSymphonyEnvironment, newSymphonyEnvironment);
	  
  }
  
  private void updateContext(Context oldContext, Context newContext)
  {	  
	  ResultsList oldResultsList = null;
	  ResultsList newResultsList = null;

	  if(oldContext != null)
	  {
		  // Unregister from previous Context,
		  oldContext.eAdapters().remove(getAdapter());
		  
		  // Gets old ResultsList.
		  if(oldContext.getDataProductsList() != null)
		  {
			  oldResultsList = oldContext.getDataProductsList().getOperationCallResultsList();
		  }
	  }
		  
	  if(newContext != null)
	  {
		  // Register to new Context.
		  newContext.eAdapters().add(getAdapter());
			
		  // Gets new ResultsList.
		  if(newContext.getDataProductsList() != null)
		  {
			  newResultsList = newContext.getDataProductsList().getOperationCallResultsList();
		  }
	  }		
	  
	  // Updates Results.
	  updateResultLists(oldResultsList, newResultsList);
  }
  
  private void updateSystems(SymphonyEnvironment oldSymphonyEnvironment, SymphonyEnvironment newSymphonyEnvironment)
  {
	  getSymphonySystemAPIsNode().setSymphonyEnvironment(newSymphonyEnvironment);
  }
  
  private void updateResultLists(ResultsList oldResultsList, ResultsList newResultsList)
  {	  
	  if(oldResultsList != null) oldResultsList.eAdapters().remove(getAdapter());
	  
	  if(newResultsList != null) newResultsList.eAdapters().add(getAdapter());
	  
	  // Updates the getResultsListNode ResultList.
	  getResultsListNode().setResultsList(newResultsList);
	  	  
  }
  
  private void updateWorksite(AbstractWorksite oldWorksite, AbstractWorksite newWorksite)
  {	 	  
	  // Updates the WorksiteNode worksite if applicable.
	  if(newWorksite instanceof Worksite)
	  {
		  Worksite worksite = (Worksite) newWorksite;
		  setWorksiteNode(worksite.getWorksiteNode());
	  }
	  else
	  {
		  // Clears worksite.
		  setWorksiteNode(null);
	  }
  }
  
  
  protected Adapter getAdapter() 
  {
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{			
				@Override
				public void notifyChanged(Notification msg) 
				{				
					super.notifyChanged(msg);										
					
					if(msg.getNotifier() instanceof SymphonyEnvironment)
					{
						if(msg.getFeatureID(SymphonyEnvironment.class) == SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_CONTEXT)
						{
							// Active Context has changed.
							Context oldContext = (Context) msg.getOldValue();
							Context newContext = (Context) msg.getOldValue();
							updateContext(oldContext, newContext);							
						}
						else if(msg.getFeatureID(SymphonyEnvironment.class) == SymphonyCorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_WORKSITE)							
						{
							System.out.println("Worksite has changed !");
							
							// Active Worksite has changed.								
							AbstractWorksite oldWorksite = (AbstractWorksite) msg.getOldValue();
							AbstractWorksite newWorksite = (AbstractWorksite) msg.getNewValue();					
							updateWorksite(oldWorksite, newWorksite);
						}
					}
					else if(msg.getNotifier() instanceof Context)
					{
						if(msg.getFeatureID(Context.class) == EMFEcoreInvocatorPackage.BASIC_CONTEXT__DATA_PRODUCTS_LIST)						
						{
							// ResultsList has changed.								
							ResultsList oldResultsList = (ResultsList) msg.getOldValue();
							ResultsList newResultsList = (ResultsList) msg.getNewValue();
							updateResultLists(oldResultsList, newResultsList);								
						}
					}
				}				
			};
		}
		return adapter;
  }
} //DeploymentNodeImpl
