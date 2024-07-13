public class HinhTron {
    // Biến lưu thông tin về bán kính của hình tròn
    private double banKinh;

    // Constructor mặc định cho bán kính là 0
    public HinhTron() {
        this.banKinh = 0;
    }

    // Constructor với tham số r là thông tin về bán kính
    public HinhTron(double r) {
        this.banKinh = r;
    }

    // Hàm trả về chu vi của hình tròn
    public double chuVi() {
        return 2 * Math.PI * banKinh;
    }

    // Hàm trả về diện tích của hình tròn
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }

    // Hàm main để thử nghiệm class HinhTron
    public static void main(String[] args) {
        // Tạo một đối tượng HinhTron với constructor mặc định
        HinhTron hinhTron1 = new HinhTron();
        System.out.println("Chu vi của hình tròn 1 (bán kính = 0): " + hinhTron1.chuVi());
        System.out.println("Diện tích của hình tròn 1 (bán kính = 0): " + hinhTron1.dienTich());

        // Tạo một đối tượng HinhTron với bán kính là 5
        HinhTron hinhTron2 = new HinhTron(5);
        System.out.println("Chu vi của hình tròn 2 (bán kính = 5): " + hinhTron2.chuVi());
        System.out.println("Diện tích của hình tròn 2 (bán kính = 5): " + hinhTron2.dienTich());
    }
}
