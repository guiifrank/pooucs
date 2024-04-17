package br.ucs.poo.aula5;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio() {
    }

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void incrementaSegundo() {
        if (++segundo > 59) {
            segundo = 0;
            if (++minuto > 59) {
                minuto = 0;
                if (++hora > 23) {
                    hora = 0;
                }
            }
        }
    }

    public void decrementaSegundo() {
        if (--segundo < 0) {
            segundo = 59;
        }
        if (--minuto < 0) {
            minuto = 59;
        }
        if (--hora < 0) {
            hora = 23;
        }
    }

    public void acertaHora(int h, int m, int s) {
        if (h >= 0 && h < 23) {
            h = hora;
        } else hora = 0;
        if (m >= 0 && m <= 59) {
            m = minuto;
        } else minuto = 0;
        if (s >= 0 && s <= 59) {
            s = segundo;
        } else segundo = 0;
    }

    @Override
    public String toString() {
        return "hora= " + hora +
                ", minuto= " + minuto +
                ", segundo= " + segundo;
    }
}
