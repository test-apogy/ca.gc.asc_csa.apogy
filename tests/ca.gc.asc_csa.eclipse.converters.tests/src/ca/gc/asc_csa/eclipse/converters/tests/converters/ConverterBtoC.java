package ca.gc.asc_csa.eclipse.converters.tests.converters;

import ca.gc.asc_csa.eclipse.converters.IConverter;
import ca.gc.asc_csa.eclipse.converters.tests.types.B;
import ca.gc.asc_csa.eclipse.converters.tests.types.C;

public class ConverterBtoC implements IConverter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return C.class;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getInputType() {		
		return B.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{	
		return (input != null);
	}

	@Override
	public Object convert(Object input) throws Exception 
	{
		B b = (B) input;
		C c = new C();		
		c.setDescription(b.getDescription() + "->BtoC");
		return c;
	}

}
