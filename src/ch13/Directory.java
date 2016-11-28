package ch13;
import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
    private String name;                       // ÉfÉBÉåÉNÉgÉäÇÃñºëO
    private ArrayList dir = new ArrayList();      // ÉfÉBÉåÉNÉgÉäÉGÉìÉgÉäÇÃèWçá
    public Directory(String name) {           // ÉRÉìÉXÉgÉâÉNÉ^
        this.name = name;
    }
    public String getName() {                 // ñºëOÇìæÇÈ
        return name;
    }
    public int getSize() {                     // ÉTÉCÉYÇìæÇÈ
        int size = 0;
        Iterator it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    public Entry add(Entry entry) {            // ÉGÉìÉgÉäÇÃí«â¡
        dir.add(entry);
        return this;
    }
    public Iterator iterator() {              // IteratorÇÃê∂ê¨
        return dir.iterator();
    }
    public void accept(Visitor v) {             // ñKñ‚é“ÇÃéÛÇØì¸ÇÍ
        v.visit(this);
    }
}
