import java.util.Scanner;

public class penjumlahnilai {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int jumlahsiswa;
        double nilai,totalnilai=0,ratarata;

        System.out.println("masukkan jumlah siswa: ");
        jumlahsiswa=s.nextInt();
        
        for ( int angka=1; angka<=jumlahsiswa; angka++){
            System.out.println("mesukkan nilai siswa "+angka+":");
            nilai=s.nextDouble();
             totalnilai=totalnilai+nilai;

             
        }
         ratarata=totalnilai/jumlahsiswa;
            System.out.println("total nilai: "+totalnilai);
            System.out.println("rata-rata: "+ ratarata);
 s.close();
    }
}
