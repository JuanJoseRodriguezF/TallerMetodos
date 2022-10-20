package tallerMetodos;

import javax.swing.JOptionPane;

public class CalculadoraFisica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String validacion = "s", opcion, vel, t, d;
	    while(validacion.equalsIgnoreCase("s")){
	      opcion=JOptionPane.showInputDialog("1. Calcular velocidad\n2. Calcular tiempo\n3. Calcular distancia");
	      switch(opcion){
	        case "1":
	          t = JOptionPane.showInputDialog("Ingrese el tiempo en segundos.");
	          d = JOptionPane.showInputDialog("Ingrese la distancia en metros.");
	          JOptionPane.showMessageDialog(null, "La velocidad es: " + calcVel(t,d) + "m/s");
	          break;
	        case "2":
	          vel = JOptionPane.showInputDialog("Ingrese la velocidad en m/s.");
	          d = JOptionPane.showInputDialog("Ingrese la distancia en metros.");
	          JOptionPane.showMessageDialog(null, "El tiempo es: " + calcT(vel,d) + "segs");
	          break;
	        case "3":
	          t = JOptionPane.showInputDialog("Ingrese el tiempo en segundos.");
	          vel = JOptionPane.showInputDialog("Ingrese la velocidad en m/s.");
	          JOptionPane.showMessageDialog(null, "La distancia es: " + calcD(t,vel) + "m");
	          break;
	        default:
	          JOptionPane.showMessageDialog(null, "Opción no válida.");
	          break;
	      }
		    validacion=JOptionPane.showInputDialog("¿Desea repetir? (S/N)");
	    }
	  }
	  public static double calcVel(String tiempo, String distancia){
	  double velocidad = Double.parseDouble(distancia) / Double.parseDouble(tiempo);
	    return velocidad;
	  }
	  public static double calcT(String velocidad, String distancia){
	    double tiempo = Double.parseDouble(distancia) / Double.parseDouble(velocidad);
	    return tiempo;
	  }
	  public static double calcD(String tiempo, String velocidad){
	    double distancia = Double.parseDouble(velocidad) * Double.parseDouble(tiempo);
	    return distancia;
	  }
}