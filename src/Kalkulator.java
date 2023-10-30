import java.util.Scanner;

/**
 * Program Kalkulator adalah aplikasi sederhana yang memungkinkan pengguna untuk
 * melakukan operasi matematika dasar, seperti penjumlahan, pengurangan, perkalian,
 * dan pembagian.
 */
public class Kalkulator {
    /**
     * Metode utama program Kalkulator.
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float angka1, angka2;
        int pilihan;

        System.out.print("Masukkan angka pertama: ");
        angka1 = scanner.nextFloat();
        System.out.print("Masukkan angka kedua: ");
        angka2 = scanner.nextFloat();

        System.out.println("Pilih operasi matematika:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan (1-4): ");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.printf("Hasil penjumlahan: %.2f\n", angka1 + angka2);
                break;
            case 2:
                System.out.printf("Hasil pengurangan: %.2f\n", angka1 - angka2);
                break;
            case 3:
                System.out.printf("Hasil perkalian: %.2f\n", angka1 * angka2);
                break;
            case 4:
                if (angka2 != 0) {
                    System.out.printf("Hasil pembagian: %.2f\n", angka1 / angka2);
                } else {
                    System.out.println("Tidak dapat melakukan pembagian karena angka dibagi dengan nol.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
