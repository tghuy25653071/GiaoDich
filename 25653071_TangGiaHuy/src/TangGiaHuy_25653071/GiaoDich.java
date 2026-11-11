package TangGiaHuy_25653071;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class GiaoDich {
	private String maGD;
	private LocalDate ngayGD;
	private double donGia;
	private double dientich;
	/**
	 * @return the maGD
	 */
	public String getMaGD() {
		return maGD;
	}
	/**
	 * @param maGD the maGD to set
	 */
	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}
	/**
	 * @return the ngayGD
	 */
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	/**
	 * @param ngayGD the ngayGD to set
	 */
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	/**
	 * @return the donGia
	 */
	public double getDonGia() {
		return donGia;
	}
	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	/**
	 * @return the dientich
	 */
	public double getDientich() {
		return dientich;
	}
	/**
	 * @param dientich the dientich to set
	 */
	public void setDientich(double dientich) {
		this.dientich = dientich;
	}
	public GiaoDich(String maGD, LocalDate ngayGD, double donGia, double dientich) {
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dientich = dientich;
	}
	public abstract double thanhTien();
	@Override
	public String toString() {
		return String.format("Ma: %-6s , ngay: %s, gia: %.0f ,DT: %.1f, Tien: %,.0f ",
				maGD,ngayGD.format(DateTimeFormatter.ofPattern("dd/mm/yyyy")),
				donGia,dientich,thanhTien());
	}
}
