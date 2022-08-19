public class SmartWatch extends SmartDevice {
    private String tipo_sensor_pulso;
    private String color_correa;

    public SmartWatch(String marca, String os, int year_create, String tipo_pantalla, double precio,
            String tipo_sensor_pulso, String color_correa) {
        super(marca, os, year_create, tipo_pantalla, precio);
        this.tipo_sensor_pulso = tipo_sensor_pulso;
        this.color_correa = color_correa;
    }

    public String getTipo_sensor_pulso() {
        return tipo_sensor_pulso;
    }

    public void setTipo_sensor_pulso(String tipo_sensor_pulso) {
        this.tipo_sensor_pulso = tipo_sensor_pulso;
    }

    public String getColor_correa() {
        return color_correa;
    }

    public void setColor_correa(String color_correa) {
        this.color_correa = color_correa;
    }

    @Override
    public String toString() {
        return super.toString() + "SmartWatch [color_correa=" + color_correa + ", tipo_sensor_pulso="
                + tipo_sensor_pulso + "]";
    }

}
