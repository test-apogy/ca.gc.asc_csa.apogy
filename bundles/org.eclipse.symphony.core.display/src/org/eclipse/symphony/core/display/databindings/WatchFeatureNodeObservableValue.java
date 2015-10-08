package org.eclipse.symphony.core.display.databindings;

import org.eclipse.core.databinding.observable.value.AbstractObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueDiff;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter;

import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode;
import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureSpecifier;
import ca.gc.asc_csa.eclipse.emf.ecore.FeatureNodeAdapter;
import ca.gc.asc_csa.eclipse.emf.ecore.databinding.DefaultValueDiff;

public class WatchFeatureNodeObservableValue extends AbstractObservableValue 
{
	private Adapter adapter = null;
	@SuppressWarnings("unused")
	private EObject eObject;
	
	private AbstractFeatureNode featureNode;
	private WatchFeatureNodeAdapter watchFeatureNodeAdapter = null;
	private boolean resolved = false;
	
	public WatchFeatureNodeObservableValue(EObject eObject, AbstractFeatureNode featureNode)
	{		
		setFeatureNode(featureNode);		
		setResolved(getWatchFeatureNodeAdapter().isResolved());
	}
	
	public void setEObject(EObject eObject)
	{
		this.eObject = eObject;
		getWatchFeatureNodeAdapter().setSourceObject(eObject);		
	}
	
	public void setFeatureNode(AbstractFeatureNode featureNode)
	{
		this.featureNode = featureNode;
		getWatchFeatureNodeAdapter().setFeatureNode(featureNode);		
	}
	
	@Override
	public Object getValueType() 
	{	
		if(featureNode instanceof AbstractFeatureNode)
		{
			AbstractFeatureSpecifier featureSpecifier = (AbstractFeatureSpecifier) featureNode;
		
			if(featureSpecifier.getStructuralFeature().getEType() instanceof EEnum)
			{
				return featureSpecifier.getStructuralFeature().getEType();
			}
			else if(featureSpecifier.getStructuralFeature().getEType() instanceof EClass)
			{
				return featureSpecifier.getStructuralFeature().getEType();
			}
			else
			{
				return featureSpecifier.getStructuralFeature().getEType().getInstanceClass();	
			}					
		}
		else
		{
			return null;
		}
	}

	/**
	 * Method called when the resolution status of the ObservableValue changes. This method could be overloaded by clients.
	 * @param newValue The new value of the resolved flag.
	 */
	public void resolved(boolean newValue)
	{				
	}

	public boolean isResolved() 
	{
		return resolved;
	}

	protected void setResolved(boolean newResolved)
	{
		resolved = newResolved;
		
		try
		{
			resolved(newResolved);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
	
	@Override
	protected Object doGetValue() 
	{	
		return getWatchFeatureNodeAdapter().getCurrentValue();
	}
	
	@Override
	public synchronized void removeValueChangeListener(IValueChangeListener listener) 
	{	
		super.removeValueChangeListener(listener);
		
		// Dispose of FeatureNodeAdapter if no one is listening anymore.
		if(!hasListeners())
		{			
			dispose();
		}
	}
	
	protected WatchFeatureNodeAdapter getWatchFeatureNodeAdapter()
	{
		if(watchFeatureNodeAdapter == null)
		{
			watchFeatureNodeAdapter = EMFEcoreInvocatorFactory.eINSTANCE.createWatchFeatureNodeAdapter();	
			watchFeatureNodeAdapter.eAdapters().add(getAdapter());
		}
		
		return watchFeatureNodeAdapter;
	}
		
	 private Adapter getAdapter()
	 {
		  if(adapter == null)
		  {
			  adapter = new AdapterImpl()
			  {				
					@Override
					public void notifyChanged(Notification notification) 
					{
						if(notification.getFeatureID(FeatureNodeAdapter.class) == EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__CURRENT_VALUE)
						{						
							final Object oldValue = notification.getOldValue();
							final Object newValue = notification.getNewValue();
							
							// Fire a Value Change
							getRealm().asyncExec(new Runnable() 
							{							
								@Override
								public void run() 
								{									
									ValueDiff valueDiff = new DefaultValueDiff(oldValue, newValue);
									fireValueChange(valueDiff);
								}
							});							
						}
						else if(notification.getFeatureID(FeatureNodeAdapter.class) == EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER__RESOLVED)
						{							
							if(notification.getOldBooleanValue() != notification.getNewBooleanValue())
							{
								setResolved(notification.getNewBooleanValue());
							}
						}
					}
				};
		  }
		  
		  return adapter;
	  }
	 
	 @Override
	public synchronized void dispose() 
	{		 
		 // Removes adapter on FeatureNodeAdapter.
		 getWatchFeatureNodeAdapter().eAdapters().remove(getAdapter());
		 
		 // Removes references to Source and FeatureNode.
		 setEObject(null);
		 setFeatureNode(null);
		 		 
		 adapter = null;
		 watchFeatureNodeAdapter = null;
		 super.dispose();
	}
}
