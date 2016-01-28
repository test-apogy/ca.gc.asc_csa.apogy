/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet;
import ca.gc.asc_csa.apogy.core.invocator.AbstractType;
import ca.gc.asc_csa.apogy.core.invocator.Type;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Apogy System</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Apogy System.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ApogySystem#getTopologyRoot <em>Topology Root</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ApogySystem#getBindingSet <em>Binding Set</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ApogySystem#getConnectionPointsList <em>Connection Points List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ApogySystem#getAssemblyLinksList <em>Assembly Links List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ApogySystem#getPoseProvider <em>Pose Provider</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ApogySystem#getPoseProviderInstance <em>Pose Provider Instance</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogySystem()
 * @model
 * @generated
 */
public interface ApogySystem extends Type {
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
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogySystem_TopologyRoot()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' createChild='true' property='None'"
	 * @generated
	 */
	TopologyRoot getTopologyRoot();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ApogySystem#getTopologyRoot <em>Topology Root</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogySystem_BindingSet()
	 * @model containment="true"
	 * @generated
	 */
	BindingsSet getBindingSet();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ApogySystem#getBindingSet <em>Binding Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Set</em>' containment reference.
	 * @see #getBindingSet()
	 * @generated
	 */
	void setBindingSet(BindingsSet value);

	/**
	 * Returns the value of the '<em><b>Connection Points List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.ConnectionPointsList#getApogySystem <em>Apogy System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Points List</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Points List</em>' containment reference.
	 * @see #setConnectionPointsList(ConnectionPointsList)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogySystem_ConnectionPointsList()
	 * @see ca.gc.asc_csa.apogy.core.ConnectionPointsList#getApogySystem
	 * @model opposite="apogySystem" containment="true"
	 * @generated
	 */
	ConnectionPointsList getConnectionPointsList();

	/**
	 * Sets the value of the '
	 * {@link ca.gc.asc_csa.apogy.core.ApogySystem#getConnectionPointsList
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
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogySystem_AssemblyLinksList()
	 * @model containment="true"
	 * @generated
	 */
	AssemblyLinksList getAssemblyLinksList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ApogySystem#getAssemblyLinksList <em>Assembly Links List</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogySystem_PoseProvider()
	 * @model
	 * @generated
	 */
  AbstractType getPoseProvider();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ApogySystem#getPoseProvider <em>Pose Provider</em>}' reference.
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
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogySystem_PoseProviderInstance()
	 * @model transient="true"
	 * @generated
	 */
  PoseProvider getPoseProviderInstance();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ApogySystem#getPoseProviderInstance <em>Pose Provider Instance</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Provider Instance</em>' reference.
	 * @see #getPoseProviderInstance()
	 * @generated
	 */
  void setPoseProviderInstance(PoseProvider value);

} // ApogySystem
