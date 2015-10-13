package org.eclipse.symphony.common.obsolete.eclipse.emf;

import java.util.List;

public class DefaultListEventDelegate<T> implements ListEventDelegate<T> {

	@Override
	public void added(T element) {

	}

	@Override
	public void addedMany(List<T> elements) {
		for (T t : elements) {
			added(t);
		}

	}

	@Override
	public void removed(T element) {

	}

	@Override
	public void removedMany(List<T> elements) {
		for (T t : elements) {
			removed(t);
		}

	}

}
