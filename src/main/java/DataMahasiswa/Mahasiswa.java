package DataMahasiswa;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Mahasiswa {
    static final int MAX_KEGIATAN = 5;
    private String nama;
    private int jumlahKegiatan;
    private Kegiatan [] kegiatan;
    
    public Mahasiswa(){
        this("");
    }
    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahKegiatan() {
        return jumlahKegiatan;
    }

    public void setJumlahKegiatan(int jumlahKegiatan) {
        this.jumlahKegiatan = jumlahKegiatan;
    }

    public Kegiatan [] getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(Kegiatan [] kegiatan,int jumlahKegiatan) {
        this.kegiatan = kegiatan;
        this.jumlahKegiatan = jumlahKegiatan;
    }
    public String toString(){
        String print = " - Nama : "+ nama+"\n";
                for(int i = 0 ; i<jumlahKegiatan;i++){
                    print+= " Kegiatan "+(i+1)+"\n"
                            +kegiatan[i].toString();
                }
        return print;
    }
}
