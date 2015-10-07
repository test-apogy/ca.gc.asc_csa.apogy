/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.provider;


import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.environment.EarthSky;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksite;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentFactory;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors.AbstractUnitItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EarthSurfaceWorksiteItemProvider
  extends SurfaceWorksiteItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EarthSurfaceWorksiteItemProvider(AdapterFactory adapterFactory)
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

			addXAxisAzimuthPropertyDescriptor(object);
			addEarthSkyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
   * This adds a property descriptor for the XAxis Azimuth feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected void addXAxisAzimuthPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (new AbstractUnitItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EarthSurfaceWorksite_xAxisAzimuth_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_EarthSurfaceWorksite_xAxisAzimuth_feature", "_UI_EarthSurfaceWorksite_type"),
         SymphonyEnvironmentPackage.Literals.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH,
         true,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
	 * This adds a property descriptor for the Earth Sky feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addEarthSkyPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthSurfaceWorksite_earthSky_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthSurfaceWorksite_earthSky_feature", "_UI_EarthSurfaceWorksite_type"),
				 SymphonyEnvironmentPackage.Literals.EARTH_SURFACE_WORKSITE__EARTH_SKY,
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
			childrenFeatures.add(SymphonyEnvironmentPackage.Literals.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES);
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
	 * This returns EarthSurfaceWorksite.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EarthSurfaceWorksite"));
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
    String label = ((EarthSurfaceWorksite)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_EarthSurfaceWorksite_type") :
      label;
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

		switch (notification.getFeatureID(EarthSurfaceWorksite.class)) {
			case SymphonyEnvironmentPackage.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SymphonyEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES:
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
				(SymphonyEnvironmentPackage.Literals.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES,
				 SymphonyEnvironmentFactory.eINSTANCE.createGeographicCoordinates()));
	}

  @Override
  protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) 
  {
	  /** Execute default set operation. */
	  CompoundCommand compoundCommand = new CompoundCommand();
	  compoundCommand.append(super.createSetCommand(domain, owner, feature, value, index));
	  
	  if(feature.getFeatureID() == SymphonyEnvironmentPackage.EARTH_SURFACE_WORKSITE__SKY)
	  {		  
		  if(value instanceof EarthSky)
		  {
			  EarthSky earthSky = (EarthSky) value;
			  
			  // If the time of the sky is not set, set it to the current time.
			  if(earthSky.getTime() == null)
			  {
				  Date now = new Date();				  
				  compoundCommand.append(new SetCommand(domain, (EObject) value, EMFEcorePackage.Literals.TIMED__TIME, now));
			  }
		  }
	  }
	  
	  return compoundCommand;
  }
}
