// Print table for the given number.
#include<stdio.h>
void main(){
    int n;
    printf("Enter the number ");
    scanf("%d",&n);
    for(int i=1;i<=10;i++){
        printf("%d\n",n*i);

    }
}