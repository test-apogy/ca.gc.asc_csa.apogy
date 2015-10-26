package org.eclipse.symphony.core.invocator.listeners;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.emf.AbstractFeatureListNode;
import org.eclipse.symphony.common.emf.AbstractFeatureSpecifier;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.ListFeatureNode;
import org.eclipse.symphony.common.emf.ListRootNode;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.TypeApiAdapter;
import org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableFeatureReference;

public class AbstractVariableFeatureReferenceListener 
{
	public boolean verbose = false;
	
	protected VariableFeatureReference variableFeatureReference;
	private Adapter variableFeatureReferenceAdapter;
	
	private Adapter contextAdapter;
	private Adapter environmentAdapter;	
	private Adapter listRootNodeAdapter;
	
	private EObject previousInstance;
	private TypeApiAdapter previousTypeApiAdapterInstance;
	

	public AbstractVariableFeatureReferenceListener(VariableFeatureReference variableFeatureReference)
	{
		setVariableFeatureReference(variableFeatureReference);
	}
	
	public void setVariableFeatureReference(VariableFeatureReference newVariableFeatureReference)
	{	
		if(this.variableFeatureReference != null)
		{
			unRegisterFrom(this.variableFeatureReference, getVariableFeatureReferenceAdapter());
		}
		
		this.variableFeatureReference = newVariableFeatureReference;
		
		if(newVariableFeatureReference != null)
		{
			registerTo(variableFeatureReference, getVariableFeatureReferenceAdapter());
		}
		
		// Updates instance and type API Adapter
		update();
	}
	
	/**
	 * Method called when the active context changes. User should overload this method.
	 * @param oldContext Previous Context.
	 * @param newContext New Context.
	 */
	protected void contextChanged(Context oldContext, Context newContext)
	{		
	}
	
	/**
	 * Method called when the instance of a Variable changes. User should overload this method.
	 * @param oldInstance The old instance.
	 * @param newInstance The new instance.
	 */
	protected void instanceChanged(EObject oldInstance, EObject newInstance)
	{		
	}
	
	/**
	 * Method called when the adapterInstance changes. User should overload this method.
	 * @param oldTypeApiAdapter The old TypeApiAdapter.
	 * @param newTypeApiAdapter The new TypeApiAdapter.
	 */
	protected void typeApiAdapterChanged(TypeApiAdapter oldTypeApiAdapter, TypeApiAdapter newTypeApiAdapter)
	{		
	}
	
	/**
	 * Method called when the Variable changes. User should overload this method.
	 * @param oldTypeApiAdapter The old TypeApiAdapter.
	 * @param newTypeApiAdapter The new TypeApiAdapter.
	 */
	protected void variableChanged(Variable oldVariable, Variable newVariable)
	{
		
	}
	
	/**
	 * Method called when changes in the ListRootNode are detected. User should overload this method.
	 */
	protected void listRootNodeChanged()
	{		
	}
	
	private void updateInstance(EObject newInstance)
	{		
		if(verbose)
		{			
			System.out.println("updateInstance() Old Instance : " + previousInstance);
			System.out.println("updateInstance() New Instance : " + newInstance);
		}
		
		if(previousInstance != newInstance)
		{									
			instanceChanged(previousInstance, newInstance);
		}
		previousInstance = newInstance;
	}
	
	private void updateTypeApiAdapter(TypeApiAdapter newTypeApiAdapter)
	{
		if(previousTypeApiAdapterInstance != newTypeApiAdapter)
		{
			typeApiAdapterChanged(previousTypeApiAdapterInstance, newTypeApiAdapter);
			previousTypeApiAdapterInstance = newTypeApiAdapter;
		}
	}
	
	private void update()
	{
		try
		{
			if(variableFeatureReference != null)
			{
				EObject newInstance = EMFEcoreInvocatorFacade.INSTANCE.getInstance(variableFeatureReference);				
				updateInstance(newInstance);
				
				TypeApiAdapter newTypeApiAdapter = EMFEcoreInvocatorFacade.INSTANCE.getTypeApiAdapter(variableFeatureReference);
				updateTypeApiAdapter(newTypeApiAdapter);
			}
			else
			{
				updateInstance(null);
				updateTypeApiAdapter(null);
			}
			
		}
		catch(Throwable t)
		{								
		}
	}
	
	protected void registerTo(VariableFeatureReference variableFeatureReference, Adapter adapter)
	{
		if(variableFeatureReference != null)
		{
			variableFeatureReference.eAdapters().add(adapter);
			
			if(variableFeatureReference.getVariable() != null)
			{
				registerTo(variableFeatureReference.getVariable(), adapter);
			}
			
			if(variableFeatureReference.getFeatureRoot() != null)
			{
				registerTo(variableFeatureReference.getFeatureRoot());
			}
			
			if(variableFeatureReference.getTypeMemberReferenceListElement() != null)
			{
				registerTo(variableFeatureReference.getTypeMemberReferenceListElement(), adapter);
			}
		}
	}
	
