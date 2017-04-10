//@Rit2015057 
// Himanshu kumar


package ent;

public class breakup {
		int i;
		int j; // last 
		Couple ar[]; // rel
		
		
		breakup(int i,int j,Couple ar[]){
			this.i = i;
			this.j = j;
			this.ar = ar;
		}
		void break_p ()
		{
			int a=0;
			while(a<j)
			{
				/* change rel  status 
				 * all status 
				 * equals zero
				 */
				
				ar[i].b.status = 0;
				ar[i].g.status = 0;
				a+=1;
			}
		}
		



}
