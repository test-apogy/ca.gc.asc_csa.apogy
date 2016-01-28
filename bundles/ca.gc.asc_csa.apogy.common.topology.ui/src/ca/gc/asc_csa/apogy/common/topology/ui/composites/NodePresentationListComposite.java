package ca.gc.asc_csa.apogy.common.topology.ui.composites;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

public class NodePresentationListComposite extends Composite 
{
	protected List<NodePresentation> nodePresentationList = null;
	protected ITreeContentProvider contentProvider;
	protected TreeViewer treeViewer = null;
	
	protected AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	
	public NodePresentationListComposite(Composite parent, int style) 
	{
		super(parent, style);			
		setLayout(new FillLayout());
		
		treeViewer = createTreeViewer(this);
	}

	public void setNodePresentationSet(List<NodePresentation> newTopologyPresentationSetList)
	{
		this.nodePresentationList = newTopologyPresentationSetList;
		treeViewer.setInput(this.nodePresentationList);
	}
	
	public List<NodePresentation> getNodePresentationSet()
	{
		return nodePresentationList;
	}
	
	protected TreeViewer createTreeViewer(Composite parent)
	{
		TreeViewer treeViewer = new TreeViewer(parent, SWT.VIRTUAL | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.SINGLE);
		
		treeViewer.setUseHashlookup(true);
		treeViewer.setContentProvider(getContentProvider());
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		
		return treeViewer;
	}
	
	private ITreeContentProvider getContentProvider() 
	{
		if (contentProvider == null) 
		{
			contentProvider = new TopologyPresentationSetContentProvider();
		}
		return contentProvider;
	}
	
	private class TopologyPresentationSetContentProvider implements ITreeContentProvider 
	{
		@Override
		public void dispose() {						
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) 
		{
		}

		@Override
		public Object[] getElements(Object inputElement) 
		{
			if(inputElement instanceof List)
			{
				@SuppressWarnings("unchecked")
				List<NodePresentation> list = (List<NodePresentation>) inputElement;
				NodePresentation[] array = list.toArray(new NodePresentation[list.size()]);
				return array;
			}
			else
			{
				return null;
			}
		}

		@Override
		public Object[] getChildren(Object parentElement) 
		{
			return null;
		}

		@Override
		public Object getParent(Object element) 
		{
			return null;
		}

		@Override
		public boolean hasChildren(Object element) 
		{
			return false;
		}	
	}
}
