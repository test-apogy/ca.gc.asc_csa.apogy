/**
 * <copyright>
 * </copyright>
 *
 * $Id: KinematicStateItemProvider.java,v 1.6.2.2 2015/02/03 20:01:26 rlarcheveque Exp $
 */
package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFactory;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KinematicStateItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinematicStateItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__POSITION);
			childrenFeatures.add(ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__ORIENTATION);
			childrenFeatures.add(ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__LINEAR_VELOCITY);
			childrenFeatures.add(ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__ANGULAR_VELOCITY);
			childrenFeatures.add(ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__LINEAR_ACCELERATION);
			childrenFeatures.add(ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__ANGULAR_ACCELERATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns KinematicState.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KinematicState"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_KinematicState_type");
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

		switch (notification.getFeatureID(KinematicState.class)) {
			case ApogyCommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE__POSITION:
			case ApogyCommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE__ORIENTATION:
			case ApogyCommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE__LINEAR_VELOCITY:
			case ApogyCommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE__ANGULAR_VELOCITY:
			case ApogyCommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE__LINEAR_ACCELERATION:
			case ApogyCommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE__ANGULAR_ACCELERATION:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__POSITION,
				 ApogyCommonMathFactory.eINSTANCE.createTuple3d()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__ORIENTATION,
				 ApogyCommonMathFactory.eINSTANCE.createTuple3d()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__LINEAR_VELOCITY,
				 ApogyCommonMathFactory.eINSTANCE.createTuple3d()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__ANGULAR_VELOCITY,
				 ApogyCommonMathFactory.eINSTANCE.createTuple3d()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__LINEAR_ACCELERATION,
				 ApogyCommonMathFactory.eINSTANCE.createTuple3d()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__ANGULAR_ACCELERATION,
				 ApogyCommonMathFactory.eINSTANCE.createTuple3d()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__POSITION ||
			childFeature == ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__ORIENTATION ||
			childFeature == ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__LINEAR_VELOCITY ||
			childFeature == ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__ANGULAR_VELOCITY ||
			childFeature == ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__LINEAR_ACCELERATION ||
			childFeature == ApogyCommonTopologyAddonsDynamicsPackage.Literals.KINEMATIC_STATE__ANGULAR_ACCELERATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
