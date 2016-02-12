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
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.TrajectoryPickingTool;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFactory;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.TrajectoryPickingTool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TrajectoryPickingToolItemProvider extends Simple3DToolItemProvider 
{
	private DecimalFormat decimalFormat = new DecimalFormat("0.00");
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrajectoryPickingToolItemProvider(AdapterFactory adapterFactory) {
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

			addActivePathPropertyDescriptor(object);
			addTrajectoryPickingToolNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Active Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TrajectoryPickingTool_activePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TrajectoryPickingTool_activePath_feature", "_UI_TrajectoryPickingTool_type"),
				 ApogyAddonsPackage.Literals.TRAJECTORY_PICKING_TOOL__ACTIVE_PATH,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_TRAJECTORY_PICKING_TOOLPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Trajectory Picking Tool Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrajectoryPickingToolNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TrajectoryPickingTool_trajectoryPickingToolNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TrajectoryPickingTool_trajectoryPickingToolNode_feature", "_UI_TrajectoryPickingTool_type"),
				 ApogyAddonsPackage.Literals.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_TRAJECTORY_PICKING_TOOLPropertyCategory"),
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
			childrenFeatures.add(ApogyAddonsPackage.Literals.TRAJECTORY_PICKING_TOOL__PATHS);
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
	 * This returns TrajectoryPickingTool.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TrajectoryPickingTool"));
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
		TrajectoryPickingTool trajectoryPickingTool = (TrajectoryPickingTool) object;
		String label = null;
		
		if(trajectoryPickingTool.getName() != null && trajectoryPickingTool.getName().length() > 0)
		{
			label = trajectoryPickingTool.getName();
		}
		else
		{
			label = getString("_UI_TrajectoryPickingTool_type");
		}
		
		// Adds Simple3DTool Text.
		label += " (";
		String simpleToolText = getSimple3DToolText(trajectoryPickingTool);
		if(simpleToolText.length() > 0)
		{
			label += simpleToolText + ", ";
		}	
		
		if(trajectoryPickingTool.getActivePath() != null)
		{
			String distanceText = decimalFormat.format(trajectoryPickingTool.getActivePath().getLength()) + " m";
			label += distanceText;
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

		switch (notification.getFeatureID(TrajectoryPickingTool.class)) {
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__ACTIVE_PATH:
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__PATHS:
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
				(ApogyAddonsPackage.Literals.TRAJECTORY_PICKING_TOOL__PATHS,
				 ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath()));
	}

}
