//WAP to Calculate the Number of Words Present in a String 
#include<stdio.h>
void main(){
    char str[]=" this is random string ok";
    int i=0;
    int count=0;
    while(str[i]!='\0'){  
            if(str[i]==' '){
               count++;
            }
            i++;
        }
        printf("%d",count);
    
}