import java.util.Scanner;

public class Main {

    static dbHandlerFile file = new dbHandlerFile();
    static dbHandlerArray array = new dbHandlerArray();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Main.menuMode();
    }

    static void menuMode() throws Exception{
        System.out.println("Dinas Pertanahan dan Pencatatan");
        System.out.println("Kabupaten Tulungagung");
        System.out.println("1. Store in Array");
        System.out.println("2. Store in Database File");
        System.out.println("0. Kembali");
        System.out.print("Pilih menu : ");
        switch (input.nextInt()){
            case 1:
                menuArray();
            case 2:
                menuFile();
            case 0:
                System.exit(0);
        }
    }

    static void menuFile() throws Exception {
        System.out.println("DatabaseFile Mode");
        System.out.println("Data will be stored permanenly in File");
        System.out.println("1. Input Data");
        System.out.println("2. Lihat Data");
        System.out.println("0. Kembali");
        System.out.print("Pilih menu : ");
        switch (input.nextInt()){
            case 1 :
                file.writeData();
            case 2:
                file.readData();
            case 0 :
                Main.menuMode();
            default:
        }
    }

    static void menuArray() throws Exception{
        System.out.println("Array Mode");
        System.out.println("Data will be stored Tempoary in Array");
        System.out.println("1. Input Data");
        System.out.println("2. Lihat Data");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu : ");
        switch (input.nextInt()){
            case 1 :
                array.writeData();
            case 2:
                array.readData();
            case 0 :
                Main.menuMode();
            default:
        }
    }
}
