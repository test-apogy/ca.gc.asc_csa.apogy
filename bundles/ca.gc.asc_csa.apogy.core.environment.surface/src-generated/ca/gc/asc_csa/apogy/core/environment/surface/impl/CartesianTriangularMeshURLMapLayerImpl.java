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
package ca.gc.asc_csa.apogy.core.environment.surface.impl;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.environment.Activator;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshURLMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.URLMapLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh URL Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshURLMapLayerImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshURLMapLayerImpl#getMesh <em>Mesh</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartesianTriangularMeshURLMapLayerImpl extends CartesianTriangularMeshMapLayerImpl implements CartesianTriangularMeshURLMapLayer {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMesh() <em>Mesh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesh()
	 * @generated
	 * @ordered
	 */
	protected CartesianTriangularMesh mesh;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshURLMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setUrl(String newUrl) 
	{				
		setUrlGen(newUrl);
		
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(this);
		if(domain instanceof TransactionalEditingDomain)
		{
			domain.getCommandStack().execute(new RecordingCommand((TransactionalEditingDomain)domain) {
				@Override
				protected void doExecute() 
				{							
					setMeshIsDirty(true);
				}
			});										
		}
	
		// transactionSet(this, ApogySurfaceEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY, new Boolean(true));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlGen(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL, oldUrl, url));
	}

	  /**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated_NOT
	   */
	  public CartesianTriangularMesh getMesh()
	  {	  	  
		  if(isMeshIsDirty() || (mesh == null))
		  {			  			  			  
			  mesh = loadMesh(getUrl());		 
		  }
		  return mesh;
	  }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMesh basicGetMesh() {
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesh(CartesianTriangularMesh newMesh) {
		CartesianTriangularMesh oldMesh = mesh;
		mesh = newMesh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH, oldMesh, mesh));
	}

	@Override
	public CartesianTriangularMesh getCurrentMesh() 
	{
		return getMesh();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL:
				return getUrl();
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH:
				if (resolve) return getMesh();
				return basicGetMesh();
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
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL:
				setUrl((String)newValue);
				return;
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH:
				setMesh((CartesianTriangularMesh)newValue);
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
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL:
				setUrl(URL_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH:
				setMesh((CartesianTriangularMesh)null);
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
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH:
				return mesh != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == URLMapLayer.class) {
			switch (derivedFeatureID) {
				case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL: return ApogySurfaceEnvironmentPackage.URL_MAP_LAYER__URL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == URLMapLayer.class) {
			switch (baseFeatureID) {
				case ApogySurfaceEnvironmentPackage.URL_MAP_LAYER__URL: return ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

	private CartesianTriangularMesh loadMesh(String urlString) 
	{
		CartesianTriangularMesh loadedMesh = null;

		Logger.INSTANCE.log(Activator.ID, this, "Loading Mesh from <" + url + "> ...", EventSeverity.INFO);

		try 
		{
			URL url = resolveURLString(urlString);
			loadedMesh = (CartesianTriangularMesh) ApogyCommonConvertersFacade.INSTANCE.convert(url,CartesianTriangularMesh.class);

			if (loadedMesh != null) 
			{
				Logger.INSTANCE.log(Activator.ID, this, "Sucesfully loaded Mesh from url " + url + ">. Mesh contains "
						+ loadedMesh.getPolygons().size() + " triangles.", EventSeverity.OK);
			} 
			else 
			{
				Logger.INSTANCE.log(Activator.ID, this,
						"Could not load Mesh from url " + url + ">. No converter found !", EventSeverity.ERROR);
			}
		} 
		catch (Throwable t) 
		{
			t.printStackTrace();

			Logger.INSTANCE.log(Activator.ID, this, "Could not load Mesh from <" + url + "> !", EventSeverity.ERROR, t);

			loadedMesh = null;
		}
		
		// Set mesh dirty to false
		// TODO : Do this using ApogyCommonEmfTransactionFacade.
		// transactionSet(this, ApogySurfaceEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY, new Boolean(false));
		
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(this);
		if(domain instanceof TransactionalEditingDomain)
		{
			domain.getCommandStack().execute(new RecordingCommand((TransactionalEditingDomain)domain) {
				@Override
				protected void doExecute() 
				{							
					setMeshIsDirty(false);
				}
			});										
		}
						
		return loadedMesh;
	}

	private URL resolveURLString(String urlString) 
	{
		URL url = null;

		try {
			// If the file protocol is used.
			if ((urlString.startsWith("file:")) || (urlString.startsWith("http:"))) {
				url = new URL(urlString);
			} else if (urlString.startsWith("platform")) {
				url = FileLocator.find(new URL(urlString));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return url;
	}
} //CartesianTriangularMeshURLMapLayerImpl
