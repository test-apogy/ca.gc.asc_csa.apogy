/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings.provider;


import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFactory;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage;
import org.eclipse.symphony.core.recordings.Recording;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.recordings.Recording} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RecordingItemProvider
  extends org.eclipse.symphony.core.invocator.provider.AbstractResultItemProvider
{
	
	protected DecimalFormat durationDecimalFormat = new DecimalFormat("0.000");
	
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RecordingItemProvider(AdapterFactory adapterFactory)
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

			addNamePropertyDescriptor(object);
			addRecordingTracksPropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addStartDatePropertyDescriptor(object);
			addEndDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Named_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Named_name_feature", "_UI_Named_type"),
				 EMFEcorePackage.Literals.NAMED__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Recording Tracks feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addRecordingTracksPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Recording_recordingTracks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Recording_recordingTracks_feature", "_UI_Recording_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.RECORDING__RECORDING_TRACKS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Recording_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Recording_duration_feature", "_UI_Recording_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.RECORDING__DURATION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Start Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Recording_startDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Recording_startDate_feature", "_UI_Recording_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.RECORDING__START_DATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the End Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Recording_endDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Recording_endDate_feature", "_UI_Recording_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.RECORDING__END_DATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EMFEcoreInvocatorRecordingsPackage.Literals.RECORDING__RECORDING_TRACKS);
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns Recording.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Recording"));
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
	  Recording recording = (Recording) object;
	  
	  String label = new String();
	  
	  if(recording.getName() != null && recording.getName().length() > 0)
	  {
		  label += recording.getName();
	  }
	  else
	  {
		  label += getString("_UI_Recording_type");
	  }
	  	  
	  label += "( " +  durationDecimalFormat.format(recording.getDuration()) + " s )";
	  
	  if(recording.getRecordingTracks().size() >  0)
	  {
		  label += " [" + recording.getRecordingTracks().size() + "]";
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

		switch (notification.getFeatureID(Recording.class)) {
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__NAME:
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__DURATION:
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__START_DATE:
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__END_DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__RECORDING_TRACKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(EMFEcoreInvocatorRecordingsPackage.Literals.RECORDING__RECORDING_TRACKS,
				 EMFEcoreInvocatorRecordingsFactory.eINSTANCE.createRecordingTrack()));
	}

}
