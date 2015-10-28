package org.eclipse.symphony.common.topology.addons.dynamics.ui.views;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.converters.ui.Symphony__CommonConvertersUIFacade;
import org.eclipse.symphony.common.topology.addons.dynamics.ui.actions.PinViewAction;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

public abstract class AbstractPinableView<T> extends ViewPart implements ISelectionListener 
{
	public static final String ID = "org.eclipse.symphony.common.topology.addons.dynamics.ui.views.AbstractPinableView";

	private T subject;
	private boolean pinView = false;
	private ISelection currentSelection = null;
	
	public AbstractPinableView() { }
	
	public void setPinView(boolean pinView) {
		this.pinView = pinView;
	}

	public boolean isPinView() {
		return pinView;
	}
	
	@Override
	public void createPartControl(Composite parent) 
	{
		getSite().getPage().addSelectionListener(this);	
	}
	
	public void setObject(T object) {
		this.subject = object;
	}
	
	public T getObject() 
	{
		return subject;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) 
	{
		if(!pinView)
		{
			if(selection != currentSelection)
			{
				currentSelection = selection;
				
				@SuppressWarnings("rawtypes")
				List list = Symphony__CommonConvertersUIFacade.INSTANCE.convert(selection, getObjectClass());

				if(list.size() > 0) {
					setObject((T) list.get(0));	
				}
			}
		}	
	}
	
	@Override
	public void dispose() 
	{
		getSite().getPage().removeSelectionListener(this);
		super.dispose();
	}
	
	public abstract Class<T> getObjectClass();
	
	/**
	 * Create the actions.
	 */
	protected void createActions() 
	{
		/* Creates Link With Selection Action */
		PinViewAction pinViewAction = new PinViewAction(this);
		pinViewAction.setChecked(pinView);
		
		/* Add actions to toolbars*/
		this.getViewSite().getActionBars().getToolBarManager().add(pinViewAction);
		this.getViewSite().getActionBars().getMenuManager().add(pinViewAction);
	}
		
}
