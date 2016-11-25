package ch14;

public class OddSupport extends Support {
    public OddSupport(String name) {                // ÉRÉìÉXÉgÉâÉNÉ^
        super(name);
    }
    protected boolean resolve(Trouble trouble) {    // âåàópÉÅÉ\ÉbÉh
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
