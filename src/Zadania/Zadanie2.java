package Zadania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie2 {
        public static void main(String[] args) {
            System.out.println("SUMOWANIE");
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj n:");
            int n = Integer.parseInt(sc.nextLine());
            printujListe(stworzListe(n));
        }

        static ArrayList<Integer> stworzListe(int n){
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for(int i = 0; i <= n; i++){
                arrayList.add(i);
            }
            return arrayList;
        }

        static void printujListe(ArrayList<Integer> lista){
            System.out.println("Wszystkie elementy:");
            System.out.println(lista);
            System.out.println("Suma = " + zsumujListe(lista));
        }

        static int zsumujListe(ArrayList<Integer> lista){
            int sum = 0;
            for(int i = 0; i < lista.size(); i++){
                sum += lista.get(i);
            }
            return sum;
        }
    }
