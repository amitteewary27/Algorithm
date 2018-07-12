#include<stdio.h>
#include<conio.h>

	 void main()
	{
		int Array[100],i,got_position,flag,j;
		int LenghtOfArray,key;
		clrscr();
		printf("\nEnter the number of Array Element:");
		scanf("%d",&LenghtOfArray);

		printf("\nEnter the %d Elements\n",LenghtOfArray);
		for( i=0;i<LenghtOfArray;i++)
			scanf("%d",&Array[i]);
		for( i=1;i<LenghtOfArray;i++) //Loops start from 2nd position i.e 1th position.
		{
			key=Array[i];
			 got_position=i;
			 flag=0;
			for( j=i-1;j>=0;j--)
			{
				if(key<Array[j])
				{
					
					Array[j+1]=Array[j];
					got_position=j;
					
				}
			}
			Array[got_position]=key;
			
		}
		printf("Sorted Array is:");
		for( j=0;j<LenghtOfArray;j++)
			{
				printf("%d ",Array[j]);
			}

			getch();

	}
