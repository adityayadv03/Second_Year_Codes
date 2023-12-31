/*Author :- Aditya Yadav */
#include<stdio.h> //Program to Find Any Number From the Given Array Using Linear Search Technique
int main() //In Linear Search We will check with each element in the array till we find it or if the element is not present then whole array is traverse
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
    for(int i=0 ; i<n ; i++) //Traversing the Whole Array
    {
        if(ele==arr[i]) //Checking with each element
        {
            printf("Element Found At :- %d . ",(i+1)); //If the element found then printing its location
            check=1; //changing the value of check so that further the code dont print that the element is not present
            break; //breaking so that the number iteration can be reduce if the element is found in the starting
        }
    }
    if(check==0) //if the check is set to default value 0 then the element is not present
    {
        printf("Element Not Found . ");
    }
}
