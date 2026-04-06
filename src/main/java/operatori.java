public class operatori {

    public static void main(String[] args) {

        //operatori matematici

//        System.out.println(11 % 3);
//
//        System.out.println(3032 % 15);
//
//        System.out.println(15 + 9);
//
//        System.out.print(15 * 9);
//
//        System.out.println(15 - 9);
//
//        System.out.println(15 / 9);
//
//        double x = 8;
//
//        System.out.print(17 / x);

        //operatori logici == ; || ; &&

        // == comparatie
        // = asignare

        double y = 15;
        int z = 13;

        if (y == z) {
            System.out.print("adevarat");
        }else {
            System.out.println("fals");

        }

        // || sau logic
        // true || true -> true
        // true || false -> true
        // false || false -> false

        boolean ciocolata = true;
        boolean capsuni = false;

        if (ciocolata || capsuni) {
            System.out.println("imi cumpar inghetata");
        }else {
            System.out.println("nu imi cumpar inghetata");
        }

        // && si logic

        if (ciocolata && capsuni) {
            System.out.println("astazi mananc inghetata");
        }else {
            System.out.print("astazi mananc prajitura");

        }


    }
}
