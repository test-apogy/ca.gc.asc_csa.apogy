package ca.gc.asc_csa.apogy.core.environment.orbit.earth;
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

import java.util.Date;
import java.util.List;
import java.util.SortedSet;

import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.Orbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState;
import ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedAngularCoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedPVACoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthFacadeImpl;
import org.orekit.frames.Frame;
import org.orekit.orbits.CartesianOrbit;
import org.orekit.orbits.KeplerianOrbit;
import org.orekit.propagation.Propagator;
import org.orekit.time.AbsoluteDate;
import org.orekit.utils.TimeStampedAngularCoordinates;
import org.orekit.utils.TimeStampedPVCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Orbit Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getApogyCoreEnvironmentOrbitEarthFacade()
 * @model
 * @generated
 */
public interface ApogyCoreEnvironmentOrbitEarthFacade extends EObject 
{
	public static ApogyCoreEnvironmentOrbitEarthFacade INSTANCE = ApogyCoreEnvironmentOrbitEarthFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Earth gravitational constant from GRIM5C1 model: 3.986004415e14 m³/s².
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m\263/s\262'"
	 * @generated
	 */
	double getMu();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an AbsoluteDate from a Date.
	 * @param date A date.
	 * @return The AbsoluteDate (OreKit type) for the specified date.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.AbsoluteDate" unique="false" dateUnique="false"
	 * @generated
	 */
	AbsoluteDate createAbsoluteDate(Date date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an Date from a AbsoluteDate.
	 * <!-- end-model-doc -->
	 * @model unique="false" absoluteDateDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.AbsoluteDate" absoluteDateUnique="false"
	 * @generated
	 */
	Date createDate(AbsoluteDate absoluteDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an EarthSurfaceLocation from parameters.
	 * @param name The name of the location.
	 * @param description The description of the location.
	 * @param longitude The longitude of the location, in radians.
	 * @param latitude The latitude of the location, in radians.
	 * @param elevation The elevation of the location, in meters.
	 * @return The EarthSurfaceLocation.
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false" descriptionUnique="false" longitudeUnique="false"
	 *        longitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'" latitudeUnique="false"
	 *        latitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'" elevationUnique="false"
	 *        elevationAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m'"
	 * @generated
	 */
	EarthSurfaceLocation createEarthSurfaceLocation(String name, String description, double longitude, double latitude, double elevation);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create an OreKitBackedFrame based on an OreKit frame.
	 * <!-- end-model-doc -->
	 * @model unique="false" oreKitFrameDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitFrame" oreKitFrameUnique="false"
	 * @generated
	 */
	OreKitBackedFrame createOreKitBackedFrame(Frame oreKitFrame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the geographic sub-point for a given spacecraft state.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" oreKitBackedSpacecraftStateUnique="false"
	 * @generated
	 */
	GeographicCoordinates getSpacecraftEarthSubPoint(OreKitBackedSpacecraftState oreKitBackedSpacecraftState) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the elevation angle of a spacecraft relative
	 * to a Earth surface location.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" spacecraftStateUnique="false" earthSurfaceLocationUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getSpacecraftElevationAngle(SpacecraftState spacecraftState, EarthSurfaceLocation earthSurfaceLocation) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the azimuth angle (relative to North) of a
	 * spacecraft at a Earth surface location.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" spacecraftStateUnique="false" earthSurfaceLocationUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getSpacecraftAzimuthAngle(SpacecraftState spacecraftState, EarthSurfaceLocation earthSurfaceLocation) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the distance between spacecraft and a specified target.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" spacecraftStateUnique="false" earthSurfaceLocationUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m'"
	 * @generated
	 */
	double getRange(SpacecraftState spacecraftState, EarthSurfaceLocation earthSurfaceLocation) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" orbitUnique="false" oreKitSpacecraftStateDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitSpacecraftState" oreKitSpacecraftStateUnique="false"
	 * @generated
	 */
	SpacecraftState createSpacecraftState(Orbit orbit, org.orekit.propagation.SpacecraftState oreKitSpacecraftState);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" orbitUnique="false" oreKitSpacecraftStateDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitSpacecraftState" oreKitSpacecraftStateUnique="false"
	 * @generated
	 */
	OreKitBackedSpacecraftState createOreKitBackedSpacecraftState(Orbit orbit, org.orekit.propagation.SpacecraftState oreKitSpacecraftState);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" oreKitTimeStampedPVCoordinatesDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitTimeStampedPVCoordinates" oreKitTimeStampedPVCoordinatesUnique="false"
	 * @generated
	 */
	TimedStampedPVACoordinates createTimedStampedPVACoordinates(TimeStampedPVCoordinates oreKitTimeStampedPVCoordinates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" oreKitTimeStampedAngularCoordinatesDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitTimeStampedAngularCoordinates" oreKitTimeStampedAngularCoordinatesUnique="false"
	 * @generated
	 */
	TimedStampedAngularCoordinates createTimedStampedAngularCoordinates(TimeStampedAngularCoordinates oreKitTimeStampedAngularCoordinates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" rotationDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Rotation" rotationUnique="false"
	 * @generated
	 */
	Matrix3x3 createMatrix3x3(Rotation rotation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Rotation" unique="false" matrix3x3Unique="false"
	 * @generated
	 */
	Rotation createRotation(Matrix3x3 matrix3x3);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a Keplerian Orbit based on a EarthOrbitPropagator.
	 * @param earthOrbitPropagator The EarthOrbitPropagator.
	 * @return A KeplerianEarthOrbit representing the initial orbit of the propagator.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" earthOrbitPropagatorUnique="false"
	 * @generated
	 */
	KeplerianEarthOrbit createKeplerianOrbit(EarthOrbitPropagator earthOrbitPropagator) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a CartesianEarthOrbit Orbit based on a EarthOrbitPropagator.
	 * @param earthOrbitPropagator The EarthOrbitPropagator.
	 * @return A CartesianEarthOrbit representing the initial orbit of the propagator.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" earthOrbitPropagatorUnique="false"
	 * @generated
	 */
	CartesianEarthOrbit createCartesianEarthOrbit(EarthOrbitPropagator earthOrbitPropagator) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a KeplerianEarthOrbit from an OreKit KeplerianOrbit.
	 * @param oreKitKeplerianOrbit The OreKit Keplerian Orbit.
	 * @return the associated KeplerianEarthOrbit.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" oreKitKeplerianOrbitDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitKeplerianOrbit" oreKitKeplerianOrbitUnique="false"
	 * @generated
	 */
	KeplerianEarthOrbit createKeplerianOrbit(KeplerianOrbit oreKitKeplerianOrbit) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a CartesianEarthOrbit from an OreKit CartesianOrbit.
	 * @param oreKitKeplerianOrbit The OreKit Cartesian Orbit.
	 * @return the associated CartesianEarthOrbit.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" oreKitCartesianOrbitDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitCartesianOrbit" oreKitCartesianOrbitUnique="false"
	 * @generated
	 */
	CartesianEarthOrbit createCartesianEarthOrbit(CartesianOrbit oreKitCartesianOrbit) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts an OreKit SpacecraftState to GeographicCoordinates. The conversion uses the IERS_2010 frame with a WGS84 equatorial radius and earth flatenning.
	 * @param oreKitBackedSpacecraftState The OreKit SpacecraftState.
	 * @return the associated GeographicCoordinates.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" oreKitBackedSpacecraftStateUnique="false"
	 * @generated
	 */
	GeographicCoordinates convertToGeographicCoordinates(OreKitBackedSpacecraftState oreKitBackedSpacecraftState) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the list of spacecraft state a at given time interval.
	 * @param earthOrbitModel The EarthOrbitModel used.
	 * @param propagator The OreKit propagator to use.
	 * @param startDate The start time of the propagation.
	 * @param endDate The end time of the propagation.
	 * @param timeInterval The time interval between spacecraft state evaluation, in seconds.
	 * The list of SpacecraftState. Never null, but can be empty.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.List<ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState>" unique="false" many="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" propagatorDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitPropagator" propagatorUnique="false" startDateUnique="false" endDateUnique="false" timeIntervalUnique="false"
	 * @generated
	 */
	List<SpacecraftState> getSpacecraftStates(Propagator propagator, Date startDate, Date endDate, double timeInterval) throws Exception;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the list of passes for a given target.
	 * @param earthOrbitModel The EarthOrbitModel used.
	 * @param propagator The OreKit propagator to use.
	 * @param earthSurfaceLocation The location of the target.
	 * @param startDate The start time of the propagation.
	 * @param endDate The end time of the propagation.
	 * @param elevationMaks The elevation mask used to determine the visibility of the spacecraft at the target location.
	 * @param The list of VisibilityPass. Never null, but can be empty.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.List<ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass>" unique="false" many="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" earthOrbitModelUnique="false" earthSurfaceLocationUnique="false" startDateUnique="false" endDateUnique="false" elevationMaskUnique="false"
	 * @generated
	 */
	List<VisibilityPass> getTargetPasses(EarthOrbitModel earthOrbitModel, EarthSurfaceLocation earthSurfaceLocation, Date startDate, Date endDate, ElevationMask elevationMask) throws Exception;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the list of passes for a given Ground Station (and its Field Of View) during a specified interval.
	 * @param propagator The OreKit propagator to use.
	 * @param groundStation The location of the target.
	 * @param startDate The start time of the propagation.
	 * @param endDate The end time of the propagation.
	 * @return The list of VisibilityPass. Never null, but can be empty.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.List<ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass>" unique="false" many="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" earthOrbitModelUnique="false" groundStationUnique="false" startDateUnique="false" endDateUnique="false"
	 * @generated
	 */
	List<VisibilityPass> getGroundStationPasses(EarthOrbitModel earthOrbitModel, GroundStation groundStation, Date startDate, Date endDate) throws Exception;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the list of {@link Eclipse} that will be experienced by the spacecraft within a specified time period.
	 * @param propagator The OreKit propagator to use.
	 * @param startDate The start time of the propagation.
	 * @param endDate The end time of the propagation.
	 * @return The list of Eclipse. Never null, but can be empty.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.List<ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse>" unique="false" many="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" earthOrbitModelUnique="false" startDateUnique="false" endDateUnique="false"
	 * @generated
	 */
	List<Eclipse> getEclipses(EarthOrbitModel earthOrbitModel, Date startDate, Date endDate) throws Exception;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sorts a list of VisibilityPass by increasing date order (form earlier to later). If two or more VisibilityPass
	 * have the same start date, they are ordered by duration.
	 * @param passes The list of VisibilityPass.
	 * @return the SortedSet of VisibilityPass.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.SortedSet<ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass>" unique="false" passesDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.List<ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass>" passesUnique="false" passesMany="false"
	 * @generated
	 */
	SortedSet<VisibilityPass> getVisibilityPassSortedByStartDate(List<VisibilityPass> passes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sorts a list of VisibilityPass by increasing duration. If two or more VisibilityPass
	 * have the same duration, they are ordered by start date.
	 * @param passes The list of VisibilityPass.
	 * @return the SortedSet of VisibilityPass.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.SortedSet<ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass>" unique="false" passesDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.List<ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass>" passesUnique="false" passesMany="false"
	 * @generated
	 */
	SortedSet<VisibilityPass> getVisibilityPassSortedByDuration(List<VisibilityPass> passes);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sorts a list of VisibilityPassSpacecraftPosition by increasing elevation.
	 * @param passes The list of VisibilityPassSpacecraftPosition.
	 * @return the SortedSet of VisibilityPassSpacecraftPosition.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.SortedSet<ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition>" unique="false" positionsDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.List<ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition>" positionsUnique="false" positionsMany="false"
	 * @generated
	 */
	SortedSet<VisibilityPassSpacecraftPosition> getVisibilityPassSpacecraftPositionSortedByElevation(List<VisibilityPassSpacecraftPosition> positions);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sorts a list of VisibilityPassSpacecraftPosition by increasing spacecraft cross-track angle.
	 * @param passes The list of VisibilityPassSpacecraftPosition.
	 * @return the SortedSet of VisibilityPassSpacecraftPosition.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.SortedSet<ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition>" unique="false" positionsDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.List<ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition>" positionsUnique="false" positionsMany="false"
	 * @generated
	 */
	SortedSet<VisibilityPassSpacecraftPosition> getVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle(List<VisibilityPassSpacecraftPosition> positions);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loads a TLE from a URL.
	 * @param url The URL as a String.
	 * @return The loaded TLE
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" urlUnique="false"
	 * @generated
	 */
	TLE loadTLE(String url) throws Exception;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exports a TLE to a URL.
	 * @param tle The TLE to export
	 * @param url The URL as a String.
	 * @throws An exception if the export fails.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" tleUnique="false" urlUnique="false"
	 * @generated
	 */
	void exportTLE(TLE tle, String url) throws Exception;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a TLEEarthOrbitModel using a TLE.
	 * @param tle The Two-Line Element defining the propagator.
	 * @return The TLEEarthOrbitModel.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception" tleUnique="false"
	 * @generated
	 */
	TLEEarthOrbitModel createTLEEarthOrbitModel(TLE tle) throws Exception;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Exports a VisibilityPassSpacecraftPositionHistory as a comma separated file (.csv).
	 * @param visibilityPassSpacecraftPositionHistory The VisibilityPassSpacecraftPositionHistory to export.
	 * @param includeHeader Whether or not to include a header line in the format.
	 * <!-- end-model-doc -->
	 * @model unique="false" visibilityPassSpacecraftPositionHistoryUnique="false" includeHeaderUnique="false"
	 * @generated
	 */
	String exportAsCSV(VisibilityPassSpacecraftPositionHistory visibilityPassSpacecraftPositionHistory, boolean includeHeader);

} // ApogyCoreEnvironmentOrbitEarthFacade
