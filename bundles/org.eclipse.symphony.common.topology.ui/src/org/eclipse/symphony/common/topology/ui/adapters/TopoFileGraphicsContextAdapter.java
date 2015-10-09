package org.eclipse.symphony.common.topology.ui.adapters;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.ui.GraphicsContext;
import org.eclipse.symphony.common.topology.ui.GraphicsContextAdapter;
import org.eclipse.symphony.common.topology.ui.TopologyUIFactory;

public class TopoFileGraphicsContextAdapter implements GraphicsContextAdapter {

	private static final String SUPPORTED_EXTENSION = ".topo";

	public TopoFileGraphicsContextAdapter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isAdapterFor(Object obj) {

		boolean adapterFor = false;

		if (obj instanceof IFile) {
			IFile file = (IFile) obj;
			adapterFor = file.getName().endsWith(SUPPORTED_EXTENSION);
		}

		return adapterFor;
	}

	@Override
	public GraphicsContext getAdapter(Object obj, Object context) {

		GraphicsContext ctx = null;

		if (isAdapterFor(obj)) {

			ctx = TopologyUIFactory.eINSTANCE.createGraphicsContext();

			IProgressMonitor monitor = new NullProgressMonitor();

			if (context instanceof IProgressMonitor) {
				monitor = (IProgressMonitor) context;
			}

			IFile file = (IFile) obj;

			monitor.beginTask("Importing", 1);
			monitor.subTask("Loading file " + file.getName());

			XMIResource res = new XMIResourceImpl(URI.createFileURI(file
					.getLocation().toOSString()));

			try {
				res.load(Collections.EMPTY_MAP);

				EObject eObject = res.getContents().get(0);

				monitor.worked(1);

				if (eObject instanceof GroupNode) {
					GroupNode root = (GroupNode) eObject;

					ctx.setTopology(root);
				}

				monitor.done();
			} catch (IOException e) {
				monitor.done();
				e.printStackTrace();
			}

		}

		return ctx;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return IFile.class;
	}

}
