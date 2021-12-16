package DateAndTime;

/*
Link to see the question:
* https://docs.oracle.com/javase/tutorial/datetime/iso/QandE/questions.html

* Question:
* 1. Write an example that, for a given year, reports the length of each month within that year.
*
* STEPS:
* criar main metodo para iniciar a classe
* criar um metodo para fazer o calculo
* receber um input year e armazenar em uma variavel
* passar a variavel para uma classe Year
* checar se o ano e bissexto ou nao usando o metodo isLeap()
* fazer o calculo dentro de um for - (calcular o numero de dias de cada mes)
* criar um objeto da classe Month e utilizar o metodo of() passando como parametro o valor do i para obter o mes
* utilizar o metodo length passando como parametro o resultado do metodo isLeap()
* imprimir o resultado da quantidade de dias em cada mes do ano
* testar codigo
* */

import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class MonthInYears {
    public static void main(String[] args) {
        Year year = getYear();
        calculateNumbersOfDaysByMonths(year);
    }

    public static Year getYear() {
        Scanner scanner = new Scanner(System.in);
        int inputOfYear = scanner.nextInt();
        Year year = Year.of(inputOfYear);
        return year;
    }

    public static void calculateNumbersOfDaysByMonths(Year year) {
        boolean isLeap = year.isLeap();
        for (int i = 1; i <= 12; i++) {
            Month month = Month.of(i);
            printNumbersOfDaysByMonths(month, isLeap);
        }
    }

    public static void printNumbersOfDaysByMonths(Month month, Boolean isLeap) {
        System.out.println(month + ": " + month.length(isLeap));
    }
}
