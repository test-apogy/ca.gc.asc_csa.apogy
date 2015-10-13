/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.impl.SymphonyCoreFacadeImpl;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.InvocatorSession;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Symphony Core Facade.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.core.SymphonyCorePackage#getSymphonyCoreFacade()
 * @model
 * @generated
 */
public interface SymphonyCoreFacade extends EObject {
	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" symphonySystemUnique="false" relativePoseUnique="false"
	 * @generated
	 */
  Matrix4x4 computeAbsolutePoseMatrix(SymphonySystem symphonySystem, Matrix4x4 relativePose);

  /**
	 * @generated_NOT
	 */
	public static SymphonyCoreFacade INSTANCE = SymphonyCoreFacadeImpl
			.getInstance();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model unique="false" resultUnique="false"
	 * @generated
	 */
	ResultNode createResultNode(PositionedResult result);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model unique="false" createEnvironmentUnique="false" createProgramsUnique="false" createDataProductsUnique="false" createToolsUnique="false"
	 * @generated
	 */
	InvocatorSession createSymphonySession(boolean createEnvironment,
			boolean createPrograms, boolean createDataProducts,
			boolean createTools);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Searches and returns the {@link SymphonySystem} instance based on the specified fullyQualifiedName.
	 * @param environment Environment from which the search will be performed.
	 * @param param fullyQualifiedName Fully qualified name that refers the {@link SymphonySystem} instance.
	 * @return Reference to the {@link SymphonySystem} that matches the fully qualified name or null if not found.
	 * <!-- end-model-doc -->
	 * @model unique="false" environmentUnique="false" fullyQualifiedNameUnique="false"
	 * @generated
	 */
  SymphonySystem getSymphonySystem(Environment environment, String fullyQualifiedName);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Loads FeatureOfInterest from file.
	 * @param url The URL locating the file.
	 * @return The list of loaded FeatureOfInterest.
	 * @throws An Exception if the file could not be loaded.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.core.List<org.eclipse.symphony.core.FeatureOfInterest>" unique="false" many="false" exceptions="org.eclipse.symphony.core.Exception" urlUnique="false"
	 * @generated
	 */
	List<FeatureOfInterest> loadFeatureOfInterestFromFile(String url) throws Exception;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Saves a list of FeatureOfInterest to file (in CSV format).
	 * @param path The path to the file.
	 * @param foiList The list of FeatureOfInterest.
	 * @throws An Exception if the file could not be saved.
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.symphony.core.Exception" pathUnique="false" foiListDataType="org.eclipse.symphony.core.List<org.eclipse.symphony.core.FeatureOfInterest>" foiListUnique="false" foiListMany="false"
	 * @generated
	 */
	void saveFeatureOfInterestToFile(String path, List<FeatureOfInterest> foiList) throws Exception;

} // SymphonyCoreFacade
