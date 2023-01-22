

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        double pesoAnt, pesoProme, peso, sumaPeso=0;
        int j, k;
        for(j=1; j<=5; j++){

            System.out.println("Datos del atleta "+j);
            System.out.println("Peso anterior: ");
            pesoAnt = leer.nextDouble();
            
            for(k=1; k<=5; k++)
            {
                System.out.println("Pesada No. "+k);
                peso = leer.nextDouble();
                sumaPeso = sumaPeso + peso;
            }
        
        pesoProme = sumaPeso/5;
        System.out.println("Peso anterior: "+pesoAnt);
        System.out.println("Peso promedio: "+pesoProme);
        if(pesoProme > pesoAnt){
            System.out.println("Aumentó de peso");
        }
        else{
            if(pesoProme < pesoAnt)
                System.out.println("Bajó de peso");
            else
                System.out.println("Se mantuvo en el peso");
        }
    }
    }
}
