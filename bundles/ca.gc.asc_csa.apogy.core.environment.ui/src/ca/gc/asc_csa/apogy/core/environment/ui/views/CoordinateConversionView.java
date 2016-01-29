package ca.gc.asc_csa.apogy.core.environment.ui.views;

import java.util.Iterator;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.core.Positioned;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.ui.composites.CoordinateConversionComposite;

public class CoordinateConversionView extends AbstractView
{
	// The relevant composite which has the content for the view
	private CoordinateConversionComposite coordinateConversionComposite;
	
	// Whether or not the conversion view should allow selection of objects
	private boolean selectionEnabled = false;
	
	public void enableSelections(boolean allowSelections)
	{
		// If the selection enabled value is currently true
		if ((selectionEnabled == true) && (allowSelections == false))
		{
			// Remove the binding from the composite to its current object (if one exists)
			coordinateConversionComposite.setBoundObject(null);
		}
		
		// Set the value accordingly
		selectionEnabled = allowSelections;
	}
	
	@Override
	public void updatePartName()
	{
		// Nothing to do here
	}

	@Override
	public void createPartControl(Composite parent)
	{
		// Call the superclass' version of the method
		super.createPartControl(parent);
		
		// Create the conversion composite
		coordinateConversionComposite = new CoordinateConversionComposite(parent, SWT.NONE);
	}
	
	@Override
	@SuppressWarnings("rawtypes")
	public void updateSelection(ISelection selection)
	{
		// If the selection of objects is permitted
		if (selectionEnabled == true)
		{
			// Cast down to a structured selection
			StructuredSelection structSel = (StructuredSelection) selection;
		
			// Get the iterator
			Iterator structSelIter = structSel.iterator();
		
			// While there's another item in the selection
			while (structSelIter.hasNext())
			{
				// Get the element
				Object obj = structSelIter.next();
			
				// If this is a Positioned or
				// GeographicCoordinates object
				if ((obj instanceof Positioned) ||
					(obj instanceof GeographicCoordinates))
				{
					// Bind the first one found to the composite
					coordinateConversionComposite.setBoundObject(obj);
				
					// Break out
					break;
				}
			}
		}
	}
}
