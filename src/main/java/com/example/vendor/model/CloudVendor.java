package com.example.vendor.model;

import javax.management.ConstructorParameters;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Getter
//@Setter
public class CloudVendor {
	


	private String vendorId;
	private String 	vendorName;
	private String  vendorAddress;
	private String  vendorphoneNumber;

	CloudVendor(){
		
	}

	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorphoneNumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorphoneNumber = vendorphoneNumber;
	
	}

	
		
	
	
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getVendorphoneNumber() {
		return vendorphoneNumber;
	}
	public void setVendorphoneNumber(String vendorphoneNumber) {
		this.vendorphoneNumber = vendorphoneNumber;
	}

	@Override
	public String toString() {
		return "CloudVendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
				+ ", vendorphoneNumber=" + vendorphoneNumber + "]";
	}
	
	
	
}
//version control testng testing
