package ch14;

public class SpecialSupport extends Support {
    private int number;                                 // Ç±ÇÃî‘çÜÇæÇØâåàÇ≈Ç´ÇÈ
    public SpecialSupport(String name, int number) {    // ÉRÉìÉXÉgÉâÉNÉ^
        super(name);
        this.number = number;
    }
    protected boolean resolve(Trouble trouble) {     // âåàópÉÅÉ\ÉbÉh
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
}
