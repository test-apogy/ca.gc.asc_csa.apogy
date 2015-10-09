package org.eclipse.symphony.common.emf.databinding;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.value.ValueDiff;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EObjectObservableValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

/**
 * IObservableValue for EMFObject. This implementation fires fireValueChange when the feature of the OBject is set and also if
 * any of the direct attributes/reference of the current feature changes.
 * @author pallard
 *
 */
public class EMFReferenceIObervableValue extends EObjectObservableValue 
{
	protected Adapter valueInternalAdapter = null;
	protected EObject featurevalue;
	
	public EMFReferenceIObervableValue(EObject eObject,EStructuralFeature eStructuralFeature) 
	{
		super(eObject, eStructuralFeature);	
		featurevalue = (EObject) ((EObject) ExtendedMetaData.INSTANCE.getAffiliation(eObject.eClass(), eStructuralFeature) == null ? null : eObject.eGet(eStructuralFeature));
		
		// Register interval value listener to new value if applicable.
		if(featurevalue != null)
		{
			featurevalue.eAdapters().add(getValueInternalAdapter());
		}
	}
	
	@Override
	protected Object doGetValue() 
	{		
		return featurevalue;
	}
	
	@Override
	protected void firstListenerAdded() 
	{		
		listener = new AdapterImpl()
	    {
	       @Override
	        public void notifyChanged(Notification notification)
	        {
	          if (eStructuralFeature == notification.getFeature() && !notification.isTouch())
	          {
	        	  // Unregister interval value listener from old value if applicable.
	        	  if(notification.getOldValue() instanceof EObject)
	        	  {
	        		  ((EObject) notification.getOldValue()).eAdapters().remove(getValueInternalAdapter());
	        	  }
	        	  
	        	  // Register interval value listener to new value if applicable.
	        	  if(notification.getNewValue() instanceof EObject)
	        	  {
	        		  ((EObject) notification.getNewValue()).eAdapters().add(getValueInternalAdapter());
	        		  featurevalue = ((EObject) notification.getNewValue());
	        	  }
	        	  else
	        	  {
	        		  featurevalue = null;
	        	  }
	        	  
	        	  
	            final ValueDiff diff = Diffs.createValueDiff(notification.getOldValue(), notification.getNewValue());
	            getRealm().exec(new Runnable()
	              {
	                public void run()
	                {
	                  fireValueChange(diff);
	                }
	              });
	          }
	        }
	    };
	    eObject.eAdapters().add(listener);
	}		
	
	@Override
	protected void lastListenerRemoved() 
	{
		// Removes valueInternalAdapter if applicable.
		if(featurevalue != null) featurevalue.eAdapters().remove(getValueInternalAdapter());
		super.lastListenerRemoved();
	}
	
	
	protected Adapter getValueInternalAdapter()
	{
		if(valueInternalAdapter == null)
		{
			valueInternalAdapter = new AdapterImpl()
			{
				public void notifyChanged(Notification msg) 
				{
					// Forces update
					Object obj = msg.getNotifier();
					if(obj instanceof EObject)
					{												
						EObject oldvalue = (EObject) obj;
						featurevalue = EcoreUtil.copy(oldvalue);
						final ValueDiff diff = Diffs.createValueDiff(null, featurevalue);
				       						
						getRealm().exec(new Runnable()
				        {
							public void run()
				            {							
								fireValueChange(diff);
				            }
				        });
					}
				};
			};
		}
		
		return valueInternalAdapter;
	}
}
