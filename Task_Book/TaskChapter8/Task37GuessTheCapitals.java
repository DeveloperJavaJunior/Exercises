import java.util.*;

public class Task37GuessTheCapitals {

	public static void main(String[] args) {

		String[][] twoDStatesAndCapitals = 
				{{ "Alabama", "Alaska", "Arizona", "Arkansas", "California",
						"Colorado", "Connecticut", "Delaware", "Florida",
						"Georgia", "Hawaii", "Idaho", "Illinois", "Indiana",
						"Iowa", "Kansas", "Kentucky", "Louisiana", "Maine",
						"Maryland", "Massachusetts", "Michigan", "Minnesota",
						"Mississippi", "Missouri", "Montana", "Nebraska",
						"Nevada", "New Hampshire", "New Jersey", "New Mexico",
						"New York", "North Carolina", "North Dakota", "Ohio",
						"Oklahoma", "Oregon", "Pennsylvania", "Rhode Island",
						"South Carolina", "South Dakota", "Tennessee", "Texas",
						"Utah", "Vermont", "Virginia", "Washington",
						"West Virginia", "Wisconsin", "Wyoming" },
				{ "Montgomery", "Juneau", "Phoenix", "Little Rock",
						"Sacramento", "Denver", "Hartford", "Dover",
						"Tallahassee", "Atlanta", "Honolulu", "Boise",
						"Springfield", "Indianapolis", "Des Moines", "Topeka",
						"Frankfort", "Baton Rouge", "Augusta", "Annapolis",
						"Boston", "Lansing", "St. Paul", "Jackson",
						"Jefferson City", "Helena", "Lincoln", "Carson City",
						"Concord", "Trenton", "Santa Fe", "Albany", "Raleigh",
						"Bismark", "Columbus", "Oklahoma City", "Salem",
						"Harrisburg", "Providence", "Columbia", "Pierre",
						"Nashville", "Austin", "Salt Lake City", "Montpelier",
						"Richmond", "Olympia", "Charleston", "Madison",
						"Cheyenne" }};
		
		Random rnd = new Random();

		System.out.println(Arrays.deepToString(twoDStatesAndCapitals));

		List<List<String>> statesAndCapitals = twoDArrayToList(twoDStatesAndCapitals);
		Collections.shuffle(statesAndCapitals, rnd);

		System.out.println(statesAndCapitals);
		

	}

	public static <T> List<List<String>> twoDArrayToList(T[][] twoDArray) {
		List<T> list = new ArrayList<T>();
		for (T[] array : twoDArray) {
			list.addAll(Arrays.asList(array));
		}
		return (List<List<String>>) list;
	}
}