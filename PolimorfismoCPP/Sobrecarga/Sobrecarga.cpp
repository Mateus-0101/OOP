#include <iostream>
#include <string>
using namespace std;

class Sobrecarga {
    public:
        Sobrecarga() {}

        int media(int x, int y) {
            return (x + y) / 2;
        }

        double media(double x, double y) {
            return (x + y) / 2;
        }

        float media(float x, float y) {
            return (x + y) / 2;
        }

        int media(std::string x, std::string y) {
            return (std::stoi(x) + std::stoi(y)) / 2;
        }
};

int main(){
    Sobrecarga s;

    cout << s.media(3, 5) << endl;
    cout << s.media(3.5, 5.5) << endl;
    cout << s.media(3.0f, 5.0f) << endl;
    cout << s.media("3", "5") << endl;

    return 0;
}
