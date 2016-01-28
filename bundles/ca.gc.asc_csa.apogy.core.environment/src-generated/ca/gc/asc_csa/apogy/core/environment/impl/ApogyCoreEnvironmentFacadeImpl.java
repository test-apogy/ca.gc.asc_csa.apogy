/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.impl;

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
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.ConnectionPoint;
import ca.gc.asc_csa.apogy.core.ConnectionPointsList;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.ApogyCoreFactory;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.environment.Activator;
import ca.gc.asc_csa.apogy.core.environment.AstronomyUtils;
import ca.gc.asc_csa.apogy.core.environment.Atmosphere;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshURLMapLayer;
import ca.gc.asc_csa.apogy.core.environment.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.EarthSkyNode;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceEnvironment;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates;
import ca.gc.asc_csa.apogy.core.environment.FeaturesOfInterestMapLayer;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates;
import ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.Map;
import ca.gc.asc_csa.apogy.core.environment.Moon;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider;
import ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.SkyNode;
import ca.gc.asc_csa.apogy.core.environment.Star;
import ca.gc.asc_csa.apogy.core.environment.StarField;
import ca.gc.asc_csa.apogy.core.environment.Sun;
import ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.URLImageMapLayer;
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
   * @generated_NOT
   */
  public EarthSurfaceWorksite createAndInitializeDefaultCSAWorksite()
  {
		Date now = new Date();
		
		// Initialise the worksite.
		EarthSurfaceWorksite worksite = ApogyCoreEnvironmentFactory.eINSTANCE.createEarthSurfaceWorksite();
		worksite.setName("CSA AT");
		worksite.setDescription("The CSA Default Worksite.");
		
		// Sets the coordinates.
		worksite.setGeographicalCoordinates(getMarsYardGeographicalCoordinates());
		worksite.setXAxisAzimuth(Math.toRadians(179.4));
		
		// Creates and initialise the Earth Sky.
		EarthSky earthSky = ApogyCoreEnvironmentFactory.eINSTANCE.createEarthSky();
		worksite.setSky(earthSky);
		
		// Create and initialise the EarthSkyNode.
		EarthSkyNode earthSkyNode = ApogyCoreEnvironmentFactory.eINSTANCE.createEarthSkyNode();		
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
		Sun sun = ApogyCoreEnvironmentFactory.eINSTANCE.createSun();
		sun.setDescription("The Sun.");
		sun.setNodeId("SUN");
		
		// Creates the Sun transform that attaches it to the sky.		
		HorizontalCoordinates sunHorizontalCoordinates = AstronomyUtils.INSTANCE.getHorizontalSunPosition(now, 0.0, 0.0);				
		Point3d sunPosition = AstronomyUtils.INSTANCE.convertFromHorizontalCoordinatesToHorizontalRectangular(sunHorizontalCoordinates);						
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
		Moon moon = ApogyCoreEnvironmentFactory.eINSTANCE.createMoon();
		moon.setDescription("The Moon.");
		moon.setNodeId("MOON");
		
		// Creates the Moon transform that attaches it to the sky.		
		HorizontalCoordinates moonHorizontalCoordinates = AstronomyUtils.INSTANCE.getHorizontalMoonPosition(now, coord.getLongitude(), coord.getLatitude());		
		
		Point3d moonPosition = AstronomyUtils.INSTANCE.convertFromHorizontalCoordinatesToHorizontalRectangular(moonHorizontalCoordinates);
		TransformNode moonTransformNode = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(moonPosition.x, moonPosition.y, moonPosition.z, 0, 0, 0);
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
		GeographicCoordinates coordinates = ApogyCoreEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
		
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
  public TransformNode getMarsYardTransformNode()
  {
		// Creates the default Mars Yard transform.
		TransformNode marsYardTransformNode = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);
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
		EarthSurfaceEnvironment earthSurfaceEnvironment = ApogyCoreEnvironmentFactory.eINSTANCE.createEarthSurfaceEnvironment();
		earthSurfaceEnvironment.setName("Earth Surface Environment");
		earthSurfaceEnvironment.setDescription("Default Earth Surface Environment");
		
		// Sets the gravity
		earthSurfaceEnvironment.setGravity(ApogyCommonMathFacade.INSTANCE.createTuple3d(0.0, 0.0, -9.81));
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
		Atmosphere atmosphere = ApogyCoreEnvironmentFactory.eINSTANCE.createAtmosphere();
		
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
  public Tuple3d getMoonVector(ApogySystem apogySystem, String nodeID, Environment environment)
  {
	  EList<Node> nodes = ApogyCommonTopologyFacade.INSTANCE.findNodesByID(nodeID, apogySystem.getTopologyRoot().getOriginNode());
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
	  if(environment instanceof ApogyEnvironment)
	  {
		  ApogyEnvironment apogyEnvironment = (ApogyEnvironment) environment;
		  if(apogyEnvironment.getActiveWorksite() instanceof EarthSurfaceWorksite)
		  {
			  EarthSurfaceWorksite earthSurfaceWorksite = (EarthSurfaceWorksite) apogyEnvironment.getActiveWorksite();
			  
			  Node moon = earthSurfaceWorksite.getEarthSky().getMoon();
			  
			  Matrix4d matrix = ApogyCommonTopologyFacade.INSTANCE.expressInFrame(moon, node);
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
   * @generated_NOT
   */
  public AbstractEImage createEImage(List<? extends RectangularRegionImage> rectangularRegionImages)
  {
	  AbstractEImage result = null;
	  
	  if(!rectangularRegionImages.isEmpty())
	  {
		  // Gets the extend of the terrain covered.
		  Tuple3d lowerLeftCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(0, 0, 0); 
		  Tuple3d upperRightCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(0, 0, 0);	  		  		  		  
		  getRectangularRegionImageExtent(rectangularRegionImages, lowerLeftCorner, upperRightCorner);		  
		  Tuple3d upperLeftCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(lowerLeftCorner.getX(), upperRightCorner.getY(), 0);		  
		
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
					  Tuple3d orientation = ApogyCommonMathFacade.INSTANCE.extractOrientation(regionImage.getRegion().getTransformation());					  
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
		 Tuple3d p = ApogyCommonMathFacade.INSTANCE.createTuple3d(corners[i]);
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
				  Tuple3d tmpLowerLeftCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(0, 0, 0); 
				  Tuple3d tmpUpperRightCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(0, 0, 0);
				  
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
			  Tuple3d tmpLowerLeftCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(0, 0, 0); 
			  Tuple3d tmpUpperRightCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(0, 0, 0);
			  
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
		ApogyCoreEnvironmentFacade.INSTANCE.getRectangularRegionImageExtent(imageMapLayerPresentation.getImageMapLayer(), lowerLeftCorner, upperRightCorner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void getImageMapLayerPresentationExtent(List<ImageMapLayerPresentation> imageMapLayerPresentations, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner) 
	{
		  List<ImageMapLayerPresentation> visiblePresentations = getVisibleImageMapLayerPresentation(imageMapLayerPresentations);
		  ApogyCoreEnvironmentFacade.INSTANCE.getRectangularRegionImageExtent(visiblePresentations, lowerLeftCorner, upperRightCorner);
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
			  result =  ApogyCoreEnvironmentFacade.INSTANCE.createEImage(visiblePresentations);
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
		RectangularVolumeRegion rectangularVolumeRegion = ApogyCoreEnvironmentFactory.eINSTANCE.createRectangularVolumeRegion();
		
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
			rectangularVolumeRegion = ApogyCoreEnvironmentFactory.eINSTANCE.createRectangularVolumeRegion();
		}	
		
		rectangularVolumeRegion.setTransformation(ApogyCommonMathFacade.INSTANCE.createIdentityMatrix4x4());
		
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
		  
		  if(apogyEnvironment.getActiveWorksite() instanceof SurfaceWorksite)
		  {
			  SurfaceWorksite surfaceWorksite = (SurfaceWorksite) apogyEnvironment.getActiveWorksite();						  					  			  			  
			  Node sun = surfaceWorksite.getSky().getSun();
			  			  
			  Matrix4d matrix = ApogyCommonTopologyFacade.INSTANCE.expressInFrame(sun, node);
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
  public Tuple3d getMoonVector(String nodeID, EarthSurfaceWorksite earthSurfaceWorksite)
  {
	  Node root = ApogyCommonTopologyFacade.INSTANCE.findRoot(earthSurfaceWorksite.getWorksiteNode());	
	  EList<Node> nodes = ApogyCommonTopologyFacade.INSTANCE.findNodesByID(nodeID, root);
	  	  
	  if(!nodes.isEmpty())
	  {
		  Node node = nodes.get(0);		  		
		  Node moon = earthSurfaceWorksite.getEarthSky().getMoon();
		  
		  Matrix4d matrix = ApogyCommonTopologyFacade.INSTANCE.expressInFrame(moon, node);
		  Vector3d v = new Vector3d();
		  
		  matrix.get(v);
		  v.normalize();
		  
		  return ApogyCommonMathFacade.INSTANCE.createTuple3d(v);
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
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_STARS:
				return createAndInitializeStars();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_DEFAULT_CSA_WORKSITE:
				return createAndInitializeDefaultCSAWorksite();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___INITIALIZE_SKY_NODE__SKY_SKYNODE:
				initializeSkyNode((Sky)arguments.get(0), (SkyNode)arguments.get(1));
				return null;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___INITIALIZE_EARTH_SKY_NODE__EARTHSKY_EARTHSKYNODE:
				initializeEarthSkyNode((EarthSky)arguments.get(0), (EarthSkyNode)arguments.get(1));
				return null;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_MARS_YARD_GEOGRAPHICAL_COORDINATES:
				return getMarsYardGeographicalCoordinates();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_STAR__FLOAT_DOUBLE_DOUBLE:
				return createStar((Float)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_MARS_YARD_TRANSFORM_NODE:
				return getMarsYardTransformNode();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_EARTH_SURFACE_ENVIRONMENT:
				return createAndInitializeEarthSurfaceEnvironment();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_EARTH_ATMOSPHERE:
				return createAndInitializeEarthAtmosphere();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__SYMPHONYSYSTEM_STRING_ENVIRONMENT:
				return getSunVector((ApogySystem)arguments.get(0), (String)arguments.get(1), (Environment)arguments.get(2));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__NODE_ENVIRONMENT:
				return getSunVector((Node)arguments.get(0), (Environment)arguments.get(1));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_MOON_VECTOR__SYMPHONYSYSTEM_STRING_ENVIRONMENT:
				return getMoonVector((ApogySystem)arguments.get(0), (String)arguments.get(1), (Environment)arguments.get(2));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_MOON_VECTOR__NODE_ENVIRONMENT:
				return getMoonVector((Node)arguments.get(0), (Environment)arguments.get(1));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__NODE_SYMPHONYSYSTEM_CONNECTIONPOINT_ENVIRONMENT:
				return getVector((Node)arguments.get(0), (ApogySystem)arguments.get(1), (ConnectionPoint)arguments.get(2), (Environment)arguments.get(3));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__SYMPHONYSYSTEM_STRING_SYMPHONYSYSTEM_CONNECTIONPOINT_ENVIRONMENT:
				return getVector((ApogySystem)arguments.get(0), (String)arguments.get(1), (ApogySystem)arguments.get(2), (ConnectionPoint)arguments.get(3), (Environment)arguments.get(4));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__SYMPHONYSYSTEM_STRING_SYMPHONYSYSTEM_STRING_ENVIRONMENT:
				return getVector((ApogySystem)arguments.get(0), (String)arguments.get(1), (ApogySystem)arguments.get(2), (String)arguments.get(3), (Environment)arguments.get(4));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__SYMPHONYSYSTEM_STRING_STRING_STRING_ENVIRONMENT:
				return getVector((ApogySystem)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Environment)arguments.get(4));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___CREATE_EIMAGE__LIST:
				return createEImage((List<? extends RectangularRegionImage>)arguments.get(0));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_ABSOLUTE_RECTANGULAR_REGION_CORNERS__RECTANGULARREGION:
				return getAbsoluteRectangularRegionCorners((RectangularRegion)arguments.get(0));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_RECTANGULAR_REGION_IMAGE__LIST:
				return getBestResolutionRectangularRegionImage((List<? extends RectangularRegionImage>)arguments.get(0));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__RECTANGULARREGIONPROVIDER_TUPLE3D_TUPLE3D:
				getRectangularRegionExtent((RectangularRegionProvider)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__RECTANGULARREGIONIMAGE_TUPLE3D_TUPLE3D:
				getRectangularRegionImageExtent((RectangularRegionImage)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__LIST_TUPLE3D_TUPLE3D:
				getRectangularRegionExtent((List<? extends RectangularRegionProvider>)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__LIST_TUPLE3D_TUPLE3D:
				getRectangularRegionImageExtent((List<? extends RectangularRegionImage>)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___FITS_INSIDE__RECTANGULARREGION_RECTANGULARREGION:
				return fitsInside((RectangularRegion)arguments.get(0), (RectangularRegion)arguments.get(1));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___INTERSECTS__RECTANGULARREGION_RECTANGULARREGION_MATRIX4X4:
				return intersects((RectangularRegion)arguments.get(0), (RectangularRegion)arguments.get(1), (Matrix4x4)arguments.get(2));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__IMAGEMAPLAYERPRESENTATION_TUPLE3D_TUPLE3D:
				getImageMapLayerPresentationExtent((ImageMapLayerPresentation)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__LIST_TUPLE3D_TUPLE3D:
				getImageMapLayerPresentationExtent((List<ImageMapLayerPresentation>)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__LIST:
				return getImageMapLayerPresentationImage((List<ImageMapLayerPresentation>)arguments.get(0));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_MAP_LAYER__LIST:
				return getBestResolutionMapLayer((List<ImageMapLayerPresentation>)arguments.get(0));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_VISIBLE_IMAGE_MAP_LAYER_PRESENTATION__LIST:
				return getVisibleImageMapLayerPresentation((List<ImageMapLayerPresentation>)arguments.get(0));
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_VOLUME_REGION__CARTESIANTRIANGULARMESH:
				return getRectangularVolumeRegion((CartesianTriangularMesh)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	private Map getDefaultMarsTerrainMap()
	{
		Map map = ApogyCoreEnvironmentFactory.eINSTANCE.createMap();
		map.setName("MarsYard");
		map.setDescription("Simple Mars Yard Map.");
		
		// Creates a matrix
		Matrix4d matrix = getMarsYardTransformNode().asMatrix4d();		
		map.setTransformation(ApogyCommonMathFacade.INSTANCE.createMatrix4x4(matrix));		
		
		// Creates a MeshMapLayer.
		
		CartesianTriangularMeshURLMapLayer meshLayer = ApogyCoreEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshURLMapLayer();
		meshLayer.setUrl("platform:/plugin/ca.gc.asc_csa.apogy.examples.worksites.surface/data/CSAAnalogTerrainDEM100cm.tri");
		meshLayer.setName("MarsYardDEM 1.0 meters resolution");
		meshLayer.setDescription("MarsYard DEM at 1.0 meters resolution");
		
		map.getLayers().add(meshLayer);		
	
		// Create Aerial Image map.
		URLImageMapLayer imageLayer = ApogyCoreEnvironmentFactory.eINSTANCE.createURLImageMapLayer();
		imageLayer.setUrl("platform:/plugin/ca.gc.asc_csa.apogy.examples.worksites.surface/data/CSA-AT-NGC-MET-seen-from-sky.jpg");
		imageLayer.setName("Mars Yard Aerial Image.");
		imageLayer.setDescription("Mars Yard seen from above.");
		imageLayer.setWidth(60.0);
		imageLayer.setHeight(120.0);
		
		map.getLayers().add(imageLayer);	
		
		// Creates the default Feature Of Interest List.
		FeaturesOfInterestMapLayer foiLayer = ApogyCoreEnvironmentFactory.eINSTANCE.createFeaturesOfInterestMapLayer();
		foiLayer.setFeatures(ApogyCoreFactory.eINSTANCE.createFeatureOfInterestList());
		foiLayer.setName("CSA AT Features");
		foiLayer.setDescription("CSA AT Features Of Interest.");
		String foiURL = "platform:/plugin/ca.gc.asc_csa.apogy.examples.worksites.surface/data/CSA-AT-FOI.csv";
		
		try
		{
			List<FeatureOfInterest> features = ApogyCoreFacade.INSTANCE.loadFeatureOfInterestFromFile(foiURL);
			foiLayer.getFeatures().getFeaturesOfInterest().addAll(features);
		}
		catch(Throwable t)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Failed to load Feature Of Interest from <" + foiURL + ">!", EventSeverity.ERROR);
		}
		
		map.getLayers().add(foiLayer);	
		
		return map;
	}	
} //ApogyCoreEnvironmentFacadeImpl
