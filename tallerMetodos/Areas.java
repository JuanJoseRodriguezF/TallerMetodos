package tallerMetodos;
import javax.swing.JOptionPane;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, d, e, f, operacion;
		        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de los lados del triangulo equilatero"));
		        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del radio del circulo"));
		        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de los lados del cuadrado"));
		        d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la base del rectangulo"));
		        e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la altura del rectangulo"));
		        f = 3.1416;

		        operacion = triangulo(a);
		        JOptionPane.showMessageDialog(null, "El area del triangulo equilatero es:" + operacion + " " + "m2");
		        operacion = circulo(b, f);
		        JOptionPane.showMessageDialog(null, "El area del circulo es:" + operacion + " " + "m2");
		        operacion = cuadrado(c);
		        JOptionPane.showMessageDialog(null, "El area del cuadrado:" + operacion + " " + "m2");
		        operacion = rectangulo(d, e);
		        JOptionPane.showMessageDialog(null, "El area del rectangulo:" + operacion + " " + "m2");

		    }

		    public static double triangulo(double a) {
		        double triangulo = 0;
		        triangulo = (Math.sqrt(3) / 4) * (Math.pow(a, 2));
		        return triangulo;
		    }

		    public static double circulo(double b, double f) {
		        double circulo = 0;
		        circulo = f * (Math.pow(b, 2));
		        return circulo;
		    }

		    public static double cuadrado(double c) {
		        double cuadrado = 0;
		        cuadrado = c * c;
		        return cuadrado;
		    }

		    public static double rectangulo(double d, double e) {
		        double rectangulo = 0;
		        rectangulo = d * e;
		        return rectangulo;
		    }
}