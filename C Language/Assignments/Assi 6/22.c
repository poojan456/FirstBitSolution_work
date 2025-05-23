// Accept three sides of a triangle from the user and determine whether the triangle is 
//equilateral, isosceles, or scalene.
#include<stdio.h>
void isTriangle(int*,int*,int*);
void main(){
    int a,b,c;
    printf("enter three positive sides :");
    scanf("%d %d %d",&a,&b,&c);
    isTriangle(&a,&b,&c);

}
void isTriangle(int* a,int* b, int* c){
   
    if(*a==*b&&*b==*c&&*c==*a){
        printf("its equilateral triangle");

    }
    else if(*a==*b ||*a==*c || *b==*c){
        printf("its isoscalen triangle");
    }
    else{
        printf("its scalen triangle");
    }

}