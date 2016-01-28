package ca.gc.asc_csa.apogy.common.converters.tests.converters;

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.converters.tests.types.A;
import ca.gc.asc_csa.apogy.common.converters.tests.types.F;

public class ConverterAtoF implements IConverter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return F.class;
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
		F f = new F();		
		f.setDescription(a.getDescription() + "->AtoF");
		return f;
	}

}
