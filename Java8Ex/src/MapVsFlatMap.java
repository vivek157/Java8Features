import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<String> myList = Stream.of("a", "b").map(String::toUpperCase).collect(Collectors.toList());
		List<String> asList=new ArrayList<String>();
		asList.add("A");
		asList.add("B");
		System.out.println(myList);
		
		//List<String> myList = Stream.of("a", "b").flatMap(String::toUpperCase).collect(Collectors.toList());
		
		//assertEquals(asList, myList);
		
		//FlatMap
		List<List<String>> list = Arrays.asList(
				  Arrays.asList("a"),
				  Arrays.asList("b"));
				System.out.println(list);
				
				System.out.println(list.stream().flatMap(Collection::stream).collect(Collectors.toList())/*.map(String::toUpperCase).collect(Collectors.toList()*/);;
		
	}

	/*private static void //assertEquals(List<String> asList, List<String> myList) {
		// TODO Auto-generated method stub
		
	}
*/
}
