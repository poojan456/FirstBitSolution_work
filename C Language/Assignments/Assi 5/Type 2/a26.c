//using type 2
#include<stdio.h>
int isDiscount();
void main(){
    int x=isDiscount();
    if(x==1){
        printf("you got 20 discount");

    }
    else if(x==2){
        printf("you got 10 discount");

        
    }
    else if(x==3){
        printf("You got 15 discount");
    }
    else{
        printf("No discount");
    }
}
int isDiscount(){
    int price;
    char response;
    printf("if u r student then enter Y or no the enter N");
    scanf(" %c",&response);
    printf("enter the price");
    scanf("%d",&price);
    if(response=='Y'){
        if(price>=500){
            return 1;
        }
        else{
           return 2;
        }
    }
    else{
        if(price>=600){
            return 3;
        }
        else{
            return 0;
        }
    }

}
