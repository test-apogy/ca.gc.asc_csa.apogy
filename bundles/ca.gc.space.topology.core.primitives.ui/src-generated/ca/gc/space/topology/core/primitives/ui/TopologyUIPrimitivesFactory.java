/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.topology.core.primitives.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.topology.core.primitives.ui.TopologyUIPrimitivesPackage
 * @generated
 */
public interface TopologyUIPrimitivesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopologyUIPrimitivesFactory eINSTANCE = ca.gc.space.topology.core.primitives.ui.impl.TopologyUIPrimitivesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vector Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector Presentation</em>'.
	 * @generated
	 */
	VectorPresentation createVectorPresentation();

	/**
	 * Returns a new object of class '<em>Way Point Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Way Point Presentation</em>'.
	 * @generated
	 */
	WayPointPresentation createWayPointPresentation();

	/**
	 * Returns a new object of class '<em>Label Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Presentation</em>'.
	 * @generated
	 */
	LabelPresentation createLabelPresentation();

	/**
	 * Returns a new object of class '<em>Sphere Primitive Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sphere Primitive Presentation</em>'.
	 * @generated
	 */
	SpherePrimitivePresentation createSpherePrimitivePresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TopologyUIPrimitivesPackage getTopologyUIPrimitivesPackage();

} //TopologyUIPrimitivesFactory
