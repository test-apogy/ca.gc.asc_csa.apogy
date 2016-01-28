/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFactory;
import ca.gc.asc_csa.apogy.core.ApogyCoreFactory;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.invocator.provider.TypeItemProvider;

/**
 * This is the item provider adapter for a
 * {@link ca.gc.asc_csa.apogy.core.ApogySystem} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ApogySystemItemProvider extends TypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ApogySystemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPoseProviderPropertyDescriptor(object);
			addPoseProviderInstancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pose Provider feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addPoseProviderPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogySystem_poseProvider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogySystem_poseProvider_feature", "_UI_ApogySystem_type"),
				 ApogyCorePackage.Literals.APOGY_SYSTEM__POSE_PROVIDER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Pose Provider Instance feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addPoseProviderInstancePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApogySystem_poseProviderInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApogySystem_poseProviderInstance_feature", "_UI_ApogySystem_type"),
				 ApogyCorePackage.Literals.APOGY_SYSTEM__POSE_PROVIDER_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyCorePackage.Literals.APOGY_SYSTEM__TOPOLOGY_ROOT);
			childrenFeatures.add(ApogyCorePackage.Literals.APOGY_SYSTEM__BINDING_SET);
			childrenFeatures.add(ApogyCorePackage.Literals.APOGY_SYSTEM__CONNECTION_POINTS_LIST);
			childrenFeatures.add(ApogyCorePackage.Literals.APOGY_SYSTEM__ASSEMBLY_LINKS_LIST);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ApogySystem.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ApogySystem"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) {
		ApogySystem apogySystem = (ApogySystem) object;

		String label = getString("_UI_ApogySystem_type");

		if (apogySystem.getName() != null) {
			label = apogySystem.getName();
		}
		return label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ApogySystem.class)) {
			case ApogyCorePackage.APOGY_SYSTEM__TOPOLOGY_ROOT:
			case ApogyCorePackage.APOGY_SYSTEM__BINDING_SET:
			case ApogyCorePackage.APOGY_SYSTEM__CONNECTION_POINTS_LIST:
			case ApogyCorePackage.APOGY_SYSTEM__ASSEMBLY_LINKS_LIST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ApogyCorePackage.Literals.APOGY_SYSTEM__TOPOLOGY_ROOT,
				 ApogyCoreFactory.eINSTANCE.createTopologyRoot()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCorePackage.Literals.APOGY_SYSTEM__BINDING_SET,
				 ApogyCommonTopologyBindingsFactory.eINSTANCE.createBindingsSet()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCorePackage.Literals.APOGY_SYSTEM__CONNECTION_POINTS_LIST,
				 ApogyCoreFactory.eINSTANCE.createConnectionPointsList()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyCorePackage.Literals.APOGY_SYSTEM__ASSEMBLY_LINKS_LIST,
				 ApogyCoreFactory.eINSTANCE.createAssemblyLinksList()));
	}

}
