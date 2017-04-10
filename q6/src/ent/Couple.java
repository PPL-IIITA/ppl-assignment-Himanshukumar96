// @Himanshu kumar
// Rit2015057


package ent;

public class Couple {
			Boy b;
			Gift gft[];
			Girl g;
			float happiness;
			
			Couple (Boy boy,Gift gift[],Girl girl  ){
				this.b = boy ;
				this.gft = gift;
				this.g = girl ;
				this.happiness = 0 ;
			}
			

// calculate happiness 
void happines ()
{
	int a,total,val;
	total = 0;
	val = 0;
	a = 0;
	int z = 0 ;

if (( b.type == "Miser")) {
	
	//happiness is in total unspent money .. so less amt gift
	while ( total + gft[0].price <= g.maintenance && total <= b.budget){
		total += gft[a].price ; //as gift are in ascending order accrdn to price
		a++;
	}
	//atleast a gift
	if (a == 0 )
	{
		total += gft[a].price ;
		val += gft[a].value ;
	}
	happiness += (b.budget - total);
}
int last = 30 ;
 if ((b.type == "Generous")) {
	 	while(total + gft[0].price <= b.budget && total <= b.budget) {
		total+= gft[last].price ;
		val+= gft[last].value;
	 	z += 1;
	 	last -= 1 ;
 	}
	 	if(z==0)
	 	{
		 	total+= gft[last].price ;
		 	val+= gft[last].value;
	 	}
	 	happiness +=  z*5;
 }

if((b.type == "Geek")) {
	while (total + gft[0].price <= g.maintenance  && total <= b.budget)
	{
		total+= gft[a].price ;
		val+= gft[a].value ;	
	}
	happiness+= g.il ;
	
}
 
if (g.type == "Choosy")
{
	happiness+= Math.log(total + val - g.maintenance);
}
if (g.type == "Normal")
{
	happiness+= total + val - g.maintenance ;
}
if (g.type == "Desperate")
{
	happiness+= Math.exp(total - g.maintenance);
}


	}
}
