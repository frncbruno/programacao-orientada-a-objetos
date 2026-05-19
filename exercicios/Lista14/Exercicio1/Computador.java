public class Computador {

    protected String Marca;
    private String Modelo;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String exibeModelo() {
        return "Modelo: " + Modelo;
    }
}
