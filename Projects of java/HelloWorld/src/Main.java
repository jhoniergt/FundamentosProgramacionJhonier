import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        Main.Score();
    }

    public static void BasicCalculator() {
        Scanner scanner = new Scanner(System.in); // this is to be able to read input from the user
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);

        int resta = num1 - num2;
        System.out.println("The resta of the two numbers is: " + resta);

        int multiplication = num1 * num2;
        System.out.println("The multiplication of the two numbers is: " + multiplication);

        float division = num1 / num2;
        System.out.println("The division of the two numbers is: " + division);
    }

    public static void CalculateAge() {
        /*2) Crea un programa que solicite la edad del usuario y determine si es mayor de edad (18 años o más).
         el programa debe imprimir un mensaje indicando si el usuario es mayor de edad o no.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int edad = scanner.nextInt();

        if (edad < 18) {
            System.out.println("You're under age");
        } else {
            System.out.println("You're of age");
        }
    }

    /* 3)Km a millas. Este programa debe solicitar al usuario que instroduzca una distancia
       en km y luego debe mostrar la distancia equi/ en millas.*/
    public static void Conversor() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in Km that you want to convert into miles: ");
        int distance = scanner.nextInt();

        float distanceInMiles = distance / (float) 1.60;
        System.out.println("The distance in miles is " + distanceInMiles);
    }

    // 4) Calcular indice masa corporal. Pedir al usuario su masa en kg y altura en metros.
    public static void CalculateBodyMass() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in Kg: ");
        int peso = scanner.nextInt();

        System.out.print("Enter your height in meters: ");
        float height = scanner.nextFloat();

        float Imc = peso / (height * height);
        System.out.println("Your  is body mass index is: " + Imc);

        scanner.close();
    }

    //5) Solicite un numero al usuario y muestre por medio de un mensaje
    // si el numero es positivo, negativo o cero. Además, si es par o impar.


    public static void typeNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Tu numero es 0: ");
        } else if (number > 0) {
            System.out.println("TU numero es mayor que cero");
        } else if (number < 0) {
            System.out.println("Tu numero es menor que cero");
        }

        if (number % 2 == 0) {
            System.out.println("Your number is even");
        } else if (number % 2 == 1) {
            System.out.println("Your number is odd");
        }
    }

    // 6) Desarrolla un programa que pida al usuario el número de un mes
    // (1-12) y muestre el número de días
    //de ese mes. Asume que febrero tiene 28 días.
    // Utiliza una estructura switch para resolverlo.

    public static void CalculateMonthDays(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean sw = true;
        int month = 0;

        while (sw) {// evalua una condicion, si es verdadera, entonces ejecuta el ciclo sino sale del ciclo
            System.out.println("Enter the number of the month : ");
            month = scan.nextInt();
            if (month < 0 || month > 12) {
                System.out.println("¡Error! Se debe ingresar un número entre 1 y 12");
            } else {
                sw = false;
            }
        }

        String date = "";

        switch (month) {
            case 1:
                date = "2024-01-01";
                break;
            case 2:
                date = "2024-02-01";
                break;
            case 3:
                date = "2024-03-01";
                break;
            case 4:
                date = "2024-04-01";
                break;
            case 5:
                date = "2024-05-01";
                break;
            case 6:
                date = "2024-06-01";
                break;
            case 7:
                date = "2024-07-01";
                break;
            case 8:
                date = "2024-08-01";
                break;
            case 9:
                date = "2024-09-01";
                break;
            case 10:
                date = "2024-10-01";
                break;
            case 11:
                date = "2024-11-01";
                break;
            case 12:
                date = "2024-12-01";
                break;
            default:
                System.out.println("Ingreso un numero incorrecto");
        }
        DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate ld = LocalDate.parse(date, formatterDateTime);
        if (month == 2) {
            int monthDays = ld.lengthOfMonth() - 1;
            System.out.println("monthDays: " + monthDays);
        } else {
            int monthDays = ld.lengthOfMonth();
            System.out.println("The number of days of this month is: " + monthDays);
        }
    }

    // Ejercicio 7: Menú Interactivo
    //Implementa un programa que muestre un menú con opciones para realizar diferentes operaciones
    //matemáticas (por ejemplo, sumar, restar, multiplicar, dividir). El usuario debe poder seleccionar una
    //opción ingresando un número, y luego el programa debe pedir los números necesarios para realizar
    //la operación elegida y mostrar el resultado. Utiliza una estructura switch para manejar las opciones
    //del menú.

