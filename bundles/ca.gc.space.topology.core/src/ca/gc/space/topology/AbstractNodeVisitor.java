package ca.gc.space.topology;

/**
 * 
 * @author sgemme
 *
 */
public abstract class AbstractNodeVisitor implements INodeVisitor {

	private Class<? extends Node> type;

	public AbstractNodeVisitor() {
		// By default, we visit all nodes
		setType(Node.class);
	}

	@Override
	public Class<? extends Node> getType() {
		return type;
	}

	@Override
	public void setType(Class<? extends Node> value) {
		type = value;
	}

}
