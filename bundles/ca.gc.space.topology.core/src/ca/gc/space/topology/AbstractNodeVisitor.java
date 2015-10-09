package ca.gc.space.topology;

import ca.gc.space.topology.INodeVisitor;

public abstract class AbstractNodeVisitor implements INodeVisitor
{
	private Class<? extends Node> type;

	public AbstractNodeVisitor()
	{
		setType(Node.class);
	}

	@Override
	public Class<? extends Node> getType()
	{
		return type;
	}

	@Override
	public void setType(Class<? extends Node> value)
	{
		type = value;
	}

}
