
public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        
        Automovil.setCapacidadEsTanqueStatico(45);
        Automovil subaru  = new Automovil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHABACK);


        Automovil mazda  = new Automovil("Mazda","BT-50",Color.ROJO,3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println(mazda.getTipo().getNumeroPuertas());
        System.out.println(mazda.getTipo().getDescripcion());
        System.out.println(mazda.getTipo().getNombre());
        System.out.println(mazda.getTipo());

        TipoAutomovil tipo = subaru.getTipo();

        tipo = mazda.getTipo();
        System.out.println("========================");
        switch(tipo){
            case CONVERTIBLE    -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE          -> System.out.println("Es el automovil pequeño de dos puertas y tipicamente deportivo");
            case PICKUP         -> System.out.println("Es de tipo pickup");
            case STATION_WAGON  -> System.out.println("Es del tipo con nombre raro");
            case SEDAN          -> System.out.println("Es de tipo sedan");
            case FURGON         -> System.out.println("Es de tipo furgon");
            case HATCHABACK     -> System.out.println("Es de tipo nombre raro");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta: tipos){
            System.out.println(ta + " => " + ta.name());
        }

    }
}
