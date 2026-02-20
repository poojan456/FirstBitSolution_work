#include <iostream>
#include <vector>
#include <string>
using namespace std;

struct Player {
    int id;
    string name;
    int age;
    string team;
    int score;
};

vector<Player> players;

void addPlayer() {
    Player p;
    cout << "Enter ID: ";
    cin >> p.id;
    cout << "Enter Name: ";
    cin >> p.name;
    cout << "Enter Age: ";
    cin >> p.age;
    cout << "Enter Team: ";
    cin >> p.team;
    cout << "Enter Score: ";
    cin >> p.score;

    players.push_back(p);
    cout << "Player added successfully!\n";
}

void viewPlayers() {
    if (players.empty()) {
        cout << "No players available.\n";
        return;
    }

    for (int i = 0; i < players.size(); i++) {
        cout << "\nID: " << players[i].id;
        cout << "\nName: " << players[i].name;
        cout << "\nAge: " << players[i].age;
        cout << "\nTeam: " << players[i].team;
        cout << "\nScore: " << players[i].score << endl;
    }
}

void searchPlayer() {
    int searchId;
    cout << "Enter Player ID to search: ";
    cin >> searchId;

    for (int i = 0; i < players.size(); i++) {
        if (players[i].id == searchId) {
            cout << "Player found!\n";
            cout << "Name: " << players[i].name << endl;
            cout << "Age: " << players[i].age << endl;
            cout << "Team: " << players[i].team << endl;
            cout << "Score: " << players[i].score << endl;
            return;
        }
    }
    cout << "Player not found!\n";
}

void updatePlayer() {
    int updateId;
    cout << "Enter Player ID to update: ";
    cin >> updateId;

    for (int i = 0; i < players.size(); i++) {
        if (players[i].id == updateId) {
            cout << "Enter new Name: ";
            cin >> players[i].name;
            cout << "Enter new Age: ";
            cin >> players[i].age;
            cout << "Enter new Team: ";
            cin >> players[i].team;
            cout << "Enter new Score: ";
            cin >> players[i].score;
            cout << "Player updated successfully!\n";
            return;
        }
    }
    cout << "Player not found!\n";
}

void deletePlayer() {
    int deleteId;
    cout << "Enter Player ID to delete: ";
    cin >> deleteId;

    for (int i = 0; i < players.size(); i++) {
        if (players[i].id == deleteId) {
            players.erase(players.begin() + i);
            cout << "Player deleted successfully!\n";
            return;
        }
    }
    cout << "Player not found!\n";
}

int main() {
    int choice;

    do {
        cout << "\n===== Player Management System =====";
        cout << "\n1. Add Player";
        cout << "\n2. View Players";
        cout << "\n3. Search Player";
        cout << "\n4. Update Player";
        cout << "\n5. Delete Player";
        cout << "\n6. Exit";
        cout << "\nEnter choice: ";
        cin >> choice;

        switch (choice) {
            case 1: addPlayer(); break;
            case 2: viewPlayers(); break;
            case 3: searchPlayer(); break;
            case 4: updatePlayer(); break;
            case 5: deletePlayer(); break;
            case 6: cout << "Exiting...\n"; break;
            default: cout << "Invalid choice\n";
        }

    } while (choice != 6);

    return 0;
}


