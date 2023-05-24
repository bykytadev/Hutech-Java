package module;

import java.util.Date;

public class NhaQuanLy extends NhanVienThiNghiem{
    ChucVu chucVu;
    int soNC;
    float bacLuong;

    public NhaQuanLy(String hoTen, Date ngaySinh, BangCap bangCap, float luongThang, ChucVu chucVu, int soNC, float bacLuong) {
        super(hoTen, ngaySinh, bangCap, luongThang);
        this.chucVu = chucVu;
        this.soNC = soNC;
        this.bacLuong = bacLuong;
    }

    @Override
    public String toString() {
        return "[" + super.toString() + "," + this.chucVu + "," + this.soNC + "," + this.bacLuong + "]";
    }

    @Override
    float TinhLuong(){
        return (2*this.bacLuong/26)*this.soNC;
    }
}
