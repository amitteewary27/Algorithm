import java.util.*;
class MergeSort
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String ar[])
	{
		int Array[];
		int LenghtOfArray,key;
		
		System.out.println("Enter the number of Array Element:");
		LenghtOfArray=sc.nextInt();
		Array=new int[LenghtOfArray];
		System.out.println("Enter the "+LenghtOfArray+" Elements");
		for(int i=0;i<LenghtOfArray;i++)
			Array[i]=sc.nextInt();
		int ar1[]=Merge(Array,0,(LenghtOfArray-1)/2,LenghtOfArray-1);
		System.out.print("Sorted Array:");
		for(int i=0;i<ar1.length;i++)
			System.out.print(ar1[i]+" ");
	}
	public static int[] Merge(int Array[],int start,int mid,int end)
	{
		
		int left_array[],right_array[];
		System.out.println("Start="+start+" Mid="+mid+" End="+end);
		if(end<=start) 
		{
			int an[]=new int[1];
			if(end<=start)
			{
				an[0]=Array[start];
				//System.out.println("#####Abnormal returning");
				return an;
			}
			int ans[]=new int[end-start];
			int cc=0;
			for(int i=start;i<=end;i++)
			{
				ans[cc++]=Array[i];
			}
			/*for(int i=0;i<cc;i++)
				System.out.print(ans[i]+" ");
			System.out.println("-----");
			sc.next();*/
			return ans;
		}
		else{
			//left_array=Copy(Array,start,mid);
			//right_array=Copy(Array,mid,end);
			if(end>=start)
			{
			//System.out.println("***Left array calling\n");
			left_array=Merge(Array,start,(start+mid)/2,mid);
			//System.out.println("===Righ Array calling\n");
			right_array=Merge(Array,mid+1,(mid+1+end)/2,end);
			int left_point=0;
			int right_point=0;
			int ln=left_array.length;
			int rn=right_array.length;
			//System.out.println("***right length="+rn+" left length="+ln+"***");
			
			int main_array[]=new int[ln+rn];
			for(int i=0;i<main_array.length;i++)
			{
				if(right_point<rn && left_point<ln)
				{
					//System.out.println("***"+right_array[right_point]+"  "+left_array[left_point]+"*****");
					if(right_array[right_point]<left_array[left_point])
					{
						main_array[i]=right_array[right_point++];
					}
					else
					{
						main_array[i]=left_array[left_point++];
					}
				}
				else if(right_point>=rn && left_point<ln)
				{
					main_array[i]=left_array[left_point++];
				}
				else if(left_point>=ln && right_point<rn)
						main_array[i]=right_array[right_point++];
			}
			/*for(int i=0;i<main_array.length;i++)
				System.out.print(main_array[i]+" ");
			System.out.println("");
			sc.next();*/
			return main_array;
			}
			/*System.out.println("Calling Null");
			sc.next();*/
			return null;
		}
		
	}
	
}