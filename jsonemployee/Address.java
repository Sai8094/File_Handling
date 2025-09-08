package com.jsonemployee;

public class Address {
	private String address;
	private String city;
	private String zipcode;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", zipcode=" + zipcode + "]";
	}

}
