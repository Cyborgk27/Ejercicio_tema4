public class SmartPhone extends SmartDevice {
    private String tipo_camara;
    private String tipo_camara_frontal;

    public SmartPhone(String marca, String os, int year_create, String tipo_pantalla, double precio, String tipo_camara,
            String tipo_camara_frontal) {
        super(marca, os, year_create, tipo_pantalla, precio);
        this.tipo_camara = tipo_camara;
        this.tipo_camara_frontal = tipo_camara_frontal;
    }

    public String getTipo_camara() {
        return tipo_camara;
    }

    public void setTipo_camara(String tipo_camara) {
        this.tipo_camara = tipo_camara;
    }

    public String getTipo_camara_frontal() {
        return tipo_camara_frontal;
    }

    public void setTipo_camara_frontal(String tipo_camara_frontal) {
        this.tipo_camara_frontal = tipo_camara_frontal;
    }

    @Override
    public String toString() {
        return super.toString() + "SmartPhone [tipo_camara=" + tipo_camara + ", tipo_camara_frontal="
                + tipo_camara_frontal + "]";
    }

}