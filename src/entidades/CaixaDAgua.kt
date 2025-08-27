package entidades

import enumeradores.Cor
import enumeradores.Material
import java.math.BigDecimal

class CaixaDAgua (
    val material: Material,
    val capacidade: Int,
    val cor: Cor,
    val peso : Double,
    val preco : BigDecimal,
    val altura : Double,
    val profundidade : Double,
    val largura : Double,
    val dimenssao : Array <Double>
)
{


}