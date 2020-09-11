public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private int capacidadEsTanque = 40;

    private TipoAutomovil tipo ;

    private static Color colorPatente = Color.NARANJO;
    private static int capacidadEsTanqueStatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_EN_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris oscuro";



    public Automovil(){
        this.id = ++ultimoId;
    }
    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante, modelo);
        this.color = color;
    }
    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }
    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEsTanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadEsTanque = capacidadEsTanque;
    }

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEsTanque() {
        return capacidadEsTanque;
    }
    public void setCapacidadEsTanque(int capacidadEsTanque) {
        this.capacidadEsTanque = capacidadEsTanque;
    }

    public static Color getColorPatente(){
        return colorPatente;
    }
    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEsTanqueStatico() {
        return capacidadEsTanqueStatico;
    }
    public static void setCapacidadEsTanqueStatico(int capacidadEsTanqueStatico) {
        Automovil.capacidadEsTanqueStatico = capacidadEsTanqueStatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }
    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String detalle(){
        return "auto.Id          = "    + this.id +
                "\nauto.fabricante  = " + this.fabricante  +
                "\nauto.modelo      = " + this.modelo   +
                "\nauto.tipo        = " + this.getTipo().getNombre() +
                "\nauto.color       = " + this.color    +
                "\nauto.cilindrada  = " + this.cilindrada +
                "\nauto.colorPatente = " + colorPatente;
    }
    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm.";
    }
    public String frenar(){
        return this.fabricante + " " + this.modelo+ " frenando!";
    }
    public String acelerarFrenar(int rpm){
        String acelera = this.acelerar(rpm);
        String frena   = this.frenar();
        return acelera + "\n" + frena;
    }


    public float calcularConsumo(int kilometros,float porcentajeBencinaDecimal){
        return kilometros/(porcentajeBencinaDecimal*capacidadEsTanque);
    }
    public float calcularConsumo(int kilometros,int porcentajeBencinaEntero){
        return (kilometros/(porcentajeBencinaEntero*(capacidadEsTanque/100F)));
    }
    public static float calcularConsumoStatic(int kilometros,int porcentajeBencinaEntero){
        return (kilometros/(porcentajeBencinaEntero*(Automovil.capacidadEsTanqueStatico/100F)));
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof  Automovil)){
            return  false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante!= null &&
                this.modelo != null &&
                this.fabricante.equals(a.fabricante)
                && (this.modelo.equals(a.modelo)));
    }
    @Override
    public String toString() {
        return "Automovil{" +
                "id= " + id + '\''+
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEsTanque=" + capacidadEsTanque +
                '}';
    }
}
