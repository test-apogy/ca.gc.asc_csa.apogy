package ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.composites;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Program;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ProgramsList;

public class ProgramsListComposite extends Composite
{
	private DataBindingContext m_currentDataBindings;
	
	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private TreeViewer treeViewer;

	private ProgramsList programsList;

	private ISelectionChangedListener treeViewerSelectionChangedListener;

	public ProgramsListComposite( Composite parent, int style )
	{
		super( parent, style );
		setLayout( new GridLayout( 1, true ) );
		
		treeViewer = new TreeViewer(this, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		Tree tree = treeViewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TreeViewerColumn treeViewerColumnItem_Name = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnItem = treeViewerColumnItem_Name.getColumn();
		trclmnItem.setWidth(200);
		trclmnItem.setText("Name");
		
		TreeViewerColumn treeViewerColumnItem_Description = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnCurrent = treeViewerColumnItem_Description.getColumn();
		trclmnCurrent.setWidth(100);
		trclmnCurrent.setText("Description");
		
		treeViewer.setContentProvider(new ITreeContentProvider(){

			@Override
			public void dispose() {
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}

			@Override
			public Object[] getElements(Object inputElement) {
				List<Program> programs = new ArrayList<Program>();
				
				if (inputElement instanceof ProgramsList){
					Iterator<Program> iterator = ((ProgramsList)inputElement).getPrograms().iterator();
					while (iterator.hasNext()){
						Program program = iterator.next();
						if (isApplicable(program)){
							programs.add(program);
						}
					}
				}						
				return programs.toArray();
			}

			@Override
			public Object[] getChildren(Object parentElement) {
				return null;
			}

			@Override
			public Object getParent(Object element) {
				return programsList;
			}

			@Override
			public boolean hasChildren(Object element) {
				return false;
			}
			
		});			
		treeViewer.setLabelProvider(new ProgramsListsLabelProvider(adapterFactory));
	}
	
	/**
	 * This is used to indicate if a program should belong to the list.  By default all types of {@link Program} are applicable.
	 * However the developers may override this method to exclude some programs from the list.
	 * @param program Reference to the program.
	 * @return Return true means the {@link Program} is applicable.
	 */
	protected boolean isApplicable(Program program) {
		return true;
	}

	private ISelectionChangedListener getTreeViewerSelectionChangedListener() {
		if (treeViewerSelectionChangedListener == null){
			treeViewerSelectionChangedListener = new ISelectionChangedListener() {
				
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					ProgramsListComposite.this.newSelection((TreeSelection)event.getSelection());
				}
			};
		}
		return treeViewerSelectionChangedListener;
	}
	
	/**
	 * This method is called when a new selection is made in the composite.
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(TreeSelection selection) {
	}
	
	/**
	 * Returns the selected program.
	 * @return Reference to the selected {@link Program}.
	 */
	public Program getSelectedProgram() {
		TreeSelection selection = (TreeSelection) treeViewer.getSelection();
		return (Program) selection.getFirstElement();
	}	
	
	private class ProgramsListsLabelProvider extends AdapterFactoryLabelProvider implements ITableLabelProvider{

		private final static int NAME_COLUMN_ID = 0;
		private final static int DESCRIPTION_COLUMN_ID = 1;
		
		public ProgramsListsLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}
		
		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";
			
			/** Program */
			Program program = (Program) object;
			
			switch (columnIndex) {
			case NAME_COLUMN_ID:
				str = program.getName() == null ? "<unnamed>" : program.getName();
				break;

			case DESCRIPTION_COLUMN_ID:
				str = program.getDescription();
				break;
			}
			
			return str;
		}	
		
		@Override
		public Image getColumnImage(Object object, int columnIndex) {
			return null;
		}
	}
	
	public void setProgramsList(ProgramsList programsList){
		this.programsList = programsList;
		
		if (programsList != null){
			if (m_currentDataBindings != null){
				m_currentDataBindings.dispose();
			}
			m_currentDataBindings = initDataBindings();
		}
	}

	protected DataBindingContext initDataBindings()
	{
		return initDataBindingsCustom();
	}
	
	protected DataBindingContext initDataBindingsCustom()
	{
		DataBindingContext bindingContext = new DataBindingContext();
	
		if(programsList != null)
		{
			if(!treeViewer.getTree().isDisposed())
			{
				treeViewer.setInput(programsList);
				treeViewer.expandAll();
			}
		}		
		treeViewer.addSelectionChangedListener(getTreeViewerSelectionChangedListener());
		
		return bindingContext;
	}
	
	@Override
	public void dispose()
	{
		if (m_currentDataBindings != null){
			m_currentDataBindings.dispose();
		}
		super.dispose();
		treeViewer.removeSelectionChangedListener(getTreeViewerSelectionChangedListener());
	}
}