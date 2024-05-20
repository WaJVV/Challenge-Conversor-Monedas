import javax.swing.*;
import java.lang.module.ModuleDescriptor;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaAPI consultaAPI = new ConsultaAPI();
        //System.out.println("Escriba el tipo de moneda que desea seleccionar");
        try {

            // var TipoMoneda = lectura.nextLine().toUpperCase();
            CambioMoneda cambioMoneda = consultaAPI.buscarTipoMoneda("USD");
            String Dolar = String.valueOf(cambioMoneda.conversion_rates().get("USD"));
            String pesoChileno = String.valueOf(cambioMoneda.conversion_rates().get("CLP"));
            String realBrasileno= String.valueOf(cambioMoneda.conversion_rates().get("BRL"));
            String colonCostarricense = String.valueOf(cambioMoneda.conversion_rates().get("CRC"));
            String pesoColombiano = String.valueOf(cambioMoneda.conversion_rates().get("CLP"));



            System.out.println("USD valor :" + Dolar);
            System.out.println("CLP valor :" + pesoChileno);
            System.out.println("BRL valor :" +realBrasileno);
            System.out.println("CRC valor :" +colonCostarricense);

            OperacionConversion operacionConversion = new OperacionConversion();




            System.out.println("*****************************");
            System.out.println("Bienvenido al menu de Exchange Bite");
            System.out.println("*****************************\n");
            System.out.println("Seleccione una opcion\n" +
                    "1- Dolares a Peso Chileno  USD >>>>> CLP \n" +
                    "2- Dolares a Real Brasileño  USD >>>>> BRL \n" +
                    "3- Dolares a Colones Costarricense   USD >>>>> CRC\n" +
                    "4- Dolares a Peso Colombiano  USD >>>>> C0P\n" +
                    "5- Peso Chileno a Dolares CLP >>>>> USD\n" +
                    "6- Real Brasileño a Dolares BRL >>>>> USD\n" +
                    "7- Colones Costarricense a Dolares CRC >>>>> USD\n" +
                    "8- Peso Colombiano a Dolares COP >>>>> USD\n" +
                    "9- Salir del sistema\n"
            );

            System.out.println("*****************************");

            //Probando metodos para calcular las monedas
            //System.out.println(operacionConversion.OperacionConversionMultiplicacion(40.00, Double.valueOf(colonCostarricense)));
            //System.out.println(operacionConversion.OperacionConversionDivision(20000.00, Double.valueOf(colonCostarricense) ));

            int opcion = lectura.nextInt();



            while (opcion != 9) {

                if (opcion == 1) {
                    System.out.println("Seleccione el monto a convertir");
                    double montoRequerido = lectura.nextDouble();
                    System.out.println("La conversion de Dolares a Pesos Chilenos equivale a " + operacionConversion.OperacionConversionMultiplicacion(montoRequerido, Double.valueOf(pesoChileno))+ " CLP");
                    //JOptionPane.showMessageDialog(null,"La conversion de Dolares a Pesos Chilenos equivale a " + operacionConversion.OperacionConversionMultiplicacion(montoRequerido, Double.valueOf(pesoChileno))+ " CLP","Conversion Final",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("*****************************");
                    System.out.println("Bienvenido al menu de Exchange Bite");
                    System.out.println("*****************************\n");
                    System.out.println("Seleccione una opcion\n" +
                            "1- Dolares a Peso Chileno  USD >>>>> CLP \n" +
                            "2- Dolares a Real Brasileño  USD >>>>> BRL \n" +
                            "3- Dolares a Colones Costarricense   USD >>>>> CRC\n" +
                            "4- Dolares a Peso Colombiano  USD >>>>> C0P\n" +
                            "5- Peso Chileno a Dolares CLP >>>>> USD\n" +
                            "6- Real Brasileño a Dolares BRL >>>>> USD\n" +
                            "7- Colones Costarricense a Dolares CRC >>>>> USD\n" +
                            "8- Peso Colombiano a Dolares COP >>>>> USD\n" +
                            "9- Salir del sistema\n"
                    );
                    opcion = lectura.nextInt();

                } else if (opcion == 2) {
                    System.out.println("Seleccione el monto a convertir");
                    double montoRequerido = lectura.nextDouble();
                    System.out.println("La conversion de Dolares a Reales brasileños equivale a " +operacionConversion.OperacionConversionMultiplicacion(montoRequerido, Double.valueOf(realBrasileno))+ " BRL");
                    //JOptionPane.showMessageDialog(null,"La conversion de Dolares a Reales brasileños equivale a " +operacionConversion.OperacionConversionMultiplicacion(montoRequerido, Double.valueOf(realBrasileno))+ " BRL","Conversion Final",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("*****************************");
                    System.out.println("Bienvenido al menu de Exchange Bite");
                    System.out.println("*****************************\n");
                    System.out.println("Seleccione una opcion\n" +
                            "1- Dolares a Peso Chileno  USD >>>>> CLP \n" +
                            "2- Dolares a Real Brasileño  USD >>>>> BRL \n" +
                            "3- Dolares a Colones Costarricense   USD >>>>> CRC\n" +
                            "4- Dolares a Peso Colombiano  USD >>>>> C0P\n" +
                            "5- Peso Chileno a Dolares CLP >>>>> USD\n" +
                            "6- Real Brasileño a Dolares BRL >>>>> USD\n" +
                            "7- Colones Costarricense a Dolares CRC >>>>> USD\n" +
                            "8- Peso Colombiano a Dolares COP >>>>> USD\n"+
                            "9- Salir del sistema\n"
                    );
                    opcion = lectura.nextInt();
                } else if (opcion == 3) {
                    System.out.println("Seleccione el monto a convertir");
                    double montoRequerido = lectura.nextDouble();
                    System.out.println("La conversion de Dolares a Colones Costarricenses equivale a " +operacionConversion.OperacionConversionMultiplicacion(montoRequerido, Double.valueOf(colonCostarricense)) + " CRC");
                    //JOptionPane.showMessageDialog(null,"La conversion de Dolares a Colones Costarricenses equivale a " +operacionConversion.OperacionConversionMultiplicacion(montoRequerido, Double.valueOf(colonCostarricense)) + " CRC","Conversion Final",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("*****************************");
                    System.out.println("Bienvenido al menu de Exchange Bite");
                    System.out.println("*****************************\n");
                    System.out.println("Seleccione una opcion\n" +
                            "1- Dolares a Peso Chileno  USD >>>>> CLP \n" +
                            "2- Dolares a Real Brasileño  USD >>>>> BRL \n" +
                            "3- Dolares a Colones Costarricense   USD >>>>> CRC\n" +
                            "4- Dolares a Peso Colombiano  USD >>>>> C0P\n" +
                            "5- Peso Chileno a Dolares CLP >>>>> USD\n" +
                            "6- Real Brasileño a Dolares BRL >>>>> USD\n" +
                            "7- Colones Costarricense a Dolares CRC >>>>> USD\n" +
                            "8- Peso Colombiano a Dolares COP >>>>> USD\n"+
                            "9- Salir del sistema\n"
                    );
                    opcion = lectura.nextInt();
                } else if (opcion == 4) {

                    System.out.println("Seleccione el monto a convertir");
                    double montoRequerido = lectura.nextDouble();
                    System.out.println("La conversion de Dolares a Pesos Colombianos equivale a " + operacionConversion.OperacionConversionMultiplicacion(montoRequerido, Double.valueOf(pesoColombiano))+" C0P");
                    //JOptionPane.showMessageDialog(null,"La conversion de Dolares a Pesos Colombianos equivale a " + operacionConversion.OperacionConversionMultiplicacion(montoRequerido, Double.valueOf(pesoColombiano))+" C0P","Conversion Final",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("*****************************");
                    System.out.println("Bienvenido al menu de Exchange Bite");
                    System.out.println("*****************************\n");
                    System.out.println("Seleccione una opcion\n" +
                            "1- Dolares a Peso Chileno  USD >>>>> CLP \n" +
                            "2- Dolares a Real Brasileño  USD >>>>> BRL \n" +
                            "3- Dolares a Colones Costarricense   USD >>>>> CRC\n" +
                            "4- Dolares a Peso Colombiano  USD >>>>> C0P\n" +
                            "5- Peso Chileno a Dolares CLP >>>>> USD\n" +
                            "6- Real Brasileño a Dolares BRL >>>>> USD\n" +
                            "7- Colones Costarricense a Dolares CRC >>>>> USD\n" +
                            "8- Peso Colombiano a Dolares COP >>>>> USD\n"+
                            "9- Salir del sistema\n"
                    );
                    opcion = lectura.nextInt();
                }else if (opcion == 5){

                    System.out.println("Seleccione el monto a convertir");
                    double montoRequerido = lectura.nextDouble();
                    System.out.println("La conversion de Pesos Chilenos a Dolares equivale a " +operacionConversion.OperacionConversionDivision(montoRequerido, Double.valueOf(pesoChileno))+ " USD");
                    //JOptionPane.showMessageDialog(null,"La conversion de Pesos Chilenos a Dolares equivale a " +operacionConversion.OperacionConversionDivision(montoRequerido, Double.valueOf(pesoChileno))+ " USD", "Conversion Final",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("*****************************");
                    System.out.println("Bienvenido al menu de Exchange Bite");
                    System.out.println("*****************************\n");
                    System.out.println("Seleccione una opcion\n" +
                            "1- Dolares a Peso Chileno  USD >>>>> CLP \n" +
                            "2- Dolares a Real Brasileño  USD >>>>> BRL \n" +
                            "3- Dolares a Colones Costarricense   USD >>>>> CRC\n" +
                            "4- Dolares a Peso Colombiano  USD >>>>> C0P\n" +
                            "5- Peso Chileno a Dolares CLP >>>>> USD\n" +
                            "6- Real Brasileño a Dolares BRL >>>>> USD\n" +
                            "7- Colones Costarricense a Dolares CRC >>>>> USD\n" +
                            "8- Peso Colombiano a Dolares COP >>>>> USD\n"+
                            "9- Salir del sistema\n"
                    );
                    opcion = lectura.nextInt();
                }else if (opcion == 6) {

                    System.out.println("Seleccione el monto a convertir");
                    double montoRequerido = lectura.nextDouble();
                    System.out.println("La conversion de Reales Brasileños a Dolares equivale a " + operacionConversion.OperacionConversionDivision(montoRequerido, Double.valueOf(realBrasileno)) + " USD");
                    //JOptionPane.showMessageDialog(null,"La conversion de Reales Brasileños a Dolares equivale a " + operacionConversion.OperacionConversionDivision(montoRequerido, Double.valueOf(realBrasileno)) + " USD","Conversion Final",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("*****************************");
                    System.out.println("Bienvenido al menu de Exchange Bite");
                    System.out.println("*****************************\n");
                    System.out.println("Seleccione una opcion\n" +
                            "1- Dolares a Peso Chileno  USD >>>>> CLP \n" +
                            "2- Dolares a Real Brasileño  USD >>>>> BRL \n" +
                            "3- Dolares a Colones Costarricense   USD >>>>> CRC\n" +
                            "4- Dolares a Peso Colombiano  USD >>>>> C0P\n" +
                            "5- Peso Chileno a Dolares CLP >>>>> USD\n" +
                            "6- Real Brasileño a Dolares BRL >>>>> USD\n" +
                            "7- Colones Costarricense a Dolares CRC >>>>> USD\n" +
                            "8- Peso Colombiano a Dolares COP >>>>> USD\n"+
                            "9- Salir del sistema\n"
                    );
                    opcion = lectura.nextInt();
                }else if (opcion == 7) {

                    System.out.println("Seleccione el monto a convertir");
                    double montoRequerido = lectura.nextDouble();
                    System.out.println("La conversion de Colones Costarrisences a Dolares equivale a " +operacionConversion.OperacionConversionDivision(montoRequerido, Double.valueOf(colonCostarricense))+ " USD");
                    //JOptionPane.showMessageDialog(null,"La conversion de Colones Costarrisences a Dolares equivale a " +operacionConversion.OperacionConversionDivision(montoRequerido, Double.valueOf(colonCostarricense))+ " USD","Conversion Final",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("*****************************");
                    System.out.println("Bienvenido al menu de Exchange Bite");
                    System.out.println("*****************************\n");
                    System.out.println("Seleccione una opcion\n" +
                            "1- Dolares a Peso Chileno  USD >>>>> CLP \n" +
                            "2- Dolares a Real Brasileño  USD >>>>> BRL \n" +
                            "3- Dolares a Colones Costarricense   USD >>>>> CRC\n" +
                            "4- Dolares a Peso Colombiano  USD >>>>> C0P\n" +
                            "5- Peso Chileno a Dolares CLP >>>>> USD\n" +
                            "6- Real Brasileño a Dolares BRL >>>>> USD\n" +
                            "7- Colones Costarricense a Dolares CRC >>>>> USD\n" +
                            "8- Peso Colombiano a Dolares COP >>>>> USD\n"+
                            "9- Salir del sistema\n"
                    );
                    opcion = lectura.nextInt();
                }else if (opcion == 8) {

                    System.out.println("Seleccione el monto a convertir");
                    double montoRequerido = lectura.nextDouble();
                    System.out.println("La conversion de Pesos colombianos a dolares equivale a " +operacionConversion.OperacionConversionDivision(montoRequerido, Double.valueOf(pesoColombiano)) + " USD");
                    //JOptionPane.showMessageDialog(null,"La conversion de Pesos colombianos a dolares equivale a " +operacionConversion.OperacionConversionDivision(montoRequerido, Double.valueOf(pesoColombiano)) + " USD","Conversion Final",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("*****************************");
                    System.out.println("Bienvenido al menu de Exchange Bite");
                    System.out.println("*****************************\n");
                    System.out.println("Seleccione una opcion\n" +
                            "1- Dolares a Peso Chileno  USD >>>>> CLP \n" +
                            "2- Dolares a Real Brasileño  USD >>>>> BRL \n" +
                            "3- Dolares a Colones Costarricense   USD >>>>> CRC\n" +
                            "4- Dolares a Peso Colombiano  USD >>>>> C0P\n" +
                            "5- Peso Chileno a Dolares CLP >>>>> USD\n" +
                            "6- Real Brasileño a Dolares BRL >>>>> USD\n" +
                            "7- Colones Costarricense a Dolares CRC >>>>> USD\n" +
                            "8- Peso Colombiano a Dolares COP >>>>> USD\n"+
                            "9- Salir del sistema\n"
                    );
                    opcion = lectura.nextInt();

                }

            }
            System.out.println("Saliste del programa correctamente");



        }catch (Exception e){
            e.getMessage();
        }






    }




}