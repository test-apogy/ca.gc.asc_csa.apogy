package ca.gc.asc_csa.symphony.environment.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.symphony.environment.ui.composites.MapLayerPresentationsListComposite;

public class MapLayerPresentationsListSection extends AbstractExtendedPropertySection implements
		IFilter {

	@Override
	public boolean select(Object toTest) {
		return org.eclipse.symphony.common.converters.Activator
				.convert(toTest, CartesianTriangularMeshMapLayer.class) != null;
	}

	@Override
	protected void render(EObject eObject) {
		CartesianTriangularMeshMapLayer cartesianTriangularMeshMapLayer = (CartesianTriangularMeshMapLayer) org.eclipse.symphony.common.converters.Activator
				.convert(eObject, CartesianTriangularMeshMapLayer.class);
		if (cartesianTriangularMeshMapLayer != null) {
			((MapLayerPresentationsListComposite) getComposite()).setCartesianTriangularMeshMapLayer(cartesianTriangularMeshMapLayer);
		}
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new MapLayerPresentationsListComposite(parent, SWT.NONE);
	}
}