package tallerMetodos;
import javax.swing.JOptionPane;
public class ConversionMonedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, d, e, operacion;
		        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de pesos"));
		        b = 4840.01;
		        c = 4724.99;
		        d = 5420.45;
		        e = 240.26;
		        operacion = Dolar(a, b);
		        JOptionPane.showMessageDialog(null, "La moneda ingresada en pesos a Dolar es: $" + operacion);
		        operacion = Euro(a, c);
		        JOptionPane.showMessageDialog(null, "La moneda ingresada en pesos a Euros es: $ " + operacion);
		        operacion = Libra(a, d);
		        JOptionPane.showMessageDialog(null, "La moneda ingresada en pesos a Libra es: $ " + operacion);
		        operacion = PesoMex(a, e);
		        JOptionPane.showMessageDialog(null, "La moneda ingresada en pesos a Peso mexicano es: $ " + operacion);

		    }

		    public static double Dolar(double a, double b) {
		        double Dolar = 0;
		        Dolar = (a / b);
		        return Dolar;
		    }

		    public static double Euro(double a, double c) {
		        double Euro = 0;
		        Euro = (a / c);
		        return Euro;
		    }

		    public static double Libra(double a, double d) {
		        double Libra = 0;
		        Libra = (a / d);
		        return Libra;
		    }

		    public static double PesoMex(double a, double e) {
		        double PesoMex = 0;
		        PesoMex = (a / e);
		        return PesoMex;
		    }
}