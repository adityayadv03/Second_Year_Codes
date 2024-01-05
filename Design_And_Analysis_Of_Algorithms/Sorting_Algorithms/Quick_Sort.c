/*Author :- Aditya Yadav */
#include<stdio.h> //Program to Sort Numbers in Given Array Using Quick sort Technique
int partition(int ar[] , int low , int high) //Function to assume any number as pivot and placing it at its right position
{
    int pivot=ar[high]; //assuming the last element as pivot
    int i=(low-1); // Starting index 
    int temp; //A Variable to swaps
    for(int j=low ; j<high ; j++)
    {
        if(ar[j]<=pivot) //finding the smaller element than pivot and moving it to the right of the array
        {
            i++;
            temp=ar[i]; //Swapping
            ar[i]=ar[j];
            ar[j]=temp;
        }
    }
    //After all the element smaller than pivot are move to right then moving the pivot to its right position
    temp=ar[i+1]; //Swapping
    ar[i+1]=ar[high];
    ar[high]=temp;
    return (i+1);
}
void quick_sort(int ar[] , int low , int high) //the function will call another function partition which give the right location of pivot and place it to that location
{
    if(low<high) //a base condition to terminate the function
    {
        int pi=partition(ar,low,high); // For finding and placing the pivot partition at the right position
        quick_sort(ar,low,pi-1); //Calling the same function in which it is define and sorting the right sub array
        quick_sort(ar,pi+1,high); //Calling the same function in which it is define and sorting the left sub array
    }
}
int main() //In Quick Sort a element is selected as pivot and after one pass pivot get its right position and array is divided into two part one part is right side of pivot and second is the left side of pivot
{
    int n; // /- n To store the size of array
    printf("Enter The Size of Array :- "); //Taking the size of array
    scanf("%d",&n);
    int arr[n]; //Declaring a array of n size
    printf("Enter the Element :- "); //Taking the element of the array
    for(int i=0 ; i<n ; i++)
    {
        scanf("%d",&arr[i]);
    }
    quick_sort(arr,0,n-1); //Calling the Quick Sort Function to Sort the Array
    printf("Array After Sorting :- "); //Priting the Element After Sorting
    for(int i=0 ; i<n ; i++)
    {
        printf("%d ",arr[i]);
    }
}
