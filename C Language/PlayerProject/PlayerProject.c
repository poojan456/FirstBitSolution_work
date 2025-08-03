#include<stdio.h>
#include<string.h>
#include<stdlib.h>
typedef struct Date
{
	int day,month,year;
}Date;

typedef struct Player{
    int jersey_No;
    char name[20];
    int runs;
    int wicket;
    int matched_played;
    Date dob;
    long mobileno;
}Player;


Date getCurrentDate()
{
	Date dob;
	dob.day=5;
	dob.month=06;
	dob.year=2025;
	return dob;
}

void AddPlayers(Player*p,int n){
   printf("Add Player detail\n");
   for(int i=0;i<n;i++){
    printf("Enter jersey Number\n");
    scanf("%d",&p[i].jersey_No);
    printf("Enter player name\n");
    scanf("%s",p[i].name);
    //fgets(p[i].name, sizeof(p[i].name), stdin);
    printf("Enter runs\n");
    scanf("%d",&p[i].runs);
    printf("Enter how many wicket player has taken\n");
    scanf("%d",&p[i].wicket);
    printf("How many matched played upto\n");
    scanf("%d",&p[i].matched_played);
    printf("Dob of player\n");
    scanf("%d",&p[i].dob.day);
    scanf("%d",&p[i].dob.month);
    scanf("%d",&p[i].dob.year);
    printf("Enter mobile number\n");
    scanf("%ld",&p[i].mobileno);
   }
}
void display(Player* p,int n){
    for(int i=0;i<n;i++){
        printf("\nPlayer %d:\n",i+1);
        printf("\n Jersery_no is:%d\n name is %s\n runs is %d\n wickets is %d\n no. of match played is %d\n dob of player is %d %d %d\n mobile number is %ld\n",p[i].jersey_No,p[i].name,p[i].runs,p[i].wicket,p[i].matched_played,p[i].dob.day,p[i].dob.month,p[i].dob.year,p[i].mobileno);
    }
}
void RemovePlayer(Player* p,int* n){
    int index;
    printf("Enter which player u want to remove\n");
    scanf("%d",&index);
    if(index<0||index>=*n){
        printf("Invalid index\n");
        return;
    }
    for(int i=index;i<*n-1;i++){
        p[i]=p[i+1];
    }
    
    (*n)--;//decrease total number of players by 1
    printf("Player removed!\n");
    display(p,*n);// this call list show updated list
}
void SearchByName(Player* p,int* n){
    char Sname[20];
    int found=0;
    printf("Enter which name u want to search\n");
    scanf("%s",Sname);
    for(int i=0;i<*n;i++){//sname jar hyatl nhi takl tar
        if(strcmp(p[i].name,Sname)==0){
            printf("\n Jersery_no is:%d\n name is %s\n runs is %d\n wickets is %d\n no. of matched played is %d\n",p[i].jersey_No,p[i].name,p[i].runs,p[i].wicket,p[i].matched_played);
            found=1;//Sname occur
            break; 
        }
    }
    if(found==0){
        printf("Searched name %s is not found",Sname);
    }
}
void SearchByJersyN(Player* p,int* n){
    int num;
    int found=0;
    printf("Enter which JersyNumber u want to search\n");
    scanf("%d",&num);
    for(int i=0;i<*n;i++){
        if(p[i].jersey_No==num){
            printf("\n Jersery_no is:%d\n name is %s\n runs is %d\n wickets is %d\n no. of matched played is %d\n",p[i].jersey_No,p[i].name,p[i].runs,p[i].wicket,p[i].matched_played);
            found=1;
            break;
        }
    }
    if(found==0){
        printf("Jersey number not found\n");
    }
}
void searchStudentByBirthMonth(Player* p,int n,int month)
{
	int flag=0;
	for(int i=0;i<n;i++)
	{
		if(p[i].dob.month==month)
		{
			printf("Name: %s, DOB: %d/%d/%d\n", p[i].name, p[i].dob.day, p[i].dob.month, p[i].dob.year);
			flag=1;
		}
	}
	if(flag==0)
		printf("no records found");
}
void sendSms(long mobno,char* message)
{
	printf("%s is sent to %ld\n",message,mobno);
}
void sendBirthdayWish(Player* p,int *n)
{
	Date currdate=getCurrentDate();
	for(int i=0;i<*n;i++)
	{
		if(p[i].dob.month==currdate.month && p[i].dob.day==currdate.day)
		{
			char message[50]="Happy birthday ";
			strcat(message,p[i].name);
			sendSms(p[i].mobileno,message);
		}
	}
}

