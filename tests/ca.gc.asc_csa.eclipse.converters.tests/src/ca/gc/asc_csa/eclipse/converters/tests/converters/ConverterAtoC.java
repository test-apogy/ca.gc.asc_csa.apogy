package ca.gc.asc_csa.eclipse.converters.tests.converters;

import ca.gc.asc_csa.eclipse.converters.IConverter;
import ca.gc.asc_csa.eclipse.converters.tests.types.A;
import ca.gc.asc_csa.eclipse.converters.tests.types.C;

public class ConverterAtoC implements IConverter 
{
	private boolean canConvert = true;
	
	public ConverterAtoC() 
	{
		this(true);
	}
	
	public ConverterAtoC(boolean canConvert) 
	{
		this.canConvert = canConvert;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return C.class;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getInputType() {		
		return A.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{	
		if(canConvert)
		{
			return (input != null);
		}
		else
		{
			return false;
		}
	}

	@Override
	public Object convert(Object input) throws Exception 
	{
		A a = (A) input;
		C c = new C();		
		c.setDescription(a.getDescription() + "->AtoC");
		return c;
	}

}
