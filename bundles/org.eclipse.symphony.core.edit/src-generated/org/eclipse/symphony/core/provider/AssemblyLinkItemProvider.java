/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.math.MathFactory;
import org.eclipse.symphony.core.AssemblyLink;
import org.eclipse.symphony.core.SymphonyCoreFactory;
import org.eclipse.symphony.core.SymphonyCorePackage;

import ca.gc.space.topology.TopologyFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.AssemblyLink} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class AssemblyLinkItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	public static final String ATTACHMENT_STRING = "\u27DC"; // "\u2192";

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssemblyLinkItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addParentTypeMemberPropertyDescriptor(object);
			addSubSystemTypeMemberPropertyDescriptor(object);
			addParentConnectionPointPropertyDescriptor(object);
			addParentInstancePropertyDescriptor(object);
			addSubSystemInstancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
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
	 * This adds a property descriptor for the Description feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Described_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Described_description_feature", "_UI_Described_type"),
				 EMFEcorePackage.Literals.DESCRIBED__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub System Type Member feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubSystemTypeMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssemblyLink_subSystemTypeMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssemblyLink_subSystemTypeMember_feature", "_UI_AssemblyLink_type"),
				 SymphonyCorePackage.Literals.ASSEMBLY_LINK__SUB_SYSTEM_TYPE_MEMBER,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_LINK_CHILDPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Type Member feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addParentTypeMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssemblyLink_parentTypeMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssemblyLink_parentTypeMember_feature", "_UI_AssemblyLink_type"),
				 SymphonyCorePackage.Literals.ASSEMBLY_LINK__PARENT_TYPE_MEMBER,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_LINK_PARENTPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Connection Point feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentConnectionPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssemblyLink_parentConnectionPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssemblyLink_parentConnectionPoint_feature", "_UI_AssemblyLink_type"),
				 SymphonyCorePackage.Literals.ASSEMBLY_LINK__PARENT_CONNECTION_POINT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_LINK_PARENTPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Instance feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addParentInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssemblyLink_parentInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssemblyLink_parentInstance_feature", "_UI_AssemblyLink_type"),
				 SymphonyCorePackage.Literals.ASSEMBLY_LINK__PARENT_INSTANCE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_LINK_PARENTPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub System Instance feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSubSystemInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssemblyLink_subSystemInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssemblyLink_subSystemInstance_feature", "_UI_AssemblyLink_type"),
				 SymphonyCorePackage.Literals.ASSEMBLY_LINK__SUB_SYSTEM_INSTANCE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_LINK_CHILDPropertyCategory"),
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
			childrenFeatures.add(SymphonyCorePackage.Literals.ASSEMBLY_LINK__TRANSFORMATION_MATRIX);
			childrenFeatures.add(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE);
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
	 * This returns AssemblyLink.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssemblyLink"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) 
	{
		AssemblyLink link = (AssemblyLink) object;
		String label = null;
		
		if(link.getName() != null)
		{	
			label = link.getName();
		}
		else
		{
			label = getString("_UI_AssemblyLink_type");
		}
		
		label += " (";

		if (link.getParentTypeMember() != null) 
		{
			label += link.getParentTypeMember().getName() + ".";
		} 
		else 
		{
			label += "?.";
		}

		if (link.getParentConnectionPoint() != null) 
		{
			label += link.getParentConnectionPoint().getName();
		} 
		else {
			label += "null";
		}

		label += " " + ATTACHMENT_STRING + " ";

		if (link.getSubSystemTypeMember() != null) 
		{
			label += link.getSubSystemTypeMember().getName();
		} 
		else 
		{
			label += "null";
		}
		label += ")";

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

		switch (notification.getFeatureID(AssemblyLink.class)) {
			case SymphonyCorePackage.ASSEMBLY_LINK__NAME:
			case SymphonyCorePackage.ASSEMBLY_LINK__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SymphonyCorePackage.ASSEMBLY_LINK__TRANSFORMATION_MATRIX:
			case SymphonyCorePackage.ASSEMBLY_LINK__GEOMETRY_NODE:
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
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__TRANSFORMATION_MATRIX,
				 MathFactory.eINSTANCE.createMatrix4x4()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 SymphonyCoreFactory.eINSTANCE.createResultNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 SymphonyCoreFactory.eINSTANCE.createResultsListNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 SymphonyCoreFactory.eINSTANCE.createFeatureOfInterestNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 SymphonyCoreFactory.eINSTANCE.createFeatureOfInterestListNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createLeaf()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createURLNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createCADNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createReferencedContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createAggregateContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createReferencedGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createAggregateGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createPositionNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createRotationNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createTransformNode()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyCorePackage.Literals.ASSEMBLY_LINK__GEOMETRY_NODE,
				 TopologyFactory.eINSTANCE.createPickAndPlaceNode()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
