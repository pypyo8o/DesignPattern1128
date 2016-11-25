package ch14;

public class LimitSupport extends Support {
    private int limit;                              // Ç±ÇÃî‘çÜñ¢ñûÇ»ÇÁâåàÇ≈Ç´ÇÈ
    public LimitSupport(String name, int limit) {   // ÉRÉìÉXÉgÉâÉNÉ^
        super(name);
        this.limit = limit;
    }
    protected boolean resolve(Trouble trouble) {         // âåàópÉÅÉ\ÉbÉh
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
