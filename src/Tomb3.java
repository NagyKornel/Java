import java.util.Scanner;

public class Tomb3 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a tömb méretét!");
        int size = sc.nextInt();

        String[] t = new String[size];
        int db = 0;
        while (db != size){
            System.out.println("Kérem az adatot! (tizedes szám)");
            t[db] = sc.next();
            db++;
        }
        for (int i = 0; i < t.length; i++){
            System.out.print(t[i] + "; ");
        }

    }
}
