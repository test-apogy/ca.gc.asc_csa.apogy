/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.Tuple3d;

import ca.gc.asc_csa.eclipse.emf.ecore.CurrentTimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.TimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.TimeSourcesList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AttributeResultValue;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResultsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ReferenceResultValue;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ToolsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeApiAdapter;
import ca.gc.asc_csa.symphony.core.FeatureOfInterest;
import ca.gc.asc_csa.symphony.core.PositionedResult;
import ca.gc.asc_csa.symphony.core.ResultNode;
import ca.gc.asc_csa.symphony.core.SymphonyCoreFacade;
import ca.gc.asc_csa.symphony.core.SymphonyCoreFactory;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.core.SymphonyEnvironment;
import ca.gc.asc_csa.symphony.core.SymphonySystem;
import ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter;
import ca.gc.asc_csa.symphony.core.WorksitesList;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ReferencedContentNode;
import ca.gc.space.topology.TopologyFacade;
import ca.gc.space.topology.TransformNode;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SymphonyCoreFacadeImpl extends MinimalEObjectImpl.Container
		implements SymphonyCoreFacade {
	private static SymphonyCoreFacade instance = null;

	public static SymphonyCoreFacade getInstance() {
		if (instance == null) {
			instance = new SymphonyCoreFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SymphonyCoreFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCorePackage.Literals.SYMPHONY_CORE_FACADE;
	}

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Matrix4x4 computeAbsolutePoseMatrix(SymphonySystem symphonySystem, Matrix4x4 relativePose)
  {
	  	// Gets system pose.
		Node root = TopologyFacade.INSTANCE.findRoot(symphonySystem.getTopologyRoot().getOriginNode());
						
		Matrix4d systemPose = TopologyFacade.INSTANCE.expressInFrame(symphonySystem.getTopologyRoot().getOriginNode(), root);	  	  	
		
		// Gets the system centric result.
		Matrix4x4 pose = relativePose;
		Matrix4d matrix = new Matrix4d();
		matrix.setIdentity();
		if (pose != null) matrix = pose.asMatrix4d();
		
		// Create the absolute position result.
		Matrix4d m = new Matrix4d();
		m.setIdentity();		
		m.mul(systemPose, matrix);			

		return MathFacade.INSTANCE.createMatrix4x4(m);
  }

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@SuppressWarnings("rawtypes")
	public ResultNode createResultNode(PositionedResult result) 
	{
		// Creates the ResultNode.
		ResultNode resultNode = SymphonyCoreFactory.eINSTANCE
				.createResultNode();
		resultNode.setResult(result);

		// Sets the time as the ID
		resultNode.setNodeId(Long.toString(result.getTime().getTime()));

		// Attaches the result itself to the ResultNode.
		if (result.getResultValue() instanceof AttributeResultValue) 
		{
			AttributeResultValue attributeResultValue = (AttributeResultValue) result.getResultValue();

			if (attributeResultValue.getValue() != null) 
			{
				// TODO : Adds a marker in the topology ?
			}
		} 
		else if (result.getResultValue() instanceof ReferenceResultValue) 
		{
			ReferenceResultValue referenceResultValue = (ReferenceResultValue) result.getResultValue();
			if (referenceResultValue.getValue() != null) 
			{
				if (referenceResultValue.getValue() instanceof Node) 
				{
					// TODO : Do not copy the Node when bug#1429 in Link and
					// ReferenceGroupNode is fixed.
					Node node = EcoreUtil.copy((Node) referenceResultValue.getValue());
					resultNode.getChildren().add(node);
				} 
				else 
				{
					// Creates and adds a ReferencedContentNode with the result as its content.
					EObject content = (EObject) referenceResultValue.getValue();
					ReferencedContentNode contentNode = TopologyFacade.INSTANCE.createReferencedContentNode(content);

					// Adds a the node via a ReferenceNode under the DataProductNode.
					resultNode.getChildren().add(contentNode);
				}
			}
		}

		return resultNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public InvocatorSession createSymphonySession(boolean createEnvironment,
			boolean createPrograms, boolean createDataProducts,
			boolean createTools) {
		InvocatorSession session = EMFEcoreInvocatorFactory.eINSTANCE
				.createInvocatorSession();
		Context context = null;

		if (createEnvironment) {
			SymphonyEnvironment environment = SymphonyCoreFactory.eINSTANCE
					.createSymphonyEnvironment();
			environment.setTypesList(EMFEcoreInvocatorFactory.eINSTANCE
					.createTypesList());
			environment.setVariablesList(EMFEcoreInvocatorFactory.eINSTANCE
					.createVariablesList());
			environment.setContextsList(EMFEcoreInvocatorFactory.eINSTANCE
					.createContextsList());

			/** Create a default Context */
			context = EMFEcoreInvocatorFactory.eINSTANCE.createBasicContext();
			context.setName("Default");
			environment.getContextsList().getContexts().add(context);
			environment.setActiveContext(context);
			
			/** Creates the Worksites List */
			WorksitesList worksitesList =  SymphonyCoreFactory.eINSTANCE.createWorksitesList();
			environment.setWorksitesList(worksitesList);
						
			/** Creates the Timesource.*/
			TimeSourcesList timeSourcesList = EMFEcoreFactory.eINSTANCE.createTimeSourcesList();
			
			// Fills in the TimeSource List.
			timeSourcesList.getTimeSources().addAll(getAllAvaibleTimeSource());						
			environment.setTimeSourcesList(timeSourcesList);
			
			// Sets the environment time source to the CurrentTimeSource.
			environment.setActiveTimeSource(getCurrentTimeSource(timeSourcesList.getTimeSources()));
			
			session.setEnvironment(environment);
		}

		if (createPrograms) {
			session.setProgramsList(EMFEcoreInvocatorFactory.eINSTANCE
					.createProgramsList());
		}

		if (createDataProducts) {
			DataProductsListsContainer listsContainer = EMFEcoreInvocatorFactory.eINSTANCE
					.createDataProductsListsContainer();
			DataProductsList dataProductsList = EMFEcoreInvocatorFactory.eINSTANCE
					.createDataProductsList();
			listsContainer.getDataProductsList().add(dataProductsList);
			session.setDataProductsListContainer(listsContainer);
			
			OperationCallResultsList operationCallResultsList = EMFEcoreInvocatorFactory.eINSTANCE.createOperationCallResultsList();
			dataProductsList.setOperationCallResultsList(operationCallResultsList);			

			if (context != null) {
				context.setDataProductsList(dataProductsList);
			}
		}

		if (createTools) {
			ToolsList toolsList = EMFEcoreInvocatorFactory.eINSTANCE
					.createToolsList();
			session.setToolsList(toolsList);
		}
		
		return session;
	}

	
	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SymphonySystem getSymphonySystem(Environment environment, String fullyQualifiedName)
  {
	  SymphonySystem result = null;
	  AbstractTypeImplementation typeImplementation = EMFEcoreInvocatorFacade.INSTANCE.getTypeImplementation(environment, fullyQualifiedName);
	  
	  if (typeImplementation != null){
		  TypeApiAdapter typeApiAdapter = typeImplementation.getAdapterInstance();
		  
		  if (typeApiAdapter instanceof SymphonySystemApiAdapter){
			  SymphonySystemApiAdapter symphonySystemApiAdapter = (SymphonySystemApiAdapter) typeApiAdapter;
			  result = symphonySystemApiAdapter.getSymphonySystem();
		  }
	  }
	  
	  return result;	  
  }

  	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<FeatureOfInterest> loadFeatureOfInterestFromFile(String urlString) throws Exception 
	{
		List<FeatureOfInterest> foiList = new ArrayList<FeatureOfInterest>();
		
		URL url = new URL(urlString);
		File tempFile = copyURLContent(url);		
		BufferedReader reader = new BufferedReader(new FileReader(tempFile));
		
		String line = null;
		while ((line = reader.readLine()) != null) 
		{		
			line = line.trim();
			FeatureOfInterest foi = parserCSVLine(line);
			if(foi != null)
			{
				foiList.add(foi);
			}
		}
		
		reader.close();
		
		return foiList;
	}

	private FeatureOfInterest parserCSVLine(String line) throws Exception
	{
		FeatureOfInterest foi = null;
		
		String[] entries = line.split(",");
		
		if(entries.length < 8)
		{
			throw new Exception("Line <" + line + "> contains too few entries !");
		}
		
		String name = entries[0];
		String description = entries[1];
		double x = Double.parseDouble(entries[2]);
		double y = Double.parseDouble(entries[3]);
		double z = Double.parseDouble(entries[4]);
		
		double rx = Double.parseDouble(entries[5]);
		double ry = Double.parseDouble(entries[6]);
		double rz = Double.parseDouble(entries[7]);
		
		foi = SymphonyCoreFactory.eINSTANCE.createFeatureOfInterest();
		foi.setName(name);
		foi.setDescription(description);
		
		// Sets pose.
		TransformNode tmp = TopologyFacade.INSTANCE.createTransformNodeXYZ(x, y, z, rx, ry, rz);
		Matrix4d m  = tmp.asMatrix4d();		
		foi.setPose(MathFacade.INSTANCE.createMatrix4x4(m));
		
		return foi;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void saveFeatureOfInterestToFile(String path, List<FeatureOfInterest> foiList) throws Exception 
	{		
		// Converts the FOI to CSV format
		String cvsData = convertToCSV(foiList);
		
		// Write data to the file.
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
	    writer.write (cvsData);
	    writer.close();
	}

	private String convertToCSV(List<FeatureOfInterest> foiList)
	{
		String csvString = new String();
		
		for(FeatureOfInterest foi : foiList)
		{
			if(foi.getName() != null)
			{
				// Replace comma by space				
				csvString += foi.getName().replaceAll(",", ";") + ",";
			}
			else
			{
				csvString += ",";
			}			
			
			if(foi.getDescription() != null)
			{
				// Replace comma by space		
				csvString += foi.getDescription().replaceAll(",", ";") + ",";
			}
			else
			{
				csvString += ",";
			}						
			
			Tuple3d position = MathFacade.INSTANCE.extractPosition(foi.getPose());
			
			csvString += position.getX() + ",";
			csvString += position.getY() + ",";
			csvString += position.getZ() + ",";
			
			Tuple3d orientation = MathFacade.INSTANCE.extractOrientation(foi.getPose());
			csvString += orientation.getX() + ",";
			csvString += orientation.getY() + ",";
			csvString += orientation.getZ() + "\n";
			
		}
		
		return csvString;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case SymphonyCorePackage.SYMPHONY_CORE_FACADE___COMPUTE_ABSOLUTE_POSE_MATRIX__SYMPHONYSYSTEM_MATRIX4X4:
				return computeAbsolutePoseMatrix((SymphonySystem)arguments.get(0), (Matrix4x4)arguments.get(1));
			case SymphonyCorePackage.SYMPHONY_CORE_FACADE___CREATE_RESULT_NODE__POSITIONEDRESULT:
				return createResultNode((PositionedResult)arguments.get(0));
			case SymphonyCorePackage.SYMPHONY_CORE_FACADE___CREATE_SYMPHONY_SESSION__BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN:
				return createSymphonySession((Boolean)arguments.get(0), (Boolean)arguments.get(1), (Boolean)arguments.get(2), (Boolean)arguments.get(3));
			case SymphonyCorePackage.SYMPHONY_CORE_FACADE___GET_SYMPHONY_SYSTEM__ENVIRONMENT_STRING:
				return getSymphonySystem((Environment)arguments.get(0), (String)arguments.get(1));
			case SymphonyCorePackage.SYMPHONY_CORE_FACADE___LOAD_FEATURE_OF_INTEREST_FROM_FILE__STRING:
				try {
					return loadFeatureOfInterestFromFile((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyCorePackage.SYMPHONY_CORE_FACADE___SAVE_FEATURE_OF_INTEREST_TO_FILE__STRING_LIST:
				try {
					saveFeatureOfInterestToFile((String)arguments.get(0), (List<FeatureOfInterest>)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	private List<TimeSource> getAllAvaibleTimeSource()
	{
		List<TimeSource> timeSources = new ArrayList<TimeSource>();
		
		List<EClass> timeSourceEClass = EMFEcoreFacade.INSTANCE.getAllSubEClasses(EMFEcorePackage.Literals.TIME_SOURCE);
		
		for(EClass eClass : timeSourceEClass)
		{
			try
			{
				EObject eObject = EcoreUtil.create(eClass);
				if(eObject instanceof TimeSource)
				{
					timeSources.add((TimeSource) eObject);
				}
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
		
		return timeSources;
	}
	
	private CurrentTimeSource getCurrentTimeSource(Collection<TimeSource> timeSources)
	{
		CurrentTimeSource currentTimeSource = null;
		
		Iterator<TimeSource> it = timeSources.iterator();
		while(it.hasNext() && currentTimeSource == null)
		{
			TimeSource timeSource = it.next();
			if(timeSource instanceof CurrentTimeSource)
			{
				currentTimeSource = (CurrentTimeSource) timeSource;
			}
		}
		
		return currentTimeSource;
	}
	
	private File copyURLContent(URL url) throws Exception
	{		
		File tempFile = null;
			
		String fileName = getFileName(url);
		String fileExtension = getFileExtension(url);
				
		tempFile = File.createTempFile(fileName, fileExtension);
							
		url.openConnection();
		InputStream reader = url.openStream();
	 			 	    	   		
		FileOutputStream writer = new FileOutputStream(tempFile);
		byte[] buffer = new byte[153600];
		int bytesRead = 0;
		while ((bytesRead = reader.read(buffer)) > 0)
		{  
		    writer.write(buffer, 0, bytesRead);
		    buffer = new byte[153600];
		}
		writer.close();
		reader.close();			
		
		if(tempFile != null)
		{
			tempFile.deleteOnExit();
		}
		
		return tempFile;
	}	
	
	private String getFileName(URL url)
	{
		String fileName = url.getFile();
		
		int startIndex = fileName.lastIndexOf(File.separator);				
		int endIndex = fileName.lastIndexOf(".");
		if(startIndex > 0 && endIndex > 0)
		{
			fileName = fileName.substring(startIndex+1, endIndex);
		}
		
		return fileName;
	}
	
	private String getFileExtension(URL url)
	{
		String fileExtension = url.getFile();
		
		int index = fileExtension.lastIndexOf(".");
		if(index > 0)
		{
			fileExtension = fileExtension.substring(index);
		}
		
		return fileExtension;
	}
} // SymphonyCoreFacadeImpl
