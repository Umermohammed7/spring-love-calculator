package com.seleniumexpress.lc.api;

import java.math.BigDecimal;

public class Amount {
	
	//private BigDecimal billAmount;
	private String billAmount;
	private String localeDefinition;
	
	
	@Override
	public String toString() {
		return    getBillAmount() + " " + getLocaleDefinition() ;
	}
	/*public BigDecimal getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	} */
	
	
	
	public String getLocaleDefinition() {
		return localeDefinition;
	}
	public String getBillAmount() {
		return billAmount;
	}



	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}



	public void setLocaleDefinition(String localeDefinition) {
		this.localeDefinition = localeDefinition;
	}

}
