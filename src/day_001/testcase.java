import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class testcase {

	public static void main(String[] args) {
		// to String
		int L = 5671;
		String S = Long.toString(L);
		System.out.println(S);
		char[] S_array = S.toCharArray();
		Arrays.sort(S_array);
		System.out.println(S_array);
		Long.parseLong(S);
		Collections.reverseOrder();
		
		
	}

}
