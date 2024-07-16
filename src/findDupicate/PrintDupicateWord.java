package findDupicate;

import java.util.HashMap;
import java.util.Map;

public class PrintDupicateWord {
    public static void main(String[] args) {
		String st="Dhoni hit back to back sixes";
		String s=st.toLowerCase();
		String[] a=s.split(" ");
		HashMap<String, Integer> h = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(h.containsKey(a[i])) {
				h.put(a[i], h.get(a[i])+1);
			}
			else
				h.put(a[i], 1);
		}
		for (Map.Entry<String, Integer> n : h.entrySet()) {
			if(n.getValue()>1) {
				System.out.println(n.getKey()+"==>"+n.getValue());
			}
		}
	}
}
