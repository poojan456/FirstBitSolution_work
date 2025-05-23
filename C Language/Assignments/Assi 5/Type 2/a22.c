// using type 2
#include<stdio.h>
char greatest();
void main(){
    char p=greatest();
    printf("%c",p);



}
char greatest(){
    int a,b,c;
    printf("Enter three number:");
    scanf("%d%d%d",&a,&b,&c);
    
    if(a>b){
        if(a>c){
            return 'a';
        }
        else{
            return 'c';
        }
    }
    else{
        if(b>c){
            return 'b';
        }
        else{
            return 'c';
        }
    }
}



