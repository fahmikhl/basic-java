import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Angka : ");
        int number = input.nextInt();

        int habisDibagi = 0;

        for ( int i = 1; i <= number ; i ++) {
            if (number % i == 0) {
                habisDibagi++;
            }
        }
        /*
        Looping ke 1 -> i = 1
        if ( 4 % 1 == 0 ) -> hasilbagi = 0 + 1 => 1;
        if ( 4 % 2 == 0 ) -> hasilbagi = 1 + 1 => 2;
        if ( 4 % 3 == 0 ) -> hasilbagi = 2;
        if ( 4 % 4 == 0 ) -> hasilbagi = 2 + 1 => 3;
        ,
        .
        .
        looping ke 7 -> i = 7
        if ( 7 % 7 == 0 ) -> hasilbagi++ -> hasilbagi = 2;

         */
        System.out.println("Bilangan " + number + " habis dibagi sebanyak :" + habisDibagi + " kali");

        if (habisDibagi == 2) {
            System.out.println("Angka " + number + " adalah bilangan Prima");
        } else {
            System.out.println("Angka " + number + " bukan bilangan Prima");
        }

    }
}
