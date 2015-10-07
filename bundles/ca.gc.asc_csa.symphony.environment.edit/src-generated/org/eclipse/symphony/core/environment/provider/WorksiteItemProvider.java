/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentFactory;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;
import org.eclipse.symphony.core.environment.Worksite;
import org.eclipse.symphony.core.provider.AbstractWorksiteItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.Worksite} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorksiteItemProvider
  extends AbstractWorksiteItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WorksiteItemProvider(AdapterFactory adapterFactory)
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

			addWorksiteNodePropertyDescriptor(object);
			addOrbitsModelsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Worksite Node feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addWorksiteNodePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Worksite_worksiteNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Worksite_worksiteNode_feature", "_UI_Worksite_type"),
				 SymphonyEnvironmentPackage.Literals.WORKSITE__WORKSITE_NODE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Orbits Models feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrbitsModelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Worksite_orbitsModels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Worksite_orbitsModels_feature", "_UI_Worksite_type"),
				 SymphonyEnvironmentPackage.Literals.WORKSITE__ORBITS_MODELS,
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
			childrenFeatures.add(SymphonyEnvironmentPackage.Literals.WORKSITE__ENVIRONMENT);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		String label = ((Worksite)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Worksite_type") :
			getString("_UI_Worksite_type") + " " + label;
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

		switch (notification.getFeatureID(Worksite.class)) {
			case SymphonyEnvironmentPackage.WORKSITE__ENVIRONMENT:
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
				(SymphonyEnvironmentPackage.Literals.WORKSITE__ENVIRONMENT,
				 SymphonyEnvironmentFactory.eINSTANCE.createEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.WORKSITE__ENVIRONMENT,
				 SymphonyEnvironmentFactory.eINSTANCE.createSurfaceEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.WORKSITE__ENVIRONMENT,
				 SymphonyEnvironmentFactory.eINSTANCE.createEarthSurfaceEnvironment()));
	}

}
