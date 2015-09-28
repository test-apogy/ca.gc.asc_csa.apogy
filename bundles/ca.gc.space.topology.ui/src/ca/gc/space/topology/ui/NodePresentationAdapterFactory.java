package ca.gc.space.topology.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import ca.gc.space.topology.ContentNode;

public class NodePresentationAdapterFactory {

	/**
	 * This is a sorted map, the keys are sorted from the most to the less
	 * specific.
	 */
	private SortedSet<Class<?>> classes;
	private Map<Class<?>, NodePresentationAdapter> classesToAdapterMap;
	private List<NodePresentationAdapter> adapters;

	private SortedSet<Class<?>> getClasses() {
		classes = new TreeSet<Class<?>>(new ClassComparator());

		// We get the registered adapters.
		Iterator<NodePresentationAdapter> iterator = adapters.iterator();

		while (iterator.hasNext()) {
			NodePresentationAdapter adapter = iterator.next();

			getClassesToAdapterMap().put(adapter.getAdaptedClass(), adapter);

			classes.add(adapter.getAdaptedClass());

		}

		return classes;
	}

	private Map<Class<?>, NodePresentationAdapter> getClassesToAdapterMap() {

		if (classesToAdapterMap == null) {

			classesToAdapterMap = new HashMap<Class<?>, NodePresentationAdapter>();

		}

		return classesToAdapterMap;
	}

	/**
	 * 
	 * @param adapters
	 */
	public NodePresentationAdapterFactory(List<NodePresentationAdapter> adapters) {
		this.adapters = adapters;

	}

	/**
	 * Retrieves the appropriate adapter for node 'node'.
	 * 
	 * @param obj
	 *            the node we wish to get the adapter.
	 * @return the appropriate adapter for node 'node' or <code>null</code> if
	 *         none is found.
	 */
	public NodePresentationAdapter getAdapterFor(Object obj) {

		NodePresentationAdapter adapter = null;

		// We go through all the classes.
		boolean found = false;

		Iterator<Class<?>> iterator = getClasses().iterator();

		Object nodeContent = null;

		if (obj instanceof ContentNode<?>) {
			ContentNode<?> cNode = (ContentNode<?>) obj;

			nodeContent = cNode.getContent();
		} else {
			nodeContent = obj;
		}

		while (iterator.hasNext() && !found) {
			Class<?> adaptedClass = iterator.next();

			if (adaptedClass.isAssignableFrom(nodeContent.getClass())) {
				found = true;
				adapter = getClassesToAdapterMap().get(adaptedClass);
			}
		}
		
		return adapter;
	}

}
