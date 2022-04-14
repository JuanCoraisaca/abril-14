/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ups.edu.ec.auto;

/**
 *
 * @author PC-12
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");

        var autoJuan = new Auto();
        autoJuan.color = "amarillo";
        autoJuan.marca = "chevrolet";
        autoJuan.year = 2015;
        autoJuan.placa = "ABB 0102";
        autoJuan.precio = 5000;

        System.out.println(autoJuan.color + " | "
                + autoJuan.marca + " | "
                + autoJuan.year + " | "
                + autoJuan.precio + " | "
                + autoJuan.precio + " | ");

        ////System.out.println("Es taxi;"+autoJuan.esTaxi());
        var esTaxi = false;
        esTaxi = autoJuan.esTaxi();
        if (esTaxi == true) {
            System.out.println("El auto de placa" + autoJuan.placa + " es un taxi");
        } else {
            System.out.println("El auto de placa" + autoJuan.placa + " NO es un taxi");
        }

        System.out.println(" El auto de precio " + autoJuan.precio + " Debe pagar de tasa solidaria " + autoJuan.calcularTasaSolidaria());

        var autoLuis = new Auto();
        autoLuis.color = "Blanco";
        autoLuis.marca = "Toyota";
        autoLuis.year = 2019;
        autoLuis.placa = "ABD 567";
        autoLuis.precio = 9000;

        System.out.println(autoLuis.color + " | "
                + autoLuis.marca + " | "
                + autoLuis.year + " | "
                + autoLuis.precio + " | "
                + autoLuis.placa + " | ");

        esTaxi = autoLuis.esTaxi();
        if (esTaxi == true) {
            System.out.println("El auto de placa" + autoLuis.placa + " es un taxi");
        } else {
            System.out.println("El auto de placa" + autoLuis.placa + " NO es un taxi");
        }
        System.out.println("El auto de precio " + autoLuis.precio + " Debe pagar de tasa solidaria " + autoLuis.calcularTasaSolidaria());
        System.out.println("El año actual del vehiculo es: " + autoJuan.calcularYear(2022));
        System.out.println("El año actual del vehiculo es: " + autoLuis.calcularYear(2022));

        System.out.println("El auto se puede asegurar: " + autoJuan.sePuedeAsegurar(2022, 6));
        System.out.println("El auto se puede asegurar: " + autoLuis.sePuedeAsegurar(2022, 5));

        var auto = new Auto();
        auto.color = "Blnco";
        auto.marca = "Chevrolet";
        auto.placa = "ADH";
        auto.precio = 13000;
        auto.year = 2016;
        var propietario = new Propietario();
        propietario.nombre = "Pedro";
        propietario.direccion = "Paris y Oslo";
        propietario.telefono = "0984357604";
        auto.unPropietario = propietario;

        System.out.println("EL DUEÑO DEL AUTO DE PLACA ES " + auto.placa);
    }
}
