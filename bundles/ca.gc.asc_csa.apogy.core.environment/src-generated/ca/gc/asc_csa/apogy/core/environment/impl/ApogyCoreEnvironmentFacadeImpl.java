package ca.gc.asc_csa.apogy.core.environment.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.ConnectionPoint;
import ca.gc.asc_csa.apogy.core.ConnectionPointsList;
import ca.gc.asc_csa.apogy.core.environment.Activator;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.SkyNode;
import ca.gc.asc_csa.apogy.core.environment.Star;
import ca.gc.asc_csa.apogy.core.environment.StarField;
import ca.gc.asc_csa.apogy.core.environment.Sun;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.invocator.Environment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCoreEnvironmentFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCoreEnvironmentFacade
{
	private static ApogyCoreEnvironmentFacade instance = null;
	
	public static ApogyCoreEnvironmentFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new ApogyCoreEnvironmentFacadeImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ApogyCoreEnvironmentFacadeImpl()
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
		return ApogyCoreEnvironmentPackage.Literals.APOGY_CORE_ENVIRONMENT_FACADE;
	}
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public StarField createAndInitializeStars()
  {
		StarField starField = ApogyCoreEnvironmentFactory.eINSTANCE.createStarField();
		starField.setDescription("Star Field.");
		starField.setStarFieldFileName("bright_star_catalog_5.txt");
		starField.setNodeId("STAR FIELD");
		return starField;
  }

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortedSet<Star> sortByMagnitude(List<Star> stars) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void initializeSkyNode(Sky sky, SkyNode skyNode)
  {
	  	Date now = new Date();
		if(sky.getTime() != null)
		{
			now = sky.getTime();
		}
	  
	  	skyNode.setDescription("Sky");
		skyNode.setNodeId("SKY");
	  
		// Creates the Sun
		Sun sun = ApogyCoreEnvironmentFactory.eINSTANCE.createSun();
		sun.setDescription("The Sun.");
		sun.setNodeId("SUN");
		
		// Creates the Sun transform that attaches it to the sky.							
		Point3d sunPosition = new Point3d();						
		TransformNode sunTransformNode = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(sunPosition.x, sunPosition.y, sunPosition.z, 0, 0, 0);
		sunTransformNode.setDescription("Transform attaching the Sun to the Sky.");
		sunTransformNode.setNodeId("SUN_TRANSFORM");
		
		// Attaches the Sun to the sky.
		sky.getSkyNode().getChildren().add(sunTransformNode);				
		sunTransformNode.setParent(sky.getSkyNode()); // Should not have to this this explicitly.
		
		sunTransformNode.getChildren().add(sun);	
				
		// Creates the stars and attached them to the sky.
		try
		{
			StarField starField = createAndInitializeStars();
			
			// Creates the StarField transform that attaches it to the sky.
			// TODO : Initialise this correctly !
			TransformNode starFieldTransformNode = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);
			starFieldTransformNode.setDescription("Transform attaching the Star Field to the Sky.");	
			starFieldTransformNode.setNodeId("STAR_FIELD_TRANSFORM");
			
			// Attaches the StarField to the sky.
			sky.getSkyNode().getChildren().add(starFieldTransformNode);
			starFieldTransformNode.setParent(sky.getSkyNode()); // Should not have to this this explicitly.
			
			starFieldTransformNode.getChildren().add(starField);
		}
		catch(Exception e)
		{
			Logger.INSTANCE.log(Activator.ID, this, "initializeSkyNode(Sky sky, SkyNode skyNode) : Could not initialize the StarField!", EventSeverity.ERROR, e);
			e.printStackTrace();
		}
		
		skyNode.setSky(sky);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Star createStar(float magnitude, double rightAscension, double declination)
  {
		Star star = ApogyCoreEnvironmentFactory.eINSTANCE.createStar();
		star.setMagnitude((float) magnitude);
		
		EquatorialCoordinates equatorialCoordinates = ApogyCoreEnvironmentFactory.eINSTANCE.createEquatorialCoordinates();
		equatorialCoordinates.setRightAscension(rightAscension);
		equatorialCoordinates.setDeclination(declination);
		equatorialCoordinates.setRadius(Double.MAX_VALUE);
		
		star.setEquatorialCoordinates(equatorialCoordinates);
		
		return star;		
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getVector(Node node, ApogySystem targetApogySystem, ConnectionPoint connectionPoint, Environment environment)
  {
	  if(environment instanceof ApogyEnvironment)
	  {
		  ApogyEnvironment apogyEnvironment = (ApogyEnvironment) environment;
		  if(apogyEnvironment.getActiveWorksite() instanceof Worksite)
		  {
			  Matrix4d matrix = ApogyCommonTopologyFacade.INSTANCE.expressInFrame(connectionPoint.getNode(), node);
			  
			  Vector3d v = new Vector3d();
			  matrix.get(v);
			  v.normalize();
			  
			  return ApogyCommonMathFacade.INSTANCE.createTuple3d(v);
		  }
	  }
	  
	  return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getVector(ApogySystem sourceApogySystem, String nodeID, ApogySystem targetApogySystem, ConnectionPoint connectionPoint, Environment environment)
  {
	  EList<Node> nodes = ApogyCommonTopologyFacade.INSTANCE.findNodesByID(nodeID, sourceApogySystem.getTopologyRoot().getOriginNode());
	  if(!nodes.isEmpty())
	  {
		  Node node = nodes.get(0);
		  
		  return getVector(node, targetApogySystem, connectionPoint, environment);
	  }
	  else
	  {
		  return null;
	  }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getVector(ApogySystem sourceApogySystem, String nodeID, ApogySystem targetApogySystem, String connectionPointName, Environment environment)
  {
	  EList<Node> nodes = ApogyCommonTopologyFacade.INSTANCE.findNodesByID(nodeID, sourceApogySystem.getTopologyRoot().getOriginNode());
	  if(!nodes.isEmpty())
	  {
		  Node node = nodes.get(0);
		  
		  ConnectionPoint connectionPoint = getConnectionPointByName(targetApogySystem.getConnectionPointsList(), connectionPointName);
		  		 
		  if(connectionPoint != null)
		  {
			  return getVector(node, targetApogySystem, connectionPoint, environment);
		  }
		  else
		  {
			  return null;
		  }		  
	  }
	  else
	  {
		  return null;
	  }
  }  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getVector(ApogySystem sourceApogySystem, String nodeID, String targetSystemfullyQualifiedName, String connectionPointName, Environment environment)
  {
	  ApogySystem targetSystem = ApogyCoreFacade.INSTANCE.getApogySystem(environment, targetSystemfullyQualifiedName);

	  return getVector(sourceApogySystem, nodeID, targetSystem, connectionPointName, environment);
  }

	private ConnectionPoint getConnectionPointByName(ConnectionPointsList connectionPointsList, String connectionPointName)
	{
	  if(connectionPointsList.getConnectionPoints() != null && !connectionPointsList.getConnectionPoints().isEmpty())
	  {
		  ConnectionPoint connectionPoint = null;
		  
		  Iterator<ConnectionPoint> it = connectionPointsList.getConnectionPoints().iterator();
		  while(it.hasNext() && connectionPoint == null)
		  {
			  ConnectionPoint next = it.next();			 
			  if(next.getName().compareTo(connectionPointName) == 0)
			  {
				  connectionPoint = next;
			  }
		  }
		  
		  return connectionPoint;
	  }
	  
	  return null;
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getSunVector(ApogySystem apogySystem, String nodeID, Environment environment)
  {	  	 
	  EList<Node> nodes = ApogyCommonTopologyFacade.INSTANCE.findNodesByID(nodeID, apogySystem.getTopologyRoot().getOriginNode());
	  if(!nodes.isEmpty())
	  {
		  Node node = nodes.get(0);
		  return getSunVector(node, environment);
	  }
	  else
	  {
		  return null;
	  }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getSunVector(Node node, Environment environment)
  {	  	    
	  if(environment instanceof ApogyEnvironment)
	  {
		  ApogyEnvironment apogyEnvironment = (ApogyEnvironment) environment;
		  
		  // Search the active topology.
		  // TODO
		  Node sun = null;
		   
		  Matrix4d matrix = ApogyCommonTopologyFacade.INSTANCE.expressInFrame(sun, node);
		  Vector3d v = new Vector3d();
			 
		  matrix.get(v);
		  v.normalize();
			  
		  return ApogyCommonMathFacade.INSTANCE.createTuple3d(v);
		  
	  }
	  
	  return null;
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
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_STAR__FLOAT_DOUBLE_DOUBLE:
				return createStar((Float)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_STARS:
				return createAndInitializeStars();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___SORT_BY_MAGNITUDE__LIST:
				return sortByMagnitude((List<Star>)arguments.get(0));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___INITIALIZE_SKY_NODE__SKY_SKYNODE:
				initializeSkyNode((Sky)arguments.get(0), (SkyNode)arguments.get(1));
				return null;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__APOGYSYSTEM_STRING_ENVIRONMENT:
				return getSunVector((ApogySystem)arguments.get(0), (String)arguments.get(1), (Environment)arguments.get(2));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__NODE_ENVIRONMENT:
				return getSunVector((Node)arguments.get(0), (Environment)arguments.get(1));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__NODE_APOGYSYSTEM_CONNECTIONPOINT_ENVIRONMENT:
				return getVector((Node)arguments.get(0), (ApogySystem)arguments.get(1), (ConnectionPoint)arguments.get(2), (Environment)arguments.get(3));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_APOGYSYSTEM_CONNECTIONPOINT_ENVIRONMENT:
				return getVector((ApogySystem)arguments.get(0), (String)arguments.get(1), (ApogySystem)arguments.get(2), (ConnectionPoint)arguments.get(3), (Environment)arguments.get(4));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_APOGYSYSTEM_STRING_ENVIRONMENT:
				return getVector((ApogySystem)arguments.get(0), (String)arguments.get(1), (ApogySystem)arguments.get(2), (String)arguments.get(3), (Environment)arguments.get(4));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_STRING_STRING_ENVIRONMENT:
				return getVector((ApogySystem)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Environment)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}


} //ApogyCoreEnvironmentFacadeImpl
