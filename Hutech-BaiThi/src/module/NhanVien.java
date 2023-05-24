package module;

import java.util.Date;

abstract public class NhanVien {
    String hoTen;
    Date ngaySinh;
    BangCap bangCap;

    public NhanVien(String hoTen, Date ngaySinh, BangCap bangCap) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.bangCap = bangCap;
    }

    @Override
    public String toString() {
        return this.hoTen + "," + this.ngaySinh + "," + this.bangCap;
    }
    
    abstract float TinhLuong();
}
