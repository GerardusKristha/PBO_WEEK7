package DataPegawai;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
import java.util.Scanner;
public class KantorCabang_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah pegawai : ");
        int jumlahPegawai = input.nextInt();
        KantorCabang kc =  new KantorCabang("B0001","Mangkukusuman","Yogyakarta");
        Pegawai[] dataPegawai = new Pegawai[KantorCabang.MAX_PEGAWAI];
        kc.setPegawaiArray(dataPegawai, jumlahPegawai);
        for ( int i = 0; i<jumlahPegawai; i++){
          System.out.println("\nPegawai "+(i+1));
          System.out.print("Masukkan nama :"); 
          String nama = input.next();
          System.out.print("Masukkan ID :"); 
          int id = input.nextInt();
          System.out.print("Masukkan department :");
          String department = input.next();
          System.out.print("Masukkan gaji :"); 
          int gaji = input.nextInt();
          dataPegawai [i] = new Pegawai (id,nama,department,gaji);
        }
        System.out.println(kc.toString());
    }
}
