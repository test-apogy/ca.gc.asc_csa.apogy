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
package ca.gc.asc_csa.apogy.workspace.impl;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.Bundle;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.resources.ApogyCommonResourcesFacade;
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.workspace.Activator;
import ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade;
import ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage;
import ca.gc.asc_csa.apogy.workspace.natures.ApogyNature;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Facade</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl#getDefaultProjectNamePrefix <em>Default Project Name Prefix</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl#getDefaultSessionFilename <em>Default Session Filename</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl#getDefaultSessionFilenameExtension <em>Default Session Filename Extension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl#getDefaultSessionsFolderName <em>Default Sessions Folder Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl#getDefaultProgramsFolderName <em>Default Programs Folder Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl#getDefaultDataFolderName <em>Default Data Folder Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl#getDeletedWorskpaceProject <em>Deleted Worskpace Project</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl#getNewWorkspaceProject <em>New Workspace Project</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl#getActiveProject <em>Active Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogyWorkspaceFacadeImpl extends MinimalEObjectImpl.Container implements ApogyWorkspaceFacade {

	/**
	 * The default value of the '{@link #getDefaultProjectNamePrefix() <em>Default Project Name Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultProjectNamePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_PROJECT_NAME_PREFIX_EDEFAULT = "Project";
	/**
	 * The cached value of the '{@link #getDefaultProjectNamePrefix() <em>Default Project Name Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultProjectNamePrefix()
	 * @generated
	 * @ordered
	 */
	protected String defaultProjectNamePrefix = DEFAULT_PROJECT_NAME_PREFIX_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultSessionFilename() <em>Default Session Filename</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDefaultSessionFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SESSION_FILENAME_EDEFAULT = "session";
	/**
	 * The cached value of the '{@link #getDefaultSessionFilename() <em>Default Session Filename</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDefaultSessionFilename()
	 * @generated
	 * @ordered
	 */
	protected String defaultSessionFilename = DEFAULT_SESSION_FILENAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultSessionFilenameExtension()
	 * <em>Default Session Filename Extension</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultSessionFilenameExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SESSION_FILENAME_EXTENSION_EDEFAULT = "sym";
	/**
	 * The cached value of the '{@link #getDefaultSessionFilenameExtension()
	 * <em>Default Session Filename Extension</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultSessionFilenameExtension()
	 * @generated
	 * @ordered
	 */
	protected String defaultSessionFilenameExtension = DEFAULT_SESSION_FILENAME_EXTENSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultSessionsFolderName() <em>Default Sessions Folder Name</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getDefaultSessionsFolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SESSIONS_FOLDER_NAME_EDEFAULT = "sessions";
	/**
	 * The cached value of the '{@link #getDefaultSessionsFolderName() <em>Default Sessions Folder Name</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getDefaultSessionsFolderName()
	 * @generated
	 * @ordered
	 */
	protected String defaultSessionsFolderName = DEFAULT_SESSIONS_FOLDER_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultProgramsFolderName() <em>Default Programs Folder Name</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getDefaultProgramsFolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_PROGRAMS_FOLDER_NAME_EDEFAULT = "scripts";
	/**
	 * The cached value of the '{@link #getDefaultProgramsFolderName() <em>Default Programs Folder Name</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getDefaultProgramsFolderName()
	 * @generated
	 * @ordered
	 */
	protected String defaultProgramsFolderName = DEFAULT_PROGRAMS_FOLDER_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultDataFolderName() <em>Default Data Folder Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDefaultDataFolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DATA_FOLDER_NAME_EDEFAULT = "data";
	/**
	 * The cached value of the '{@link #getDefaultDataFolderName() <em>Default Data Folder Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDefaultDataFolderName()
	 * @generated
	 * @ordered
	 */
	protected String defaultDataFolderName = DEFAULT_DATA_FOLDER_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getDeletedWorskpaceProject() <em>Deleted Worskpace Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedWorskpaceProject()
	 * @generated
	 * @ordered
	 */
	protected static final IProject DELETED_WORSKPACE_PROJECT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDeletedWorskpaceProject() <em>Deleted Worskpace Project</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDeletedWorskpaceProject()
	 * @generated
	 * @ordered
	 */
	protected IProject deletedWorskpaceProject = DELETED_WORSKPACE_PROJECT_EDEFAULT;
	/**
	 * The default value of the '{@link #getNewWorkspaceProject() <em>New Workspace Project</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNewWorkspaceProject()
	 * @generated
	 * @ordered
	 */
	protected static final IProject NEW_WORKSPACE_PROJECT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNewWorkspaceProject() <em>New Workspace Project</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNewWorkspaceProject()
	 * @generated
	 * @ordered
	 */
	protected IProject newWorkspaceProject = NEW_WORKSPACE_PROJECT_EDEFAULT;
	/**
	 * The default value of the '{@link #getActiveProject() <em>Active Project</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getActiveProject()
	 * @generated
	 * @ordered
	 */
	protected static final IProject ACTIVE_PROJECT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getActiveProject() <em>Active Project</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getActiveProject()
	 * @generated
	 * @ordered
	 */
	protected IProject activeProject = ACTIVE_PROJECT_EDEFAULT;
	private static ApogyWorkspaceFacade instance = null;

	public static ApogyWorkspaceFacade getInstance() {
		if (instance == null) {
			instance = new ApogyWorkspaceFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyWorkspaceFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyWorkspacePackage.Literals.APOGY_WORKSPACE_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultProjectNamePrefix() {
		return defaultProjectNamePrefix;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultSessionFilename() {
		return defaultSessionFilename;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultSessionFilenameExtension() {
		return defaultSessionFilenameExtension;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultSessionsFolderName() {
		return defaultSessionsFolderName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultProgramsFolderName() {
		return defaultProgramsFolderName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultDataFolderName() {
		return defaultDataFolderName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IProject getDeletedWorskpaceProject() {
		return deletedWorskpaceProject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletedWorskpaceProject(IProject newDeletedWorskpaceProject) {
		IProject oldDeletedWorskpaceProject = deletedWorskpaceProject;
		deletedWorskpaceProject = newDeletedWorskpaceProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DELETED_WORSKPACE_PROJECT, oldDeletedWorskpaceProject, deletedWorskpaceProject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IProject getNewWorkspaceProject() {
		return newWorkspaceProject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewWorkspaceProject(IProject newNewWorkspaceProject) {
		IProject oldNewWorkspaceProject = newWorkspaceProject;
		newWorkspaceProject = newNewWorkspaceProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__NEW_WORKSPACE_PROJECT, oldNewWorkspaceProject, newWorkspaceProject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IProject getActiveProject() {
		return activeProject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveProject(IProject newActiveProject) {
		IProject oldActiveProject = activeProject;
		activeProject = newActiveProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__ACTIVE_PROJECT, oldActiveProject, activeProject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public String getDefaultProjectName() {
		String result = null;
		int index = 0;
		IWorkspaceRoot workspace = ResourcesPlugin.getWorkspace().getRoot();
		String name = getDefaultProjectNamePrefix();

		while (result == null) {
			IProject project = workspace.getProject(name);
			if (!project.exists()) {
				result = name;
			}
			index++;
			name = getDefaultProjectNamePrefix() + "_" + index;
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public IProject createApogyProjectTemplate(String name, String description) throws Exception {
		/*
		 * Create the project structure in the workspace.
		 */
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);

		/*
		 * Create the project.
		 */
		if (!project.exists()) {
			project.create(null);
			if (!project.isOpen()) {
				project.open(null);
			}

			IProjectDescription desc = project.getDescription();
			String[] prevNatures = desc.getNatureIds();
			String[] newNatures = new String[prevNatures.length + 1];
			System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
			newNatures[prevNatures.length] = ApogyNature.NATURE_ID;

			desc.setNatureIds(newNatures);
			project.setDescription(desc, null);
		}

		/*
		 * Create the sessions folder.
		 */
		IFolder sessionsFolder = project.getFolder(ApogyWorkspaceFacade.INSTANCE.getDefaultSessionsFolderName());
		if (!sessionsFolder.exists()) {
			sessionsFolder.create(true, true, null);
		}

		/*
		 * Create the programs folder.
		 */
		IFolder programsFolder = project.getFolder(ApogyWorkspaceFacade.INSTANCE.getDefaultProgramsFolderName());
		if (!programsFolder.exists()) {
			programsFolder.create(true, true, null);
		}

		/*
		 * Create the data folder.
		 */
		IFolder dataFolder = project.getFolder(ApogyWorkspaceFacade.INSTANCE.getDefaultDataFolderName());
		if (!dataFolder.exists()) {
			dataFolder.create(true, true, null);
		}

		return project;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public IProject createApogyProject(String name, String description) throws Exception {
		/*
		 * Create the project structure in the workspace.
		 */
		IProject project = createApogyProjectTemplate(name, description);
		/*
		 * Create Apogy Session.
		 */
		InvocatorSession session = ApogyCoreFacade.INSTANCE.createApogySession();

		/*
		 * Create the Apogy Session File.
		 */
		IFolder sessionsFolder = project.getFolder(ApogyWorkspaceFacade.INSTANCE.getDefaultSessionsFolderName());
		IFile sessionFile = sessionsFolder
				.getFile(new Path(getDefaultSessionFilename() + "." + getDefaultSessionFilenameExtension()));
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createPlatformResourceURI(sessionFile.getFullPath().toString(), true);
		Resource resource = resourceSet.createResource(fileURI);

		// Add the initial model object to the contents.
		resource.getContents().add(session);

		// Save the contents of the resource to the file system.
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		resource.save(options);

		setNewWorkspaceProject(project);
		
		return project;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<IProject> getWorkspaceApogyProjects() {
		List<IProject> projects = new ArrayList<IProject>();
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			try {
				if (project.hasNature(ApogyNature.NATURE_ID)) {
					projects.add(project);
				}
			} catch (CoreException e) {
				Logger.INSTANCE.log(Activator.ID, "Unable to check the nature of project <" + project.getName(),
						EventSeverity.ERROR, e);
			}
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public IProject getWorkspaceApogyProject(String name) {
		IProject result = null;

		Iterator<IProject> projects = getWorkspaceApogyProjects().iterator();
		while (projects.hasNext() && result == null) {
			IProject project = projects.next();
			if (project.getName().equals(name)) {
				result = project;
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void openApogyProject(IProject project) throws Exception {
		IFolder sessionsFolder = project.getFolder(ApogyWorkspaceFacade.INSTANCE.getDefaultSessionsFolderName());
		IFile sessionFile = sessionsFolder
				.getFile(new Path(getDefaultSessionFilename() + "." + getDefaultSessionFilenameExtension()));

		// Create a resource set to hold the resources.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		URI uri = URI.createPlatformResourceURI(sessionFile.getFullPath().toString(), true);
		Resource resource = resourceSet.getResource(uri, true);

		InvocatorSession session = (InvocatorSession) resource.getContents().get(0);
		ApogyCoreInvocatorFacade.INSTANCE.setActiveInvocatorSession(session);

		setActiveProject(project);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void deleteApogyProject(IProject project) throws Exception {
		project.delete(true, null);
		setDeletedWorskpaceProject(project);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void importApogyProject(Bundle bundle, String projectName) throws Exception {
		IProject project = createApogyProjectTemplate(projectName, "");

		URL url = null;
		String scriptsFolder = "";

		/* Import the session. */
		scriptsFolder = "sessions/" + getDefaultSessionFilename() + "." + getDefaultSessionFilenameExtension();
		url = bundle.getEntry(scriptsFolder);
		if (url != null) {
			IFile file = project.getFile(scriptsFolder);
			file.create(url.openStream(), true, null);
		}

		/* Import the scripts. */
		ApogyCommonResourcesFacade.INSTANCE.importContent(project.getFolder(getDefaultProgramsFolderName()), bundle, getDefaultProgramsFolderName(), true);
		setNewWorkspaceProject(project);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void closeApogyProject() throws Exception {
		ApogyCoreInvocatorFacade.INSTANCE.setActiveInvocatorSession(null);
		ApogyWorkspaceFacade.INSTANCE.setActiveProject(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean isProjectExists(String name) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		return project.exists();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_PROJECT_NAME_PREFIX:
				return getDefaultProjectNamePrefix();
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME:
				return getDefaultSessionFilename();
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME_EXTENSION:
				return getDefaultSessionFilenameExtension();
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_SESSIONS_FOLDER_NAME:
				return getDefaultSessionsFolderName();
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_PROGRAMS_FOLDER_NAME:
				return getDefaultProgramsFolderName();
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_DATA_FOLDER_NAME:
				return getDefaultDataFolderName();
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DELETED_WORSKPACE_PROJECT:
				return getDeletedWorskpaceProject();
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__NEW_WORKSPACE_PROJECT:
				return getNewWorkspaceProject();
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__ACTIVE_PROJECT:
				return getActiveProject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DELETED_WORSKPACE_PROJECT:
				setDeletedWorskpaceProject((IProject)newValue);
				return;
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__NEW_WORKSPACE_PROJECT:
				setNewWorkspaceProject((IProject)newValue);
				return;
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__ACTIVE_PROJECT:
				setActiveProject((IProject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DELETED_WORSKPACE_PROJECT:
				setDeletedWorskpaceProject(DELETED_WORSKPACE_PROJECT_EDEFAULT);
				return;
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__NEW_WORKSPACE_PROJECT:
				setNewWorkspaceProject(NEW_WORKSPACE_PROJECT_EDEFAULT);
				return;
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__ACTIVE_PROJECT:
				setActiveProject(ACTIVE_PROJECT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_PROJECT_NAME_PREFIX:
				return DEFAULT_PROJECT_NAME_PREFIX_EDEFAULT == null ? defaultProjectNamePrefix != null : !DEFAULT_PROJECT_NAME_PREFIX_EDEFAULT.equals(defaultProjectNamePrefix);
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME:
				return DEFAULT_SESSION_FILENAME_EDEFAULT == null ? defaultSessionFilename != null : !DEFAULT_SESSION_FILENAME_EDEFAULT.equals(defaultSessionFilename);
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME_EXTENSION:
				return DEFAULT_SESSION_FILENAME_EXTENSION_EDEFAULT == null ? defaultSessionFilenameExtension != null : !DEFAULT_SESSION_FILENAME_EXTENSION_EDEFAULT.equals(defaultSessionFilenameExtension);
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_SESSIONS_FOLDER_NAME:
				return DEFAULT_SESSIONS_FOLDER_NAME_EDEFAULT == null ? defaultSessionsFolderName != null : !DEFAULT_SESSIONS_FOLDER_NAME_EDEFAULT.equals(defaultSessionsFolderName);
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_PROGRAMS_FOLDER_NAME:
				return DEFAULT_PROGRAMS_FOLDER_NAME_EDEFAULT == null ? defaultProgramsFolderName != null : !DEFAULT_PROGRAMS_FOLDER_NAME_EDEFAULT.equals(defaultProgramsFolderName);
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_DATA_FOLDER_NAME:
				return DEFAULT_DATA_FOLDER_NAME_EDEFAULT == null ? defaultDataFolderName != null : !DEFAULT_DATA_FOLDER_NAME_EDEFAULT.equals(defaultDataFolderName);
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DELETED_WORSKPACE_PROJECT:
				return DELETED_WORSKPACE_PROJECT_EDEFAULT == null ? deletedWorskpaceProject != null : !DELETED_WORSKPACE_PROJECT_EDEFAULT.equals(deletedWorskpaceProject);
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__NEW_WORKSPACE_PROJECT:
				return NEW_WORKSPACE_PROJECT_EDEFAULT == null ? newWorkspaceProject != null : !NEW_WORKSPACE_PROJECT_EDEFAULT.equals(newWorkspaceProject);
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__ACTIVE_PROJECT:
				return ACTIVE_PROJECT_EDEFAULT == null ? activeProject != null : !ACTIVE_PROJECT_EDEFAULT.equals(activeProject);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___GET_DEFAULT_PROJECT_NAME:
				return getDefaultProjectName();
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___CREATE_APOGY_PROJECT_TEMPLATE__STRING_STRING:
				try {
					return createApogyProjectTemplate((String)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___CREATE_APOGY_PROJECT__STRING_STRING:
				try {
					return createApogyProject((String)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___GET_WORKSPACE_APOGY_PROJECTS:
				return getWorkspaceApogyProjects();
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___GET_WORKSPACE_APOGY_PROJECT__STRING:
				return getWorkspaceApogyProject((String)arguments.get(0));
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___OPEN_APOGY_PROJECT__IPROJECT:
				try {
					openApogyProject((IProject)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___DELETE_APOGY_PROJECT__IPROJECT:
				try {
					deleteApogyProject((IProject)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___IMPORT_APOGY_PROJECT__BUNDLE_STRING:
				try {
					importApogyProject((Bundle)arguments.get(0), (String)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___CLOSE_APOGY_PROJECT:
				try {
					closeApogyProject();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___IS_PROJECT_EXISTS__STRING:
				return isProjectExists((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (defaultProjectNamePrefix: ");
		result.append(defaultProjectNamePrefix);
		result.append(", defaultSessionFilename: ");
		result.append(defaultSessionFilename);
		result.append(", defaultSessionFilenameExtension: ");
		result.append(defaultSessionFilenameExtension);
		result.append(", defaultSessionsFolderName: ");
		result.append(defaultSessionsFolderName);
		result.append(", defaultProgramsFolderName: ");
		result.append(defaultProgramsFolderName);
		result.append(", defaultDataFolderName: ");
		result.append(defaultDataFolderName);
		result.append(", deletedWorskpaceProject: ");
		result.append(deletedWorskpaceProject);
		result.append(", newWorkspaceProject: ");
		result.append(newWorkspaceProject);
		result.append(", activeProject: ");
		result.append(activeProject);
		result.append(')');
		return result.toString();
	}

} // ApogyWorkspaceFacadeImpl
