package Metronome;

class MetronomeMain {
    public static void main(String[] args) {
        MetronomeThread metronomeThread = new MetronomeThread();
        metronomeThread.start();
    }
}
