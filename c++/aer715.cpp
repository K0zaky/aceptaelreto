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
        int res = num1/num2;

        if (res>=12) {
            cout << "SI" << endl;
        }else{
            cout << "NO" << endl;
        }
    }
    return 0;
}
