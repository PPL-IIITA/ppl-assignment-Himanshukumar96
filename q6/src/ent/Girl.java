package ent;
import java.util.*;

public class Girl {
	public String name;
	public int il; 
	public int attr;
	public int maintenance;
	public int status=0;
	public String type;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIl() {
		return il;
	}
	public void setIl(int il) {
		this.il = il;
	}
	public int getAttr() {
		return attr;
	}
	public void setAttr(int attr) {
		this.attr = attr;
	}
	public int getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(int maintenance) {
		this.maintenance = maintenance;
	}
	
	
	
	
	public Girl(String name, int il, int attr, int maintenance, int status, String type) {
		super();
		this.name = name;
		this.il = il;
		this.attr = attr;
		this.maintenance = maintenance;
		//this.status = status;
		this.type = type;
	}
	public Girl() {
		super();
	}
	
}
