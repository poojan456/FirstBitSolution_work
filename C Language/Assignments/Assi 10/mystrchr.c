#include<stdio.h>
char * mystrchr(char*,char);
void main(){
    char str[]="Pooja";
    char p='d';
    char *res=mystrchr(str, p);
    if(res!=NULL){
         printf(" found character %c in string",*res);

    }
    else{
        printf("not found");
    }

}
char* mystrchr(char* str,char p){
    int i=0;
    while(str[i]!='\0'){
        if(str[i]==p){
           return &str[i];

        }

        i++;

    }
    return NULL;

}