saldoAtual = 100
valor = 100
transacao = 'sacar'

println ("Saldo atual: " + saldoAtual)
println ("Valor da transação: " + valor)
println ("Tipo de transação: " + transacao)

def double sacar(double valor){
	return novoSaldo = saldoAtual - valor
}

def double depositar(double valor){
	return novoSaldo = saldoAtual + valor
}


if(transacao == 'sacar') {
	sacar(valor)
} else {
	depositar(valor)
}

println ("Novo saldo: " + novoSaldo)

lista = ["uma", "dois", "três", "quatro"]
lista.add("cinco")

for(numero in lista) {
	println numero
}

