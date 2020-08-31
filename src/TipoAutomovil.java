public enum TipoAutomovil {
    SEDAN("Sedan", 4, "Auto normal"),
    STATION_WAGON("Station wagon", 4, "Auto grande"),
    HATCHABACK("Hatchaback", 4 , "Auto compacto"),
    PICKUP("Pickup", 4, "Camioneta"),
    COUPE("Coupe", 4, "Auto pequeño"),
    CONVERTIBLE("Convertible", 2, "Auto deportivo"),
    FURGON("Furgon", 4, "Auto utilitario");

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAutomovil(String nombre, int numeroPuertas, String descripcion) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public String getDescripcion() {
        return descripcion;
    }
}
