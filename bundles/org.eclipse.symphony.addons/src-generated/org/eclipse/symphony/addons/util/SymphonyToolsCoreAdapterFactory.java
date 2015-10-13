/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.AbstractTool;
import org.eclipse.symphony.addons.AbstractTwoPoints3DTool;
import org.eclipse.symphony.addons.FeatureOfInterestPickingTool;
import org.eclipse.symphony.addons.Ruler3DTool;
import org.eclipse.symphony.addons.Ruler3dToolNode;
import org.eclipse.symphony.addons.Simple3DTool;
import org.eclipse.symphony.addons.SimpleTool;
import org.eclipse.symphony.addons.SimpleToolList;
import org.eclipse.symphony.addons.SunVector3DTool;
import org.eclipse.symphony.addons.SunVector3DToolNode;
import org.eclipse.symphony.addons.SymphonyToolsCorePackage;
import org.eclipse.symphony.addons.Trajectory3DTool;
import org.eclipse.symphony.addons.Trajectory3DToolNode;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.SymphonyToolsCorePackage
 * @generated
 */
public class SymphonyToolsCoreAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static SymphonyToolsCorePackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyToolsCoreAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = SymphonyToolsCorePackage.eINSTANCE;
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
  protected SymphonyToolsCoreSwitch<Adapter> modelSwitch =
    new SymphonyToolsCoreSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractTool(AbstractTool object) {
				return createAbstractToolAdapter();
			}
			@Override
			public Adapter caseSimpleToolList(SimpleToolList object) {
				return createSimpleToolListAdapter();
			}
			@Override
			public Adapter caseSimpleTool(SimpleTool object) {
				return createSimpleToolAdapter();
			}
			@Override
			public Adapter caseSimple3DTool(Simple3DTool object) {
				return createSimple3DToolAdapter();
			}
			@Override
			public Adapter caseAbstractTwoPoints3DTool(AbstractTwoPoints3DTool object) {
				return createAbstractTwoPoints3DToolAdapter();
			}
			@Override
			public Adapter caseRuler3DTool(Ruler3DTool object) {
				return createRuler3DToolAdapter();
			}
			@Override
			public Adapter caseRuler3dToolNode(Ruler3dToolNode object) {
				return createRuler3dToolNodeAdapter();
			}
			@Override
			public Adapter caseFeatureOfInterestPickingTool(FeatureOfInterestPickingTool object) {
				return createFeatureOfInterestPickingToolAdapter();
			}
			@Override
			public Adapter caseSunVector3DTool(SunVector3DTool object) {
				return createSunVector3DToolAdapter();
			}
			@Override
			public Adapter caseSunVector3DToolNode(SunVector3DToolNode object) {
				return createSunVector3DToolNodeAdapter();
			}
			@Override
			public Adapter caseTrajectory3DTool(Trajectory3DTool object) {
				return createTrajectory3DToolAdapter();
			}
			@Override
			public Adapter caseTrajectory3DToolNode(Trajectory3DToolNode object) {
				return createTrajectory3DToolNodeAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseAbstractToolsListContainer(AbstractToolsListContainer object) {
				return createAbstractToolsListContainerAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.AbstractTool <em>Abstract Tool</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.AbstractTool
	 * @generated
	 */
  public Adapter createAbstractToolAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.SimpleToolList <em>Simple Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.SimpleToolList
	 * @generated
	 */
	public Adapter createSimpleToolListAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.SimpleTool <em>Simple Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.SimpleTool
	 * @generated
	 */
	public Adapter createSimpleToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.Simple3DTool <em>Simple3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.Simple3DTool
	 * @generated
	 */
	public Adapter createSimple3DToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool <em>Abstract Two Points3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.AbstractTwoPoints3DTool
	 * @generated
	 */
	public Adapter createAbstractTwoPoints3DToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.Ruler3DTool <em>Ruler3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.Ruler3DTool
	 * @generated
	 */
	public Adapter createRuler3DToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.Ruler3dToolNode <em>Ruler3d Tool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.Ruler3dToolNode
	 * @generated
	 */
	public Adapter createRuler3dToolNodeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool <em>Feature Of Interest Picking Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.FeatureOfInterestPickingTool
	 * @generated
	 */
	public Adapter createFeatureOfInterestPickingToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.SunVector3DTool <em>Sun Vector3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.SunVector3DTool
	 * @generated
	 */
	public Adapter createSunVector3DToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.SunVector3DToolNode <em>Sun Vector3 DTool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.SunVector3DToolNode
	 * @generated
	 */
	public Adapter createSunVector3DToolNodeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.Trajectory3DTool <em>Trajectory3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.Trajectory3DTool
	 * @generated
	 */
	public Adapter createTrajectory3DToolAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.Trajectory3DToolNode <em>Trajectory3 DTool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.Trajectory3DToolNode
	 * @generated
	 */
	public Adapter createTrajectory3DToolNodeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Named
	 * @generated
	 */
  public Adapter createNamedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Described
	 * @generated
	 */
  public Adapter createDescribedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.invocator.AbstractToolsListContainer <em>Abstract Tools List Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.invocator.AbstractToolsListContainer
	 * @generated
	 */
	public Adapter createAbstractToolsListContainerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.GroupNode <em>Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.GroupNode
	 * @generated
	 */
	public Adapter createGroupNodeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.AggregateGroupNode <em>Aggregate Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.AggregateGroupNode
	 * @generated
	 */
	public Adapter createAggregateGroupNodeAdapter() {
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

} //SymphonyToolsCoreAdapterFactory
