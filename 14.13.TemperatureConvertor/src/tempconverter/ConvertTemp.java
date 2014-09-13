package tempconverter;

public class ConvertTemp {

	public static Double convert(Double inputTemp, int inputIndex, int outputIndex){
		if(inputIndex == 0 && outputIndex == 1){
			return (inputTemp - 32) * 5/9;
		}
		else if(inputIndex == 0 && outputIndex == 2){
			return (inputTemp + 459.67) * 5 / 9;
		}
		else if(inputIndex == 1 && outputIndex == 0){
			return inputTemp * 9/5 + 32;
		}
		else if(inputIndex == 1 && outputIndex == 2){
			return inputTemp + 273.15;
		}
		else if(inputIndex == 2 && outputIndex == 0){
			return (inputTemp - 32) * 5 / 9 + 273.15;
		}
		else if(inputIndex == 2 && outputIndex == 1){
			return inputTemp - 273.15;
		}
		else {
			return inputTemp;
		}
	}
}
