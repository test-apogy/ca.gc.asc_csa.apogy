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
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.Trajectory3DTool;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFactory;
import ca.gc.asc_csa.apogy.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Trajectory3DToolItemProvider extends Simple3DToolItemProvider 
{
	private DecimalFormat decimalFormat = new DecimalFormat("0.00");
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory3DToolItemProvider(AdapterFactory adapterFactory) {
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

			addPenDownPropertyDescriptor(object);
			addVariablePropertyDescriptor(object);
			addDistanceThresholdPropertyDescriptor(object);
			addTotalDistancePropertyDescriptor(object);
			addPoseProviderPropertyDescriptor(object);
			addTrajectory3DToolNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pen Down feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPenDownPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trajectory3DTool_penDown_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trajectory3DTool_penDown_feature", "_UI_Trajectory3DTool_type"),
				 ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__PEN_DOWN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_TRAJECTORY_3D_TOOLPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trajectory3DTool_variable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trajectory3DTool_variable_feature", "_UI_Trajectory3DTool_type"),
				 ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_TRAJECTORY_3D_TOOLPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Distance Threshold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addDistanceThresholdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trajectory3DTool_distanceThreshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trajectory3DTool_distanceThreshold_feature", "_UI_Trajectory3DTool_type"),
				 ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_TRAJECTORY_3D_TOOLPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addTotalDistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trajectory3DTool_totalDistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trajectory3DTool_totalDistance_feature", "_UI_Trajectory3DTool_type"),
				 ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__TOTAL_DISTANCE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_TRAJECTORY_3D_TOOLPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Pose Provider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPoseProviderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trajectory3DTool_poseProvider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trajectory3DTool_poseProvider_feature", "_UI_Trajectory3DTool_type"),
				 ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__POSE_PROVIDER,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_TRAJECTORY_3D_TOOLPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Trajectory3 DTool Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrajectory3DToolNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trajectory3DTool_trajectory3DToolNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trajectory3DTool_trajectory3DToolNode_feature", "_UI_Trajectory3DTool_type"),
				 ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_TRAJECTORY_3D_TOOLPropertyCategory"),
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
			childrenFeatures.add(ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__PATHS);
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
	 * This returns Trajectory3DTool.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Trajectory3DTool"));
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
		Trajectory3DTool trajectory3DTool = (Trajectory3DTool) object;
		String label = null;
		
		if(trajectory3DTool.getName() != null && trajectory3DTool.getName().length() > 0)
		{
			label = trajectory3DTool.getName();
		}
		else
		{
			label = getString("_UI_Trajectory3DTool_type");
		}
		
		// Adds Simple3DTool Text.
		label += " (";
		String simpleToolText = getSimple3DToolText(trajectory3DTool);
		if(simpleToolText.length() > 0)
		{
			label += simpleToolText + ", ";
		}	
				
		if(trajectory3DTool.isPenDown())
		{
			label += "Pen Down";
		}		
		else
		{
			label += "Pen Up";
		}
		
		String distanceText = decimalFormat.format(trajectory3DTool.getTotalDistance());
		label += ", " + distanceText;
		
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

		switch (notification.getFeatureID(Trajectory3DTool.class)) {
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__PEN_DOWN:
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD:
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__TOTAL_DISTANCE:
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__POSE_PROVIDER:
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__PATHS:
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

		newChildDescriptors.add
			(createChildParameter
				(ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__PATHS,
				 ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath()));
	}

}
