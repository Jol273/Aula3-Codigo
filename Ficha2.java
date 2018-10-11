import java.util.ArrayList;
import java.util.HashMap;

public class Ficha2 {

    static void exercicio1(){
        Automovel carros1[] = new Automovel[3];

        //exercicio 1
        Automovel car1 = new Automovel("Mercedes", "Benz", "AA-20-EY", 1800);
        Automovel car2 = new Automovel("Mercedes", "Benz", "CD-31-FA", 1500);
        Automovel car3 = new Automovel("BMW", "Z3", "XX-10-YY", 1200);

        carros1[0] = car3;
        carros1[1] = car2;
        carros1[2] = car1;
        boolean correto1 = false;
        if (((carros1[1].marca.equals(carros1[0].marca)) && (!carros1[1].marca.equals(carros1[2].marca))) || (!carros1[1].marca.equals(carros1[2].marca)) && (carros1[1].marca.equals(carros1[2].marca))) {
            correto1 = true;
        }
        if (correto1) {
            for (Automovel counterCarros1 : carros1) {
                System.out.println(counterCarros1);
            }
        }
    }
    static void exercicio2() {
        ArrayList<Automovel> carros2 = new ArrayList<>();

        Automovel auto1 = new Automovel();
        auto1.marca = "BMW";
        auto1.modelo = "Z3";
        auto1.matricula = "XX-10-YY";
        auto1.cilindrada = 1200;
        Automovel auto2 = new Automovel("Mercedes", "Benz", "AA-20-EY", 1800);
        Automovel auto3 = new Automovel("Mercedes", "Benz", "CD-31-FA", 1500);

        carros2.add(auto1);
        carros2.add(auto2);
        carros2.add(auto3);
        boolean correto2 = false;
        if (((carros2.get(1).equals(carros2.get(0))) && (!carros2.get(1).equals(carros2.get(2)))) || (!carros2.get(1).equals(carros2.get(0))) && (carros2.get(1).equals(carros2.get(2)))) {
            correto2 = true;
        }
        if (correto2) {
            for (int i = 1; i < carros2.size(); i++) {
                System.out.println(carros2.get(i));
            }
        } // é mais simples de verificar igualdades num ArrayList que num Array
    }
    static void exercicio3() {

        HashMap<String, Integer> carros3 = new HashMap<String, Integer>();
    }

    static void exercicio4(){

    }


    static boolean exercicio5() {
        boolean correto5 = true;
        Automovel carros5[] = new Automovel[3];
        for (int i = 0; i < carros5.length; i++)
            if (i == 2) {
                break;
            } else {
                if (carros5[i].equals(carros5)) {
                    correto5= true;
                } else {
                    correto5 = false;
                }
            }
            return correto5;
    }


    static void exercicio6(){


    }

    public static void main(String[] args) {
            exercicio1();
            exercicio2();
            exercicio3();
            exercicio4();
            exercicio5();
            exercicio6();
    }
}
