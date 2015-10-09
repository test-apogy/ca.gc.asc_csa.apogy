/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.geometry.data3d.las;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>LAS Reader</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getInputStream <em>Input Stream</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getVlrs <em>Vlrs</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getProgressMonitor <em>Progress Monitor</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASReader()
 * @model
 * @generated
 */
public interface LASReader extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASReader_File()
	 * @model
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Input Stream</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Stream</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Input Stream</em>' attribute.
	 * @see #setInputStream(InputStream)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASReader_InputStream()
	 * @model dataType="ca.gc.space.java.emf.InputStream" transient="true"
	 * @generated
	 */
	InputStream getInputStream();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getInputStream <em>Input Stream</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Input Stream</em>' attribute.
	 * @see #getInputStream()
	 * @generated
	 */
	void setInputStream(InputStream value);

	/**
	 * Returns the value of the '<em><b>Vlrs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.geometry.data3d.las.VariableLengthRecord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vlrs</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlrs</em>' reference list.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASReader_Vlrs()
	 * @model transient="true"
	 * @generated
	 */
	List<VariableLengthRecord> getVlrs();

	/**
	 * Returns the value of the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress Monitor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress Monitor</em>' attribute.
	 * @see #setProgressMonitor(IProgressMonitor)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASReader_ProgressMonitor()
	 * @model dataType="org.eclipse.symphony.common.geometry.data3d.las.IProgressMonitor" transient="true"
	 * @generated
	 */
	IProgressMonitor getProgressMonitor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getProgressMonitor <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Progress Monitor</em>' attribute.
	 * @see #getProgressMonitor()
	 * @generated
	 */
	void setProgressMonitor(IProgressMonitor value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Header</em>' reference.
	 * @see #setHeader(LASHeader)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASReader_Header()
	 * @model transient="true"
	 * @generated
	 */
	LASHeader getHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASReader#getHeader
	 * <em>Header</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Header</em>' reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(LASHeader value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' reference list. The
	 * list contents are of type {@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Points</em>' reference list.
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASReader_Points()
	 * @model transient="true"
	 * @generated
	 */
	List<LASPoint> getPoints();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.common.geometry.data3d.las.IOException"
	 * @generated
	 */
	void read() throws IOException;

} // LASReader
