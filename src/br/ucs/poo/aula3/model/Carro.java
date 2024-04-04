package br.ucs.poo.aula3.model;

public class Carro {
    private String nome;
    private int maxPessoas;
    private float maxPeso;
    private Pessoa[] ocupantes;
    private int ultimaPos;

    public Carro() {
    }

    public Carro(String nome, int maxPessoas, float maxPeso) {
        super();
        this.nome = nome;
        this.maxPessoas = maxPessoas;
        this.maxPeso = maxPeso;
        ocupantes = new Pessoa[this.maxPessoas];
        this.ultimaPos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMaxPessoas() {
        return maxPessoas;
    }

    public void setMaxPessoas(int maxPessoas) {
        this.maxPessoas = maxPessoas;
    }

    public float getMaxPeso() {
        return maxPeso;
    }

    public void setMaxPeso(float maxPeso) {
        this.maxPeso = maxPeso;
    }

    public Pessoa[] getOcupantes() {
        return ocupantes;
    }

    public int getUltimaPos() {
        return ultimaPos;
    }

    public int entrar(Pessoa p) {

        if(this.getMaxPeso() < this.getPesoTotal() + p.getPeso()) {

            return 0;
        }

        if(this.ultimaPos < this.maxPessoas) {
            ocupantes[this.ultimaPos] = p;
            this.ultimaPos++;
            return 1; // sucesso
        }
        else {
            return -1; // falha
        }
    }

    public int remove(Pessoa p) {
        for (int i = 0; i < this.ultimaPos; i++) {
            if (ocupantes[i].equals(p)) {
                for (int j = i; j < this.ultimaPos - 1; j++) {
                    ocupantes[j] = ocupantes[j + 1];
                }
                ocupantes[this.ultimaPos - 1] = null;
                this.ultimaPos--;
                return 1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carro : " + this.nome + "\n");
        sb.append("Capacidade pessoas : " + this.maxPessoas + "\n");
        sb.append("Capacidade peso : " + this.maxPeso + "\n");
        sb.append("No momento tem : " + this.ultimaPos + " pessoas no carro \n");
        sb.append("Peso total das pessoas : " + this.getPesoTotal() + "kg \n");
        sb.append("Ainda pode carregar mais : " + (this.maxPeso - this.getPesoTotal()) + " kg \n");
        return sb.toString();
    }

    public float getPesoTotal() {

        float total = 0;

        for(int i=0; i < this.ultimaPos; i++) {
            total += this.ocupantes[i].getPeso();
        }

        return total;
    }

}
