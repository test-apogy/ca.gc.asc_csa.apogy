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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementation} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class VariableImplementationItemProvider extends AbstractTypeImplementationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VariableImplementationItemProvider(AdapterFactory adapterFactory) {
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

			addVariablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_VariableImplementation_variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableImplementation_variable_feature", "_UI_VariableImplementation_type"),
				 ApogyCoreInvocatorPackage.Literals.VARIABLE_IMPLEMENTATION__VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
   * This adds a property descriptor for the Implementation Class feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addImplementationClassPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_VariableImplementation_implementationClass_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_VariableImplementation_implementationClass_feature", "_UI_VariableImplementation_type"),
         ApogyCoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS,
         true,
         false,
         true,
         null,
         null,
         null){
			@Override
			protected Collection<?> getComboBoxObjects(Object object) {
				VariableImplementation implementation = (VariableImplementation) object;											
				return ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(implementation.getVariable().getVariableType().getInterfaceClass());
			}
		});
  }

  /**
	 * This returns VariableImplementation.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VariableImplementation"));
	}

	/**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @generated_NOT
   */
	@Override
	public String getText(Object object) 
	{
		VariableImplementation variableImplementation =(VariableImplementation) object;
		
		String label = getString("_UI_VariableImplementation_type");
		
		Variable variable = variableImplementation.getVariable();
		if(variableImplementation.getVariable() != null)
		{
			if(variable.getName() != null && variable.getName().length() > 0)
			{
				label = variable.getName();
			}
			
			if(variableImplementation.getImplementationClass() != null)
			{
				label += " -> " + variableImplementation.getImplementationClass().getInstanceClassName();
			}
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

	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index) {

		CompoundCommand compoundCommand = new CompoundCommand();

		/** Execute default set operation. */
		compoundCommand.append(new SetCommand(domain, owner, feature, value,
				index));

		if (feature == ApogyCoreInvocatorPackage.Literals.VARIABLE_IMPLEMENTATION__VARIABLE) {
			Variable variable = (Variable) value;

			if (variable.getVariableType() != null) {

				List<TypeMemberImplementation> implementations = ApogyCoreInvocatorFacade.INSTANCE
						.createTypeMemberImplementations(variable
								.getVariableType());

				if (implementations != null && !implementations.isEmpty()) {

					/** Clear existing list. */
					compoundCommand
							.append(new SetCommand(
									domain,
									owner,
									ApogyCoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS,
									implementations));

					compoundCommand
							.append(new AddCommand(
									domain,
									owner,
									ApogyCoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS,
									implementations));
				}
			}
		}
		return compoundCommand;
	}
}