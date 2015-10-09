/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.ui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.addons.vehicle.ui.SymphonyToolsVehicleUIPackage;
import org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation;
import org.eclipse.symphony.common.topology.ui.provider.NodePresentationItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThrusterPresentationItemProvider
  extends NodePresentationItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ThrusterPresentationItemProvider(AdapterFactory adapterFactory)
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

			addPlumeEnvelopeVisiblePropertyDescriptor(object);
			addPlumeEnvelopeLenghtPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Plume Envelope Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlumeEnvelopeVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThrusterPresentation_plumeEnvelopeVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThrusterPresentation_plumeEnvelopeVisible_feature", "_UI_ThrusterPresentation_type"),
				 SymphonyToolsVehicleUIPackage.Literals.THRUSTER_PRESENTATION__PLUME_ENVELOPE_VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_PLUME_INFOPropertyCategory"),
				 null));
	}

		/**
	 * This adds a property descriptor for the Plume Envelope Lenght feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlumeEnvelopeLenghtPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThrusterPresentation_plumeEnvelopeLenght_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThrusterPresentation_plumeEnvelopeLenght_feature", "_UI_ThrusterPresentation_type"),
				 SymphonyToolsVehicleUIPackage.Literals.THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PLUME_INFOPropertyCategory"),
				 null));
	}

		/**
	 * This returns ThrusterPresentation.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ThrusterPresentation"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		RGB labelValue = ((ThrusterPresentation)object).getColor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ThrusterPresentation_type") :
			getString("_UI_ThrusterPresentation_type") + " " + label;
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

		switch (notification.getFeatureID(ThrusterPresentation.class)) {
			case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_VISIBLE:
			case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGHT:
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
