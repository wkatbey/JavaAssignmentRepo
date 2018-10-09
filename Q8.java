import java.util.ArrayList;
import java.lang.Integer;

public class Q8 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(9);
		list.add(6);
		System.out.println("Max returns: " + max(list));
	}

	public static Integer max(ArrayList<Integer> list) {
		if (list.size() > 0 && list != null) {
			int largestValue = 0;
			for (Integer val : list) {
				if (val > largestValue)
					largestValue = val;
			}
			return largestValue;
		}
		else
			return null;
	}
}