public class MetodusokDolgozat {
    public static void main(String[] args){
        System.out.println("1. feladat");
        System.out.println(masodfokuMegoldasSzam(0, 6, 5));
        System.out.println(masodfokuMegoldasSzam(0, 1, 1));
        System.out.println(masodfokuMegoldasSzam(1, 3, 4));
        System.out.println(masodfokuMegoldasSzam(2, 4, 3));
        System.out.println(masodfokuMegoldasSzam(2, -4, 2));
        System.out.println(masodfokuMegoldasSzam(1, -2, 1));
        System.out.println(masodfokuMegoldasSzam(1, 0, -4));
        System.out.println(masodfokuMegoldasSzam(2, 2, -2));
        System.out.println("-------------------");
        System.out.println("2. feladat");
        System.out.println(vanKisbetu("alma"));
        System.out.println(vanKisbetu("ALmA"));
        System.out.println(vanKisbetu("ALMA"));
        System.out.println(vanKisbetu(""));
        System.out.println(vanKisbetu("123456"));
        System.out.println("-------------------");
        System.out.println("3. feladat");
        System.out.println(getMeret(100));
        System.out.println(getMeret(150));
        System.out.println(getMeret(156));
        System.out.println(getMeret(160));
        System.out.println(getMeret(166));
        System.out.println(getMeret(170));
        System.out.println(getMeret(176));
        System.out.println(getMeret(180));
        System.out.println(getMeret(186));
        System.out.println(getMeret(190));
        System.out.println(getMeret(200));
        System.out.println("-------------------");
        System.out.println("4. feladat");
        System.out.println(rubikKockaSzin(1));
        System.out.println(rubikKockaSzin(2));
        System.out.println(rubikKockaSzin(3));
        System.out.println(rubikKockaSzin(4));
        System.out.println(rubikKockaSzin(5));
        System.out.println(rubikKockaSzin(6));
        System.out.println(rubikKockaSzin(7));
        System.out.println(rubikKockaSzin(-1));

    }

    public static int masodfokuMegoldasSzam(int a, int b, int c){
        int d = b * b - 4 * a * c;
        if (a == 0) return -1;
        else if (d > 0) return 2;
        else if (d == 0) return 1;
        else return 0;
    }

    public static boolean vanKisbetu(String szoveg){
        if (szoveg.length() == 0) return false;
        for (int i = 0; i < szoveg.length(); i++){
            if(!szoveg.contains(szoveg.toUpperCase())){
                return true;
            }
        }
        return false;
    }

    public static String getMeret(double meret){
        if (meret < 150) return "XS";
        else if(meret < 160) return "S";
        else if(meret < 170) return "M";
        else if(meret < 180) return "L";
        else if(meret < 190) return "XL";
        else return "XXL";
    }

    public static String rubikKockaSzin(int a) {
        if (a == 1) return "yellow";
        else if (a == 2) return "red";
        else if (a == 3) return "orange";
        else if (a == 4) return "white";
        else if (a == 5) return "blue";
        else if (a == 6) return "green";
        else return "invalid parameter";

    }
}