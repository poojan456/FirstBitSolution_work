#include <iostream>
#include <string>
using namespace std;

int main() {
    string s = "madam";
    string s2 = "hello";

    string ans = s + s2;  // concatenate using +
    cout << ans << endl;   // madamhello

    // OR you can do
    // s += s2;
    // cout << s << endl;
}

