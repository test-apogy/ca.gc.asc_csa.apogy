package org.eclipse.symphony.common.obsolete.eclipse.emf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class EMFUtilities extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.symphony.common.obsolete.eclipse.emf";

	// The shared instance
	private static EMFUtilities plugin;
	
	/**
	 * The constructor
	 */
	public EMFUtilities() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static EMFUtilities getDefault() {
		return plugin;
	}

	/**
	 * Returns the list of classes that extends or implements the specfied class reference in the EMF package.
	 * @return List of EMF classes.
	 */
	public static List <EClass> getEClasses(EPackage epackage, Class <?> classref){
		ArrayList <EClass> list = new ArrayList<EClass>();
		Iterator <EClassifier> classifiers = epackage.getEClassifiers().iterator();				 
		while (classifiers.hasNext()){
			EClassifier classifier = classifiers.next();
			if (classifier instanceof EClass && classref.isAssignableFrom(classifier.getInstanceClass()) &&
					classifier.getInstanceClass() != classref){
				list.add((EClass)classifier);
			}
		}		
		return list;		
	}	
	
    /**
	 * Returns a list containing each collection member that has the classifier of the specified type.
	 * @param objects a collection of objects to check.
	 * @param type the type of object to find.
	 * @return a collection of objects of the specified type.
	 * @see EcoreUtil#getObjectsByType(Collection, EClassifier)
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> List<T> getObjectsByDirectType(Collection<? extends EObject> objects, EClassifier type) {
		List<T> result = new ArrayList<T>();
		for (EObject object : objects) { 
			if (object.eClass().getInstanceClass() == type.getInstanceClass()) {				 
				result.add((T) object);
			}
		}
		return result;
	}	
}