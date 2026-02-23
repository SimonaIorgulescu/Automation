//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    import java.awt.Desktop;
import java.net.URI;

    public class Main {
        public static void main(String[] args) {
            try {
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=JaPf-MRKITg"));
            } catch (Exception e) {
                System.out.println("Scuze bebee");
            }
        }
    }