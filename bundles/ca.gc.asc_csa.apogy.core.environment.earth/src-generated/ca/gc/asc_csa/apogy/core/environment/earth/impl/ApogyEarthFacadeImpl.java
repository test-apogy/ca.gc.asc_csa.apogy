/**
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
package ca.gc.asc_csa.apogy.core.environment.earth.impl;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.invocator.Environment;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Apogy
 * Earth Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyEarthFacadeImpl extends MinimalEObjectImpl.Container implements ApogyEarthFacade {
	private static ApogyEarthFacade instance = null;

	public static ApogyEarthFacade getInstance() {
		if (instance == null) {
			instance = new ApogyEarthFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyEarthFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyEarthEnvironmentPackage.Literals.APOGY_EARTH_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Tuple3d getMoonVector(Node node, Environment environment) {
		if (environment instanceof ApogyEnvironment) {
			// ApogyEnvironment apogyEnvironment = (ApogyEnvironment)
			// environment;

			// Search the active topology.
			// TODO
			Node moon = null;

			Matrix4d matrix = ApogyCommonTopologyFacade.INSTANCE.expressInFrame(moon, node);
			Vector3d v = new Vector3d();

			matrix.get(v);
			v.normalize();

			return ApogyCommonMathFacade.INSTANCE.createTuple3d(v);

		}

		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public GeographicCoordinates createGeographicCoordinates(double longitude, double latitude, double altitude) {
		GeographicCoordinates coord = ApogyEarthEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
		coord.setLongitude(longitude);
		coord.setLatitude(latitude);
		coord.setElevation(altitude);

		return coord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public EarthSurfaceLocation createEarthSurfaceLocation(String name, String description, double longitude, double latitude, double elevation) 
	{
		EarthSurfaceLocation loc = ApogyEarthEnvironmentFactory.eINSTANCE.createEarthSurfaceLocation();
		loc.setName(name);
		loc.setDescription(description);
		
		loc.setLatitude(latitude);
		loc.setLongitude(longitude);
		loc.setElevation(elevation);	
		
		return loc;
	}

	@Override
	public Tuple3d getMoonVector(ApogySystem apogySystem, String nodeID, Environment environment) {
		EList<Node> nodes = ApogyCommonTopologyFacade.INSTANCE.findNodesByID(nodeID,
				apogySystem.getTopologyRoot().getOriginNode());
		if (!nodes.isEmpty()) {
			Node node = nodes.get(0);
			return getMoonVector(node, environment);
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyEarthEnvironmentPackage.APOGY_EARTH_FACADE___GET_MOON_VECTOR__APOGYSYSTEM_STRING_ENVIRONMENT:
				return getMoonVector((ApogySystem)arguments.get(0), (String)arguments.get(1), (Environment)arguments.get(2));
			case ApogyEarthEnvironmentPackage.APOGY_EARTH_FACADE___GET_MOON_VECTOR__NODE_ENVIRONMENT:
				return getMoonVector((Node)arguments.get(0), (Environment)arguments.get(1));
			case ApogyEarthEnvironmentPackage.APOGY_EARTH_FACADE___CREATE_GEOGRAPHIC_COORDINATES__DOUBLE_DOUBLE_DOUBLE:
				return createGeographicCoordinates((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case ApogyEarthEnvironmentPackage.APOGY_EARTH_FACADE___CREATE_EARTH_SURFACE_LOCATION__STRING_STRING_DOUBLE_DOUBLE_DOUBLE:
				return createEarthSurfaceLocation((String)arguments.get(0), (String)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3), (Double)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

} // ApogyEarthFacadeImpl
