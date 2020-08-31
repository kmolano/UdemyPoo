
public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        
        Automovil.setCapacidadEsTanqueStatico(45);
        Automovil subaru  = new Automovil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHABACK);


        Automovil mazda  = new Automovil("Mazda","BT-50",Color.ROJO,3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan  = new Automovil("Nissan", "Navara",Color.GRIS,3.5,50);
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan2", "Navara",Color.GRIS,3.5,50);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        nissan2.setColor(Color.AMARILLO);
        Automovil.setColorPatente(Color.AZUL);


        System.out.println(subaru.detalle());
        System.out.println("=======================================");
        System.out.println(mazda.detalle());
        System.out.println("=======================================");
        System.out.println(nissan.detalle());
        System.out.println("=======================================");
        System.out.println(nissan2.detalle());
        System.out.println("=======================================");

        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoStatic(300,60));
        System.out.println("=======================================");
        System.out.println(subaru.toString());
        System.out.println("=======================================");
        System.out.println("Velocidad maxima carretera = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad    = " + Automovil.VELOCIDAD_MAX_EN_CIUDAD);


        System.out.println("=======================================");
        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println(tipoSubaru);
        System.out.println("Numero de puertas " + tipoSubaru.getNumeroPuertas());
        System.out.println("Descripcion " + tipoSubaru.getDescripcion());
        System.out.println("=======================================");



    }
}
