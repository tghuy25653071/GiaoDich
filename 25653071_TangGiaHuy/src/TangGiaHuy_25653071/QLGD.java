package TangGiaHuy_25653071;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class QLGD {
	public static void main(String[] args) {
		List<GiaoDich> DS= new ArrayList<>();
		
		DS.add(new GD_Dat("01", LocalDate.of(2013, 9, 15), 10_000_000, 100,"A"));
		
		
		
	int SLD=0, SLN=0;
	for(GiaoDich gd: DS) {
		if(gd instanceof GD_Dat) {
			SLD++;
		} else if(gd instanceof GD_Nha) {
			SLN++;
		}
	} 
	System.out.println("dat: "+SLD+" , nha: "+SLN);
	
	double tongDat =0;
	for(GiaoDich gd: DS) {
		if(gd instanceof GD_Dat) {
			tongDat+=gd.thanhTien();
		}
		}
		double TB =(SLN >0)? tongDat/SLD :0;
		System.out.println("trungbinh dat: "+TB);
		
		
		for(GiaoDich gd: DS) {
			if(gd.getNgayGD().getMonthValue()== 9 && gd.getNgayGD().getYear()==2013) {
				
				
				System.out.println(gd);
			}

				}
	}
}
