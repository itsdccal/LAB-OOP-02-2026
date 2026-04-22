package iot;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // System.out.println("LOGIN IOT SYSTEM");
        // System.out.print("Masukkan ID: ");
        // String id = input.nextLine();

        // String passcode;
        // System.out.println("Masukkan passcode:");
        // passcode = input.nextLine();

        SmartLock device = new SmartLock ("TEST", "ABCDEF");

        // if (passcode.equals("ABCDEF") && id.equals("TEST")){
        //     System.out.println("Selamat datang");
        // }

        System.out.println("percobaan ke 1 ");
        device.unlock("apa");
        System.out.println("percobaan ke 2 ");
        device.unlock("apa");
        System.out.println("percobaan ke  3");
        device.unlock("apa");
        System.out.println("percobaan ke 4");
        device.unlock("apa");
        }
}
