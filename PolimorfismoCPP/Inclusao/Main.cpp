#pragma once

#include "Conta.cpp"
#include "ContaCorrente.cpp"
#include "ContaPoupanca.cpp"
#include "InclusaoConta.cpp"

int main(){
    InclusaoConta inclusao;

    inclusao.incluirTipo(new Conta());
    inclusao.incluirTipo(new ContaCorrente());
    inclusao.incluirTipo(new ContaPoupanca());

    return 0;
}