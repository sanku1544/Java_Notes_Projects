package com.tka.Dec13;

public class UberCab {
 private int Id;
 private String name;
 private String pLocation;
 private String dLocation;
 private String cType;
 
 public UberCab(int id, String name, String pLocation, String dLocation, String cType) {
	super();
	Id = id;
	this.name = name;
	this.pLocation = pLocation;
	this.dLocation = dLocation;
	this.cType = cType;
 }
 public int getId() {
	return Id;
 }
 public void setId(int id) {
	Id = id;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public String getpLocation() {
	return pLocation;
 }
 public void setpLocation(String pLocation) {
	this.pLocation = pLocation;
 }
 public String getdLocation() {
	return dLocation;
 }
 public void setdLocation(String dLocation) {
	this.dLocation = dLocation;
 }
 public String getcType() {
	return cType;
 }
 public void setcType(String cType) {
	this.cType = cType;
	
 }
 
 
}
