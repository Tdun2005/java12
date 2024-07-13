public class HinhChuNhat {
    // Biến lưu thông tin về chiều dài và chiều rộng của hình chữ nhật
    private double chieuDai;
    private double chieuRong;

    // Constructor mặc định cho chiều dài và chiều rộng đều là 0
    public HinhChuNhat() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }

    // Constructor với tham số a và b là chiều dài và chiều rộng của hình
    public HinhChuNhat(double a, double b) {
        this.chieuDai = a;
        this.chieuRong = b;
    }

    // Hàm trả về chu vi của hình chữ nhật
    public double chuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    // Hàm trả về diện tích của hình chữ nhật
    public double dienTich() {
        return chieuDai * chieuRong;
    }

    // Hàm main để thử nghiệm class HinhChuNhat
    public static void main(String[] args) {
        // Tạo một đối tượng HinhChuNhat với constructor mặc định
        HinhChuNhat hcn1 = new HinhChuNhat();
        System.out.println("Chu vi của hình chữ nhật 1 (dài = 0, rộng = 0): " + hcn1.chuVi());
        System.out.println("Diện tích của hình chữ nhật 1 (dài = 0, rộng = 0): " + hcn1.dienTich());

        // Tạo một đối tượng HinhChuNhat với chiều dài là 5 và chiều rộng là 3
        HinhChuNhat hcn2 = new HinhChuNhat(5, 3);
        System.out.println("Chu vi của hình chữ nhật 2 (dài = 5, rộng = 3): " + hcn2.chuVi());
        System.out.println("Diện tích của hình chữ nhật 2 (dài = 5, rộng = 3): " + hcn2.dienTich());
    }
}
