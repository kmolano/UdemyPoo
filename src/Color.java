public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blando"),
    GRIS("Gris oscuro"),
    NARANJO("Naranjo");
    private final String Color;

    Color(String color) {
        this.Color = color;
    }

    public String getColor() {
        return Color;
    }

    @Override
    public String toString() {
        return Color;
    }
}
