#include<stdio.h>
void p();
void main(){
    p();
}
void p(){
    int marks;
    printf("Enter marks");
    scanf("%d",&marks);
    if(marks>75){
        marks="Distinction";
    }
    else if(marks>65){
        marks="First Class";
    }
    else if(marks>55){
        marks="Second Class";
    }
    else if(marks>=40){
        marks="pass class";
    }
    else{
        marks="fail";
    }
    printf(marks);
}