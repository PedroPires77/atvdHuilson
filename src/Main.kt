import entidades.Profissional
import entidades.Servico
import enumeradores.Equipamento
import enumeradores.Setor
import enumeradores.Sexo

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val instalacao : Servico = Servico(
        preco = "800.50".toBigDecimal(),
        profissional = Profissional(
            "Joao",
            20,
            123456789,
            Equipamento.MARTELO,
            Sexo.MASCULINO,
            "300.00".toBigDecimal(),
            "muita",
            "bastante",
            setor = Setor.MONTAGEM
        )
    )
    }