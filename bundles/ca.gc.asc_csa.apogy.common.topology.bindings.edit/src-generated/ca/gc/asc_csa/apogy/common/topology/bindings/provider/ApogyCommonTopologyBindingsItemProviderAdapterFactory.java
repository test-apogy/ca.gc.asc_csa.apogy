package ca.gc.asc_csa.apogy.common.topology.bindings.provider;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
import ca.gc.asc_csa.apogy.common.topology.AggregateContentNode;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFactory;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;
import ca.gc.asc_csa.apogy.common.topology.bindings.util.ApogyCommonTopologyBindingsAdapterFactory;
import ca.gc.asc_csa.apogy.common.topology.util.ApogyCommonTopologySwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonTopologyBindingsItemProviderAdapterFactory extends ApogyCommonTopologyBindingsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(ApogyCommonTopologyBindingsEditPlugin.INSTANCE, ApogyCommonTopologyBindingsPackage.eNS_URI);

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
	public ApogyCommonTopologyBindingsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotationBindingItemProvider rotationBindingItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRotationBindingAdapter() {
		if (rotationBindingItemProvider == null) {
			rotationBindingItemProvider = new RotationBindingItemProvider(this);
		}

		return rotationBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranslationBindingItemProvider translationBindingItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTranslationBindingAdapter() {
		if (translationBindingItemProvider == null) {
			translationBindingItemProvider = new TranslationBindingItemProvider(this);
		}

		return translationBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TransformMatrixBindingItemProvider transformMatrixBindingItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createTransformMatrixBindingAdapter()
  {
		if (transformMatrixBindingItemProvider == null) {
			transformMatrixBindingItemProvider = new TransformMatrixBindingItemProvider(this);
		}

		return transformMatrixBindingItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanBindingItemProvider booleanBindingItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanBindingAdapter() {
		if (booleanBindingItemProvider == null) {
			booleanBindingItemProvider = new BooleanBindingItemProvider(this);
		}

		return booleanBindingItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.common.topology.bindings.TrueBooleanCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrueBooleanCaseItemProvider trueBooleanCaseItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.common.topology.bindings.TrueBooleanCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrueBooleanCaseAdapter() {
		if (trueBooleanCaseItemProvider == null) {
			trueBooleanCaseItemProvider = new TrueBooleanCaseItemProvider(this);
		}

		return trueBooleanCaseItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.common.topology.bindings.FalseBooleanCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FalseBooleanCaseItemProvider falseBooleanCaseItemProvider;

		/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.common.topology.bindings.FalseBooleanCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFalseBooleanCaseAdapter() {
		if (falseBooleanCaseItemProvider == null) {
			falseBooleanCaseItemProvider = new FalseBooleanCaseItemProvider(this);
		}

		return falseBooleanCaseItemProvider;
	}

		/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EnumerationSwitchBindingItemProvider enumerationSwitchBindingItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createEnumerationSwitchBindingAdapter()
  {
		if (enumerationSwitchBindingItemProvider == null) {
			enumerationSwitchBindingItemProvider = new EnumerationSwitchBindingItemProvider(this);
		}

		return enumerationSwitchBindingItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EnumerationCaseItemProvider enumerationCaseItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createEnumerationCaseAdapter()
  {
		if (enumerationCaseItemProvider == null) {
			enumerationCaseItemProvider = new EnumerationCaseItemProvider(this);
		}

		return enumerationCaseItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BindingsListItemProvider bindingsListItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createBindingsListAdapter()
  {
		if (bindingsListItemProvider == null) {
			bindingsListItemProvider = new BindingsListItemProvider(this);
		}

		return bindingsListItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FeatureRootsListItemProvider featureRootsListItemProvider;

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createFeatureRootsListAdapter()
  {
		if (featureRootsListItemProvider == null) {
			featureRootsListItemProvider = new FeatureRootsListItemProvider(this);
		}

		return featureRootsListItemProvider;
	}

  /**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFacade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApogyCommonTopologyBindingsFacadeAdapter() {
		if (apogyCommonTopologyBindingsFacadeItemProvider == null) {
			apogyCommonTopologyBindingsFacadeItemProvider = new ApogyCommonTopologyBindingsFacadeItemProvider(this);
		}

		return apogyCommonTopologyBindingsFacadeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingsSetItemProvider bindingsSetItemProvider;

	/**
	 * This creates an adapter for a {@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindingsSetAdapter() {
		if (bindingsSetItemProvider == null) {
			bindingsSetItemProvider = new BindingsSetItemProvider(this);
		}

		return bindingsSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFacade} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonTopologyBindingsFacadeItemProvider apogyCommonTopologyBindingsFacadeItemProvider;

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
		if (rotationBindingItemProvider != null) rotationBindingItemProvider.dispose();
		if (translationBindingItemProvider != null) translationBindingItemProvider.dispose();
		if (transformMatrixBindingItemProvider != null) transformMatrixBindingItemProvider.dispose();
		if (booleanBindingItemProvider != null) booleanBindingItemProvider.dispose();
		if (trueBooleanCaseItemProvider != null) trueBooleanCaseItemProvider.dispose();
		if (falseBooleanCaseItemProvider != null) falseBooleanCaseItemProvider.dispose();
		if (enumerationSwitchBindingItemProvider != null) enumerationSwitchBindingItemProvider.dispose();
		if (enumerationCaseItemProvider != null) enumerationCaseItemProvider.dispose();
		if (bindingsListItemProvider != null) bindingsListItemProvider.dispose();
		if (featureRootsListItemProvider != null) featureRootsListItemProvider.dispose();
		if (bindingsSetItemProvider != null) bindingsSetItemProvider.dispose();
		if (apogyCommonTopologyBindingsFacadeItemProvider != null) apogyCommonTopologyBindingsFacadeItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link ApogyCommonTopologyPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ApogyCommonTopologyChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ApogyCommonTopologySwitch<Object> {
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
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createRotationBinding()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createTranslationBinding()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createTransformMatrixBinding()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createBooleanBinding()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createTrueBooleanCase()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createFalseBooleanCase()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createEnumerationSwitchBinding()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createEnumerationCase()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createBindingsList()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createFeatureRootsList()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createBindingsSet()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.CONTENT_NODE__CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createApogyCommonTopologyBindingsFacade()));

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
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createRotationBinding()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createTranslationBinding()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createTransformMatrixBinding()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createBooleanBinding()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createTrueBooleanCase()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createFalseBooleanCase()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createEnumerationSwitchBinding()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createEnumerationCase()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createBindingsList()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createFeatureRootsList()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createBindingsSet()));

				newChildDescriptors.add
					(createChildParameter
						(ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT,
						 ApogyCommonTopologyBindingsFactory.eINSTANCE.createApogyCommonTopologyBindingsFacade()));

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
			return ApogyCommonTopologyBindingsEditPlugin.INSTANCE;
		}
	}

}
