package tallerMetodos;
import javax.swing.JOptionPane;
public class PalabrasMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String validacion = "s", pal;
		    while(validacion.equalsIgnoreCase("s")){
			    pal=JOptionPane.showInputDialog("Diga algo.");
		      menu(pal);
		      validacion=JOptionPane.showInputDialog("¿Desea repetir? (S/N)");
		    }
		  }
		  public static void menu(String x) {
		    String opcion=JOptionPane.showInputDialog("1. Cambiar a mayúsculas\n2. Longitud cadena con espacios\n3. Longitud cadena sin espacios\n4. Cambiar a minúsculas");
		    switch(opcion){
		      case "1":
		        JOptionPane.showMessageDialog(null, x.toUpperCase());
		        break;
		      case "2":
		        JOptionPane.showMessageDialog(null, "La longitud de la cadena es: "+x.length());
		        break;
		      case "3":
		        JOptionPane.showMessageDialog(null, "La longitud de la cadena es: "+x.replace(" ", "").length());
		        break;
		      case "4":
		        JOptionPane.showMessageDialog(null, x.toLowerCase());
		        break;
		      default:
		        JOptionPane.showMessageDialog(null, "Opción no válida.");
		        break;
		    }
	}
}