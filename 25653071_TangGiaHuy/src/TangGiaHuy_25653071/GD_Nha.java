package TangGiaHuy_25653071;

import java.time.LocalDate;

public class GD_Nha extends GD_Dat {

	public GD_Nha(String maGD, LocalDate ngayGD, double donGia, double dientich) {
		super(maGD, ngayGD, donGia, dientich);
	}
	private Boolean loaiNha;
	private String diacChi;
	/**
	 * @return the loaiNha
	 */
	public Boolean getLoaiNha() {
		return loaiNha;
	}
	/**
	 * @param loaiNha the loaiNha to set
	 */
	public void setLoaiNha(Boolean loaiNha) {
		this.loaiNha = loaiNha;
	}
	/**
	 * @return the diacChi
	 */
	public String getDiacChi() {
		return diacChi;
	}
	/**
	 * @param diacChi the diacChi to set
	 */
	public void setDiacChi(String diacChi) {
		this.diacChi = diacChi;
	}
	public GD_Nha(String maGD, LocalDate ngayGD, double donGia, double dientich, Boolean loaiNha, String diacChi) {
		super(maGD, ngayGD, donGia, dientich);
		this.loaiNha = loaiNha;
		this.diacChi = diacChi;
	}
	
	public double thanhTien() {
		if (loaiNha) {
			return this.getDientich()*this.getDonGia()*90/100;
		} else {
			return this.getDientich()*this.getDonGia();
		}
	}
	@Override
	public String toString() {
		return super.toString()+loaiNha+diacChi;
	}
}
