import java.util.Scanner;

public class Tomb1 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a tömb méretét!");
        int size = sc.nextInt();

        int[] t = new int[size];
        int db = 0;
        while (db != size){
            System.out.println("Kérem az adatot!");
            t[db] = sc.nextInt();
            db++;
        }
        for (int i = 0; i < t.length; i++){
            System.out.print(t[i] + ", ");
        }

    }
}
