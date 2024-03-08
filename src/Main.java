import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean exit = true;
        Mahasiswa mahasiswa = null;

        while (exit) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Exit");
            System.out.print("Pilihan Anda: ");

            int pilihanmu = input.nextInt();
            input.nextLine(); // consume newline

            switch (pilihanmu) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    String Nama = input.nextLine();

                    // Memastikan NIM memiliki 15 digit
                    String NIM;
                    do {
                        System.out.print("Masukkan NIM Mahasiswa (Max 15 Angka) : ");
                        NIM = input.nextLine();
                    } while (NIM.length() != 15);

                    System.out.print("Masukkan Jurusan Mahasiswa : ");
                    String Jurusan = input.nextLine();

                    mahasiswa = new Mahasiswa(Nama, NIM, Jurusan);
                    break;

                case 2:
                    System.out.println("Data Mahasiswa: ");
                    Mahasiswa.tampilkanUniversitas();
                    if (mahasiswa != null) {
                        mahasiswa.tampilkanData();
                    } else {
                        System.out.println("Belum ada data mahasiswa.");
                    }
                    break;
                case 3:
                    exit = false;
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }

    private static class Mahasiswa {
        public Mahasiswa(String nama, String nim, String jurusan){
        }

        public static void tampilkanUniversitas(){

        }

        public void tampilkanData(){
        }
    }
}