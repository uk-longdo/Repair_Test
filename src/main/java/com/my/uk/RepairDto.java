package com.my.uk;

public class RepairDto {

	private String dress_name;
	private int dress_age;
	private int dress_weight;
	private int dress_height;
	private String dress_number;
	private String dress_bottom;
	private String dress_top;
	private String dress_size;
	private String dress_day;
	
	
	
	public RepairDto(){}
	
	public RepairDto(String dress_name, int dress_age, int dress_weight, int dress_height, String dress_number,
			String dress_bottom, String dress_top, String dress_size, String dress_day) {
		super();
		this.dress_name = dress_name;
		this.dress_age = dress_age;
		this.dress_weight = dress_weight;
		this.dress_height = dress_height;
		this.dress_number = dress_number;
		this.dress_bottom = dress_bottom;
		this.dress_top = dress_top;
		this.dress_size = dress_size;
		this.dress_day = dress_day;
	}
	
	public String getDress_name() {
		return dress_name;
	}
	public void setDress_name(String dress_name) {
		this.dress_name = dress_name;
	}
	public int getDress_age() {
		return dress_age;
	}
	public void setDress_age(int dress_age) {
		this.dress_age = dress_age;
	}
	public int getDress_weight() {
		return dress_weight;
	}
	public void setDress_weight(int dress_weight) {
		this.dress_weight = dress_weight;
	}
	public int getDress_height() {
		return dress_height;
	}
	public void setDress_height(int dress_height) {
		this.dress_height = dress_height;
	}
	public String getDress_number() {
		return dress_number;
	}
	public void setDress_number(String dress_number) {
		this.dress_number = dress_number;
	}
	public String getDress_bottom() {
		return dress_bottom;
	}
	public void setDress_bottom(String dress_bottom) {
		this.dress_bottom = dress_bottom;
	}
	public String getDress_top() {
		return dress_top;
	}
	public void setDress_top(String dress_top) {
		this.dress_top = dress_top;
	}
	public String getDress_size() {
		return dress_size;
	}
	public void setDress_size(String dress_size) {
		this.dress_size = dress_size;
	}
	public String getDress_day() {
		return dress_day;
	}
	public void setDress_day(String dress_day) {
		this.dress_day = dress_day;
	}
	
	
}
