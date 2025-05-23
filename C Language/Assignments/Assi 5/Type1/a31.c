// print the table using fun
#include<stdio.h>

void table();
void main(){
    table();
}
void table(){
    int n;
    printf("Enter the number ");
    scanf("%d",&n);
    for(int i=1;i<=10;i++){
        printf("%d\n",n*i);

    }
}