	protected void unRegisterFrom(VariableFeatureReference variableFeatureReference, Adapter adapter)
	{
		if(variableFeatureReference != null)
		{
			variableFeatureReference.eAdapters().remove(adapter);
			
			if(variableFeatureReference.getVariable() != null)
			{
				unRegisterFrom(variableFeatureReference.getVariable(), adapter);
			}
			
			if(variableFeatureReference.getFeatureRoot() != null)
			{
				unRegisterFrom(variableFeatureReference.getFeatureRoot());
			}
			
			if(variableFeatureReference.getTypeMemberReferenceListElement() != null)
			{
				unRegisterFrom(variableFeatureReference.getTypeMemberReferenceListElement(), adapter);
			}
		}
	}
	
	protected void registerTo(Variable variable, Adapter adapter)
	{
		if(variable != null)
		{
			variable.eAdapters().add(adapter);
			
			if(variable.getEnvironment() != null)
			{
				registerTo(variable.getEnvironment());
			}
		}
	}
	
	protected void unRegisterFrom(Variable variable, Adapter adapter)
	{
		if(variable != null)
		{
			variable.eAdapters().remove(adapter);
			
			if(variable.getEnvironment() != null)
			{
				unRegisterFrom(variable.getEnvironment());
			}
		}
	}
			
	protected void registerTo(Environment environment)
	{
		if(environment != null)
		{
			environment.eAdapters().add(getEnvironmentAdapter());	
			
			if(environment.getActiveContext() != null)
			{
				registerTo(environment.getActiveContext());
			}
		}
	}
	
	protected void unRegisterFrom(Environment environment)
	{
		if(environment != null)
		{
			environment.eAdapters().remove(getEnvironmentAdapter());
			
			if(environment.getActiveContext() != null)
			{
				unRegisterFrom(environment.getActiveContext());
			}
		}
	}
	
	protected void registerTo(Context context)
	{
		if(context != null)
		{
			context.eAdapters().add(getContextAdapter());
		}
	}
	
	protected void unRegisterFrom(Context context)
	{
		if(context != null)
		{
			context.eAdapters().remove(getContextAdapter());
		}
	}
		
	protected void registerTo(ListRootNode listRootNode)
	{				
		if(listRootNode != null)
		{
			listRootNode.eAdapters().add(getListRootNodeAdapter());
			
			AbstractFeatureListNode child = listRootNode.getChild();
			while(child != null)
			{
				child.eAdapters().add(getListRootNodeAdapter());
				child = child.getChild();
			}
		}
		
		listRootNodeChanged();
	}
	
	protected void unRegisterFrom(ListRootNode listRootNode)
	{
		if(listRootNode != null)
		{
			listRootNode.eAdapters().remove(getListRootNodeAdapter());
			
			AbstractFeatureListNode child = listRootNode.getChild();
			while(child != null)
			{
				child.eAdapters().remove(getListRootNodeAdapter());
				child = child.getChild();
			}
		}
		
		listRootNodeChanged();
	}
	
	protected void registerTo(TypeMemberReferenceListElement typeMemberReferenceListElement, Adapter adapter)
	{
		if(typeMemberReferenceListElement != null)
		{
			typeMemberReferenceListElement.eAdapters().add(adapter);
			
			TypeMemberReferenceListElement child = typeMemberReferenceListElement.getChild();
			while(child != null)
			{
				child.eAdapters().add(adapter);
				child = child.getChild();
			}
		}
	}
	
	protected void unRegisterFrom(TypeMemberReferenceListElement typeMemberReferenceListElement, Adapter adapter)
	{
		if(typeMemberReferenceListElement != null)
		{
			typeMemberReferenceListElement.eAdapters().remove(adapter);
			
			TypeMemberReferenceListElement child = typeMemberReferenceListElement.getChild();
			while(child != null)
			{
				child.eAdapters().remove(adapter);
				child = child.getChild();
			}
		}
	}
	
	/**
	 * Adapter handling change in instances within a context.
	 */
	private Adapter getContextAdapter()
	{
		if(contextAdapter == null)
		{
			contextAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{	
					if(verbose) System.out.println("----->ContextAdapter " + msg);
					
					if(msg.getFeatureID(Context.class) == EMFEcoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE)
					{
						// Instances have been created							
						// Update instances and TypeApiAdapter
						update();
					}
					else if(msg.getFeatureID(Context.class) == EMFEcoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE)
					{
						// Instances have been disposed						
						// Update instances and TypeApiAdapter
						update();														
					}
				}
			};
		}
		
