/*Author :- Aditya Yadav */
#include<stdio.h> //Program to Sort Numbers in Given Array Using Merge sort Technique
void sort(int a[] , int beg , int mid , int end) //the Main Function to Sort and Merge the array
{
    int i=beg,j=mid+1,in=beg,k; //Creating the variable to traverse the both parts or array
    int size=sizeof(a)/sizeof(a[0]); //finding the size of the array passed in the function
    int arr[size]; //Declaring a array of same size of the array passed to store the sorted array
    while((i<=mid)&&(j<=end)) //Condition to traverse the array
    {
        if(a[i]<a[j]) //if the element in first sub array is small then it is store in the new array
        {
            arr[in]=a[i];
            i++;
        }
        else //if the element in second sub array is small then it is store in the new array
        {
            arr[in]=a[j];
            j++;
        }
        in++;
    }
    if(i>mid) //If any element is left then it is Store as it is
    {
        while(j<=end)
        {
            arr[in]=a[j];
            j++;
            in++;
        }
    }
    else
    {
        while(i<=mid)
        {
            arr[in]=a[i];
            i++;
            in++;
        }
    }
    for(k=beg ; k<in ; k++) //Coping the element of new array to old array so that it can be used at its called place in the main function 
    {
        a[k]=arr[k];
    }
}
void merge(int a[] , int beg , int end) //Function to divide the array into sub parts and in the last step calling a sort function to sort them
{
    int mid;
    if(beg<end)
    {
        mid=(beg+end)/2; //Dividing the function into equal parts
        merge(a,beg,mid); //calling the first sub array to divide it further
        merge(a,mid+1,end); //calling the second sub array to divide it further
        sort(a,beg,mid,end); //Sorting and Merging the both Sub Array
    }
}
int main() //In Merge Sort the array is divided into parts till the sub array have only one element and then it is merge and sorted
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
    merge(arr,0,n-1); //Calling the merge Function to Sort the array
    printf("Array After Sorting :- "); //Priting the Element After Sorting
    for(int i=0 ; i<n ; i++)
    {
        printf("%d ",arr[i]);
    }
}
