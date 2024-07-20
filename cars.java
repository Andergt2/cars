public class Vehiculo {
    private double valor;
    private boolean esServicioPublico;
    private boolean aplicaProntoPago;
    private boolean aplicaTrasladoCuenta;

    public Vehiculo(double valor, boolean esServicioPublico, boolean aplicaProntoPago, boolean aplicaTrasladoCuenta) {
        this.valor = valor;
        this.esServicioPublico = esServicioPublico;
        this.aplicaProntoPago = aplicaProntoPago;
        this.aplicaTrasladoCuenta = aplicaTrasladoCuenta;
    }

    public double getValor() {
        return valor;
    }

    public boolean isEsServicioPublico() {
        return esServicioPublico;
    }

    public boolean isAplicaProntoPago() {
        return aplicaProntoPago;
    }

    public boolean isAplicaTrasladoCuenta() {
        return aplicaTrasladoCuenta;
    }
}

public class CalculadorImpuestos {
    private double descuentoProntoPago;
    private double descuentoServicioPublico;
    private double descuentoTrasladoCuenta;

    public CalculadorImpuestos(double descuentoProntoPago, double descuentoServicioPublico, double descuentoTrasladoCuenta) {
        this.descuentoProntoPago = descuentoProntoPago;
        this.descuentoServicioPublico = descuentoServicioPublico;
        this.descuentoTrasladoCuenta = descuentoTrasladoCuenta;
    }

    public double calcularImpuesto(Vehiculo vehiculo) {
        double valorInicial = vehiculo.getValor();

        // Aplicar descuento por pronto pago
        double valorConDescuentoProntoPago = valorInicial;
        if (vehiculo.isAplicaProntoPago()) {
            valorConDescuentoProntoPago *= (1 - descuentoProntoPago);
        }

        // Aplicar descuento por servicio público
        double valorConDescuentoServicioPublico = valorConDescuentoProntoPago;
        if (vehiculo.isEsServicioPublico()) {
            valorConDescuentoServicioPublico -= descuentoServicioPublico;
        }

        // Aplicar descuento por traslado de cuenta
        double valorFinal = valorConDescuentoServicioPublico;
        if (vehiculo.isAplicaTrasladoCuenta()) {
            valorFinal *= (1 - descuentoTrasladoCuenta);
        }

        return valorFinal;
    }

    public static void main(String[] args) {
        // Parámetros de descuentos
        double descuentoProntoPago = 0.10; // 10%
        double descuentoServicioPublico = 500; // Valor fijo
        double descuentoTrasladoCuenta = 0.15; // 15%

        // Crear instancia del calculador de impuestos
        CalculadorImpuestos calculador = new CalculadorImpuestos(descuentoProntoPago, descuentoServicioPublico, descuentoTrasladoCuenta);

        // Crear instancia de un vehículo
        Vehiculo vehiculo = new Vehiculo(20000, true, true, true);

        // Calcular el impuesto
        double valorImpuesto = calculador.calcularImpuesto(vehiculo);
        System.out.println("El valor del impuesto del vehículo es: " + valorImpuesto);
    }
}
public class Vehiculo {
    private double valor;
    private boolean esServicioPublico;
    private boolean aplicaProntoPago;
    private boolean aplicaTrasladoCuenta;

    public Vehiculo(double valor, boolean esServicioPublico, boolean aplicaProntoPago, boolean aplicaTrasladoCuenta) {
        this.valor = valor;
        this.esServicioPublico = esServicioPublico;
        this.aplicaProntoPago = aplicaProntoPago;
        this.aplicaTrasladoCuenta = aplicaTrasladoCuenta;
    }

    public double getValor() {
        return valor;
    }

    public boolean isEsServicioPublico() {
        return esServicioPublico;
    }

    public boolean isAplicaProntoPago() {
        return aplicaProntoPago;
    }

    public boolean isAplicaTrasladoCuenta() {
        return aplicaTrasladoCuenta;
    }
}

public class CalculadorImpuestos {
    private double descuentoProntoPago;
    private double descuentoServicioPublico;
    private double descuentoTrasladoCuenta;

    public CalculadorImpuestos(double descuentoProntoPago, double descuentoServicioPublico, double descuentoTrasladoCuenta) {
        this.descuentoProntoPago = descuentoProntoPago;
        this.descuentoServicioPublico = descuentoServicioPublico;
        this.descuentoTrasladoCuenta = descuentoTrasladoCuenta;
    }

    public double calcularImpuesto(Vehiculo vehiculo) {
        double valorInicial = vehiculo.getValor();

        // Aplicar descuento por pronto pago
        double valorConDescuentoProntoPago = valorInicial;
        if (vehiculo.isAplicaProntoPago()) {
            valorConDescuentoProntoPago *= (1 - descuentoProntoPago);
        }

        // Aplicar descuento por servicio público
        double valorConDescuentoServicioPublico = valorConDescuentoProntoPago;
        if (vehiculo.isEsServicioPublico()) {
            valorConDescuentoServicioPublico -= descuentoServicioPublico;
        }

        // Aplicar descuento por traslado de cuenta
        double valorFinal = valorConDescuentoServicioPublico;
        if (vehiculo.isAplicaTrasladoCuenta()) {
            valorFinal *= (1 - descuentoTrasladoCuenta);
        }

        return valorFinal;
    }

    public static void main(String[] args) {
        // Parámetros de descuentos
        double descuentoProntoPago = 0.10; // 10%
        double descuentoServicioPublico = 500; // Valor fijo
        double descuentoTrasladoCuenta = 0.15; // 15%

        // Crear instancia del calculador de impuestos
        CalculadorImpuestos calculador = new CalculadorImpuestos(descuentoProntoPago, descuentoServicioPublico, descuentoTrasladoCuenta);

        // Crear instancia de un vehículo
        Vehiculo vehiculo = new Vehiculo(20000, true, true, true);

        // Calcular el impuesto
        double valorImpuesto = calculador.calcularImpuesto(vehiculo);
        System.out.println("El valor del impuesto del vehículo es: " + valorImpuesto);
    }
}
