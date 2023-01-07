package cap3

fun main() {
    var precoProduto = 100.0
    println("Valor para faixa1:")
    println("R$ " + (precoProduto + (precoProduto * TaxEnum.FAIXA1.valor)))

    println("Valor para faixa2:")
    println("R$ " + (precoProduto + (precoProduto * TaxEnum.FAIXA2.valor)))

    println("Valor para faixa3:")
    println("R$ " + (precoProduto + (precoProduto * TaxEnum.FAIXA3.valor)))

    println("Status do pagamento: ${StatusEnum.APPROVED}")
    println("Status do pagamento: ${StatusEnum.REPROVED}")
    println("Status do pagamento: ${StatusEnum.PENDING}")
}