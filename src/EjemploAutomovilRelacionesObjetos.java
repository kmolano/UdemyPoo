
public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Rueda[] ruedasSub = new Rueda[10];
        Persona conductorSubaru = new Persona("Lucia", "Martinez");
        Automovil subaru  = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHABACK);
        subaru.setTipo(TipoAutomovil.PICKUP);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);
        for(int i = 0; i < ruedasSub.length; i++){
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }


        Rueda[] ruedaMaz = new Rueda[5];
        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda  = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedaMaz);
        for(int i = 0; i < ruedaMaz.length; i++){
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }



        Persona bea = new Persona("Bea", "Gonzales");
        Automovil nissan  = new Automovil("Nissan", "Navara",Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL),new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        nissan.addRueda(new Rueda("Pirelli", 20, 11))
                .addRueda(new Rueda("Pirelli", 20, 11))
                .addRueda(new Rueda("Pirelli", 20, 11))
                .addRueda(new Rueda("Pirelli", 20, 11))
                .addRueda(new Rueda("Pirelli", 20, 11));


        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11),
                new Rueda("Pirelli", 20, 11),
                new Rueda("Pirelli", 20, 11),
                new Rueda("Pirelli", 20, 11),
                new Rueda("Pirelli", 20, 11),};
        Persona lalo = new Persona("lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan2", "Navara",Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA),new Estanque(50), lalo, ruedasNissan2);
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

        /*System.out.println("Conductor subaru " + subaru.getConductor());
        System.out.println("Ruedas subaru");
        for(Rueda r: subaru.getRuedas()){
            System.out.println(r.getFabricante() + ", " +
                    r.getAro() + ", " + r.getAncho());
        }
        System.out.println("=======================================");*/




    }
}
