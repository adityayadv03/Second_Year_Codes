/*Author :- Aditya Yadav */
#include<stdio.h> //Program to Sort Numbers in Given Array Using Quick sort Technique
int partition(int ar[] , int low , int high)
{
    int pivot=ar[high];
    int i=(low-1);
    int temp;
    for(int j=low ; j<high ; j++)
    {
        if(ar[j]<=pivot)
        {
            i++;
            temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
        }
    }
    temp=ar[i+1];
    ar[i+1]=ar[high];
    ar[high]=temp;
    return (i+1);
}
void quick_sort(int ar[] , int low , int high)
{
    if(low<high)
    {
        int pi=partition(ar,low,high);
        quick_sort(ar,low,pi-1);
        quick_sort(ar,pi+1,high);
    }
}
int main()
{
    int n;
    printf("Enter The Size of Array :- ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the Element :- ");
    for(int i=0 ; i<n ; i++)
    {
        scanf("%d",&arr[i]);
    }
    quick_sort(arr,0,n-1);
    printf("Array After Sorting :- "); //Priting the Element After Sorting
    for(int i=0 ; i<n ; i++)
    {
        printf("%d ",arr[i]);
    }
}
