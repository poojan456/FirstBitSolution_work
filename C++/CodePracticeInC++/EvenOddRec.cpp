#include <iostream>
using namespace std;

void evenOdd(int n) {
    if (n == 0) {
        cout << "Even";
        return;
    }
    if (n == 1) {
        cout << "Odd";
        return;
    }
    evenOdd(n - 2);   // recursive call
}

int main() {
    int n = 6;
    evenOdd(n);
    return 0;
}

