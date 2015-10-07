/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings.provider;


import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage;
import org.eclipse.symphony.core.recordings.Player;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.recordings.Player} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlayerItemProvider
  extends org.eclipse.symphony.core.invocator.provider.AbstractPlayerItemProvider
{
	public static final String DATE_FORMAT_STRING = "yyyy.MM.dd HH:mm:ss.SSS z";	
	protected SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_STRING);
	
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PlayerItemProvider(AdapterFactory adapterFactory)
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

			addEnabledPropertyDescriptor(object);
			addTimeSourcePropertyDescriptor(object);
			addRecordingsPropertyDescriptor(object);
			addDataStartTimePropertyDescriptor(object);
			addDataEndTimePropertyDescriptor(object);
			addPlayBackTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Player_enabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Player_enabled_feature", "_UI_Player_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.PLAYER__ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Time Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Player_timeSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Player_timeSource_feature", "_UI_Player_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.PLAYER__TIME_SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Recordings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Player_recordings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Player_recordings_feature", "_UI_Player_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.PLAYER__RECORDINGS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Data Start Time feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addDataStartTimePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Player_dataStartTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Player_dataStartTime_feature", "_UI_Player_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.PLAYER__DATA_START_TIME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Data End Time feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addDataEndTimePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Player_dataEndTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Player_dataEndTime_feature", "_UI_Player_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.PLAYER__DATA_END_TIME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Play Back Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlayBackTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Player_playBackTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Player_playBackTime_feature", "_UI_Player_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.PLAYER__PLAY_BACK_TIME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This returns Player.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Player"));
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
	  Player player = (Player) object;
	  
	  String label = new String();
	  
	  if(player.getName() != null && player.getName().length() > 0)
	  {
		  label += player.getName();
	  }
	  else
	  {
		  label += getString("_UI_Player_type");
	  }
	  	 
	  label += " (";
	  if(player.isEnabled())
	  {
		  label += "active";
	  }
	 
	  if(player.getPlayBackTime() != null)
	  {
		  if(player.isEnabled())
		  {
			  label += ", ";
		  }
		  
		  label += simpleDateFormat.format(player.getPlayBackTime());
	  }
	  
	  
	  label += ")";
	  
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

		switch (notification.getFeatureID(Player.class)) {
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__ENABLED:
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__TIME_SOURCE:
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__DATA_START_TIME:
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__DATA_END_TIME:
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__PLAY_BACK_TIME:
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
