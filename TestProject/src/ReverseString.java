
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="Welcome to Ericsson";
     String[] str1=str.split(" ");
     //System.out.println(str1);
      for (String data:str1)
      {
    	  System.out.println(data);
      }
      for(int i=0;i<3;i++)
      {
    	  char[] ch=str1[i].toCharArray();
    	  //System.out.println(ch);
    	  for(int j=ch.length-1;j>=0;j--)
    	  {
    		  System.out.print(ch[j]);
    	  }
    	  System.out.println(" ");
    	  }
	}

}
