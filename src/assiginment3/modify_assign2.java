package assiginment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Currency{
	int amount;

	@SuppressWarnings("unused")
	private void conversion(){
		
		System.out.println("currency conversion");
	
	}
	
	
	public static class Amount{
		
		public static int addAmount(int amount) {
		
			return amount;
		}
		
		public static int addamt(int amount) {
			int amt = 0;
			{
			  amt += amount;	
			}		
			return amt;
		
		
		}
		
		
		
		
		
	}
	
	
	
	
	
	
}

class Rupee extends Currency{
	
	
	
	public Rupee(int amt) {
		
		
		Amount amnt = new Amount();
		
		this.amount = amt;
		amnt.addAmount(amt);
		amnt.addamt(amt);
		
		to_Dollar_Euro euro = new to_Dollar_Euro();
		euro.rs_to_euro();
		
		
	}
	
	class to_Dollar_Euro{
		public double rs_to_dollar(){
			return amount*0.013;
		}
		public double rs_to_euro(){
			return amount*0.012;
	}
		
		
	}
	
}

class Dollar extends Currency{
	
	
	public Dollar(int amt) {
		
		
		Amount amnt = new Amount();
		this.amount = amt;
		amnt.addAmount(amt);
		amnt.addamt(amt);

		toRupee_Euro rupe = new toRupee_Euro();
		rupe.dollar_to_rs();
		
		
	}
	
	class toRupee_Euro{
		
		public double dollar_to_rs(){
			
			return amount*74.94;
		}
		
		
		public double dollar_to_euro(){
			
			return amount*0.88;
		}
		
	}
	
	
	
	
	
	
}

class Euro extends Currency{
	
	
	public Euro(int amt) {
		
		Amount amnt = new Amount();
		this.amount = amt;
		amnt.addAmount(amt);
		amnt.addamt(amt);

		
		to_Rupee_dollar rupe = new to_Rupee_dollar();
		rupe.euro_to_rs();
	
		
		
	}
	
	
	class to_Rupee_dollar{
		
		public  double euro_to_rs(){
			return amount*84.68;
		
	}
		
		

		public  double euro_to_dollar(){
			return amount*1.13;
		}
		
		
	}
		
	
	
	
	
}


class CalculateCurrency extends Currency{

			private String convertForm;
			private String convertTo;

			public CalculateCurrency(String convert, int amt) {
				
				this.convertForm = convert;
				this.amount = amt;
				
				Rupee.to_Dollar_Euro rd = new Rupee(this.amount).new to_Dollar_Euro();
				
				Dollar.toRupee_Euro de = new Dollar(this.amount).new toRupee_Euro();
				
				Euro.to_Rupee_dollar er = new Euro(this.amount).new to_Rupee_dollar();
				
				Currency.Amount ca = new Currency.Amount();
				
				String r1 ="Rupee";
				String e1 = "Euro";
				String d1 = "Dollar";
				
				
				
				
				if (convertForm.equals(r1)){
					
				System.out.println("conversion of "+ this.amount+"rs "+ " to dollar-- "+ rd.rs_to_dollar()+"$ and to euro-- "+rd.rs_to_euro()+"eu");
				}
				else if (convertForm.equals(d1)) {
					
					System.out.println("conversion of "+this.amount+"$ "+ " to rupee-- "+ de.dollar_to_rs()+"rs and to euro-- "+de.dollar_to_euro()+"eu");
				}
				else if (convertForm.equals(e1) ) {
					
					System.out.println("conversion of "+this.amount+"eu"+ " to dollar--- "+er.euro_to_dollar()+"$ and to rupee-- "+er.euro_to_rs()+"rs");
				}
				else {
					System.out.println("something went wrong");
						
					}
				
				
				
				}
							
				
				
			}
			
		
			



public class modify_assign2 {


	public static void main(String[] args) {
		

		String r1 ="Rupee";
		String e1 = "Euro";
		String d1 = "Dollar";
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
	
		
	    List r2 = new ArrayList();
	    List e2 = new ArrayList();
	    List d2 = new ArrayList();
		
		while(true) {
		
			System.out.println("Convert From: enter Dollar/Rupee/Euro (case sensitive)");
			String from = sc.next();
			
			System.out.println("Enter the Amount:");
			int amt = sc.nextInt();	
			
			if (from.equals(r1)) {
					r2.add(amt);
			}
			
			else if (from.equals(e1)) {
				e2.add(amt);
			}
			else if(from.equals(d1)) {
				d2.add(amt);
			}
					
			@SuppressWarnings("unused")
			CalculateCurrency c = new CalculateCurrency(from, amt);	
				
			System.out.println("Do you want to add more amount, enter yes|no (case sensitive)");
			String opn = sc.next();
			String y = "yes";
			
			

			
			if(opn.equals(y)) {
				
					continue;
			
			}
			
			
			else {
				
				break;
				
			}
			
						
		
		}
		
		
		int r = 0;
		int e = 0;
		int d = 0;
		
		for(int i = 0; i < r2.size();i++) {
			
			r +=(int) r2.get(i);
		}
		for(int i = 0; i < e2.size();i++) {
			
			e +=(int) e2.get(i);
		}
		for(int i = 0; i < d2.size();i++) {
			
			d +=(int) d2.get(i);
		}
		
		System.out.println("total amount added in rupee is = "+r);
		System.out.println("total amount added in euro is = "+e);
		System.out.println("total amount added dollar is = "+d);

	}

}




