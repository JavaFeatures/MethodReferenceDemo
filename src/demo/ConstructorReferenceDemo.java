package demo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		List<String> fruitNames = Arrays.asList("Mango", "Banana" , "Apple", "Orange");
//		List<Fruit> fruits = fruitNames.stream().map(str -> new Fruit(str)).collect(Collectors.toList());
		List<Fruit> fruits = fruitNames.stream().map(Fruit::new).collect(Collectors.toList());
		fruits.forEach(fruit -> System.out.println("Fruit name is " + fruit.getName()));
//		Supplier<Date> dateGenerator = () -> new Date();
		Supplier<Date> dateGenerator = Date::new;
		System.out.println("Current date is " + dateGenerator.get());
	}

}
