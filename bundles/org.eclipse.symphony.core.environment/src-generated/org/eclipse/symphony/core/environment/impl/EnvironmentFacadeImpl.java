/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.core.ConnectionPoint;
import org.eclipse.symphony.core.ConnectionPointsList;
import org.eclipse.symphony.core.FeatureOfInterest;
import org.eclipse.symphony.core.SymphonyCoreFacade;
import org.eclipse.symphony.core.Symphony__CoreFactory;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.SymphonySystem;
import org.eclipse.symphony.core.environment.Activator;
import org.eclipse.symphony.core.environment.AstronomyUtils;
import org.eclipse.symphony.core.environment.Atmosphere;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshURLMapLayer;
import org.eclipse.symphony.core.environment.EarthSky;
import org.eclipse.symphony.core.environment.EarthSkyNode;
import org.eclipse.symphony.core.environment.EarthSurfaceEnvironment;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksite;
import org.eclipse.symphony.core.environment.EnvironmentFacade;
import org.eclipse.symphony.core.environment.EquatorialCoordinates;
import org.eclipse.symphony.core.environment.FeaturesOfInterestMapLayer;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.environment.HorizontalCoordinates;
import org.eclipse.symphony.core.environment.ImageMapLayerPresentation;
import org.eclipse.symphony.core.environment.Map;
import org.eclipse.symphony.core.environment.Moon;
import org.eclipse.symphony.core.environment.RectangularRegion;
import org.eclipse.symphony.core.environment.RectangularRegionImage;
import org.eclipse.symphony.core.environment.RectangularRegionProvider;
import org.eclipse.symphony.core.environment.RectangularVolumeRegion;
import org.eclipse.symphony.core.environment.Sky;
import org.eclipse.symphony.core.environment.SkyNode;
import org.eclipse.symphony.core.environment.Star;
import org.eclipse.symphony.core.environment.StarField;
import org.eclipse.symphony.core.environment.Sun;
import org.eclipse.symphony.core.environment.SurfaceWorksite;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;
import org.eclipse.symphony.core.environment.URLImageMapLayer;
import org.eclipse.symphony.core.environment.Worksite;
import org.eclipse.symphony.core.invocator.Environment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EnvironmentFacadeImpl extends MinimalEObjectImpl.Container implements EnvironmentFacade
{
	private static EnvironmentFacade instance = null;
	
	public static EnvironmentFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new EnvironmentFacadeImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EnvironmentFacadeImpl()
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
		return Symphony__CoreEnvironmentPackage.Literals.ENVIRONMENT_FACADE;
	}
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public StarField createAndInitializeStars()
  {
		StarField starField = Symphony__CoreEnvironmentFactory.eINSTANCE.createStarField();
		starField.setDescription("Star Field.");
		starField.setStarFieldFileName("bright_star_catalog_5.txt");
		starField.setNodeId("STAR FIELD");
		return starField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EarthSurfaceWorksite createAndInitializeDefaultCSAWorksite()
  {
		Date now = new Date();
		
		// Initialise the worksite.
		EarthSurfaceWorksite worksite = Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSurfaceWorksite();
		worksite.setName("CSA AT");
		worksite.setDescription("The CSA Default Worksite.");
		
		// Sets the coordinates.
		worksite.setGeographicalCoordinates(getMarsYardGeographicalCoordinates());
		worksite.setXAxisAzimuth(Math.toRadians(179.4));
		
		// Creates and initialise the Earth Sky.
		EarthSky earthSky = Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSky();
		worksite.setSky(earthSky);
		
		// Create and initialise the EarthSkyNode.
		EarthSkyNode earthSkyNode = Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSkyNode();		
		initializeEarthSkyNode(earthSky, earthSkyNode);
		
		// Attaches the sky to the worksite.
		// worksite.setEarthSky(earthSky);
				
		// Sets time stamp.		
		worksite.getEarthSky().setTime(now);	
		
		// Attaches a Map
		Map map = getDefaultMarsTerrainMap();
		worksite.getMapsList().getMaps().add(map);			
		
		return worksite;	
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
		Sun sun = Symphony__CoreEnvironmentFactory.eINSTANCE.createSun();
		sun.setDescription("The Sun.");
		sun.setNodeId("SUN");
		
		// Creates the Sun transform that attaches it to the sky.		
		HorizontalCoordinates sunHorizontalCoordinates = AstronomyUtils.INSTANCE.getHorizontalSunPosition(now, 0.0, 0.0);				
		Point3d sunPosition = AstronomyUtils.INSTANCE.convertFromHorizontalCoordinatesToHorizontalRectangular(sunHorizontalCoordinates);						
		TransformNode sunTransformNode = TopologyFacade.INSTANCE.createTransformNodeXYZ(sunPosition.x, sunPosition.y, sunPosition.z, 0, 0, 0);
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
			TransformNode starFieldTransformNode = TopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);
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
  public void initializeEarthSkyNode(EarthSky earthSky, EarthSkyNode earthSkyNode)
  {
	  	// Initialize the Sun and Stars.
		initializeSkyNode(earthSky, earthSkyNode);						
		
	  	Date now = new Date();
		if(earthSky.getTime() != null)
		{
			now = earthSky.getTime();
		}
		
		// Gets the Geographic Coordinates of the Worksite
		EarthSurfaceWorksite worksite =  (EarthSurfaceWorksite) earthSky.getSurfaceWorksite();
		GeographicCoordinates coord = worksite.getGeographicalCoordinates();
		
		// Creates the Moon.
		Moon moon = Symphony__CoreEnvironmentFactory.eINSTANCE.createMoon();
		moon.setDescription("The Moon.");
		moon.setNodeId("MOON");
		
		// Creates the Moon transform that attaches it to the sky.		
		HorizontalCoordinates moonHorizontalCoordinates = AstronomyUtils.INSTANCE.getHorizontalMoonPosition(now, coord.getLongitude(), coord.getLatitude());		
		
		Point3d moonPosition = AstronomyUtils.INSTANCE.convertFromHorizontalCoordinatesToHorizontalRectangular(moonHorizontalCoordinates);
		TransformNode moonTransformNode = TopologyFacade.INSTANCE.createTransformNodeXYZ(moonPosition.x, moonPosition.y, moonPosition.z, 0, 0, 0);
		moonTransformNode.setDescription("Transform attaching the Moon to the Sky.");	
		moonTransformNode.setNodeId("MOON_TRANSFORM");
		
		// Attaches the Moon to the sky.
		earthSky.getSkyNode().getChildren().add(moonTransformNode);				
		moonTransformNode.setParent(earthSky.getSkyNode()); // Should not have to this this explicitly.
		
		moonTransformNode.getChildren().add(moon);	
		
		earthSky.getSkyNode().setDescription("Earth's Sky.");
		earthSky.getSkyNode().setNodeId("SKY");
		
		earthSky.setTime(now);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public GeographicCoordinates getMarsYardGeographicalCoordinates()
  {
		GeographicCoordinates coordinates = Symphony__CoreEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
		
		coordinates.setElevation(30.0);
		coordinates.setLongitude(Math.toRadians(-73.393904468182));
		coordinates.setLatitude(Math.toRadians(45.518206644445));
		
		return coordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Star createStar(float magnitude, double rightAscension, double declination)
  {
		Star star = Symphony__CoreEnvironmentFactory.eINSTANCE.createStar();
		star.setMagnitude((float) magnitude);
		
		EquatorialCoordinates equatorialCoordinates = Symphony__CoreEnvironmentFactory.eINSTANCE.createEquatorialCoordinates();
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
  public TransformNode getMarsYardTransformNode()
  {
		// Creates the default Mars Yard transform.
		TransformNode marsYardTransformNode = TopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);
		marsYardTransformNode.setDescription("Mars Yard Transform that orients the terrain coordinate system to north.");
		
		return marsYardTransformNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EarthSurfaceEnvironment createAndInitializeEarthSurfaceEnvironment()
  {
		EarthSurfaceEnvironment earthSurfaceEnvironment = Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSurfaceEnvironment();
		earthSurfaceEnvironment.setName("Earth Surface Environment");
		earthSurfaceEnvironment.setDescription("Default Earth Surface Environment");
		
		// Sets the gravity
		earthSurfaceEnvironment.setGravity(MathFacade.INSTANCE.createTuple3d(0.0, 0.0, -9.81));
		earthSurfaceEnvironment.setAtmosphere(createAndInitializeEarthAtmosphere());
				
		return earthSurfaceEnvironment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Atmosphere createAndInitializeEarthAtmosphere()
  {
		Atmosphere atmosphere = Symphony__CoreEnvironmentFactory.eINSTANCE.createAtmosphere();
		
		// @see http://en.wikipedia.org/wiki/International_Standard_Atmosphere
		atmosphere.setSurfacePressure(101325.0);
		atmosphere.setTemperature(15.0);
		atmosphere.setSurfaceDensity(1.225);
		
		atmosphere.setWindDirection(0.0);
		atmosphere.setWindSpeed(0.0);		
		return atmosphere;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getMoonVector(SymphonySystem symphonySystem, String nodeID, Environment environment)
  {
	  EList<Node> nodes = TopologyFacade.INSTANCE.findNodesByID(nodeID, symphonySystem.getTopologyRoot().getOriginNode());
	  if(!nodes.isEmpty())
	  {
		  Node node = nodes.get(0);
		  return getMoonVector(node, environment);
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
  public Tuple3d getMoonVector(Node node, Environment environment)
  {
	  if(environment instanceof SymphonyEnvironment)
	  {
		  SymphonyEnvironment symphonyEnvironment = (SymphonyEnvironment) environment;
		  if(symphonyEnvironment.getActiveWorksite() instanceof EarthSurfaceWorksite)
		  {
			  EarthSurfaceWorksite earthSurfaceWorksite = (EarthSurfaceWorksite) symphonyEnvironment.getActiveWorksite();
			  
			  Node moon = earthSurfaceWorksite.getEarthSky().getMoon();
			  
			  Matrix4d matrix = TopologyFacade.INSTANCE.expressInFrame(moon, node);
			  Vector3d v = new Vector3d();
			  
			  matrix.get(v);
			  v.normalize();
			  
			  return MathFacade.INSTANCE.createTuple3d(v);
		  }
	  }
	  
	  return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getVector(Node node, SymphonySystem targetSymphonySystem, ConnectionPoint connectionPoint, Environment environment)
  {
	  if(environment instanceof SymphonyEnvironment)
	  {
		  SymphonyEnvironment symphonyEnvironment = (SymphonyEnvironment) environment;
		  if(symphonyEnvironment.getActiveWorksite() instanceof Worksite)
		  {
			  Matrix4d matrix = TopologyFacade.INSTANCE.expressInFrame(connectionPoint.getNode(), node);
			  
			  Vector3d v = new Vector3d();
			  matrix.get(v);
			  v.normalize();
			  
			  return MathFacade.INSTANCE.createTuple3d(v);
		  }
	  }
	  
	  return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getVector(SymphonySystem sourceSymphonySystem, String nodeID, SymphonySystem targetSymphonySystem, ConnectionPoint connectionPoint, Environment environment)
  {
	  EList<Node> nodes = TopologyFacade.INSTANCE.findNodesByID(nodeID, sourceSymphonySystem.getTopologyRoot().getOriginNode());
	  if(!nodes.isEmpty())
	  {
		  Node node = nodes.get(0);
		  
		  return getVector(node, targetSymphonySystem, connectionPoint, environment);
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
  public Tuple3d getVector(SymphonySystem sourceSymphonySystem, String nodeID, SymphonySystem targetSymphonySystem, String connectionPointName, Environment environment)
  {
	  EList<Node> nodes = TopologyFacade.INSTANCE.findNodesByID(nodeID, sourceSymphonySystem.getTopologyRoot().getOriginNode());
	  if(!nodes.isEmpty())
	  {
		  Node node = nodes.get(0);
		  
		  ConnectionPoint connectionPoint = getConnectionPointByName(targetSymphonySystem.getConnectionPointsList(), connectionPointName);
		  		 
		  if(connectionPoint != null)
		  {
			  return getVector(node, targetSymphonySystem, connectionPoint, environment);
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
  public Tuple3d getVector(SymphonySystem sourceSymphonySystem, String nodeID, String targetSystemfullyQualifiedName, String connectionPointName, Environment environment)
  {
	  SymphonySystem targetSystem = SymphonyCoreFacade.INSTANCE.getSymphonySystem(environment, targetSystemfullyQualifiedName);

	  return getVector(sourceSymphonySystem, nodeID, targetSystem, connectionPointName, environment);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public AbstractEImage createEImage(List<? extends RectangularRegionImage> rectangularRegionImages)
  {
	  AbstractEImage result = null;
	  
	  if(!rectangularRegionImages.isEmpty())
	  {
		  // Gets the extend of the terrain covered.
		  Tuple3d lowerLeftCorner = MathFacade.INSTANCE.createTuple3d(0, 0, 0); 
		  Tuple3d upperRightCorner = MathFacade.INSTANCE.createTuple3d(0, 0, 0);	  		  		  		  
		  getRectangularRegionImageExtent(rectangularRegionImages, lowerLeftCorner, upperRightCorner);		  
		  Tuple3d upperLeftCorner = MathFacade.INSTANCE.createTuple3d(lowerLeftCorner.getX(), upperRightCorner.getY(), 0);		  
		
		  // Computes the dimensions of the terrain covered by the layers.
		  double terrainWidth = upperRightCorner.getX() - lowerLeftCorner.getX();
		  double terrainHeight = upperRightCorner.getY() - lowerLeftCorner.getY();
		  
		  // Finds the highest resolution image map.
		  RectangularRegionImage bestResolutionLayer = getBestResolutionRectangularRegionImage(rectangularRegionImages);
		  double bestResolution = bestResolutionLayer.getResolution();
		  
		  // Computes the size of the image to cover the terrain at the best resolution.
		  int width = (int) Math.round((terrainWidth / bestResolution));
		  int height = (int) Math.round((terrainHeight / bestResolution));
		  	
		  // Creates a transparent image of the required size.
		  result = EImagesUtilities.INSTANCE.createTransparentImage(width, height);
		  
		  // Adds the image from each layer onto the transparent image.
		  for(RectangularRegionImage regionImage : rectangularRegionImages)
		  {
			  try
			  {
				  // Finds the terrain position of the lower left corner of the image.				
				  List<Tuple3d> corners = getAbsoluteRectangularRegionCorners(regionImage.getRegion());				  
				  Tuple3d layerUpperLeftCorner = corners.get(3);
				  
				  // Finds the image position of the top left corner.
				  int x = (int) Math.round((layerUpperLeftCorner.getX() - upperLeftCorner.getX()) / bestResolution);
				  int y = (int) Math.round((upperLeftCorner.getY() - layerUpperLeftCorner.getY()) / bestResolution);	  
				  				  				  
				  // Copies the image of the layer
				  AbstractEImage eImage = EImagesUtilities.INSTANCE.copy(regionImage.getRegionImage());
				  
				  // Scale image to match the best resolution.
				  double scaleFactor = (regionImage.getResolution() / bestResolution);
				  eImage = EImagesUtilities.INSTANCE.resize(eImage, scaleFactor);
				  
				  // Rotate image if required.
				  double zRotation = 0;
				  if(regionImage.getRegion().getTransformation() != null)
				  {
					  Tuple3d orientation = MathFacade.INSTANCE.extractOrientation(regionImage.getRegion().getTransformation());					  
					  zRotation = orientation.getZ();
				  }				  				 
				  AffineTransform affineTransform = new AffineTransform();
				  
				  affineTransform.translate(x, y);
				  affineTransform.rotate(-zRotation);				 
				  		
				  Graphics2D g = (Graphics2D) result.asBufferedImage().createGraphics();
				  g.drawImage(eImage.asBufferedImage(), affineTransform, null);
				  g.dispose();				  				  			  			
			  }
			  catch(Throwable t)
			  {
				  t.printStackTrace();
			  }
		  }		 
	  }
	  else
	  {
		  result = EImagesUtilities.INSTANCE.createTransparentImage(1, 1);
	  }
	  	  		  	  
	  return result;
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public List<Tuple3d> getAbsoluteRectangularRegionCorners(RectangularRegion rectangularRegion)
  { 
	  // Gets the corner of the ImageMapLayer in its own frame.
	  Point3d[] corners = new  Point3d[]{new Point3d(rectangularRegion.getLowerLeftCorner().asTuple3d()), 
			  							 new Point3d(rectangularRegion.getLowerRightCorner().asTuple3d()),
			  							 new Point3d(rectangularRegion.getUpperRightCorner().asTuple3d()),
			  							 new Point3d(rectangularRegion.getUpperLeftCorner().asTuple3d())};
	  
	  // Gets the transform between the ImageMapLayer and the worksite.
	  Matrix4x4 matrix4x4 = rectangularRegion.getTransformation();	  
	  Matrix4d m = null;
	  
	  if(matrix4x4 != null)
	  {
		  m = matrix4x4.asMatrix4d();
	  }
	  else
	  {
		  m = new Matrix4d();
		  m.setIdentity();
	  }
	  
	  // Applies the transform onto the corners;
	  for(int i = 0; i < corners.length; i++)
	  {
		  m.transform(corners[i]);
	  }
	  
	  // Generate the results.
	  List<Tuple3d> results = new ArrayList<Tuple3d>();	  
	  for(int i = 0; i < corners.length; i++)
	  {
		 Tuple3d p = MathFacade.INSTANCE.createTuple3d(corners[i]);
		 results.add(p);
	  }
	  
	  return results;
  }
 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public RectangularRegionImage getBestResolutionRectangularRegionImage(List<? extends RectangularRegionImage> rectangularRegionImages)
  {
	  RectangularRegionImage best = null;
	  
	  for(RectangularRegionImage layer : rectangularRegionImages)
	  {
		  if(best == null || layer.getResolution() < best.getResolution())
		  {
			  best = layer;			  
		  }		 
	  }
	  
	  return best;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void getRectangularRegionExtent(RectangularRegionProvider rectangularRegionProvider, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner) 
  {
	  // Gets the 4 corners of the ImageLayer  
	  RectangularRegion rectangularRegion = rectangularRegionProvider.getRegion();
	  List<Tuple3d> corners = getAbsoluteRectangularRegionCorners(rectangularRegion);
	  
	  // Finds the minimum and maximum x and y.
	  double xMin = Double.POSITIVE_INFINITY;
	  double xMax = Double.NEGATIVE_INFINITY;
	  double yMin = Double.POSITIVE_INFINITY;
	  double yMax = Double.NEGATIVE_INFINITY;
	  
	  for(Tuple3d p : corners)
	  {
		  if(p.getX() < xMin) xMin = p.getX();
		  if(p.getX() > xMax) xMax = p.getX();
		  if(p.getY() < yMin) yMin = p.getY();
		  if(p.getY() > yMax) yMax = p.getY();
	  }
	  
	  lowerLeftCorner.setX(xMin);
	  lowerLeftCorner.setY(yMin);
	  lowerLeftCorner.setZ(0);
	  
	  upperRightCorner.setX(xMax);
	  upperRightCorner.setY(yMax);
	  upperRightCorner.setZ(0);
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void getRectangularRegionImageExtent(RectangularRegionImage rectangularRegionImage, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner)
  {
	  // Gets the 4 corners of the ImageLayer  
	  RectangularRegion rectangularRegion = rectangularRegionImage.getRegion();
	  List<Tuple3d> corners = getAbsoluteRectangularRegionCorners(rectangularRegion);
	  
	  // Finds the minimum and maximum x and y.
	  double xMin = Double.POSITIVE_INFINITY;
	  double xMax = Double.NEGATIVE_INFINITY;
	  double yMin = Double.POSITIVE_INFINITY;
	  double yMax = Double.NEGATIVE_INFINITY;
	  
	  for(Tuple3d p : corners)
	  {
		  if(p.getX() < xMin) xMin = p.getX();
		  if(p.getX() > xMax) xMax = p.getX();
		  if(p.getY() < yMin) yMin = p.getY();
		  if(p.getY() > yMax) yMax = p.getY();
	  }
	  
	  lowerLeftCorner.setX(xMin);
	  lowerLeftCorner.setY(yMin);
	  lowerLeftCorner.setZ(0);
	  
	  upperRightCorner.setX(xMax);
	  upperRightCorner.setY(yMax);
	  upperRightCorner.setZ(0);
  }

  	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void getRectangularRegionExtent(List<? extends RectangularRegionProvider> rectangularRegionProviders, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner) 
	{
		  if(!rectangularRegionProviders.isEmpty())
		  {		  		  
			  // Finds the minimum and maximum x and y.
			  double xMin = Double.POSITIVE_INFINITY;
			  double xMax = Double.NEGATIVE_INFINITY;
			  double yMin = Double.POSITIVE_INFINITY;
			  double yMax = Double.NEGATIVE_INFINITY;
			  		  
			  for(RectangularRegionProvider provider : rectangularRegionProviders)
			  {
				  Tuple3d tmpLowerLeftCorner = MathFacade.INSTANCE.createTuple3d(0, 0, 0); 
				  Tuple3d tmpUpperRightCorner = MathFacade.INSTANCE.createTuple3d(0, 0, 0);
				  
				  getRectangularRegionExtent(provider, tmpLowerLeftCorner, tmpUpperRightCorner);
				  
				  if(tmpLowerLeftCorner.getX() < xMin)  xMin = tmpLowerLeftCorner.getX();
				  if(tmpLowerLeftCorner.getY() < yMin)  yMin = tmpLowerLeftCorner.getY();		  
				  if(tmpUpperRightCorner.getX() > xMax) xMax = tmpUpperRightCorner.getX();
				  if(tmpUpperRightCorner.getY() > yMax) yMax = tmpUpperRightCorner.getY();
			  }
			  
			  // Set the corner coordinates.
			  lowerLeftCorner.setX(xMin);
			  lowerLeftCorner.setY(yMin);
			  
			  upperRightCorner.setX(xMax);
			  upperRightCorner.setY(yMax);
		  }	  	
		  else
		  {
			  lowerLeftCorner.setX(0);
			  lowerLeftCorner.setY(0);
			  
			  upperRightCorner.setX(0);
			  upperRightCorner.setY(0);
		  }
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void getRectangularRegionImageExtent(List<? extends RectangularRegionImage> rectangularRegionImages, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner)
  {
	  if(!rectangularRegionImages.isEmpty())
	  {		  		  
		  // Finds the minimum and maximum x and y.
		  double xMin = Double.POSITIVE_INFINITY;
		  double xMax = Double.NEGATIVE_INFINITY;
		  double yMin = Double.POSITIVE_INFINITY;
		  double yMax = Double.NEGATIVE_INFINITY;
		  		  
		  for(RectangularRegionImage layer : rectangularRegionImages)
		  {
			  Tuple3d tmpLowerLeftCorner = MathFacade.INSTANCE.createTuple3d(0, 0, 0); 
			  Tuple3d tmpUpperRightCorner = MathFacade.INSTANCE.createTuple3d(0, 0, 0);
			  
			  getRectangularRegionImageExtent(layer, tmpLowerLeftCorner, tmpUpperRightCorner);
			  
			  if(tmpLowerLeftCorner.getX() < xMin)  xMin = tmpLowerLeftCorner.getX();
			  if(tmpLowerLeftCorner.getY() < yMin)  yMin = tmpLowerLeftCorner.getY();		  
			  if(tmpUpperRightCorner.getX() > xMax) xMax = tmpUpperRightCorner.getX();
			  if(tmpUpperRightCorner.getY() > yMax) yMax = tmpUpperRightCorner.getY();
		  }
		  
		  // Set the corner coordinates.
		  lowerLeftCorner.setX(xMin);
		  lowerLeftCorner.setY(yMin);
		  
		  upperRightCorner.setX(xMax);
		  upperRightCorner.setY(yMax);
	  }	  	
	  else
	  {
		  lowerLeftCorner.setX(0);
		  lowerLeftCorner.setY(0);
		  
		  upperRightCorner.setX(0);
		  upperRightCorner.setY(0);
	  }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public boolean fitsInside(RectangularRegion rectangularRegionA, RectangularRegion rectangularRegionB)
  {
	  // Create the transformation matrix that maps rectangularRegionA to rectangularRegionB.
	  Matrix4d transform = new Matrix4d();
	  transform.setIdentity();
	  if(rectangularRegionA.getTransformation() != null)
	  {		  
		  transform = new Matrix4d(rectangularRegionA.getTransformation().asMatrix4d());		  
	  }	  
	  if(rectangularRegionB.getTransformation() != null)
	  {		  
		  Matrix4d m = new Matrix4d(rectangularRegionB.getTransformation().asMatrix4d());
		  m.invert();
		  transform.mul(m);
	  }
	  	  
	  // Transform rectangularRegionA corners into  rectangularRegionB.
	  Point3d[] corners = new  Point3d[]{new Point3d(rectangularRegionA.getLowerLeftCorner().asTuple3d()), 
			  							 new Point3d(rectangularRegionA.getLowerRightCorner().asTuple3d()),
			  							 new Point3d(rectangularRegionA.getUpperRightCorner().asTuple3d()),
			  							 new Point3d(rectangularRegionA.getUpperLeftCorner().asTuple3d())};
	  for(int i = 0; i < corners.length; i++)
	  {
		  transform.transform(corners[i]);
	  }
	  
	  // Verifies that each corner of rectangularRegionA fits inside rectangularRegionB
	  boolean inside = true;
	  int i = 0;
	  while(i < corners.length && inside)
	  {
		  Point3d corner = corners[i];
		  
		  inside =  corner.getX() >= rectangularRegionB.getXMin() &&
				  	corner.getX() <= rectangularRegionB.getXMax() &&
				  	corner.getY() >= rectangularRegionB.getYMin() &&
				  	corner.getY() <= rectangularRegionB.getYMax();
		  i++;
	  }
	  
	  return inside;	
  }

  	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean intersects(RectangularRegion rectangularRegionA, RectangularRegion rectangularRegionB, Matrix4x4 transformAToB) {
		// TODO: implement this method
		return true;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void getImageMapLayerPresentationExtent(ImageMapLayerPresentation imageMapLayerPresentation, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner) 
	{
		EnvironmentFacade.INSTANCE.getRectangularRegionImageExtent(imageMapLayerPresentation.getImageMapLayer(), lowerLeftCorner, upperRightCorner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void getImageMapLayerPresentationExtent(List<ImageMapLayerPresentation> imageMapLayerPresentations, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner) 
	{
		  List<ImageMapLayerPresentation> visiblePresentations = getVisibleImageMapLayerPresentation(imageMapLayerPresentations);
		  EnvironmentFacade.INSTANCE.getRectangularRegionImageExtent(visiblePresentations, lowerLeftCorner, upperRightCorner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage getImageMapLayerPresentationImage(List<ImageMapLayerPresentation> imageMapLayerPresentations) 
	{
		  AbstractEImage result = null;
		  
		  // If there are layers to assemble.
		  if(!imageMapLayerPresentations.isEmpty())
		  {
			  List<ImageMapLayerPresentation> visiblePresentations = getVisibleImageMapLayerPresentation(imageMapLayerPresentations);		  		  
			  result =  EnvironmentFacade.INSTANCE.createEImage(visiblePresentations);
		  }
		  	  
		  return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ImageMapLayerPresentation getBestResolutionMapLayer(List<ImageMapLayerPresentation> imageMapLayerPresentations) 
	{
		  List<ImageMapLayerPresentation> visibleLayers = getVisibleImageMapLayerPresentation(imageMapLayerPresentations);
		  
		  ImageMapLayerPresentation best = null;
		  
		  for(ImageMapLayerPresentation layer : visibleLayers)
		  {
			  if(layer != null && layer.getImageMapLayer() != null)
			  {
				  if(best == null || layer.getImageMapLayer().getResolution() < best.getImageMapLayer().getResolution())
				  {
					  best = layer;
				  }
			  }
		  }
		  
		  return best;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<ImageMapLayerPresentation> getVisibleImageMapLayerPresentation(List<ImageMapLayerPresentation> imageMapLayerPresentations) 
	{
		  // Creates a list of the visible layers.
		  List<ImageMapLayerPresentation> visibleLayers = new ArrayList<ImageMapLayerPresentation>();
		  for(ImageMapLayerPresentation layer : imageMapLayerPresentations)
		  {
			  if(layer.isVisible() && layer.getImageMapLayer() != null)
			  {
				  visibleLayers.add(layer);
			  }
		  }
		  
		  return visibleLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RectangularVolumeRegion getRectangularVolumeRegion(CartesianTriangularMesh mesh) 
	{
		RectangularVolumeRegion rectangularVolumeRegion = Symphony__CoreEnvironmentFactory.eINSTANCE.createRectangularVolumeRegion();
		
		if(mesh != null)
		{
			CartesianCoordinatesSetExtent extent = mesh.getExtent();
			rectangularVolumeRegion.setXMin(extent.getXMin());
			rectangularVolumeRegion.setXMax(extent.getXMax());
			rectangularVolumeRegion.setYMin(extent.getYMin());
			rectangularVolumeRegion.setYMax(extent.getYMax());
			rectangularVolumeRegion.setZMin(extent.getZMin());
			rectangularVolumeRegion.setZMax(extent.getZMax());
		}
		else
		{
			rectangularVolumeRegion = Symphony__CoreEnvironmentFactory.eINSTANCE.createRectangularVolumeRegion();
		}	
		
		rectangularVolumeRegion.setTransformation(MathFacade.INSTANCE.createIdentityMatrix4x4());
		
		return rectangularVolumeRegion;
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
  public Tuple3d getSunVector(SymphonySystem symphonySystem, String nodeID, Environment environment)
  {	  	 
	  EList<Node> nodes = TopologyFacade.INSTANCE.findNodesByID(nodeID, symphonySystem.getTopologyRoot().getOriginNode());
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
	  if(environment instanceof SymphonyEnvironment)
	  {
		  SymphonyEnvironment symphonyEnvironment = (SymphonyEnvironment) environment;
		  
		  if(symphonyEnvironment.getActiveWorksite() instanceof SurfaceWorksite)
		  {
			  SurfaceWorksite surfaceWorksite = (SurfaceWorksite) symphonyEnvironment.getActiveWorksite();						  					  			  			  
			  Node sun = surfaceWorksite.getSky().getSun();
			  			  
			  Matrix4d matrix = TopologyFacade.INSTANCE.expressInFrame(sun, node);
			  Vector3d v = new Vector3d();
			  
			  matrix.get(v);
			  v.normalize();
			  
			  return MathFacade.INSTANCE.createTuple3d(v);
		  }
	  }
	  
	  return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getMoonVector(String nodeID, EarthSurfaceWorksite earthSurfaceWorksite)
  {
	  Node root = TopologyFacade.INSTANCE.findRoot(earthSurfaceWorksite.getWorksiteNode());	
	  EList<Node> nodes = TopologyFacade.INSTANCE.findNodesByID(nodeID, root);
	  	  
	  if(!nodes.isEmpty())
	  {
		  Node node = nodes.get(0);		  		
		  Node moon = earthSurfaceWorksite.getEarthSky().getMoon();
		  
		  Matrix4d matrix = TopologyFacade.INSTANCE.expressInFrame(moon, node);
		  Vector3d v = new Vector3d();
		  
		  matrix.get(v);
		  v.normalize();
		  
		  return MathFacade.INSTANCE.createTuple3d(v);
	  }
	  else
	  {	  
		  return null;
	  }
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
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_STARS:
				return createAndInitializeStars();
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_DEFAULT_CSA_WORKSITE:
				return createAndInitializeDefaultCSAWorksite();
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___INITIALIZE_SKY_NODE__SKY_SKYNODE:
				initializeSkyNode((Sky)arguments.get(0), (SkyNode)arguments.get(1));
				return null;
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___INITIALIZE_EARTH_SKY_NODE__EARTHSKY_EARTHSKYNODE:
				initializeEarthSkyNode((EarthSky)arguments.get(0), (EarthSkyNode)arguments.get(1));
				return null;
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_MARS_YARD_GEOGRAPHICAL_COORDINATES:
				return getMarsYardGeographicalCoordinates();
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___CREATE_STAR__FLOAT_DOUBLE_DOUBLE:
				return createStar((Float)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_MARS_YARD_TRANSFORM_NODE:
				return getMarsYardTransformNode();
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_EARTH_SURFACE_ENVIRONMENT:
				return createAndInitializeEarthSurfaceEnvironment();
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_EARTH_ATMOSPHERE:
				return createAndInitializeEarthAtmosphere();
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_SUN_VECTOR__SYMPHONYSYSTEM_STRING_ENVIRONMENT:
				return getSunVector((SymphonySystem)arguments.get(0), (String)arguments.get(1), (Environment)arguments.get(2));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_SUN_VECTOR__NODE_ENVIRONMENT:
				return getSunVector((Node)arguments.get(0), (Environment)arguments.get(1));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_MOON_VECTOR__SYMPHONYSYSTEM_STRING_ENVIRONMENT:
				return getMoonVector((SymphonySystem)arguments.get(0), (String)arguments.get(1), (Environment)arguments.get(2));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_MOON_VECTOR__NODE_ENVIRONMENT:
				return getMoonVector((Node)arguments.get(0), (Environment)arguments.get(1));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_VECTOR__NODE_SYMPHONYSYSTEM_CONNECTIONPOINT_ENVIRONMENT:
				return getVector((Node)arguments.get(0), (SymphonySystem)arguments.get(1), (ConnectionPoint)arguments.get(2), (Environment)arguments.get(3));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_VECTOR__SYMPHONYSYSTEM_STRING_SYMPHONYSYSTEM_CONNECTIONPOINT_ENVIRONMENT:
				return getVector((SymphonySystem)arguments.get(0), (String)arguments.get(1), (SymphonySystem)arguments.get(2), (ConnectionPoint)arguments.get(3), (Environment)arguments.get(4));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_VECTOR__SYMPHONYSYSTEM_STRING_SYMPHONYSYSTEM_STRING_ENVIRONMENT:
				return getVector((SymphonySystem)arguments.get(0), (String)arguments.get(1), (SymphonySystem)arguments.get(2), (String)arguments.get(3), (Environment)arguments.get(4));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_VECTOR__SYMPHONYSYSTEM_STRING_STRING_STRING_ENVIRONMENT:
				return getVector((SymphonySystem)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Environment)arguments.get(4));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___CREATE_EIMAGE__LIST:
				return createEImage((List<? extends RectangularRegionImage>)arguments.get(0));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_ABSOLUTE_RECTANGULAR_REGION_CORNERS__RECTANGULARREGION:
				return getAbsoluteRectangularRegionCorners((RectangularRegion)arguments.get(0));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_RECTANGULAR_REGION_IMAGE__LIST:
				return getBestResolutionRectangularRegionImage((List<? extends RectangularRegionImage>)arguments.get(0));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__RECTANGULARREGIONPROVIDER_TUPLE3D_TUPLE3D:
				getRectangularRegionExtent((RectangularRegionProvider)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__RECTANGULARREGIONIMAGE_TUPLE3D_TUPLE3D:
				getRectangularRegionImageExtent((RectangularRegionImage)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__LIST_TUPLE3D_TUPLE3D:
				getRectangularRegionExtent((List<? extends RectangularRegionProvider>)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__LIST_TUPLE3D_TUPLE3D:
				getRectangularRegionImageExtent((List<? extends RectangularRegionImage>)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___FITS_INSIDE__RECTANGULARREGION_RECTANGULARREGION:
				return fitsInside((RectangularRegion)arguments.get(0), (RectangularRegion)arguments.get(1));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___INTERSECTS__RECTANGULARREGION_RECTANGULARREGION_MATRIX4X4:
				return intersects((RectangularRegion)arguments.get(0), (RectangularRegion)arguments.get(1), (Matrix4x4)arguments.get(2));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__IMAGEMAPLAYERPRESENTATION_TUPLE3D_TUPLE3D:
				getImageMapLayerPresentationExtent((ImageMapLayerPresentation)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__LIST_TUPLE3D_TUPLE3D:
				getImageMapLayerPresentationExtent((List<ImageMapLayerPresentation>)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__LIST:
				return getImageMapLayerPresentationImage((List<ImageMapLayerPresentation>)arguments.get(0));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_MAP_LAYER__LIST:
				return getBestResolutionMapLayer((List<ImageMapLayerPresentation>)arguments.get(0));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_VISIBLE_IMAGE_MAP_LAYER_PRESENTATION__LIST:
				return getVisibleImageMapLayerPresentation((List<ImageMapLayerPresentation>)arguments.get(0));
			case Symphony__CoreEnvironmentPackage.ENVIRONMENT_FACADE___GET_RECTANGULAR_VOLUME_REGION__CARTESIANTRIANGULARMESH:
				return getRectangularVolumeRegion((CartesianTriangularMesh)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	private Map getDefaultMarsTerrainMap()
	{
		Map map = Symphony__CoreEnvironmentFactory.eINSTANCE.createMap();
		map.setName("MarsYard");
		map.setDescription("Simple Mars Yard Map.");
		
		// Creates a matrix
		Matrix4d matrix = getMarsYardTransformNode().asMatrix4d();		
		map.setTransformation(MathFacade.INSTANCE.createMatrix4x4(matrix));		
		
		// Creates a MeshMapLayer.
		
		CartesianTriangularMeshURLMapLayer meshLayer = Symphony__CoreEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshURLMapLayer();
		meshLayer.setUrl("platform:/plugin/org.eclipse.symphony.examples.worksites.surface/data/CSAAnalogTerrainDEM100cm.tri");
		meshLayer.setName("MarsYardDEM 1.0 meters resolution");
		meshLayer.setDescription("MarsYard DEM at 1.0 meters resolution");
		
		map.getLayers().add(meshLayer);		
	
		// Create Aerial Image map.
		URLImageMapLayer imageLayer = Symphony__CoreEnvironmentFactory.eINSTANCE.createURLImageMapLayer();
		imageLayer.setUrl("platform:/plugin/org.eclipse.symphony.examples.worksites.surface/data/CSA-AT-NGC-MET-seen-from-sky.jpg");
		imageLayer.setName("Mars Yard Aerial Image.");
		imageLayer.setDescription("Mars Yard seen from above.");
		imageLayer.setWidth(60.0);
		imageLayer.setHeight(120.0);
		
		map.getLayers().add(imageLayer);	
		
		// Creates the default Feature Of Interest List.
		FeaturesOfInterestMapLayer foiLayer = Symphony__CoreEnvironmentFactory.eINSTANCE.createFeaturesOfInterestMapLayer();
		foiLayer.setFeatures(Symphony__CoreFactory.eINSTANCE.createFeatureOfInterestList());
		foiLayer.setName("CSA AT Features");
		foiLayer.setDescription("CSA AT Features Of Interest.");
		String foiURL = "platform:/plugin/org.eclipse.symphony.examples.worksites.surface/data/CSA-AT-FOI.csv";
		
		try
		{
			List<FeatureOfInterest> features = SymphonyCoreFacade.INSTANCE.loadFeatureOfInterestFromFile(foiURL);
			foiLayer.getFeatures().getFeaturesOfInterest().addAll(features);
		}
		catch(Throwable t)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Failed to load Feature Of Interest from <" + foiURL + ">!", EventSeverity.ERROR);
		}
		
		map.getLayers().add(foiLayer);	
		
		return map;
	}	
} //EnvironmentFacadeImpl
