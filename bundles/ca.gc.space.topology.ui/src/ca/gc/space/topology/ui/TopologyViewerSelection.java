package ca.gc.space.topology.ui;

import java.util.Iterator;
import java.util.List;

import javax.vecmath.Vector3d;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

/**
 * 
 * <dl>
 * <dt>Description:</dt>
 * <dd>this class represents a selection that occured in the topology viewer. A
 * selection is composed of the NodePresentation associated</dd>
 * <dt>Version:</dt>
 * <dd>$Revision: 1.4.2.2 $</dd>
 * <dt>Creation date:</dt>
 * <dd>Jan 6, 2011</dd>
 * </dl>
 * 
 * @author sgemme
 * 
 *         <PRE>
 * 'History: 
 * $Log: TopologyViewerSelection.java,v $
 * Revision 1.4.2.2  2015/02/03 20:01:23  rlarcheveque
 * *** empty log message ***
 *
 * Revision 1.3  2012/03/02 14:54:51  pallard
 * *** empty log message ***
 *
 * Revision 1.2  2011/07/20 15:05:36  mboulanger
 * *** empty log message ***
 *
 * Revision 1.1.4.3  2011/05/16 14:55:35  sgemme
 * ASSIGNED - bug 1212: Multiple Views
 * http://luke.speng.space.gc.ca/bugzilla/show_bug.cgi?id=1212
 *
 * Revision 1.1.4.2  2011/04/27 18:13:07  sgemme
 * ASSIGNED - bug 1212: Multiple Views
 * http://luke.speng.space.gc.ca/bugzilla/show_bug.cgi?id=1212
 * 
 * Revision 1.1.2.3  2011/01/06 15:14:30  sgemme
 * *** empty log message ***
 * 
 * Revision 1.1.2.2  2011/01/06 13:54:46  sgemme
 * *** empty log message ***
 * 
 * </PRE>
 * 
 */
public class TopologyViewerSelection implements IStructuredSelection {

	/**
	 * The {@link NodePresentation} object associated with the selection.
	 */
	private NodePresentation nodePresentation;

	/**
	 * The intersection, expressed in the NodePresentation's local frame
	 * coordinates. May be <code>null</code>.
	 */
	private Vector3d intersection;

	/**
	 * The structured selection object used to implement the
	 * {@link IStructuredSelection} interface.
	 */
	private StructuredSelection ssel;

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>TopologyViewerSelection</dd>
	 * <dt>Description:</dt>
	 * <dd>creates a new instance.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>nodePresentation != null</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>{@link #nodePresentation} == nodePresentation</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @param nodePresentation
	 *            the node presentation associated to it
	 * @throws IllegalArgumentException
	 *             if nodePresentation is null.
	 */
	public TopologyViewerSelection(NodePresentation nodePresentation) {

		if (nodePresentation == null) {
			throw new IllegalArgumentException();
		}

		setNodePresentation(nodePresentation);
		ssel = new StructuredSelection(this.nodePresentation);
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>TopologyViewerSelection</dd>
	 * <dt>Description:</dt>
	 * <dd>creates a new instance.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>nodePresentation != null</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>{@link #nodePresentation} == nodePresentation</li>
	 * <li>{@link #intersection} == intersection</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @param nodePresentation
	 *            the node presentation associated to it
	 * @param intersection
	 *            the intersection point in nodePresentation, expressed in
	 *            nodePresentation's local coordinates frame. May be null.
	 * @throws IllegalArgumentException
	 *             if nodePresentation is null.
	 */
	public TopologyViewerSelection(NodePresentation nodePresentation,
			Vector3d intersection) {

		if (nodePresentation == null) {
			throw new IllegalArgumentException();
		}

		setNodePresentation(nodePresentation);
		this.intersection = intersection;

	}

	private void setNodePresentation(NodePresentation nodePresentation) {
		if (this.nodePresentation != nodePresentation) {
			this.nodePresentation = nodePresentation;
			ssel = new StructuredSelection(this.nodePresentation);
		}
	}

	/**
	 * This selection is never empty.
	 */
	@Override
	public boolean isEmpty() {
		return ssel.isEmpty();
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>getNodePresentation</dd>
	 * <dt>Description:</dt>
	 * <dd>returns the {@link NodePresentation} object selected.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @return the {@link NodePresentation} object selected.
	 */
	public NodePresentation getNodePresentation() {
		return nodePresentation;
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>getIntersection</dd>
	 * <dt>Description:</dt>
	 * <dd>returns the intersection point in the nodePresentation's local frame.
	 * May be null</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @return returns the intersection point in the nodePresentation's local
	 *         frame. May be null
	 */
	public Vector3d getIntersection() {
		return intersection;
	}

	@Override
	public Object getFirstElement() {
		return ssel.getFirstElement();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Iterator iterator() {
		return ssel.iterator();
	}

	@Override
	public int size() {
		return ssel.size();
	}

	@Override
	public Object[] toArray() {
		return ssel.toArray();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List toList() {
		return ssel.toList();
	}

}
