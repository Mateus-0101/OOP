#include <iostream>

class Singleton{
    private:
        static Singleton *instancia;
        static int valor;

        Singleton(const int num){
            valor = num;
        }

    public:
    static Singleton *get_instance(const int num){
        if(instancia == nullptr){
            std::cout <<"Criando nova instância..." << std::endl;
            instancia = new Singleton(num);
        }

        std::cout <<"Retornando instância com ID: " << valor << std::endl;
        return instancia;
    }

    void operator = (const Singleton &) = delete;
    Singleton(Singleton &other) = delete;

    void PrintUniqueID(){
        std::cout <<"ID atual da instância: " << this->valor << std::endl;
    }
    
};

Singleton* Singleton::instancia = nullptr;
int Singleton::valor = 0;

int main(){
    Singleton *s1 = Singleton::get_instance(1);
    s1->PrintUniqueID();
    Singleton *s2 = Singleton::get_instance(2);
    s2->PrintUniqueID();
}