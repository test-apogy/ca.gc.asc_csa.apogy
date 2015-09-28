package ca.gc.asc_csa.eclipse.converters.tests.converters;

import ca.gc.asc_csa.eclipse.converters.IConverter;
import ca.gc.asc_csa.eclipse.converters.tests.types.AA;
import ca.gc.asc_csa.eclipse.converters.tests.types.C;

public class ConverterAAtoC implements IConverter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return C.class;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getInputType() {		
		return AA.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{	
		return (input != null);
	}

	@Override
	public Object convert(Object input) throws Exception 
	{
		AA a = (AA) input;
		C c = new C();		
		c.setDescription(a.getDescription() + "->AAtoC");
		return c;
	}

}
