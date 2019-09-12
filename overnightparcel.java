public class overnightparcel extends parcel {
	
	private boolean signature;
	
	public overnightparcel(String id, double weight, boolean signature) {
		super(id, weight);
		
		this.signature = signature;
	}
	
}