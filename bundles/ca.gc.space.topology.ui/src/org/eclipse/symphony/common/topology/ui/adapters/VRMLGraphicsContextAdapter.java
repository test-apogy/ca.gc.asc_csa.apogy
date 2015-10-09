package org.eclipse.symphony.common.topology.ui.adapters;

import org.eclipse.core.resources.IFile;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.TopologyFactory;
import org.eclipse.symphony.common.topology.URLNode;
import org.eclipse.symphony.common.topology.ui.GraphicsContext;
import org.eclipse.symphony.common.topology.ui.GraphicsContextAdapter;
import org.eclipse.symphony.common.topology.ui.TopologyUIFactory;

public class VRMLGraphicsContextAdapter implements GraphicsContextAdapter {

	public final static String[] VRML_FILE_EXTENSION = new String[] { "wrl","vrml" };	
	public VRMLGraphicsContextAdapter() {		
	}

	@Override
	public boolean isAdapterFor(Object obj) 
	{
		boolean isAdapter = false;

		// We respond to IFile selection ending with the supported extensions.
		if (obj instanceof IFile) 
		{
			IFile file = (IFile) obj;
			isAdapter = isExtensionSupported(getFileExtension(file.getName()), VRML_FILE_EXTENSION);			
		}

		return isAdapter;
	}

	@SuppressWarnings("deprecation")
	@Override
	public GraphicsContext getAdapter(Object obj, Object context) {
		
		GraphicsContext grContext = null;

		if (isAdapterFor(obj))
		{
			IFile file = (IFile) obj;
			
			URLNode node = TopologyFactory.eINSTANCE.createURLNode();
			node.setDescription(file.getName());
			
			node.setUrl("file://" + file.getLocation().toOSString());
			
			GroupNode root = TopologyFactory.eINSTANCE.createGroupNode();
			root.getChildren().add(node);
			
			grContext = TopologyUIFactory.eINSTANCE.createGraphicsContext();
			grContext.setTopology(root);			
		}
		
		return grContext;
	}

	@Override
	public Class<?> getAdaptedClass() 
	{		
		return IFile.class;
	}
	
	/**
	 * Returns the file extebsion of a file name.
	 * @param url The url as a string.
	 * @return The file extension
	 */
	private String getFileExtension(String url) 
	{
		String fileExtension = new String();
		String fileName = url;
		int index = fileName.lastIndexOf(".");
		if (index >= 0) {
			fileExtension = fileName.substring(index);
		}

		return fileExtension;
	}
	
	/**
	 * Return whether or not the file extension is supported.
	 * @param extension The actual file extension.
	 * @param extensionList The list of file extension supported
	 * @return True if the specified file extension is part of the supported extensions, false otherwise.
	 */
	private boolean isExtensionSupported(String extension, String[] extensionList) {
		boolean supported = false;

		int i = 0;
		while ((!supported) && (i < extensionList.length)) {
			String supportedExtension = extensionList[i];
			if (extension.endsWith(supportedExtension)) {
				supported = true;
			} else {
				i++;
			}
		}

		return supported;
	}
}
