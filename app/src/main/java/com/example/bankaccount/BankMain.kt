package com.example.bankaccount

fun main(){
    val daniBankAccount = BankAccount("Dani Fernandez", 4.0 )
    daniBankAccount.deposit(50.0)
    daniBankAccount.deposit(20.0)
    daniBankAccount.withdraw(8.0)
    daniBankAccount.deposit(10.0)
    daniBankAccount.displayTransactionHistory()
    println("Tienes ${daniBankAccount.acctBalance()}€")

    val sarahBankAccount = BankAccount("Sarah", 5.0)
    sarahBankAccount.deposit(100.0)
    sarahBankAccount.deposit(50.0)
    sarahBankAccount.withdraw(8.0)
    println("Tienes ${sarahBankAccount.acctBalance()}€")

}