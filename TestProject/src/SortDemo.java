
public class SortDemo {

	public static void main(String[] args) {
		int a[]= {20,15,6,18,70};
		int size1=a.length;
		int temp=0;
		for(int i=0;i<size1;i++)
		{
			for(int j=i+1;j<size1;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		for(int i=0;i<size1;i++)
		{
		System.out.println(a[i]);
		}

	}

}
