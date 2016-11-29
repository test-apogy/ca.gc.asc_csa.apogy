package ca.gc.asc_csa.apogy.common.io.jinput.ui.composites;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

public class JInputStatusComposite extends Composite{

	private TreeViewer treeViewer;
	private Tree tree;
	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	
	public JInputStatusComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout());
		
		treeViewer = new TreeViewer(this, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		tree = treeViewer.getTree();
		
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory)
		{
			@Override
			public Object[] getElements(Object object)
			{
				if (getParent(object) == null)
				{
					return ca.gc.asc_csa.apogy.common.io.jinput.Activator.getEControllerEnvironment().getControllers().toArray();
				}
				else
				{
					return super.getElements(object);
				}
			}
		});
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
	}
	
	public void setEControllerEnvironment(){
		treeViewer.setInput("");
	}
	
	public Tree getTree(){
		return tree;
	}
	
	public TreeViewer getTreeViewer() {
		return treeViewer;
	}
}
