package ca.gc.asc_csa.eclipse.converters.tests.converters;

import ca.gc.asc_csa.eclipse.converters.IConverter;
import ca.gc.asc_csa.eclipse.converters.tests.types.A;
import ca.gc.asc_csa.eclipse.converters.tests.types.B;

public class BadConverterWithNoOutputType implements IConverter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getInputType() {		
		return A.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{	
		return (input != null);
	}

	@Override
	public Object convert(Object input) throws Exception 
	{
		A a = (A) input;
		B b = new B();		
		b.setDescription(a.getDescription() + "_B");
		return b;
	}

}
