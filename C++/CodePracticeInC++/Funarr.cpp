#include <iostream>
using namespace std;

void Arr(int a[], int size) {

    cout << "Enter the array:\n";
    for(int i = 0; i < size; i++) {
        cin >> a[i];
    }

    cout << "Array elements are:\n";
    for(int i = 0; i < size; i++) {
        cout << a[i] << " ";
    }
}

int main() {
    int a[5];          // array declared
    Arr(a, 5);         // pass array
    return 0;
}

