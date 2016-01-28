/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.provider;


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
import ca.gc.asc_csa.apogy.addons.Ruler3DTool;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.Ruler3DTool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Ruler3DToolItemProvider extends AbstractTwoPoints3DToolItemProvider 
{
	private DecimalFormat lengthFormat = new DecimalFormat("0.000");
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruler3DToolItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRulerColorPropertyDescriptor(object);
			addExtremitiesRadiusPropertyDescriptor(object);
			addMinorTickColorPropertyDescriptor(object);
			addMinorTickSpacingPropertyDescriptor(object);
			addMinorTickLengthPropertyDescriptor(object);
			addMajorTickColorPropertyDescriptor(object);
			addMajorTickSpacingPropertyDescriptor(object);
			addMajorTickLengthPropertyDescriptor(object);
			addRuler3dToolNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ruler3d Tool Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuler3dToolNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ruler3DTool_ruler3dToolNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ruler3DTool_ruler3dToolNode_feature", "_UI_Ruler3DTool_type"),
				 ApogyAddonsPackage.Literals.RULER3_DTOOL__RULER3D_TOOL_NODE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_RULER_PROPERTIESPropertyCategory"),
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyAddonsPackage.Literals.RULER3_DTOOL__RULER3D_TOOL_NODE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This adds a property descriptor for the Ruler Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRulerColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ruler3DTool_rulerColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ruler3DTool_rulerColor_feature", "_UI_Ruler3DTool_type"),
				 ApogyAddonsPackage.Literals.RULER3_DTOOL__RULER_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_RULER_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Extremities Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addExtremitiesRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ruler3DTool_extremitiesRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ruler3DTool_extremitiesRadius_feature", "_UI_Ruler3DTool_type"),
				 ApogyAddonsPackage.Literals.RULER3_DTOOL__EXTREMITIES_RADIUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_RULER_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Minor Tick Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinorTickColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ruler3DTool_minorTickColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ruler3DTool_minorTickColor_feature", "_UI_Ruler3DTool_type"),
				 ApogyAddonsPackage.Literals.RULER3_DTOOL__MINOR_TICK_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_MINOR_TICKS_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Minor Tick Spacing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMinorTickSpacingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ruler3DTool_minorTickSpacing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ruler3DTool_minorTickSpacing_feature", "_UI_Ruler3DTool_type"),
				 ApogyAddonsPackage.Literals.RULER3_DTOOL__MINOR_TICK_SPACING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_MINOR_TICKS_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Minor Tick Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMinorTickLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ruler3DTool_minorTickLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ruler3DTool_minorTickLength_feature", "_UI_Ruler3DTool_type"),
				 ApogyAddonsPackage.Literals.RULER3_DTOOL__MINOR_TICK_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_MINOR_TICKS_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Major Tick Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMajorTickColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ruler3DTool_majorTickColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ruler3DTool_majorTickColor_feature", "_UI_Ruler3DTool_type"),
				 ApogyAddonsPackage.Literals.RULER3_DTOOL__MAJOR_TICK_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_MAJOR_TICKS_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Major Tick Spacing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMajorTickSpacingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ruler3DTool_majorTickSpacing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ruler3DTool_majorTickSpacing_feature", "_UI_Ruler3DTool_type"),
				 ApogyAddonsPackage.Literals.RULER3_DTOOL__MAJOR_TICK_SPACING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_MAJOR_TICKS_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Major Tick Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMajorTickLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ruler3DTool_majorTickLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ruler3DTool_majorTickLength_feature", "_UI_Ruler3DTool_type"),
				 ApogyAddonsPackage.Literals.RULER3_DTOOL__MAJOR_TICK_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_MAJOR_TICKS_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This returns Ruler3DTool.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Ruler3DTool"));
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
		Ruler3DTool ruler3DTool = (Ruler3DTool) object;
		
		String label = null;		
		if(ruler3DTool.getName() != null && ruler3DTool.getName().length() > 0)
		{
			label = ruler3DTool.getName();
		}
		else
		{
			label = getString("_UI_Ruler3DTool_type");
		}
		
		label += " (";
		String simpleToolText = getSimple3DToolText(ruler3DTool);
		if(simpleToolText.length() > 0)
		{
			label += simpleToolText + ", ";
		}		
				
		label += lengthFormat.format(ruler3DTool.getDistance()) + " m ";
		
		// Adds lock Status.
		String lockText = getAbstractTwoPoints3DToolText(ruler3DTool); 
		if(lockText.length() > 0)
		{
			label += ", " + lockText;
		}
			
		label += ")";
		
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
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Ruler3DTool.class)) {
			case ApogyAddonsPackage.RULER3_DTOOL__RULER_COLOR:
			case ApogyAddonsPackage.RULER3_DTOOL__EXTREMITIES_RADIUS:
			case ApogyAddonsPackage.RULER3_DTOOL__MINOR_TICK_COLOR:
			case ApogyAddonsPackage.RULER3_DTOOL__MINOR_TICK_SPACING:
			case ApogyAddonsPackage.RULER3_DTOOL__MINOR_TICK_LENGTH:
			case ApogyAddonsPackage.RULER3_DTOOL__MAJOR_TICK_COLOR:
			case ApogyAddonsPackage.RULER3_DTOOL__MAJOR_TICK_SPACING:
			case ApogyAddonsPackage.RULER3_DTOOL__MAJOR_TICK_LENGTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyAddonsPackage.RULER3_DTOOL__RULER3D_TOOL_NODE:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
