import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.Array;
import java.util.InputMismatchException;

public class dbHandlerArray extends dinasPertanahan {

    int dbSize = 2;
    String[] dbTanahAlamat = new String[dbSize];
    int[] dbTanahPanjang = new int[dbSize];
    int[] dbTanahLuas = new int[dbSize];

    void writeData() throws Exception{
        try {
            for (int targetIndex = 0; targetIndex < dbSize; targetIndex++) {
                System.out.print("Masukkan Alamat : ");
            /*  Clearing stored Scanner Buffer
                https://stackoverflow.com/a/31060125
            */  input.skip("\\R?"); setAlamat(input.nextLine());
                Array.set(dbTanahAlamat, targetIndex, getAlamat());

                System.out.print("Masukkan Panjang Tanah : ");
                setPanjangTanah(input.nextInt());
                Array.set(dbTanahPanjang, targetIndex, getPanjangTanah());

                System.out.print("Masukkan Luas Tanah : ");
                setLuasTanah(input.nextInt());
                Array.set(dbTanahLuas, targetIndex, getLuasTanah());
            }
        } catch (IndexOutOfBoundsException offset){
            System.out.println("Array Melampaui Batas");
        } catch (InputMismatchException missInput){
            System.out.println("Inputan Panjang & Luas Tanah harus berupa angka");
        } finally {
            Main.menuArray();
        }
    }

    void readData() throws Exception {
        try {
            System.out.printf("%-3s %-20s %-20s %-15s\n", "No", "Alamat", "Panjang Tanah", "Luas Tanah");
            for(int targetIndex = 0; targetIndex < dbSize; targetIndex++){
                System.out.printf("%-3s %-20s %-20s %-15s\n", targetIndex++, dbTanahAlamat[targetIndex], dbTanahPanjang[targetIndex], dbTanahLuas[targetIndex]);
            }
        } catch (Exception e){
            System.err.println("Array Kosong");
        } finally {
            Main.menuArray();
        }
    }
}
