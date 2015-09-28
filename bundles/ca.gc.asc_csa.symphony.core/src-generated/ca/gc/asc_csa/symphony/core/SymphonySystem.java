/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractType;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Type;
import ca.gc.asc_csa.topology.bindings.BindingsSet;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Symphony System</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Symphony System.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getTopologyRoot <em>Topology Root</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getBindingSet <em>Binding Set</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getConnectionPointsList <em>Connection Points List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getAssemblyLinksList <em>Assembly Links List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getPoseProvider <em>Pose Provider</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getPoseProviderInstance <em>Pose Provider Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getSymphonySystem()
 * @model
 * @generated
 */
public interface SymphonySystem extends Type {
	/**
	 * Returns the value of the '<em><b>Topology Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topology Root</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Root</em>' containment reference.
	 * @see #setTopologyRoot(TopologyRoot)
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getSymphonySystem_TopologyRoot()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' createChild='true' property='None'"
	 * @generated
	 */
	TopologyRoot getTopologyRoot();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getTopologyRoot <em>Topology Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Root</em>' containment reference.
	 * @see #getTopologyRoot()
	 * @generated
	 */
	void setTopologyRoot(TopologyRoot value);

	/**
	 * Returns the value of the '<em><b>Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Set</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Set</em>' containment reference.
	 * @see #setBindingSet(BindingsSet)
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getSymphonySystem_BindingSet()
	 * @model containment="true"
	 * @generated
	 */
	BindingsSet getBindingSet();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getBindingSet <em>Binding Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Set</em>' containment reference.
	 * @see #getBindingSet()
	 * @generated
	 */
	void setBindingSet(BindingsSet value);

	/**
	 * Returns the value of the '<em><b>Connection Points List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.core.ConnectionPointsList#getSymphonySystem <em>Symphony System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Points List</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Points List</em>' containment reference.
	 * @see #setConnectionPointsList(ConnectionPointsList)
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getSymphonySystem_ConnectionPointsList()
	 * @see ca.gc.asc_csa.symphony.core.ConnectionPointsList#getSymphonySystem
	 * @model opposite="symphonySystem" containment="true"
	 * @generated
	 */
	ConnectionPointsList getConnectionPointsList();

	/**
	 * Sets the value of the '
	 * {@link ca.gc.asc_csa.symphony.core.SymphonySystem#getConnectionPointsList
	 * <em>Connection Points List</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Connection Points List</em>'
	 *            containment reference.
	 * @see #getConnectionPointsList()
	 * @generated
	 */
	void setConnectionPointsList(ConnectionPointsList value);

	/**
	 * Returns the value of the '<em><b>Assembly Links List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Links List</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Links List</em>' containment reference.
	 * @see #setAssemblyLinksList(AssemblyLinksList)
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getSymphonySystem_AssemblyLinksList()
	 * @model containment="true"
	 * @generated
	 */
	AssemblyLinksList getAssemblyLinksList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getAssemblyLinksList <em>Assembly Links List</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Links List</em>' containment reference.
	 * @see #getAssemblyLinksList()
	 * @generated
	 */
	void setAssemblyLinksList(AssemblyLinksList value);

  /**
	 * Returns the value of the '<em><b>Pose Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pose Provider</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pose Provider</em>' reference.
	 * @see #setPoseProvider(AbstractType)
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getSymphonySystem_PoseProvider()
	 * @model
	 * @generated
	 */
  AbstractType getPoseProvider();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getPoseProvider <em>Pose Provider</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Provider</em>' reference.
	 * @see #getPoseProvider()
	 * @generated
	 */
  void setPoseProvider(AbstractType value);

  /**
	 * Returns the value of the '<em><b>Pose Provider Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pose Provider Instance</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pose Provider Instance</em>' reference.
	 * @see #setPoseProviderInstance(PoseProvider)
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getSymphonySystem_PoseProviderInstance()
	 * @model transient="true"
	 * @generated
	 */
  PoseProvider getPoseProviderInstance();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.core.SymphonySystem#getPoseProviderInstance <em>Pose Provider Instance</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Provider Instance</em>' reference.
	 * @see #getPoseProviderInstance()
	 * @generated
	 */
  void setPoseProviderInstance(PoseProvider value);

} // SymphonySystem
