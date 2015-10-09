/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lidar.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Data3dFactory;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.examples.lidar.Activator;
import org.eclipse.symphony.examples.lidar.EMFEcoreExampleLidarPackage;
import org.eclipse.symphony.examples.lidar.LidarSimulated;

import ca.gc.space.mrt.sensors.fov.FOVFacade;
import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lidar Simulated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LidarSimulatedImpl extends LidarImpl implements LidarSimulated
{
	/**
	 * This is the degree symbol, as expressed in unicode
	 */
	private static final String DEGREE_SYM = "\u00b0";
	
	/**
	 * This constant specifies the default horizontal span (in radians) for
	 * the Lidar unit's field of view (FOV).
	 * 
	 * Note: This will be used to construct a rectangular frustrum FOV ONLY
	 * if there is no other field of view provided (i.e. it's null) and
	 * getFov() is called.
	 * @see #getFov() 
	 */
	protected static final double FOV_DEF_HORIZONTAL_SPAN = Math.toRadians(90.0);
	
	/**
	 * This constant specifies the default vertical span (in radians) for
	 * the Lidar unit's field of view (FOV).
	 * <p>
	 * Note: This will be used to construct a rectangular frustrum FOV ONLY
	 * if there is no other field of view provided (i.e. it's null) and
	 * getFov() is called.
	 * @see #getFov() 
	 */
	protected static final double FOV_DEF_VERTICAL_SPAN = Math.toRadians(45.0);
	
	/**
	 * This constant specifies the default minimum range for the Lidar unit's
	 * field of view (FOV).
	 * <p>
	 * Note: This will be used to construct a rectangular frustrum FOV ONLY
	 * if there is no other field of view provided (i.e. it's null) and
	 * getFov() is called.
	 * @see #getFov()
	 */
	protected static final double FOV_DEF_MINIMUM_RANGE = 0.5;
	
	/**
	 * This constant specified the default maximum range for the Lidar unit's
	 * field of view (FOV).
	 * <p>
	 * Note: This will be used to construct a rectangular frustrum FOV ONLY
	 * if there is not other field of view provided (i.e. it's null) and
	 * getFov() is called.
	 * @see #getFov()
	 */
	protected static final double FOV_DEF_MAXIMUM_RANGE = 50.0;

	/**
	 * This constant specifies the amount of delay (in milliseconds) between
	 * each of the vertical sub-scans of fillScan(), if the scan is a blocking
	 * (i.e. synchronous) one.
	 * @see #SCAN_DELAY_NON_BLOCKING
	 * @see #acquireScan(double, double)
	 * @see #fillScan(double, double, CartesianCoordinateSet, long)
	 */
	protected static final long SCAN_DELAY_BLOCKING = 0;
	
	/**
	 * This constant specifies the amount of delay (in milliseconds) between
	 * each of the vertical sub-scans of fillScan(), if the scan is a non-blocking
	 * (i.e. asynchronous) one.
	 * @see #SCAN_DELAY_BLOCKING
	 * @see #acquireScanNonBlocking(double, double)
	 * @see #fillScan(double, double, CartesianCoordinateSet, long)
	 */
	protected static final long SCAN_DELAY_NON_BLOCKING = 200;
	
	/**
	 * This (pseudo) random number generator is used to produce random
	 * depth values whenever the user requests a depth scan.
	 * @see #generateRandomRange()
	 */
	protected Random rangeRandom;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LidarSimulatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleLidarPackage.Literals.LIDAR_SIMULATED;
	}

	/**
	 * This method is used to return the Lidar unit's field of
	 * view (FOV); this will create a FOV for this unit if one
	 * does not already exist
	 * @return The Lidar unit's field of view (FOV)
	 * @generated_NOT
	 */
	@Override
	public RectangularFrustrumFieldOfView getFov()
	{
		// Call the super class's version of the method
		RectangularFrustrumFieldOfView tmp = super.getFov();
		
		// If there is no field of view already associated with the Lidar unit
		if(tmp == null)
		{
			// Create a rectangular field of view with some default values
			tmp = FOVFacade.INSTANCE.createRectangularFrustrumFieldOfView(FOV_DEF_MINIMUM_RANGE,
																		  FOV_DEF_MAXIMUM_RANGE,
																		  FOV_DEF_HORIZONTAL_SPAN,
																		  FOV_DEF_VERTICAL_SPAN);
			// Assign it to the Lidar unit
			setFov(tmp);
		}

		// Return the field of view
		return tmp;
	}
	
	/**
	 * This operation is used to perform the steps necessary to initialize
	 * the Lidar unit.
	 * @return Whether or not the Lidar's initialization was successfully completed
	 */
	@Override
	public boolean init()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() + ".init(): ";
		
		// If the Lidar unit has already been initialized
		if (this.isInitialized() == true)
		{
			// Log this fact
			String message = LOG_PREFIX +
								"Ignored; init() has already been successfully called.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
			
			// Indicate that the Lidar unit was already initialized
			return true;
		}
		// Otherwise, it hasn't been initialized it yet
		else
		{
			// Perform the required initialization operations
			
			// Initialize the random number generator
			this.rangeRandom = new Random();
			
			// Log the initialization
			String message = LOG_PREFIX +
								"The Lidar unit has been initialized.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Indicate that the Lidar has been initialized successfully
			this.setInitialized(true);
			
			// Just return true
			return true;
		}
	}
	
	/**
	 * This operation is used to acquire a depth scan of the field of view, with the given
	 * horizontal and vertical resolution.
	 * <p>
	 * Note: This method operates synchronously and will block until the entire scan has been
	 *       completed.  
	 * @param horizontalResolution The horizontal angular resolution of the scan (in radians.)
	 * @param verticalResolution The vertical angular resolution of the scan (in radians.)
	 * @return The resulting scan with the given horizontal and vertical angular resolution.
	 * @see #acquireScanNonBlocking(double, double)
	 */
	@Override
	public CartesianCoordinatesSet acquireScan(double horizontalResolution,
											   double verticalResolution) 
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".acquireScan(" + Math.toDegrees(horizontalResolution) +
									DEGREE_SYM + ", " +	Math.toDegrees(verticalResolution) +
									DEGREE_SYM + "): ";
		
		// If the Lidar unit has not been initialized
		if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the Lidar unit is not initialized (with init())";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, it was initialized
		else
		{
			// Create a coordinate set to store the results of the scan
			CartesianCoordinatesSet cartesianCoordinatesSet = Data3dFactory.eINSTANCE.createCartesianCoordinatesSet();

			// Log the start of the scan
			String message = LOG_PREFIX +
								"Starting the Lidar unit's (blocking) scan acquistion.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Perform the Lidar scan, filling the coordinate set with the results
			fillScan(horizontalResolution,
					verticalResolution,
					cartesianCoordinatesSet,
					SCAN_DELAY_BLOCKING);

			// Log the end of the scan
			message = LOG_PREFIX + "Lidar unit's blocking scan completed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Return the completed scan
			return cartesianCoordinatesSet;
		}
	}

	/**
	 * This operation is used to acquire a depth scan of the field of view, with the given
	 * horizontal and vertical resolution.
	 * <p>
	 * Note: This method operates asynchronously and as such, will return immediately, even
	 *       if the scan is not yet completed.
	 * @param horizontalResolution The horizontal angular resolution of the scan (in radians.)
	 * @param verticalResolution The vertical angular resolution of the scan (in radians.)
	 * @return The resulting scan with the given horizontal and vertical angular resolution.
	 * @see #acquireScan(double, double)
	 */
	@Override
	public CartesianCoordinatesSet acquireScanNonBlocking(final double horizontalResolution,
														  final double verticalResolution) 
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									"acquireScanNonBlocking(" + Math.toDegrees(horizontalResolution) +
									DEGREE_SYM + ", " + Math.toDegrees(verticalResolution) +
									DEGREE_SYM + "): ";
		
		// If the Lidar unit was not initialized
		if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the Lidar unit is not initialized (with init())";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and handled by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the Lidar was initialized successfully
		else
		{
			// Create a coordinate set to store the results of the scan
			final CartesianCoordinatesSet cartesianCoordinatesSet = Data3dFactory.eINSTANCE.createCartesianCoordinatesSet();

			// Create a custom job which will spawn a thread and run the scan asynchronously
			Job job = new Job(LOG_PREFIX.substring(0, LOG_PREFIX.length()-2))
			{
				/**
				 * This method is the workhorse of the custom Job class
				 * and is used to perform the asynchronous scan of the
				 * @param monitor A progress monitor that can be used to provide feedback on the state of the job
				 * @return The status of the job when it stopped running
				 */
				@Override
				protected IStatus run(IProgressMonitor monitor) 
				{
					// Log the start of the scan
					String message = LOG_PREFIX + 
										"Starting the Lidar unit's non-blocking scan acquistion";
					Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
				
					// Perform the Lidar scan, filling the coordinate set with the results
					fillScan(horizontalResolution,
							 verticalResolution,
							 cartesianCoordinatesSet,
							 SCAN_DELAY_NON_BLOCKING);
					
					// Log the end of the scan
					message = LOG_PREFIX +
								"Lidar unit's non-blocking scan completed.";
					Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
					
					// Indicate that the scan completed successfully
					return Status.OK_STATUS;
				}
			};
			
			// Schedule the new job (i.e. thread) to run
			job.schedule();

			// Return the coordinate set
			//
			// NOTE: As the scan is done asynchronously, it is quite likely
			// that when this coordinate set is returned, it will, in fact, be
			// empty; only when the job is run, will it be populated with the
			// scan data.
			return cartesianCoordinatesSet;
		}
	}

	/**
	 * This private helper method is used to actually simulate the Lidar unit's
	 * scanning process; in this case, the method fills in the Cartesian coordinate
	 * set with points calculated from:
	 *  - The provided horizontal and vertical resolution angles (in radians)
	 *  - The Lidar unit's field of view's current horizontal and vertical angles (in radians)
	 *  - Random ranges (generated from rangeRandom, using the FOV's minimum and maximum range)
	 * @param horizontalResolutionAngle The desired horizontal resolution angle (in radians)
	 * @param verticalResolutionAngle The desired vertical resolution angle (in radians)
	 * @param cartesianCoordinatesSet The Cartesian coordinate set which is to be filled with the scan
	 * @param scanLineDelay The delay (in milliseconds) between subsequent vertical sub-scans
	 */
	private void fillScan(double horizontalResolutionAngle,
						  double verticalResolutionAngle,
						  final CartesianCoordinatesSet cartesianCoordinatesSet,
						  long scanLineDelay)
	{
		// Determine the number of horizontal scan lines
		long horizontalNumberPoints = Math.round(getFov().getHorizontalFieldOfViewAngle() /
													horizontalResolutionAngle);
		
		// Determine the number of vertical scan lines
		long verticalNumberPoints = Math.round(getFov().getVerticalFieldOfViewAngle() /
													verticalResolutionAngle);

		// The current azimuth angle (in radians)
		double azimuthAngle = -(getFov().getHorizontalFieldOfViewAngle() * 0.5);

		// Go through all of the horizontal scan lines
		for(int h = 0; h < horizontalNumberPoints; h++)
		{
			// The current elevation angle (in radians)
			double elevationAngle = -(getFov().getVerticalFieldOfViewAngle() * 0.5);

			// The points in the current vertical scan line
			List<CartesianPositionCoordinates> scanLine = new ArrayList<CartesianPositionCoordinates>();

			// Go through the vertical scan line
			for(int v = 0; v < verticalNumberPoints; v++)
			{			  
				// Simulate a range return
				double range = generateRandomRange();

				// Convert the range return as well as the elevation
				// and azimuth angles to X, Y and Z coordinates.
				double x = range * Math.sin(elevationAngle);
				double y = range * Math.cos(elevationAngle) * Math.sin(azimuthAngle);
				double z = range * Math.cos(elevationAngle) * Math.cos(azimuthAngle);

				// Create a Cartesian coordinate with the calculated X, Y and Z.
				CartesianPositionCoordinates point = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(x,y,z);
				
				// Add the point to the list of scan line points
				scanLine.add(point);

				// Increment elevation
				elevationAngle += verticalResolutionAngle;
			}

			// Add all of the points from the vertical scan line to the coordinate set
			cartesianCoordinatesSet.getPoints().addAll(scanLine);

			try 
			{
				// Sleep for a short period of time (this makes it easier
				// to highlight the differences between blocking and
				// non-blocking scan returns)
				Thread.sleep(scanLineDelay);
			} 
			catch (InterruptedException e) 
			{
				// Print out the stack trace
				e.printStackTrace();
			}

			// Increment azimuth
			azimuthAngle += horizontalResolutionAngle;	
		}
	}

	/**
	 * This method is used to generate a random number, which corresponds to
	 * a value in the Lidar unit's field of view's allowed range; that is, a
	 * random floating point number in
	 * [getFov().getRange().getMinimumDistance(),getFov().getRange().getMaximumDistance()]
	 * is returned. 
	 * @return A random range in the FOV's allowed range
	 * @see #fillScan(double, double, CartesianCoordinatesSet, long)
	 */
	private double generateRandomRange()
	{
		// Generate a number in the FOV's range
		double range = getFov().getRange().getMinimumDistance() +
							(rangeRandom.nextDouble() * getFov().getRange().getDistance());
		
		// Return it
		return range;
	}
} //LidarSimulatedImpl
