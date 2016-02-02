package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.views;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.actions.PinViewAction;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

public abstract class AbstractPinableView<T> extends ViewPart implements ISelectionListener 
{
	public static final String ID = "ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.views.AbstractPinableView";

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
				List list = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, getObjectClass());

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
