package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Child extends Parent {
	public void mm() {
		super.kiss(); // Accessing the parent method
		super.displayGrandparent();
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.mm(); // Calls mm(), which calls kiss()

		// checking the collection (framework) Interfacechecking and working for the
		// advanced java
		List<Integer> L = new ArrayList<>();
		List<String> m = new LinkedList<>();

		Set<String> s = new HashSet<>();
		Set<Integer> ss = new LinkedHashSet<>();

		Map<Integer, String> vm = new HashMap<>();

		Map<String, Integer> vv = new LinkedHashMap<>();

	}
}
