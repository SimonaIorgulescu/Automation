public class Tema1 {


    static void invatJava() {
        System.out.println("Invat Java!");
    }

    static int ProdusDouaNumere(int x, int y) {
        return x * y;
    }

        static int sumaNumerelorPare(int start, int end) {
        int suma = 0;
        for(int i = start; i<= end; i++) {
            if(i % 2 == 0){
                suma = suma + i;
            }
        }
        return suma;

        }

    static int mediaA3Parametri(int x, int y, int z) {
        return (x + y + z) / 2;
    }

    static void numereCuprinse(int start, int end) {
        for (int i = start + 1; i < end; i++) {
            System.out.print(i + " ");
        }

    }



    public static void main(String[] args) {

        // exercitiul 1

        int varsta = 16;
        double inaltime = 1.75;
        boolean prezentLaCurs = true;

        System.out.println("Studentul are" + " " + varsta + " " + "ani");
        System.out.println("Studentul are" + " " + inaltime + " " + "metri");
        if (prezentLaCurs = true) {
            System.out.println("Studentul este prezent la curs");
        }else {
            System.out.println("Studentul nu este prezent la curs");
        }


        // exercitiul 2

        int numar1 = 3;
        int numar2 = 7;
        double numar3 = 5.5;

        System.out.println("Suma celor doua valori int este: " + (numar1 + numar2));

        System.out.println("Media numerelor este: " + ((numar1 + numar2 + numar3) / 2));

        // exercitiul 3

        int varsta1 = 16;

        if (varsta1 >= 18) {
            System.out.println("Acces permis");
        } else {
            System.out.println("Acces interzis");
        }

        // exercitiul 4

        int suma = 0;
        for (int i = 20; i <= 50; i++) {
            suma = suma + i;
        }
        System.out.println("Suma este: " + suma);

        // exercitiul 5

        int j = 10;
        while (j >= 1) {
            System.out.print(j + " ");
            j--;
        }

        System.out.println();

        // exercitiul 6

        invatJava();

        // exercitiul 7

        int rezultat = ProdusDouaNumere(6, 8);
        System.out.println("Produsul celor 2 numere este: " + rezultat);

        // exercitiul 8

        int rezultat3 = sumaNumerelorPare(1, 50);
        System.out.println("Suma numerelor pare de la 1 la 50 este: " + rezultat3);


        // exercitiul 9

        System.out.println("Media celor 3 parametri este: " + mediaA3Parametri(9, 12, 7));

        // sau

        int rezultat1 = mediaA3Parametri(9, 12, 7);
        System.out.println("Media celor 3 parametri este: " + rezultat1);

        // exercitiul 10

        numereCuprinse(10,25);

    }
}
