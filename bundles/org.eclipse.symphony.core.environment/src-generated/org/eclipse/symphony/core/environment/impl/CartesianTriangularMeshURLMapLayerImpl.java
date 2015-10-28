/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import java.net.URL;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.environment.Activator;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshURLMapLayer;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;
import org.eclipse.symphony.core.environment.URLMapLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh URL Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.CartesianTriangularMeshURLMapLayerImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.CartesianTriangularMeshURLMapLayerImpl#getMesh <em>Mesh</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartesianTriangularMeshURLMapLayerImpl extends CartesianTriangularMeshMapLayerImpl implements CartesianTriangularMeshURLMapLayer
{		
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
  protected CartesianTriangularMeshURLMapLayerImpl()
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
		return Symphony__CoreEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER;
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
		setMeshIsDirty(true);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL, oldUrl, url));
	}
		
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public CartesianTriangularMesh getMesh()
  {	  	  
	  if(isMeshIsDirty())
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
  public CartesianTriangularMesh basicGetMesh()
  {
		return mesh;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMesh(CartesianTriangularMesh newMesh)
  {
		CartesianTriangularMesh oldMesh = mesh;
		mesh = newMesh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH, oldMesh, mesh));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL:
				return getUrl();
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH:
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL:
				setUrl((String)newValue);
				return;
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH:
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL:
				setUrl(URL_EDEFAULT);
				return;
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH:
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH:
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
				case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL: return Symphony__CoreEnvironmentPackage.URL_MAP_LAYER__URL;
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
				case Symphony__CoreEnvironmentPackage.URL_MAP_LAYER__URL: return Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL;
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

//		@Override
//  public AbstractMapLayerNode getAbstractMapLayerNode() 
//  {
//	  AbstractMapLayerNode abstractMapLayerNode = super.getAbstractMapLayerNode();
//	  
//	  // If the mesh is dirty, update it.
//	  if(meshIsDirty)
//	  {
//		  CartesianTriangularMesh newMesh = getMesh();
//		  if(newMesh != null)
//		  {
//			  getReferencedContentNode().setContent(newMesh);
//		  }
//		  else
//		  {
//			  getReferencedContentNode().setContent(emptyMesh);
//		  }
//	  }
//	  
//	  return abstractMapLayerNode;
//  } 


  private CartesianTriangularMesh loadMesh(String urlString)
  {	  	  
	  CartesianTriangularMesh loadedMesh = null;
	  	  
	  Logger.INSTANCE.log(Activator.ID, this, "Loading Mesh from <" + url + "> ...", EventSeverity.INFO);
	  
	  try
	  {
		  URL url = resolveURLString(urlString);
		  loadedMesh = (CartesianTriangularMesh) Symphony__CommonConvertersFacade.INSTANCE.convert(url, CartesianTriangularMesh.class);
		  
		  if(loadedMesh != null)
		  {				
			  Logger.INSTANCE.log(Activator.ID, this, "Sucesfully loaded Mesh from url " + url + ">. Mesh contains " + loadedMesh.getPolygons().size() + " triangles.", EventSeverity.OK);
		  }	
		  else
		  {
			  Logger.INSTANCE.log(Activator.ID, this, "Could not load Mesh from url " + url + ">. No converter found !", EventSeverity.ERROR);
		  }		  		  
	  }
	  catch(Throwable t)
	  {
		  t.printStackTrace();
		  
		  Logger.INSTANCE.log(Activator.ID, this, "Could not load Mesh from <" + url + "> !", EventSeverity.ERROR, t);
		  
		  loadedMesh = null;
	  }
	  
	  setMeshIsDirty(false);
	  return loadedMesh;
  }
  
	private URL resolveURLString(String urlString)
	{
		URL url = null;
		
		try
		{
			// If the file protocol is used.
			if((urlString.startsWith("file:")) || (urlString.startsWith("http:")))
			{
				url = new URL(urlString);
			}
			else if(urlString.startsWith("platform"))
			{
				url = FileLocator.find(new URL(urlString));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return url;
	}
} //CartesianTriangularMeshURLMapLayerImpl
