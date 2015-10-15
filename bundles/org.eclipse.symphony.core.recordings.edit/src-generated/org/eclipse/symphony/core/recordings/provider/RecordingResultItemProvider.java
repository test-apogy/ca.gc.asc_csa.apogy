/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings.provider;



import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.emf.EMFEcoreFacade;
import org.eclipse.symphony.core.invocator.AttributeResultValue;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.ReferenceResultValue;
import org.eclipse.symphony.core.invocator.Watch;
import org.eclipse.symphony.core.invocator.provider.AbstractResultItemProvider;
import org.eclipse.symphony.core.recordings.Channel;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage;
import org.eclipse.symphony.core.recordings.RecordingResult;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.recordings.RecordingResult} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RecordingResultItemProvider
  extends AbstractResultItemProvider
{
	public static final String DATE_FORMAT_STRING = "yyyy.MM.dd HH:mm:ss.SSS z";	
	protected SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_STRING);

	
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RecordingResultItemProvider(AdapterFactory adapterFactory)
  {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRecordingTrackPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Recording Track feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addRecordingTrackPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RecordingResult_recordingTrack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RecordingResult_recordingTrack_feature", "_UI_RecordingResult_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.RECORDING_RESULT__RECORDING_TRACK,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This returns RecordingResult.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RecordingResult"));
	}

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  @Override
  public String getText(Object object)
  {
	  RecordingResult recordingResult = (RecordingResult) object;
	  
	  String label = new String();
	  
	  Channel channel = null;
	  
	  if( recordingResult.getRecordingTrack() != null) channel = recordingResult.getRecordingTrack().getChannel();
	  if(channel != null && channel.getFeature() != null)
	  {
		  Watch watch = EMFEcoreInvocatorFacade.INSTANCE.resolveWatch(channel.getFeature());	
		  
		  if(watch != null)
		  {		  
			  label += watch.getVariable().getName() + "." + EMFEcoreFacade.INSTANCE.getAncestriesString(channel.getFeature()) + "";
		  }
		  else
		  {
			  label = EMFEcoreFacade.INSTANCE.getAncestriesString(channel.getFeature());
		  }
	  }
	  else
	  {
		  label += getString("_UI_RecordingResult_type");
	  }
	  
	  // Adds the time
      if(recordingResult.getTime() != null) 
      {
    	  label += " (" + simpleDateFormat.format(recordingResult.getTime()) + " ,";    
      }
      else
      {
    	  label += " (?,";
      }
	  
      // Adds the value
      if(recordingResult.getResultValue() != null)
      {
    	  if(recordingResult.getResultValue() instanceof AttributeResultValue)
    	  {
    		  AttributeResultValue attributeResultValue = (AttributeResultValue) recordingResult.getResultValue();
    		  if((attributeResultValue.getValue() != null) && attributeResultValue.getValue().getObject() != null)
    		  {
    			  label += " " + attributeResultValue.getValue().getObject().toString() + ")";
    		  }	  
    		  else
    		  {
    			  label += " null)";
    		  }
    	  }
    	  else if(recordingResult.getResultValue() instanceof ReferenceResultValue)
    	  {
    		  ReferenceResultValue referenceResultValue = (ReferenceResultValue) recordingResult.getResultValue();
    		  EObject eObject = referenceResultValue.getValue();
    		  if(eObject != null)
    		  {
    			  label += " " + eObject.eClass().getName();
    		  }
    		  else
    		  {
    			  label += " null";
    		  }
    		  label += ")";
    	  }
      }
      else
      {
    	  label += ")";
      }
      
      return label;
  }

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification)
  {
		updateChildren(notification);

		switch (notification.getFeatureID(RecordingResult.class)) {
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

  /**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
