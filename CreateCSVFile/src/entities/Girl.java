package entities;
import java.util.*;

public class Girl {
	public String name;
	public int il; 
	public int attr;
	public int maintenance;
	public int status=0;
	
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
	
	
	
	public Girl(String name, int il, int attr, int maintenance) {
		super();
		this.name = name;
		this.il = il;
		this.attr = attr;
		this.maintenance = maintenance;
		//this.status = status;
	}
	public Girl() {
		super();
	}
	
}
