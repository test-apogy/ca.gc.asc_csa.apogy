package org.eclipse.symphony.common.obsolete.eclipse.emf.edit.dnd;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.swt.dnd.ByteArrayTransfer;
import org.eclipse.swt.dnd.TransferData;

/**
 * Transfers data is an array of EClass.  Serialized version is:
 * (int) number of EClasses
 * (EClass) class 1 (Fully Qualified Class Name).
 * (EClass) gadget 2
 * 
 * <PRE>
 * 
 * Phoenix Meteorological Station (MET) Ground Data System (GDS)
 * Canadian Space Agency / Agence spatiale canadienne
 * 6767 route de l'Aeroport
 * St-Hubert, Québec, Canada
 * J3Y 8Y9
 * www.space.gc.ca
 * Copyrights (c)
 * </PRE>  
 */
public class EClassesTransfer extends ByteArrayTransfer {
	
	private static final String TYPE_NAME = "eclass-transfer-format";
	private static final int TYPE_ID = registerType(TYPE_NAME);
	private EPackage ePackage;
	
	/** 
	 * Key  : EPackage.
	 * Value: EClassTransfer  
	 */
	private static Map<EPackage, EClassesTransfer> instances;

	/**
	 * Creates an {@link EClass} DND Transfer.  
	 * @param Reference to the package that contains the EClass definition.
	 */
	private EClassesTransfer(EPackage epackage){
		this.ePackage = epackage;
	}
		
	/** 
	 * Returns the transfer singleton instance for this package. 
	 * @param epackage Reference to the EMF Package.
	 * @return singleton instance.
	 */
	public static EClassesTransfer getInstance(EPackage epackage){
		EClassesTransfer instance = (EClassesTransfer) getMap().get(epackage);
		if (instance == null){
			instance = new EClassesTransfer(epackage);
			getMap().put(epackage, instance);
		}
		return instance;
	}
	
	protected static Map <EPackage, EClassesTransfer>getMap(){
		if (instances == null){
			instances = new HashMap<EPackage, EClassesTransfer>();
		}
		return instances;
	}
			
	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.Transfer#getTypeIds()
	 */
	@Override
	protected int[] getTypeIds() {
		return new int[] { TYPE_ID };
	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.Transfer#getTypeNames()
	 */
	@Override
	protected String[] getTypeNames() {
		return new String [] { TYPE_NAME };
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.ByteArrayTransfer#javaToNative(java.lang.Object, org.eclipse.swt.dnd.TransferData)
	 */
	@Override
	protected void javaToNative(Object object, TransferData transferData) {
		byte[] bytes = toByteArray((EClass []) object);
		if (bytes != null){
			super.javaToNative(bytes, transferData);
		}
	}
	

    /**
     * Transfers data is an array of EClass.  Serialized version is:
     * (int) number of EClasses
     * (EClass) class 1 (Fully Qualified Class Name).
     * (EClass) gadget 2
     * @param eclasses Array of classes.
     * @return Array of bytes.
     */	
	protected byte[] toByteArray(EClass[] eclasses) {
      ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
      DataOutputStream out = new DataOutputStream(byteOut);

      byte[] bytes = null;

      try {
         /** write number of classes. */
         out.writeInt(eclasses.length);

         /** write class. */
         for (int i = 0; i < eclasses.length; i++) {
        	 EClass eclass = eclasses[i];
        	 out.writeUTF(eclass.getName());
         }
         out.close();
         bytes = byteOut.toByteArray();
      } catch (IOException e) {
         //when in doubt send nothing
      }
      return bytes;
   }
	
	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.ByteArrayTransfer#nativeToJava(org.eclipse.swt.dnd.TransferData)
	 */
	@Override
	protected Object nativeToJava(TransferData transferData) {
	      byte[] bytes = (byte[])super.nativeToJava(transferData);
	      return fromByteArray(bytes);
	}
	
	/**
	 * 
	 * @param bytes
	 * @return
	 */
	protected EClass[] fromByteArray(byte[] bytes) {
		DataInputStream in = new DataInputStream(new ByteArrayInputStream(bytes));
		try {
			/* read number of eclasses */
			int n = in.readInt();

			/* read gadgets */
			EClass[] eclasses = new EClass[n];
			for (int i = 0; i < n; i++) {
				EClass eclass = (EClass) ePackage.getEClassifier(in.readUTF()); 
				if (eclass == null) {
					return null;
				}
				eclasses[i] = eclass;
			}
			return eclasses;
		} catch (IOException e) {
			return null;
		}
	}
}