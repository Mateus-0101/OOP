#pragma once

#include "Conta.cpp"

class InclusaoConta{
    public:
        InclusaoConta(){}

        void incluirTipo(Conta* conta){
            conta->tipo();
        }
};
