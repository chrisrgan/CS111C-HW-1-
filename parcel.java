public class parcel {
	
	private String id;
	private double weight;
	
	
	//Constructors
	public parcel(String id, double weight){
		this.id = id;
		this.weight = weight;
		
		
	}
	
	public parcel(String id){
		this.id = id;
		this.weight  = 1.0;	
		
	}
	
	
	
	
	public void setWeight(double weight){
		this.weight = weight;
		
		//Validity Check
		if( weight <= 0 )
		{
			throw new ArithmeticException("Weight must be positive");
		}
	}
	
	public double getWeight(){
		 return weight;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
	public String getID(){
		return this.id;
	}
	
	
	@Override
	public String toString()
	{
		return String.format("%s,%s,%s,%.1f", "Parcel ID:", getID(),"Parcel Weight:", getWeight());
		
	}
	
	@Override
	public boolean equals(Object other) {
		boolean answer = false;
		if(other instanceof parcel) {
			//Casting object "other" as an object of class parcel. Object "OtherParcel" of class parcel
			parcel OtherParcel = (parcel) other;
			
			
			String x = this.id.toLowerCase();
			String y = OtherParcel.id.toLowerCase();
			if ( x ==  y)
			{
				answer =true;
			}
			else {
				answer = false;
			}
			
		}
		return answer;
		
		
	}
	
	public boolean Criteria(char first, char second, int numberTimesSecond)
	{
		boolean answer = false;
		
		for(int i=0; i<=this.id.length()-1;  i++)
		{
			int numberoftimes = 0;
		
			if (this.id.charAt(i) == first){
				//Checks how many times second appears
				for(int j=i+1; j<=this.id.length()-1; j++) {
					if(this.id.charAt(j) == second){
						numberoftimes++;
					}
				}
				//Making sure the first loop doesn't continue again
				i=this.id.length()-1;
				//Checking the conditional statement, if "second" occurs "numberTimesSecond" times after "first"
				if(numberoftimes == numberTimesSecond)
				{
					answer = true;
					System.out.println("the " + second + " character appears " + numberTimesSecond + " times after " + first );
				}
				else {
					answer =false;
					System.out.println("the " + second + " character appears " + numberoftimes + " times after " + first );


				}
			}			
		}
		
		return answer;
	}
		
		
		
	
	
}