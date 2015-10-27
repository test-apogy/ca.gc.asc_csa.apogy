package org.eclipse.symphony.core.invocator.ui.composites;

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
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILazyTreeContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
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
import org.eclipse.symphony.common.emf.AbstractFeatureListNode;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFactory;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.ListFeatureNode;
import org.eclipse.symphony.common.emf.ListRootNode;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.TypeMember;
import org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableFeatureReference;
import org.eclipse.symphony.core.invocator.VariablesList;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

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

	AdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private Table table;

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public VariableFeatureReferenceComposite(Composite parent, int style) {
		super(parent, style);

		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});

		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(3, true));		
		
		/**
		 * 
		 * Variable.
		 * 
		 */
		Section sctnVariable = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		sctnVariable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.paintBordersFor(sctnVariable);
		sctnVariable.setText("Variable");	
		variablesViewer = new TableViewer(sctnVariable, SWT.BORDER
		| SWT.H_SCROLL | SWT.V_SCROLL);
		variablesViewer.setUseHashlookup(true);
		variablesViewer.setComparator(new ViewerComparator());
		table = variablesViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setLinesVisible(true);
		sctnVariable.setClient(table);
		
		
		/**
		 * 
		 * Sub-Type.
		 * 
		 */		
		Section sctnSubType = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		sctnSubType.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.paintBordersFor(sctnSubType);
		sctnSubType.setText("Sub-Type");

		Composite compositeSubType = toolkit.createCompositeSeparator(sctnSubType);
		compositeSubType.setLayout(new GridLayout());
		
		typeMemberViewer = new TreeViewer(compositeSubType, SWT.BORDER | SWT.V_SCROLL
				| SWT.H_SCROLL | SWT.SINGLE);
		typeMemberViewer.setUseHashlookup(true);
		Tree tree = typeMemberViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tree.setLinesVisible(true);

		Button clearTypeButton = new Button(compositeSubType, SWT.NONE);
		clearTypeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (editingDomain == null){
					variableFeatureReference.setTypeMemberReferenceListElement(null);
				}else{					
					SetCommand command = new SetCommand(
							editingDomain,
							variableFeatureReference,
							Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT,
							null);
					editingDomain.getCommandStack().execute(command);
				}
				typeMemberViewer.setSelection(null);
			}
		});
		clearTypeButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		clearTypeButton.setText("Clear");
		

		toolkit.paintBordersFor(compositeSubType);
		sctnSubType.setClient(compositeSubType);
		
		
		
		/**
		 * 
		 * Feature.
		 * 
		 */
		Section sctnFeature = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		sctnFeature.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		toolkit.paintBordersFor(sctnFeature);
		sctnFeature.setText("Feature");
		
		Composite compositeFeature = toolkit.createCompositeSeparator(sctnFeature);
		compositeFeature.setLayout(new GridLayout());

		featuresViewer = new TreeViewer(compositeFeature, SWT.VIRTUAL | SWT.BORDER
				| SWT.V_SCROLL | SWT.H_SCROLL | SWT.SINGLE);
		featuresViewer.setUseHashlookup(true);
		featuresViewer.setContentProvider(getFeaturesContentProvider());
		featuresViewer.setLabelProvider(new AdapterFactoryLabelProvider(
				adapterFactory));
		
		Tree featuresTree = featuresViewer.getTree();
		featuresTree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
				1, 1));
		featuresTree.setLinesVisible(true);

		Button clearFeatureSelection = new Button(compositeFeature, SWT.NONE);
		clearFeatureSelection.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (editingDomain == null){
					variableFeatureReference.setFeatureRoot(null);
				}else{				
					SetCommand command = new SetCommand(
							editingDomain,
							variableFeatureReference,
							Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT,
							null);
					editingDomain.getCommandStack().execute(command);
				}
				featuresViewer.setSelection(null);
			}
		});
		clearFeatureSelection.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		clearFeatureSelection.setText("Clear");
		
		toolkit.paintBordersFor(compositeFeature);
		sctnFeature.setClient(compositeFeature);		
	}

	/**
	 * Sets the {@link VariablesList} and the {@link VariableFeatureReference} managed by
	 * the composite. 
	 * @param variables Reference to the list of variables.
	 * @param variableFeatureReference Reference to the variable feature.
	 */
	public void set(VariablesList variables,
			VariableFeatureReference variableFeatureReference) {
		set(variables, variableFeatureReference, true);
	}

	/**
	 * Sets the {@link VariablesList} and the {@link VariableFeatureReference} managed by
	 * the composite. 
	 * @param variables Reference to the list of variables.
	 * @param variableFeatureReference Reference to the variable feature.
	 * @param update If true then data bindings are created.
	 */
	private void set(VariablesList variables,
			VariableFeatureReference variableFeatureReference, boolean update) {

		this.variables = variables;
		this.variableFeatureReference = variableFeatureReference;
		editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(variableFeatureReference);

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
	 * Use this to prevent Window Pro Builder code analysis to fail with the complex 
	 * data bindings code.  Invokes {@link VariableFeatureReferenceComposite#initDataBindingsCustom()}.
	 * @return Reference to the data bindings context.
	 * @see VariableFeatureReferenceComposite#initDataBindingsCustom()
	 */
	private DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	/**
	 * Creates and returns the data bindings context that takes care of the Variables viewer and the 
	 * Type Members viewer.
	 * @return Reference to the data bindings context.
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		/**
		 * Variables Viewer Content.
		 */
		ViewerSupport.bind(variablesViewer, EMFObservables.observeList(
				variables,
				Symphony__CoreInvocatorPackage.Literals.VARIABLES_LIST__VARIABLES),
				EMFProperties.value(Symphony__CommonEMFPackage.Literals.NAMED__NAME));

		/**
		 * Variable Selection Binding.
		 */
		IObservableValue observeSingleSelectionVariablesViewer = ViewerProperties
				.singleSelection().observe(variablesViewer);
		
		IObservableValue observeVariableValue = editingDomain == null ? 
				EMFObservables.observeValue(
						variableFeatureReference,
						Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE):

				EMFEditObservables.observeValue(
						editingDomain,
						variableFeatureReference,
						Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE);
		
		bindingContext.bindValue(observeSingleSelectionVariablesViewer,
				observeVariableValue, null, null);

		/**
		 * Type Member Viewer Content.
		 */
		IListProperty typeMemberChildrenProperty = new DelegatingListProperty() {
			@Override
			protected IListProperty doGetDelegate(Object source) {
				IListProperty listProperty = null;
				if (source instanceof VariableFeatureReference) {
					listProperty = EMFProperties
							.list(FeaturePath
									.fromList(
											Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE,
											Symphony__CoreInvocatorPackage.Literals.VARIABLE__VARIABLE_TYPE,
											Symphony__CoreInvocatorPackage.Literals.TYPE__MEMBERS));
				}
				if (source instanceof TypeMember) {
					listProperty = EMFProperties
							.list(FeaturePath
									.fromList(
											Symphony__CoreInvocatorPackage.Literals.TYPE_MEMBER__MEMBER_TYPE,
											Symphony__CoreInvocatorPackage.Literals.TYPE__MEMBERS));
				}
				return listProperty;
			}
		};
		ViewerSupport.bind(typeMemberViewer, variableFeatureReference,
				typeMemberChildrenProperty,
				EMFProperties.value(Symphony__CommonEMFPackage.Literals.NAMED__NAME));

		/**
		 * Sets Type Member Selection.
		 */
		TypeMemberReferenceListElement element = variableFeatureReference
				.getTypeMemberReferenceListElement();
		if (element != null) {
			TypeMember[] typeMemberSegments = new TypeMember[element
					.getSubSegmentsCount()];

			for (int i = 0; i < typeMemberSegments.length; i++) {
				typeMemberSegments[i] = element.getTypeMember();
				element = element.getChild();
			}
			TreePath typeMemberTreePath = new TreePath(typeMemberSegments);
			try {
				TreeSelection treeSelection = new TreeSelection(
						typeMemberTreePath);
				typeMemberViewer.setSelection(treeSelection, true);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}

		/**
		 * Bind TypeMemberReference.
		 */
		IObservableValue observeSingleSelectionTypeViewer = ViewersObservables
				.observeSingleSelection(typeMemberViewer);
		
		IObservableValue observeTypeMemberValue = editingDomain == null ? 
				EMFObservables
				.observeValue(
						variableFeatureReference,
						Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT):
				
				EMFEditObservables
				.observeValue(
						editingDomain,
						variableFeatureReference,
						Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT);
		
		
		bindingContext.bindValue(observeSingleSelectionTypeViewer,
				observeTypeMemberValue, new UpdateValueStrategy()
						.setConverter(new Converter(TypeMember.class,
								TypeMemberReferenceListElement.class) {
							@Override
							public Object convert(Object fromObject) {
								ITreeSelection selection = (ITreeSelection) typeMemberViewer
										.getSelection();
								TreePath path = selection.getPaths()[0];
								TypeMember[] typeMembers = new TypeMember[path
										.getSegmentCount()];
								for (int i = 0; i < path.getSegmentCount(); i++) {
									typeMembers[i] = (TypeMember) path
											.getSegment(i);
								}
								return EMFEcoreInvocatorFacade.INSTANCE.createTypeMemberReferences(typeMembers);
							}
						}), new UpdateValueStrategy(
						UpdateValueStrategy.POLICY_NEVER));

		return bindingContext;
	}

	
	/**
	 * Creates and returns the data bindings context that takes care of the Features viewer.
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
			
			while (node != null){
				featuresList.add(node.getStructuralFeature());
				node = (ListFeatureNode) node.getChild();
			}			
			TreePath featuresTreePath = new TreePath(featuresList.toArray());
			try {
				treeSelection = new TreeSelection(
						featuresTreePath);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
		featuresViewer.setSelection(treeSelection, true);
				
		/**
		 * Bind the features Selection.
		 */
		IObservableValue observeSingleSelectionFeaturesViewer = ViewersObservables
				.observeSingleSelection(featuresViewer);
				
		IObservableValue observeFeaturesValue = editingDomain == null ? 
				EMFObservables
				.observeValue(
						variableFeatureReference,
						Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT):			
				EMFEditObservables
				.observeValue(
						editingDomain,
						variableFeatureReference,
						Symphony__CoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT);

		bindingContext.bindValue(observeSingleSelectionFeaturesViewer,
				observeFeaturesValue, new UpdateValueStrategy()
						.setConverter(new Converter(EStructuralFeature.class,
								ListRootNode.class) {
							@Override
							public Object convert(Object fromObject) {
								ITreeSelection selection = (ITreeSelection) featuresViewer
										.getSelection();
								TreePath path = selection.getPaths()[0];
								EStructuralFeature[] features = new EStructuralFeature[path
										.getSegmentCount()];
								for (int i = 0; i < path.getSegmentCount(); i++) {
									features[i] = (EStructuralFeature) path
											.getSegment(i);
								}
								return createListRootNode(features);
							}
						}), new UpdateValueStrategy(
						UpdateValueStrategy.POLICY_NEVER));
		

		/** 
		 * Listens Variable Feature Reference Events.
		 */
		variableFeatureReference.eAdapters().add(getVariableFeatureReferenceAdapter());
		
		return bindingContext;
	}
	
	
	/** 
	 * This adapter is used to bind the feature component of the VariableFeatureReference.
	 * @return Reference to the adapter.
	 */
	private Adapter getVariableFeatureReferenceAdapter() {
		if (variableFeatureReferenceAdapter == null){
			variableFeatureReferenceAdapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					switch (msg.getFeatureID(VariableFeatureReference.class)) {
					case Symphony__CoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE:
						typeMemberViewer.setSelection(null);
					case Symphony__CoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT:
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
	 * This method could be overloaded to return a subset of the EStructuralFeatures.
	 * @param eClass Reference to the EClass.
	 * @return List of EStructuralFeatures contained in eClass. 
	 */
	protected List<EStructuralFeature> getEStructuralFeature(EClass eClass){
		List <EStructuralFeature> list = new ArrayList<EStructuralFeature>();
		if (variableFeatureReference instanceof OperationCall){
			list.addAll(eClass.getEAllReferences());
		}else{
			list.addAll(eClass.getEAllStructuralFeatures());
		}
		return list;
	}	

	/**
	 * FIXME Move under EMFEcoreInvocatorFacade.  Wait for Eclipse MARS Release.  
	 * XCore bug fixed by Ed Merks.
	 * FIXME Move under {@link EMFEcoreInvocatorFacade}.  Wait XCore bug.  Unable to wrap EStructuralFeature to get a array data type. 
	 */
	private ListRootNode createListRootNode(EStructuralFeature[] features) {
		ListRootNode listRootNode = null;
		if (features.length > 0) {
			listRootNode = Symphony__CommonEMFFactory.eINSTANCE.createListRootNode();
			listRootNode.setSourceClass(EMFEcoreInvocatorFacade.INSTANCE
					.getInstanceClass(variableFeatureReference));
			AbstractFeatureListNode parentNode = listRootNode;
			for (int i = 0; i < features.length; i++) {
				ListFeatureNode node = Symphony__CommonEMFFactory.eINSTANCE
						.createListFeatureNode();
				node.setStructuralFeature(features[i]);
				parentNode.setChild(node);
				parentNode = node;
			}
		}
		return listRootNode;
	}

	@Override
	public void dispose() {
		super.dispose();
		
		if (variableFeatureReference != null){
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
	private class FeaturesContentProvider implements ITreeContentProvider,
			ILazyTreeContentProvider {
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
					EClass eClass = EMFEcoreInvocatorFacade.INSTANCE
							.getInstanceClass(variableFeatureReference);
					
					if (eClass != null){					
						eObjectChild = getEStructuralFeature(eClass).get(
								index);
												
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
					eObjectChild = getEStructuralFeature(eClass).get(
							index);
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
					EClass eClass = EMFEcoreInvocatorFacade.INSTANCE
							.getInstanceClass(variableFeatureReference);
					if (eClass == null){
						getTreeViewer().setChildCount(element, 0);
					}else{
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