package Metronome;

import java.util.Scanner;

public class Metronome {

    private double tempo;

    private double interval;

    private double share;

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getTempo() {
        return tempo;
    }

    public void setInterval(double interval) {
        this.interval = interval;
    }

    public double getInterval() {
        return interval;
    }

    public void setShare(double share) {
        this.share = share;
    }

    public double getShare() {
        return share;
    }

    public void scanTempo(){
        Scanner scanTempo = new Scanner(System.in);
        System.out.println("Введите темп");
        setTempo(scanTempo.nextLong());

    }

    public void scanShare(){
        Scanner scanShare = new Scanner(System.in);
        System.out.println("Введите количество доль в такте");
        setShare(scanShare.nextLong());
    }

}
