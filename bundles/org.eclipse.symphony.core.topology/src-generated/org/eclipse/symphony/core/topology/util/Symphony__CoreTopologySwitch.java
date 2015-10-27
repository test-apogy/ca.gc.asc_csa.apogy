/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ReferencedGroupNode;
import org.eclipse.symphony.core.topology.SymphonyEnvironmentNode;
import org.eclipse.symphony.core.topology.SymphonySystemAPIsNode;
import org.eclipse.symphony.core.topology.Symphony__CoreTopologyFacade;
import org.eclipse.symphony.core.topology.Symphony__CoreTopologyPackage;
import org.eclipse.symphony.core.topology.SystemsTopologyAdapter;

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
 * @see org.eclipse.symphony.core.topology.Symphony__CoreTopologyPackage
 * @generated
 */
public class Symphony__CoreTopologySwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static Symphony__CoreTopologyPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__CoreTopologySwitch()
  {
		if (modelPackage == null) {
			modelPackage = Symphony__CoreTopologyPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case Symphony__CoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER: {
				SystemsTopologyAdapter systemsTopologyAdapter = (SystemsTopologyAdapter)theEObject;
				T result = caseSystemsTopologyAdapter(systemsTopologyAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreTopologyPackage.SYMPHONY_ENVIRONMENT_NODE: {
				SymphonyEnvironmentNode symphonyEnvironmentNode = (SymphonyEnvironmentNode)theEObject;
				T result = caseSymphonyEnvironmentNode(symphonyEnvironmentNode);
				if (result == null) result = caseReferencedGroupNode(symphonyEnvironmentNode);
				if (result == null) result = caseGroupNode(symphonyEnvironmentNode);
				if (result == null) result = caseNode(symphonyEnvironmentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreTopologyPackage.SYMPHONY_SYSTEM_AP_IS_NODE: {
				SymphonySystemAPIsNode symphonySystemAPIsNode = (SymphonySystemAPIsNode)theEObject;
				T result = caseSymphonySystemAPIsNode(symphonySystemAPIsNode);
				if (result == null) result = caseReferencedGroupNode(symphonySystemAPIsNode);
				if (result == null) result = caseGroupNode(symphonySystemAPIsNode);
				if (result == null) result = caseNode(symphonySystemAPIsNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreTopologyPackage.SYMPHONY_CORE_TOPOLOGY_FACADE: {
				Symphony__CoreTopologyFacade symphony__CoreTopologyFacade = (Symphony__CoreTopologyFacade)theEObject;
				T result = caseSymphony__CoreTopologyFacade(symphony__CoreTopologyFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Systems Topology Adapter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systems Topology Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSystemsTopologyAdapter(SystemsTopologyAdapter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Symphony Environment Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symphony Environment Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSymphonyEnvironmentNode(SymphonyEnvironmentNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Symphony System AP Is Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symphony System AP Is Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSymphonySystemAPIsNode(SymphonySystemAPIsNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymphony__CoreTopologyFacade(Symphony__CoreTopologyFacade object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNode(Node object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseGroupNode(GroupNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Referenced Group Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenced Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseReferencedGroupNode(ReferencedGroupNode object)
  {
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
  public T defaultCase(EObject object)
  {
		return null;
	}

} //Symphony__CoreTopologySwitch
