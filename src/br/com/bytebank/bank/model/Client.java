package br.com.bytebank.bank.model;

public class Client {
    private String name;
    private String cpf;
    private String profession;


    public Client(String name, String cpf, String profession) {
        this.name = name;
        this.cpf = cpf;
        this.profession = profession;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", professi\n" +
                "    }on='" + profession + '\'' +
                '}';
    }
}
