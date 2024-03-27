
public class ConversionContext {

	private String conversionQues = "";
	
	private String conversionResponse = "";
	
	private String fromConversion = "";
	private String toConversion = "";
	
	String[] partsOfQues;

	private double quantity;
	
	public ConversionContext(String input) {
		this.conversionQues = input;
		this.partsOfQues = getInput().split(" ");
		
		this.fromConversion = getCapitalized(this.partsOfQues[1]);
		this.toConversion = getLowerCase(partsOfQues[3]);
		
		this.quantity = Double.valueOf(partsOfQues[0]);
		this.conversionResponse = partsOfQues[0] + " " + this.partsOfQues[1] +" equals";
	}

	public String getLowerCase(String wordToLowerCase ) {
		return wordToLowerCase.toLowerCase();
	}

	public String getCapitalized(String wotdToCapitalize) {
		
		wotdToCapitalize = wotdToCapitalize.toLowerCase();
		wotdToCapitalize = Character.toUpperCase(wotdToCapitalize.charAt(0)) + wotdToCapitalize.substring(1);
		
		int lengthOfWord = wotdToCapitalize.length();
		
		if(wotdToCapitalize.charAt(lengthOfWord - 1) != 's') {
			
			wotdToCapitalize = new StringBuffer(wotdToCapitalize).insert(lengthOfWord,"s").toString();
		}
				
		return wotdToCapitalize;
	}

	 
	public String getInput() {
	
		return this.getConversionQues();
	}

	public String getConversionQues() {
		return conversionQues;
	}

	public void setConversionQues(String conversionQues) {
		this.conversionQues = conversionQues;
	}

	public String getConversionResponse() {
		return conversionResponse;
	}

	public void setConversionResponse(String conversionResponse) {
		this.conversionResponse = conversionResponse;
	}

	public String getFromConversion() {
		return this.fromConversion;
	}

	public void setFromConversion(String fromConversion) {
		this.fromConversion = fromConversion;
	}

	public String getToConversion() {
		return toConversion;
	}

	public void setToConversion(String toConversion) {
		this.toConversion = toConversion;
	}

	public String[] getPartsOfQues() {
		return partsOfQues;
	}

	public void setPartsOfQues(String[] partsOfQues) {
		this.partsOfQues = partsOfQues;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
}
