/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.vehicle.provider;


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
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFactory;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersFactory;
import ca.gc.asc_csa.apogy.addons.provider.AbstractTwoPoints3DToolItemProvider;
import ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PathPlannerToolItemProvider extends AbstractTwoPoints3DToolItemProvider 
{
	protected DecimalFormat decimalFormat = new DecimalFormat("0.00");
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPlannerToolItemProvider(AdapterFactory adapterFactory) {
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

			addBusyPropertyDescriptor(object);
			addAutoPathPlanEnabledPropertyDescriptor(object);
			addMeshLayerPropertyDescriptor(object);
			addPlannedPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Busy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PathPlannerTool_busy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PathPlannerTool_busy_feature", "_UI_PathPlannerTool_type"),
				 ApogyAddonsVehiclePackage.Literals.PATH_PLANNER_TOOL__BUSY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Path Plan Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoPathPlanEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PathPlannerTool_autoPathPlanEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PathPlannerTool_autoPathPlanEnabled_feature", "_UI_PathPlannerTool_type"),
				 ApogyAddonsVehiclePackage.Literals.PATH_PLANNER_TOOL__AUTO_PATH_PLAN_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mesh Layer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeshLayerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PathPlannerTool_meshLayer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PathPlannerTool_meshLayer_feature", "_UI_PathPlannerTool_type"),
				 ApogyAddonsVehiclePackage.Literals.PATH_PLANNER_TOOL__MESH_LAYER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Planned Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlannedPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PathPlannerTool_plannedPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PathPlannerTool_plannedPath_feature", "_UI_PathPlannerTool_type"),
				 ApogyAddonsVehiclePackage.Literals.PATH_PLANNER_TOOL__PLANNED_PATH,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyAddonsVehiclePackage.Literals.PATH_PLANNER_TOOL__PATH_PLANNER);
			childrenFeatures.add(ApogyAddonsVehiclePackage.Literals.PATH_PLANNER_TOOL__PLANNED_PATH);
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
	 * This returns PathPlannerTool.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PathPlannerTool"));
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
		PathPlannerTool pathPlannerTool = (PathPlannerTool) object;
		
		String label = null;
		
		if(pathPlannerTool.getName() != null && pathPlannerTool.getName().length() > 0)
		{
			label = pathPlannerTool.getName();
		}
		else
		{
			label = getString("_UI_PathPlannerTool_type");
		}
		
		// Adds Simple3DTool Text.
		label += " (";
		String simpleToolText = getSimple3DToolText(pathPlannerTool);
		if(simpleToolText.length() > 0)
		{
			label += simpleToolText + ", ";
		}	
		
		// Adds lock Status.
		String lockText = getAbstractTwoPoints3DToolText(pathPlannerTool); 
		if(lockText.length() > 0)
		{
			label += ", " + lockText;
		}
				
		// Adds busy indicator
		if(pathPlannerTool.isBusy())
		{
			label += "BUSY , ";
		}
		
		if(pathPlannerTool.getPlannedPath() != null)
		{
			String distanceText = decimalFormat.format(pathPlannerTool.getPlannedPath().getLength()) + " m";
			label += distanceText;
		}
		else
		{
			label += "0.0 m";
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

		switch (notification.getFeatureID(PathPlannerTool.class)) {
			case ApogyAddonsVehiclePackage.PATH_PLANNER_TOOL__BUSY:
			case ApogyAddonsVehiclePackage.PATH_PLANNER_TOOL__AUTO_PATH_PLAN_ENABLED:
			case ApogyAddonsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyAddonsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER:
			case ApogyAddonsVehiclePackage.PATH_PLANNER_TOOL__PLANNED_PATH:
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
				(ApogyAddonsVehiclePackage.Literals.PATH_PLANNER_TOOL__PATH_PLANNER,
				 ApogyAddonsMobilityPathplannersFactory.eINSTANCE.createMeshWayPointPathPlanner()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyAddonsVehiclePackage.Literals.PATH_PLANNER_TOOL__PLANNED_PATH,
				 ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath()));
	}

}
