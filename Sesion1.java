//programa de sesion 1 , 5.llenar, 6.vaciar
package sesion1;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.M;
import static javafx.scene.input.KeyCode.N;


public class Sesion1 {

 
    public static void main(String[] args) {
     // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opt, tope = 0, tam, aux;
        Boolean encontrado = false;      
        System.out.println("ingresa el tamaño de la pila");
        int pila[] = new int[tam = sc.nextInt()];
        do{
            System.out.println("1- agregar \n"
                    + "2- mostrar \n"
                    + "3- eliminar \n"
                    + "4- mostrar ultimos 3\n"
                    + "5- llenar\n"
                    + "6- vaciar\n"
                    + "7 salir ");
            switch(opt = sc.nextInt()){
                case 1:
                    if(tope < tam){
                        System.out.println("tope = "+tope);
                        System.out.println("agregar elemento a la pila");
                        pila[tope] = sc.nextInt();
                        tope++;
                        System.out.println("tope = "+tope);
                    } else { System.out.println("pila llena..");}
                break;
                case 2:
                    if(tope > 0){
                        System.out.println("contenido de pila");
                        for(int i = tope - 1; i >= 0; i--){
                            System.out.println("posicion: "+ i + " tiene el dato: "+ pila[i]);
                        }
                    } else {
                        System.out.println("pila vacia..");
                    }
                break;
                case 3:
                    System.out.println("dato eliminado...");
                    tope--;
                    System.out.println("tope = "+tope);
                break;
                case 4:
                    System.out.println("ultimos 3");
                    int cont = 0;
                        for(int i = tope - 1; i >= 0; i--){
                            System.out.println("posicion: "+ i + " tiene el dato: "+ pila[i]);
                            cont++;
                            if(cont == 3){
                                break;
                            }
                        }
                break;
                 case 5:
                    System.out.println("llenando de forma automatica pila con numeros aleatorios\n"
                            + "en un rango de 150-200");
            for(int i=0;i<tam;i++){
                int valorEntero = (int) Math.floor(Math.random()*(200-150+1)+150);

              System.out.println(valorEntero);
              pila[tope] = valorEntero;
              tope++;

}
                    break;
                case 6:
                    tope = 0;
                    System.out.println("pila vacia...");
                    break;
                
            }
        }while(opt !=7);
    }
    }
    

