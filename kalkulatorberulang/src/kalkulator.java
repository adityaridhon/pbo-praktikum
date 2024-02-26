import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n====== KALKULATOR BERULANG ======\n");
        System.out.println("Masukkan operasi matematika dan simbolnya (+,-,*,/,%) : ");
        System.out.println("Contoh: 11 + 11 + 12\n");
        String operasi = input.nextLine();

        try {
            int hasil = evaluasiOperasi(operasi);
            System.out.println("Hasil: " + hasil);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan dalam mengevaluasi ekspresi.");
        } finally {
            input.close();
        }
    }

    // Fungsi evaluasi ekspresi
    public static int evaluasiOperasi(String operasi) {
        String[] token = operasi.split(" ");

        int hasil = Integer.parseInt(token[0]);

        for (int i = 1; i < token.length; i += 2) {
            String operator = token[i];
            int operand = Integer.parseInt(token[i + 1]);

            switch (operator) {
                case "+":
                    hasil += operand;
                    break;
                case "-":
                    hasil -= operand;
                    break;
                case "*":
                    hasil *= operand;
                    break;
                case "/":
                    hasil /= operand;
                    break;
                case "%":
                    hasil %= operand;
                    break;
                default:
                    System.out.print("Operator tidak valid: " + operator);
            }
        }

        return hasil;
    }
}
