/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsFacade;
import org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Symphony__CommonTopologyBindingsFacadeImpl extends MinimalEObjectImpl.Container implements Symphony__CommonTopologyBindingsFacade
{
	private static Symphony__CommonTopologyBindingsFacade instance;

	public static Symphony__CommonTopologyBindingsFacade getInstance() {
		if (instance == null) {
			instance = new Symphony__CommonTopologyBindingsFacadeImpl();
		}

		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Symphony__CommonTopologyBindingsFacadeImpl()
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
		return Symphony__CommonTopologyBindingsPackage.Literals.SYMPHONY_COMMON_TOPOLOGY_BINDINGS_FACADE;
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
			case Symphony__CommonTopologyBindingsPackage.SYMPHONY_COMMON_TOPOLOGY_BINDINGS_FACADE___COPY__ABSTRACTTOPOLOGYBINDING_MAP:
				return copy((AbstractTopologyBinding)arguments.get(0), (Map<Node, Node>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Symphony__CommonTopologyBindingsFacadeImpl
