//using type2
#include<stdio.h>
int Divisible();
void main(){
    int x=Divisible();
    if(x==1){
        printf("Divisible by both");

    }
    else if(x==2){
        printf("divisible by 3 but not 5");

    }
    else if(x==3) {
        printf("divisible by 5 but not 3");

    }
    else{
        printf("divisible by none");

    }

}
int Divisible(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    if(n%3==0 && n%5==0){
        return 1;
        
    }
    else if(n%3==0){
        return 2;
       

    }
    else if(n%5==0){
        return 3;
       
    }
    else{
        return 0;
        
    }

}