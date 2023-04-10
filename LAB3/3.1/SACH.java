package SACH;
import java.util.Scanner;
public class SACH {
	String ma, ten, tg;
    int trang, tap, gia;
    String loai, nxb;

    // Phương thức nhập thông tin sách
    void nhapSach() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        ma = scanner.nextLine();

        System.out.print("Nhap ten sach: ");
        ten = scanner.nextLine();

        System.out.print("Nhap ten tac gia: ");
        tg = scanner.nextLine();

        System.out.print("Nhap so trang: ");
        trang = scanner.nextInt();

        System.out.print("Nhap loai sach: ");
        scanner.nextLine(); // Xử lý dòng mới
        loai = scanner.nextLine();

        System.out.print("Nhap nha xuat ban: ");
        nxb = scanner.nextLine();

        System.out.print("Nhap so tap: ");
        tap = scanner.nextInt();

        System.out.print("Nhap gia: ");
        gia = scanner.nextInt();
    }

    // Phương thức in thông tin sách
    void inSach() {
        System.out.println("Ma sach: " + ma);
        System.out.println("Ten sach: " + ten);
        System.out.println("Ten tac gia: " + tg);
        System.out.println("So trang: " + trang);
        System.out.println("Loai sach: " + loai);
        System.out.println("Nha xuat ban: " + nxb);
        System.out.println("So tap: " + tap);
        System.out.println("Gia: " + gia);
    }
}