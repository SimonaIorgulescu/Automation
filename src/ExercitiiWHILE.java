public class ExercitiiWHILE {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        int j = 10;
        while (j >= 1) {
            System.out.print(j + " ");
            j--;
        }

        System.out.println();

        int x = 1;
        while (x <= 30) {
            if (x % 3 == 0) {
                System.out.print(x + " ");
            }
            x++;

        }

        System.out.println();

        int y = 1;
        int sum = 0;
        while (y <= 5) {
        sum = sum + y;
        y++;
        }
        System.out.println("suma este: " + sum);

    }
}
