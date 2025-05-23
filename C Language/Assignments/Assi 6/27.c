//age-person is t,a,
#include<stdio.h>
void Age(int*);
void main(){
    int age;
    printf("Enter the age");
    scanf("%d",&age);
    Age(&age);

}
void Age(int* age){
    
    if(*age<12){
        printf("Child");
    }
    else if(*age>=12 &&*age<=19){
        printf("Teenager");
    }
    else if(*age>=20 && *age<59){
        printf("Adult");
    }
    else if(*age>=60){
        printf("senior");
    }
    else{
        printf("invalid ");
    }

}