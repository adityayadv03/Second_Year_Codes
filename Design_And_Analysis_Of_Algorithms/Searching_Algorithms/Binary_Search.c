/*Author :- Aditya Yadav */
#include<stdio.h> //Program to Find Any Number From the Given Array Using Binary Search Technique
int main()
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
    int mid,low=0,up=n-1;
    while(low<=up)
    {
        mid=(low+up)/2;
        if(arr[mid]==ele)
        {
            printf("Element Found At :- %d . ",(mid+1));
            check=1;
            break;
        }
        else if(ele<arr[mid])
        {
            up=mid-1;
        }
        else
        {
            low=mid+1;
        }
    }
    if(check==0) //if the check is set to default value 0 then the element is not present
    {
        printf("Element Not Found . ");
    }
}