void updatePlayerInfo(Player* p,int*n){
    printf("Update player info based on name: \n");
        char Sname[20];
        printf("Enter player name whose run, wicket , no of match want to update:\n");
        scanf("%s",Sname);
        for(int i=0;i<*n;i++){
            if(strcmp(p[i].name,Sname)==0){
                printf("new added runs: ");
                scanf("%d", &p[i].runs);  
                printf("new added wickets: ");
                scanf("%d", &p[i].wicket);
                printf("new matches played: ");
                scanf("%d", &p[i].matched_played);

                printf("Player data updated\n");

                printf("\nAll Player updated Data:\n");
                for (int j=0;j<*n;j++) {
                    printf("Name: %s, Runs:%d, Wickets:%d, Matches: %d\n",
                           p[j].name,p[j].runs,p[j].wicket,p[j].matched_played);
                }
                return;
            }
        }
}
void DisplayTopThreePlayer(Player*p,int*n){
    //sort by runs
    for(int i=0;i<*n-1;i++){
        for(int j=i+1;j<*n;j++){
            if(p[j].runs>p[i].runs){
                Player temp=p[i];
                p[i]=p[j];
                p[j]=temp;
            }
        }
    }
    printf("\nTop 3 players based on runs\n");
    for(int i=0;i<*n&&i<3;i++){
        printf("\nName:%s, Runs:%d, Wickets:%d, Matches:%d\n Mobile_number:%ld\n",p[i].name,p[i].runs,p[i].wicket,p[i].matched_played,p[i].mobileno);
    }
    //sort by wicket
    for(int i=0;i<*n-1;i++){
        for(int j=i+1;j<*n;j++){
            if(p[j].wicket>p[i].wicket){
                Player temp=p[i];
                p[i]=p[j];
                p[j]=temp;
            }
        }
    }
    printf("\nTop 3 players based on wicket\n");
    for(int i=0;i<*n &&i<3;i++){
        printf("\nName: %s, Runs: %d, Wickets: %d, Matches: %d\n",p[i].name,p[i].runs,p[i].wicket,p[i].matched_played);
    }
}
void main(){
    int n;
    printf("Welcome to Player Management system\n");
    printf("Enter How many player u want to add\n");
    scanf("%d",&n);
    Player* p = (Player*) malloc(n * sizeof(Player));
    // Player p[n];//it declare an array
    while(1){//infinite loop //looping forever 
    int choice;
    printf("Enter choice\n");
    scanf("%d",&choice);
    switch(choice){
        case 1:
        AddPlayers(p,n);
        display(p,n);
        break;
        case 2:
        printf("Remove player\n");
        RemovePlayer(p,&n);
        break;
        case 3: {
        int searchChoice;
        printf("Search Player:\n1. By Name\n2. By Jersey Number\nEnter your choice: ");
        scanf("%d", &searchChoice);
        if (searchChoice == 1) {
        SearchByName(p, &n);
        } else if (searchChoice == 2) {
        SearchByJersyN(p, &n);
        } else {
        printf("Invalid choice\n");
        }
        break;
        }
        case 4:
        sendBirthdayWish(p,&n);
        break;
        case 5:
        printf("updated player info\n");
        updatePlayerInfo(p,&n);
        break;
        case 6:
        DisplayTopThreePlayer(p,&n);;
        break;
        case 7:
        free(p);
        printf("Exiting program\n");
        exit(0);
        break;
        default:
        printf("invalid choice\n");       
       }
    }
}










