package ca.gc.asc_csa.topology.ui.viewer;


/**
 * Interface defining a provider of ITopologyViewer.
 * @author pallard
 *
 */
public interface TopologyViewerProvider 
{

	/**
	 * Return the ITopologyViewer referred to the interface implementer.
	 * @return The ITopologyViewer, can be null.
	 */
	public ITopologyViewer getTopologyViewer();

}
