package entidades

import enumeradores.Sexo
import java.math.BigDecimal

class Cliente(
    nome: String,
    idade: Int,
    cpf: Long,
    sexo: Sexo,
    val localizacao: String,
    val orcamento: BigDecimal,
    val contato: Int,
    val pedidos: Array<String>,
) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo
){

}