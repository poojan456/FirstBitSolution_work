#include<stdio.h>
void mystrycpy(char[],char[]);
void main(){
    char str1[40]="Pooja Nagapurkar";
    char str2[40];
    mystrycpy(str1,str2);

}
void mystrycpy(char str1[],char str2[]){
    int i=0;
    while(str1[i]!='\0'){
        str2[i]=str1[i];
        i++;

    }
    str2[i]='\0';
    printf("%s",str2);
}