/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFactory;
import org.eclipse.symphony.common.emf.ListFeatureNode;
import org.eclipse.symphony.common.emf.ListRootNode;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.ReferencedGroupNode;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyFactory;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.common.topology.bindings.TopologyBindingsFactory;
import org.eclipse.symphony.common.topology.bindings.TransformMatrixBinding;
import org.eclipse.symphony.common.topology.impl.ReferencedGroupNodeImpl;
import org.eclipse.symphony.core.AssemblyLink;
import org.eclipse.symphony.core.PoseProvider;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.SymphonySystem;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.eclipse.symphony.core.invocator.AbstractTypeImplementation;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.TypeMemberImplementation;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableImplementation;
import org.eclipse.symphony.core.topology.Activator;
import org.eclipse.symphony.core.topology.SymphonySystemAPIsNode;
import org.eclipse.symphony.core.topology.SymphonyTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symphony System AP Is Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.topology.impl.SymphonySystemAPIsNodeImpl#getSymphonyEnvironment <em>Symphony Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymphonySystemAPIsNodeImpl extends ReferencedGroupNodeImpl implements SymphonySystemAPIsNode
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

  private List<AssemblyLink> processedAssemblyLink = new ArrayList<AssemblyLink>();
	
  private Adapter adapter = null;
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SymphonySystemAPIsNodeImpl()
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
		return SymphonyTopologyPackage.Literals.SYMPHONY_SYSTEM_AP_IS_NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyTopologyPackage.SYMPHONY_SYSTEM_AP_IS_NODE__SYMPHONY_ENVIRONMENT, oldSymphonyEnvironment, symphonyEnvironment));
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
	  SymphonyEnvironment oldSymphonyEnvironment = getSymphonyEnvironment();
	  
	  setSymphonyEnvironmentGen(newSymphonyEnvironment);
	  	  
	  updateSymphonyEnvironment(oldSymphonyEnvironment, newSymphonyEnvironment);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyTopologyPackage.SYMPHONY_SYSTEM_AP_IS_NODE__SYMPHONY_ENVIRONMENT, oldSymphonyEnvironment, symphonyEnvironment));
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
			case SymphonyTopologyPackage.SYMPHONY_SYSTEM_AP_IS_NODE__SYMPHONY_ENVIRONMENT:
				if (resolve) return getSymphonyEnvironment();
				return basicGetSymphonyEnvironment();
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
			case SymphonyTopologyPackage.SYMPHONY_SYSTEM_AP_IS_NODE__SYMPHONY_ENVIRONMENT:
				setSymphonyEnvironment((SymphonyEnvironment)newValue);
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
			case SymphonyTopologyPackage.SYMPHONY_SYSTEM_AP_IS_NODE__SYMPHONY_ENVIRONMENT:
				setSymphonyEnvironment((SymphonyEnvironment)null);
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
			case SymphonyTopologyPackage.SYMPHONY_SYSTEM_AP_IS_NODE__SYMPHONY_ENVIRONMENT:
				return symphonyEnvironment != null;
		}
		return super.eIsSet(featureID);
	}

  private void clearTopology()
  {
	  getChildren().clear();	  
  }
  
  private void updateSymphonyEnvironment(SymphonyEnvironment oldSymphonyEnvironment, SymphonyEnvironment newSymphonyEnvironment)
  {	
		// Clears the topology
		clearTopology();
		
		// Un-register adapter from old SymphonyEnvironment if applicable.
		if(oldSymphonyEnvironment != null)
		{
			oldSymphonyEnvironment.eAdapters().remove(getAdapter());
			
			// Un-Register from the old Environment Active Context if defined.
			if(oldSymphonyEnvironment.getActiveContext() != null)
			{
				oldSymphonyEnvironment.getActiveContext().eAdapters().remove(getAdapter());
			}
		}
		
		// Register adapter to new SymphonyEnvironment if applicable.
		if(newSymphonyEnvironment != null)
		{						
			newSymphonyEnvironment.eAdapters().add(getAdapter());
			
			// Register to the new Environment Active Context if defined.
			if(newSymphonyEnvironment.getActiveContext() != null)
			{
				newSymphonyEnvironment.getActiveContext().eAdapters().add(getAdapter());
			}
			
			
			// Initialize the topology.
			initializeTopology(newSymphonyEnvironment);
		}
  }
  
  private void updateContext(Context oldContext, Context newContext)
  {
	  // Clears the topology
	  clearTopology();
		
	  if(oldContext != null)
	  {
		  oldContext.eAdapters().remove(getAdapter());
	  }
		
	  if(newContext != null)
	  {
		  newContext.eAdapters().add(getAdapter());
										
		  // Updates topology.
		  initializeTopology(getSymphonyEnvironment());
	  }	
  }
  
  private void updateVariablesImplementations()
  {
	  // Clears the topology
	  clearTopology();
	  
	  // Updates topology.
	  initializeTopology(getSymphonyEnvironment());
  }
  

  private TransformMatrixBinding createTransformMatrixBinding(final SymphonySystem symphonySystem, final TransformNode poseTransform, final PoseProvider poseProvider)
  {
	  TransformMatrixBinding binding = TopologyBindingsFactory.eINSTANCE.createTransformMatrixBinding();
	  
	  ListRootNode listRootNode = Symphony__CommonEMFFactory.eINSTANCE.createListRootNode();
	  listRootNode.setSourceClass(poseProvider.eClass());
	  
	  ListFeatureNode listFeatureNode = Symphony__CommonEMFFactory.eINSTANCE.createListFeatureNode();	  	 
	  listFeatureNode.setStructuralFeature(SymphonyCorePackage.Literals.POSE_PROVIDER__POSE_TRANSFORM);
	  listRootNode.setChild(listFeatureNode);
	  
	  binding.setFeatureNode(listFeatureNode);  
	  binding.setTransformNode(poseTransform);
	  binding.setSource(poseProvider);	  	  
	  
	  symphonySystem.getBindingSet().getBindingsList().getBindings().add(binding);
	  
	  binding.bind();
	  
	  return binding;	  
  }

  
  private Map<SymphonySystem, SymphonySystemApiAdapter> createSystemToApiAdapterMap(final SymphonyEnvironment symphonyEnvironment)
  {
	  Map<SymphonySystem, SymphonySystemApiAdapter> map = new HashMap<SymphonySystem, SymphonySystemApiAdapter>();
	  
	  Iterator<VariableImplementation> it = symphonyEnvironment.getActiveContext().getVariableImplementationsList().getVariableImplementations().iterator();
	  VariableImplementation variableImplementation = null;
	  
	  while(it.hasNext())
	  {			
		  variableImplementation = it.next();		  
		  createSystemToApiAdapterMap(variableImplementation, map);
	  }
	 
	  return map;
  }
    
  private void createSystemToApiAdapterMap(AbstractTypeImplementation abstractTypeImplementation, final Map<SymphonySystem, SymphonySystemApiAdapter> systemToApiAdapterMap)
  {
	  	  	  
	  if(abstractTypeImplementation.getAdapterInstance() instanceof SymphonySystemApiAdapter)
	  {
		  SymphonySystemApiAdapter symphonySystemApiAdapter = (SymphonySystemApiAdapter) abstractTypeImplementation.getAdapterInstance();
		  
		  if(symphonySystemApiAdapter.getSymphonySystem() != null)
		  {
			  SymphonySystem symphonySystem = symphonySystemApiAdapter.getSymphonySystem();
			  
			  systemToApiAdapterMap.put(symphonySystem, symphonySystemApiAdapter);
		  }
	  }
	  
	  if(abstractTypeImplementation instanceof AbstractTypeImplementation)
	  {
		  AbstractTypeImplementation typeMemberImplementationsListProvider = (AbstractTypeImplementation) abstractTypeImplementation;
		  
		  for(TypeMemberImplementation tmi : typeMemberImplementationsListProvider.getTypeMemberImplementations())
		  {
			  createSystemToApiAdapterMap(tmi, systemToApiAdapterMap);
		  }
	  }
  }

  private void initializeTopology(final SymphonyEnvironment symphonyEnvironment)
  {	  	  
	  processedAssemblyLink.clear();
	  
	  if(symphonyEnvironment != null && symphonyEnvironment.getActiveContext() != null)
	  {
		  Iterator<VariableImplementation> it = symphonyEnvironment.getActiveContext().getVariableImplementationsList().getVariableImplementations().iterator();
		  VariableImplementation variableImplementation = null;
		  
		  Map<SymphonySystem, SymphonySystemApiAdapter> systemToApiAdapterMap = createSystemToApiAdapterMap(symphonyEnvironment);
		  
		  while(it.hasNext())
		  {			
			  variableImplementation = it.next();
			  Variable variable = variableImplementation.getVariable();
			  
			  try
			  {			
				  // EObject instance = variableImplementation.getInstance();
				  if(variableImplementation.getAdapterInstance() instanceof SymphonySystemApiAdapter)
				  {		
					  Logger.INSTANCE.log(Activator.ID, this, "Adding variable <" + variable.getName() + "> to the topology.", EventSeverity.WARNING);						  					 
					  
					  SymphonySystemApiAdapter symphonySystemApiAdapter = (SymphonySystemApiAdapter) variableImplementation.getAdapterInstance();					 					
					  SymphonySystem symphonySystem = symphonySystemApiAdapter.getSymphonySystem();

					  if(symphonySystem != null)
					  {							  
						  // Adds a transform node used to effect the poseTransform.						  
						  Matrix4d matrix = new Matrix4d();
						  matrix.setIdentity();	
						  	
						  if(symphonySystemApiAdapter instanceof PoseProvider)
						  {
							  PoseProvider poseProvider = (PoseProvider) symphonySystemApiAdapter;
							  
							  if(poseProvider.getPoseTransform() != null)
							  {
								  matrix = poseProvider.getPoseTransform().asMatrix4d();
							  }
						  }
						  
						  TransformNode poseTransform = TopologyFacade.INSTANCE.createTransformNode(matrix);						  
						  poseTransform.setNodeId(variable.getName() + "_poseTransform");						 
						  
						  // If the system defines a pose provider.
						  if(symphonySystem.getPoseProviderInstance() instanceof PoseProvider)
						  {							  
							  PoseProvider poseProvide = symphonySystem.getPoseProviderInstance();
							  
							  // Adds a binding to link the transform node to the poseTransform.
							  createTransformMatrixBinding(symphonySystem, poseTransform, poseProvide);
						  }
						  						  
						  // Adds the topology representing the SymphonySystem itself.
						  ReferencedGroupNode referencedGroupNode = Symphony__CommonTopologyFactory.eINSTANCE.createReferencedGroupNode();
						  referencedGroupNode.setNodeId(variableImplementation.getVariable().getName());
						  if(symphonySystem.getTopologyRoot() != null && symphonySystem.getTopologyRoot().getOriginNode() != null)
						  {
							  referencedGroupNode.getChildren().add(symphonySystem.getTopologyRoot().getOriginNode());
						  }
						  else
						  {
							  String message = "Variable <" + variable.getName() + "> as no topology attached.";
							  Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);	
							  
							  // DEBUG
							  if(symphonySystem.getTopologyRoot() != null)
							  {
								  symphonySystem.getTopologyRoot().setOriginNode(Symphony__CommonTopologyFactory.eINSTANCE.createTransformNode());
							  }
							  // DEBUG
						  }
						  
						  // Attaches the system topology to the transformNode.
						  poseTransform.getChildren().add(referencedGroupNode);						  										  								  						  
						  getChildren().add(poseTransform);
						  
						  // Assembles the variable sub-systems.							 						
						  assembleSubSystems(symphonySystem, systemToApiAdapterMap);			
					  }
					  else if(variable.getVariableType().getInterfaceClass() != null)
					  {
						  String message = "Variable <" + variable.getName() + "> instance's SymphonySystem is not initialized !";
						  Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);								  
					  }							  				  				 					  					 
				  }
			  }
			  catch(Throwable t)
			  {				 
				  Logger.INSTANCE.log(Activator.ID, this, "Failed to create topology for variable <" + variable.getName() + ">", EventSeverity.ERROR, t);
			  }
		  }		  
	  }	
  }

  private void assembleSubSystems(SymphonySystem symphonySystem, Map<SymphonySystem, SymphonySystemApiAdapter> systemToApiAdapterMap)
  {	  	   	  
	  Logger.INSTANCE.log(Activator.ID, this, "Assembling Sub-System <" + symphonySystem + ">", EventSeverity.INFO);
	  	 		  		  
	  if(symphonySystem.getTopologyRoot() != null && symphonySystem.getTopologyRoot().getOriginNode() instanceof GroupNode)
	  {		  
		  if(symphonySystem.getAssemblyLinksList() != null && symphonySystem.getAssemblyLinksList().getAssemblyLinks() != null)
		  {
			  for(AssemblyLink link : symphonySystem.getAssemblyLinksList().getAssemblyLinks())
			  {			  	
				  if(!processedAssemblyLink.contains(link))
				  {
					  String message = "Processing link <" + link.getName() + ">.";
					  Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
				  
					  try
					  {
						  SymphonySystem parent = link.getParentInstance();					  					  
						  SymphonySystem subSystem = link.getSubSystemInstance();

						  //SymphonySystemAPI symphonySystemAPI = subSystem.getSymphonySystemAPI();
						  if(subSystem != null && parent != null)
						  {						  										  						  						 
							  // Gets the transformation matrix attaching the sub-system to the system attachment node.
							  Matrix4d transform = null;						  
							  if(link.getTransformationMatrix() != null) transform = link.getTransformationMatrix().asMatrix4d();						  
							  if(transform == null)
							  {
								  transform = new Matrix4d();
								  transform.setIdentity();					  
							  }
							  
							  // Attaches the sub-system to the system.
							  TransformNode linkTransformNode = TopologyFacade.INSTANCE.createTransformNode(transform);
							  linkTransformNode.setDescription("Transform representing link <" + link.getName() + ">");
							  
							  // Get the node in the parent to which the link is attached.
							  GroupNode parentNode = link.getParentConnectionPoint().getNode();						  					  						  
							  parentNode.getChildren().add(linkTransformNode);						
							  						  
							  // Adds a transform node used to effect the poseTransform.						  
							  Matrix4x4 matrix = MathFacade.INSTANCE.createIdentityMatrix4x4();						  						  						  
							  TransformNode poseTransform = TopologyFacade.INSTANCE.createTransformNode(matrix.asMatrix4d());						  
							  poseTransform.setNodeId(subSystem.getName() + "_poseTransform");								  											 
							  
							  // Is the API is not null, binds the Pose to the poseTransform.
//							  SymphonySystemApiAdapter symphonySystemApiAdapter = systemToApiAdapterMap.get(subSystem);							  							 
//							  if(symphonySystemApiAdapter != null)
//							  {								  								  
//								  if(symphonySystemApiAdapter.getPoseTransform() != null)
//								  {
//									  poseTransform.setTransformation(symphonySystemApiAdapter.getPoseTransform().asMatrix4d());
//								  }									  									
//								  
//								  // Adds a binding to link the transform node to the api poseTransform.
//								  if(symphonySystemApiAdapter.getInstance() != null)
//								  {
//									  createTransformMatrixBinding(symphonySystemApiAdapter.getInstance(), poseTransform, symphonySystemApiAdapter);
//								  }
//							  }
							  
							  // Creates a referenced node to refer the sub-system topology.
							  ReferencedGroupNode referencedGroupNode = Symphony__CommonTopologyFactory.eINSTANCE.createReferencedGroupNode();							  
							  if(subSystem.getTopologyRoot() != null && subSystem.getTopologyRoot().getOriginNode() != null)
							  {
								  referencedGroupNode.getChildren().add(subSystem.getTopologyRoot().getOriginNode());
							  }
							  
							  // Attaches the referencedGroupNode to the poseTransform.
							  poseTransform.getChildren().add(referencedGroupNode);
							  
							  // Attaches the poseTransform to the link transform.
							  linkTransformNode.getChildren().add(poseTransform);						  
							  						  
							  // Adds the link geometry topology to the parent, if present.
							  if(link.getGeometryNode() != null) parentNode.getChildren().add(link.getGeometryNode());
							  
							  // Adds the link to the list of processed links.
							  processedAssemblyLink.add(link);
							  
							  // Assembles the sub-system’s sub-systems.
							  assembleSubSystems(subSystem, systemToApiAdapterMap);								  								 							 
						  }
						  else
						  {							  						
								Logger.INSTANCE.log(Activator.ID, this, "Error occured when processing AssemblyLink <" + link.getName() + "> !", EventSeverity.ERROR);							  
						  }
					  }
					  catch(Throwable t)
					  {
						  Logger.INSTANCE.log(Activator.ID, this, "Error occured when processing AssemblyLink <" + link.getName() + "> !", EventSeverity.ERROR, t);					  
					  }
				  }
			  }
		  }
	  }	  
  }
  
	private Adapter getAdapter() 
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{			
				@Override
				public void notifyChanged(Notification msg) 
				{
					super.notifyChanged(msg);
										
					if(msg.getNotifier() instanceof Environment)
					{
						if(msg.getFeatureID(Environment.class) == EMFEcoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT)					
						{
							// Active Context has changed, update.
							Context oldContext = (Context) msg.getOldValue();
							Context newContext = (Context) msg.getNewValue();
							updateContext(oldContext, newContext);				
						}						
					}	
					else if(msg.getNotifier() instanceof Context)
					{
						if(msg.getFeatureID(Context.class) == EMFEcoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE)
						{
							// Variable implementation has changed, update.
							updateVariablesImplementations();			
						}
						else if(msg.getFeatureID(Context.class) == EMFEcoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE)
						{
							if(msg.getNewValue() != null)
							{
								// Clears the topology
								clearTopology();
							}
						}
					}
				}
			};			
		}
		return adapter;
	}	
} //SymphonySystemAPIsNodeImpl
