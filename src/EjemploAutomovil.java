import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru  = new Automovil("Subaru","Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.CONVERTIBLE);

        Automovil mazda  = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan  = new Automovil("Nissan", "Navara",Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL),new Estanque(50));
        nissan.setTipo(TipoAutomovil.COUPE);

        Automovil nissan2 = new Automovil("Nissan", "Navara",Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA),new Estanque(50));
        nissan2.setTipo(TipoAutomovil.FURGON);

        Automovil auto = new Automovil();
        Date fecha = new Date();
        System.out.println(nissan);
        System.out.println(nissan.toString());
        System.out.println("=======================================");
        System.out.println("Comparando diferentes objetos " + auto.equals(fecha));
        System.out.println("Restringiendo nulos en equals " + auto.equals(nissan));
        System.out.println("=======================================");
        System.out.println("Son iguales == " + (nissan == nissan2));
        System.out.println("Son iguales equeals " + (nissan.equals(nissan2)));
        System.out.println("=======================================");
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());
        System.out.println("=======================================");
        System.out.println(subaru.detalle());
        System.out.println("=======================================");
        System.out.println(mazda.detalle());
        System.out.println("=======================================");
        System.out.println(nissan.detalle());
        System.out.println("=======================================");
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println("=======================================");
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("=======================================");
        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300,0.6F));
        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300,60));
        System.out.println("Kilometros por litro " + nissan.calcularConsumo(300,60));




    }
}
