import java.util.Scanner;

public class MahasiswaDemo10 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1) + ":");
            System.out.print("Masukkan NIM   : ");
            String nim = input.nextLine();
            System.out.print("Masukkan Nama  : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Kelas : ");
            String kelas = input.nextLine();
            System.out.print("Masukkan IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine(); 

            Mahasiswa10 m = new Mahasiswa10(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        list.bubbleSort();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK:");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.InsertionSortAsc();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.InsertionSortDesc();
        list.tampil();
    }
}