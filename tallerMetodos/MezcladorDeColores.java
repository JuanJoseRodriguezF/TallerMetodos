package tallerMetodos;
import javax.swing.JOptionPane;
public class MezcladorDeColores {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		String validacion = "s";
	    String a, b;
		while(validacion.equalsIgnoreCase("s")){
			a=JOptionPane.showInputDialog("Ingrese un color primario");
			b=JOptionPane.showInputDialog("Ingrese de nuevo un color primario");
			JOptionPane.showMessageDialog(null, "El color resultante es " + mezcla(a,b));
		    validacion=JOptionPane.showInputDialog("¿Desea repetir? (S/N)");
		    }
		  }
	 public static String mezcla(String x, String y) {
		String color="N/A";
			if((x.equalsIgnoreCase("rojo") && y.equalsIgnoreCase("azul")) || (y.equalsIgnoreCase("rojo") && x.equalsIgnoreCase("azul"))){
		color = "morado";
		    }if((x.equalsIgnoreCase("azul") && y.equalsIgnoreCase("amarillo")) || (y.equalsIgnoreCase("azul") && x.equalsIgnoreCase("amarillo"))){
		      color = "verde";
		    }if((x.equalsIgnoreCase("rojo") && y.equalsIgnoreCase("amarillo")) || (y.equalsIgnoreCase("rojo") && x.equalsIgnoreCase("amarillo"))){
		      color = "naranja";
		    }    
		return color;
	}
}