/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.provider;


import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.provider.AbstractChannelItemProvider;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Channel;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingPolicy;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Channel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChannelItemProvider
  extends AbstractChannelItemProvider
{
	protected DecimalFormat durationDecimalFormat = new DecimalFormat("0.000");
	
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ChannelItemProvider(AdapterFactory adapterFactory)
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

			addRecordingPolicyPropertyDescriptor(object);
			addFixedPeriodValuesPropertyDescriptor(object);
			addFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Recording Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordingPolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_recordingPolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_recordingPolicy_feature", "_UI_Channel_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.CHANNEL__RECORDING_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Fixed Period Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFixedPeriodValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_fixedPeriodValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_fixedPeriodValues_feature", "_UI_Channel_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.CHANNEL__FIXED_PERIOD_VALUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Feature feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addFeaturePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Channel_feature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Channel_feature_feature", "_UI_Channel_type"),
				 EMFEcoreInvocatorRecordingsPackage.Literals.CHANNEL__FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This returns Channel.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Channel"));
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
	  Channel channel = (Channel) object;
	  
	  String label = new String();
	  
	  if(channel.getFeature() != null)
	  {		  
		  String name = EMFEcoreInvocatorFacade.INSTANCE.getFullyQualifiedName(channel.getFeature());
		  label = name;	  		  
	  }
	  else
	  {
		  label = getString("_UI_Channel_type");
	  }
	  
	  label += " (" + channel.getRecordingPolicy().getName();
	  
	  if(channel.getRecordingPolicy() == RecordingPolicy.FIXED_PERIOD)
	  {
		  double period = ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Activator.getDefault().getRecordingPeriodInSeconds(channel.getFixedPeriodValues());
		  label += ", " + durationDecimalFormat.format(period) + " s";
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

		switch (notification.getFeatureID(Channel.class)) {
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__RECORDING_POLICY:
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__FIXED_PERIOD_VALUES:
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__FEATURE:
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
