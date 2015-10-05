package org.eclipse.symphony.common.converters.tests.converters;

import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.common.converters.tests.types.A;
import org.eclipse.symphony.common.converters.tests.types.AA;

public class ConverterAAtoA implements IConverter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return A.class;
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
		AA aa = (AA) input;
		aa.setDescription(aa.getDescription() + "->AAtoA");
		return aa;
	}

}
