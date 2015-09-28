/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.asc_csa.io.las;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LAS Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.io.las.LASWriter#getFileName <em>File Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.LASWriter#getProgressMonitor <em>Progress Monitor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.LASWriter#getPoints <em>Points</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.LASWriter#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.LASWriter#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.LASWriter#getScaleZ <em>Scale Z</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.LASWriter#getHeader <em>Header</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.LASWriter#getXOffset <em>XOffset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.LASWriter#getYOffset <em>YOffset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.LASWriter#getZOffset <em>ZOffset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.io.las.LASWriter#getOutputStream <em>Output Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.io.las.LasPackage#getLASWriter()
 * @model
 * @generated
 */
public interface LASWriter extends EObject {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see ca.gc.asc_csa.io.las.LasPackage#getLASWriter_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.LASWriter#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

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
	 * @see ca.gc.asc_csa.io.las.LasPackage#getLASWriter_ProgressMonitor()
	 * @model dataType="ca.gc.asc_csa.io.las.IProgressMonitor" transient="true"
	 * @generated
	 */
	IProgressMonitor getProgressMonitor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.LASWriter#getProgressMonitor <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress Monitor</em>' attribute.
	 * @see #getProgressMonitor()
	 * @generated
	 */
	void setProgressMonitor(IProgressMonitor value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.io.las.LASPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' reference list.
	 * @see ca.gc.asc_csa.io.las.LasPackage#getLASWriter_Points()
	 * @model transient="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The LAS point.  The scale \'scaleX\', \'scaleY\', \'scaleZ\' are applied to the x,y,z values to obtain the right values.'"
	 * @generated
	 */
	List<LASPoint> getPoints();

	/**
	 * Returns the value of the '<em><b>Scale X</b></em>' attribute.
	 * The default value is <code>"0.01"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale X</em>' attribute.
	 * @see #setScaleX(double)
	 * @see ca.gc.asc_csa.io.las.LasPackage#getLASWriter_ScaleX()
	 * @model default="0.01"
	 * @generated
	 */
	double getScaleX();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.LASWriter#getScaleX <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale X</em>' attribute.
	 * @see #getScaleX()
	 * @generated
	 */
	void setScaleX(double value);

	/**
	 * Returns the value of the '<em><b>Scale Y</b></em>' attribute.
	 * The default value is <code>"0.01"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Y</em>' attribute.
	 * @see #setScaleY(double)
	 * @see ca.gc.asc_csa.io.las.LasPackage#getLASWriter_ScaleY()
	 * @model default="0.01"
	 * @generated
	 */
	double getScaleY();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.LASWriter#getScaleY <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Y</em>' attribute.
	 * @see #getScaleY()
	 * @generated
	 */
	void setScaleY(double value);

	/**
	 * Returns the value of the '<em><b>Scale Z</b></em>' attribute.
	 * The default value is <code>"0.01"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Z</em>' attribute.
	 * @see #setScaleZ(double)
	 * @see ca.gc.asc_csa.io.las.LasPackage#getLASWriter_ScaleZ()
	 * @model default="0.01"
	 * @generated
	 */
	double getScaleZ();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.LASWriter#getScaleZ <em>Scale Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Z</em>' attribute.
	 * @see #getScaleZ()
	 * @generated
	 */
	void setScaleZ(double value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' reference.
	 * @see ca.gc.asc_csa.io.las.LasPackage#getLASWriter_Header()
	 * @model transient="true" changeable="false"
	 * @generated
	 */
	LASHeader getHeader();

	/**
	 * Returns the value of the '<em><b>XOffset</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XOffset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XOffset</em>' attribute.
	 * @see #setXOffset(double)
	 * @see ca.gc.asc_csa.io.las.LasPackage#getLASWriter_XOffset()
	 * @model default="0.0"
	 * @generated
	 */
	double getXOffset();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.LASWriter#getXOffset <em>XOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XOffset</em>' attribute.
	 * @see #getXOffset()
	 * @generated
	 */
	void setXOffset(double value);

	/**
	 * Returns the value of the '<em><b>YOffset</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YOffset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YOffset</em>' attribute.
	 * @see #setYOffset(double)
	 * @see ca.gc.asc_csa.io.las.LasPackage#getLASWriter_YOffset()
	 * @model default="0.0"
	 * @generated
	 */
	double getYOffset();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.LASWriter#getYOffset <em>YOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YOffset</em>' attribute.
	 * @see #getYOffset()
	 * @generated
	 */
	void setYOffset(double value);

	/**
	 * Returns the value of the '<em><b>ZOffset</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZOffset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZOffset</em>' attribute.
	 * @see #setZOffset(double)
	 * @see ca.gc.asc_csa.io.las.LasPackage#getLASWriter_ZOffset()
	 * @model default="0.0"
	 * @generated
	 */
	double getZOffset();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.LASWriter#getZOffset <em>ZOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZOffset</em>' attribute.
	 * @see #getZOffset()
	 * @generated
	 */
	void setZOffset(double value);

	/**
	 * Returns the value of the '<em><b>Output Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Stream</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Stream</em>' attribute.
	 * @see #setOutputStream(OutputStream)
	 * @see ca.gc.asc_csa.io.las.LasPackage#getLASWriter_OutputStream()
	 * @model dataType="ca.gc.asc_csa.io.las.OutputStream"
	 * @generated
	 */
	OutputStream getOutputStream();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.io.las.LASWriter#getOutputStream <em>Output Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Stream</em>' attribute.
	 * @see #getOutputStream()
	 * @generated
	 */
	void setOutputStream(OutputStream value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.asc_csa.io.las.IOException"
	 * @generated
	 */
	void write() throws IOException;

} // LASWriter
