#include <iostream>
using namespace std;

int main() {
    int n;
    int num1;
    int num2;
    int num3;
    int numc;
    int numt;

    cin >> n;
    for (int i = 0; i < n; ++i) {
        numc = 0;
        numt = 0;
        cin >> num1;
        cin >> num2;
        cin >> num3;
        numc=num2;
        for (int i = 0; i < num1; i++){            
            numt+=numc;
            numc=numc-num3;
        }
        cout << numt << endl;
    }
    return 0;
}