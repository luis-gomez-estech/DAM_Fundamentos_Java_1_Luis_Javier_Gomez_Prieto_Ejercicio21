package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Hasta ahora, a la funcion Scanner la llamaba escaner, pero por tener mas claro lo que era, ahora que ya lo tengo, voy a usar sc para abreviar

        System.out.println("Elige una de las opciones siguientes: " + "\n");

        System.out.println("1. Realiza la tarea del ejercicio 5");
        System.out.println("2. Realiza la tarea del ejercicio 6");
        System.out.println("3. Realiza la tarea del ejercicio 7");
        System.out.println("4. Realiza la tarea del ejercicio 8");


        int numero = sc.nextInt();

        // Y dependiendo de la opcion introducida mediante if primeramente compruebo que el digito introducido
        // es una opción correcta, y en caso de que no lo sea imprimo el aviso "Has introducido una opción que no existe"

        if (numero <= 0 || numero > 4) {

            System.out.println("Has introducido una opción que no existe");

            // Pero si la opcion es correcta, con else if dependiendo de si el numero es 1 o 2 o 3 o 4, inicia los ejercicios 5,6,7,8 respectivamente

            // EJERCICIO 5

        } else if (numero == 1) {

            realizaEjercicio5();

            // EJERCICIO 6

        } else if (numero == 2) {

            realizaEjercicio6();

            // EJERCICIO 7

        } else if (numero == 3) {

            realizaEjercicio7();

            // EJERCICIO 8

        } else if (numero == 4) {

            realizaEjercicio8();

        }
    }

    public static void realizaEjercicio5 () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2 = sc.nextInt();
        sc.close();
        //Por tanto si el numero1 es igual al numero2, imprimirá este mensaje en pantalla
        if (numero1 == numero2) {
            System.out.println("Los números introducidos son iguales");

        }  //En caso contrario, imprimirá este mensaje en pantalla

        else {
            System.out.println("Los numeros introducidos no son iguales");

        }
    }

        public static void realizaEjercicio6 () {

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el primer número");
            int numero1 = sc.nextInt();
            System.out.println("Introduce el segundo número");
            int numero2 = sc.nextInt();
            sc.close();
            // Un numero es multiplo de otro cuando el resto de la division es igual a cero
            // Entonces segun he buscado en Google, en Java el resto de una division entre 2 numeros se representa asi, numero1%numero2

            int resto = numero1 % numero2;

            //Por tanto si el resto es igual a cero imprimirá este mensaje en pantalla
            if (resto == 0) {
                System.out.println("El número " + numero1 + " es múltiplo de " + numero2);
            }//y en caso de no ser igual a cero, imprimira este otro mensaje
            else {
                System.out.println("El número " + numero1 + " no es múltiplo de " + numero2);
            }
        }

            public static void realizaEjercicio7 () {

                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce el primer número");
                int numero1 = sc.nextInt();
                System.out.println("Introduce el segundo número");
                int numero2 = sc.nextInt();
                sc.close();

                //Si el  numero1 es mayor que el numero2, imprimirá este mensaje en pantalla
                if (numero1 > numero2) {
                    System.out.println("El número " + numero1 + " es mayor que el " + numero2);
                }

                //Si el  numero1 es igual que el numero2, imprimira este otro mensaje

                else if (numero1 == numero2) {
                    System.out.println("El número " + numero1 + " es igual que el " + numero2);
                }

                //Si el numero1 es menor que el numero2, imprimira este otro mensaje

                else {
                    System.out.println("El número " + numero1 + " es menor que el " + numero2);
                }
            }

                public static void realizaEjercicio8 (){

                    Scanner sc = new Scanner(System.in);
                    System.out.println("Introduce el primer número");
                    int numero1 = sc.nextInt();
                    System.out.println("Introduce el segundo número");
                    int numero2 = sc.nextInt();
                    sc.close();

                    // Si numero1 es mayor que numero2, imprimirá este mensaje en pantalla
                    if (numero1 > numero2) {
                        System.out.println(numero1 + " - " + numero2);

                    }

                    // Si numero1 es igual que numero2 , imprimira este otro mensaje

                    else if (numero1 == numero2) {
                        System.out.println(numero1 + " - " + numero2);

                    }

                    // Si numero1 es menor que numero2 , imprimira este otro mensaje

                    else {
                        System.out.println(numero2 + " - " + numero1);

                    }



                }


}

