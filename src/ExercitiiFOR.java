public class ExercitiiFOR {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println("suma este: " + sum);

        System.out.println();

        for (int i = 0; i <= 20; i = i + 3) {
        System.out.print(i);

        }



    }
}
