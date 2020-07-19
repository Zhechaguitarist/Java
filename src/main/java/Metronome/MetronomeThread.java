package Metronome;

public class MetronomeThread extends Thread {
    public void run(){
        Metronome metronome = new Metronome();
        metronome.scanTempo();
        metronome.scanShare();
        long l;
        l = Math.round(60 / metronome.getTempo() * 1000);
        metronome.setInterval(l);
        while (true){
            for(int i=1;i<metronome.getShare()+1;i++){
                try {
                    Thread.sleep(l);
                    System.out.println(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
