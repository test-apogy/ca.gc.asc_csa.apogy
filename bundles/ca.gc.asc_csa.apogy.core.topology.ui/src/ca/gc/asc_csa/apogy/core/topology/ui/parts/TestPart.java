package ca.gc.asc_csa.apogy.core.topology.ui.parts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.topology.ui.composites.NodeSelectionComposite;
import ca.gc.asc_csa.apogy.core.ApogyTopology;

public class TestPart extends AbstractApogyTopologyBasedPart
{
	private NodeSelectionComposite nodeSelectionComposite = null;
	
	@Override
	protected void newTopology(ApogyTopology apogyTopology) 
	{
		if(apogyTopology != null)
		{
			nodeSelectionComposite.setTopologyRoot(apogyTopology.getRootNode());
		}
		else
		{
			nodeSelectionComposite.setTopologyRoot(null);
		}
	}

	@Override
	protected void createContentComposite(Composite parent, int style) 
	{
		nodeSelectionComposite = new NodeSelectionComposite(parent, SWT.BORDER);	
	}
}
