package ca.gc.asc_csa.apogy.common.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;

/**
 * Converts an Object to String using the object.toString() method.
 * @author pallard
 *
 */
public class ObjectToStringConverter extends Converter 
{

	public ObjectToStringConverter()
	{
		super(Object.class, String.class);
	}
	
	/**
	 * Converter an Object to a String. The toString() method is used. 
	 * @param fromObject The object to convert. Can be null.
	 * @return The fromObject.toString() result, or null if the fromObject is null.
	 */
	public Object convert(Object fromObject) 
	{
		if(fromObject != null)
		{
			return fromObject.toString();
		}
		else
		{
			return null;
		}
	}
}
