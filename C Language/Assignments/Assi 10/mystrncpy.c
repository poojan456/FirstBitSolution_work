#include<stdio.h>
void mystrncpy(char*,char*,int);
void main(){
    char str1[]="pooja";
    char str2[50];
    int n;
    printf("Enter size upto");
    scanf("%d",&n);

    mystrncpy(str1,str2,n);
}
void mystrncpy(char*str1,char*str2,int n){
    int i=0;
    while(i<n&&str1[i]!='\0'){
        str2[i]=str1[i];
        i++;

    }
    str2[i]='\0';
    printf("%s",str2);

}
