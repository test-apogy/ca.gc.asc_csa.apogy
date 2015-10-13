/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;
import org.eclipse.symphony.core.environment.orbit.earth.ConstantElevationMask;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitFacade;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocation;
import org.eclipse.symphony.core.environment.orbit.earth.ElevationMask;
import org.eclipse.symphony.core.environment.orbit.earth.GroundStation;
import org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentFactory;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;
import org.eclipse.symphony.examples.satellite.Activator;
import org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatelliteFactory;
import org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage;
import org.eclipse.symphony.examples.satellite.ImageOrder;
import org.eclipse.symphony.examples.satellite.Satellite;
import org.eclipse.symphony.examples.satellite.SatelliteCommand;
import org.eclipse.symphony.examples.satellite.SatelliteCommandAcquireImage;
import org.eclipse.symphony.examples.satellite.SatelliteCommandList;
import org.eclipse.symphony.examples.satellite.SatelliteCommandRoll;
import org.eclipse.symphony.examples.satellite.SatelliteConstellation;
import org.eclipse.symphony.examples.satellite.SatelliteUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satellite Constellation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationImpl#getSatellites <em>Satellites</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationImpl#getGroundStations <em>Ground Stations</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationImpl#getPendingImageOrders <em>Pending Image Orders</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatelliteConstellationImpl extends MinimalEObjectImpl.Container implements SatelliteConstellation {
	/**
	 * The cached value of the '{@link #getSatellites() <em>Satellites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatellites()
	 * @generated
	 * @ordered
	 */
	protected EList<Satellite> satellites;

	/**
	 * The cached value of the '{@link #getGroundStations() <em>Ground Stations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundStations()
	 * @generated
	 * @ordered
	 */
	protected EList<GroundStation> groundStations;

	/**
	 * The cached value of the '{@link #getPendingImageOrders() <em>Pending Image Orders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPendingImageOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageOrder> pendingImageOrders;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatelliteConstellationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleSatellitePackage.Literals.SATELLITE_CONSTELLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Satellite> getSatellites() {
		if (satellites == null) {
			satellites = new EObjectResolvingEList<Satellite>(Satellite.class, this, EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__SATELLITES);
		}
		return satellites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroundStation> getGroundStations() {
		if (groundStations == null) {
			groundStations = new EObjectResolvingEList<GroundStation>(GroundStation.class, this, EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__GROUND_STATIONS);
		}
		return groundStations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageOrder> getPendingImageOrders() {
		if (pendingImageOrders == null) {
			pendingImageOrders = new EObjectResolvingEList<ImageOrder>(ImageOrder.class, this, EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__PENDING_IMAGE_ORDERS);
		}
		return pendingImageOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Satellite getSatellite(OrbitModel orbitModel) 
	{
		Iterator<Satellite> it = getSatellites().iterator();
		while(it.hasNext())
		{
			Satellite s = it.next();
			
			if(s.getOrbitModel() == orbitModel)
			{
				return s;
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SortedSet<VisibilityPass> getTargetPasses(final ImageOrder imageOrder, final Date startDate, final Date endDate, final ElevationMask elevationMask) throws Exception 
	{
		List<VisibilityPass> passes = new ArrayList<VisibilityPass>();
					
		// For each Satellite, find the target passes over the target.
		try
		{
			EarthSurfaceLocation earthSurfaceLocation = EarthOrbitFacade.INSTANCE.createEarthSurfaceLocation(Integer.toString(imageOrder.getOrderId()), null, imageOrder.getImageCenter().getLongitude(), imageOrder.getImageCenter().getLatitude(), imageOrder.getImageCenter().getElevation());			
			Logger.INSTANCE.log(Activator.ID, this, "Finding passes for ImageOrder <" + imageOrder.getOrderId() + ">...", EventSeverity.INFO);
			
			// Do this in parallel to speed up !
			boolean parallel = false;
			long start = System.currentTimeMillis();
			if(parallel)
			{
				ExecutorService executor = Executors.newFixedThreadPool(10);
				List<Future<List<VisibilityPass>>> futures =  new ArrayList<Future<List<VisibilityPass>>>();
				
				for(Satellite sat : getSatellites())
				{
					if(sat.getOrbitModel().getPropagator() instanceof EarthOrbitPropagator)
					{	
						EarthOrbitPropagator propagator = (EarthOrbitPropagator) sat.getOrbitModel().getPropagator();
						
						Callable<List<VisibilityPass>> worker = new Callable<List<VisibilityPass>>() 
						{						
							@Override
							public List<VisibilityPass> call() throws Exception 
							{								
								return propagator.getTargetPasses(earthSurfaceLocation, startDate, endDate, elevationMask);
							}
						};
												
						// Starts the task.
						Future<List<VisibilityPass>> submit = executor.submit(worker);		
						futures.add(submit);
					}
				}
				
				for(Future<List<VisibilityPass>> futur : futures)
				{
					passes.addAll(futur.get());
				}				
			}
			else
			{
				for(Satellite sat : getSatellites())
				{
					if(sat.getOrbitModel().getPropagator() instanceof EarthOrbitPropagator)
					{					
						// Copies the propagator to ensure planning is thread safe.						
						EarthOrbitPropagator propagator = (EarthOrbitPropagator) sat.getOrbitModel().getPropagator();
						//EarthOrbitPropagator propagator = EcoreUtil.copy(propagatorOriginal);						
						
						List<VisibilityPass>  satPasses = propagator.getTargetPasses(earthSurfaceLocation, startDate, endDate, elevationMask);
						
						System.out.println("Passes for ImageOrder <" + imageOrder.getOrderId() + ">");
						for(VisibilityPass vp : satPasses)
						{
							System.out.println("\t Pass: Seen by " + vp.getOrbitModel().getName() + " At <" + vp.getStartTime() + ">");
						}
						
						passes.addAll(satPasses);
					}
				}	
			}
			long end = System.currentTimeMillis();
			double duration = (end-start) * 0.001;
			DecimalFormat format = new DecimalFormat("0.001");
			Logger.INSTANCE.log(Activator.ID, this, "Found <" + passes.size() + "> potential passes for ImageOrder <" + imageOrder.getOrderId() + "> in <" + format.format(duration) + "> seconds.", EventSeverity.OK);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		
		
		SortedSet<VisibilityPass> sortedPasses = EarthOrbitFacade.INSTANCE.getVisibilityPassSortedByStartDate(passes);
		return sortedPasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SortedSet<VisibilityPass> getGroundStationPasses(Satellite satellite, Date startDate, Date endDate, ElevationMask elevationMask) throws Exception 
	{	
		SpacecraftsVisibilitySet visibilitySet = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createSpacecraftsVisibilitySet();
		visibilitySet.getGroundStations().addAll(getGroundStations());
		visibilitySet.getOrbitModels().add(satellite.getOrbitModel());		
		visibilitySet.setStartTime(startDate);
		visibilitySet.setEndTime(endDate);
		
		visibilitySet.update();
						
		SortedSet<VisibilityPass> sortedPasses = EarthOrbitFacade.INSTANCE.getVisibilityPassSortedByStartDate(visibilitySet.getPasses());		
		return sortedPasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SatelliteCommandList plan(List<ImageOrder> imageOrders, Date startDate, Date endDate) 
	{
		if(imageOrders.size() > 1)
		{
			return parallelPlan(imageOrders, startDate, endDate);
		}
		else
		{
			return serialPlan(imageOrders, startDate, endDate);
		}
	}

	/**
	 * Serial implementation of Plan.
	 * @param imageOrders
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	private SatelliteCommandList serialPlan(List<ImageOrder> imageOrders, Date startDate, Date endDate)
	{
		SatelliteCommandList commandList = EMFEcoreExampleSatelliteFactory.eINSTANCE.createSatelliteCommandList();
		
		List<ImageOrder> plannedOrders = new ArrayList<ImageOrder>();
		List<ImageOrder> unPlannedOrders = new ArrayList<ImageOrder>();
		
		// First, order imageOrders by priority.
		SortedSet<ImageOrder> sortedImageOrders  = SatelliteUtils.INSTANCE.sortImageOrderByPriority(imageOrders);
		
		// Creates a target elevation mask of 85 degrees (09 deg - max roll angle).
		ConstantElevationMask elevationMask = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createConstantElevationMask();
		elevationMask.setConstantElevation(Math.toRadians(85.0));
		
		long start = System.currentTimeMillis();
		
		// For each image order, finds the target passes available within the period defined.
		Iterator<ImageOrder> iterator = sortedImageOrders.iterator();
		while(iterator.hasNext())
		{
			ImageOrder imageOrder = iterator.next();
			
			try 
			{
				SortedSet<VisibilityPass> sortedPasses = getTargetPasses(imageOrder, startDate, endDate, elevationMask);
				
				if(!sortedPasses.isEmpty())
				{
					VisibilityPass selectedVisibilityPass = null;
					
					Iterator<VisibilityPass> passesIterator = sortedPasses.iterator();
					while(selectedVisibilityPass == null && passesIterator.hasNext())
					{												
						VisibilityPass pass = passesIterator.next();
						
						// Gets the satellite associated with the pass.
						Satellite satellite = getSatellite(pass.getOrbitModel());
						
						// Checks to see if the pass brings us close enough to the target.
						VisibilityPassSpacecraftPosition smallestCrossTrackAnglePosition = pass.getPositionHistory().getSmallestSpacecraftCrossTrackAnglePosition();
						if(smallestCrossTrackAnglePosition != null && 
						   Math.abs(smallestCrossTrackAnglePosition.getSpacecraftCrossTrackAngle()) <= Math.abs(satellite.getMaximumRoll()))
						  {
							// We have found a good pass.
							selectedVisibilityPass = pass;
																					
							// Gets the ideal time and roll angle for the imaging.
							Date imageTime = smallestCrossTrackAnglePosition.getTime();
							double rollAngle = smallestCrossTrackAnglePosition.getSpacecraftCrossTrackAngle();
							
							// Creates a command to roll the spacecraft a little bit before the imaging.
							double scMaximumRollRate = satellite.getMaximumRollRate();
							double rollTime = Math.abs(rollAngle / scMaximumRollRate);							
							Date rollStartTime = new Date(imageTime.getTime() + (int) Math.round(rollTime * 1000.0));							
							SatelliteCommandRoll rollCmd = SatelliteUtils.INSTANCE.createSatelliteCommandRoll(satellite, rollStartTime, rollAngle);
							commandList.getCommands().add(rollCmd);
							
							// Creates a command to image the target.
							SatelliteCommandAcquireImage imagingCmd = SatelliteUtils.INSTANCE.createSatelliteCommandAcquireImage(satellite, imageTime, imageOrder);
							commandList.getCommands().add(imagingCmd);
							
							// Adds the order in the planned list.
							plannedOrders.add(imageOrder);
						}
					}
				}
				else
				{
					// ImageOrder cannot be fullfiled in the specified period.					
				}
				
			} 
			catch (Exception e) 
			{			
				e.printStackTrace();
			}
			
			// If the ImageOrder could not be planned, add it to the list of unplanned.
			if(!plannedOrders.contains(imageOrder))
			{
				unPlannedOrders.add(imageOrder);
			}		
		}
		
		long end = System.currentTimeMillis();
		System.out.println("DURATION : " + (end-start)*0.001);
		
		// DEBUG
		System.out.println("Planned ImageOrders : ");
		for(ImageOrder imageOrder : plannedOrders)
		{
			System.out.println("\t ImageOrder ID : " + imageOrder.getOrderId());
		}
		
		System.out.println("Unplanned ImageOrders : ");
		for(ImageOrder imageOrder : unPlannedOrders)
		{
			System.out.println("\t ImageOrder ID : " + imageOrder.getOrderId());
		}
		
		System.out.println("-------------------------");
		System.out.println("PLAN ");
		
		for(SatelliteCommand cmd : commandList.getCommands())
		{			
			System.out.print("\t" + cmd.getCommandStartTime());
			
			if(cmd instanceof SatelliteCommandRoll)
			{
				SatelliteCommandRoll cmdRoll = (SatelliteCommandRoll) cmd;
				System.out.println(" Roll : " + Math.toDegrees(cmdRoll.getTargetRollAngle()));
			}
			else if(cmd instanceof SatelliteCommandAcquireImage)
			{
				SatelliteCommandAcquireImage cmdImage = (SatelliteCommandAcquireImage) cmd;
				System.out.println(" Imaging : " + cmdImage.getImageOrder().getOrderId());
			}			
		}
		
		System.out.println("-------------------------");
		
		
		// DEBUG END
								
		return commandList;
		
		
	}
	
	/**
	 * Paralellized implementation of Plan.
	 * @param imageOrders
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	private SatelliteCommandList parallelPlan(List<ImageOrder> imageOrders, Date startDate, Date endDate)
	{
		SatelliteCommandList commandList = EMFEcoreExampleSatelliteFactory.eINSTANCE.createSatelliteCommandList();
		
		List<ImageOrder> plannedOrders = new ArrayList<ImageOrder>();
		List<ImageOrder> unPlannedOrders = new ArrayList<ImageOrder>();
		
		// First, order imageOrders by priority.
		SortedSet<ImageOrder> sortedImageOrders  = SatelliteUtils.INSTANCE.sortImageOrderByPriority(imageOrders);
		
		// Creates a target elevation mask of 85 degrees (09 deg - max roll angle).
		ConstantElevationMask elevationMask = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createConstantElevationMask();
		elevationMask.setConstantElevation(Math.toRadians(85.0));
		
		// Parallelisation 
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<Future<List<SatelliteCommand>>> futures =  new ArrayList<Future<List<SatelliteCommand>>>();
		
		long start = System.currentTimeMillis();
		
		// For each image order, finds the target passes available within the period defined.
		Iterator<ImageOrder> iterator = sortedImageOrders.iterator();
		while(iterator.hasNext())
		{
			ImageOrder imageOrder = iterator.next();
									
			// Create a Callable to process this ImageOrder.		
			Callable<List<SatelliteCommand>> worker = new Callable<List<SatelliteCommand>>() 
			{						
				@Override
				public List<SatelliteCommand> call() throws Exception 
				{								
					List<SatelliteCommand> commands = new ArrayList<SatelliteCommand>();
					
					try 
					{
						SortedSet<VisibilityPass> sortedPasses = getTargetPasses(imageOrder, startDate, endDate, elevationMask);
						
						if(!sortedPasses.isEmpty())
						{
							VisibilityPass selectedVisibilityPass = null;
							
							Iterator<VisibilityPass> passesIterator = sortedPasses.iterator();
							while(selectedVisibilityPass == null && passesIterator.hasNext())
							{												
								VisibilityPass pass = passesIterator.next();
								
								// Gets the satellite associated with the pass.
								Satellite satellite = getSatellite(pass.getOrbitModel());
								
								// Checks to see if the pass brings us close enough to the target.
								VisibilityPassSpacecraftPosition smallestCrossTrackAnglePosition = pass.getPositionHistory().getSmallestSpacecraftCrossTrackAnglePosition();
								if(smallestCrossTrackAnglePosition != null && 
								   Math.abs(smallestCrossTrackAnglePosition.getSpacecraftCrossTrackAngle()) <= Math.abs(satellite.getMaximumRoll()))
								  {
									// We have found a good pass.
									selectedVisibilityPass = pass;
																							
									// Gets the ideal time and roll angle for the imaging.
									Date imageTime = smallestCrossTrackAnglePosition.getTime();
									double rollAngle = smallestCrossTrackAnglePosition.getSpacecraftCrossTrackAngle();
									
									// Creates a command to roll the spacecraft a little bit before the imaging.
									double scMaximumRollRate = satellite.getMaximumRollRate();
									double rollTime = Math.abs(rollAngle / scMaximumRollRate);							
									Date rollStartTime = new Date(imageTime.getTime() + (int) Math.round(rollTime * 1000.0));							
									SatelliteCommandRoll rollCmd = SatelliteUtils.INSTANCE.createSatelliteCommandRoll(satellite, rollStartTime, rollAngle);
									commands.add(rollCmd);
									
									// Creates a command to image the target.
									SatelliteCommandAcquireImage imagingCmd = SatelliteUtils.INSTANCE.createSatelliteCommandAcquireImage(satellite, imageTime, imageOrder);
									commands.add(imagingCmd);
									
									// Adds the order in the planned list.
									plannedOrders.add(imageOrder);
								}
							}
						}
						else
						{
							// ImageOrder cannot be fullfiled in the specified period.					
						}
						
					} 
					catch (Exception e) 
					{			
						e.printStackTrace();
					}
					
					// If the ImageOrder could not be planned, add it to the list of unplanned.
					if(!plannedOrders.contains(imageOrder))
					{
						unPlannedOrders.add(imageOrder);
					}
					
					return commands;
				}
			};
		
			// Submit the task.
			Future<List<SatelliteCommand>> submit = executor.submit(worker);				
			futures.add(submit);						
		}
		
		// Make the executor accepts NO new thread and complete all threads currently working.
		executor.shutdown();
		while (!executor.isTerminated()) 
		{
	    }
				
		// Collects the result of the tasks.
		for(Future<List<SatelliteCommand>> futur : futures)
		{
			try
			{
				commandList.getCommands().addAll(futur.get());
			}
			catch(Throwable t)
			{					
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("DURATION : " + (end-start)*0.001);
		
		// DEBUG
		System.out.println("Planned ImageOrders : ");
		for(ImageOrder imageOrder : plannedOrders)
		{
			System.out.println("\t ImageOrder ID : " + imageOrder.getOrderId());
		}
		
		System.out.println("Unplanned ImageOrders : ");
		for(ImageOrder imageOrder : unPlannedOrders)
		{
			System.out.println("\t ImageOrder ID : " + imageOrder.getOrderId());
		}
		
		System.out.println("-------------------------");
		System.out.println("PLAN ");
		
		for(SatelliteCommand cmd : commandList.getCommands())
		{			
			System.out.print("\t" + cmd.getCommandStartTime());
			
			if(cmd instanceof SatelliteCommandRoll)
			{
				SatelliteCommandRoll cmdRoll = (SatelliteCommandRoll) cmd;
				System.out.println(" Roll : " + Math.toDegrees(cmdRoll.getTargetRollAngle()));
			}
			else if(cmd instanceof SatelliteCommandAcquireImage)
			{
				SatelliteCommandAcquireImage cmdImage = (SatelliteCommandAcquireImage) cmd;
				System.out.println(" Imaging : " + cmdImage.getImageOrder().getOrderId());
			}			
		}
		
		System.out.println("-------------------------");
		// DEBUG END
								
		return commandList;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SatelliteCommandList plan(Date startDate, Date endDate) 
	{
		return plan(getPendingImageOrders(), startDate, endDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SatelliteCommandList plan() 
	{
		return plan(getPendingImageOrders(), getStartDate(), getEndDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__SATELLITES:
				return getSatellites();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__GROUND_STATIONS:
				return getGroundStations();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__PENDING_IMAGE_ORDERS:
				return getPendingImageOrders();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__START_DATE:
				return getStartDate();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__END_DATE:
				return getEndDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__SATELLITES:
				getSatellites().clear();
				getSatellites().addAll((Collection<? extends Satellite>)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__GROUND_STATIONS:
				getGroundStations().clear();
				getGroundStations().addAll((Collection<? extends GroundStation>)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__PENDING_IMAGE_ORDERS:
				getPendingImageOrders().clear();
				getPendingImageOrders().addAll((Collection<? extends ImageOrder>)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__START_DATE:
				setStartDate((Date)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__END_DATE:
				setEndDate((Date)newValue);
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__SATELLITES:
				getSatellites().clear();
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__GROUND_STATIONS:
				getGroundStations().clear();
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__PENDING_IMAGE_ORDERS:
				getPendingImageOrders().clear();
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__SATELLITES:
				return satellites != null && !satellites.isEmpty();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__GROUND_STATIONS:
				return groundStations != null && !groundStations.isEmpty();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__PENDING_IMAGE_ORDERS:
				return pendingImageOrders != null && !pendingImageOrders.isEmpty();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION___GET_SATELLITE__ORBITMODEL:
				return getSatellite((OrbitModel)arguments.get(0));
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION___GET_TARGET_PASSES__IMAGEORDER_DATE_DATE_ELEVATIONMASK:
				try {
					return getTargetPasses((ImageOrder)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (ElevationMask)arguments.get(3));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION___GET_GROUND_STATION_PASSES__SATELLITE_DATE_DATE_ELEVATIONMASK:
				try {
					return getGroundStationPasses((Satellite)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (ElevationMask)arguments.get(3));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION___PLAN__LIST_DATE_DATE:
				return plan((List<ImageOrder>)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION___PLAN__DATE_DATE:
				return plan((Date)arguments.get(0), (Date)arguments.get(1));
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION___PLAN:
				return plan();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //SatelliteConstellationImpl
