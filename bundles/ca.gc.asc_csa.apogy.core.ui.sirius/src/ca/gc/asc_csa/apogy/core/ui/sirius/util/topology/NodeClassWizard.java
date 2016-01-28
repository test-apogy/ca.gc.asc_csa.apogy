package ca.gc.asc_csa.apogy.core.ui.sirius.util.topology;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.wizard.Wizard;

public class NodeClassWizard extends Wizard
{
	private static final String NODE_CLASS_WIZARD_TITLE = "Node Class Selection";
	private static final String NODE_CLASS_WIZARD_PAGE_NAME = "Page";
	private static final String NODE_CLASS_WIZARD_PAGE_TITLE = "Select the type of the new topology node";

	private final NodeClassPage page;

	public NodeClassWizard()
	{
		this.setWindowTitle(NODE_CLASS_WIZARD_TITLE);
		
		page = new NodeClassPage(NODE_CLASS_WIZARD_PAGE_NAME, NODE_CLASS_WIZARD_PAGE_TITLE);
		this.addPage(page);
	}

	public EClass getSelectedNodeClass()
	{
		return page.getSelectedClass();
	}
	
	@Override
	public boolean performFinish()
	{
		return true;
	}
}