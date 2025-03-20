public class Main {
        public static void main(String[] args) {
            Mahasiswa mhs1 = new Mahasiswa("Andika Santoso", "22345", "Informatika", 3.5);
            Mahasiswa mhs2 = new Mahasiswa("Siti Azura", "22890", "Sistem Informasi", 2.9);
    
            System.out.println("=== Data Mahasiswa 1 ===");
            mhs1.tampilkanInfo();
            System.out.println("Lulus: " + (mhs1.cekLulus() ? "Ya" : "Tidak"));
    
            System.out.println("\n=== Data Mahasiswa 2 ===");
            mhs2.tampilkanInfo();
            System.out.println("Lulus: " + (mhs2.cekLulus() ? "Ya" : "Tidak"));
        }
    }

