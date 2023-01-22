

import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

import java.util.Random;
import javafx.css.SimpleStyleableObjectProperty;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        String Colores = "VAZR";

        int Dato1 = random.nextInt(Colores.length());
        char Dato2 = Colores.charAt(Dato1);
        int ValorCompra;
        double Descuento, Total_a_Pagar;
        //Entrada de datos
        System.out.println("Digite el valor de su compra: ");
        ValorCompra = leer.nextInt();

        //Proceso
        if (Dato1 == 0){
            System.out.println("El color para su descuento es: Verde");
            Descuento = ValorCompra * 0.1;
            Total_a_Pagar = ValorCompra - Descuento;
            System.out.println(Total_a_Pagar);            

        }else{
            if(Dato1 == 1){
            System.out.println("El color para su descuento es: Amarillo");
            Descuento = ValorCompra * 0.2;
            Total_a_Pagar = ValorCompra - Descuento;
            System.out.println(Total_a_Pagar);

            }else{
                if(Dato1 == 2){
                System.out.println("El color para su descuento es: Azul");
                Descuento = ValorCompra * 0.5;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);

                }else{
                    if(Dato1 == 3){
                    System.out.println("El color para su descuento es: Rojo");
                    Descuento = ValorCompra * 1;
                    Total_a_Pagar = ValorCompra - Descuento;
                    System.out.println(Total_a_Pagar);
                    }
            }   
        }

        }   
} 

}
