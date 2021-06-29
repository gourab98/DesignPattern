package DesignPattern.Composite_Pattern;

public class CompositeDemo {
    public static StringBuffer compositeBuilder = new StringBuffer();

    public static void main(String[] args) {
        Directory music = new Directory("MUSIC");
        Directory all = new Directory("ALL");
        Directory pdf = new Directory("PDF");

        File track1 = new File("I am not so happy.mp3");
        File track2 = new File("Go to hell.mp3");
        File track3 = new File("Do you love me.mp3");
        File track4 = new File("Can you be my friend.mp3");
        File track5 = new File("Dante.pdf");
        File track6 = new File("Eat some good Food.mp3");
        File track7 = new File("Have a beautiful morning.pdf");

        all.add(track1);
        all.add(music);
        music.add(track2);
        music.add(track3);
        music.add(track4);
        music.add(track6);
        music.add(pdf);
        pdf.add(track7);
        pdf.add(track5);

        all.ls();

    }

}
