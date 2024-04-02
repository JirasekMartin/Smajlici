import java.util.Scanner;
public class Smajlici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej smajlíka: ");
        String smajlik = scanner.nextLine();

        smajlik = smajlik.trim().toUpperCase();
        smajlik = smajlik.replace("-", "");

        System.out.print("Tvůj smajlík je ");

        switch (smajlik) {
            case ":)" , ":D":
                System.out.println("veselý");
                break;
            case ":(":
                System.out.println("smutný");
                break;
            case ":*":
                System.out.println("zamilovaný");
                break;
            case ":P":
                System.out.println("s vyplazeným jazykem");
                break;
            default:
                System.out.println("neznámý");
                break;
        }
    }
}