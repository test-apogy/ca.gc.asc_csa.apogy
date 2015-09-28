/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitivesAdapterFactory.java,v 1.11.2.3 2015/02/03 20:01:31 rlarcheveque Exp $
 */
package ca.gc.space.topology.core.primitives.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ca.gc.space.topology.AggregateGroupNode;
import ca.gc.space.topology.GroupNode;
import ca.gc.space.topology.Leaf;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.core.primitives.*;
import ca.gc.space.topology.core.primitives.AmbientLight;
import ca.gc.space.topology.core.primitives.DirectionalLight;
import ca.gc.space.topology.core.primitives.Label;
import ca.gc.space.topology.core.primitives.Light;
import ca.gc.space.topology.core.primitives.Plane;
import ca.gc.space.topology.core.primitives.PointLight;
import ca.gc.space.topology.core.primitives.PrimitivesFacade;
import ca.gc.space.topology.core.primitives.PrimitivesPackage;
import ca.gc.space.topology.core.primitives.SpherePrimitive;
import ca.gc.space.topology.core.primitives.SpotLight;
import ca.gc.space.topology.core.primitives.Vector;
import ca.gc.space.topology.core.primitives.WayPoint;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage
 * @generated
 */
public class PrimitivesAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PrimitivesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitivesAdapterFactory()
	{
		if (modelPackage == null) {
			modelPackage = PrimitivesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitivesSwitch<Adapter> modelSwitch =
		new PrimitivesSwitch<Adapter>() {
			@Override
			public Adapter caseVector(Vector object) {
				return createVectorAdapter();
			}
			@Override
			public Adapter casePickVector(PickVector object) {
				return createPickVectorAdapter();
			}
			@Override
			public Adapter casePrimitivesFacade(PrimitivesFacade object) {
				return createPrimitivesFacadeAdapter();
			}
			@Override
			public Adapter casePlane(Plane object) {
				return createPlaneAdapter();
			}
			@Override
			public Adapter caseWayPoint(WayPoint object) {
				return createWayPointAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseSpherePrimitive(SpherePrimitive object) {
				return createSpherePrimitiveAdapter();
			}
			@Override
			public Adapter caseLight(Light object) {
				return createLightAdapter();
			}
			@Override
			public Adapter caseAmbientLight(AmbientLight object) {
				return createAmbientLightAdapter();
			}
			@Override
			public Adapter caseDirectionalLight(DirectionalLight object) {
				return createDirectionalLightAdapter();
			}
			@Override
			public Adapter casePointLight(PointLight object) {
				return createPointLightAdapter();
			}
			@Override
			public Adapter caseSpotLight(SpotLight object) {
				return createSpotLightAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseGroupNode(GroupNode object) {
				return createGroupNodeAdapter();
			}
			@Override
			public Adapter caseAggregateGroupNode(AggregateGroupNode object) {
				return createAggregateGroupNodeAdapter();
			}
			@Override
			public Adapter caseLeaf(Leaf object) {
				return createLeafAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.core.primitives.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.core.primitives.Vector
	 * @generated
	 */
	public Adapter createVectorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.core.primitives.PickVector <em>Pick Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.core.primitives.PickVector
	 * @generated
	 */
	public Adapter createPickVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.core.primitives.PrimitivesFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.core.primitives.PrimitivesFacade
	 * @generated
	 */
	public Adapter createPrimitivesFacadeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.core.primitives.Plane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.core.primitives.Plane
	 * @generated
	 */
	public Adapter createPlaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.core.primitives.WayPoint <em>Way Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.core.primitives.WayPoint
	 * @generated
	 */
	public Adapter createWayPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.core.primitives.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.core.primitives.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.core.primitives.SpherePrimitive <em>Sphere Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.core.primitives.SpherePrimitive
	 * @generated
	 */
	public Adapter createSpherePrimitiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.core.primitives.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.core.primitives.Light
	 * @generated
	 */
	public Adapter createLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.core.primitives.AmbientLight <em>Ambient Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.core.primitives.AmbientLight
	 * @generated
	 */
	public Adapter createAmbientLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.core.primitives.DirectionalLight <em>Directional Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.core.primitives.DirectionalLight
	 * @generated
	 */
	public Adapter createDirectionalLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.core.primitives.PointLight <em>Point Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.core.primitives.PointLight
	 * @generated
	 */
	public Adapter createPointLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.core.primitives.SpotLight <em>Spot Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.core.primitives.SpotLight
	 * @generated
	 */
	public Adapter createSpotLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.Node
	 * @generated
	 */
	public Adapter createNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.GroupNode <em>Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.GroupNode
	 * @generated
	 */
	public Adapter createGroupNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.AggregateGroupNode <em>Aggregate Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.AggregateGroupNode
	 * @generated
	 */
	public Adapter createAggregateGroupNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.Leaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.Leaf
	 * @generated
	 */
	public Adapter createLeafAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //PrimitivesAdapterFactory
