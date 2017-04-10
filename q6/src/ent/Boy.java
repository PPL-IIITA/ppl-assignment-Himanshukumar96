package ent;
import java.util.*;

public class Boy {
	public String name;
	public int il; 
	public int attr;
	public int budget;
	public int status =0;
	public int min_att;
	public String type ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIl() {
		return il;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	
	public int getMin_att() {
		return min_att;
	}
	public void setMin_att(int min_att) {
		this.min_att = min_att;
	}
	
	
	public Boy(String name, int il, int attr, int budget, int status, int min_att, String type) {
		super();
		this.name = name;
		this.il = il;
		this.attr = attr;
		this.budget = budget;
		this.status = status;
		this.min_att = min_att;
		this.type = type;
	}
	public Boy() {
		super();
	}
	
	

}
