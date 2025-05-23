// using tye2
#include<stdio.h>
char* mark();
void main(){
    char* d=mark();
    printf(" %s",d);
}
char* mark(){
    int marks;
    printf("Enter marks");
    scanf("%d",&marks);
    if(marks>75){
        return "Distinction";
    }
    else if(marks>65){
        return "First Class";
    }
    else if(marks>55){
        return "Second Class";
    }
    else if(marks>=40){
        return "pass class";
    }
    else{
        return "fail";
    }
    

}