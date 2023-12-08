#pragma once

#include "Conta.cpp"

class ContaPoupanca: public Conta{
    public:
        ContaPoupanca(){}

        void tipo() override{
            std::cout<<"Conta Poupança"<< std::endl;
        }
};