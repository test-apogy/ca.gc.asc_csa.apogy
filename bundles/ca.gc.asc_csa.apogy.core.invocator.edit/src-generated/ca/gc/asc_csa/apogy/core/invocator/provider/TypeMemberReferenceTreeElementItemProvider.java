/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFactory;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeMemberReferenceTreeElementItemProvider
  extends TypeMemberReferenceItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceTreeElementItemProvider(AdapterFactory adapterFactory)
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
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Symphony__CoreInvocatorPackage.Literals.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD);
			childrenFeatures.add(Symphony__CoreInvocatorPackage.Literals.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE);
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
	 * This returns TypeMemberReferenceTreeElement.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TypeMemberReferenceTreeElement"));
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
	  TypeMemberReferenceTreeElement typeMemberReferenceTreeElement = (TypeMemberReferenceTreeElement)object;
	  
	  String label = getString("_UI_TypeMemberReferenceTreeElement_type");
	  
	  if(typeMemberReferenceTreeElement.getTypeMember() != null &&
			  typeMemberReferenceTreeElement.getTypeMember().getName() != null &&
					  typeMemberReferenceTreeElement.getTypeMember().getName().length() > 0)
	  {
		  label = typeMemberReferenceTreeElement.getTypeMember().getName();
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

		switch (notification.getFeatureID(TypeMemberReferenceTreeElement.class)) {
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__ROOT:
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__LEAF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD:
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE:
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
				(Symphony__CoreInvocatorPackage.Literals.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD,
				 Symphony__CoreInvocatorFactory.eINSTANCE.createTypeMemberReferenceTreeElement()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CoreInvocatorPackage.Literals.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE,
				 Symphony__CommonEMFFactory.eINSTANCE.createTreeRootNode()));
	}

}
