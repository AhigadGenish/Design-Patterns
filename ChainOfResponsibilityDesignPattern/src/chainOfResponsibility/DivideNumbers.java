package chainOfResponsibility;

public class DivideNumbers implements Chain {

	private Chain nextInChain;
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalculatedWanted() == "div")  {
			System.out.println(request.getNumber1() + "/" + request.getNumber2() + "=" + (request.getNumber1() / request.getNumber2()));
		}
		else {
			System.out.println("Only work for add, multiply, subtract and divide");
		}
	}

}
