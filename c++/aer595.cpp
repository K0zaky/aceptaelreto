#include <iostream>
using namespace std;

int main() {
    int n;
    int num1;
    int num2;

    cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> num1;
        num2 = num1 / 100;

        cout << num2 << endl;
    }
    return 0;
}
