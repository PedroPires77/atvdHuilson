package entidades

import enumeradores.Equipamento
import enumeradores.Setor
import enumeradores.Sexo
import java.math.BigDecimal

class Profissional (
    nome: String,
    idade: Int,
    cpf: Long,
    val equipamento: Equipamento,
    sexo: Sexo,
    val salario: BigDecimal,
    val experiencia: String,
    val habilidade: String,
    val setor: Setor
) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo
){
    // Comportamentos do Profissional
    fun instalarCaixaDAgua(clt: Profissional) {
        if (clt.setor.equals(Setor.MONTAGEM)) {
            println("Profissinal habilitade")
        } else {
            println("Profissional desqualificado")
        }
    }
        //Comportamento
       override fun receberConta(conta: Conta, aPagar : BigDecimal){
            conta.saldo = conta.saldo.subtract(aPagar)
    }


}