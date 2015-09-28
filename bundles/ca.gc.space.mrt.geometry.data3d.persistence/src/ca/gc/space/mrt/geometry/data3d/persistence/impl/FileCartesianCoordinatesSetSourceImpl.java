/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileCartesianCoordinatesSetSourceImpl.java,v 1.3.4.2 2015/05/21 15:51:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.persistence.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.vtk.utils.VTKUtils;

import vtk.vtkPolyData;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.persistence.FileCartesianCoordinatesSetSource;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage;
import ca.gc.space.mrt.geometry.data3d.vtk.Data3dVtkFactory;
import ca.gc.space.mrt.geometry.data3d.vtk.VtkPolyData2TriangularMesh;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>File Cartesian Coordinates Set Source</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.persistence.impl.FileCartesianCoordinatesSetSourceImpl#getFileName <em>File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileCartesianCoordinatesSetSourceImpl extends
		CartesianCoordinatesSetSourceImpl implements
		FileCartesianCoordinatesSetSource {
	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FileCartesianCoordinatesSetSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.FILE_CARTESIAN_COORDINATES_SET_SOURCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		dataSet = null;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					PersistencePackage.FILE_CARTESIAN_COORDINATES_SET_SOURCE__FILE_NAME,
					oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.FILE_CARTESIAN_COORDINATES_SET_SOURCE__FILE_NAME:
				return getFileName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersistencePackage.FILE_CARTESIAN_COORDINATES_SET_SOURCE__FILE_NAME:
				setFileName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PersistencePackage.FILE_CARTESIAN_COORDINATES_SET_SOURCE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PersistencePackage.FILE_CARTESIAN_COORDINATES_SET_SOURCE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(')');
		return result.toString();
	}

	@Override
	public CartesianCoordinatesSet getDataSet() {

		// We load the file.
		if (dataSet == null) {
			// We assume, for now, that only vtp files are supported.
			try {
				vtkPolyData data = VTKUtils.loadData(getFileName());

				VtkPolyData2TriangularMesh converter = Data3dVtkFactory.eINSTANCE
						.createVtkPolyData2TriangularMesh();

				CartesianTriangularMesh result = converter.process(data);

				setDataSet(result);

			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		return super.getDataSet();
	}

} // FileCartesianCoordinatesSetSourceImpl
