package DataMahasiswa;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Kegiatan {
    private String namaKegiatan;
    private int point;

    public Kegiatan(){
        this("-",0);
    }
    public Kegiatan(String namaKegiatan, int point) {
        this.namaKegiatan = namaKegiatan;
        this.point = point;
    }

    public String getNamaKegiatan() {
        return namaKegiatan;
    }

    public void setNamaKegiatan(String kegiatan) {
        this.namaKegiatan = kegiatan;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    public String toString(){
        return " - Nama Kegiatan\t: "+ namaKegiatan+
                "\n - Point\t\t: "+point;
    }
}
