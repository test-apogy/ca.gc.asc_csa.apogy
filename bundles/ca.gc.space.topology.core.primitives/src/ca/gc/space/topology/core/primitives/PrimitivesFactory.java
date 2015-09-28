/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitivesFactory.java,v 1.7.2.3 2015/02/03 20:01:31 rlarcheveque Exp $
 */
package ca.gc.space.topology.core.primitives;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage
 * @generated
 */
public interface PrimitivesFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrimitivesFactory eINSTANCE = ca.gc.space.topology.core.primitives.impl.PrimitivesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector</em>'.
	 * @generated
	 */
	Vector createVector();

	/**
	 * Returns a new object of class '<em>Pick Vector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pick Vector</em>'.
	 * @generated
	 */
	PickVector createPickVector();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	PrimitivesFacade createPrimitivesFacade();

	/**
	 * Returns a new object of class '<em>Plane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plane</em>'.
	 * @generated
	 */
	Plane createPlane();

	/**
	 * Returns a new object of class '<em>Way Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Way Point</em>'.
	 * @generated
	 */
	WayPoint createWayPoint();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Sphere Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sphere Primitive</em>'.
	 * @generated
	 */
	SpherePrimitive createSpherePrimitive();

	/**
	 * Returns a new object of class '<em>Ambient Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ambient Light</em>'.
	 * @generated
	 */
	AmbientLight createAmbientLight();

	/**
	 * Returns a new object of class '<em>Directional Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directional Light</em>'.
	 * @generated
	 */
	DirectionalLight createDirectionalLight();

	/**
	 * Returns a new object of class '<em>Point Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Light</em>'.
	 * @generated
	 */
	PointLight createPointLight();

	/**
	 * Returns a new object of class '<em>Spot Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spot Light</em>'.
	 * @generated
	 */
	SpotLight createSpotLight();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PrimitivesPackage getPrimitivesPackage();

} //PrimitivesFactory
