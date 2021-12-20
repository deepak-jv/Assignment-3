package assiginment3;



public class Reverse_array {
	

	public static void main(String[] args) {

		double[] a = {1.2,3.4,4.6,5.7,2.01};
		for (int i = 0; i < a.length/2; i++)
		{
		         double temp = (double) a[i];

		          a[i] = a[a.length-1-i];

		          a[a.length-1-i] = temp;
		}
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
			
		}
		
	
		
	}

}
