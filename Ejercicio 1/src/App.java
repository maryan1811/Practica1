

import java.util.Scanner;

import javafx.css.SimpleStyleableObjectProperty;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
     String nombre, apellido;
     int inscripcion, patrimonio, estrato, matricula, porcentaje;
     int constante = 50000;
     int valor1;
     //entrada de datos
     System.out.println("Número de Inscripción: ");
     inscripcion = leer.nextInt();
     System.out.println("Digite su nombre: ");
     nombre = leer.next();
     System.out.println("Digite su Apellido: ");
     apellido = leer.next();
     System.out.println("Digite su Estrato: ");
     estrato = leer.nextInt();
     System.out.println("Digite su Patrimonio");
     patrimonio = leer.nextInt();
     //proceso
     valor1 = patrimonio * 3;
     porcentaje = valor1 / 100;
     matricula = constante + porcentaje;

     //salida
     if (patrimonio >= 2000000){
         System.out.println("Número de inscripción: "+ inscripcion);
         System.out.println(nombre);
         System.out.println(apellido);
         System.out.println("el valor de su matricula es: " + matricula);
     }else{
        if (patrimonio < 2000000)
          System.out.println("Número de inscripción: "+inscripcion);
          System.out.println(nombre);
          System.out.println(apellido);
          System.out.println("el valor de su matricula es: "+ constante);
  
    


     }



    }   
}