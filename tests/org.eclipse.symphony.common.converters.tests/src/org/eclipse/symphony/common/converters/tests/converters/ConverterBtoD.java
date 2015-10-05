package org.eclipse.symphony.common.converters.tests.converters;

import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.common.converters.tests.types.B;
import org.eclipse.symphony.common.converters.tests.types.D;

public class ConverterBtoD implements IConverter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return D.class;
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
		D d = new D();		
		d.setDescription(b.getDescription() + "->BtoD");
		return d;
	}

}
