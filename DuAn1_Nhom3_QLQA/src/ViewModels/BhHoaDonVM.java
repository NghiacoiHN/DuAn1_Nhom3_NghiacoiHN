/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author TRONG NGHIA
 */
public class BhHoaDonVM {

    String MaHD;
    String tenKH;
    String ngayTao;
    Integer trangThai;

    public BhHoaDonVM() {
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public String loadTrangThai() {
        if (this.trangThai == 1) {
            return "Đã thanh toán";
        } else if (this.trangThai == 2) {
            return "Chưa thanh toán";
        } else if (this.trangThai == 10) {
            return "Bị hủy";
        } else {
            return null;
        }
    }
}
