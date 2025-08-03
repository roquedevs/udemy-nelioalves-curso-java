package orientacao.objetos.introducao.exercicios;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return width + height + width + height;
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(height, 2.0) + Math.pow(width, 2)));
	}
	
	@Override
	public String toString() {
		return String.format("AREA = %.2f%n", area())
				+ String.format("PERIMETER = %.2f%n", perimeter())
				+ String.format("DIAGONAL = %.2f%n", diagonal());
	}
}
