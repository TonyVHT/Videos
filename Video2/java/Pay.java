//Es un ejemplo de las posibles soluciones, por favor intenten hacerlo por su cuenta
public class Pay{
    public static void main(String[] args) {
        double salario = totalPay(9, 41);
        if(salario >= 0){
            System.out.println("El salario es de " +  salario);
        }else{
            System.out.println("Favor introduce valores validos");
        }
    }
    public static double totalPay(double basePay, double hours){
        final double REMUNERACION = 1.5;
        final int MIN_HOURS = 0;
        final int MAX_HOURS =61;
        final double MIN_BASE_PAY = 8;
        final int NORMAL_HOURS = 40;
        if(basePay < MIN_BASE_PAY) return -1;
        if(hours > MIN_HOURS && hours < MAX_HOURS){
            if(hours > NORMAL_HOURS){
                double overtimeHours = hours - NORMAL_HOURS;
                return basePay * (NORMAL_HOURS + overtimeHours * REMUNERACION);
            }else{
                return basePay * hours;
            }
        }else{  
            return -1;
        }
    }
}