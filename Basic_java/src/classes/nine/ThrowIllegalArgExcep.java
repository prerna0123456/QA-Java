package classes.nine;

public class ThrowIllegalArgExcep {

	public static void main(String[] args) throws InvalidArgumentsException {

		throw new InvalidArgumentsException("Throwing user defined exception");
	}

}
