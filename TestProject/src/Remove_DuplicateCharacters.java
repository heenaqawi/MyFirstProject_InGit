import java.util.LinkedHashSet;

public class Remove_DuplicateCharacters {

	public static void main(String[] args) {
		
		String s="geeksforgeeks";
	    LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	    for(int i=0;i<s.length();i++)
	    {
	    	set.add(s.charAt(i));
	    }
	    System.out.println(set.toString());
		 
		
		

	}

}
