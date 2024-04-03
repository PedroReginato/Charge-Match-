import java.util.Scanner;
public class AtividadeAvaliativaEx1
{
    public static void main (String [] args){
    Scanner in = new Scanner (System.in);

    System.out.println ("Insira somente a hora do inicio da partida");
    int horaInicio = in.nextInt();
    System.out.println ("Insira somente o minuto do incio da partida");
    int minutoInicio = in.nextInt();    
    
    System.out.println ("Insira somente a hora final da partida");
    int horaFinal = in.nextInt();
    System.out.println ("Insira somente o minuto final da partida");
    int minutoFinal = in.nextInt();
    
    int horarioDeInicio = (horaInicio * 60) + minutoInicio;
    int horarioFinal = (horaFinal * 60) + minutoFinal;
    
    int duracaoJogoMinuto = (horarioFinal - horarioDeInicio);
    
    int horaEmInteiro = duracaoJogoMinuto / 60;
    int minutoEmInteiro = duracaoJogoMinuto % 60;
    
    if (minutoEmInteiro > 0){
        System.out.println ("O valor da partida foi de: " + calcularCusto(horaEmInteiro, minutoEmInteiro));
        System.out.println ("Duração total da partida: " + horaEmInteiro + " horas e " + minutoEmInteiro + " minutos");
        System.out.println ("Foi cobrado 1 hora a mais pelo valor cheio de " + (horaEmInteiro + 1) + " horas");
    
    } else {   
        System.out.println ("O valor da partida foi de: " + calcularCusto(horaEmInteiro, minutoEmInteiro));
        System.out.println ("Duração total da partida: " + horaEmInteiro + " horas e " + minutoEmInteiro + " minutos");
    }
}
    public static double calcularCusto (int horaEmInteiro, int minutoEmInteiro){
    
    double valor;

    if (minutoEmInteiro > 0){
    horaEmInteiro = horaEmInteiro + 1;
    
    }if (horaEmInteiro > 3){
    horaEmInteiro = horaEmInteiro * 90;
    valor = horaEmInteiro * 0.9;
    
    } else {
    horaEmInteiro = horaEmInteiro * 90;
    valor = horaEmInteiro;
    }
    
    return valor;
}
}
