/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangular Region Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Interface that provides a RectangularRegion.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getRectangularRegionProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RectangularRegionProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the RectangularRegion defined by the object.
	 * @return The RectangularRegion defined by the object, never null.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	RectangularRegion getRegion();

} // RectangularRegionProvider
