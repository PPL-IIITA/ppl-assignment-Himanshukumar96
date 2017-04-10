// ppl assignment q6
// @rit2015057 Himanshu kumar



package main;
import entities.*;



public class main {
	public static void main (String ar[]){
		Gift gt[] = new Gift[60];
		Girl gal[] = new Girl[60];
		Boy byy [] = new Boy [60];
	}
	
int i,j;
Gift tmp ; 
for(i=0 ;i<=60 ; i++)
	{
		for(j=0 ;j<=60 ; j++)
		{
			if(gt[i].price > gt[j].price)
			{
				tmp = gt[i];
				gt[i] = gt[j];
				gt[j] = tmp;
			}
		}
	}		


}