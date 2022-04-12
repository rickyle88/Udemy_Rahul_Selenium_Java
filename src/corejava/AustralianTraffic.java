package corejava;

// implement interface
public class AustralianTraffic implements CentralTraffic, ContinentTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create new object AustralianTraffic
		// I create an object for AustralianTraffic class, to implement methods present in CentralTraffic interface
		CentralTraffic a = new AustralianTraffic();
		a.FlashYello();
		a.redStop();
		a.greenGo();
		
		AustralianTraffic at = new AustralianTraffic();
		at.walkonsymbol();
		
		ContinentTraffic ct = new AustralianTraffic();
		ct.TrainSymbol();
	}

	// override method from interface
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greengo implementations");
	}

	// override method from interface
	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementations");
		
	}

	// override method from interface
	@Override
	public void FlashYello() {
		// TODO Auto-generated method stub
		System.out.println("flash yellow implementations");
		
	}
	
	// Method in AustralianTraffic class
	public void walkonsymbol() {
		System.out.println("walking");
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		
	}

}
