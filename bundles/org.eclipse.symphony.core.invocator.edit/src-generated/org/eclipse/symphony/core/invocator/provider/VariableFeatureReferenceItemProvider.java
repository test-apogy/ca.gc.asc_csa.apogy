/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
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
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFactory;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.ListRootNode;
import org.eclipse.symphony.common.emf.edit.utils.Symphony__CommonEMFEditUtilsFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.VariableFeatureReference;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.invocator.VariableFeatureReference} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class VariableFeatureReferenceItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VariableFeatureReferenceItemProvider(AdapterFactory adapterFactory) {
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
			addVariablePropertyDescriptor(object);
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
				 Symphony__CommonEMFPackage.Literals.NAMED__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variable feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableFeatureReference_variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableFeatureReference_variable_feature", "_UI_VariableFeatureReference_type"),
				 Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE,
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
			childrenFeatures.add(Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT);
			childrenFeatures.add(Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT);
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
	 * This returns VariableFeatureReference.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VariableFeatureReference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VariableFeatureReference)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VariableFeatureReference_type") :
			getString("_UI_VariableFeatureReference_type") + " " + label;
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

		switch (notification.getFeatureID(VariableFeatureReference.class)) {
			case Symphony__CoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__NAME:
			case Symphony__CoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Symphony__CoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT:
			case Symphony__CoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT:
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
	protected void collectNewChildDescriptorsGen(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT,
				 Symphony__CoreInvocatorFactory.eINSTANCE.createTypeMemberReferenceListElement()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT,
				 Symphony__CommonEMFFactory.eINSTANCE.createListRootNode()));
	}

	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		collectNewChildDescriptorsGen(newChildDescriptors, object);
		VariableFeatureReference variableFeatureReference = (VariableFeatureReference) object;

		if (variableFeatureReference.getVariable() == null) {
			Symphony__CommonEMFEditUtilsFacade.INSTANCE
					.removeChildDescriptor(
							newChildDescriptors,
							Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT);

			Symphony__CommonEMFEditUtilsFacade.INSTANCE
					.removeChildDescriptor(
							newChildDescriptors,
							Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT);
		} else {
			// Remove default Root Node.
			Symphony__CommonEMFEditUtilsFacade.INSTANCE
					.removeChildDescriptor(
							newChildDescriptors,
							Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT);

			// Create a new Root Node with Source Class Defined.
			ListRootNode rootNode = Symphony__CommonEMFFactory.eINSTANCE
					.createListRootNode();
		rootNode.setSourceClass(Symphony__CoreInvocatorFacade.INSTANCE
					.getInstanceClass(variableFeatureReference));
			newChildDescriptors
					.add(createChildParameter(
							Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT,
							rootNode));
		}
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

	@SuppressWarnings("unused")
	@Override
	/**
	 * Override the setCommand to automatically create arguments when an operation is set.
	 */
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index) {

		VariableFeatureReference variableFeatureReference = (VariableFeatureReference) owner;

		/** Execute default set operation. */
		CompoundCommand compoundCommand = new CompoundCommand();
		compoundCommand.append(super.createSetCommand(domain, owner, feature,
				value, index));

		if (feature == Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE) {

			// Clears the Type Member List.
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT,
							null));

			// Clears the Feature node
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT,
							null));
			
		} else if (feature == Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT) {

			// Clears the feature root node.
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT,
							null));
		}
		return compoundCommand;
	}
}
