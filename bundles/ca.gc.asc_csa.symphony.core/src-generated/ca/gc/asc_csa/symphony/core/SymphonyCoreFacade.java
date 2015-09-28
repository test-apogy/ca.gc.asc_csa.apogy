/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.symphony.core.impl.SymphonyCoreFacadeImpl;
import ca.gc.space.math.Matrix4x4;
import java.util.List;

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
 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getSymphonyCoreFacade()
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
	 * @model dataType="ca.gc.asc_csa.symphony.core.List<ca.gc.asc_csa.symphony.core.FeatureOfInterest>" unique="false" many="false" exceptions="ca.gc.asc_csa.symphony.core.Exception" urlUnique="false"
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
	 * @model exceptions="ca.gc.asc_csa.symphony.core.Exception" pathUnique="false" foiListDataType="ca.gc.asc_csa.symphony.core.List<ca.gc.asc_csa.symphony.core.FeatureOfInterest>" foiListUnique="false" foiListMany="false"
	 * @generated
	 */
	void saveFeatureOfInterestToFile(String path, List<FeatureOfInterest> foiList) throws Exception;

} // SymphonyCoreFacade
