import java.util.*;
class InsertionSort
{
	public static void main(String ar[])
	{
		int Array[];
		int LenghtOfArray,key;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Array Element:");
		LenghtOfArray=sc.nextInt();
		Array=new int[LenghtOfArray];
		System.out.println("Enter the "+LenghtOfArray+" Elements");
		for(int i=0;i<LenghtOfArray;i++)
			Array[i]=sc.nextInt();
		for(int i=1;i<LenghtOfArray;i++) //Loops start from 2nd position i.e 1th position.
		{
			key=Array[i];
			int got_position=i;
			int flag=0;
			for(int j=i-1;j>=0;j--)
			{
				if(key<Array[j])
				{
					
					Array[j+1]=Array[j];
					got_position=j;
					
				}
			}
			Array[got_position]=key;
			
		}
		System.out.print("Sorted Array is:");
		for(int j=0;j<LenghtOfArray;j++)
			{
				System.out.print(Array[j]+" ");
			}				
			System.out.println("");
		
	}
}