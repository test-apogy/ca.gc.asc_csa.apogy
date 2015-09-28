package ca.gc.asc_csa.eclipse.ui.widgets;

import org.eclipse.swt.graphics.Color;

/**
 * 
 * @author scarrier
 *
 * This class represent a range in a composite.
 * 
 */
public class Range implements Comparable<Range> {
	
	private double minimum;
	private double maximum;
	private Color color;
	
	/**
	 * 
	 * @param min	It's the lower value of the range.
	 * @param max	It's the upper value of the range.
	 * @param color	It's the color used to represent this range.
	 */
	public Range(double min, double max, Color color) {
		minimum = min;
		maximum = max;
		this.color = color;
	}
	
	public double getRange() { return maximum - minimum; }
	public double getMinimum() { return minimum; }
	public double getMaximum() { return maximum; }
	public Color getColor() { return color; }

	@Override
	public int compareTo(Range r) {
		if(getRange() > r.getRange())
			return -1;
		else if(getRange() < r.getRange())
			return 1;
		else
			return 0;
	}	
	
	@Override
	protected void finalize() throws Throwable {
		color.dispose();
		super.finalize();
	}
}