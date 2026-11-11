package TangGiaHuy_25653071;

import java.time.LocalDate;

public class GD_Dat extends GiaoDich {
	private String loaiDat;
	public GD_Dat(String maGD, LocalDate ngayGD, double donGia, double dientich) {
		super(maGD, ngayGD, donGia, dientich);
	}
	/**
	 * @return the loatDat
	 */
	public String getLoatDat() {
		return loaiDat;
	}

	/**
	 * @param loatDat the loatDat to set
	 */
	public void setLoatDat(String loatDat) {
		this.loaiDat = loatDat;
	}
	@Override
	public double thanhTien() {

		if (loaiDat.equalsIgnoreCase("A")) {
				return (this.getDientich()*this.getDonGia())*1.5;
		} else {
			return (this.getDientich()*this.getDonGia());
		}
	}

	public GD_Dat(String maGD, LocalDate ngayGD, double donGia, double dientich, String loaiDat) {
		super(maGD, ngayGD, donGia, dientich);
		this.loaiDat = loaiDat;
	}
	 @Override
	public String toString() {
		return super.toString() +loaiDat;
	}
}
