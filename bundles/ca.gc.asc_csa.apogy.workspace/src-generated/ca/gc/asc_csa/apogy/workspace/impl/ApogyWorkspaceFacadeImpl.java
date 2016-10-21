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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
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
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl#getDefaultSessionFolderName <em>Default Session Folder Name</em>}</li>
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
	 * The default value of the '{@link #getDefaultSessionFolderName() <em>Default Session Folder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSessionFolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SESSION_FOLDER_NAME_EDEFAULT = "Sessions";
	/**
	 * The cached value of the '{@link #getDefaultSessionFolderName() <em>Default Session Folder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSessionFolderName()
	 * @generated
	 * @ordered
	 */
	protected String defaultSessionFolderName = DEFAULT_SESSION_FOLDER_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getActiveProject() <em>Active Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveProject()
	 * @generated
	 * @ordered
	 */
	protected static final IProject ACTIVE_PROJECT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getActiveProject() <em>Active Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public String getDefaultSessionFolderName() {
		return defaultSessionFolderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject getActiveProject() {
		return activeProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public IProject createApogyProject(String name, String description) throws Exception{
		/*
		 * Create the project structure in the workspace.
		 */
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		try {
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
			 * Create the session folder.
			 */
			IFolder sessionsFolder = project.getFolder(ApogyWorkspaceFacade.INSTANCE.getDefaultSessionFolderName());
			if (!sessionsFolder.exists()) {
				sessionsFolder.create(true, true, null);
			}

			/*
			 * Create Apogy Session.
			 */
			InvocatorSession session = ApogyCoreFacade.INSTANCE.createApogySession();

			/*
			 * Create the Apogy Session File.
			 */
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

		} catch (CoreException | IOException e) {
			throw new Exception("Problems occured while creating project <" + name + ">", e);			
		}

		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<IProject> getApogyProjects() {			
		List<IProject> projects = new ArrayList<IProject>();		
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			try {
				if (project.hasNature(ApogyNature.NATURE_ID)){
					projects.add(project);
				}
			} catch (CoreException e) {
				Logger.INSTANCE.log(Activator.ID, "Unable to check the nature of project <" + project.getName(), EventSeverity.ERROR, e);
			}
		}		
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public IProject getApogyProject(String name) {
		IProject result = null;

		Iterator<IProject> projects = getApogyProjects().iterator();
		while (projects.hasNext() && result == null){
			IProject project = projects.next();
			if (project.getName().equals(name)){
				result = project;
			}
		}		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void openApogyProject(IProject project) {		
		IFolder sessionsFolder = project.getFolder(ApogyWorkspaceFacade.INSTANCE.getDefaultSessionFolderName());
		IFile sessionFile = sessionsFolder
				.getFile(new Path(getDefaultSessionFilename() + "." + getDefaultSessionFilenameExtension()));
		
		// Create a resource set to hold the resources.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		URI uri = URI.createPlatformResourceURI(sessionFile.getFullPath().toString(), true);
		Resource resource = resourceSet.getResource(uri, true);

		InvocatorSession session = (InvocatorSession) EcoreUtil.copy(resource.getContents().get(0));
		ApogyCoreInvocatorFacade.INSTANCE.setActiveInvocatorSession(session);
		
		setActiveProject(project);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void closeApogyProject(IProject project) {
		ApogyCoreInvocatorFacade.INSTANCE.setActiveInvocatorSession(null);
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
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FOLDER_NAME:
				return getDefaultSessionFolderName();
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__ACTIVE_PROJECT:
				return getActiveProject();
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
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__ACTIVE_PROJECT:
				setActiveProject((IProject)newValue);
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
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FOLDER_NAME:
				return DEFAULT_SESSION_FOLDER_NAME_EDEFAULT == null ? defaultSessionFolderName != null : !DEFAULT_SESSION_FOLDER_NAME_EDEFAULT.equals(defaultSessionFolderName);
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
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___CREATE_APOGY_PROJECT__STRING_STRING:
				try {
					return createApogyProject((String)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___GET_APOGY_PROJECTS:
				return getApogyProjects();
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___GET_APOGY_PROJECT__STRING:
				return getApogyProject((String)arguments.get(0));
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___OPEN_APOGY_PROJECT__IPROJECT:
				openApogyProject((IProject)arguments.get(0));
				return null;
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE___CLOSE_APOGY_PROJECT__IPROJECT:
				closeApogyProject((IProject)arguments.get(0));
				return null;
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
		result.append(", defaultSessionFolderName: ");
		result.append(defaultSessionFolderName);
		result.append(", activeProject: ");
		result.append(activeProject);
		result.append(')');
		return result.toString();
	}

} // ApogyWorkspaceFacadeImpl
