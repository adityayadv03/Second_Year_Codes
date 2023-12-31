/*Author :- Aditya Yadav */
#include<stdio.h>
int main()
{
    int n,ele,check=0;
    printf("Enter the Size of Array :- ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the Element :- ");
    for(int i=0 ; i<n ; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the Number to Find :- ");
    scanf("%d",&ele);
    for(int i=0 ; i<n ; i++)
    {
        if(ele==arr[i])
        {
            printf("Element Found At :- %d . ",(i+1));
            check=1;
            break;
        }
    }
    if(check==0)
    {
        printf("Element Not Found . ");
    }
}
