package org.eclipse.symphony.common.converters;

public class TypeCastConverter implements IConverter {

	private Class<?> inputType = null; 
	private Class<?> outputType = null;
	
	public TypeCastConverter(Class<?> inputType, Class<?> outputType)
	{
		this.inputType = inputType;
		this.outputType = outputType;
	}
	
	@Override
	public Class<?> getOutputType() {		
		return outputType;
	}

	@Override
	public Class<?> getInputType() {
		return inputType;
	}

	@Override
	public boolean canConvert(Object input) 
	{ 
		return outputType.isAssignableFrom(input.getClass());
	}

	@Override
	public Object convert(Object input) throws Exception 
	{		
		return input;
	}

}
