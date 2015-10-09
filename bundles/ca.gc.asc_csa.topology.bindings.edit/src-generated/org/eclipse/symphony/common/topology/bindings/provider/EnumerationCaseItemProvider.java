/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings.provider;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.topology.bindings.EnumerationCase;
import ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage;
import ca.gc.space.topology.TopologyFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.topology.bindings.EnumerationCase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerationCaseItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EnumerationCaseItemProvider(AdapterFactory adapterFactory)
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

			addEnumerationLiteralsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Enumeration Literals feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addEnumerationLiteralsPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnumerationCase_enumerationLiterals_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnumerationCase_enumerationLiterals_feature", "_UI_EnumerationCase_type"),
				 TopologyBindingsPackage.Literals.ENUMERATION_CASE__ENUMERATION_LITERALS,
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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT);
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
	 * This returns EnumerationCase.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EnumerationCase"));
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
	  EnumerationCase enumerationCase = (EnumerationCase) object;
	  
	  String label = getString("_UI_EnumerationCase_type");
	  
	  label += " [";
	  
	  Iterator<EEnumLiteral> it = enumerationCase.getEnumerationLiterals().iterator();
	  while(it.hasNext())
	  {
		  EEnumLiteral literal = it.next();
		  label += literal.getName();
		  
		  if(it.hasNext()) label += ", ";
	  }
	  	 
	  label += "]";
	  
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

		switch (notification.getFeatureID(EnumerationCase.class)) {
			case TopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT:
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
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createLeaf()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createURLNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createCADNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createReferencedContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createAggregateContentNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createReferencedGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createAggregateGroupNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createPositionNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createRotationNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createTransformNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyBindingsPackage.Literals.ENUMERATION_CASE__TOPOLOGY_ROOT,
				 TopologyFactory.eINSTANCE.createPickAndPlaceNode()));
	}

  /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator()
  {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
