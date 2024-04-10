/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algoritmos.Presentation;

import com.algoritmos.Domain.Client;
import com.algoritmos.logic.Log;
import com.algoritmos.logic.SavingAccount;
import com.algoritmos.logic.checkingAccount;

public class LogTesting {

    public void test() {

        Client clients[] = new Client[10];

        Client client1 = new Client("7-0309-0943", "joaquin", "83362504", "limoncito");
        Client client2 = new Client("7-0309-0943", "joaquin", "83362504", "limoncito");

        Client client3 = new Client("7-9876-5432", "Pedro", "98765432", "Avenida Central");
        Client client4 = new Client("7-5555-5555", "Luisa", "55555555", "Calle Secundaria");
        Client client5 = new Client("7-4444-4444", "Carlos", "44444444", "Avenida Norte");
        Client client6 = new Client("7-8888-8888", "Ana", "88888888", "Calle Sur");
        Client client7 = new Client("7-6666-6666", "Laura", "66666666", "Avenida Este");

        // Guardar clientes en el arreglo
        clients[0] = client1;
        clients[1] = client2;
        clients[2] = client3;
        clients[3] = client4;
        clients[4] = client5;
        clients[5] = client6;
        clients[6] = client7;

        //crear cuenta corriente y blanace final
        SavingAccount account1 = new SavingAccount();
        SavingAccount account2= new SavingAccount("15/3/2024", 
                12, 5, "1231331", 20000, client1);
        checkingAccount account3 = new checkingAccount(7, "1231331", 2000, client3);
//SavingAccount account1 = new SavingAccount(clients[0]);
checkingAccount account4 = new checkingAccount(7, "1231331", 2000, client4);
SavingAccount account5 = new SavingAccount("13/2/2023",4,6,"3467532",23467,client5);
checkingAccount account6 = new checkingAccount(5, "234567", 1500, client6);
SavingAccount account7 = new SavingAccount("25/7/2000",6,9,"534131",30000,client7);

        Log log[] = new Log[7];
        log[0] = new Log(1, " CheckingAccount", account2, 7000);
        log[1] = new Log(2, " SavingAccount", account5, 8000);
         log[2] = new Log(3, " CheckingAccount", account3, 14000);
        log[3] = new Log(4, " SavingAccount", account7, 9000);
        
        //Log[1] = new LogTesting(1, "Saving Amount", account1, 7000);

        for (int i = 0; i < log.length; i++) {
            if (log[i] != null) {
                System.out.println((log[i].toString()));
            }

        }

    }

}
