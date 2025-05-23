//using type2
#include<stdio.h>
int Sum();
void main(){
    int g=Sum();
    printf("the sum of number is %d",g);
    
}
int Sum(){
    int n;
    printf("Enter the number:");
    scanf("%d",&n);
    
    int i;
    int sum;
    int r1=n%10;
    while(n>10){
        //int rem=n%10;
        n=n/10;
    }
    sum=r1+n;
    return sum;
    
    

}