#include <iostream>
using namespace std;

int main() {
    int n;
    int n1;
    int n2;
    int n3;
    int d;

    cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> n1;
        cin >> n2;
        cin >> n3;

        d=n2*n3;
        if (d>n1){
            cout << "HORAS" << endl;
        }else if(d<n1){
            cout << "ENCENDIDOS" << endl;
        }else cout << "AMBAS" << endl;
        
    }
    return 0;
}