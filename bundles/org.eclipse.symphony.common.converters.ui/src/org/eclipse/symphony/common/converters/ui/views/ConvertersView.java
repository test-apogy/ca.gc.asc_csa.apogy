package org.eclipse.symphony.common.converters.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.converters.graphs.ConverterEdge;
import org.eclipse.symphony.common.converters.graphs.ConverterGraphUtilities;
import org.eclipse.symphony.common.converters.ui.actions.SetClassNameDisplayModeAction;
import org.eclipse.symphony.common.converters.ui.composites.AvailableConversionComposite;
import org.eclipse.symphony.common.converters.ui.composites.ConverterGraphComposite;
import org.eclipse.symphony.common.converters.ui.composites.ConvertersUIConstants.ClassNameDisplayMode;
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
		
		SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph = org.eclipse.symphony.common.converters.Activator.getGraph();
		parent.setLayout(new FillLayout(SWT.VERTICAL));
		converterGraphComposite = new ConverterGraphComposite(parent, SWT.NONE, graph);
		availableConversionComposite = new AvailableConversionComposite(parent, SWT.NONE, graph);		
		
		addActions();
		
		ConverterGraphUtilities.getAvailableDestinationTypeMap(graph);
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
