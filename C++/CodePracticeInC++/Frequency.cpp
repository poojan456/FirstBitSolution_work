#include <iostream>
using namespace std;

int main() {
    int a[] = {1, 2, 2, 3, 1, 4, 5};
    int n = 7;

    for (int i = 0; i < n; i++) {
        int count = 0;

        // check if element was already counted
        bool alreadyCounted = false;
        for (int k = 0; k < i; k++) {
            if (a[k] == a[i]) {
                alreadyCounted = true;
                break;
            }
        }
        if (alreadyCounted) continue;

        // count frequency
        for (int j = 0; j < n; j++) {
            if (a[j] == a[i]) count++;
        }

        cout << a[i] << " occurs " << count << " times" << endl;
    }
}

