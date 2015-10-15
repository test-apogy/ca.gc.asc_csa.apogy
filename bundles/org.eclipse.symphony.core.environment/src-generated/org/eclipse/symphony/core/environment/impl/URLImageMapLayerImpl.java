/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.images.ImagesCoreFactory;
import org.eclipse.symphony.common.images.URLEImage;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;
import org.eclipse.symphony.core.environment.URLImageMapLayer;
import org.eclipse.symphony.core.environment.URLMapLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URL Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.URLImageMapLayerImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.URLImageMapLayerImpl#getLegendURL <em>Legend URL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URLImageMapLayerImpl extends ImageMapLayerImpl implements URLImageMapLayer
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
	 * The default value of the '{@link #getLegendURL() <em>Legend URL</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLegendURL()
	 * @generated
	 * @ordered
	 */
  protected static final String LEGEND_URL_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLegendURL() <em>Legend URL</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLegendURL()
	 * @generated
	 * @ordered
	 */
  protected String legendURL = LEGEND_URL_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected URLImageMapLayerImpl()
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
		return SymphonyEnvironmentPackage.Literals.URL_IMAGE_MAP_LAYER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getUrl()
  {
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
	  
	  // Tries to load the image data.
	  URLEImage urlEImage = ImagesCoreFactory.eINSTANCE.createURLEImage();
	  urlEImage.setUrl(newUrl);	  
	  
	  setImage(urlEImage);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setUrlGen(String newUrl)
  {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.URL_IMAGE_MAP_LAYER__URL, oldUrl, url));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLegendURL()
  {
		return legendURL;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setLegendURL(String newLegendURL)
  {
	  setLegendURLGen(newLegendURL);
	  
	  // Tries to load the image data.
	  URLEImage urlEImage = ImagesCoreFactory.eINSTANCE.createURLEImage();
	  urlEImage.setUrl(newLegendURL);	
	  
	  // Forces the image to be loaded.
	  urlEImage.asBufferedImage();
		  
	  setLegend(urlEImage);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLegendURLGen(String newLegendURL)
  {
		String oldLegendURL = legendURL;
		legendURL = newLegendURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.URL_IMAGE_MAP_LAYER__LEGEND_URL, oldLegendURL, legendURL));
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
			case SymphonyEnvironmentPackage.URL_IMAGE_MAP_LAYER__URL:
				return getUrl();
			case SymphonyEnvironmentPackage.URL_IMAGE_MAP_LAYER__LEGEND_URL:
				return getLegendURL();
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
			case SymphonyEnvironmentPackage.URL_IMAGE_MAP_LAYER__URL:
				setUrl((String)newValue);
				return;
			case SymphonyEnvironmentPackage.URL_IMAGE_MAP_LAYER__LEGEND_URL:
				setLegendURL((String)newValue);
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
			case SymphonyEnvironmentPackage.URL_IMAGE_MAP_LAYER__URL:
				setUrl(URL_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.URL_IMAGE_MAP_LAYER__LEGEND_URL:
				setLegendURL(LEGEND_URL_EDEFAULT);
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
			case SymphonyEnvironmentPackage.URL_IMAGE_MAP_LAYER__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case SymphonyEnvironmentPackage.URL_IMAGE_MAP_LAYER__LEGEND_URL:
				return LEGEND_URL_EDEFAULT == null ? legendURL != null : !LEGEND_URL_EDEFAULT.equals(legendURL);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == URLMapLayer.class) {
			switch (derivedFeatureID) {
				case SymphonyEnvironmentPackage.URL_IMAGE_MAP_LAYER__URL: return SymphonyEnvironmentPackage.URL_MAP_LAYER__URL;
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
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == URLMapLayer.class) {
			switch (baseFeatureID) {
				case SymphonyEnvironmentPackage.URL_MAP_LAYER__URL: return SymphonyEnvironmentPackage.URL_IMAGE_MAP_LAYER__URL;
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
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (url: ");
		result.append(url);
		result.append(", legendURL: ");
		result.append(legendURL);
		result.append(')');
		return result.toString();
	}

} //URLImageMapLayerImpl
