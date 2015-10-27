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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.symphony.common.emf.EMFEcoreFacade;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.TypeMemberImplementation;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableImplementation;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.invocator.VariableImplementation} object.
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
				 Symphony__CoreInvocatorPackage.Literals.VARIABLE_IMPLEMENTATION__VARIABLE,
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
         Symphony__CoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS,
         true,
         false,
         true,
         null,
         null,
         null){
			@Override
			protected Collection<?> getComboBoxObjects(Object object) {
				VariableImplementation implementation = (VariableImplementation) object;											
				return EMFEcoreFacade.INSTANCE.getAllSubEClasses(implementation.getVariable().getVariableType().getInterfaceClass());
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

		if (feature == Symphony__CoreInvocatorPackage.Literals.VARIABLE_IMPLEMENTATION__VARIABLE) {
			Variable variable = (Variable) value;

			if (variable.getVariableType() != null) {

				List<TypeMemberImplementation> implementations = EMFEcoreInvocatorFacade.INSTANCE
						.createTypeMemberImplementations(variable
								.getVariableType());

				if (implementations != null && !implementations.isEmpty()) {

					/** Clear existing list. */
					compoundCommand
							.append(new SetCommand(
									domain,
									owner,
									Symphony__CoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS,
									implementations));

					compoundCommand
							.append(new AddCommand(
									domain,
									owner,
									Symphony__CoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS,
									implementations));
				}
			}
		}
		return compoundCommand;
	}
}