//Print fibonacci series?(optional)
#include<stdio.h>
void main(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    int a=0, b=1;
    for(int i=2;i<n;i++){
        int c=a+b;
        printf("%d\t",c);
        a=b;
        b=c;
    } 
}