package ch14;

public class Trouble {
    private int number;             // ÉgÉâÉuÉãî‘çÜ
    public Trouble(int number) {    // ÉgÉâÉuÉãÇÃê∂ê¨
        this.number = number;
    }
    public int getNumber() {        // ÉgÉâÉuÉãî‘çÜÇìæÇÈ
        return number;
    }
    public String toString() {      // ÉgÉâÉuÉãÇÃï∂éöóÒï\åª
        return "[Trouble " + number + "]";
    }
}
