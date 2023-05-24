import java.util.Scanner;
import java.util.Date;
import module.*;

public class App {
    NhanVien []ds;
    int n;

    public void Nhap1DSNV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên: ");

        n = sc.nextInt();
        sc.nextLine();
        ds = new NhanVien[n];

        for(int i=0; i<ds.length; i++){
            System.out.println("Nhập thông tin nhân viên thứ " + (i+1));
            System.out.println("Nhập tên nhân viên: ");
            String hoTen = sc.nextLine();
            System.out.println("Nhập ngày sinh: ");
            Date ngaySinh = new Date(sc.nextLine());

            System.out.println("Nhập bằng cấp theo quy định sau: ");
            for(int j=0; j<BangCap.values().length;j++)
                System.out.println("   " + j + "." + BangCap.values()[j]);
            System.out.print("Nhập bằng cấp:");
            int tam = sc.nextInt();
            BangCap bangcap = BangCap.values()[tam];

            System.out.println("Nhập loại nhân viên theo quy định sau: ");
            for(int j=0; j<LoaiNhanVien.values().length;j++)
                System.out.println("   " + j + "." + LoaiNhanVien.values()[j]);
            System.out.print("Nhập loại nhân viên:");
            int loaiNV = sc.nextInt();

            switch (loaiNV)
            {
                case 0: //Nhà khoa học, phải nhập thêm: chức vụ, số bài báo, số ngày công, bậc lương
                    System.out.println("Nhập chức vụ theo quy định sau: ");
                    for(int j=0; j<ChucVu.values().length;j++)
                        System.out.println("   " + j + "." + ChucVu.values()[j]);
                        System.out.println("Nhập chức vụ: ");
                    int t = sc.nextInt();
                    ChucVu chucvu = ChucVu.values()[t];
                    System.out.print("Nhập số bài báo:");
                    int sobaibao = sc.nextInt();
                    System.out.print("Nhập số ngày công:");
                    int songaycong = sc.nextInt();
                    System.out.print("Nhập bậc lương:");
                    float bacluong = sc.nextFloat();
                    sc.nextLine();
                    ds[i] = new NhaKhoaHoc(hoTen, ngaySinh, bangcap, bacluong, chucvu, sobaibao, songaycong, bacluong);
                    break;
                    
                case 1: //Nhà quản lý, phải nhập thêm: chức vụ, số ngày công, bậc lương
                    System.out.println("Nhập chức vụ theo quy định sau: :");
                    for(int j=0; j<ChucVu.values().length;j++)
                        System.out.println("   " + j + "." + ChucVu.values()[j]);
                    System.out.print("Nhập chức vụ:");
                    t = sc.nextInt();
                    chucvu = ChucVu.values()[t];
                
                    System.out.print("Nhập số ngày công:");
                    songaycong = sc.nextInt();
                    System.out.print("Nhập bậc lương:");
                    bacluong = sc.nextFloat();
                    sc.nextLine(); 
                    ds[i] = new NhaQuanLy(hoTen, ngaySinh, bangcap, bacluong, chucvu, songaycong, bacluong);
                    break;
                    
                case 2: //Nhân viên phòng thí nhiệm, phải nhập thêm: lương tháng
                    System.out.print("Nhập lương tháng:");
                    float luong = sc.nextFloat();
                    sc.nextLine();
                    ds[i] = new NhanVienThiNghiem(hoTen, ngaySinh, bangcap, luong);
            }
        }
    }

    public void Xuat1DSNV(){
        for(int i=0; i<ds.length; i++){
            System.out.println(ds[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.Nhap1DSNV();
        System.out.println("Danh sách nhân viên vừa nhập là:");
        app.Xuat1DSNV();
    }
}