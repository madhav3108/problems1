import java.io.Console;
import java.util.Scanner;

public class uppercase {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            args[i] = Character.toUpperCase(args[i].charAt(0)) + args[i].substring(1).toLowerCase();
            System.out.print(args[i] + " ");
        }

    }
}