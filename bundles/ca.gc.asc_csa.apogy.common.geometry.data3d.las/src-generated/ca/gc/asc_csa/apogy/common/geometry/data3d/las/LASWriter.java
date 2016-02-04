package ca.gc.asc_csa.apogy.common.geometry.data3d.las;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LAS Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getFileName <em>File Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getProgressMonitor <em>Progress Monitor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getPoints <em>Points</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getScaleZ <em>Scale Z</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getHeader <em>Header</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getXOffset <em>XOffset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getYOffset <em>YOffset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getZOffset <em>ZOffset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getOutputStream <em>Output Stream</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASWriter()
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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASWriter_FileName()
	 * @model unique="false"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getFileName <em>File Name</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASWriter_ProgressMonitor()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.geometry.data3d.las.IProgressMonitor" transient="true"
	 * @generated
	 */
	IProgressMonitor getProgressMonitor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getProgressMonitor <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress Monitor</em>' attribute.
	 * @see #getProgressMonitor()
	 * @generated
	 */
	void setProgressMonitor(IProgressMonitor value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The LAS point.  The scale 'scaleX', 'scaleY', 'scaleZ' are
	 * applied to the x, y, z values to obtain the right values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASWriter_Points()
	 * @model transient="true" ordered="false"
	 * @generated
	 */
	EList<LASPoint> getPoints();

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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASWriter_ScaleX()
	 * @model default="0.01" unique="false"
	 * @generated
	 */
	double getScaleX();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getScaleX <em>Scale X</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASWriter_ScaleY()
	 * @model default="0.01" unique="false"
	 * @generated
	 */
	double getScaleY();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getScaleY <em>Scale Y</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASWriter_ScaleZ()
	 * @model default="0.01" unique="false"
	 * @generated
	 */
	double getScaleZ();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getScaleZ <em>Scale Z</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASWriter_Header()
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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASWriter_XOffset()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getXOffset();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getXOffset <em>XOffset</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASWriter_YOffset()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getYOffset();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getYOffset <em>YOffset</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASWriter_ZOffset()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getZOffset();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getZOffset <em>ZOffset</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASWriter_OutputStream()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.geometry.data3d.las.OutputStream"
	 * @generated
	 */
	OutputStream getOutputStream();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASWriter#getOutputStream <em>Output Stream</em>}' attribute.
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
	 * @model exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.las.IOException"
	 * @generated
	 */
	void write() throws IOException;

} // LASWriter
