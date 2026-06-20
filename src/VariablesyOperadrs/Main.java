package VariablesyOperadrs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // ================================
        // 1 DECLARACIÓN Y USO DE VARIABLES
        // ================================

        int edad;
        double salario;
        String nombre;
        boolean esEstudiante;

        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();

        System.out.println("Ingrese su salario:");
        salario = entrada.nextDouble();

        System.out.println("¿Es estudiante? (true/false):");
        esEstudiante = entrada.nextBoolean();

        System.out.println("\n--- Datos Ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("¿Es estudiante?: " + esEstudiante);
      
     // ================================
     // 2️ OPERACIONES MATEMÁTICAS
     // ================================

     System.out.println("\n--- OPERACIONES CON INT ---");

     int num1, num2;

     System.out.println("Ingrese el primer número entero:");
     num1 = entrada.nextInt();

     System.out.println("Ingrese el segundo número entero:");
     num2 = entrada.nextInt();

     System.out.println("Suma: " + (num1 + num2));
     System.out.println("Resta: " + (num1 - num2));
     System.out.println("Multiplicación: " + (num1 * num2));
     System.out.println("División: " + (num1 / num2));

     System.out.println("\nNota: La división entre enteros elimina los decimales.");
        
     System.out.println("\n--- OPERACIONES CON DOUBLE ---");

     double d1, d2;

     System.out.println("Ingrese el primer número decimal:");
     d1 = entrada.nextDouble();

     System.out.println("Ingrese el segundo número decimal:");
     d2 = entrada.nextDouble();

     System.out.println("Suma: " + (d1 + d2));
     System.out.println("Resta: " + (d1 - d2));
     System.out.println("Multiplicación: " + (d1 * d2));
     System.out.println("División: " + (d1 / d2));
     
     System.out.println("\n--- OPERACIONES CON FLOAT ---");

     float f1, f2;

     System.out.println("Ingrese el primer número float:");
     f1 = entrada.nextFloat();

     System.out.println("Ingrese el segundo número float:");
     f2 = entrada.nextFloat();

     System.out.println("Suma: " + (f1 + f2));
     System.out.println("Resta: " + (f1 - f2));
     System.out.println("Multiplicación: " + (f1 * f2));
     System.out.println("División: " + (f1 / f2));
     
     System.out.println("\n--- OPERACIONES CON SHORT ---");

     short s1, s2;

     System.out.println("Ingrese el primer número short:");
     s1 = entrada.nextShort();

     System.out.println("Ingrese el segundo número short:");
     s2 = entrada.nextShort();

     System.out.println("Suma: " + (s1 + s2));
     System.out.println("Resta: " + (s1 - s2));
     System.out.println("Multiplicación: " + (s1 * s2));
     System.out.println("División: " + (s1 / s2));

     System.out.println("\n--- OPERACIONES CON BYTE ---");

     byte b1, b2;

     System.out.println("Ingrese el primer número byte:");
     b1 = entrada.nextByte();

     System.out.println("Ingrese el segundo número byte:");
     b2 = entrada.nextByte();

     System.out.println("Suma: " + (b1 + b2));
     System.out.println("Resta: " + (b1 - b2));
     System.out.println("Multiplicación: " + (b1 * b2));
     System.out.println("División: " + (b1 / b2));
     
  // ================================
  // 3️ OPERACIONES LÓGICAS
  // ================================

  System.out.println("\n--- OPERACIONES LÓGICAS ---");

  int numA, numB;

  System.out.println("Ingrese el primer número:");
  numA = entrada.nextInt();

  System.out.println("Ingrese el segundo número:");
  numB = entrada.nextInt();

  // Comparaciones
  System.out.println("¿El primer número es mayor que el segundo? " + (numA > numB));
  System.out.println("¿El primer número es menor que el segundo? " + (numA < numB));
  System.out.println("¿Ambos números son iguales? " + (numA == numB));

  // Operadores lógicos
  System.out.println("¿Ambos números son mayores que 10? " + (numA > 10 && numB > 10));
  System.out.println("¿Al menos uno es mayor que 10? " + (numA > 10 || numB > 10));
  
//================================
//4️ CLASIFICACIÓN DE EDAD
//================================

System.out.println("\n--- CLASIFICACIÓN DE EDAD ---");

int edadPersona;

System.out.println("Ingrese la edad de la persona:");
edadPersona = entrada.nextInt();

if (edadPersona < 12) {
   System.out.println("Clasificación: Niño");
} else if (edadPersona >= 12 && edadPersona <= 17) {
   System.out.println("Clasificación: Adolescente");
} else if (edadPersona >= 18 && edadPersona <= 59) {
   System.out.println("Clasificación: Adulto");
} else {
   System.out.println("Clasificación: Adulto mayor");
}

//================================
//5️ DÍA DE LA SEMANA
//================================

System.out.println("\n--- DÍA DE LA SEMANA ---");

int numeroDia;

System.out.println("Ingrese un número del 1 al 7:");
numeroDia = entrada.nextInt();

switch (numeroDia) {
 case 1:
     System.out.println("Lunes");
     break;
 case 2:
     System.out.println("Martes");
     break;
 case 3:
     System.out.println("Miércoles");
     break;
 case 4:
     System.out.println("Jueves");
     break;
 case 5:
     System.out.println("Viernes");
     break;
 case 6:
     System.out.println("Sábado");
     break;
 case 7:
     System.out.println("Domingo");
     break;
 default:
     System.out.println("Número inválido");
}

entrada.nextLine();

//================================
//6️ VERIFICACIÓN DE ACCESO
//================================

System.out.println("\n--- VERIFICACIÓN DE ACCESO ---");

String usuarioCorrecto = "angel";
String contraseñaCorrecta = "0905246447";

System.out.println("Ingrese su usuario:");
String usuarioIngresado = entrada.nextLine();

System.out.println("Ingrese su contraseña:");
String contraseñaIngresada = entrada.nextLine();

if (usuarioIngresado.equals(usuarioCorrecto) && contraseñaIngresada.equals(contraseñaCorrecta)) {
 System.out.println("Acceso concedido");
} else if (usuarioIngresado.equals(usuarioCorrecto) && !contraseñaIngresada.equals(contraseñaCorrecta)) {
 System.out.println("Contraseña incorrecta");
} else {
 System.out.println("Usuario no registrado");
}

        entrada.close();
    }
}