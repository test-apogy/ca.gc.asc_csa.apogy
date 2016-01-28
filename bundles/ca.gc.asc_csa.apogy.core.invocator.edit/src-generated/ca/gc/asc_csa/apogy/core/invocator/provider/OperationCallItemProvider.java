/**
 */
package org.eclipse.symphony.core.invocator.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.emf.AbstractFeatureListNode;
import org.eclipse.symphony.common.emf.AbstractFeatureSpecifier;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.edit.utils.Symphony__CommonEMFEditUtilsFacade;
import org.eclipse.symphony.core.invocator.Argument;
import org.eclipse.symphony.core.invocator.ArgumentsList;
import org.eclipse.symphony.core.invocator.EDataTypeArgument;
import org.eclipse.symphony.core.invocator.EEnumArgument;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement;
import org.eclipse.symphony.core.invocator.Variable;

/**
 * This is the item provider adapter for a
 * {@link org.eclipse.symphony.core.invocator.OperationCall} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class OperationCallItemProvider extends
		VariableFeatureReferenceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationCallItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addEOperationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Described_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Described_description_feature", "_UI_Described_type"),
				 Symphony__CommonEMFPackage.Literals.DESCRIBED__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the EOperation feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected void addEOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_OperationCall_eOperation_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_OperationCall_eOperation_feature",
						"_UI_OperationCall_type"),
				Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION,
				true, false, true, null, null, null) {
			@Override
			protected Collection<?> getComboBoxObjects(Object object) {
				List<EOperation> eOperations = null;
				OperationCall operationCall = (OperationCall) object;
				Variable variable = operationCall.getVariable();
				EClass interface_class = null;

				/** Gets the EClass refers by the variable type or subtype. */
				if (operationCall.getTypeMemberReferenceListElement() == null) {
					interface_class = variable.getVariableType()
							.getInterfaceClass();
				} else {
					TypeMemberReferenceListElement typeMemberReferenceListElement = operationCall
							.getTypeMemberReferenceListElement()
							.getLeafElement();
					interface_class = typeMemberReferenceListElement
							.getTypeMember().getMemberType()
							.getInterfaceClass();
				}

				// Gets the EClass that is refered to by the OperationCall
				// AbstractFeatureNode.
				if (operationCall.getFeatureRoot() != null) {
					AbstractFeatureSpecifier specifier = (AbstractFeatureSpecifier) Symphony__CommonEMFFacade.INSTANCE
							.getLeaf(operationCall.getFeatureRoot());
					EClassifier eClassifier = specifier.getStructuralFeature()
							.getEType();

					if (eClassifier instanceof EClass) {
						interface_class = (EClass) eClassifier;
					}

				}

				/** Returns the list of possible operations. */
				if (interface_class != null) {
					eOperations = Symphony__CommonEMFFacade.INSTANCE
							.getAllAvailableEOperations(interface_class);
				}

				return eOperations;
			}
		});
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
			childrenFeatures.add(Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST);
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
	 * This returns OperationCall.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OperationCall"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) {
		OperationCall operationCall = (OperationCall) object;

		String name_str = operationCall.getName();
		if (name_str != null && name_str.length() == 0) {
			name_str += " - ";
		}

		String variable_str = operationCall.getVariable() == null ? getString("_UI_NOT_DEFINED")
				: Symphony__CommonEMFEditUtilsFacade.INSTANCE.getText(operationCall
						.getVariable());

		String feature_str = null;
		if (operationCall.getFeatureRoot() != null) {
			AbstractFeatureListNode leaf = Symphony__CommonEMFFacade.INSTANCE
					.getLeaf(operationCall.getFeatureRoot());
			if (leaf != null) {
				feature_str = Symphony__CommonEMFFacade.INSTANCE.getAncestriesString(leaf);
			}
		}

		String operation_str = operationCall.getEOperation() == null ? getString("_UI_NOT_DEFINED")
				+ "()"
				: Symphony__CommonEMFEditUtilsFacade.INSTANCE.getText(operationCall
						.getEOperation());

		if (feature_str != null) {
			return name_str + " (" + variable_str + "." + feature_str + "."
					+ operation_str + ")";
		} else {
			return name_str + " (" + variable_str + "." + operation_str + ")";
		}
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

		switch (notification.getFeatureID(OperationCall.class)) {
			case Symphony__CoreInvocatorPackage.OPERATION_CALL__DESCRIPTION:
			case Symphony__CoreInvocatorPackage.OPERATION_CALL__EOPERATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Symphony__CoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST:
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
	}

	@SuppressWarnings("unused")
	@Override
	/**
	 * Override the setCommand to automatically create arguments when an operation is set.
	 */
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index) {

		OperationCall operationCall = (OperationCall) owner;

		CompoundCommand compoundCommand = (CompoundCommand) super.createSetCommand(domain, owner, feature, value, index);
		
		if (feature == Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION) {

			EOperation eOperation = (EOperation) value;

			/** Create Arguments for each operation parameters. */
			List<Argument> arguments = new ArrayList<Argument>();
			for (EParameter parameter : eOperation.getEParameters()) {
				Argument argument = null;

				if (parameter.getEType() instanceof EEnum) {
					argument = Symphony__CoreInvocatorFactory.eINSTANCE
							.createEEnumArgument();
					EEnum eEnum = (EEnum) parameter.getEType();
					((EEnumArgument) argument).setEEnum(eEnum);

					Enum<?> defaultValue = (Enum<?>) parameter.getEType()
							.getDefaultValue();
					((EEnumArgument) argument).setEEnumLiteral(eEnum
							.getEEnumLiteral(defaultValue.name()));
				} else if (parameter.getEType() instanceof EDataType) {
					argument = Symphony__CoreInvocatorFactory.eINSTANCE
							.createEDataTypeArgument();
					Object defaultValue = parameter.getEType()
							.getDefaultValue();

					if (defaultValue != null) {
						((EDataTypeArgument) argument).setValue(String
								.valueOf(defaultValue));
					}
				} else {
					argument = Symphony__CoreInvocatorFactory.eINSTANCE
							.createEClassArgument();
				}
				arguments.add(argument);
			}

			/** Add arguments if there are parameters only. */
			if (!arguments.isEmpty()) {
				ArgumentsList argumentsList = Symphony__CoreInvocatorFactory.eINSTANCE
						.createArgumentsList();
				argumentsList.getArguments().addAll(arguments);

				compoundCommand
						.append(new SetCommand(
								domain,
								owner,
								Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST,
								argumentsList));
			} else {
				// Clears the list.
				compoundCommand
						.append(new SetCommand(
								domain,
								owner,
								Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST,
								null));
			}
		} else if (feature == Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE) {

			// Clears the eOperation
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION,
							null));

			// Clears the arguments
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST,
							null));
						
		} else if (feature == Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT) {
			// Clears the eOperation
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION,
							null));

			// Clears the arguments
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST,
							null));

		} else if (feature == Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT) {
			// Clears the eOperation
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION,
							null));

			// Clears the arguments
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST,
							null));
		}

		return compoundCommand;
	}
}
