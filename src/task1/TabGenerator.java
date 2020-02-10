package task1;

import java.util.Arrays;
import java.util.Scanner;

public class TabGenerator {
    public int[] generateTab(){
        Scanner scan = new Scanner(System.in);
        int TabSize = 0;
        System.out.println("Podaj wielkość tablicy: ");
        TabSize = scan.nextInt();
        int[] newTab = new int[TabSize];
        for(int i = 0; i < newTab.length; i ++) {
            System.out.println("Podaj kolejne elementy tablicy: ");
            newTab[i] = scan.nextInt();
        }
        String arrayToString = Arrays.toString(newTab);
        System.out.println(" Twoja tablica to " + arrayToString);

        return newTab;
    }

    public static boolean checkIfTabIsPalindrom(int[] tabToCheck){
        int tabSize = tabToCheck.length;
        for(int i = 0; i < tabSize; i++){
           if( tabToCheck[i] != tabToCheck[tabSize-1]){
               System.out.println("Nie jest palindromem");
               return false;
           }

           tabSize --;
        }
        System.out.println("jestem palindromem");
        return true;
    }
}
