public class Matek {
    static void main(){
        double rnd1 = Math.round(Math.random()*200);
        double rnd2 = Math.round(Math.random()*200);

        // 1.
        System.out.println( rnd1 > rnd2 ? "Első szám nagyobb! "+rnd1+">"+rnd2 : "Második szám nagyobb!"+rnd1+"<"+rnd2);

        //2.
        System.out.println( rnd1 < rnd2 ? "Első a kisebb "+rnd1+"<"+rnd2 : "Második szám a kisebb!"+rnd1+">"+rnd2);

        //3.
        System.out.println("Első szám négyzetgyöke: " + Math.sqrt(rnd1));
        System.out.println("Második szám négyzetgyöke: " + Math.sqrt(rnd1));

        //3.
        System.out.println("A két szám közötti eltérés: " + Math.abs(rnd1 - rnd2));

        //4.
        System.out.println("Első szám négyzetgyöke: " + Math.powExact((int) rnd1, 3));
        System.out.println("Második szám négyzetgyöke: " + Math.powExact((int) rnd2, 3));

        //5.
        System.out.println("A két szám hányadosának legközelebbi egészre kerekítése: " + Math.round(rnd1/rnd2));

        //6.
        System.out.println("A két szám hányadosának legközelebbi egészre kerekítése: " + Math.floor(rnd1/rnd2));

        //7.
        System.out.println("A két szám hányadosának legközelebbi egészre kerekítése: " + Math.ceil(rnd1/rnd2));


    }
}
