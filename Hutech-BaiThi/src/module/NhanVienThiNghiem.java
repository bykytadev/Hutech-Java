package module;

import java.util.Date;

public class NhanVienThiNghiem extends NhanVien{
    float luongThang;

    public NhanVienThiNghiem(String hoTen, Date ngaySinh, BangCap bangCap, float luongThang) {
        super(hoTen, ngaySinh, bangCap);
        this.luongThang = luongThang;
    }

    @Override
    public String toString() {
        return "[" + super.toString() + "," + this.luongThang + "]";
    }

    @Override
    float TinhLuong(){
        return this.luongThang;
    }
}
