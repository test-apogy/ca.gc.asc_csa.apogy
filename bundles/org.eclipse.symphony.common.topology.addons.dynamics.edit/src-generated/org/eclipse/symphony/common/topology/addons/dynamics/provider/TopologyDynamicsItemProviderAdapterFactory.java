/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.symphony.common.topology.AggregateContentNode;
import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.ContentNode;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.TopologyPackage;

import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsFactory;
import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage;

import org.eclipse.symphony.common.topology.addons.dynamics.util.TopologyDynamicsAdapterFactory;

import org.eclipse.symphony.common.topology.util.TopologySwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyDynamicsItemProviderAdapterFactory extends TopologyDynamicsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(TopologyDynamicsEditPlugin.INSTANCE, TopologyDynamicsPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyDynamicsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.DynamicSystemProperties} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicSystemPropertiesItemProvider dynamicSystemPropertiesItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.DynamicSystemProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDynamicSystemPropertiesAdapter() {
		if (dynamicSystemPropertiesItemProvider == null) {
			dynamicSystemPropertiesItemProvider = new DynamicSystemPropertiesItemProvider(this);
		}

		return dynamicSystemPropertiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalBodyItemProvider physicalBodyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPhysicalBodyAdapter() {
		if (physicalBodyItemProvider == null) {
			physicalBodyItemProvider = new PhysicalBodyItemProvider(this);
		}

		return physicalBodyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.PhysicalProperties} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalPropertiesItemProvider physicalPropertiesItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.PhysicalProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPhysicalPropertiesAdapter() {
		if (physicalPropertiesItemProvider == null) {
			physicalPropertiesItemProvider = new PhysicalPropertiesItemProvider(this);
		}

		return physicalPropertiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.PointOfInterest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointOfInterestItemProvider pointOfInterestItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.PointOfInterest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPointOfInterestAdapter() {
		if (pointOfInterestItemProvider == null) {
			pointOfInterestItemProvider = new PointOfInterestItemProvider(this);
		}

		return pointOfInterestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.KinematicState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KinematicStateItemProvider kinematicStateItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.KinematicState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKinematicStateAdapter() {
		if (kinematicStateItemProvider == null) {
			kinematicStateItemProvider = new KinematicStateItemProvider(this);
		}

		return kinematicStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintStateItemProvider constraintStateItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintStateAdapter() {
		if (constraintStateItemProvider == null) {
			constraintStateItemProvider = new ConstraintStateItemProvider(this);
		}

		return constraintStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.CylindricalConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CylindricalConstraintItemProvider cylindricalConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.CylindricalConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCylindricalConstraintAdapter() {
		if (cylindricalConstraintItemProvider == null) {
			cylindricalConstraintItemProvider = new CylindricalConstraintItemProvider(this);
		}

		return cylindricalConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.GearRatioConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GearRatioConstraintItemProvider gearRatioConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.GearRatioConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGearRatioConstraintAdapter() {
		if (gearRatioConstraintItemProvider == null) {
			gearRatioConstraintItemProvider = new GearRatioConstraintItemProvider(this);
		}

		return gearRatioConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.HingeConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HingeConstraintItemProvider hingeConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.HingeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHingeConstraintAdapter() {
		if (hingeConstraintItemProvider == null) {
			hingeConstraintItemProvider = new HingeConstraintItemProvider(this);
		}

		return hingeConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.PrismaticConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrismaticConstraintItemProvider prismaticConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.PrismaticConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrismaticConstraintAdapter() {
		if (prismaticConstraintItemProvider == null) {
			prismaticConstraintItemProvider = new PrismaticConstraintItemProvider(this);
		}

		return prismaticConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.RPROConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPROConstraintItemProvider rproConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.RPROConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRPROConstraintAdapter() {
		if (rproConstraintItemProvider == null) {
			rproConstraintItemProvider = new RPROConstraintItemProvider(this);
		}

		return rproConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversalConstraintItemProvider universalConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUniversalConstraintAdapter() {
		if (universalConstraintItemProvider == null) {
			universalConstraintItemProvider = new UniversalConstraintItemProvider(this);
		}

		return universalConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.ConstraintAttachmentPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintAttachmentPointItemProvider constraintAttachmentPointItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.ConstraintAttachmentPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintAttachmentPointAdapter() {
		if (constraintAttachmentPointItemProvider == null) {
			constraintAttachmentPointItemProvider = new ConstraintAttachmentPointItemProvider(this);
		}

		return constraintAttachmentPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollisionGeometryItemProvider collisionGeometryItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCollisionGeometryAdapter() {
		if (collisionGeometryItemProvider == null) {
			collisionGeometryItemProvider = new CollisionGeometryItemProvider(this);
		}

		return collisionGeometryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.BoxGeometry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoxGeometryItemProvider boxGeometryItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.BoxGeometry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoxGeometryAdapter() {
		if (boxGeometryItemProvider == null) {
			boxGeometryItemProvider = new BoxGeometryItemProvider(this);
		}

		return boxGeometryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.CapsuleGeometry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapsuleGeometryItemProvider capsuleGeometryItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.CapsuleGeometry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapsuleGeometryAdapter() {
		if (capsuleGeometryItemProvider == null) {
			capsuleGeometryItemProvider = new CapsuleGeometryItemProvider(this);
		}

		return capsuleGeometryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.CylinderGeometry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CylinderGeometryItemProvider cylinderGeometryItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.CylinderGeometry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCylinderGeometryAdapter() {
		if (cylinderGeometryItemProvider == null) {
			cylinderGeometryItemProvider = new CylinderGeometryItemProvider(this);
		}

		return cylinderGeometryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.SphereGeometry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SphereGeometryItemProvider sphereGeometryItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.SphereGeometry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSphereGeometryAdapter() {
		if (sphereGeometryItemProvider == null) {
			sphereGeometryItemProvider = new SphereGeometryItemProvider(this);
		}

		return sphereGeometryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.symphony.common.topology.addons.dynamics.DynamicsFacade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicsFacadeItemProvider dynamicsFacadeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.symphony.common.topology.addons.dynamics.DynamicsFacade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDynamicsFacadeAdapter() {
		if (dynamicsFacadeItemProvider == null) {
			dynamicsFacadeItemProvider = new DynamicsFacadeItemProvider(this);
		}

		return dynamicsFacadeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (dynamicSystemPropertiesItemProvider != null) dynamicSystemPropertiesItemProvider.dispose();
		if (physicalBodyItemProvider != null) physicalBodyItemProvider.dispose();
		if (physicalPropertiesItemProvider != null) physicalPropertiesItemProvider.dispose();
		if (pointOfInterestItemProvider != null) pointOfInterestItemProvider.dispose();
		if (kinematicStateItemProvider != null) kinematicStateItemProvider.dispose();
		if (constraintStateItemProvider != null) constraintStateItemProvider.dispose();
		if (cylindricalConstraintItemProvider != null) cylindricalConstraintItemProvider.dispose();
		if (gearRatioConstraintItemProvider != null) gearRatioConstraintItemProvider.dispose();
		if (hingeConstraintItemProvider != null) hingeConstraintItemProvider.dispose();
		if (prismaticConstraintItemProvider != null) prismaticConstraintItemProvider.dispose();
		if (rproConstraintItemProvider != null) rproConstraintItemProvider.dispose();
		if (universalConstraintItemProvider != null) universalConstraintItemProvider.dispose();
		if (constraintAttachmentPointItemProvider != null) constraintAttachmentPointItemProvider.dispose();
		if (collisionGeometryItemProvider != null) collisionGeometryItemProvider.dispose();
		if (boxGeometryItemProvider != null) boxGeometryItemProvider.dispose();
		if (capsuleGeometryItemProvider != null) capsuleGeometryItemProvider.dispose();
		if (cylinderGeometryItemProvider != null) cylinderGeometryItemProvider.dispose();
		if (sphereGeometryItemProvider != null) sphereGeometryItemProvider.dispose();
		if (dynamicsFacadeItemProvider != null) dynamicsFacadeItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link TopologyPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class TopologyChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends TopologySwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public <T> Object caseContentNode(ContentNode<T> object) {
				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createDynamicSystemProperties()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createPhysicalBody()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createPhysicalProperties()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createPointOfInterest()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createKinematicState()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createConstraintState()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createCylindricalConstraint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createGearRatioConstraint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createHingeConstraint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createPrismaticConstraint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createRPROConstraint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createUniversalConstraint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createConstraintAttachmentPoint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createCollisionGeometry()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createBoxGeometry()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createCapsuleGeometry()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createCylinderGeometry()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createSphereGeometry()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createDynamicsFacade()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public <T> Object caseAggregateContentNode(AggregateContentNode<T> object) {
				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createDynamicSystemProperties()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createPhysicalBody()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createPhysicalProperties()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createPointOfInterest()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createKinematicState()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createConstraintState()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createCylindricalConstraint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createGearRatioConstraint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createHingeConstraint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createPrismaticConstraint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createRPROConstraint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createUniversalConstraint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createConstraintAttachmentPoint()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createCollisionGeometry()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createBoxGeometry()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createCapsuleGeometry()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createCylinderGeometry()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createSphereGeometry()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 TopologyDynamicsFactory.eINSTANCE.createDynamicsFacade()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseGroupNode(GroupNode object) {
				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 TopologyDynamicsFactory.eINSTANCE.createDynamicSystemProperties()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.GROUP_NODE__CHILDREN,
						 TopologyDynamicsFactory.eINSTANCE.createPhysicalBody()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseAggregateGroupNode(AggregateGroupNode object) {
				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 TopologyDynamicsFactory.eINSTANCE.createDynamicSystemProperties()));

				newChildDescriptors.add
					(createChildParameter
						(TopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN,
						 TopologyDynamicsFactory.eINSTANCE.createPhysicalBody()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return TopologyDynamicsEditPlugin.INSTANCE;
		}
	}

}
