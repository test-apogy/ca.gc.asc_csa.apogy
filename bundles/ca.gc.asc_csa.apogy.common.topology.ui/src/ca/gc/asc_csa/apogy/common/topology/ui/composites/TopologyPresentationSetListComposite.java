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
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;

public class TopologyPresentationSetListComposite extends Composite 
{
	protected List<TopologyPresentationSet> topologyPresentationSetList = null;
	protected ITreeContentProvider topologyPresentationSetContentProvider;
	protected TreeViewer treeViewer = null;
	
	protected AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	
	public TopologyPresentationSetListComposite(Composite parent, int style) 
	{
		super(parent, style);	
		
		setLayout(new FillLayout());
		
		treeViewer = createTreeViewer(this);
	}

	public void setTopologyPresentationSet(List<TopologyPresentationSet> newTopologyPresentationSetList)
	{
		this.topologyPresentationSetList = newTopologyPresentationSetList;
		treeViewer.setInput(this.topologyPresentationSetList);
	}
	
	public List<TopologyPresentationSet> getTopologyPresentationSet()
	{
		return topologyPresentationSetList;
	}
	
	protected TreeViewer createTreeViewer(Composite parent)
	{
		TreeViewer treeViewer = new TreeViewer(parent, SWT.VIRTUAL | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.SINGLE);
		
		treeViewer.setUseHashlookup(true);
		treeViewer.setContentProvider(getTopologyPresentationSetContentProvider());
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		
		return treeViewer;
	}
	
	private ITreeContentProvider getTopologyPresentationSetContentProvider() 
	{
		if (topologyPresentationSetContentProvider == null) 
		{
			topologyPresentationSetContentProvider = new TopologyPresentationSetContentProvider();
		}
		return topologyPresentationSetContentProvider;
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
				List<TopologyPresentationSet> list = (List<TopologyPresentationSet>) inputElement;
				TopologyPresentationSet[] array = list.toArray(new TopologyPresentationSet[list.size()]);
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
			if(parentElement instanceof TopologyPresentationSet)
			{
				TopologyPresentationSet topologyPresentationSet = (TopologyPresentationSet) parentElement;
				List<NodePresentation> list = topologyPresentationSet.getNodePresentationList();
				NodePresentation[] array = list.toArray(new NodePresentation[list.size()]);
				return array;
			}
			else
			{
				return null;
			}
		}

		@Override
		public Object getParent(Object element) 
		{
			return null;
		}

		@Override
		public boolean hasChildren(Object element) 
		{
			if(element instanceof TopologyPresentationSet)
			{
				TopologyPresentationSet topologyPresentationSet = (TopologyPresentationSet) element;				
				return !topologyPresentationSet.getNodePresentationList().isEmpty();
			}
			else
			{
				return false;
			}
		}	
	}
}
