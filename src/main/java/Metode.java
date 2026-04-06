public class Metode {

    static void salut() {
        System.out.println("Salut!");
    }

    static void ridicareLaPatrat(double numar) {
        System.out.println(numar * numar);
    }

    static void sumaADouaNumere(int x, int y) {
        System.out.println(x + y);
    }

    static int dublulUnuiNumar(int x) {
        return x * 2;
    }


    static boolean numarPar(int y) {
        if (y % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static int suma(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }


    public static void main() {
//        ridicareLaPatrat(12.2);
//        sumaADouaNumere(14,15);
//
//        int rezultat = dublulUnuiNumar(13);
//        System.out.println(rezultat);
//
//        boolean rezultat = numarPar(12);
//        System.out.println(rezultat);

        int n = 5;
        suma(n);
        System.out.println(suma(n));

        int sumaDelaUnulaN = suma(10);
        System.out.println(sumaDelaUnulaN);



    }


}
