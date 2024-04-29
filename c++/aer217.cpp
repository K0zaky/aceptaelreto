#include <iostream>
using namespace std;

int main() {
    int n;
	cin >> n;

    while (n!=0){
        int resto=n%2;

        if (resto==0){
            cout << "DERECHA" << endl;
        }else
            cout << "IZQUIERDA" << endl;
        
        cin >> n;
    }
    
}