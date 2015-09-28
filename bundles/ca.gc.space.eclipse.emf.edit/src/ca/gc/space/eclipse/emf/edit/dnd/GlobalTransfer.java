package ca.gc.space.eclipse.emf.edit.dnd;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.dnd.ByteArrayTransfer;
import org.eclipse.swt.dnd.TransferData;

/**
 * Allows transfers of a single EMF object between virtual machine instances.
 * 
 * <PRE>
 * 
 * 
 * Eclipse Toolboxes. Canadian Space Agency / Agence spatiale canadienne 6767
 * route de l'Aeroport St-Hubert, Québec, Canada J3Y 8Y9 www.space.gc.ca
 * Copyrights (c)
 * 
 * </PRE>
 */
public class GlobalTransfer extends ByteArrayTransfer {

	/**
	 * This is the register transfer type name.
	 */
	protected static final String TYPE_NAME = "global-transfer-format";

	/**
	 * This is the ID that is registered to the name.
	 */
	protected static final int TYPE_ID = registerType(TYPE_NAME);

	/**
	 * Refers to the file name of that represents the shared memory.
	 */
	private static final String SHARED_MEMORY_NAME = "GlobalTransfer.shm";

	/**
	 * This is initialized and returned by {@link #getInstance}.
	 */
	protected static GlobalTransfer instance;

	/**
	 * This returns the one instance of this transfer agent.
	 */
	public static GlobalTransfer getInstance() {
		if (instance == null) {
			instance = new GlobalTransfer();
		}
		return instance;
	}

	/**
	 * This records the time at which the transfer data was recorded.
	 */
	protected long startTime;

	/**
	 * This records the data being transferred.
	 */
	protected Object object;

	private File tempFile;

	/**
	 * This creates an instance; typically you get one from {@link #getInstance}.
	 */
	protected GlobalTransfer() {
	}

	/**
	 * This returns the transfer ids that this agent supports.
	 */
	protected int[] getTypeIds() {
		return new int[] { TYPE_ID };
	}

	/**
	 * This returns the transfer names that this agent supports.
	 */
	public String[] getTypeNames() {
		return new String[] { TYPE_NAME };
	}

	public File getTempFile() {
		if (tempFile == null) {
				tempFile = new File(System.getProperty("java.io.tmpdir") + File.separatorChar + SHARED_MEMORY_NAME);			
				try {
					tempFile.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return tempFile;
	}

	/**
	 * This records the object and current time and encodes only the current
	 * time into the transfer data.
	 */
	public void javaToNative(Object object, TransferData transferData) {
		if (object instanceof StructuredSelection) {
			Object sel = ((StructuredSelection) object).getFirstElement();

			if (sel instanceof EObject) {
				EObject eobject = (EObject) sel;

				// Create a resource set.
				ResourceSet resourceSet = new ResourceSetImpl();

				// Register the default resource factory -- only needed for
				// stand-alone!
				resourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap().put(
								Resource.Factory.Registry.DEFAULT_EXTENSION,
								new XMIResourceFactoryImpl());

				// Get the URI of the model file.
				URI fileURI = URI.createFileURI(getTempFile().getPath());

				// Create a resource for this file.
				Resource resource = resourceSet.createResource(fileURI);

				resource.getContents().add(EcoreUtil.copy(eobject));

				// Save the contents of the resource to the file system.
				try {
					resource.save(Collections.EMPTY_MAP);
				} catch (IOException e) {
					e.printStackTrace();
				}

				startTime = System.currentTimeMillis();
				if (transferData != null) {
					super.javaToNative(String.valueOf(startTime).getBytes(),
							transferData);
				}
			}
		}
	}

	/**
	 * This decodes the time of the transfer and returns the recorded the object
	 * if the recorded time and the decoded time match.
	 */
	public Object nativeToJava(TransferData transferData) {
		byte[] bytes = (byte[]) super.nativeToJava(transferData);
		if (bytes == null)
			return null;
		try {
			// Create a resource set.
			ResourceSet resourceSet = new ResourceSetImpl();

			// Register the default resource factory -- only needed for
			// stand-alone!
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
							new XMIResourceFactoryImpl());

			// Get the URI of the model file.

			URI fileURI = URI.createFileURI(getTempFile().getPath());

			// Demand load the resource for this file.
			Resource resource = resourceSet.getResource(fileURI, true);

			EObject eobject = null;
			try {
				resource.load(Collections.EMPTY_MAP);
				eobject = (EObject) resource.getContents().get(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return new StructuredSelection(eobject);

		} catch (NumberFormatException exception) {
			exception.printStackTrace();
		}
		return null;
	}
}