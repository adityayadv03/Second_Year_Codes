/*Author :- Aditya Yadav */
#include<stdio.h> //Program to Sort Numbers in Given Array Using Bubble sort Technique
int main()
{
    int n,temp;
    printf("Enter The Size of Array :- ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the Element :- ");
    for(int i=0 ; i<n ; i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int i=0 ; i<n ; i++)
    {
        for(int j=0 ; j<n-1 ; j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    printf("Array After Sorting :- ");
    for(int i=0 ; i<n ; i++)
    {
        printf("%d ",arr[i]);
    }
}
