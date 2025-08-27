package entidades

import java.math.BigDecimal

class Conta (
    val titular: Pessoa,
    var saldo: BigDecimal,
    val senha: String,
    val agencia: String,
    val status: String,
    val id: Long, // numero da conta
)
{

}
