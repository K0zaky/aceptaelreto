#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int main() {
    int n;
    string n1;
    string n2;

    cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> n1;
        cin >> n2;

        std::sort(n1.begin(), n1.end());
        std::sort(n2.begin(), n2.end());

        if (n1==n2){
            cout << "GANA" << endl;
        }else{
            cout << "PIERDE" << endl;
        }
    }
    return 0;
}
