public class ExercitiiSesiunea2 {

    public static void main(String[] args) {
        //System.out.println("Bebe is amazing!");
        //System.out.println("\n");
        //System.out.println("Lexi is a demon!");
        //System.out.print("\n");
        //System.out.println("Mey is a bigger demon");
        //System.out.println();
        //System.out.println("Hi there!");

//        String nume = "Valentin";
//        int varsta = 26;
//        String numeFamilie = "Dragu";
//        int nrMembriFamilie = 4;
//        boolean areAnimale = true;
//        int nrAnimale = 1;
//        boolean esteSingurLaParinti = false;

//        System.out.println(nume + " " + numeFamilie);
//
//        if (areAnimale == true) {
//            System.out.println(nrMembriFamilie + nrAnimale + numeFamilie);
//        } else {
//            System.out.println("Nu are animale de companie");
//        }
//
//        // exercitiu 3/a
//        System.out.println(varsta + 5);
//
//        // exercitiu 3/b
//        System.out.println(nrMembriFamilie + nrAnimale);
//
//
//        System.out.println("Ma numesc" + nume+"am" + varsta + "de ani" + "am" + nrAnimale + "animale de companie");

        // exercitiu 5
        int a = 10;
        int b = 11;

        if (a % b == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        if (b >= 11 && b < 16) {
            System.out.println("Valoarea este cuprinsa");
        } else {
            System.out.println("Valoarea nu este cuprinsa");
        }

        int nota = 7;
        if (nota >= 5) {
            System.out.println("admis");
        } else {
            System.out.println("respins");
        }


        // exercitiu 8

        double pretInitial = 120;
        double discount = 0;

        if (pretInitial > 100) {
            discount = pretInitial * 10/100;
            System.out.println("Discount: " + discount);
        }

        System.out.println(pretInitial - discount);

    }
}


