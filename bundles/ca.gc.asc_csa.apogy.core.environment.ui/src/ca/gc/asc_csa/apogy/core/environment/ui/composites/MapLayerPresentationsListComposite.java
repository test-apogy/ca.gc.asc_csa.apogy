package ca.gc.asc_csa.apogy.core.environment.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import org.eclipse.ui.forms.widgets.FormToolkit;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;

public class MapLayerPresentationsListComposite extends Composite {
	private DataBindingContext m_bindingContext;

	private FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	
	final private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);	

	private EditingDomain editingDomain;

	private CartesianTriangularMeshMapLayer cartesianTriangularMeshMapLayer;

	private TreeViewer treeViewer;

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public MapLayerPresentationsListComposite(Composite parent, int style) {
		super(parent, style);

		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});

		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(1, true));
		
		treeViewer = new TreeViewer(this, SWT.BORDER);
		Tree tree = treeViewer.getTree();
		tree.setLinesVisible(true);
		tree.setHeaderVisible(true);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.paintBordersFor(tree);

		TreeViewerColumn treeViewerColumnName = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnName = treeViewerColumnName.getColumn();
		trclmnName.setWidth(200);
		trclmnName.setText("Name");
		EditingSupport nameEditingSupport = new NameEditingSupport(
				treeViewerColumnName.getViewer());
		treeViewerColumnName.setEditingSupport(nameEditingSupport);		

		
		TreeViewerColumn treeViewerColumnVisible = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnVisible = treeViewerColumnVisible.getColumn();
		trclmnVisible.setWidth(100);
		trclmnVisible.setText("Visible");
		EditingSupport visibilityEditingSupport = new VisibilityEditingSupport(
				treeViewerColumnVisible.getViewer());
		treeViewerColumnVisible.setEditingSupport(visibilityEditingSupport);		
		
		TreeViewerColumn treeViewerColumnAlpha = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnAlpha = treeViewerColumnAlpha.getColumn();
		trclmnAlpha.setWidth(100);
		trclmnAlpha.setText("Alpha");
		
		EditingSupport alphaEditingSupport = new AlphaEditingSupport(
				treeViewerColumnAlpha.getViewer());
		treeViewerColumnAlpha.setEditingSupport(alphaEditingSupport);			
		
		treeViewer.setContentProvider(new MapLayerPresentationsListContentProvider());
		treeViewer.setLabelProvider(new MapLayerPresentationsListLabelProvider(adapterFactory));
	}
	


	/**
	 * Binds the {@link CartesianTriangularMeshMapLayer} with the composite.
	 * 
	 * @param cartesianTriangularMeshMapLayer
	 *            Reference to the list {@link CartesianTriangularMeshMapLayer}.
	 */
	public void setCartesianTriangularMeshMapLayer(CartesianTriangularMeshMapLayer cartesianTriangularMeshMapLayer) {
		setCartesianTriangularMeshMapLayer(cartesianTriangularMeshMapLayer, true);
	}

	/**
	 * Sets the {@link CartesianTriangularMeshMapLayer}.
	 * 
	 * @param cartesianTriangularMeshMapLayer 
	 *            Reference to the {@link CartesianTriangularMeshMapLayer}.
	 * @param update
	 *            If true then data bindings are created.
	 */
	private void setCartesianTriangularMeshMapLayer(CartesianTriangularMeshMapLayer cartesianTriangularMeshMapLayer , boolean update) {
		this.cartesianTriangularMeshMapLayer = cartesianTriangularMeshMapLayer ;
		editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(cartesianTriangularMeshMapLayer );
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}

			if (cartesianTriangularMeshMapLayer  != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}

	/**
	 * Use this to prevent Window Pro Builder code analysis to fail with the
	 * complex data bindings code. Invokes
	 * {@link MapLayerPresentationsListComposite#initDataBindingsCustom()}.
	 * 
	 * @return Reference to the data bindings context.
	 * @see MapLayerPresentationsListComposite#initDataBindingsCustom()
	 */
	private DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	/**
	 * Creates and returns the data bindings context that takes care of the
	 * Contexts List Viewer.
	 * 
	 * @return Reference to the data bindings context.
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();
		treeViewer.setInput("");	
		return bindingContext;
	}

	/**
	 * This method is called when a new selection is made in the composite.
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	@Override
	public void dispose() {
		super.dispose();
		toolkit.dispose();
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
	}

	
	/**
	 * 
	 * Content Provider.
	 *
	 */
	private class MapLayerPresentationsListContentProvider implements ITreeContentProvider{

		@Override
		public Object[] getElements(Object inputElement) {
			return cartesianTriangularMeshMapLayer.getMapLayerPresentations().toArray();
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			return cartesianTriangularMeshMapLayer.getMapLayerPresentations().toArray();
		}

		@Override
		public Object getParent(Object element) {
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			return false;
		}	
	}
	
	/**
	 * 
	 * Label Provider.
	 *
	 */
	private class MapLayerPresentationsListLabelProvider extends AdapterFactoryLabelProvider implements ITableLabelProvider{

		private static final int NAME_COLUMN_ID = 0;
		private static final int VISIBLITY_COLUMN_ID = 1;
		private static final int ALPHA_COLUMN_ID = 2;
		
		public MapLayerPresentationsListLabelProvider(
				AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";
			MapLayerPresentation mapLayerPresentation = (MapLayerPresentation) object;
			

			switch (columnIndex) {
			case NAME_COLUMN_ID:
				str = mapLayerPresentation.getName() == null ? "undefined" : mapLayerPresentation.getName();
				break;

			case VISIBLITY_COLUMN_ID:
				str = Boolean.toString(mapLayerPresentation.isVisible());
				break;
			case ALPHA_COLUMN_ID:
				if (object instanceof ImageMapLayerPresentation){
					str = Float.toString(((ImageMapLayerPresentation) object).getAlpha());
				}
				break;

			default:
				break;
			}

			return str;
		}
	}	
	
	/**
	 * 
	 * Visibility Editing Support.
	 *
	 */
	private final class VisibilityEditingSupport extends
			EditingSupport {

		private ColumnViewer viewer = null;

		private IBaseLabelProvider labelProvider = new LabelProvider(){
			@Override
			public String getText(Object element) {
				return Boolean.toString((Boolean) element);
			}
		};

		private IStructuredContentProvider contentProvider = new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}

			@Override
			public void dispose() {
			}

			@Override
			public Object[] getElements(Object inputElement) {
				return new Object[]{true, false};
			}
		};

		public VisibilityEditingSupport(ColumnViewer viewer) {
			super(viewer);
			this.viewer = viewer;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			ComboBoxViewerCellEditor cellEditor = null;
			cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer()
					.getControl(), SWT.READ_ONLY);
			cellEditor.setLabelProvider(labelProvider);
			cellEditor.setContentProvider(contentProvider);
			cellEditor.setInput(element);
			return cellEditor;
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected Object getValue(Object element) {
			MapLayerPresentation mapLayerPresentation = (MapLayerPresentation) element;
			return mapLayerPresentation.isVisible();
		}

		@Override
		protected void setValue(Object element, Object value) {
			Boolean booleanValue = (Boolean) value;
			MapLayerPresentation mapLayerPresentation = (MapLayerPresentation) element;
			
			SetCommand command = new SetCommand(
					editingDomain,
					mapLayerPresentation,
					ApogyCoreEnvironmentPackage.Literals.MAP_LAYER_PRESENTATION__VISIBLE,
					booleanValue);
			editingDomain.getCommandStack().execute(command);

			this.viewer.update(mapLayerPresentation, null);
		}
	}	
	
	/**
	 * 
	 * Alpha Editing Support.
	 *
	 */
	private final class AlphaEditingSupport extends
			EditingSupport {

		private ColumnViewer viewer = null;

		public AlphaEditingSupport(ColumnViewer viewer) {
			super(viewer);
			this.viewer = viewer;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			TextCellEditor cellEditor = null;
			cellEditor = new TextCellEditor((Composite) getViewer()
					.getControl(), SWT.NONE);
			return cellEditor;
		}

		@Override
		protected boolean canEdit(Object element) {
			return element instanceof ImageMapLayerPresentation;
		}

		@Override
		protected Object getValue(Object element) {
			ImageMapLayerPresentation mapLayerPresentation = (ImageMapLayerPresentation) element;
			return Float.toString(mapLayerPresentation.getAlpha());
		}

		@Override
		protected void setValue(Object element, Object value) {
			String strValue = (String) value;
			if (!strValue.isEmpty()){
			Float floatValue = Float.valueOf((String) value);
			ImageMapLayerPresentation mapLayerPresentation = (ImageMapLayerPresentation) element;
			
			SetCommand command = new SetCommand(
					editingDomain,
					mapLayerPresentation,
					ApogyCoreEnvironmentPackage.Literals.IMAGE_MAP_LAYER_PRESENTATION__ALPHA,
					floatValue);
			editingDomain.getCommandStack().execute(command);

			this.viewer.update(mapLayerPresentation, null);
			}
		}
	}
	
	
	/**
	 * 
	 * Name Editing Support.
	 *
	 */
	private final class NameEditingSupport extends
			EditingSupport {

		private ColumnViewer viewer = null;

		public NameEditingSupport(ColumnViewer viewer) {
			super(viewer);
			this.viewer = viewer;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			TextCellEditor cellEditor = null;
			cellEditor = new TextCellEditor((Composite) getViewer()
					.getControl(), SWT.NONE);
			return cellEditor;
		}

		@Override
		protected boolean canEdit(Object element) {
			return element instanceof ImageMapLayerPresentation;
		}

		@Override
		protected Object getValue(Object element) {
			ImageMapLayerPresentation mapLayerPresentation = (ImageMapLayerPresentation) element;
			return mapLayerPresentation.getName() == null ? "undefined" : mapLayerPresentation.getName();
		}

		@Override
		protected void setValue(Object element, Object value) {
			String strValue = (String) value;
			ImageMapLayerPresentation mapLayerPresentation = (ImageMapLayerPresentation) element;
			
			SetCommand command = new SetCommand(
					editingDomain,
					mapLayerPresentation,
					ApogyCommonEMFPackage.Literals.NAMED__NAME,
					strValue);
			editingDomain.getCommandStack().execute(command);

			this.viewer.update(mapLayerPresentation, null);
			}
		}	
}