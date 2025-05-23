//sq and cube of number using func
#include<stdio.h>
#include<math.h>
void SC();// declaration
void main(){
    SC();//call

}
void SC(){// definition
    int a=23;
    int b=5;
    double c=pow(a,2);
    double d=pow(b,3);
    printf("the square and cube of number is %0.lf,%0.lf",c,d);

}