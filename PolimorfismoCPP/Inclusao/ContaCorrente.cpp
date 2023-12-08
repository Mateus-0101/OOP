#pragma once

#include "Conta.cpp"

class ContaCorrente: public Conta{
    public:
        ContaCorrente(){}

        void tipo() override{
            std::cout<<"Conta Corrente"<< std::endl;
        }
};  