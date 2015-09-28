/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.eclipse.emf.ecore.edit.utils.EMFEcoreEditUtilsFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableFeatureReference;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class TypeMemberReferenceListElementItemProvider extends
		TypeMemberReferenceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TypeMemberReferenceListElementItemProvider(
			AdapterFactory adapterFactory) {
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

			addSubSegmentsCountPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sub Segments Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubSegmentsCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeMemberReferenceListElement_subSegmentsCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeMemberReferenceListElement_subSegmentsCount_feature", "_UI_TypeMemberReferenceListElement_type"),
				 EMFEcoreInvocatorPackage.Literals.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__SUB_SEGMENTS_COUNT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
   * This adds a property descriptor for the Type Member feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addTypeMemberPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TypeMemberReference_typeMember_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TypeMemberReference_typeMember_feature", "_UI_TypeMemberReference_type"),
         EMFEcoreInvocatorPackage.Literals.TYPE_MEMBER_REFERENCE__TYPE_MEMBER,
         true,
         false,
         true,
         null,
         null,
         null){
    	  	@Override
	    	protected Collection<?> getComboBoxObjects(Object object) 
	    	{
    	  		Collection<?> result = null;
    	  		
    	  		TypeMemberReferenceListElement typeMemberReferenceListElement = (TypeMemberReferenceListElement) object;
    	  		
    	  		if(typeMemberReferenceListElement.eContainer() instanceof VariableFeatureReference)
    	  		{
    	  			VariableFeatureReference variableFeatureReference = (VariableFeatureReference) typeMemberReferenceListElement.eContainer();
    	  			if(variableFeatureReference.getVariable() != null)
    	  			{
    	  				if(variableFeatureReference.getVariable().getVariableType() != null)
    	  				{
    	  					result =  variableFeatureReference.getVariable().getVariableType().getMembers();
    	  				}
    	  			}
    	  		}
    	  		
    	  		if(result == null)
    	  		{
    	  			try
    	  			{
    	  				result = typeMemberReferenceListElement.getParent().getTypeMember().getMemberType().getMembers();
    	  			}
    	  			catch(Exception e)
    	  			{
    	  				e.printStackTrace();
    	  			}
    	  		}
    	  		
	    		return result;
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
			childrenFeatures.add(EMFEcoreInvocatorPackage.Literals.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD);
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
	 * This returns TypeMemberReferenceListElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TypeMemberReferenceListElement"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
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

		switch (notification.getFeatureID(TypeMemberReferenceListElement.class)) {
			case EMFEcoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__ROOT:
			case EMFEcoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__LEAF:
			case EMFEcoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__SUB_SEGMENTS_COUNT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EMFEcoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD:
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
				(EMFEcoreInvocatorPackage.Literals.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD,
				 EMFEcoreInvocatorFactory.eINSTANCE.createTypeMemberReferenceListElement()));
	}
	
	/** 
	 * Remove unnecessary descriptors. 
	 */
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		collectNewChildDescriptorsGen(newChildDescriptors, object);

		TypeMemberReferenceListElement typeMemberReferenceListElement = (TypeMemberReferenceListElement) object;
				
		if (typeMemberReferenceListElement.getTypeMember() == null || typeMemberReferenceListElement.getTypeMember().getMemberType().getMembers().isEmpty()) {
			EMFEcoreEditUtilsFacade.INSTANCE
					.removeChildDescriptor(
							newChildDescriptors,
							EMFEcoreInvocatorPackage.Literals.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD);
		}
	}
}
