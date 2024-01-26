package com.example.bankaccount

class BankAccount(
    var accountHolder:String,
    var balance:Double
    )
{
    private val transactionHistory = mutableListOf<String>()
    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder ha depositado $amount€")
    }

    fun withdraw(amount: Double){
        if(amount <= balance){
            balance -=amount
            transactionHistory.add("$accountHolder ha retirado $amount€")

            println("Aquí tienes tus $amount€, recuerda recoger tu tarjeta, tonto")
        }else{
            println("No tienes suficiente dinero, pobre")
        }
    }

    fun acctBalance(): Double{
        return balance
    }

    fun displayTransactionHistory(){
        println("historial de transacciones de $accountHolder")
        for (transaction in transactionHistory){
            println(transaction)
        }
    }
}