package thigk2.NguyenHoangDangKhoa;

public class DanhNhan {
    private String ten;
    private String queQuan;
    private int hinh;

    public DanhNhan(String ten, String queQuan, int hinh) {
        this.ten = ten;
        this.queQuan = queQuan;
        this.hinh = hinh;
    }

    public String getTen() { return ten; }
    public String getQueQuan() { return queQuan; }
    public int getHinh() { return hinh; }
}