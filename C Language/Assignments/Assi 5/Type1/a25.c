#include<stdio.h>

void discount();
void main(){
    discount();

}
void main(){
    int price;
    char response;
    printf("if u r student then enter Y or no the enter N");
    scanf(" %c",&response);
    printf("enter the price");
    scanf("%d",&price);
    if(response=='Y'){
        if(price>=500){
            printf("you got 20 discount");
        }
        else{
            printf("you got 10 discount");
        }
    }
    else{
        if(price>=600){
            printf("You got 15 discount");
        }
        else{
            printf("No discount");
        }
    }
}