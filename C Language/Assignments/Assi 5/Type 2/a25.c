//using type 2
#include<stdio.h>
char* isPerson();

void main(){
    char* p=isPerson();
    printf("%s",p);

}
char* isPerson(){
    int age;
    printf("Enter the age");
    scanf("%d",&age);
    if(age<12){
        return "Child";
        
    }
    else if(age>=12 &&age<=19){
        return "Teenager";
    }
    else if(age>=20 && age<59){
        return "Adult";
    }
    else if(age>=60){
        return "senior";
    }
    else{
        return "invalid ";
    }

}
