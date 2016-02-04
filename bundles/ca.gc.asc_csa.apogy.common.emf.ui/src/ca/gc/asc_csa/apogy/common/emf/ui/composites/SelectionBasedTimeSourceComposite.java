package ca.gc.asc_csa.apogy.common.emf.ui.composites;
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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.emf.SelectionBasedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.TimeSource;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class SelectionBasedTimeSourceComposite extends AbstractTimeSourceComposite 
{
	protected SelectionBasedTimeSource selectionBasedTimeSource;

	protected ISelectionListener selectionListener = null;
	
	protected DataBindingContext bindingContext;	
			
	public SelectionBasedTimeSourceComposite(Composite parent, int style) 
	{
		this(parent, style, null);		
	}
	
	public SelectionBasedTimeSourceComposite(Composite parent, int style, SelectionBasedTimeSource selectionBasedTimeSource) 
	{
		super(parent, style);	
				
		ISelectionService service = getSelectionService();
		if(service != null)
		{
			service.addSelectionListener(getSelectionListener());
		}
		
		setSelectionBasedTimeSource(selectionBasedTimeSource);
	}

	@Override
	public void dispose() 
	{
		ISelectionService service = getSelectionService();
		if(service != null)
		{
			service.removeSelectionListener(getSelectionListener());
		}
				
		super.dispose();
	}
	
	@Override
	public void activate(boolean active) 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public TimeSource getTimeSource() 
	{
		return getSelectionBasedTimeSource();
	}

	public SelectionBasedTimeSource getSelectionBasedTimeSource() 
	{
		return selectionBasedTimeSource;
	}

	public void setSelectionBasedTimeSource(SelectionBasedTimeSource selectionBasedTimeSource) 
	{
		setSelectionBasedTimeSource(selectionBasedTimeSource, true);
	}	
	
	public void setSelectionBasedTimeSource(SelectionBasedTimeSource selectionBasedTimeSource, boolean update) 
	{
		this.selectionBasedTimeSource = selectionBasedTimeSource;
		
		if(update)
		{
			if(bindingContext != null)
			{
				bindingContext.dispose();
				bindingContext = null;
			}
			
			if(selectionBasedTimeSource != null)
			{
				bindingContext = initDataBindings();								
			}
		}
		
		super.setTimeSource(selectionBasedTimeSource);
	}	
	
	protected ISelectionService getSelectionService()
	{
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		ISelectionService selectionService = win.getSelectionService();
		
		return selectionService;
	}
	
	protected DataBindingContext initDataBindings() 
	{
		DataBindingContext bindingContext = new DataBindingContext();
		
		return bindingContext;
	}	
	
	protected ISelectionListener getSelectionListener()
	{
		if(selectionListener == null)
		{
			selectionListener = new ISelectionListener() 
			{				
				@Override
				public void selectionChanged(IWorkbenchPart part, ISelection selection) 
				{					
					try
					{
						if(getSelectionBasedTimeSource() != null)
						{
							if(selection instanceof IStructuredSelection)
							{
								IStructuredSelection structuredSelection = (IStructuredSelection) selection;
								if(structuredSelection.getFirstElement() instanceof Timed)
								{
									Timed timedElement = (Timed) structuredSelection.getFirstElement();
									getSelectionBasedTimeSource().setSelection(timedElement);	
								}
							}
						}
					}
					catch(Throwable t)
					{
						t.printStackTrace();
					}
				}
			};
		}
		
		return selectionListener;
	}
}
