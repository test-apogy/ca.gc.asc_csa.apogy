package ca.gc.asc_csa.apogy.common.converters;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ChainedConverter implements IConverter 
{
	private List<IConverter> converters = new ArrayList<IConverter>();
	
	public ChainedConverter(List<IConverter> converters)
	{
		this.converters = converters;
	}
	
	public int getChainSize()
	{
		return this.converters.size();
	}
	
	@Override
	public Class<?> getOutputType() 
	{		
		if(converters.size() > 0)
		{
			IConverter lastConverter = converters.get(converters.size() - 1);
			return lastConverter.getOutputType();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Class<?> getInputType() 
	{
		if(converters.size() > 0)
		{
			IConverter firstConverter = converters.get(0);
			return firstConverter.getInputType();
		}
		else
		{
			return null;
		}
	}

	@Override
	public boolean canConvert(Object input) 
	{				
		return true;
	}

	@Override
	public Object convert(Object input) throws Exception 
	{
		Object in = input;
		Object out = null;
		Iterator<IConverter> it = converters.iterator();
		while(it.hasNext())
		{
			IConverter converter = it.next();
			
			// If the converter can convert.
			if(converter.canConvert(in))
			{				
				out = converter.convert(in);
				in = out;
			}
			else
			{
				return null;
			}
		}
		
		return out;
	}

	@Override
	public String toString() 
	{
		String string = new String("[");
		
		Iterator<IConverter> it = converters.iterator();
		while(it.hasNext())
		{
			IConverter converter = it.next();
			string += converter.getClass().getSimpleName();
			if(it.hasNext())
			{
				string += ", ";
			}
				
		}
		string += "]";
		
		return string;
	}
}
