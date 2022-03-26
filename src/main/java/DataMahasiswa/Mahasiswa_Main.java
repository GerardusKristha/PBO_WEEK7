package DataMahasiswa;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
import java.util.Scanner;
public class Mahasiswa_Main {
    private static final int MAX_MAHASISWA = 100;
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        Mahasiswa[] dataMahasiswa = new Mahasiswa[MAX_MAHASISWA];
        
        for( int i=0; i<jumlahMahasiswa; i++){
            System.out.print("\nNama : ");
            String nama = input.next();
            dataMahasiswa[i]=new Mahasiswa(nama);
            
            System.out.print("Jumlah Kegiatan : ");
            int jumlahKegiatan = input.nextInt();
            if(jumlahKegiatan>Mahasiswa.MAX_KEGIATAN||jumlahKegiatan<0){
               jumlahKegiatan = Mahasiswa.MAX_KEGIATAN;
            }
            Kegiatan [] dataKegiatan = new Kegiatan[Mahasiswa.MAX_KEGIATAN];
            for(int j=0;j<jumlahKegiatan;j++){
                System.out.print("Kegiatan "+(j+1)+" : ");
                String namKeg = input.next();
                System.out.print("Point : ");
                int point = input.nextInt();
                dataKegiatan[j]=new Kegiatan(namKeg,point);
            }
            dataMahasiswa[i].setKegiatan(dataKegiatan,jumlahKegiatan);
        }
        System.out.println("\n------------------------------\n - Data Kegiatan Mahasiswa - ");
        for(int i=0; i<jumlahMahasiswa;i++){
            System.out.println("\nMahasiswa " + (i+1));
            System.out.println(dataMahasiswa[i].toString());
        }
    }
}

//   private static final int MAX_MAHASISWA = 100;
//    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        System.out.print("Masukkan jumlah mahasiswa : ");
//        int jumlahMahasiswa = input.nextInt();
//        Mahasiswa[] dataMahasiswa = new Mahasiswa[MAX_MAHASISWA];
//        
//        for( int i=0; i<jumlahMahasiswa; i++){
//            System.out.println("Nama : ");
//            String nama = input.next();
//            
//            System.out.print("Jumlah Kegiatan : ");
//            int jumlahKegiatan = input.nextInt();
//            if(jumlahKegiatan>Mahasiswa.MAX_KEGIATAN||jumlahKegiatan<0){
//               jumlahKegiatan = Mahasiswa.MAX_KEGIATAN;
//            }
//            dataMahasiswa[i]=new Mahasiswa(nama);
//            Kegiatan [] dataKegiatan = new Kegiatan[Mahasiswa.MAX_KEGIATAN];
//            for(int j=0;j<jumlahKegiatan;j++){
//                System.out.println("Nama kegiatan : ");
//                String namKeg = input.next();
//                System.out.println("Point : ");
//                int point = input.nextInt();
//                dataKegiatan[j]=new Kegiatan(namKeg,point);
//            }
//            dataMahasiswa[i].setKegiatan(dataKegiatan,jumlahKegiatan);
//        }
//        for(int i=0; i<jumlahMahasiswa;i++){
//            System.out.println(dataMahasiswa[i].toString());
//        }
//    }