#include<stdio.h>
int mystrlen(char[]);
void main(){
    char str1[40]="Pooja Nagapurkar";
    
    int res=mystrlen(str1);
     printf("%d",res);

}
int mystrlen(char str1[]){
    int count=0;
    int i=0;
    while(str1[i]!='\0'){
        count++;
        i++;
    }
    return count;
   
}