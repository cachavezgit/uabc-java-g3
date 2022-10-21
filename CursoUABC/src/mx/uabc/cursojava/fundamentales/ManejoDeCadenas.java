package mx.uabc.cursojava.fundamentales;

public class ManejoDeCadenas {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(String arg:args){
            sb.append(arg);
        }
        System.out.println(sb);

        double valor1=3.74;
        int valor2=Integer.MAX_VALUE;

        System.out.println(String.format("Los valores fueron %.3f %d ",valor1, valor2));
        System.out.println(String.format("Los valores fueron %d %.3f",valor2, valor1));
    }
}
