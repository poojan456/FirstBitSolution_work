#include<stdio.h>
void mystrupper(char[]);
void main(){
    
    char str[30]="POOJA IS Good";
    mystrupper(str);
}
void mystrupper(char str[]){
    int i=0;
    while(str[i]!='\0'){
        if(str[i]>='A'&& str[i]<='Z'){
            str[i]=str[i]+32;// for lowercase
        }
        i++;

    }
    printf("%s",str);
}