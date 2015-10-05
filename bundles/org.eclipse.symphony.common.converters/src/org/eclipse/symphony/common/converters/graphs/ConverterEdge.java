package org.eclipse.symphony.common.converters.graphs;

import org.eclipse.symphony.common.converters.IConverter;

public class ConverterEdge 
{
	private Class<?> from = null;
	private Class<?> to = null;
	private IConverter converter = null;
	
	public Class<?> getFrom() {
		return from;
	}

	public void setFrom(Class<?> from) {
		this.from = from;
	}

	public Class<?> getTo() {
		return to;
	}

	public void setTo(Class<?> to) {
		this.to = to;
	}

	public IConverter getConverter() {
		return converter;
	}

	public void setConverter(IConverter converter) {
		this.converter = converter;
	}
	
	public ConverterEdge(Class<?> from, Class<?> to, IConverter converter)
	{
		setFrom(from);
		setTo(to);
		setConverter(converter);
	}
}
