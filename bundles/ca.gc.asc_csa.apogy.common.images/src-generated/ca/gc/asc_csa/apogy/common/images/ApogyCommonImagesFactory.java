/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.images;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage
 * @generated
 */
public interface ApogyCommonImagesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonImagesFactory eINSTANCE = ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EImage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EImage</em>'.
	 * @generated
	 */
	EImage createEImage();

	/**
	 * Returns a new object of class '<em>Images Album</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Images Album</em>'.
	 * @generated
	 */
	ImagesAlbum createImagesAlbum();

	/**
	 * Returns a new object of class '<em>URLE Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URLE Image</em>'.
	 * @generated
	 */
	URLEImage createURLEImage();

	/**
	 * Returns a new object of class '<em>EImages Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EImages Utilities</em>'.
	 * @generated
	 */
	EImagesUtilities createEImagesUtilities();

	/**
	 * Returns a new object of class '<em>Image Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Size</em>'.
	 * @generated
	 */
	ImageSize createImageSize();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCommonImagesPackage getApogyCommonImagesPackage();

} //ApogyCommonImagesFactory
