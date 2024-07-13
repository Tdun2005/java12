public class HinhVuong {
    // Biến lưu thông tin về độ dài cạnh của hình vuông
    private double canh;

    // Constructor mặc định cho cạnh là 0
    public HinhVuong() {
        this.canh = 0;
    }

    // Constructor với tham số a là thông tin về độ dài cạnh
    public HinhVuong(double a) {
        this.canh = a;
    }

    // Hàm trả về chu vi của hình vuông
    public double chuVi() {
        return 4 * canh;
    }

    // Hàm trả về diện tích của hình vuông
    public double dienTich() {
        return canh * canh;
    }

    // Hàm main để thử nghiệm class HinhVuong
    public static void main(String[] args) {
        // Tạo một đối tượng HinhVuong với constructor mặc định
        HinhVuong hinhVuong1 = new HinhVuong();
        System.out.println("Chu vi của hình vuông 1 (cạnh = 0): " + hinhVuong1.chuVi());
        System.out.println("Diện tích của hình vuông 1 (cạnh = 0): " + hinhVuong1.dienTich());

        // Tạo một đối tượng HinhVuong với cạnh là 5
        HinhVuong hinhVuong2 = new HinhVuong(5);
        System.out.println("Chu vi của hình vuông 2 (cạnh = 5): " + hinhVuong2.chuVi());
        System.out.println("Diện tích của hình vuông 2 (cạnh = 5): " + hinhVuong2.dienTich());
    }
}
