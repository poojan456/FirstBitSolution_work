//Accept the age and check if the person is: 
//Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)

#include<stdio.h>
int accept(int);
void main(){
    int age;
    printf("Enter the age");
    scanf("%d",&age);
    int n=accept(age);
    if(n==1){ 
        printf("Child");
    }
    else if(n==2){
        printf("Teenager");
    }

    else if(n==3){
        printf("Adult");

    }
    else if(n==4){
         printf("senior");

    }
    else {
         printf("invalid ");
    }

}
int accept(int age){
     
    if(age<12){
       return 1;
    }
    else if(age>=12 &&age<=19){
        return 2 ;
    }
    else if(age>=20 && age<59){
        return 3;
    }
    else if(age>=60){
        return 4;
       
    }
    else{
       return 0;
    }

}