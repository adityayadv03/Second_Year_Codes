/*Author :- Aditya Yadav */
#include<stdio.h> //Program to Sort Numbers in Given Array Using Selection sort Technique
int main() //In Selection Sort we Find the smallest number and swap with the Specific Position
{
    int n,temp; // /-n To Store the Size of Array /-temp to swap the Numbers 
    printf("Enter The Size of Array :- "); //Taking the array Size
    scanf("%d",&n);
    int arr[n];  //Declaring the array of size n
    printf("Enter the Element :- "); //Taking the array Element 
    for(int i=0 ; i<n ; i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int i=0 ; i<n ; i++) //Selection Sort Techniques
    {
        int min=i; //Assuming the first element to be the smallest and storing the index of that element
        for(int j=i ; j<n ; j++) //running the loop to traverse the array and finding the smallest number then the min element
        {
            if(arr[j]<arr[min]) //if any element is found smallest then the index of that element is store in min
            {
                min=j;
            }
        }
        temp=arr[min]; //Aftering the whole array is traverse and smallest is found then swapping it with the current index of i
        arr[min]=arr[i];
        arr[i]=temp;
    }
    printf("Array After Sorting :- "); //Priting the Element After Sorting
    for(int i=0 ; i<n ; i++)
    {
        printf("%d ",arr[i]);
    }
}
