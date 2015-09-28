/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.provider;


import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ParabolicInputConditioning;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ParabolicInputConditioning} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParabolicInputConditioningItemProvider
  extends AbstractInputConditioningItemProvider
{
	private DecimalFormat decimalFormat = new DecimalFormat("0.000");
	
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ParabolicInputConditioningItemProvider(AdapterFactory adapterFactory)
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

			addMinimumPropertyDescriptor(object);
			addMaximumPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Minimum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParabolicInputConditioning_minimum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParabolicInputConditioning_minimum_feature", "_UI_ParabolicInputConditioning_type"),
				 EMFEcoreControllersPackage.Literals.PARABOLIC_INPUT_CONDITIONING__MINIMUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Maximum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParabolicInputConditioning_maximum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParabolicInputConditioning_maximum_feature", "_UI_ParabolicInputConditioning_type"),
				 EMFEcoreControllersPackage.Literals.PARABOLIC_INPUT_CONDITIONING__MAXIMUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This returns ParabolicInputConditioning.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ParabolicInputConditioning"));
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
    ParabolicInputConditioning parabolicInputScalling = (ParabolicInputConditioning)object;
        
    String label =  getString("_UI_ParabolicInputScalling_type");
    	
	label += " (min " + decimalFormat.format(parabolicInputScalling.getMinimum());
	label += " , max " + decimalFormat.format(parabolicInputScalling.getMaximum()) + ")";
      
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

		switch (notification.getFeatureID(ParabolicInputConditioning.class)) {
			case EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING__MINIMUM:
			case EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING__MAXIMUM:
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
