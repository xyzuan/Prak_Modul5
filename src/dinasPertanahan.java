import java.util.Scanner;

public class dinasPertanahan {

    private String alamat;
    private int panjangTanah, luasTanah;

    Scanner input = new Scanner(System.in);

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getPanjangTanah() {
        return panjangTanah;
    }

    public void setPanjangTanah(int panjangTanah) {
        this.panjangTanah = panjangTanah;
    }

    public int getLuasTanah() {
        return luasTanah;
    }

    public void setLuasTanah(int luasTanah) {
        this.luasTanah = luasTanah;
    }
}
