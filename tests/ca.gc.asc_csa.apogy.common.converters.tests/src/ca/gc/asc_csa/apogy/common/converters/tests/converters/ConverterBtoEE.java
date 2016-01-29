package ca.gc.asc_csa.apogy.common.converters.tests.converters;

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.converters.tests.types.B;
import ca.gc.asc_csa.apogy.common.converters.tests.types.EE;

public class ConverterBtoEE implements IConverter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return EE.class;
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
		EE ee = new EE();		
		ee.setDescription(b.getDescription() + "->BtoEE");
		return ee;
	}

}
