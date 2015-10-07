/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import ca.gc.asc_csa.eclipse.emf.ecore.TimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.TimeSourcesList;
import ca.gc.asc_csa.eclipse.emf.ecore.Timed;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Symphony Environment</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Symphony Environment.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.SymphonyEnvironment#getWorksitesList <em>Worksites List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.SymphonyEnvironment#getActiveWorksite <em>Active Worksite</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.SymphonyEnvironment#getSymphonyTopology <em>Symphony Topology</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.SymphonyEnvironment#getTimeSourcesList <em>Time Sources List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.SymphonyEnvironment#getActiveTimeSource <em>Active Time Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.SymphonyCorePackage#getSymphonyEnvironment()
 * @model
 * @generated
 */
public interface SymphonyEnvironment extends Environment, Timed {
	/**
	 * Returns the value of the '<em><b>Worksites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worksites List</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksites List</em>' containment reference.
	 * @see #setWorksitesList(WorksitesList)
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#getSymphonyEnvironment_WorksitesList()
	 * @model containment="true"
	 * @generated
	 */
	WorksitesList getWorksitesList();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.SymphonyEnvironment#getWorksitesList <em>Worksites List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worksites List</em>' containment reference.
	 * @see #getWorksitesList()
	 * @generated
	 */
	void setWorksitesList(WorksitesList value);

	/**
	 * Returns the value of the '<em><b>Active Worksite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Worksite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The worksite currently active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Worksite</em>' reference.
	 * @see #setActiveWorksite(AbstractWorksite)
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#getSymphonyEnvironment_ActiveWorksite()
	 * @model
	 * @generated
	 */
	AbstractWorksite getActiveWorksite();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.SymphonyEnvironment#getActiveWorksite <em>Active Worksite</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Active Worksite</em>' reference.
	 * @see #getActiveWorksite()
	 * @generated
	 */
	void setActiveWorksite(AbstractWorksite value);

	/**
	 * Returns the value of the '<em><b>Symphony Topology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symphony Topology</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symphony Topology</em>' reference.
	 * @see #setSymphonyTopology(SymphonyTopology)
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#getSymphonyEnvironment_SymphonyTopology()
	 * @model transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
	SymphonyTopology getSymphonyTopology();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.SymphonyEnvironment#getSymphonyTopology <em>Symphony Topology</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Symphony Topology</em>' reference.
	 * @see #getSymphonyTopology()
	 * @generated
	 */
	void setSymphonyTopology(SymphonyTopology value);

	/**
	 * Returns the value of the '<em><b>Time Sources List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of available time sources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Sources List</em>' containment reference.
	 * @see #setTimeSourcesList(TimeSourcesList)
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#getSymphonyEnvironment_TimeSourcesList()
	 * @model containment="true"
	 * @generated
	 */
	TimeSourcesList getTimeSourcesList();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.SymphonyEnvironment#getTimeSourcesList <em>Time Sources List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Sources List</em>' containment reference.
	 * @see #getTimeSourcesList()
	 * @generated
	 */
	void setTimeSourcesList(TimeSourcesList value);

	/**
	 * Returns the value of the '<em><b>Active Time Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time source currently providing time used to drive the environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Time Source</em>' reference.
	 * @see #setActiveTimeSource(TimeSource)
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#getSymphonyEnvironment_ActiveTimeSource()
	 * @model
	 * @generated
	 */
	TimeSource getActiveTimeSource();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.SymphonyEnvironment#getActiveTimeSource <em>Active Time Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Time Source</em>' reference.
	 * @see #getActiveTimeSource()
	 * @generated
	 */
	void setActiveTimeSource(TimeSource value);

} // SymphonyEnvironment
