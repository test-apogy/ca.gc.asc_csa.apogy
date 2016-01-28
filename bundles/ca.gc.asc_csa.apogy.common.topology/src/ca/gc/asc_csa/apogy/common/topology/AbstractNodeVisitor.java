package ca.gc.asc_csa.apogy.common.topology;

import ca.gc.asc_csa.apogy.common.topology.INodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.Node;

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
