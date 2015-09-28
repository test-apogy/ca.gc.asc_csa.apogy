/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Filters.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.FilterList#getCameraViewConfiguration <em>Camera View Configuration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.FilterList#getImageFilters <em>Image Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getFilterList()
 * @model
 * @generated
 */
public interface FilterList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Camera View Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getFilterList <em>Filter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The CameraViewConfiguration containing this FilterList.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Camera View Configuration</em>' container reference.
	 * @see #setCameraViewConfiguration(CameraViewConfiguration)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getFilterList_CameraViewConfiguration()
	 * @see ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getFilterList
	 * @model opposite="filterList" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	CameraViewConfiguration getCameraViewConfiguration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.FilterList#getCameraViewConfiguration <em>Camera View Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera View Configuration</em>' container reference.
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
	void setCameraViewConfiguration(CameraViewConfiguration value);

		/**
	 * Returns the value of the '<em><b>Image Filters</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.tools.camera.ImageFilter}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image Filters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Filters</em>' containment reference list.
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getFilterList_ImageFilters()
	 * @model containment="true"
	 * @generated
	 */
  EList<ImageFilter> getImageFilters();

} // FilterList
