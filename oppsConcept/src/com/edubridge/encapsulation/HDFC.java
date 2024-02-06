package com.edubridge.encapsulation;

public class HDFC {

	private String Branch;
	private String IFCCOde;
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getIFCCOde() {
		return IFCCOde;
	}
	public void setIFCCOde(String iFCCOde) {
		IFCCOde = iFCCOde;
	}
	@Override
	public String toString() {
		return "HDFC [Branch=" + Branch + ", IFCCOde=" + IFCCOde + "]";
	}
	
	
	
}
