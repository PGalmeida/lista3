package exer_2;

public class Passenger {
    private Number id;
    private String name, cpf;

    public Passenger() {
    }
    public Passenger(Number id, String name, String cpf) {
        this.setId(id);
        this.setName(name);
        this.setCpf(cpf);
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "\nid=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