//    public static void MenuOperaciones (){
//        Scanner scan = new Scanner(System.in);
//        int opcMenuPrincipal = 1;
//        do {
//            System.out.println("Select an option\n" +
//                    "1. Addition\n" +
//                    "2. Subtrac\n" +
//                    "3. Multiply\n" +
//                    "4. Divide\n" +
//                    "5. Exit");
//            opcMenuPrincipal= scan.nextInt();
//
//            switch (opcMenuPrincipal) {
//                case 1:
//                    System.out.println("Enter the first number");
//                    int num1 = scan.nextInt();
//                    System.out.println("Enter the second number");
//                    int num2 = scan.nextInt();
//                    System.out.println("The addicion is: " + ( num1 + num2 ));
//                    break;
//                case 2:
//                    System.out.println("Enter the first number");
//                    int numSub1 = scan.nextInt();
//                    System.out.println("Enter the second number");
//                    int numSub2 = scan.nextInt();
//                    System.out.println("The subtrac is: " + ( numSub1 - numSub2 ));
//                    break;
//                case 3:
//                    System.out.println("Enter the first number");
//                    int numMul1 = scan.nextInt();
//                    System.out.println("Enter the second number");
//                    int numMul2 = scan.nextInt();
//                    System.out.println("The multiply is: " + ( numMul1 * numMul2 ));
//                    break;
//                case 4:
//                    System.out.println("Enter the first number");
//                    int numSplit1 = scan.nextInt();
//                    System.out.println("Enter the second number");
//                    int numSplit2 = scan.nextInt();
//                    if (numSplit2 == 0){
//                        System.out.println("it´s not possible to divide by zero");
//                    }else {
//                        System.out.println("The division is: " + ( numSplit1 / numSplit2 ));
//                    }
//                    break;
//
//                case 5:
//                    opcMenuPrincipal = 0;
//                    break;
//                default:
//                    System.out.println("Error, You entered a invalid number, enter one number in the range at 1 to 5");
//            }
//        } while(opcMenuPrincipal != 0 );
//        System.out.println("See you later");
//
//    }


//8) Escribe un programa que solicite al usuario ingresar tres calificaciones, calcule el promedio y
//muestre un mensaje indicando si el alumno aprueba o no (considera que se aprueba con un
//promedio de 6 o más).


//    public static void MenuInteractivo() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your first score: ");
//        int firstScore = scanner.nextInt();
//        System.out.print("Enter your second score: ");
//        int secondScore = scanner.nextInt();
//        System.out.print("Enter your third score: ");
//        int thirdScore = scanner.nextInt();
//        scanner.close();
//
//        int promedio = (firstScore + secondScore + thirdScore) / 3;
//        if (promedio >= 6) {
//            System.out.println("You passed and this is your average score: " + promedio);
//        } else if (promedio < 6) {
//            System.out.println("You didn't pass because your average score is:  " + promedio);
//        }
//
//    }


// 10) Desarrolla un programa que calcule cuánto dejar de propina en un restaurante.
// El usuario debe ingresar el total de la cuenta y el porcentaje de propina que
// desea dejar. El programa debe mostrar icuánto dinero en propina debe dejar.

    public static void Tips () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the total amount: ");
        float totalAmount = scanner.nextFloat();
        System.out.println("How much porcentage would you like to tip? (betweeen 0 and 100) ");
        float porcentage = scanner.nextFloat();

        float totalAmountTip = totalAmount * (porcentage/100);
        System.out.println("The desired tip amount is: " + totalAmountTip);

    }


    // 11) Ordena tres numeros.
    // public static void rideFare () {
    //        Scanner scanner = new Scanner(System.in);
    //        System.out.println("Please enter your first number: ");
    //        int firstNumber = scanner.nextInt();
    //        System.out.println("Please enter your second number: ");
    //        int secondNumber = scanner.nextInt();
    //        System.out.println("Please enter your third number: ");
    //        int thirdNumber = scanner.nextInt();
    //        int biggest=0, smallest=0, middle=0  ;
    //
    //        if (firstNumber > secondNumber ){ // 7,5,4 - 7,4,5
    //           if (firstNumber > thirdNumber) {
    //               biggest = firstNumber;
    //               if( secondNumber > thirdNumber){
    //                   middle= secondNumber;
    //                   smallest = thirdNumber;
    //               }else {
    //                   middle = thirdNumber;
    //                   smallest = secondNumber;
    //               }
    //           } else {
    //               middle= firstNumber;
    //               biggest = thirdNumber;
    //               smallest = secondNumber;
    //           }
    //
    //        } else if (secondNumber > thirdNumber ){   //  4 5 7 - 4 7 5
    //            biggest = secondNumber;
    //            if (firstNumber > thirdNumber){
    //                middle = firstNumber;
    //                smallest = thirdNumber;
    //            }else {
    //                middle = thirdNumber;
    //                smallest = firstNumber;
    //            }
    //        } else{ //
    //            biggest = thirdNumber;
    //            middle = secondNumber;
    //            smallest = firstNumber;
    //        }
    //        System.out.println(" The biggest is: "+ biggest + " The middle is: " + middle + " The smallest is: " + smallest  );
    //    }


