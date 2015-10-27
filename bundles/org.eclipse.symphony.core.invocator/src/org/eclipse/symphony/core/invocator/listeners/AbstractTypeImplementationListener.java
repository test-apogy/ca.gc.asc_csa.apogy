package org.eclipse.symphony.core.invocator.listeners;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.invocator.AbstractTypeImplementation;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.TypeApiAdapter;
import org.eclipse.symphony.core.invocator.Variable;

public class AbstractTypeImplementationListener 
{
	private Adapter adapter;
	protected Variable variable;
	
	private EObject previousInstance;
	private TypeApiAdapter previousTypeApiAdapterInstance;
	
	public AbstractTypeImplementationListener(Variable variable)
	{
		setVariable(variable);
	}
	
	public void setVariable(Variable newVariable)
	{
		EObject newInstance = null;
		TypeApiAdapter newTypeApiAdapter = null;
		
		// Unregister from previous variable if applicable.
		if(getVariable() != null && getVariable().getEnvironment() != null)
		{
			getVariable().getEnvironment().eAdapters().remove(getAdapter());
			if(getVariable().getEnvironment().getActiveContext() != null)
			{
				getVariable().getEnvironment().getActiveContext().eAdapters().remove(getAdapter());
			}
		}
		
		this.variable = newVariable;
		
		// Register to the new variable, if applicable
		if(newVariable != null && newVariable.getEnvironment() != null)
		{
			newVariable.getEnvironment().eAdapters().add(getAdapter());
			if(newVariable.getEnvironment().getActiveContext() != null)
			{
				newVariable.getEnvironment().getActiveContext().eAdapters().add(getAdapter());
				
				try
				{
					AbstractTypeImplementation ati = EMFEcoreInvocatorFacade.INSTANCE.getTypeImplementation(getVariable());
					if(ati != null)
					{
						newInstance = ati.getInstance();
						newTypeApiAdapter = ati.getAdapterInstance();
					}
				}
				catch(Exception e)
				{					
				}
			}
		}		
		
		// Updates instance.
		updateInstance(newInstance);
		updateTypeApiAdapter(newTypeApiAdapter);
	}
	
	public Variable getVariable()
	{
		return this.variable;
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
	protected void typeApiAdapterChanged(TypeApiAdapter oldTypeApiAdapterr, TypeApiAdapter newTypeApiAdapter)
	{		
	}
	
	private void updateInstance(EObject newInstance)
	{
		instanceChanged(previousInstance, newInstance);
		previousInstance = newInstance;
	}
	
	private void updateTypeApiAdapter(TypeApiAdapter newTypeApiAdapter)
	{
		typeApiAdapterChanged(previousTypeApiAdapterInstance, newTypeApiAdapter);
		previousTypeApiAdapterInstance = newTypeApiAdapter;
	}
	
	private void update()
	{
		try
		{
			AbstractTypeImplementation ati = EMFEcoreInvocatorFacade.INSTANCE.getTypeImplementation(getVariable());
			if(ati != null)
			{
				updateInstance(ati.getInstance());
				updateTypeApiAdapter(ati.getAdapterInstance());
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
	
	private Adapter getAdapter()
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{					
					if(msg.getNotifier() instanceof Environment)
					{
						if(msg.getFeatureID(Environment.class) == Symphony__CoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT)
						{
							// Active Context has changed.
							
							// Unregister from previous active context if applicable.
							if(msg.getOldValue() instanceof Context)
							{
								Context oldContext = (Context) msg.getOldValue();
								oldContext.eAdapters().remove(getAdapter());
							}
							
							// Update instances and  TypeApiAdapter
							update();
							
							// Register to new active context if applicable.
							if(msg.getNewValue() instanceof Context)
							{
								Context newContext = (Context) msg.getNewValue();
								newContext.eAdapters().add(getAdapter());
							}
						}
					}
					else if(msg.getNotifier() instanceof Context)
					{
						if(msg.getFeatureID(Context.class) == Symphony__CoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE)
						{
							// Instances have been created							
							// Update instances and TypeApiAdapter
							update();
						}
						else if(msg.getFeatureID(Context.class) == Symphony__CoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE)
						{
							// Instances have been disposed
							
							// Update instances and TypeApiAdapter
							update();														
						}
					}
				}
			};
		}
		
		return adapter;
	}
}
