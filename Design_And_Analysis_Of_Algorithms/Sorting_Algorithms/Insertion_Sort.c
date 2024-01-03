/*Author :- Aditya Yadav */
#include<stdio.h> //Program to Sort Numbers in Given Array Using Insertion sort Technique
int main() //In Insertion Sort we make array in two parts sorted and unsorted part and shift element from unsorted part to sorted after comparing and finding the right position
{
    int n; // /-Element to store the size of array
    printf("Enter The Size of Array :- "); //Taking the size of array
    scanf("%d",&n);
    int arr[n];  //Declaring the array
    printf("Enter the Element :- "); //Taking the ELement of The Array 
    for(int i=0 ; i<n ; i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int i=1 ; i<n ; i++) //Insertion sorting Algorithms running the loop from 1 as considering the sorted parted at the starting of the array
    {
        int key=arr[i]; //the element selected from the unsorted part
        int j=i-1; //Position to start the comparsion process
        while(j>=0 && arr[j]>key) //Running the loop till the right position is found 
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key; //Storing the Element at the right position
    }
    printf("Array After Sorting :- "); //Priting the Element After Sorting
    for(int i=0 ; i<n ; i++)
    {
        printf("%d ",arr[i]);
    }
}
