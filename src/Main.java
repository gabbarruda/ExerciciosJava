import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] listaProfessores = {"Alana", "Thiago", "Samanta", "Alexia", "Odirlei"};

        for(int contador = 0;contador <
                listaProfessores.length;contador++){
            System.out.println("O indice atual é "
            +contador);
            if(contador == 0) {
                System.out.println("O número de indice do(a) professor(a)" + listaProfessores + "é Zero");
            } else if (contador % 2 == 0){
                System.out.println("O número de indice do (a) professor(a)" );
            }
        }
      }
    }

