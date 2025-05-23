//Write a program to find greatest of three numbers using nested if-else. 

#include<stdio.h>
int greatest(int,int,int);
void main(){
    int a, b,c;
    printf("Enter three number");
    scanf("%d%d%d",&a,&b,&c);
    int h=greatest(a,b,c);
    if(h==1){
        printf("%d",a);

    }
    else if(h==2){
        printf("%d",b);
    }
    else{
        printf("%d",c);
    }

}
int greatest(int a,int b,int c){
    if(a>c){
        if(a>b){
            return 1;
        }
        else{
            return 3;
        }


    }
    else{

        if(b>c){

            return 2;
        }
        else{
            return 3;
        }

    }
    

}