
public class ATMMachine implements GetATMData{
	
	private ATMState hasCard;
	private ATMState noCard;
	private ATMState hasCorrectPin;
	private ATMState atmOutOfMoney;
	
	private ATMState atmState;

	private int cashInMachine = 1000;
	
	public boolean CorrectPinEntered = false;
	
	
    public ATMState getYesCardState() { return hasCard; }

    public ATMState getNoCardState() { return noCard; }

    public ATMState getHasPin() { return hasCorrectPin; }

    public ATMState getNoCashState() { return atmOutOfMoney; }

    
    public ATMMachine()
    {	     
    	this.hasCard = new HasCard(this);
    	this.noCard = new NoCard(this);
    	this.hasCorrectPin = new HasPin(this);
    	this.atmOutOfMoney = new NoCash(this);
    	
    	this.atmState = this.noCard;
    	
    	if(this.cashInMachine < 0 ) {
    		this.atmState = this.atmOutOfMoney;
    	}
    }
    
    public void setATMState(ATMState newATMState) {
    	
    	this.atmOutOfMoney = newATMState;
    }

    public void setCashInMachine(int newCashInMachine) {
    	
    	this.cashInMachine = newCashInMachine;
    }
 
    public void insertCard() {
    	
    	this.atmState.insertCard();
    }
    
    public void ejectCard() {
    	
    	this.atmState.ejectCard();
    }

	 public void requestCash(int cashToWithdraw) {
	 	
	 	this.atmState.requestCash(cashToWithdraw);
	 }

	 public void insertPin(int pin) {
	 	
	 	this.atmState.insertPin(pin);
	 }


    
    public ATMState getATMState() { return atmState; }

    public int getCashInMachine() { return this.cashInMachine; }

	@Override
	public ATMState getATMData() {
		return this.atmState;
	}

	
}
