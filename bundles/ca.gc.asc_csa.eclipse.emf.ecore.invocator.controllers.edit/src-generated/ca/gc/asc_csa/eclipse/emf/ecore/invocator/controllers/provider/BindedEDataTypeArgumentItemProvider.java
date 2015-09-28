/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.provider.ArgumentItemProvider;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.BindedEDataTypeArgument} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BindedEDataTypeArgumentItemProvider
  extends ArgumentItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BindedEDataTypeArgumentItemProvider(AdapterFactory adapterFactory)
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
			childrenFeatures.add(EMFEcoreControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE);
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
	 * This returns BindedEDataTypeArgument.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BindedEDataTypeArgument"));
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
	  BindedEDataTypeArgument argument = (BindedEDataTypeArgument) object;
	  String label = super.getText(object);	 
	  
	  label  += " (" + argument.getParameterValue() + ")";
	  	  	  
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

		switch (notification.getFeatureID(BindedEDataTypeArgument.class)) {
			case EMFEcoreControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE:
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
   * @generated_NOT
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    BindedEDataTypeArgument arg = (BindedEDataTypeArgument) object;
    
    newChildDescriptors.add
      (createChildParameter
        (EMFEcoreControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE,
         EMFEcoreControllersFactory.eINSTANCE.createFixedValueSource()));

    // Check if the argument is boolean.
    if(arg.getEParameter().getEType().getInstanceClass().isAssignableFrom(boolean.class))
    {
	    newChildDescriptors.add
	      (createChildParameter
	        (EMFEcoreControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE,
	         EMFEcoreControllersFactory.eINSTANCE.createToggleValueSource()));
    }
    
    newChildDescriptors.add
      (createChildParameter
        (EMFEcoreControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE,
         EMFEcoreControllersFactory.eINSTANCE.createControllerValueSource()));
  }
  
}
