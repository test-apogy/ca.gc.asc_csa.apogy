/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.symphony.common.topology.TopologyPackage;
import org.eclipse.symphony.common.topology.provider.GroupNodeItemProvider;
import org.eclipse.symphony.core.SymphonyCoreFactory;
import org.eclipse.symphony.core.environment.SkyNode;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentFactory;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.SkyNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SkyNodeItemProvider
  extends GroupNodeItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SkyNodeItemProvider(AdapterFactory adapterFactory)
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

			addSkyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Sky feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addSkyPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SkyNode_sky_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SkyNode_sky_feature", "_UI_SkyNode_type"),
				 SymphonyEnvironmentPackage.Literals.SKY_NODE__SKY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This returns SkyNode.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SkyNode"));
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
		String label = ((SkyNode)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_SkyNode_type") :
			getString("_UI_SkyNode_type") + " " + label;
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

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createSun()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createEarth()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createMoon()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createStarField()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createTopologyTreeMapLayerNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createWorksiteNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createSurfaceWorksiteNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createEarthSurfaceWorksiteNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createMapsListNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createMapNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createAbstractMapLayerNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createSkyNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createEarthSkyNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshMapLayerNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyCoreFactory.eINSTANCE.createResultNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyCoreFactory.eINSTANCE.createResultsListNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyCoreFactory.eINSTANCE.createFeatureOfInterestNode()));

		newChildDescriptors.add
			(createChildParameter
				(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
				 SymphonyCoreFactory.eINSTANCE.createFeatureOfInterestListNode()));
	}

}
