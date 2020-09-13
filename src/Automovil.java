public class Automovil implements Comparable <Automovil>{

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;

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
        this.ruedas = new Rueda[5];
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
    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
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

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if(estanque == null){
            this.estanque = new Estanque();
        }
        return estanque;
    }
    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }
    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }
    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if(indiceRuedas < this.ruedas.length){
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    public String detalle(){
        StringBuilder detalle = new StringBuilder("auto.Id          = " + this.id +
                "\nauto.fabricante  = " + this.fabricante +
                "\nauto.modelo      = " + this.modelo);
        if(this.getTipo() != null){
                detalle.append("\nauto.tipo        = ").append(this.getTipo().getNombre());
        }
                detalle.append("\nauto.color       = ").append(this.color).append("\nauto.colorPatente = ").append(colorPatente);
        if(this.motor != null) {
            detalle.append("\nauto.cilindrada  = ").append(this.motor.getCilindrada());
        }
        if(conductor !=null) {
            detalle.append("\nConductor subaru ").append(this.getConductor());
        }
        if(getRuedas() != null) {
            detalle.append("Ruedas del automovil: ");
            for (Rueda r : this.getRuedas()) {
                detalle.append("\n").append(r.getFabricante()).append(", ").append(r.getAro()).append(", ").append(r.getAncho());
            }
        }
        return detalle.toString();
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
        return kilometros/(porcentajeBencinaDecimal * this.getEstanque().getCapacidad());
    }
    public float calcularConsumo(int kilometros,int porcentajeBencinaEntero){
        return (kilometros/(porcentajeBencinaEntero*(this.getEstanque().getCapacidad()/100F)));
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
        return this.id + " : " + this.fabricante + " " + this.modelo;
    }

    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }
}
