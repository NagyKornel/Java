import java.util.Scanner;

public class Tomb2 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a tömb méretét!");
        int size = sc.nextInt();

        double[] t = new double[size];
        int db = 0;
        while (db != size){
            System.out.println("Kérem az adatot! (tizedes szám)");
            t[db] = sc.nextDouble();
            db++;
        }
        for (int i = 0; i < t.length; i++){
            System.out.print(t[i] + "; ");
        }

    }
}
