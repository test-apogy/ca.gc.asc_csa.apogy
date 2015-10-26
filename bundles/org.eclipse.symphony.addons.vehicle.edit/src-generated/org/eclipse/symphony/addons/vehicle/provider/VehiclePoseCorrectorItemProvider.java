/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.provider;


import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehicleFactory;
import org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage;
import org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector;
import org.eclipse.symphony.addons.vehicle.ZCorrectionMode;
import org.eclipse.symphony.core.provider.PoseCorrectorItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VehiclePoseCorrectorItemProvider
  extends PoseCorrectorItemProvider
{
  private DecimalFormat zCorrectionDecimalForm = new DecimalFormat("0.000");
  public static final String DELTA_CHARACTER = new String("\u0394");
	
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VehiclePoseCorrectorItemProvider(AdapterFactory adapterFactory)
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

			addInitializingPropertyDescriptor(object);
			addMeshesPropertyDescriptor(object);
			addContactBodiesPropertyDescriptor(object);
			addZCorrectionModePropertyDescriptor(object);
			addZCorrectionPropertyDescriptor(object);
			addOrientationCorrectionModePropertyDescriptor(object);
			addOrientationCorrectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Initializing feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addInitializingPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehiclePoseCorrector_initializing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehiclePoseCorrector_initializing_feature", "_UI_VehiclePoseCorrector_type"),
				 Symphony__AddonsVehiclePackage.Literals.VEHICLE_POSE_CORRECTOR__INITIALIZING,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_INTERNAL_INFOPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Meshes feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addMeshesPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehiclePoseCorrector_meshes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehiclePoseCorrector_meshes_feature", "_UI_VehiclePoseCorrector_type"),
				 Symphony__AddonsVehiclePackage.Literals.VEHICLE_POSE_CORRECTOR__MESHES,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_INTERNAL_INFOPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Contact Bodies feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addContactBodiesPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehiclePoseCorrector_contactBodies_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehiclePoseCorrector_contactBodies_feature", "_UI_VehiclePoseCorrector_type"),
				 Symphony__AddonsVehiclePackage.Literals.VEHICLE_POSE_CORRECTOR__CONTACT_BODIES,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_INTERNAL_INFOPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the ZCorrection Mode feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addZCorrectionModePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehiclePoseCorrector_zCorrectionMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehiclePoseCorrector_zCorrectionMode_feature", "_UI_VehiclePoseCorrector_type"),
				 Symphony__AddonsVehiclePackage.Literals.VEHICLE_POSE_CORRECTOR__ZCORRECTION_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SETTINGS_INFOPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the ZCorrection feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addZCorrectionPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehiclePoseCorrector_zCorrection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehiclePoseCorrector_zCorrection_feature", "_UI_VehiclePoseCorrector_type"),
				 Symphony__AddonsVehiclePackage.Literals.VEHICLE_POSE_CORRECTOR__ZCORRECTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_CORRECTION_INFOPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Orientation Correction Mode feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addOrientationCorrectionModePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehiclePoseCorrector_orientationCorrectionMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehiclePoseCorrector_orientationCorrectionMode_feature", "_UI_VehiclePoseCorrector_type"),
				 Symphony__AddonsVehiclePackage.Literals.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SETTINGS_INFOPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Orientation Correction feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addOrientationCorrectionPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehiclePoseCorrector_orientationCorrection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehiclePoseCorrector_orientationCorrection_feature", "_UI_VehiclePoseCorrector_type"),
				 Symphony__AddonsVehiclePackage.Literals.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_CORRECTION_INFOPropertyCategory"),
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
			childrenFeatures.add(Symphony__AddonsVehiclePackage.Literals.VEHICLE_POSE_CORRECTOR__MESHES);
			childrenFeatures.add(Symphony__AddonsVehiclePackage.Literals.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER);
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
	 * This returns VehiclePoseCorrector.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VehiclePoseCorrector"));
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
	  VehiclePoseCorrector vehiclePoseCorrector = (VehiclePoseCorrector)object;    
    	  	  
	  String label = getString("_UI_VehiclePoseCorrector_type");
	  if(vehiclePoseCorrector.isEnabled())
	  {
		  if(vehiclePoseCorrector.isInitializing())
		  {
			  label += " (Initializing...)";
		  }
		  else
		  {
			  label += " (Enabled)";
			  
			  if(vehiclePoseCorrector.getZCorrectionMode() != ZCorrectionMode.NO_ZCORRECTION)
			  {
				  label += " " + DELTA_CHARACTER + "z : " + zCorrectionDecimalForm.format(vehiclePoseCorrector.getZCorrection());
			  }
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

		switch (notification.getFeatureID(VehiclePoseCorrector.class)) {
			case Symphony__AddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__INITIALIZING:
			case Symphony__AddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_BODIES:
			case Symphony__AddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ZCORRECTION_MODE:
			case Symphony__AddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ZCORRECTION:
			case Symphony__AddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION_MODE:
			case Symphony__AddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Symphony__AddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__MESHES:
			case Symphony__AddonsVehiclePackage.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER:
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
				(Symphony__AddonsVehiclePackage.Literals.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER,
				 Symphony__AddonsVehicleFactory.eINSTANCE.createWheelContactProvider()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__AddonsVehiclePackage.Literals.VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER,
				 Symphony__AddonsVehicleFactory.eINSTANCE.createLanderSphericalFootContactProvider()));
	}

}
