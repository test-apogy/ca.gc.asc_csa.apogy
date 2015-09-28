package ca.gc.asc_csa.eclipse.converters.tests.converters;

import ca.gc.asc_csa.eclipse.converters.IConverter;
import ca.gc.asc_csa.eclipse.converters.tests.types.B;
import ca.gc.asc_csa.eclipse.converters.tests.types.D;

public class ConverterDtoB implements IConverter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return B.class;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getInputType() {		
		return D.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{	
		return input instanceof D;
	}

	@Override
	public Object convert(Object input) throws Exception 
	{
		D d = (D) input;
		B b = new B();		
		b.setDescription(d.getDescription() + "->DtoB");
		return b;
	}

}
