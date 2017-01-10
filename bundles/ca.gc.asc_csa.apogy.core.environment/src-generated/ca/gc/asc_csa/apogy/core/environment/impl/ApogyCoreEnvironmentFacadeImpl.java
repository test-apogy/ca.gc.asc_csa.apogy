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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource;
import ca.gc.asc_csa.apogy.common.emf.TimeSource;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.ConnectionPoint;
import ca.gc.asc_csa.apogy.core.ConnectionPointsList;
import ca.gc.asc_csa.apogy.core.environment.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.environment.Activator;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.SkyNode;
import ca.gc.asc_csa.apogy.core.environment.Star;
import ca.gc.asc_csa.apogy.core.environment.StarField;
import ca.gc.asc_csa.apogy.core.environment.Sun;
import ca.gc.asc_csa.apogy.core.environment.TimeSourcesList;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.WorksitesList;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList;
import ca.gc.asc_csa.apogy.core.invocator.ToolsList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentFacadeImpl#getActiveApogyEnvironment <em>Active Apogy Environment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentFacadeImpl#getActiveWorksite <em>Active Worksite</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentFacadeImpl#getActiveSun <em>Active Sun</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogyCoreEnvironmentFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCoreEnvironmentFacade
{
	private Adapter activeSessionAdapter = null;
	private Adapter activeApogyEnvironmentAdapter = null;
	private Adapter activeWorksiteAdapter = null;
	
	/**
	 * The cached value of the '{@link #getActiveApogyEnvironment() <em>Active Apogy Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveApogyEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ApogyEnvironment activeApogyEnvironment;
	/**
	 * The cached value of the '{@link #getActiveWorksite() <em>Active Worksite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveWorksite()
	 * @generated
	 * @ordered
	 */
	protected AbstractWorksite activeWorksite;

	/**
	 * The cached value of the '{@link #getActiveSun() <em>Active Sun</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveSun()
	 * @generated
	 * @ordered
	 */
	protected Sun activeSun;
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
	 * @generated_NOT
	 */
  protected ApogyCoreEnvironmentFacadeImpl()
  {
		super();
		
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(getActiveSessionAdapter());		
		
		// Initialize the ActiveApogyEnvironment.
		if(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() != null)
		{
			updateEnvironment(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment());
		}		
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
	 * @generated
	 */
	public ApogyEnvironment getActiveApogyEnvironment() {
		if (activeApogyEnvironment != null && activeApogyEnvironment.eIsProxy()) {
			InternalEObject oldActiveApogyEnvironment = (InternalEObject)activeApogyEnvironment;
			activeApogyEnvironment = (ApogyEnvironment)eResolveProxy(oldActiveApogyEnvironment);
			if (activeApogyEnvironment != oldActiveApogyEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_APOGY_ENVIRONMENT, oldActiveApogyEnvironment, activeApogyEnvironment));
			}
		}
		return activeApogyEnvironment;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEnvironment basicGetActiveApogyEnvironment() {
		return activeApogyEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setActiveApogyEnvironment(ApogyEnvironment newActiveApogyEnvironment) 
	{
		// Unregister from the previous activeApogyEnvironment if required.
		if(getActiveApogyEnvironment() != null)
		{
			getActiveApogyEnvironment().eAdapters().remove(getApogyEnvironmentAdapter());
		}
		
		// Register to the new Active Apogy Environment.
		if(newActiveApogyEnvironment != null)
		{
			newActiveApogyEnvironment.eAdapters().add(getApogyEnvironmentAdapter());
		}
				
		setActiveApogyEnvironmentGen(newActiveApogyEnvironment);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveApogyEnvironmentGen(ApogyEnvironment newActiveApogyEnvironment) {
		ApogyEnvironment oldActiveApogyEnvironment = activeApogyEnvironment;
		activeApogyEnvironment = newActiveApogyEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_APOGY_ENVIRONMENT, oldActiveApogyEnvironment, activeApogyEnvironment));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractWorksite getActiveWorksite() {
		if (activeWorksite != null && activeWorksite.eIsProxy()) {
			InternalEObject oldActiveWorksite = (InternalEObject)activeWorksite;
			activeWorksite = (AbstractWorksite)eResolveProxy(oldActiveWorksite);
			if (activeWorksite != oldActiveWorksite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_WORKSITE, oldActiveWorksite, activeWorksite));
			}
		}
		return activeWorksite;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractWorksite basicGetActiveWorksite() {
		return activeWorksite;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveWorksite(AbstractWorksite newActiveWorksite) {
		AbstractWorksite oldActiveWorksite = activeWorksite;
		activeWorksite = newActiveWorksite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_WORKSITE, oldActiveWorksite, activeWorksite));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sun getActiveSun() {
		if (activeSun != null && activeSun.eIsProxy()) {
			InternalEObject oldActiveSun = (InternalEObject)activeSun;
			activeSun = (Sun)eResolveProxy(oldActiveSun);
			if (activeSun != oldActiveSun) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_SUN, oldActiveSun, activeSun));
			}
		}
		return activeSun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sun basicGetActiveSun() {
		return activeSun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveSun(Sun newActiveSun) {
		Sun oldActiveSun = activeSun;
		activeSun = newActiveSun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_SUN, oldActiveSun, activeSun));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public InvocatorSession createApogySession() 
	{
		return createApogySession(true, true, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public InvocatorSession createApogySession(boolean createEnvironment, boolean createPrograms, boolean createDataProducts, boolean createTools) 
	{
		InvocatorSession session = ApogyCoreInvocatorFactory.eINSTANCE.createInvocatorSession();
		Context context = null;

		if (createEnvironment) {
			ApogyEnvironment environment = ApogyCoreEnvironmentFactory.eINSTANCE.createApogyEnvironment();
			environment.setLocalTypesList(ApogyCoreInvocatorFactory.eINSTANCE.createLocalTypesList());
			environment.setVariablesList(ApogyCoreInvocatorFactory.eINSTANCE.createVariablesList());
			environment.setContextsList(ApogyCoreInvocatorFactory.eINSTANCE.createContextsList());

			/** Create a default Context */
			context = ApogyCoreInvocatorFactory.eINSTANCE.createContext();
			context.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(environment.getContextsList(), context, ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS));
			context.setVariableImplementationsList(ApogyCoreInvocatorFactory.eINSTANCE.createVariableImplementationsList());
			
			environment.getContextsList().getContexts().add(context);
			environment.setActiveContext(context);
			

			/** Creates the Worksites List */
			WorksitesList worksitesList = ApogyCoreEnvironmentFactory.eINSTANCE.createWorksitesList();
			environment.setWorksitesList(worksitesList);

			/** Creates the Timesource. */
			TimeSourcesList timeSourcesList = ApogyCoreEnvironmentFactory.eINSTANCE.createTimeSourcesList();

			// Fills in the TimeSource List.
			timeSourcesList.getTimeSources().addAll(getAllAvaibleTimeSource());
			environment.setTimeSourcesList(timeSourcesList);

			// Sets the environment time source to the CurrentTimeSource.
			environment.setActiveTimeSource(getCurrentTimeSource(timeSourcesList.getTimeSources()));

			session.setEnvironment(environment);
		}

		if (createPrograms) {
			session.setProgramsList(ApogyCoreInvocatorFactory.eINSTANCE.createProgramsList());
		}

		if (createDataProducts) {
			DataProductsListsContainer listsContainer = ApogyCoreInvocatorFactory.eINSTANCE
					.createDataProductsListsContainer();
			DataProductsList dataProductsList = ApogyCoreInvocatorFactory.eINSTANCE.createDataProductsList();
			listsContainer.getDataProductsList().add(dataProductsList);
			session.setDataProductsListContainer(listsContainer);

			OperationCallResultsList operationCallResultsList = ApogyCoreInvocatorFactory.eINSTANCE
					.createOperationCallResultsList();
			dataProductsList.setOperationCallResultsList(operationCallResultsList);

			if (context != null) {
				context.setDataProductsList(dataProductsList);
			}
		}

		if (createTools) {
			ToolsList toolsList = ApogyCoreInvocatorFactory.eINSTANCE.createToolsList();
			session.setToolsList(toolsList);
		}

		return session;
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
		starField.setNodeId(StarField.NODE_ID);
		return starField;
  }

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SortedSet<Star> sortByMagnitude(List<Star> stars) 
	{
		TreeSet<Star> treeSet = new TreeSet<Star>(new StarMagnitudeComparator());
		treeSet.addAll(stars);
		return treeSet;
	}


  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Sky createSky() 
	{
		Sky sky = ApogyCoreEnvironmentFactory.eINSTANCE.createSky();			
		return sky;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SkyNode createSkyNode() 
	{
		SkyNode skyNode = ApogyCoreEnvironmentFactory.eINSTANCE.createSkyNode();		
	  	
		initializeSkyNode(skyNode);
		
		return skyNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void initializeSkyNode(SkyNode skyNode) 
	{
	  	skyNode.setDescription("Sky");
		skyNode.setNodeId("SKY");
	  
		// Creates the Sun
		Sun sun = ApogyCoreEnvironmentFactory.eINSTANCE.createSun();
		sun.setDescription("The Sun.");
		sun.setNodeId(Sun.NODE_ID);
		
		// Creates the Sun transform that attaches it to the sky.							
		Point3d sunPosition = new Point3d();						
		TransformNode sunTransformNode = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(sunPosition.x, sunPosition.y, sunPosition.z, 0, 0, 0);
		sunTransformNode.setDescription("Transform attaching the Sun to the Sky.");
		sunTransformNode.setNodeId("SUN_TRANSFORM");
		
		// Attaches the Sun to the sky.
		skyNode.getChildren().add(sunTransformNode);				
		sunTransformNode.setParent(skyNode); // Should not have to this this explicitly.
		
		sunTransformNode.getChildren().add(sun);	
				
		// Creates the stars and attached them to the sky.
		try
		{
			StarField starField = createAndInitializeStars();
			
			// Creates the StarField transform that attaches it to the sky.
			// TODO : Initialize this correctly !
			TransformNode starFieldTransformNode = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);
			starFieldTransformNode.setDescription("Transform attaching the Star Field to the Sky.");	
			starFieldTransformNode.setNodeId("STAR_FIELD_TRANSFORM");
			
			// Attaches the StarField to the sky.
			skyNode.getChildren().add(starFieldTransformNode);
			starFieldTransformNode.getChildren().add(starField);
		}
		catch(Exception e)
		{
			Logger.INSTANCE.log(Activator.ID, this, "initializeSkyNode(Sky sky, SkyNode skyNode) : Could not initialize the StarField!", EventSeverity.ERROR, e);
			e.printStackTrace();
		}
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_APOGY_ENVIRONMENT:
				if (resolve) return getActiveApogyEnvironment();
				return basicGetActiveApogyEnvironment();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_WORKSITE:
				if (resolve) return getActiveWorksite();
				return basicGetActiveWorksite();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_SUN:
				if (resolve) return getActiveSun();
				return basicGetActiveSun();
		}
		return super.eGet(featureID, resolve, coreType);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_APOGY_ENVIRONMENT:
				setActiveApogyEnvironment((ApogyEnvironment)newValue);
				return;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_WORKSITE:
				setActiveWorksite((AbstractWorksite)newValue);
				return;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_SUN:
				setActiveSun((Sun)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_APOGY_ENVIRONMENT:
				setActiveApogyEnvironment((ApogyEnvironment)null);
				return;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_WORKSITE:
				setActiveWorksite((AbstractWorksite)null);
				return;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_SUN:
				setActiveSun((Sun)null);
				return;
		}
		super.eUnset(featureID);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_APOGY_ENVIRONMENT:
				return activeApogyEnvironment != null;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_WORKSITE:
				return activeWorksite != null;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_SUN:
				return activeSun != null;
		}
		return super.eIsSet(featureID);
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
  public Tuple3d getSunVector(ApogySystem apogySystem, String nodeID)
  {	  	 
	  EList<Node> nodes = ApogyCommonTopologyFacade.INSTANCE.findNodesByID(nodeID, apogySystem.getTopologyRoot().getOriginNode());
	  if(!nodes.isEmpty())
	  {
		  Node node = nodes.get(0);
		  return getSunVector(node);
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
  public Tuple3d getSunVector(Node node)
  {	  	    	  	  
	  Sun sun = getActiveSun();
	  	  	  
	  if(sun != null)
	  {
		  // TODO : Get the root of the active session. How to do that ?
		  Node root = null;
		  		  
		  // If a root is found.
		  if(root != null)
		  {		  		 			  
			  Matrix4d matrix = ApogyCommonTopologyFacade.INSTANCE.expressInFrame(sun, node);
			  Vector3d v = new Vector3d();					 
			  matrix.get(v);
			  
			  // Ensure the vector is normalized.
			  v.normalize();
					  
			  return ApogyCommonMathFacade.INSTANCE.createTuple3d(v);
		  }		  		  
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
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_APOGY_SESSION:
				return createApogySession();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_APOGY_SESSION__BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN:
				return createApogySession((Boolean)arguments.get(0), (Boolean)arguments.get(1), (Boolean)arguments.get(2), (Boolean)arguments.get(3));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_STAR__FLOAT_DOUBLE_DOUBLE:
				return createStar((Float)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_STARS:
				return createAndInitializeStars();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___SORT_BY_MAGNITUDE__LIST:
				return sortByMagnitude((List<Star>)arguments.get(0));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_SKY:
				return createSky();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_SKY_NODE:
				return createSkyNode();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___INITIALIZE_SKY_NODE__SKYNODE:
				initializeSkyNode((SkyNode)arguments.get(0));
				return null;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__APOGYSYSTEM_STRING:
				return getSunVector((ApogySystem)arguments.get(0), (String)arguments.get(1));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__NODE:
				return getSunVector((Node)arguments.get(0));
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

	private List<TimeSource> getAllAvaibleTimeSource() {
		List<TimeSource> timeSources = new ArrayList<TimeSource>();

		List<EClass> timeSourceEClass = ApogyCommonEMFFacade.INSTANCE
				.getAllSubEClasses(ApogyCommonEMFPackage.Literals.TIME_SOURCE);

		for (EClass eClass : timeSourceEClass) {
			try {
				EObject eObject = EcoreUtil.create(eClass);
				if (eObject instanceof TimeSource) {
					timeSources.add((TimeSource) eObject);
				}
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}

		return timeSources;
	}

	private CurrentTimeSource getCurrentTimeSource(Collection<TimeSource> timeSources) {
		CurrentTimeSource currentTimeSource = null;

		Iterator<TimeSource> it = timeSources.iterator();
		while (it.hasNext() && currentTimeSource == null) {
			TimeSource timeSource = it.next();
			if (timeSource instanceof CurrentTimeSource) {
				currentTimeSource = (CurrentTimeSource) timeSource;
			}
		}

		return currentTimeSource;
	}

	private class StarMagnitudeComparator implements Comparator<Star>
	{

		@Override
		public int compare(Star star1, Star star2) 
		{
			if(star1.getMagnitude() < star2.getMagnitude())
			{
				return 1;
			}
			else if(star1.getMagnitude() > star2.getMagnitude())
			{
				return -1;
			}
			else
			{
				if(star1.getEquatorialCoordinates().getRightAscension() > star2.getEquatorialCoordinates().getRightAscension())
				{
					return 1;					
				}
				else if(star1.getEquatorialCoordinates().getRightAscension() < star2.getEquatorialCoordinates().getRightAscension())
				{
					return -1;
				}
				else
				{
					if(star1.getEquatorialCoordinates().getDeclination() > star2.getEquatorialCoordinates().getDeclination())
					{
						return 1;
					}
					else
					{
						return -1;
					}					
				}
					
			}
		}
		
	}

	/**
	 * Returns The adapter that listens to the active session and updates the active ApogyEnvironment accordingly.
	 * @return
	 */
	private Adapter getActiveSessionAdapter()
	{
		if(activeSessionAdapter == null)
		{
			activeSessionAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof ApogyCoreInvocatorFacade)
					{
						int featureID = msg.getFeatureID(ApogyCoreInvocatorFacade.class);
						if(featureID == ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION)
						{
							updateEnvironment((Environment) msg.getNewValue());
						}						
					}
				}
			};
		}
		
		return activeSessionAdapter;
	}
	
	private void updateEnvironment(Environment environment)
	{
		// Unregister from the previous activeApogyEnvironment if required.
		if(getActiveApogyEnvironment() != null)
		{
			getActiveApogyEnvironment().eAdapters().remove(getApogyEnvironmentAdapter());
		}
		
		// If the new environment is an ApogyEnvironment.
		if(environment instanceof ApogyEnvironment)
		{
			ApogyEnvironment apogyEnvironment = (ApogyEnvironment) environment;
			
			// Sets the new Active Apogy Environment.
			setActiveApogyEnvironment(apogyEnvironment);
			
			// Register to the new Apogy Environment.
			apogyEnvironment.eAdapters().add(getApogyEnvironmentAdapter());						 			
			
			// Updates the Worksite
			updateActiveWorksite(apogyEnvironment.getActiveWorksite());
		}
		else
		{
			setActiveApogyEnvironment(null);
		}
	}
	
	private Adapter getApogyEnvironmentAdapter()
	{
		if(activeApogyEnvironmentAdapter == null)
		{
			activeApogyEnvironmentAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof ApogyEnvironment)
					{
						int featureID = msg.getFeatureID(ApogyCoreEnvironmentFacade.class);
						
						switch (featureID) 
						{
							/**
							 * The Active worksite has changed, we need to update the worksite.
							 */
							case ApogyCoreEnvironmentPackage.APOGY_ENVIRONMENT__ACTIVE_WORKSITE:
							{								
								AbstractWorksite newActiveWorksite = (AbstractWorksite) msg.getNewValue();
								updateActiveWorksite(newActiveWorksite);
							}
							break;

							default:
							break;
						}									
					}
				}
			};
		}
		
		return activeApogyEnvironmentAdapter;
	}
	
	/**
	 * Updates the active worksite.
	 * @param abstractWorksite The new value of the active worksite, can be null.
	 */
	private void updateActiveWorksite(final AbstractWorksite abstractWorksite)
	{		
		// Unregister from the previous abstractWorksite if required.
		if(getActiveWorksite() != null)
		{
			getActiveWorksite().eAdapters().remove(getWorksiteAdapter());
		}		
		
		// Updates the active worksite
		setActiveWorksite(abstractWorksite);
		
		// Register to the new active worksite if required.
		if(getActiveWorksite() != null)
		{
			getActiveWorksite().eAdapters().add(getWorksiteAdapter());
		}
		
		// If the new abstractWorksite is Worksite, update the active Sun.
		if(abstractWorksite instanceof Worksite)
		{
			Worksite worksite = (Worksite) abstractWorksite;
			
			Sky sky = worksite.getSky();
			if(sky != null)
			{
				setActiveSun(sky.getSun());
			}
			else
			{
				setActiveSun(null);
			}
		}
		else
		{
			setActiveSun(null);
		}
	}
	
	/**
	 * Adapter that listens to a Worksite and updates the active Sun when the Sky attribute changes.
	 * @return The adapter.
	 */
	private Adapter getWorksiteAdapter()
	{
		if(activeWorksiteAdapter == null)
		{
			activeWorksiteAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof Worksite)
					{
						int featureID = msg.getFeatureID(Worksite.class);
						
						switch (featureID) 
						{
							case ApogyCoreEnvironmentPackage.WORKSITE__SKY:
							{								
								if(msg.getNewValue() instanceof Sky)
								{
									Sky newSky = (Sky) msg.getNewValue();
									setActiveSun(newSky.getSun());
								}
								else
								{
									setActiveSun(null);
								}
							}
							break;
	
							default:
							break;
						}
					}
				}
			};
		}
		return activeWorksiteAdapter;
	}
} //ApogyCoreEnvironmentFacadeImpl
