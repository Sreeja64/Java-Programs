class Sort1
{
	public static void main(String args[])
	{	
		int a[]={3,1,4,2},key,j;
		for(int k=0;k<4;k++)
				System.out.print(a[k]+" ");
		System.out.println();
		for(int i=1;i<4;i++)
		{
			key=a[i];j=i-1;
			while(j>=0 && key<=a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			for(int k=0;k<4;k++)
				System.out.print(a[k]+" ");
			System.out.println();
		}
		System.out.println("The sorted array is ");
		for(int i=0;i<4;i++)
			System.out.print(a[i]+" ");
		System.out.println("Changed");
	}
}
