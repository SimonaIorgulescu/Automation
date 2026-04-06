import java.io.StringBufferInputStream;

public class ArraysExercitii {


    public static void main(){

        int[] scor = {2,3,5,2,4,8,10,6};

        for (int i = 0; i < scor.length; i++){
            System.out.print(scor[i] + " ");
        }

        System.out.println();

        int suma = 0;
        for (int i = 0; i <scor.length; i++){
        suma = suma + scor[i];

        }

        System.out.println("Suma numerelor din sir este: " + suma);



        int valMaxima = scor[0];
        for (int i = 0; i < scor.length; i++){
            if (scor[i] > valMaxima){
                valMaxima = scor[i];
            }
        }

        System.out.println("Valoarea maxima este: " + valMaxima);



        int counter = 0;
        for (int i = 0; i < scor.length; i++){
            if (scor[i] % 2 == 0){
                counter++;
                //counter = counter + 1;
            }
        }

        System.out.println("Numarul numerelor pare este: " + counter);

        System.out.println("Media numerelor este: " + suma / (scor.length - 1));





        String text = "Ana are 7 mere verzi";

        System.out.println("Lungimea este: " + text.length());


        String cuvant = "catel";
        System.out.println("Prima litera: " + cuvant.charAt(0));
        System.out.println("Ultima litera: " + cuvant.charAt(cuvant.length() -1));



        String text1 = "Java";
        String text2 = "Python";

       boolean eq = text2.equals(text1);
        System.out.println("Textele sunt egale: " + eq);


        System.out.println("Contine cuvant: " + text.contains(cuvant));


       String noulText = text.replace(" ", "");
        System.out.println("Inlocuire spatii: " + noulText);


        String caise = text.replace("mere", "caise");
        System.out.println(caise);

    }
}
