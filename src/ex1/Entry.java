package ex1;

import java.util.Iterator;

public abstract class Entry implements Element {
    public abstract String getName();                                   // –¼‘O‚ð“¾‚é
    public abstract int getSize();                                      // ƒTƒCƒY‚ð“¾‚é
    public Entry add(Entry entry) throws FileTreatmentException {       // ƒGƒ“ƒgƒŠ‚ð’Ç‰Á‚·‚é
        throw new FileTreatmentException();
    }
    public Iterator iterator() throws FileTreatmentException {    // Iterator‚Ì¶¬
        throw new FileTreatmentException();
    }
    public String toString() {                                          // •¶Žš—ñ•\Œ»
        return getName() + " (" + getSize() + ")";
    }
}
