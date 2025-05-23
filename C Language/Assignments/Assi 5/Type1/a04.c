//swap number using third var ,using fun 
#include<stdio.h>
void Swap();
void main(){
     Swap();

}
void Swap(){
    int a=23;
    int b=47;
    int temp=a;
    a=b;
    b=temp;
    printf("the swaped numbers are %d,%d",a,b);
    
}