// Ejercicio 12: Generador de Horóscopo
//Implementa un programa que le pida al usuario su mes y día de nacimiento. Luego, basado en esa
//información, muestra su signo del zodíaco. Utiliza una estructura switch para manejar los meses y if
//para los días.

    public static void horoscopo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();
        System.out.print("Enter your birthday (1-31): ");
        int birthDay = scanner.nextInt();

        switch (birthMonth) {
            case 1:
                if (0 < birthDay & birthDay < 20) {
                    System.out.println("Your constellation is Capricorn");
                } else if (birthDay > 20) {
                    System.out.println("Your constellation is Aquarius");
                }
                break;
            case 2:
                if (0 < birthDay & birthDay < 19) {
                    System.out.println("Your constellation is Aquarius");
                } else if (birthDay > 19) {
                    System.out.println("Your constellation is Pisces");
                }
                break;
            case 3:
                if (0 < birthDay & birthDay < 21) {
                    System.out.println("Your constellation is Pisces");
                } else if (birthDay > 20) {
                    System.out.println("Your constellation is Aries");
                }
                break;
            case 4:
                if (0 < birthDay & birthDay < 20) {
                    System.out.println("Your constellation is Aries");
                } else if (birthDay > 19) {
                    System.out.println("Your constellation is Taurus");
                }
                break;
            case 5:
                if (0 < birthDay & birthDay < 21) {
                    System.out.println("Your constellation is Taurus");
                } else if (birthDay > 19) {
                    System.out.println("Your constellation is Gemini");
                }
                break;
            case 6:
                if (0 < birthDay & birthDay < 21) {
                    System.out.println("Your constellation is Geminis");
                } else if (birthDay > 19) {
                    System.out.println("Your constellation is Cancer");
                }
                break;
            case 7:
                if (0 < birthDay & birthDay < 21) {
                    System.out.println("Your constellation is Cancer");
                } else if (birthDay > 19) {
                    System.out.println("Your constellation is Leo");
                }
                break;
            case 8:
                if (0 < birthDay & birthDay < 21) {
                    System.out.println("Your constellation is Leo");
                } else if (birthDay > 19) {
                    System.out.println("Your constellation is Virgo");
                }
                break;
            case 9:
                if (0 < birthDay & birthDay < 21) {
                    System.out.println("Your constellation is Virgo");
                } else if (birthDay > 19) {
                    System.out.println("Your constellation is Libra");
                }
                break;
            case 10:
                if (0 < birthDay & birthDay < 21) {
                    System.out.println("Your constellation is Libra");
                } else if (birthDay > 19) {
                    System.out.println("Your constellation is Scorpio");
                }
                break;
            case 11:
                if (0 < birthDay & birthDay < 21) {
                    System.out.println("Your constellation is Scorpio");
                } else if (birthDay > 19) {
                    System.out.println("Your constellation is Sagittarius");
                }
                break;
            case 12:
                if (0 < birthDay & birthDay < 21) {
                    System.out.println("Your constellation is Sagittarius");
                } else if (birthDay > 19) {
                    System.out.println("Your constellation is Capricorn");
                }
                break;
        }
    }


