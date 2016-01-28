package org.eclipse.symphony.common.converters;

/**
 * Defines a generic converted that converts an object of type Input to produce one of type Output.
 * @author pallard
 *
 * @param <Input> The type of the input.
 * @param <Output> The type of the output.
 */
public interface IConverter
{
	/**
	 * Return the type of the conversion output.
	 * @return The type of the output.
	 */
	public Class<?> getOutputType();
	
	/**
	 * Returns the type of conversion of the input.
	 * @return The type of the input.
	 */
	public Class<?> getInputType();
	
	/**
	 * Whether or not the specified input object can be converted to the output. This method is called 
	 * prior to the convert method to avoid to go through costly conversion to find out that the conversion
	 * cannot take place. 
	 * @param input The input object.
	 * @return True if the object can be converted, false otherwise.
	 */
	public boolean canConvert(final Object input);
	
	/**
	 * Converts the input to an object of the output type.
	 * @param input The input object.
	 * @return The output of the conversion.
	 * @exception If the conversion failed.
	 */
	public Object convert(final Object input) throws Exception;	
}
