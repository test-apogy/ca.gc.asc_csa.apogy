package ca.gc.space.eclipse.emf.edit.providers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.LabelProvider;

/**
 * {@link EClass} Label Provider.
 * 
 * <PRE>
 * 
 * Phoenix Meteorological Station (MET) Ground Data System (GDS)
 * Canadian Space Agency / Agence spatiale canadienne
 * 6767 route de l'Aeroport
 * St-Hubert, Québec, Canada
 * J3Y 8Y9
 * www.space.gc.ca
 * Copyrights (c)
 * </PRE> 
 */
public class EClassLabelProvider extends LabelProvider{
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		EClass eclass = (EClass) element;
		return eclass.getName();
	}
}