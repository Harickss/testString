import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//ostatnie dwa znaki, minimalnie 3 znaki
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stringa");
        String testowy = scanner.nextLine();
        System.out.println(testowy);

//       public static String ostatnieznaki(String testowy){


        String custom = new String();
        if (testowy.length() >= 3) {
            testowy = testowy.substring(3);

        }
        // Nie zdążyłem ale dokończyłbym, wiem że substring inny i warunek ale czasu brakło
        System.out.println(testowy);
    }
}