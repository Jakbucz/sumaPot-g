import java.util.Scanner;

  class Main {
  
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj liczbę: ");
    int a = scanner.nextInt();

    System.out.print("Podaj następną liczbę: ");
    int b = scanner.nextInt();

    int potega1 = (int)Math.pow(a,b);
    int potega2 = (int)Math.pow(b,a);
    
    
    int suma_poteg = potega1 + potega2;

    System.out.print("Suma poteg " + suma_poteg);
  }
  }
    