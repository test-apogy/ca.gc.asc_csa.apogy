package ca.gc.asc_csa.apogy.common.emf.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.graphics.Color;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.Ranges;


/**
 * Converter that returns the color associated with the range of a specified value.
 * @author pallard
 *
 */
public class ValueRangeToColorConverter extends Converter 
{	
	private EStructuralFeature eStructuralFeature = null;
	
	public ValueRangeToColorConverter(EStructuralFeature eStructuralFeature) 
	{
		super(Object.class, Color.class);
		this.eStructuralFeature = eStructuralFeature;
	}
	
	public Object convert(Object fromObject) 
	{
		Ranges range = getNewValueRange(fromObject);	
		Color color = ApogyCommonEMFUIFacade.INSTANCE.getColorForRange(range);
		return color;
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
			return ApogyCommonEMFFacade.INSTANCE.getRange(eStructuralFeature, value);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return Ranges.UNKNOWN;
		}
	}
}
