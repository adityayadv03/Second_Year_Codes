/*Author :- Aditya Yadav */
#include<stdio.h> //Program to Sort Numbers in Given Array Using Merge sort Technique
void sort(int a[] , int beg , int mid , int end)
{
    int i=beg,j=mid+1,in=beg,k;
    int size=sizeof(a)/sizeof(a[0]);
    int arr[size];
    while((i<=mid)&&(j<=end))
    {
        if(a[i]<a[j])
        {
            arr[in]=a[i];
            i++;
        }
        else
        {
            arr[in]=a[j];
            j++;
        }
        in++;
    }
    if(i>mid)
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
    for(k=beg ; k<in ; k++)
    {
        a[k]=arr[k];
    }
}
void merge(int a[] , int beg , int end)
{
    int mid;
    if(beg<end)
    {
        mid=(beg+end)/2;
        merge(a,beg,mid);
        merge(a,mid+1,end);
        sort(a,beg,mid,end);
    }
}
int main()
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
    merge(arr,0,n-1);
    printf("Array After Sorting :- "); //Priting the Element After Sorting
    for(int i=0 ; i<n ; i++)
    {
        printf("%d ",arr[i]);
    }
}
