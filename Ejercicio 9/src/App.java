import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int fecha=0, nuevaFecha = 0, sexo=0, registro=0, select=1, cant=0, menoresTreinta=0, totalsf=0, totalmedva=0, totalre=0;
        
        while(select!=0){
            cant +=1;
            if (select ==0){
                break;
            }
        
            System.out.println("Ingrese año de nacimiento: ");
            fecha = leer.nextInt();
            nuevaFecha = 2022 - fecha;
            if (nuevaFecha < 30){
                menoresTreinta +=1;
            }

            System.out.println("Ingrese sexo 1. Femenino 2. Masculino");
            sexo = leer.nextInt();
            if (sexo ==1){
                totalsf +=1;
            }

            if (sexo == 2 && nuevaFecha >= 18 && nuevaFecha <=25) {
                totalmedva +=1;
            }
        
            System.out.println("Ingrese registro del auto 1. Fusagasugá 2. Otros municipios");
            registro = leer.nextInt();
            if(registro !=1){
                totalre +=1;
            }

            System.out.println("Quiere añadir mas datos 1. Si 0. No");
            select = leer.nextInt();
        }

        System.out.println("Resultados: \n Porcentaje de conductores menores de 30 años: "+((menoresTreinta*100)/cant)+
        "%\n Porcentaje de conductores sexo femenino: "+((totalsf*100)/cant) +
        "%\n Porcentaje de conductores sexo masculino en edades entre 18 y 25 años: "+((totalmedva*100)/cant)+
        "%\n Porcentaje de conductores con vehiculos registrados fuera de Fusagasugá: "+((totalre*100)/cant)+"%");
    }
}
