package org.eclipse.symphony.common.converters.tests.converters;

import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.common.converters.tests.types.A;
import org.eclipse.symphony.common.converters.tests.types.B;

public class ConverterAtoB implements IConverter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return B.class;
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
		b.setDescription(a.getDescription() + "->AtoB");
		return b;
	}

}
