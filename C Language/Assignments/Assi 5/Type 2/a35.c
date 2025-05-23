// using type2
#include<stdio.h>
int factorial();
void main(){
    int x=factorial();
    printf("%d",x);

}
int factorial(){
    int n;
    int fact=1;
    printf("The the number");
    scanf("%d",&n);       
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    return fact;

}
