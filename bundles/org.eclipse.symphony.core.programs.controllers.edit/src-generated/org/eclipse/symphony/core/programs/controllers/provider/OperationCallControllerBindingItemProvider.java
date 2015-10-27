/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
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
import org.eclipse.symphony.common.emf.edit.utils.EMFEcoreEditUtilsFacade;
import org.eclipse.symphony.core.invocator.Argument;
import org.eclipse.symphony.core.invocator.ArgumentsList;
import org.eclipse.symphony.core.invocator.EEnumArgument;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.provider.OperationCallItemProvider;
import org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersFactory;
import org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage;
import org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationCallControllerBindingItemProvider
  extends OperationCallItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCallControllerBindingItemProvider(AdapterFactory adapterFactory)
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

			addCreateResultPropertyDescriptor(object);
			addActivePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Create Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OperationCallControllerBinding_createResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OperationCallControllerBinding_createResult_feature", "_UI_OperationCallControllerBinding_type"),
				 Symphony__CoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__CREATE_RESULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Active feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addActivePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OperationCallControllerBinding_active_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OperationCallControllerBinding_active_feature", "_UI_OperationCallControllerBinding_type"),
				 Symphony__CoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__ACTIVE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Symphony__CoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER);
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns OperationCallControllerBinding.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OperationCallControllerBinding"));
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
		OperationCallControllerBinding operationCall = (OperationCallControllerBinding) object;
		String name_str = operationCall.getName() == null ? "unamed" : operationCall.getName();

		String variable_str = operationCall.getVariable() == null ? "Not Defined"
				: EMFEcoreEditUtilsFacade.INSTANCE.getText(operationCall
						.getVariable());

		String operation_str = operationCall.getEOperation() == null ? "Not Defined"
				+ "()"
				: EMFEcoreEditUtilsFacade.INSTANCE.getText(operationCall
						.getEOperation());

		return name_str + " - [" + variable_str + "." + operation_str + "]";	    
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

		switch (notification.getFeatureID(OperationCallControllerBinding.class)) {
			case Symphony__CoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__CREATE_RESULT:
			case Symphony__CoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__ACTIVE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Symphony__CoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER:
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER,
				 Symphony__CoreProgramsControllersFactory.eINSTANCE.createTimeTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER,
				 Symphony__CoreProgramsControllersFactory.eINSTANCE.createControllerEdgeTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER,
				 Symphony__CoreProgramsControllersFactory.eINSTANCE.createControllerStateTrigger()));
	}

  @Override
  /**
   * Overide method to automatically populate the Parameters list of the binding.
   */
  protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index) 
  {
		if (feature == Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION) 
		{
			EOperation eOperation = (EOperation) value;
			CompoundCommand compoundCommand = new CompoundCommand();

			// Execute default set operation.
			compoundCommand.append(new SetCommand(domain, owner, feature, value, index));
						
			/** Create Arguments for each operation parameters. */
			List<Argument> arguments = new ArrayList<Argument>();
			for (EParameter parameter : eOperation.getEParameters())
			{		
				Argument argument = null;
				
				if (parameter.getEType() instanceof EEnum)
				{
					argument = Symphony__CoreInvocatorFactory.eINSTANCE.createEEnumArgument();
					EEnum eEnum = (EEnum) parameter.getEType();			
					((EEnumArgument)argument).setEEnum(eEnum);
					
					Enum<?> defaultValue = (Enum<?>) parameter.getEType().getDefaultValue();
					((EEnumArgument)argument).setEEnumLiteral(eEnum.getEEnumLiteral(defaultValue.name()));
				}
				else if (parameter.getEType() instanceof EDataType)
				{							
					// Create the Controller Binding specific Argument.
					argument = Symphony__CoreProgramsControllersFactory.eINSTANCE.createBindedEDataTypeArgument();					
					
//					Object defaultValue = parameter.getEType().getDefaultValue();	
					
//					System.out.println("defaultValue " + defaultValue);
//					if (defaultValue != null)
//					{
//						((BindedEDataTypeArgument)argument).setValue(String.valueOf(defaultValue));
//					}
				}
				else
				{
					argument = Symphony__CoreInvocatorFactory.eINSTANCE.createEClassArgument();
				}
				arguments.add(argument);
			}
				
			/** Add arguments if there are parameters only. */
			if (!arguments.isEmpty())
			{
				ArgumentsList argumentsList = Symphony__CoreInvocatorFactory.eINSTANCE.createArgumentsList();
				argumentsList.getArguments().addAll(arguments);
	
				compoundCommand.append(new SetCommand(
											domain, 
											owner, 
											Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST, 
											argumentsList));
			}
			else
			{
				// Clears the list.
				compoundCommand.append(new SetCommand(
							domain, 
							owner, 
							Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST, 
							null));
			}
			
			return compoundCommand;
		}
		else
		{
			return super.createSetCommand(domain, owner, feature, value, index);
		}
  }  
}
