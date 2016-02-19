package ca.gc.asc_csa.apogy.core.invocator.provider;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsFacade;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.EEnumArgument;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement;
import ca.gc.asc_csa.apogy.core.invocator.Variable;

/**
 * This is the item provider adapter for a
 * {@link ca.gc.asc_csa.apogy.core.invocator.OperationCall} object. <!--
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
				 ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION,
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
				ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION,
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
					AbstractFeatureSpecifier specifier = (AbstractFeatureSpecifier) ApogyCommonEMFFacade.INSTANCE
							.getLeaf(operationCall.getFeatureRoot());
					EClassifier eClassifier = specifier.getStructuralFeature()
							.getEType();

					if (eClassifier instanceof EClass) {
						interface_class = (EClass) eClassifier;
					}

				}

				/** Returns the list of possible operations. */
				if (interface_class != null) {
					eOperations = ApogyCommonEMFFacade.INSTANCE
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
			childrenFeatures.add(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST);
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
				: ApogyCommonEMFEditUtilsFacade.INSTANCE.getText(operationCall
						.getVariable());

		String feature_str = null;
		if (operationCall.getFeatureRoot() != null) {
			AbstractFeatureListNode leaf = ApogyCommonEMFFacade.INSTANCE
					.getLeaf(operationCall.getFeatureRoot());
			if (leaf != null) {
				feature_str = ApogyCommonEMFFacade.INSTANCE.getAncestriesString(leaf);
			}
		}

		String operation_str = operationCall.getEOperation() == null ? getString("_UI_NOT_DEFINED")
				+ "()"
				: ApogyCommonEMFEditUtilsFacade.INSTANCE.getText(operationCall
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL__DESCRIPTION:
			case ApogyCoreInvocatorPackage.OPERATION_CALL__EOPERATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyCoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST:
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
		
		if (feature == ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION) {

			EOperation eOperation = (EOperation) value;

			/** Create Arguments for each operation parameters. */
			List<Argument> arguments = new ArrayList<Argument>();
			for (EParameter parameter : eOperation.getEParameters()) {
				Argument argument = null;

				if (parameter.getEType() instanceof EEnum) {
					argument = ApogyCoreInvocatorFactory.eINSTANCE
							.createEEnumArgument();
					EEnum eEnum = (EEnum) parameter.getEType();
					((EEnumArgument) argument).setEEnum(eEnum);

					Enum<?> defaultValue = (Enum<?>) parameter.getEType()
							.getDefaultValue();
					((EEnumArgument) argument).setEEnumLiteral(eEnum
							.getEEnumLiteral(defaultValue.name()));
				} else if (parameter.getEType() instanceof EDataType) {
					
					Class<?> clazz = parameter.getEType().getInstanceClass();
					System.out.println("OperationCallItemProvider.createSetCommand()");
					
					
					if (clazz.isAssignableFrom(boolean.class) || clazz.isAssignableFrom(Boolean.class)) {
						argument = ApogyCoreInvocatorFactory.eINSTANCE.createBooleanEDataTypeArgument();
					} else if (clazz.isAssignableFrom(Number.class) ||
							   clazz.isAssignableFrom(byte.class) || 
							   clazz.isAssignableFrom(short.class) ||
							   clazz.isAssignableFrom(int.class) ||
							   clazz.isAssignableFrom(long.class) ||
							   clazz.isAssignableFrom(float.class) ||
							   clazz.isAssignableFrom(double.class)){						
						argument = ApogyCoreInvocatorFactory.eINSTANCE.createNumericEDataTypeArgument();
					} else{
						argument = ApogyCoreInvocatorFactory.eINSTANCE.createStringEDataTypeArgument();						
					}
					
					Object defaultValue = parameter.getEType()
							.getDefaultValue();

					if (defaultValue != null) {
						((EDataTypeArgument) argument).setValue(String
								.valueOf(defaultValue));
					}
				} else {
					argument = ApogyCoreInvocatorFactory.eINSTANCE
							.createEClassArgument();
				}
				arguments.add(argument);
			}

			/** Add arguments if there are parameters only. */
			if (!arguments.isEmpty()) {
				ArgumentsList argumentsList = ApogyCoreInvocatorFactory.eINSTANCE
						.createArgumentsList();
				argumentsList.getArguments().addAll(arguments);

				compoundCommand
						.append(new SetCommand(
								domain,
								owner,
								ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST,
								argumentsList));
			} else {
				// Clears the list.
				compoundCommand
						.append(new SetCommand(
								domain,
								owner,
								ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST,
								null));
			}
		} else if (feature == ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE) {

			// Clears the eOperation
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION,
							null));

			// Clears the arguments
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST,
							null));
						
		} else if (feature == ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT) {
			// Clears the eOperation
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION,
							null));

			// Clears the arguments
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST,
							null));

		} else if (feature == ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT) {
			// Clears the eOperation
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION,
							null));

			// Clears the arguments
			compoundCommand
					.append(new SetCommand(
							domain,
							owner,
							ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST,
							null));
		}

		return compoundCommand;
	}
}
