/**
 * Canadian Space Agency 2011
 */
package ca.gc.asc_csa.eclipse.images.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.images.core.ImagesCorePackage
 * @generated
 */
public interface ImagesCoreFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2011";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImagesCoreFactory eINSTANCE = ca.gc.asc_csa.eclipse.images.core.impl.ImagesCoreFactoryImpl.init();

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
	 * Returns a new object of class '<em>EImage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EImage</em>'.
	 * @generated
	 */
	EImage createEImage();

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
	ImagesCorePackage getImagesCorePackage();

} //ImagesCoreFactory
