/**
 * Copyrights Canadian Space Agency 2011
 */
package ca.gc.asc_csa.apogy.common.topology.bindings.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RotationBindingItemProvider
	extends AbstractTopologyBindingItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationBindingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRotationNodePropertyDescriptor(object);
			addRotationAxisPropertyDescriptor(object);
			addRotationUnitsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Rotation Node feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addRotationNodePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RotationBinding_rotationNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RotationBinding_rotationNode_feature", "_UI_RotationBinding_type"),
				 ApogyCommonTopologyBindingsPackage.Literals.ROTATION_BINDING__ROTATION_NODE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_DESTINATIONPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Rotation Axis feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addRotationAxisPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RotationBinding_rotationAxis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RotationBinding_rotationAxis_feature", "_UI_RotationBinding_type"),
				 ApogyCommonTopologyBindingsPackage.Literals.ROTATION_BINDING__ROTATION_AXIS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DESTINATIONPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Rotation Units feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addRotationUnitsPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RotationBinding_rotationUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RotationBinding_rotationUnits_feature", "_UI_RotationBinding_type"),
				 ApogyCommonTopologyBindingsPackage.Literals.ROTATION_BINDING__ROTATION_UNITS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DESTINATIONPropertyCategory"),
				 null));
	}

  /**
	 * This returns RotationBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RotationBinding"));
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
		RotationBinding rotationBinding = (RotationBinding) object;
		
		String label = null;
		
		if(rotationBinding.getName() != null && rotationBinding.getName().length() > 0)
		{
			label = rotationBinding.getName();
		}
		else
		{
			label = getString("_UI_RotationBinding_type");
		}
		
		String info = null;
		
		if(rotationBinding.getRotationAxis() != null)
		{
			info = rotationBinding.getRotationAxis().getName();
		}
		
		if(rotationBinding.getRotationUnits() != null)
		{
			if(info != null) info += " , " + rotationBinding.getRotationUnits().getName();
			else info = rotationBinding.getRotationUnits().getName();
		}
		
		if(info != null)
		{
			label += " (" + info + ")";
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
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RotationBinding.class)) {
			case ApogyCommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS:
			case ApogyCommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_UNITS:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
