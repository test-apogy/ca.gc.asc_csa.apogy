/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.topology.bindings.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.topology.bindings.AbstractTopologyBinding;
import ca.gc.asc_csa.topology.bindings.TopologyBindingsFacade;
import ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage;
import ca.gc.space.topology.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TopologyBindingsFacadeImpl extends MinimalEObjectImpl.Container implements TopologyBindingsFacade
{
	private static TopologyBindingsFacade instance;

	public static TopologyBindingsFacade getInstance() {
		if (instance == null) {
			instance = new TopologyBindingsFacadeImpl();
		}

		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TopologyBindingsFacadeImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return TopologyBindingsPackage.Literals.TOPOLOGY_BINDINGS_FACADE;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public AbstractTopologyBinding copy(AbstractTopologyBinding originalBinding, Map<Node, Node> originalToCopyNodeMap)
  {
	  return originalBinding.clone(originalToCopyNodeMap);	  	
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  @SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case TopologyBindingsPackage.TOPOLOGY_BINDINGS_FACADE___COPY__ABSTRACTTOPOLOGYBINDING_MAP:
				return copy((AbstractTopologyBinding)arguments.get(0), (Map<Node, Node>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TopologyBindingsFacadeImpl
