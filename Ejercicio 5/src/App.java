

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        //Datos
        
        double ValorCompra, Cantidad, Descuento, Total_a_Pagar;

        //Entrada
        System.out.println("Digite la catidad de productos a comprar: ");   
        Cantidad = leer.nextInt();  
        System.out.println("Digite el precio total: ");
        ValorCompra = leer.nextDouble();
        //Proceso
        if (Cantidad == 1 ){
            System.out.println("El descuento es: 0%");
            Descuento = ValorCompra * 0;
            Total_a_Pagar = ValorCompra - Descuento;
            System.out.println(Total_a_Pagar);

        }else{
            if (Cantidad == 2 ){
                System.out.println("El descuento es: 0%");
                Descuento = ValorCompra * 0;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);  
        }else{
            if (Cantidad == 3 ){
                System.out.println("El descuento es: 10%");
                Descuento = ValorCompra * 0.1;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }else{
            if (Cantidad == 4 ){
                System.out.println("El descuento es: 10%");
                Descuento = ValorCompra * 0.1;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }else{
            if (Cantidad == 5 ){
                System.out.println("El descuento es: 10%");
                Descuento = ValorCompra * 0.1;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }else{
            if (Cantidad == 6 ){
                System.out.println("El descuento es: 20%");
                Descuento = ValorCompra * 0.2;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }else{
            if (Cantidad == 7 ){
                System.out.println("El descuento es: 20%");
                Descuento = ValorCompra * 0.2;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }else{
            if (Cantidad == 8 ){
                System.out.println("El descuento es: 20%");
                Descuento = ValorCompra * 0.2;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }else{
            if (Cantidad == 9 ){
                System.out.println("El descuento es: 20%");
                Descuento = ValorCompra * 0.2;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }else{
            if (Cantidad == 10 ){
                System.out.println("El descuento es: 20%");
                Descuento = ValorCompra * 0.2;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }else{
            if (Cantidad == 11 ){
                System.out.println("El descuento es: 30%");
                Descuento = ValorCompra * 0.3;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }else{
            if (Cantidad == 12 ){
                System.out.println("El descuento es: 30%");
                Descuento = ValorCompra * 0.3;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }else{
            if (Cantidad == 13 ){
                System.out.println("El descuento es: 30%");
                Descuento = ValorCompra * 0.3;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }else{
            if (Cantidad == 14 ){
                System.out.println("El descuento es: 30%");
                Descuento = ValorCompra * 0.3;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }else{
            if (Cantidad == 15 ){
                System.out.println("El descuento es: 30%");
                Descuento = ValorCompra * 0.3;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }else{
            if (Cantidad > 15 ){
                System.out.println("El descuento es: 50%");
                Descuento = ValorCompra * 0.5;
                Total_a_Pagar = ValorCompra - Descuento;
                System.out.println(Total_a_Pagar);
        }

        }
    }
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}