#include <iostream>
using namespace std;

int main() {
    int n;
    int num1;
    int num2;
    int s;

    cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> num1;
        cin >> num2;

        s=num1+num2;

        if (s>=0){
            cout << "SI" << endl;
        }else{
            cout << "NO" << endl;
        }
    }
    return 0;
}