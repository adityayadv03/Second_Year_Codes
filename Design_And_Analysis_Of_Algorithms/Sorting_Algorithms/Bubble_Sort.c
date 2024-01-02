/*Author :- Aditya Yadav */
#include<stdio.h> //Program to Sort Numbers in Given Array Using Bubble sort Technique
int main() //In Bubble sort a bubble of two number is check if the first element is greater than second if yes then swapping it
{
    int n,temp; // /-n To Store the size of array /-temp a temporary variable to perform swapping
    printf("Enter The Size of Array :- "); //Taking the array size
    scanf("%d",&n);
    int arr[n]; //Declaring the array of n size 
    printf("Enter the Element :- "); //Taking the array element from user
    for(int i=0 ; i<n ; i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int i=0 ; i<n ; i++) //Bubble Sorting Logic
    {
        for(int j=0 ; j<n-1 ; j++) //For traversing the array element to n-1 element as for n time it can generate ArrayIndexOutOfBound exception as because of the condition written in the logic
        {
            if(arr[j]>arr[j+1]) //Checking the element present in the first position is greater or not than the second element
            { //If Yes then Swapping it
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    printf("Array After Sorting :- "); //Priting the Element After Sorting
    for(int i=0 ; i<n ; i++)
    {
        printf("%d ",arr[i]);
    }
}
