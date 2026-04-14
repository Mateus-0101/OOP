#pragma once

#include <iostream>

using namespace std;

class Conta{
    public:
        Conta(){}

        virtual void tipo(){
            std::cout<<"Conta Bancária"<< std::endl;
        }
};