//WAP to Form a New String where the First Character and the Last Character have 
//been Exchanged 
#include<stdio.h>
#include<string.h>
void main(){
    char s[20]="Pooja";
    int len=strlen(s);
    char temp = s[0];
    s[0] = s[len - 1];
    s[len - 1]=temp;

    printf("new string:%s\n", s);
       
}