		return contextAdapter;
	}
	
	/**
	 * Adapter handling change in Environment.
	 */
	private Adapter getEnvironmentAdapter()
	{
		if(environmentAdapter == null)
		{
			environmentAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{	
					if(verbose) System.out.println("----->EnvironmentAdapter " + msg);
					
					if(msg.getFeatureID(Environment.class) == EMFEcoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT)
					{
						// Active Context has changed.
						Context oldContext = null;
						Context newContext = null;
						
						// Unregister from previous active context if applicable.
						if(msg.getOldValue() instanceof Context)
						{
							oldContext = (Context) msg.getOldValue();
							oldContext.eAdapters().remove(getContextAdapter());
						}
						
						// Update instances and  TypeApiAdapter
						update();
						
						// Register to new active context if applicable.
						if(msg.getNewValue() instanceof Context)
						{
							newContext = (Context) msg.getNewValue();
							newContext.eAdapters().add(getContextAdapter());
						}		
						
						// Calls user method.
						contextChanged(oldContext, newContext);
					}
				}
			};
		}
		
		return environmentAdapter;
	}
			
	/**
	 * Adapter handling change in ListRootNode and its children.
	 */
	private Adapter getListRootNodeAdapter() 
	{
		if(listRootNodeAdapter == null)
		{
			listRootNodeAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{		
					if(verbose) System.out.println("----->ListRootNodeAdapter " + msg);
					
					if(msg.getNotifier() instanceof AbstractFeatureListNode)
					{
						int featureID = msg.getFeatureID(AbstractFeatureListNode.class);
						switch(featureID)
						{
							case Symphony__CommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__CHILD:
								
								// Un-register from the previous child.
								if(msg.getOldValue() instanceof ListFeatureNode)
								{
									((ListFeatureNode)  msg.getOldValue()).eAdapters().remove(getListRootNodeAdapter());									
								}
								
								// Register to the new child.
								if(msg.getNewValue() instanceof ListFeatureNode)
								{
									((ListFeatureNode)  msg.getNewValue()).eAdapters().add(getListRootNodeAdapter());	
								}
								
								update();
								listRootNodeChanged();
							break;														
						}
					}
					
					if(msg.getNotifier() instanceof AbstractFeatureSpecifier)
					{
						int featureID = msg.getFeatureID(AbstractFeatureSpecifier.class);
						switch(featureID)
						{
							default:
								update();
								listRootNodeChanged();
							break;
						}
					}
					
					if(msg.getNotifier() instanceof ListRootNode)
					{
						int featureID = msg.getFeatureID(ListRootNode.class);
						switch(featureID)
						{
							case Symphony__CommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__CHILD:																								
								update();
								listRootNodeChanged();
							break;							
							
							default:
								update();
							break;
						}
					}					
				}
			};			
		}
		return listRootNodeAdapter;
	}

	private Adapter getVariableFeatureReferenceAdapter()
	{
		if(variableFeatureReferenceAdapter == null)
		{
			variableFeatureReferenceAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{					
					if(verbose) System.out.println("----->Notification " + msg);
					
					if(msg.getNotifier() instanceof VariableFeatureReference)
					{
						int featureId = msg.getFeatureID(VariableFeatureReference.class);
						
						switch (featureId) 
						{
							case EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT:
							{
								unRegisterFrom((ListRootNode) msg.getOldValue());
								registerTo((ListRootNode) msg.getNewValue());
								
								EObject newInstance = EMFEcoreInvocatorFacade.INSTANCE.getInstance(variableFeatureReference);				
								updateInstance(newInstance);								
							}
							break;

							case EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT:
								unRegisterFrom((TypeMemberReferenceListElement) msg.getOldValue(), this);
								registerTo((TypeMemberReferenceListElement) msg.getNewValue(), this);
								
								TypeApiAdapter newTypeApiAdapter = EMFEcoreInvocatorFacade.INSTANCE.getTypeApiAdapter(variableFeatureReference);
								updateTypeApiAdapter(newTypeApiAdapter);
							break;
							
							case EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE:
								Variable oldVariable = null;
								Variable newVariable = null;
								
								if(msg.getOldValue() instanceof Variable)
								{
									oldVariable = (Variable) msg.getOldValue(); 
								}
								
								if(msg.getNewValue() instanceof Variable)
								{
									newVariable = (Variable) msg.getNewValue(); 
								}
								
								variableChanged(oldVariable, newVariable);
							break;
							
							default:
							break;
						}												
					}					
				}
			};
		}
		
		return variableFeatureReferenceAdapter;
	}
}
