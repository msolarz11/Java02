package Zadania;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println("ODWRACANIE");
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dowowny ciąg znaków:");
        String n = sc.nextLine();
        System.out.println(odwroc(n));
        System.out.println(odwroc(odwroc(n)));

    }

    static String odwroc(String n){
        ArrayList<Character> arrayList = new ArrayList<>();
        for(int i = n.length()-1; i >= 0; i--){
            arrayList.add(n.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : arrayList) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
