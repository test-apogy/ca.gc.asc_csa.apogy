/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.symphony.common.emf.EMFEcoreFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.TypeMemberImplementation;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.invocator.TypeMemberImplementation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeMemberImplementationItemProvider
  extends AbstractTypeImplementationItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberImplementationItemProvider(AdapterFactory adapterFactory)
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

			addTypeMemberPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Type Member feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addTypeMemberPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeMemberImplementation_typeMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeMemberImplementation_typeMember_feature", "_UI_TypeMemberImplementation_type"),
				 Symphony__CoreInvocatorPackage.Literals.TYPE_MEMBER_IMPLEMENTATION__TYPE_MEMBER,
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
         getString("_UI_TypeMemberImplementation_implementationClass_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TypeMemberImplementation_implementationClass_feature", "_UI_TypeMemberImplementation_type"),
         Symphony__CoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS,
         true,
         false,
         true,
         null,
         null,
         null){
			@Override
			protected Collection<?> getComboBoxObjects(Object object) {
				TypeMemberImplementation implementation = (TypeMemberImplementation) object;				
				return EMFEcoreFacade.INSTANCE.getAllSubEClasses(implementation.getTypeMember().getMemberType().getInterfaceClass());
			}
		});
  }

  /**
	 * This returns TypeMemberImplementation.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TypeMemberImplementation"));
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
	  TypeMemberImplementation typeMemberImplementation = (TypeMemberImplementation) object;
	  
	  String label = getString("_UI_TypeMemberImplementation_type");
	  
	  if(typeMemberImplementation.getTypeMember() != null)
	  {
		  String memberName = typeMemberImplementation.getTypeMember().getName();
		  
		  if(memberName != null && memberName.length() > 0)
		  {
			  label = memberName;
		  }		 
		  
		  if(typeMemberImplementation.getImplementationClass() != null)
		  {
			  label += " -> " + typeMemberImplementation.getImplementationClass().getInstanceClassName();
		  }
	  }
	  
	  return label;
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
	}

}
