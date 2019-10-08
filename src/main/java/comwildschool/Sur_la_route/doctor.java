package comwildschool.Sur_la_route;

public class doctor {
    private int numero;
    private String name;


    public doctor(String name,int numero) {
        this.name = name;
        this.numero=numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
