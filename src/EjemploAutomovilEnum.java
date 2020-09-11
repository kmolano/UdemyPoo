
public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        
        Automovil.setCapacidadEsTanqueStatico(45);
        Automovil subaru  = new Automovil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHABACK);


        Automovil mazda  = new Automovil("Mazda","BT-50",Color.ROJO,3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        System.out.println("================");
        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipo.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        System.out.println("================");

        switch(tipo){
            case CONVERTIBLE:
                System.out.println("El auto es deportivo y descapotable de dos puertas");
                break;
            case COUPE:
                System.out.println("El auto es pequeño de dos puertas y tipicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automovil utilitario de empresas");
                break;
            case HATCHABACK:
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("Es un automovil de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("Es un automovil mediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un automovil mas grande, con la maleta grande");
                break;
        }
        System.out.println("============");

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta:tipos){
            System.out.println(ta + "=> " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuertas());
        }




    }
}
