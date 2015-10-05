/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.math.MathFactory;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.symphony.environment.Map;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentFactory;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.environment.Map} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MapItemProvider
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
  public MapItemProvider(AdapterFactory adapterFactory)
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

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addMapNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addNamePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Named_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Named_name_feature", "_UI_Named_type"),
				 EMFEcorePackage.Literals.NAMED__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addDescriptionPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Described_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Described_description_feature", "_UI_Described_type"),
				 EMFEcorePackage.Literals.DESCRIBED__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Map Node feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addMapNodePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Map_mapNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Map_mapNode_feature", "_UI_Map_type"),
				 SymphonyEnvironmentPackage.Literals.MAP__MAP_NODE,
				 false,
				 false,
				 false,
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
			childrenFeatures.add(SymphonyEnvironmentPackage.Literals.MAP__TRANSFORMATION);
			childrenFeatures.add(SymphonyEnvironmentPackage.Literals.MAP__LAYERS);
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
	 * This returns Map.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Map"));
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
	  Map map = (Map) object;
	  
	  String label = ((Map)object).getName();
	  if(label == null || label.length() == 0)
	  {
		  label = getString("_UI_Map_type");
	  }
	  else
	  {
		  label =  getString("_UI_Map_type") + " " + label;
	  }
			  
	  if(map.getLayers().size() > 0)
	  {
		  label += " [" + map.getLayers().size() + "]";
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

		switch (notification.getFeatureID(Map.class)) {
			case SymphonyEnvironmentPackage.MAP__NAME:
			case SymphonyEnvironmentPackage.MAP__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SymphonyEnvironmentPackage.MAP__TRANSFORMATION:
			case SymphonyEnvironmentPackage.MAP__LAYERS:
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
				(SymphonyEnvironmentPackage.Literals.MAP__TRANSFORMATION,
				 MathFactory.eINSTANCE.createMatrix4x4()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createURLImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createTopologyTreeMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshSlopeImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshDiscreteSlopeImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshHeightImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createLineOfSightImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createEllipseShapeImageLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createRectangleShapeImageLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createCartesianCoordinatesPolygonShapeImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createGeographicCoordinatesPolygonShapeImageMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createBasicCartesianTriangularMeshMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshURLMapLayer()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyEnvironmentPackage.Literals.MAP__LAYERS,
				 SymphonyEnvironmentFactory.eINSTANCE.createFeaturesOfInterestMapLayer()));
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
