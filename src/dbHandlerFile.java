import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class dbHandlerFile extends dinasPertanahan {
    public void writeData() throws Exception {
        char appendData;
        /*
            Append with FileWritter Functions
            https://www.delftstack.com/howto/java/append-to-a-text-file-in-java/
         */
        try (FileWriter w = new FileWriter("dbTanah.db", true)){
            do {
                System.out.print("Masukkan Alamat : ");

            /*  Clearing stored Scanner Buffer
                https://stackoverflow.com/a/31060125
            */  input.skip("\\R?"); setAlamat(input.nextLine());

                System.out.print("Masukkan Panjang Tanah : ");
                setPanjangTanah(input.nextInt());

                System.out.print("Masukkan Luas Tanah : ");
                setLuasTanah(input.nextInt());

                w.write(String.format("%s|%s|%s\n", getAlamat(), getPanjangTanah(), getLuasTanah()));
                w.close();
                System.out.println("Tambahkan data lagi ? Y/n");
                appendData = input.next().charAt(0);
            } while (appendData == 'y' || appendData == 'Y' );
        } catch (InputMismatchException as) {
            System.err.println("Input Panjang dan Luas Tanah harus angka");
        } finally {
            Main.menuFile();
        }
    }

    public void readData() throws Exception {
        try {
            FileReader r = new FileReader("dbTanah.db");
            BufferedReader buff = new BufferedReader(r);

            String IO = buff.readLine();
            int count = 1;

            System.out.printf("%-3s %-20s %-20s %-15s\n", "No", "Alamat", "Panjang Tanah", "Luas Tanah");
            do {
                StringTokenizer st = new StringTokenizer(IO, "|");
                System.out.printf("%-3s %-20s %-20s %-15s\n",count++, st.nextToken(), st.nextToken(), st.nextToken());
                IO = buff.readLine();
            } while (IO != null);

            buff.close(); r.close();

        } catch (FileNotFoundException fileMissing) {
            System.err.println("Database tidak ditemukan");
        } finally {
            Main.menuFile();
        }
    }
}
