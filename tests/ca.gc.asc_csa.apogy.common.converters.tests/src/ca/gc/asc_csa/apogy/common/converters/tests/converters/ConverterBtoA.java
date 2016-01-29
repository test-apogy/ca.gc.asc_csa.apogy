package ca.gc.asc_csa.apogy.common.converters.tests.converters;

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.converters.tests.types.A;
import ca.gc.asc_csa.apogy.common.converters.tests.types.B;

public class ConverterBtoA implements IConverter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return A.class;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getInputType() {		
		return B.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{	
		return (input instanceof B);
	}

	@Override
	public Object convert(Object input) throws Exception 
	{
		B b = (B) input;
		A a = new A();		
		a.setDescription(b.getDescription() + "->BtoA");
		return a;
	}

}
