package org.eclipse.symphony.core.environment.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.ui.properties.sections.AbstractExtendedPropertySection;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer;
import org.eclipse.symphony.core.environment.ui.composites.MapLayerPresentationsListComposite;

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