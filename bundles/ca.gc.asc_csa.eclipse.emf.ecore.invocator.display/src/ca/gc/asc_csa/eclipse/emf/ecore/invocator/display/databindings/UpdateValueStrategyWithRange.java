package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.databindings;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Control;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.Ranges;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.AbstractFeatureDisplay;

public class UpdateValueStrategyWithRange extends UpdateValueStrategy 
{
	private EStructuralFeature eStructuralFeature = null;
	private AbstractFeatureDisplay watchFeatureDisplayProperty = null;
	private Control control = null;

	public UpdateValueStrategyWithRange(EStructuralFeature eStructuralFeature, AbstractFeatureDisplay adapter, Control control)
	{
		this.eStructuralFeature = eStructuralFeature;
		this.watchFeatureDisplayProperty = adapter;
		this.control = control;
	}

	public UpdateValueStrategyWithRange(EStructuralFeature eStructuralFeature, Control control)
	{
		this(eStructuralFeature, null, control);
	}
	
	@Override
	public Object convert(Object value) 
	{				
		// Check the unconverted value for range.
		try
		{
			Ranges range = getNewValueRange(value);			
			if(watchFeatureDisplayProperty != null)
			{
				watchFeatureDisplayProperty.updateRange(control, range);
			}
			else
			{
				// TODO control.setBackground(EmfECoreUIUtilities.getColorForRange(control.getDisplay(), range));
			}
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		return super.convert(value);
	}
		
	/**
	 * Return the new range associated with the value found in the notification.
	 * @param msg The notification message.
	 * @return The new Ranges.
	 */
	protected Ranges getNewValueRange(Object value)
	{
		try
		{			
			return EMFEcoreFacade.INSTANCE.getRange(eStructuralFeature, value);			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return Ranges.UNKNOWN;
		}
	}
}
