/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.symphony.tools.camera.AbstractTextOverlay;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.tools.camera.AbstractTextOverlay} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractTextOverlayItemProvider
  extends DrawnCameraOverlayItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractTextOverlayItemProvider(AdapterFactory adapterFactory)
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

			addFontNamePropertyDescriptor(object);
			addFontSizePropertyDescriptor(object);
			addHorizontalOffsetPropertyDescriptor(object);
			addVerticalOffsetPropertyDescriptor(object);
			addTextColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Font Name feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addFontNamePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTextOverlay_fontName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTextOverlay_fontName_feature", "_UI_AbstractTextOverlay_type"),
				 SymphonyCameraToolsPackage.Literals.ABSTRACT_TEXT_OVERLAY__FONT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_FONT_PROPERTIESPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Font Size feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addFontSizePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTextOverlay_fontSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTextOverlay_fontSize_feature", "_UI_AbstractTextOverlay_type"),
				 SymphonyCameraToolsPackage.Literals.ABSTRACT_TEXT_OVERLAY__FONT_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_FONT_PROPERTIESPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Horizontal Offset feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addHorizontalOffsetPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTextOverlay_horizontalOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTextOverlay_horizontalOffset_feature", "_UI_AbstractTextOverlay_type"),
				 SymphonyCameraToolsPackage.Literals.ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_OVERLAY_POSITION_PROPERTIESPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Vertical Offset feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addVerticalOffsetPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTextOverlay_verticalOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTextOverlay_verticalOffset_feature", "_UI_AbstractTextOverlay_type"),
				 SymphonyCameraToolsPackage.Literals.ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_OVERLAY_POSITION_PROPERTIESPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Text Color feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addTextColorPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractTextOverlay_textColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractTextOverlay_textColor_feature", "_UI_AbstractTextOverlay_type"),
				 SymphonyCameraToolsPackage.Literals.ABSTRACT_TEXT_OVERLAY__TEXT_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_FONT_PROPERTIESPropertyCategory"),
				 null));
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
		String label = ((AbstractTextOverlay)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractTextOverlay_type") :
			getString("_UI_AbstractTextOverlay_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractTextOverlay.class)) {
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__FONT_NAME:
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__FONT_SIZE:
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET:
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET:
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__TEXT_COLOR:
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
  
  /**
   * Return the suffix to be added to the object text. 
   * @param object The object to display.
   * @param uiTypeString The ID of the string used to find the display string in the plugin.properties.
   * @generated_NOT
   */
  protected String getAbstractTextOverlayText(Object object, String uiTypeString)
  {
	  AbstractTextOverlay abstractTextOverlay = (AbstractTextOverlay) object;	  
	
	  String label = abstractTextOverlay.getName();
	    
	  if(label == null || label.length() == 0)
	  {
		  label = getString(uiTypeString);
	  }	  
	  	  
	  if(abstractTextOverlay.isVisible())
	  {
		  label += " (visible)"; 
	  }	  	  
	  return label;
  }

}
