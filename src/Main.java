import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello ! Now we can get 3 random numbers.");
        System.out.println("Please, in order to get 3 random numbers, write something to the console");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        long[] end = new long[3];
        long[] persent5 = new long[5];
        persent5 = TrigerPoint ();
        long Random100 = randomNumber100();
        end = ThreeNumber (persent5);
        System.out.println("Yours numbers:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d " , end [i]);
        }
    }

    public static long[] ThreeNumber (long []persent5){
        long[] myArray = new long[3];
        long Random100 = randomNumber100();
        for (int i = 0; i < 5; i++) {
             if(Random100 == persent5[i]){
                 long temp = randomNumber();
                 for (int j = 0; j < 3; j++) {
                     myArray[j] = temp;
                 }
                 return myArray;
             }
             else {
                 for (int j = 0; j < 3; j++) {
                     myArray[j] = randomNumber () ;
                     if (j == 2 && myArray[1] != 0  ){
                         myArray[2] = myArray[1] - 1;
                     }
                     else {
                         myArray[2] = myArray[1] + 1;
                     }
                 }
             }
             return myArray;
        }





        return myArray;
    }
    public static long randomNumber (){
        double temp = Math.random();
        temp = temp * 10 ;
        return Math.round(temp);

    }
    public static long randomNumber100 (){
        double temp = Math.random();
        temp = temp * 100 ;
        return Math.round(temp);

    }
    public static long[] TrigerPoint (){
        boolean exit = true;
        long[] fiveRandNumbers = new long[5];
        do {

            for (int i = 0; i < 5; i++) {
                fiveRandNumbers[i] = randomNumber100();
            }
            exit = false;
            for (int i = 0; i < fiveRandNumbers.length; i++) {
                for (int j = i + 1; j < fiveRandNumbers.length; j++) {
                    if (fiveRandNumbers[i] == fiveRandNumbers[j])
                        exit = true;

                }
            }
        }
        while (exit);
        return fiveRandNumbers;
    }






}