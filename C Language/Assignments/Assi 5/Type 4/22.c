//Accept three sides of a triangle from the user and determine whether the triangle is 
//equilateral, isosceles, or scalene. 

#include<stdio.h>
int isTraingle(int,int,int);
void main(){
    int a,b,c;
    printf("enter three positive sides :");
    scanf("%d %d %d",&a,&b,&c);
    int k=isTraingle(a,b,c);
    if(k==1){
        printf("its equilateral triangle");


    }
    else if(k==2){
        printf("its isoscalen triangle");;
    }
    else{
        printf("its scalen triangle");

    }

}
int isTraingle(int a, int b, int c){
    
    if(a==b&&b==c&&c==a){
       // 
       return 1;

    }
    else if(a==b ||a==c || b==c){
        return 2;
        //
    }
    else{
        return 3;
       // 
    }

}