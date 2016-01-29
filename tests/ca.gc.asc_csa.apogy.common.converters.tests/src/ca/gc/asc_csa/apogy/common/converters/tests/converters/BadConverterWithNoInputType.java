package ca.gc.asc_csa.apogy.common.converters.tests.converters;

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.converters.tests.types.A;
import ca.gc.asc_csa.apogy.common.converters.tests.types.B;

public class BadConverterWithNoInputType implements IConverter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return B.class;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getInputType() {		
		return null;
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