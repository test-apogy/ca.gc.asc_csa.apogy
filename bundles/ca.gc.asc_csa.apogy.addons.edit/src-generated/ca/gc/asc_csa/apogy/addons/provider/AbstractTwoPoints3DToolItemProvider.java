/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.addons.AbstractTwoPoints3DTool;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.AbstractTwoPoints3DTool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractTwoPoints3DToolItemProvider
	extends Simple3DToolItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTwoPoints3DToolItemProvider(AdapterFactory adapterFactory) {
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

			addFromAbsolutePositionPropertyDescriptor(object);
			addFromRelativePositionPropertyDescriptor(object);
			addFromNodePropertyDescriptor(object);
			addFromNodeLockPropertyDescriptor(object);
			addToAbsolutePositionPropertyDescriptor(object);
			addToRelativePositionPropertyDescriptor(object);
			addToNodePropertyDescriptor(object);
			addToNodeLockPropertyDescriptor(object);
			addDistancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the From Absolute Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromAbsolutePositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTwoPoints3DTool_fromAbsolutePosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTwoPoints3DTool_fromAbsolutePosition_feature", "_UI_AbstractTwoPoints3DTool_type"),
				 ApogyAddonsPackage.Literals.ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_FROM_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the From Relative Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromRelativePositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTwoPoints3DTool_fromRelativePosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTwoPoints3DTool_fromRelativePosition_feature", "_UI_AbstractTwoPoints3DTool_type"),
				 ApogyAddonsPackage.Literals.ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_FROM_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the From Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTwoPoints3DTool_fromNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTwoPoints3DTool_fromNode_feature", "_UI_AbstractTwoPoints3DTool_type"),
				 ApogyAddonsPackage.Literals.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_FROM_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the From Node Lock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromNodeLockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTwoPoints3DTool_fromNodeLock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTwoPoints3DTool_fromNodeLock_feature", "_UI_AbstractTwoPoints3DTool_type"),
				 ApogyAddonsPackage.Literals.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_FROM_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the To Absolute Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToAbsolutePositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTwoPoints3DTool_toAbsolutePosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTwoPoints3DTool_toAbsolutePosition_feature", "_UI_AbstractTwoPoints3DTool_type"),
				 ApogyAddonsPackage.Literals.ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_TO_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the To Relative Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToRelativePositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTwoPoints3DTool_toRelativePosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTwoPoints3DTool_toRelativePosition_feature", "_UI_AbstractTwoPoints3DTool_type"),
				 ApogyAddonsPackage.Literals.ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_TO_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the To Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTwoPoints3DTool_toNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTwoPoints3DTool_toNode_feature", "_UI_AbstractTwoPoints3DTool_type"),
				 ApogyAddonsPackage.Literals.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_TO_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the To Node Lock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToNodeLockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTwoPoints3DTool_toNodeLock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTwoPoints3DTool_toNodeLock_feature", "_UI_AbstractTwoPoints3DTool_type"),
				 ApogyAddonsPackage.Literals.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_TO_NODEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addDistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTwoPoints3DTool_distance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTwoPoints3DTool_distance_feature", "_UI_AbstractTwoPoints3DTool_type"),
				 ApogyAddonsPackage.Literals.ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractTwoPoints3DTool)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractTwoPoints3DTool_type") :
			getString("_UI_AbstractTwoPoints3DTool_type") + " " + label;
	}
	
	protected String getAbstractTwoPoints3DToolText(AbstractTwoPoints3DTool abstractTwoPoints3DTool)
	{
		String text = new String();
		
		// Adds locked status.
		if(abstractTwoPoints3DTool.isFromNodeLock())
		{
			text += "FROM locked";
			
			if(abstractTwoPoints3DTool.isToNodeLock()) 
			{
				text += " , TO locked ";
			}
		}
		else if(abstractTwoPoints3DTool.isToNodeLock())
		{
			text += "TO locked";
		}
								
		return text;
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

		switch (notification.getFeatureID(AbstractTwoPoints3DTool.class)) {
			case ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION:
			case ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION:
			case ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE:
			case ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK:
			case ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION:
			case ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION:
			case ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE:
			case ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK:
			case ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE:
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
