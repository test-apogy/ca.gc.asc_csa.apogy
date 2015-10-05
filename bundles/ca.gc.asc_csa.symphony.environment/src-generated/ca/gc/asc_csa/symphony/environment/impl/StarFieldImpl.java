/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.asc_csa.symphony.environment.Activator;
import ca.gc.asc_csa.symphony.environment.EnvironmentUtilities;
import ca.gc.asc_csa.symphony.environment.EquatorialCoordinates;
import ca.gc.asc_csa.symphony.environment.Star;
import ca.gc.asc_csa.symphony.environment.StarField;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentFactory;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.space.topology.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Star Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.StarFieldImpl#getStars <em>Stars</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.StarFieldImpl#getStarFieldFileName <em>Star Field File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StarFieldImpl extends NodeImpl implements StarField
{
	
	private boolean starsAreDirty = true;
	
  /**
	 * The cached value of the '{@link #getStars() <em>Stars</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStars()
	 * @generated
	 * @ordered
	 */
  protected EList<Star> stars;
  /**
	 * The default value of the '{@link #getStarFieldFileName() <em>Star Field File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStarFieldFileName()
	 * @generated
	 * @ordered
	 */
  protected static final String STAR_FIELD_FILE_NAME_EDEFAULT = "bright_star_catalog_5.txt";
  /**
	 * The cached value of the '{@link #getStarFieldFileName() <em>Star Field File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStarFieldFileName()
	 * @generated
	 * @ordered
	 */
  protected String starFieldFileName = STAR_FIELD_FILE_NAME_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected StarFieldImpl()
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
		return SymphonyEnvironmentPackage.Literals.STAR_FIELD;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EList<Star> getStars()
  {
		if(starsAreDirty)
		{
			try 
			{
				getStarsGen().clear();
				getStarsGen().addAll(loadStars());					
			} 
			catch (Exception e) 
			{		
				String message = "Error occured while loading stars from file <" + getStarFieldFileName() + "> !"; 
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR, e);
			}
			starsAreDirty = false;
		}
		
		return getStarsGen();
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Star> getStarsGen()
  {
		if (stars == null) {
			stars = new EObjectResolvingEList<Star>(Star.class, this, SymphonyEnvironmentPackage.STAR_FIELD__STARS);
		}
		return stars;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getStarFieldFileName()
  {
		return starFieldFileName;
	}

  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setStarFieldFileName(String newStarFieldFileName)
  {
	  starsAreDirty = true;
	  setStarFieldFileNameGen(newStarFieldFileName);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setStarFieldFileNameGen(String newStarFieldFileName)
  {
		String oldStarFieldFileName = starFieldFileName;
		starFieldFileName = newStarFieldFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.STAR_FIELD__STAR_FIELD_FILE_NAME, oldStarFieldFileName, starFieldFileName));
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
			case SymphonyEnvironmentPackage.STAR_FIELD__STARS:
				return getStars();
			case SymphonyEnvironmentPackage.STAR_FIELD__STAR_FIELD_FILE_NAME:
				return getStarFieldFileName();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SymphonyEnvironmentPackage.STAR_FIELD__STARS:
				getStars().clear();
				getStars().addAll((Collection<? extends Star>)newValue);
				return;
			case SymphonyEnvironmentPackage.STAR_FIELD__STAR_FIELD_FILE_NAME:
				setStarFieldFileName((String)newValue);
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
			case SymphonyEnvironmentPackage.STAR_FIELD__STARS:
				getStars().clear();
				return;
			case SymphonyEnvironmentPackage.STAR_FIELD__STAR_FIELD_FILE_NAME:
				setStarFieldFileName(STAR_FIELD_FILE_NAME_EDEFAULT);
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
			case SymphonyEnvironmentPackage.STAR_FIELD__STARS:
				return stars != null && !stars.isEmpty();
			case SymphonyEnvironmentPackage.STAR_FIELD__STAR_FIELD_FILE_NAME:
				return STAR_FIELD_FILE_NAME_EDEFAULT == null ? starFieldFileName != null : !STAR_FIELD_FILE_NAME_EDEFAULT.equals(starFieldFileName);
		}
		return super.eIsSet(featureID);
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
		result.append(" (starFieldFileName: ");
		result.append(starFieldFileName);
		result.append(')');
		return result.toString();
	}

	private List<Star> loadStars() throws Exception
	{
		ArrayList<Star> stars = new ArrayList<Star>();
		
		// Loads the file as text.
		String content = readFile();
		
		String[] lines = content.split("\n");
		for(int i =0; i < lines.length; i++)
		{
			Star star = parseLine(lines[i]);
			if(star != null) stars.add(star);
		}
		
		String filePath = Activator.getDefault().getStarsCatalogURL(getStarFieldFileName()).getPath();	
		
		String message = "Sucessfully loaded <" + stars.size() + "> stars from URL <" + filePath + ">.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.OK);		
		
		return stars;				
	}
	
	private String readFile() throws Exception 
	{
		URL url = Activator.getDefault().getStarsCatalogURL(getStarFieldFileName());		
							
	    InputStream inputStream = url.openConnection().getInputStream();		    
	    
		if (inputStream != null) 
		{
			Writer writer = new StringWriter();

			char[] buffer = new char[1024];
			try 
			{
				Reader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
				int n;
				while ((n = reader.read(buffer)) != -1) 
				{
					writer.write(buffer, 0, n);
				}
			} 
			finally 
			{
				inputStream.close();
			}
			writer.flush();
			return writer.toString();
		} 
		else 
		{
			return "";
		}
	}
	
	private Star parseLine(String line)
	{
		Star star = null;
		try
		{						
			String[] entries = line.trim().split(" ");
			
			float rightAscension = EnvironmentUtilities.INSTANCE.parseRightAscension(entries[1]);
			float declination = EnvironmentUtilities.INSTANCE.parseDegMinSec(entries[2]);
			float magnitude = Float.parseFloat( entries[6]);						
			
			star = SymphonyEnvironmentFactory.eINSTANCE.createStar();
			EquatorialCoordinates equatorialCoordinates = SymphonyEnvironmentFactory.eINSTANCE.createEquatorialCoordinates();
			
			equatorialCoordinates.setRightAscension(rightAscension);
			equatorialCoordinates.setDeclination(declination);
			
			star.setMagnitude(magnitude);
			star.setEquatorialCoordinates(equatorialCoordinates);
		}
		catch(Exception e)
		{						
		}
		return star;
	}
} //StarFieldImpl
