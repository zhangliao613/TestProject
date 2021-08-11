package design.factory.SimpleFactory;

public class OutputFactory {

	public Output getOutput(){
		return new Printer();
	}
}

