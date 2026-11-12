public class MasodfokuHiba{
    public static void main(String[] args) {
        try {
            System.out.println(masodfokuMegoldasokSzama(0, 6, 5));
            System.out.println(masodfokuMegoldasokSzama(0, 6, 5));
            System.out.println(masodfokuMegoldasokSzama(0, 1, 1));
            System.out.println(masodfokuMegoldasokSzama(1, 3, 4));
            System.out.println(masodfokuMegoldasokSzama(2, 4, 3));
            System.out.println(masodfokuMegoldasokSzama(3,-4, 2));
            System.out.println(masodfokuMegoldasokSzama(1, -2, 1));
            System.out.println(masodfokuMegoldasokSzama(1, 0, -4));
            System.out.println(masodfokuMegoldasokSzama(2, 2, -2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Program lefutott");
                    
        }

        
    }

    public static double masodfokuMegoldasokSzama(double a, double b, double c) throws IllegalArgumentException {
   
            if (a == 0) throw new IllegalArgumentException("Nem másodfokú egyenlet");
             double d = Math.pow(b, 2) - 4 * a * c;
            if (d > 0) return 2;
            else if (d == 0) return 1;
            else return 0;
       
    }



}