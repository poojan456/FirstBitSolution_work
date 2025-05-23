//. Calculate sum of numbers in the given range. 
#include<stdio.h>
int sumOf(int);
void main(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    int k=sumOf(n);
    printf("%d",k);

}
int sumOf(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        sum=sum+i;

    }
    return sum;


}