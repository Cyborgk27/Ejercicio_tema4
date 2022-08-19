public abstract class SmartDevice {
    public String marca;
    public String Os;
    public int year_create;
    public String tipo_pantalla;
    public double precio;

    public SmartDevice() {
    }
    
    public SmartDevice(String marca, String os, int year_create, String tipo_pantalla, double precio) {
        this.marca = marca;
        Os = os;
        this.year_create = year_create;
        this.tipo_pantalla = tipo_pantalla;
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getOs() {
        return Os;
    }
    public void setOs(String os) {
        Os = os;
    }
    public int getYear_create() {
        return year_create;
    }
    public void setYear_create(int year_create) {
        this.year_create = year_create;
    }
    public String getTipo_pantalla() {
        return tipo_pantalla;
    }
    public void setTipo_pantalla(String tipo_pantalla) {
        this.tipo_pantalla = tipo_pantalla;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "SmartDevice [Os=" + Os + ", marca=" + marca + ", precio=" + precio + ", tipo_pantalla=" + tipo_pantalla
                + ", year_create=" + year_create + "]";
    }

}
