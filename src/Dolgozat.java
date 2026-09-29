import java.util.Scanner;

public class Dolgozat {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy nevet!");
        String nev = sc.nextLine();
        System.out.println("Kérek egy egész számot(1-10)!");
        int szam1 = sc.nextInt();
        while (szam1 > 10 || szam1 < 1) {
            System.out.println("Kérek egy egész számot(1-10)!");
            szam1 = sc.nextInt();
        }
        System.out.println("Kérek egy egész számot(10-90)!");
        int szam2 = sc.nextInt();
        while (szam2 > 90 || szam2 < 10) {
            System.out.println("Kérek egy egész számot(1-10)!");
            szam2 = sc.nextInt();
        }

        // 1. feladat
        System.out.println("Hello " + nev);

        // 2. feladat
        double korter = (Math.pow(szam1, 2) * Math.PI);
        System.out.println("The circle area: " + korter + ", rounded area: " + Math.round(korter));

        // 3. feladat
        if (szam2 % 3 == 0 && szam2 % 5 == 0){
            System.out.println("FizzBuzz!");
        } else if (szam2 % 5 == 0) {
            System.out.println("Buzz!");
        } else if (szam2 % 3 == 0) {
            System.out.println("Fizz!");
        }
        else {
            System.out.println(szam2);
        }

        // 4. feladat
        boolean prime = true;
        String oszto = "";
        for (int i = 2; i < szam1; i++) {
            if (szam1 % i == 0) {
                prime = false;
                oszto += i + ", ";
            }
        }
        System.out.println(prime? "The number is a prime!": "The number is not prime; it is divisible by: 1, " + oszto + "" + szam1);
    }
}
