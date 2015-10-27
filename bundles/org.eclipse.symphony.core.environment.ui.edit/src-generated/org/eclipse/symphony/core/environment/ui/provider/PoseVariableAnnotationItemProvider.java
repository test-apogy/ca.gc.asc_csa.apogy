/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation;
import org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PoseVariableAnnotationItemProvider
  extends AbstractVariableAnnotationItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PoseVariableAnnotationItemProvider(AdapterFactory adapterFactory)
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

			addVectorlengthPropertyDescriptor(object);
			addVectorColorPropertyDescriptor(object);
			addShowPosePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Vectorlength feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addVectorlengthPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PoseVariableAnnotation_vectorlength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PoseVariableAnnotation_vectorlength_feature", "_UI_PoseVariableAnnotation_type"),
				 Symphony__CoreEnvironmentUIPackage.Literals.POSE_VARIABLE_ANNOTATION__VECTORLENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VECTOR_PROPERTIESPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Vector Color feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addVectorColorPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PoseVariableAnnotation_vectorColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PoseVariableAnnotation_vectorColor_feature", "_UI_PoseVariableAnnotation_type"),
				 Symphony__CoreEnvironmentUIPackage.Literals.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_VECTOR_PROPERTIESPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Show Pose feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addShowPosePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PoseVariableAnnotation_showPose_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PoseVariableAnnotation_showPose_feature", "_UI_PoseVariableAnnotation_type"),
				 Symphony__CoreEnvironmentUIPackage.Literals.POSE_VARIABLE_ANNOTATION__SHOW_POSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This returns PoseVariableAnnotation.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PoseVariableAnnotation"));
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
	  PoseVariableAnnotation poseVariableAnnotation = (PoseVariableAnnotation)object;	  
	  String label = getString("_UI_PoseVariableAnnotation_type");	  
	  label += " " + getMapViewItemPresentationText(poseVariableAnnotation);	  
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

		switch (notification.getFeatureID(PoseVariableAnnotation.class)) {
			case Symphony__CoreEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTORLENGTH:
			case Symphony__CoreEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR:
			case Symphony__CoreEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SHOW_POSE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
