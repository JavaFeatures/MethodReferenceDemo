package demo;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReferenceDemo {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("Monday", "January", "March", "Friday", "September");
//		input.stream().filter(str -> str.endsWith("day")).forEach(str -> System.out.println("Day is " + str));
		InstanceMethodReferenceDemo instanceMethodReferenceDemoObj = new InstanceMethodReferenceDemo();
		input.stream().filter(instanceMethodReferenceDemoObj::checkDay).forEach(str -> System.out.println("Day is " + str));
	}
	
	public boolean checkDay(String input) {
		if (input.endsWith("day"))
			return true;
		else
			return false;
	}

}
