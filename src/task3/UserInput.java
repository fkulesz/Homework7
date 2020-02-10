package task3;

import java.util.Scanner;

public class UserInput {
    public int getInfoFromUser(){
        int numberOfLevels = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Podaj liczbę poziomów choinki : ");
            numberOfLevels = scan.nextInt();
        } while (!(numberOfLevels >= 1 && numberOfLevels <= 20));

        return numberOfLevels;
    }
}
