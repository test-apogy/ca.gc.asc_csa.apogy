/**
 * Canadian Space Agency 2011
 */
package org.eclipse.symphony.common.images.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.images.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.images.Symphony__CommonImagesPackage
 * @generated
 */
public class Symphony__CommonImagesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Symphony__CommonImagesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonImagesSwitch() {
		if (modelPackage == null) {
			modelPackage = Symphony__CommonImagesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Symphony__CommonImagesPackage.EIMAGE: {
				EImage eImage = (EImage)theEObject;
				T result = caseEImage(eImage);
				if (result == null) result = caseAbstractEImage(eImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonImagesPackage.IMAGES_ALBUM: {
				ImagesAlbum imagesAlbum = (ImagesAlbum)theEObject;
				T result = caseImagesAlbum(imagesAlbum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonImagesPackage.ABSTRACT_EIMAGE: {
				AbstractEImage abstractEImage = (AbstractEImage)theEObject;
				T result = caseAbstractEImage(abstractEImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonImagesPackage.URLE_IMAGE: {
				URLEImage urleImage = (URLEImage)theEObject;
				T result = caseURLEImage(urleImage);
				if (result == null) result = caseAbstractEImage(urleImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES: {
				EImagesUtilities eImagesUtilities = (EImagesUtilities)theEObject;
				T result = caseEImagesUtilities(eImagesUtilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonImagesPackage.IMAGE_SIZE: {
				ImageSize imageSize = (ImageSize)theEObject;
				T result = caseImageSize(imageSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonImagesPackage.ABSTRACT_EIMAGE_PROVIDER: {
				AbstractEImageProvider abstractEImageProvider = (AbstractEImageProvider)theEObject;
				T result = caseAbstractEImageProvider(abstractEImageProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Images Album</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Images Album</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagesAlbum(ImagesAlbum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EImage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EImage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEImage(EImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract EImage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract EImage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEImage(AbstractEImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URLE Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URLE Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLEImage(URLEImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EImages Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EImages Utilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEImagesUtilities(EImagesUtilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageSize(ImageSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract EImage Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract EImage Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEImageProvider(AbstractEImageProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Symphony__CommonImagesSwitch
