public class driver{
	
	public static void main(String[] args)
	{
		
		
		 parcel a = new parcel("mdxc4x134mxm32",2);
		 parcel a2 = new parcel("mdxc4x134mxm3m2");
		 boolean answer =a.Criteria('x', 'm', 2);
		 System.out.println(answer);
		 System.out.println(a2.toString());


		 
		 
		 
		 System.out.println("Are parcels a and b the same? " + a.equals(a2));
		 
		 
		 		
		 
		 

		 

		 
		 
		 
		
	}
}