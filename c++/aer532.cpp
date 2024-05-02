#include <iostream>
using namespace std;

int main() {
    int n;
    int num1;
    int num2;

    cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> num1;
        cin >> num2;

        int d=num2-num1;

        cout << d << endl;
    }
    return 0;
}