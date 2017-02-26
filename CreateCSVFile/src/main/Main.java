// ppl assignment ques1
//@himanshu
//@rit2015057

package main;
import entities.*;
import java.util.*;
import java.text.*;
import java.io.*;

public class Main {
	public static void main (String[] args	){
		String COMMA_DELIMITER = ",";
		String NEW_LINE_SEPARATOR = "\n";
		String FILE_HEADER_b = "name,il,attr,budget";
		String FILE_HEADER_g = "name,il,attr,maintenance";
		List <Boy> listProductsb = new ArrayList <Boy>();
		try{
			
			listProductsb.add(new Boy("boy1",70,88,5968,60));
			listProductsb.add(new Boy("boy2",71,79,5201,70));
			listProductsb.add(new Boy("boy3",72,58,5009,80));
			listProductsb.add(new Boy("boy4",73,69,6222,82));
			listProductsb.add(new Boy("boy5",74,84,7003,66));
			listProductsb.add(new Boy("boy6",76,74,4999,61));
			listProductsb.add(new Boy("boy7",77,65,6255,62));
			listProductsb.add(new Boy("boy8",78,55,7854,55));
			listProductsb.add(new Boy("boy9",80,68,5569,77));
			listProductsb.add(new Boy("boy10",66,72,8550,79));
			listProductsb.add(new Boy("boy11",67,69,6245,65));
			listProductsb.add(new Boy("boy12",68,86,7814,69));
			listProductsb.add(new Boy("boy13",84,88,5599,85));
			listProductsb.add(new Boy("boy14",85,90,8520,78));
			FileWriter fileWriter = new FileWriter	("src\\data\\list_Prod_b.csv");
			fileWriter.append(FILE_HEADER_b+"\t");
		
			for (Boy p : listProductsb){
				//System.out.println(p.getName());
				fileWriter.append("\n");
				fileWriter.append("\n");
				fileWriter.append(p.getName());
				fileWriter.append (COMMA_DELIMITER);
				fileWriter.append(String.valueOf(p.getIl()));
				fileWriter.append (COMMA_DELIMITER);
				fileWriter.append(String.valueOf(p.getAttr()));
				fileWriter.append (COMMA_DELIMITER);
				fileWriter.append(String.valueOf(p.getBudget()));
			    fileWriter.append (COMMA_DELIMITER);
				fileWriter.append(String.valueOf(p.getMin_att() )+"\t\t");
			//	fileWriter.flush();
				}
			fileWriter.close();
			
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	
		List <Girl> listProductsg = new ArrayList <Girl>();
		
		try{
			
			listProductsg.add(new Girl("girl1",51,70,4000));
			listProductsg.add(new Girl("girl2",52,71,4001));
			listProductsg.add(new Girl("girl3",60,72,4002));
			listProductsg.add(new Girl("girl4",53,73,4003));
			listProductsg.add(new Girl("girl5",54,74,4004));
			listProductsg.add(new Girl("girl6",55,75,4005));
			listProductsg.add(new Girl("girl7",56,76,4006));
			listProductsg.add(new Girl("girl8",57,77,4007));
			listProductsg.add(new Girl("girl9",58,78,4008));
			listProductsg.add(new Girl("girl10",59,79,4009));
			FileWriter fileWriter = new FileWriter	("src\\data\\list_Prod_girl.csv");
			
			fileWriter.append(FILE_HEADER_g+"\t");
			
			for (Girl g : listProductsg){
				//System.out.println(p.getName());
				fileWriter.append("\n");
				fileWriter.append("\n");
				fileWriter.append(g.getName());
				fileWriter.append (COMMA_DELIMITER);
				fileWriter.append(String.valueOf(g.getIl()));
				fileWriter.append (COMMA_DELIMITER);
				fileWriter.append(String.valueOf(g.getAttr()));
				fileWriter.append (COMMA_DELIMITER);
				fileWriter.append(String.valueOf(g.getMaintenance()) + "\t\t");
				//fileWriter.append (COMMA_DELIMITER);
				//fileWriter.append(String.valueOf(g.getStatus())+"\t\t");
		}
			fileWriter.close();
		
	} catch(Exception e){
		System.out.println(e.getMessage());
	}
	
		
		for(Girl g : listProductsg)
	    { 
			//System.out.println("hi");
	       for(Boy p : listProductsb)
	        {
	              if(g.maintenance<=p.budget && ((p.min_att <= g.attr))
	                       && (p.status==0) && (g.status==0)){
	                
	            	 
	    System.out.println(p.name+ "   " +g.name); //print couple name 
	    p.status = 1;
	    g.status = 1;
	    
	              } 

	         }
	        
	    }
	 
		
		
	}
}
