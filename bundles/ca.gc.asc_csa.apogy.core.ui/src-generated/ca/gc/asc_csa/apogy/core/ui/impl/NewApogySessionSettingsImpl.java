package ca.gc.asc_csa.apogy.core.ui.impl;
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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Apogy Session Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogySessionSettingsImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogySessionSettingsImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogySessionSettingsImpl#isCreateEnvironment <em>Create Environment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogySessionSettingsImpl#isCreatePrograms <em>Create Programs</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogySessionSettingsImpl#isCreateDataProducts <em>Create Data Products</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogySessionSettingsImpl#isCreateTools <em>Create Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewApogySessionSettingsImpl extends MinimalEObjectImpl.Container implements NewApogySessionSettings
{
  /**
	 * The default value of the '{@link #getFolder() <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFolder()
	 * @generated
	 * @ordered
	 */
  protected static final String FOLDER_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getFolder() <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFolder()
	 * @generated
	 * @ordered
	 */
  protected String folder = FOLDER_EDEFAULT;

  /**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
  protected static final String FILENAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
  protected String filename = FILENAME_EDEFAULT;

  /**
	 * The default value of the '{@link #isCreateEnvironment() <em>Create Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isCreateEnvironment()
	 * @generated
	 * @ordered
	 */
  protected static final boolean CREATE_ENVIRONMENT_EDEFAULT = true;

  /**
	 * The cached value of the '{@link #isCreateEnvironment() <em>Create Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isCreateEnvironment()
	 * @generated
	 * @ordered
	 */
  protected boolean createEnvironment = CREATE_ENVIRONMENT_EDEFAULT;

  /**
	 * The default value of the '{@link #isCreatePrograms() <em>Create Programs</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isCreatePrograms()
	 * @generated
	 * @ordered
	 */
  protected static final boolean CREATE_PROGRAMS_EDEFAULT = true;

  /**
	 * The cached value of the '{@link #isCreatePrograms() <em>Create Programs</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isCreatePrograms()
	 * @generated
	 * @ordered
	 */
  protected boolean createPrograms = CREATE_PROGRAMS_EDEFAULT;

  /**
	 * The default value of the '{@link #isCreateDataProducts() <em>Create Data Products</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isCreateDataProducts()
	 * @generated
	 * @ordered
	 */
  protected static final boolean CREATE_DATA_PRODUCTS_EDEFAULT = true;

  /**
	 * The cached value of the '{@link #isCreateDataProducts() <em>Create Data Products</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isCreateDataProducts()
	 * @generated
	 * @ordered
	 */
  protected boolean createDataProducts = CREATE_DATA_PRODUCTS_EDEFAULT;

  /**
	 * The default value of the '{@link #isCreateTools() <em>Create Tools</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isCreateTools()
	 * @generated
	 * @ordered
	 */
  protected static final boolean CREATE_TOOLS_EDEFAULT = true;

  /**
	 * The cached value of the '{@link #isCreateTools() <em>Create Tools</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isCreateTools()
	 * @generated
	 * @ordered
	 */
  protected boolean createTools = CREATE_TOOLS_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected NewApogySessionSettingsImpl()
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
		return ApogyCoreUIPackage.Literals.NEW_APOGY_SESSION_SETTINGS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getFolder()
  {
		return folder;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFolder(String newFolder)
  {
		String oldFolder = folder;
		folder = newFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__FOLDER, oldFolder, folder));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getFilename()
  {
		return filename;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFilename(String newFilename)
  {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__FILENAME, oldFilename, filename));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isCreateEnvironment()
  {
		return createEnvironment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCreateEnvironment(boolean newCreateEnvironment)
  {
		boolean oldCreateEnvironment = createEnvironment;
		createEnvironment = newCreateEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_ENVIRONMENT, oldCreateEnvironment, createEnvironment));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isCreatePrograms()
  {
		return createPrograms;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCreatePrograms(boolean newCreatePrograms)
  {
		boolean oldCreatePrograms = createPrograms;
		createPrograms = newCreatePrograms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_PROGRAMS, oldCreatePrograms, createPrograms));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isCreateDataProducts()
  {
		return createDataProducts;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCreateDataProducts(boolean newCreateDataProducts)
  {
		boolean oldCreateDataProducts = createDataProducts;
		createDataProducts = newCreateDataProducts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS, oldCreateDataProducts, createDataProducts));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isCreateTools()
  {
		return createTools;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCreateTools(boolean newCreateTools)
  {
		boolean oldCreateTools = createTools;
		createTools = newCreateTools;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_TOOLS, oldCreateTools, createTools));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getDefaultFilename(IContainer resourceContainer) {
		// Make up a unique new name here.
		String defaultModelBaseFilename = ApogyCoreUIFacade.INSTANCE.getDefaultApogySessionFilename();
		String defaultModelFilenameExtension = ApogyCoreUIFacade.INSTANCE.getDefaultApogySessionFilenameExtension();

		String modelFilename = defaultModelBaseFilename + "."
				+ defaultModelFilenameExtension;
		for (int i = 1; resourceContainer.findMember(modelFilename) != null; ++i) {
			modelFilename = defaultModelBaseFilename + "_" + i + "."
					+ defaultModelFilenameExtension;
		}		
		return modelFilename;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setDefaultValues(IContainer resourceContainer) {
		setFilename(getDefaultFilename(resourceContainer));
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
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__FOLDER:
				return getFolder();
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__FILENAME:
				return getFilename();
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_ENVIRONMENT:
				return isCreateEnvironment();
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_PROGRAMS:
				return isCreatePrograms();
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS:
				return isCreateDataProducts();
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_TOOLS:
				return isCreateTools();
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
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__FOLDER:
				setFolder((String)newValue);
				return;
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__FILENAME:
				setFilename((String)newValue);
				return;
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_ENVIRONMENT:
				setCreateEnvironment((Boolean)newValue);
				return;
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_PROGRAMS:
				setCreatePrograms((Boolean)newValue);
				return;
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS:
				setCreateDataProducts((Boolean)newValue);
				return;
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_TOOLS:
				setCreateTools((Boolean)newValue);
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
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__FOLDER:
				setFolder(FOLDER_EDEFAULT);
				return;
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_ENVIRONMENT:
				setCreateEnvironment(CREATE_ENVIRONMENT_EDEFAULT);
				return;
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_PROGRAMS:
				setCreatePrograms(CREATE_PROGRAMS_EDEFAULT);
				return;
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS:
				setCreateDataProducts(CREATE_DATA_PRODUCTS_EDEFAULT);
				return;
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_TOOLS:
				setCreateTools(CREATE_TOOLS_EDEFAULT);
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
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__FOLDER:
				return FOLDER_EDEFAULT == null ? folder != null : !FOLDER_EDEFAULT.equals(folder);
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_ENVIRONMENT:
				return createEnvironment != CREATE_ENVIRONMENT_EDEFAULT;
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_PROGRAMS:
				return createPrograms != CREATE_PROGRAMS_EDEFAULT;
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS:
				return createDataProducts != CREATE_DATA_PRODUCTS_EDEFAULT;
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS__CREATE_TOOLS:
				return createTools != CREATE_TOOLS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS___GET_DEFAULT_FILENAME__ICONTAINER:
				return getDefaultFilename((IContainer)arguments.get(0));
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS___SET_DEFAULT_VALUES__ICONTAINER:
				setDefaultValues((IContainer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (folder: ");
		result.append(folder);
		result.append(", filename: ");
		result.append(filename);
		result.append(", createEnvironment: ");
		result.append(createEnvironment);
		result.append(", createPrograms: ");
		result.append(createPrograms);
		result.append(", createDataProducts: ");
		result.append(createDataProducts);
		result.append(", createTools: ");
		result.append(createTools);
		result.append(')');
		return result.toString();
	}

} //NewApogySessionSettingsImpl
