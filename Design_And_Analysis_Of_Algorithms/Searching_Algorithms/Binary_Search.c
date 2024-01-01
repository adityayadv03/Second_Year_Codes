/*Author :- Aditya Yadav */
#include<stdio.h> //Program to Find Any Number From the Given Array Using Binary Search Technique
int main() //In Binary Search we will find the element with the middle index of array and if it is not found then by dividing the array into two part and finding the element from any one of the sub array
{
    int n,ele,check=0; //Variable to use in the program /-n for array size /-ele to store the element to find /-check to print the appropiate message if the element is not present
    printf("Enter the Size of Array :- "); //Asking for Array Size
    scanf("%d",&n);
    int arr[n]; //Declaring the Size of Array
    printf("Enter the Element :- "); //Taking the Elements
    for(int i=0 ; i<n ; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the Number to Find :- "); //Taking the element to Search
    scanf("%d",&ele);
    int mid,low=0,up=n-1; // /-mid to store and find the middle index of array /-low to store the lower index /-up to store the last index which is size-1
    while(low<=up) //Running the loop till the low is smaller than up
    {
        mid=(low+up)/2; //Calculating the mid index
        if(arr[mid]==ele) //Checking if the element present at it is the searched element
        {
            printf("Element Found At :- %d . ",(mid+1)); //if yes printing the index
            check=1; //Setting the check to 1 to change the default value so that the not found messege can't be printed
            break; //Breaking so that the number of iteration can be reduce
        }
        else if(ele<arr[mid]) //if the element value is smaller than the middle value
        {
            up=mid-1; //then setting the up value to mid-1
        }
        else //if the element value is greater than the middle value
        {
            low=mid+1; //then setting the low value to mid+1
        }
    }
    if(check==0) //if the check is set to default value 0 then the element is not present
    {
        printf("Element Not Found . ");
    }
}