// Ejercicio 13: Calculadora de Tarifa de Taxi
//Desarrolla un programa que calcule el costo de un viaje en taxi basándose en la distancia del viaje
//(en kilómetros) y la tarifa base. Puedes añadir una tarifa adicional por kilómetro recorrido. El
//usuario debe ingresar la distancia del viaje.

    public static void taxiFare() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your the distance travelled in kilometers: ");
        float distanceTravelled = scanner.nextFloat();

        float totalFare = distanceTravelled * 1000;
        System.out.print("The cost of the ride in Pesos based on the distance travelled is: " + totalFare);
        scanner.close();
    }

    // Ejercicio 14: Convertidor de Temperatura
    //Crea un programa que convierta temperaturas entre grados Celsius y Fahrenheit. El usuario debe
    //poder elegir si quiere convertir de Celsius a Fahrenheit o viceversa, y luego ingresar la temperatura.
    //Utiliza la fórmula C = (F - 32) * 5/9 para Fahrenheit a Celsius y F = C * 9/5 + 32 para Celsius a
    //Fahrenheit.

    public static void temperature() {
        Scanner scan = new Scanner(System.in);
        int tempscale = 1;
        do {
            System.out.println("Select an option\n" +
                    "1. Celsius\n" +
                    "2. Fahrenheit\n" +
                    "3. Exit");
            tempscale = scan.nextInt();

            switch (tempscale) {
                case 1:
                    System.out.println("Enter the temperature in Celsius");
                    float temp1 = scan.nextFloat();
                    float tempFahrenheit = (temp1 * 1.8f) + 32;
                    System.out.println("The temperature in Fahrenheit is: " + tempFahrenheit);
                    break;
                case 2:
                    System.out.println("Enter the temperature in Fahrenheit");
                    float temp2 = scan.nextFloat();
                    float tempCelsius = (temp2 - 32) * 0.55f;
                    System.out.println("The temperature in Celsius is: " + (tempCelsius));
                    break;
                case 3:
                    tempscale = 0;
                    break;
                default:
                    System.out.println("Error, You entered a invalid number, choose either 1 or 2");
            }
        } while (tempscale != 0);
        System.out.println("See you later");

    }

// 15 Implementa un programa que le pida al usuario la calificación de un examen (0-100). Basado en la
//calificación, el programa debe mostrar una letra (A, B, C, D, F), donde A es 90-100, B es 80-89,
//etc. Considera utilizar if o switch.

    public static void Score() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score between 0-100: ");
        int firstScore = scanner.nextInt();

                if (firstScore > 89 & firstScore < 101 ) {
                    System.out.println("Your score is A");
                }
                if (firstScore > 79 & firstScore < 90 ) {
                    System.out.println("Your score is B");
                }
                if (firstScore > 69 & firstScore < 80 ) {
                    System.out.println("Your score is C");
                }
                if (firstScore > 59 & firstScore < 70 ) {
                    System.out.println("Your score is D");
                }

                if (firstScore > 49 & firstScore < 60 ) {
                    System.out.println("Your score is F");
                }
                if (firstScore > 0 & firstScore < 50 ) {
                        System.out.println("You failed your text");
                } else {
                    System.out.println("Please enter a valid number between 0 and 100");
                }

    }


//Ejercicio 18: Juego de piedra, papel o tijera:
//Crear un programa que simule el juego de piedra, papel o tijera
//contra el usuario. Permitir al usuario elegir entre piedra, papel o
//tijera. Determinar el ganador del juego y mostrar el resultado.


    public static void Juego () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to Rock, Scissors and Paper! \n");
        int seleccionComputadora = (int) (Math.random() * 3) + 1;
        System.out.print("Get ready! \n");

        System.out.print("Please select \n 1)Rock \n 2)Paper \n 3)Scissors: ");
        int userselection = scanner.nextInt();

        System.out.println("Computer chose:");
        switch (userselection) {
            case 1:
                System.out.print("Rock\n");
                switch (seleccionComputadora) {
                    case 1:
                        System.out.print("Tie!");
                        break;
                    case 2:
                        System.out.print("Congratulations! You just won");
                        break;
                    case 3:
                        System.out.print("The computer won and you lost!");
                        break;
                }
                break;
            case 2:
                System.out.print("Paper \n");
                switch (seleccionComputadora) {
                    case 1:
                        System.out.print("The computer won and you lost!");
                        break;
                    case 2:
                        System.out.print(" Tie!");
                        break;
                    case 3:
                        System.out.print("Congratulations! You just won!");
                        break;
                }
                break;
            case 3:
                System.out.print("Scissors \n");
                switch (seleccionComputadora) {
                    case 1:
                        System.out.print("Congrats! You just won! ");
                        break;
                    case 2:
                        System.out.print("The computer won and you lost!");
                        break;
                    case 3:
                        System.out.print("Tie!");
                        break;
                }
                break;
        }
    }
    }





















