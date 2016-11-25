package ch14;

public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }
    protected boolean resolve(Trouble trouble) {     // âåàópÉÅÉ\ÉbÉh
        return false; // é©ï™ÇÕâΩÇ‡èàóùÇµÇ»Ç¢
    }
}
