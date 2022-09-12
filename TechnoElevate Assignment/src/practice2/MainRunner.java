package practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Processing p = new Processing(); p.process();
 */
public class MainRunner {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,8,8,9,8,9);
		//al.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		al.stream().findFirst().ifPresent(System.out::println);
	}

}
