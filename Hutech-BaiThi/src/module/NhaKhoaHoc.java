package module;

import java.util.Date;

public class NhaKhoaHoc extends NhanVienThiNghiem{
    ChucVu chucVu;
    int soBaiBao;
    int soNC;
    float bacLuong;

    public NhaKhoaHoc(String hoTen, Date ngaySinh, BangCap bangCap, float luongThang, ChucVu chucVu, int soBaiBao, int soNC, float bacLuong) {
        super(hoTen, ngaySinh, bangCap, luongThang);
        this.chucVu = chucVu;
        this.soBaiBao = soBaiBao;
        this.soNC = soNC;
        this.bacLuong = bacLuong;
    }

    
    @Override
    public String toString() {
        String s = "," + this.chucVu + "," + this.soBaiBao + "," + this.soNC + "," + this.bacLuong;
        return "[" + super.toString() + s + "]";
    }

    @Override
    float TinhLuong(){
        return (2*this.bacLuong/26)*this.soNC;
    }
}
