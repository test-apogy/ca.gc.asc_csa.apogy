package ca.gc.asc_csa.apogy.core.invocator.ui.composites;
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
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.list.DelegatingListProperty;
import org.eclipse.core.databinding.property.list.IListProperty;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILazyTreeContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.ListFeatureNode;
import ca.gc.asc_csa.apogy.common.emf.ListRootNode;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;

public class VariableFeatureReferenceComposite extends Composite {
	private DataBindingContext m_bindingContext;

	private DataBindingContext m_FeaturesbindingContext;

	private FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private VariableFeatureReference variableFeatureReference;
	private VariablesList variables;

	private TableViewer variablesViewer;

	private EditingDomain editingDomain;

	private TreeViewer featuresViewer;

	private TreeViewer typeMemberViewer;

	private ILazyTreeContentProvider featuresContentProvider;

	private AdapterImpl variableFeatureReferenceAdapter;

	AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private Table table;

	/**
	 * Creates the parentComposite.
	 * 
	 * @param parent
	 * @param style
	 */
	public VariableFeatureReferenceComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(3, true));
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});

		/**
		 * 
		 * Variable.
		 * 
		 */
		Section sctnVariable = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		sctnVariable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		sctnVariable.setText("Variable");
		variablesViewer = new TableViewer(sctnVariable, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		variablesViewer.setUseHashlookup(true);
		variablesViewer.setComparator(new ViewerComparator());
		table = variablesViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setLinesVisible(true);
		sctnVariable.setClient(table);
		variablesViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});

		/**
		 * 
		 * Sub-Type.
		 * 
		 */
		Section sctnSubType = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		sctnSubType.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		sctnSubType.setText("Sub-Type");

		Composite compositeSubType = new Composite(sctnSubType, SWT.None);
		compositeSubType.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		GridLayout gridLayout_subTypes = new GridLayout(1, false);
		gridLayout_subTypes.marginHeight = 0;
		gridLayout_subTypes.marginWidth = 0;
		gridLayout_subTypes.marginBottom = 5;
		compositeSubType.setLayout(gridLayout_subTypes);

		typeMemberViewer = new TreeViewer(compositeSubType, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.SINGLE);
		typeMemberViewer.setUseHashlookup(true);
		Tree tree = typeMemberViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tree.setLinesVisible(true);
		typeMemberViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});

		Button clearTypeButton = new Button(compositeSubType, SWT.NONE);
		clearTypeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (editingDomain == null) {
					variableFeatureReference.setTypeMemberReferenceListElement(null);
				} else {
					SetCommand command = new SetCommand(editingDomain, variableFeatureReference,
							ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT,
							null);
					editingDomain.getCommandStack().execute(command);
				}
				typeMemberViewer.setSelection(null);
			}
		});
		clearTypeButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		clearTypeButton.setText("Clear");

		sctnSubType.setClient(compositeSubType);

		/**
		 * 
		 * Feature.
		 * 
		 */
		Section sctnFeature = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		sctnFeature.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		sctnFeature.setText("Feature");

		Composite compositeFeature = new Composite(sctnFeature, SWT.NONE);
		compositeFeature.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		GridLayout gridLayout_feature = new GridLayout(1, false);
		gridLayout_feature.marginHeight = 0;
		gridLayout_feature .marginWidth = 0;
		gridLayout_feature.marginBottom = 5;
		compositeFeature.setLayout(gridLayout_feature);

		featuresViewer = new TreeViewer(compositeFeature,
				SWT.VIRTUAL | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.SINGLE);
		featuresViewer.setUseHashlookup(true);
		featuresViewer.setContentProvider(getFeaturesContentProvider());
		featuresViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		featuresViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});

		Tree featuresTree = featuresViewer.getTree();
		featuresTree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		featuresTree.setLinesVisible(true);

		Button clearFeatureSelection = new Button(compositeFeature, SWT.NONE);
		clearFeatureSelection.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (editingDomain == null) {
					variableFeatureReference.setFeatureRoot(null);
				} else {
					SetCommand command = new SetCommand(editingDomain, variableFeatureReference,
							ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT, null);
					editingDomain.getCommandStack().execute(command);
				}
				featuresViewer.setSelection(null);
			}
		});
		clearFeatureSelection.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		clearFeatureSelection.setText("Clear");

		sctnFeature.setClient(compositeFeature);
	}

	protected void newSelection(ISelection selection) {

	}

	/**
	 * Sets the {@link VariablesList} and the {@link VariableFeatureReference}
	 * managed by the parentComposite.
	 * 
	 * @param variables
	 *            Reference to the list of variables.
	 * @param variableFeatureReference
	 *            Reference to the variable feature.
	 */
	public void set(VariablesList variables, VariableFeatureReference variableFeatureReference) {
		set(variables, variableFeatureReference, true);
	}

	/**
	 * Sets the {@link VariablesList} and the {@link VariableFeatureReference}
	 * managed by the parentComposite.
	 * 
	 * @param variables
	 *            Reference to the list of variables.
	 * @param variableFeatureReference
	 *            Reference to the variable feature.
	 * @param update
	 *            If true then data bindings are created.
	 */
	private void set(VariablesList variables, VariableFeatureReference variableFeatureReference, boolean update) {

		this.variables = variables;
		this.variableFeatureReference = variableFeatureReference;
		editingDomain = TransactionUtil.getEditingDomain(variableFeatureReference);
//				AdapterFactoryEditingDomain.getEditingDomainFor(variableFeatureReference);

		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (m_FeaturesbindingContext != null) {
				m_FeaturesbindingContext.dispose();
				m_FeaturesbindingContext = null;
			}

			if (this.variables != null && this.variableFeatureReference != null) {
				m_bindingContext = initDataBindings();
				m_FeaturesbindingContext = initFeaturesDataBindings();
			}
		}
	}

	/**
	 * Use this to prevent Window Pro Builder code analysis to fail with the
	 * complex data bindings code. Invokes
	 * {@link VariableFeatureReferenceComposite#initDataBindingsCustom()}.
	 * 
	 * @return Reference to the data bindings context.
	 * @see VariableFeatureReferenceComposite#initDataBindingsCustom()
	 */
	private DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	/**
	 * Creates and returns the data bindings context that takes care of the
	 * Variables viewer and the Type Members viewer.
	 * 
	 * @return Reference to the data bindings context.
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		/**
		 * Variables Viewer Content.
		 */
		ViewerSupport.bind(variablesViewer,
				EMFObservables.observeList(variables, ApogyCoreInvocatorPackage.Literals.VARIABLES_LIST__VARIABLES),
				EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME));

		/**
		 * Variable Selection Binding.
		 */
		IObservableValue<?> observeSingleSelectionVariablesViewer = ViewerProperties.singleSelection()
				.observe(variablesViewer);

		IObservableValue<?> observeVariableValue = editingDomain == null ? EMFObservables.observeValue(
				variableFeatureReference, ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE) :

				EMFEditObservables.observeValue(editingDomain, variableFeatureReference,
						ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE);

		bindingContext.bindValue(observeSingleSelectionVariablesViewer, observeVariableValue, null, null);

		/**
		 * Type Member Viewer Content.
		 */
		@SuppressWarnings("rawtypes")
		IListProperty typeMemberChildrenProperty = new DelegatingListProperty() {
			@Override
			protected IListProperty doGetDelegate(Object source) {
				IListProperty listProperty = null;
				if (source instanceof VariableFeatureReference) {
					listProperty = EMFProperties.list(FeaturePath.fromList(
							ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE,
							ApogyCoreInvocatorPackage.Literals.VARIABLE__VARIABLE_TYPE,
							ApogyCoreInvocatorPackage.Literals.TYPE__MEMBERS));
				}
				if (source instanceof TypeMember) {
					listProperty = EMFProperties
							.list(FeaturePath.fromList(ApogyCoreInvocatorPackage.Literals.TYPE_MEMBER__MEMBER_TYPE,
									ApogyCoreInvocatorPackage.Literals.TYPE__MEMBERS));
				}
				return listProperty;
			}
		};
		ViewerSupport.bind(typeMemberViewer, variableFeatureReference, typeMemberChildrenProperty,
				EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME));

		/**
		 * Sets Type Member Selection.
		 */
		TypeMemberReferenceListElement element = variableFeatureReference.getTypeMemberReferenceListElement();
		if (element != null) {
			TypeMember[] typeMemberSegments = new TypeMember[element.getSubSegmentsCount()];

			for (int i = 0; i < typeMemberSegments.length; i++) {
				typeMemberSegments[i] = element.getTypeMember();
				element = element.getChild();
			}
			TreePath typeMemberTreePath = new TreePath(typeMemberSegments);
			try {
				TreeSelection treeSelection = new TreeSelection(typeMemberTreePath);
				typeMemberViewer.setSelection(treeSelection, true);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}

		/**
		 * Bind TypeMemberReference.
		 */
		IObservableValue<?> observeSingleSelectionTypeViewer = ViewersObservables.observeSingleSelection(typeMemberViewer);

		IObservableValue<?> observeTypeMemberValue = editingDomain == null
				? EMFObservables.observeValue(variableFeatureReference,
						ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT)
				:

				EMFEditObservables.observeValue(editingDomain, variableFeatureReference,
						ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT);

		bindingContext.bindValue(observeSingleSelectionTypeViewer, observeTypeMemberValue, new UpdateValueStrategy()
				.setConverter(new Converter(TypeMember.class, TypeMemberReferenceListElement.class) {
					@Override
					public Object convert(Object fromObject) {
						if (fromObject != null) {
							ITreeSelection selection = (ITreeSelection) typeMemberViewer.getSelection();
							TreePath path = selection.getPaths()[0];
							TypeMember[] typeMembers = new TypeMember[path.getSegmentCount()];
							for (int i = 0; i < path.getSegmentCount(); i++) {
								typeMembers[i] = (TypeMember) path.getSegment(i);
							}
							return ApogyCoreInvocatorFacade.INSTANCE.createTypeMemberReferences(typeMembers);
						}
						return null;
					}
				}), new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));

		return bindingContext;
	}

	/**
	 * Creates and returns the data bindings context that takes care of the
	 * Features viewer.
	 * 
	 * @return Reference to the data bindings context.
	 */
	protected DataBindingContext initFeaturesDataBindings() {
		/** Remove Variable Feature Adapter. */
		variableFeatureReference.eAdapters().remove(getVariableFeatureReferenceAdapter());

		/** Create the new binding context. */
		DataBindingContext bindingContext = new DataBindingContext();

		/**
		 * Set the Features viewer properties.
		 */
		featuresViewer.setInput(variableFeatureReference);

		/**
		 * Set the initial feature selection if any.
		 */
		ListRootNode listRootNode = variableFeatureReference.getFeatureRoot();
		TreeSelection treeSelection = null;
		if (listRootNode != null) {
			ListFeatureNode node = (ListFeatureNode) listRootNode.getChild();
			List<EStructuralFeature> featuresList = new ArrayList<EStructuralFeature>();

			while (node != null) {
				featuresList.add(node.getStructuralFeature());
				node = (ListFeatureNode) node.getChild();
			}
			TreePath featuresTreePath = new TreePath(featuresList.toArray());
			try {
				treeSelection = new TreeSelection(featuresTreePath);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
		featuresViewer.setSelection(treeSelection, true);

		/**
		 * Bind the features Selection.
		 */
		IObservableValue<?> observeSingleSelectionFeaturesViewer = ViewersObservables
				.observeSingleSelection(featuresViewer);

		IObservableValue<?> observeFeaturesValue = editingDomain == null
				? EMFObservables.observeValue(variableFeatureReference,
						ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT)
				: EMFEditObservables.observeValue(editingDomain, variableFeatureReference,
						ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT);

		bindingContext.bindValue(observeSingleSelectionFeaturesViewer, observeFeaturesValue,
				new UpdateValueStrategy().setConverter(new Converter(EStructuralFeature.class, ListRootNode.class) {
					@Override
					public Object convert(Object fromObject) {
						if (fromObject != null) {
							ITreeSelection selection = (ITreeSelection) featuresViewer.getSelection();
							TreePath path = selection.getPaths()[0];
							EStructuralFeature[] features = new EStructuralFeature[path.getSegmentCount()];
							for (int i = 0; i < path.getSegmentCount(); i++) {
								features[i] = (EStructuralFeature) path.getSegment(i);
							}
							return ApogyCoreInvocatorFacade.INSTANCE.createListRootNode(variableFeatureReference, features);
						}
						return null;
					}
				}), new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));

		/**
		 * Listens Variable Feature Reference Events.
		 */
		variableFeatureReference.eAdapters().add(getVariableFeatureReferenceAdapter());

		return bindingContext;
	}

	/**
	 * This adapter is used to bind the feature component of the
	 * VariableFeatureReference.
	 * 
	 * @return Reference to the adapter.
	 */
	private Adapter getVariableFeatureReferenceAdapter() {
		if (variableFeatureReferenceAdapter == null) {
			variableFeatureReferenceAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					switch (msg.getFeatureID(VariableFeatureReference.class)) {
					case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE:
						typeMemberViewer.setSelection(null);
					case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT:
						if (m_FeaturesbindingContext != null) {
							m_FeaturesbindingContext.dispose();
							m_FeaturesbindingContext = null;
						}
						if (variableFeatureReference != null) {
							m_FeaturesbindingContext = initFeaturesDataBindings();
						}
						break;
					default:
						break;
					}
				}
			};
		}
		return variableFeatureReferenceAdapter;
	}

	/**
	 * This method could be overloaded to return a subset of the
	 * EStructuralFeatures.
	 * 
	 * @param eClass
	 *            Reference to the EClass.
	 * @return List of EStructuralFeatures contained in eClass.
	 */
	protected List<EStructuralFeature> getEStructuralFeature(EClass eClass) {
		List<EStructuralFeature> list = new ArrayList<EStructuralFeature>();
		if (variableFeatureReference instanceof OperationCall) {
			list.addAll(eClass.getEAllReferences());
		} else {
			list.addAll(eClass.getEAllStructuralFeatures());
		}
		return list;
	}

	@Override
	public void dispose() {
		super.dispose();

		if (variableFeatureReference != null) {
			variableFeatureReference.eAdapters().remove(getVariableFeatureReferenceAdapter());
		}

		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
	}

	/**
	 * 
	 * This class provides the content of the Feature Viewer.
	 *
	 */
	private class FeaturesContentProvider implements ITreeContentProvider, ILazyTreeContentProvider {
		private Viewer viewer;

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			this.viewer = viewer;
		}

		@Override
		public void dispose() {
		}

		@Override
		public void updateElement(Object parent, int index) {
			EObject eObjectParent = (EObject) parent;
			EObject eObjectChild = null;

			if (eObjectParent instanceof VariableFeatureReference) {
				/** Variables Feature Reference. */
				VariableFeatureReference variableFeatureReference = (VariableFeatureReference) eObjectParent;
				Variable variable = variableFeatureReference.getVariable();
				if (variable != null) {
					EClass eClass = ApogyCoreInvocatorFacade.INSTANCE.getInstanceClass(variableFeatureReference);

					if (eClass != null) {
						eObjectChild = getEStructuralFeature(eClass).get(index);

						getTreeViewer().replace(parent, index, eObjectChild);

						/** Check the number of children under this element. */
						updateChildCount(eObjectChild, -1);
					}
				}
			} else {
				/** General EMF Features. */
				EReference eReference = (EReference) eObjectParent;
				EClassifier eClassifier = eReference.getEType();
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					eObjectChild = getEStructuralFeature(eClass).get(index);
				}
				getTreeViewer().replace(parent, index, eObjectChild);

				/** Check the number of children under this element. */
				updateChildCount(eObjectChild, -1);
			}
		}

		@Override
		public void updateChildCount(Object element, int currentChildCount) {
			if (element instanceof VariableFeatureReference) {
				VariableFeatureReference variableFeatureReference = (VariableFeatureReference) element;
				Variable variable = variableFeatureReference.getVariable();
				if (variable != null) {
					EClass eClass = ApogyCoreInvocatorFacade.INSTANCE.getInstanceClass(variableFeatureReference);
					if (eClass == null) {
						getTreeViewer().setChildCount(element, 0);
					} else {
						getTreeViewer().setChildCount(element, getEStructuralFeature(eClass).size());
					}
				}
			} else if (element instanceof EReference) {
				EReference eReference = (EReference) element;
				EClassifier eClassifier = eReference.getEType();
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					getTreeViewer().setChildCount(element, getEStructuralFeature(eClass).size());
				}
			}
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return null;
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			return null;
		}

		@Override
		public Object getParent(Object element) {
			EObject eObjectParent = null;
			if (element instanceof EObject) {
				EObject eObject = (EObject) element;
				eObjectParent = eObject.eContainer();
			}
			return eObjectParent;
		}

		@Override
		public boolean hasChildren(Object element) {
			return false;
		}

		protected TreeViewer getTreeViewer() {
			return (TreeViewer) viewer;
		}
	}

	private IContentProvider getFeaturesContentProvider() {
		if (featuresContentProvider == null) {
			featuresContentProvider = new FeaturesContentProvider();
		}
		return featuresContentProvider;
	}
}