#include <iostream>

using namespace std;

int main() {
    int n;
    int m;

    cin >> n;

    for (int i = 0; i < n; ++i) {
        int s = 0;
        int c = 0;
        
        while (cin >> m && m != -1) {
            s += m;
            c++;
        }

        if (s < c) {
            cout << "Timo" << endl;
        } else if (s == c) {
            cout << "Justo" << endl;
        } else {
            cout << "Suerte" << endl;
        }
    }

    return 0;
}
