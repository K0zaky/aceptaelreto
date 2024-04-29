#include <iostream>
#include <sstream>

using namespace std;

int main() {
    int n;
    string e;
    int num1, num2;

    cin >> n;
    getline(cin, e);

    for (int i = 0; i < n; ++i) {
        getline(cin, e);

        istringstream ss(e);
        char divisor;
        ss >> num1 >> divisor >> num2;

        if (num1 > num2 || num1 == num2) {
            cout << "BIEN" << endl;
        } else {
            cout << "MAL" << endl;
        }
    }
    return 0;
}
