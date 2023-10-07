import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Chacabuco 111");
        Direccion direccion2 = new Direccion("orompello 87");
        Direccion direccionTienda1 = new Direccion("o'higgins con Orompello");
        Direccion direccionTienda2 = new Direccion("Outlet san Pedro");

        Cliente cliente1 = new Cliente("Ricardo Charris","22.066.527-5",direccion1);
        Cliente cliente2 = new Cliente("Vicente Ramirez","21.311.079-9", direccion2);

        Articulo pan = new Articulo("Pan Frances",250,100,"Pan estilo frances horneado y preparado en JUMBO");
        Articulo leche = new Articulo("Leche Entera",1000,1000,"Bebida lactea de origen animal, alta en calcio, " +
                "proteinas y nutrientes esenciales para la salud.");
        Articulo huevos = new Articulo("Huevo de gallina",100,60,"Alimento proveniente de las gallinas alto" +
                "en proteina");
        Articulo poleraNike = new Articulo("Polera Nike", 15000,150,"Polera nike negra fabricada con un 70%" +
                " de algodon");
        Articulo zapatosFutbol = new Articulo("zapatos de futbol", 300000, 200,"Zapatillas de futbol marca nike," +
                " modelo nike zoom mercurial vapor 15 PRO FG.");



        System.out.println("COMPRA NUMERO 1");
        OrdenCompra compra1 = new OrdenCompra();
        cliente1.setOrden(compra1);
        compra1.setCliente(cliente1);
        compra1.anadirOrden(pan,10);
        compra1.anadirOrden(leche,3);
        compra1.anadirOrden(huevos,12);
        System.out.println("Estado de la compra: " + compra1.getEstado() );
        System.out.print(compra1.getCliente().getNombre()+" el valor de tu compra es de $"+ compra1.getPorPagar()+"\n");
        Pago billetes1 = new Efectivo(7000, new Date(),compra1);
        float vuelto = ((Efectivo)billetes1).calcDevolucion();
        System.out.print(compra1.pagar(billetes1));
        System.out.print("Tu vuelto es de $"+vuelto+" pesos.\n");
        compra1.setDocumentoTributario(new Boleta("0000456723","21.464.925-k", direccionTienda1,new Date()));
        System.out.println("Estado de la compra: " + compra1.getEstado()+"\n");
        System.out.println(compra1.toString());



        System.out.println("COMPRA NUMERO 2");
        OrdenCompra compra2 = new OrdenCompra();
        cliente2.setOrden(compra2);
        compra2.setCliente(cliente2);
        compra2.anadirOrden(poleraNike,2);
        System.out.println("Estado de la compra: " + compra2.getEstado() );
        System.out.print(compra2.getCliente().getNombre()+" el valor de tu compra es de $"+ compra2.getPorPagar()+"\n");
        Pago tarjetaDebito = new Tarjeta("Debito","4612379",35000,new Date(),compra2);
        ((Tarjeta)tarjetaDebito).verificarPago();
        System.out.print(compra2.pagar(tarjetaDebito));
        compra2.setDocumentoTributario(new Boleta("0000532809","22.066.457-8", direccionTienda2,new Date()));
        System.out.println("Estado de la compra: " + compra2.getEstado()+"\n");
        System.out.println(compra2.toString());



        System.out.println("COMPRA NUMERO 3");
        OrdenCompra compra3 = new OrdenCompra();
        cliente2.setOrden(compra3);
        compra3.setCliente(cliente2);
        compra3.anadirOrden(zapatosFutbol,1);
        System.out.println("Estado de la compra: " + compra3.getEstado() );
        System.out.print(compra3.getCliente().getNombre()+" el valor de tu compra es de $"+ compra3.getPorPagar()+"\n");
        Pago transferencia = new Transferencia(250000, new Date(),"Banco Santander", "6743867-7",compra3);
        ((Transferencia)transferencia).verificarPago();
        System.out.print(compra3.pagar(transferencia));
        Pago montoFaltante = new Efectivo(50000, new Date(),compra3);
        vuelto =((Efectivo)montoFaltante).calcDevolucion();
        System.out.print(compra3.pagar(montoFaltante));
        System.out.println("Tu vuelto es de $"+vuelto+" pesos.");
        compra3.setDocumentoTributario(new Factura("0000812942","15.414.627-8", direccionTienda2, new Date() ));
        System.out.println("Estado de la compra: " + compra3.getEstado()+"\n");
        System.out.println(compra3.toString());
    }
}