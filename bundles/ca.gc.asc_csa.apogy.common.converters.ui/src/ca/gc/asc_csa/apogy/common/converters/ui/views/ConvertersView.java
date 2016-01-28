package ca.gc.asc_csa.apogy.common.converters.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge;
import ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade;
import ca.gc.asc_csa.apogy.common.converters.ui.actions.SetClassNameDisplayModeAction;
import ca.gc.asc_csa.apogy.common.converters.ui.composites.AvailableConversionComposite;
import ca.gc.asc_csa.apogy.common.converters.ui.composites.ConverterGraphComposite;
import ca.gc.asc_csa.apogy.common.converters.ui.composites.ConvertersUIConstants.ClassNameDisplayMode;
import org.eclipse.ui.part.ViewPart;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

public class ConvertersView extends ViewPart 
{
	public ConvertersView() {
	}		
	private ConverterGraphComposite converterGraphComposite = null;
	private AvailableConversionComposite availableConversionComposite = null;
	
	@Override
	public void createPartControl(Composite parent) {
		
		SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph = ApogyCommonConvertersFacade.INSTANCE.getGraph();
		parent.setLayout(new FillLayout(SWT.VERTICAL));
		converterGraphComposite = new ConverterGraphComposite(parent, SWT.NONE, graph);
		availableConversionComposite = new AvailableConversionComposite(parent, SWT.NONE, graph);		
		
		addActions();
		
		ApogyCommonConvertersGraphsFacade.INSTANCE.getAvailableDestinationTypeMap(graph);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}
	
	public void setClassNameDisplayMode(ClassNameDisplayMode classNameDisplayMode) {
		if(converterGraphComposite != null)
		{
			converterGraphComposite.setClassNameDisplayMode(classNameDisplayMode);
		}
		
		if(availableConversionComposite != null)
		{
			availableConversionComposite.setClassNameDisplayMode(classNameDisplayMode);
		}
	}

	/**
	 * Creates and adds the various actions available in the view.
	 */
	private void addActions()
	{
		/* Creates Link With Selection Action */
		SetClassNameDisplayModeAction setClassNameDisplayModeAction = new SetClassNameDisplayModeAction(this);
		setClassNameDisplayModeAction.setChecked(false);
		
	
		/* Add actions to toolbars*/
		this.getViewSite().getActionBars().getToolBarManager().add(setClassNameDisplayModeAction);
		this.getViewSite().getActionBars().getMenuManager().add(setClassNameDisplayModeAction);
	}
}
