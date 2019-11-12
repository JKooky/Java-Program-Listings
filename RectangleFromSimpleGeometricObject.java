public class RectangleFromSimpleGeometricObject 
	extends SimpleGeometricObject {
	private double width;
	private double height;

	public RectangleFromSimpleGeometricObject() {
	}
	
	public RectangleFromSimpleGeometricObject(
			double width, double height) {
		this.width = width;
		this.setHeight(height);
	}
	
	public RectangleFromSimpleGeometricObject(
			double width,double height, String color, boolean filled) {
		this.width = width;
		this.setHeight(height);
		setColor(color);
		setFilled(filled);
	}
	
	/** Returm width */
	public double getWidth() {
		return width;
	}
	
	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/** Retuen height*/
	public double getHeight() {
		return height;
	}
	
	/** Set a new height*/
	public void setHeight(double height) {
		this.height = height;
	}
	
	/** Return area */
	public double getArea() {
		return width * height;
	}
	
	/** Return perimeter */
	public double getPerimeter() {
		return 2 * (width + height);
	}
}