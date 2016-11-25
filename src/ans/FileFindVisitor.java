package ans;

import java.util.Iterator;
import java.util.ArrayList;

public class FileFindVisitor extends Visitor {
    private String filetype;
    private ArrayList found = new ArrayList();
    public FileFindVisitor(String filetype) {           // ".txt"ÇÃÇÊÇ§Ç…ägí£éqÇ.ïtÇ´Ç≈éwíË
        this.filetype = filetype;
    }
    public Iterator getFoundFiles() {                   // å©Ç¬Ç©Ç¡ÇΩÉtÉ@ÉCÉãÇìæÇÈ
        return found.iterator();
    }
    public void visit(File file) {                  // ÉtÉ@ÉCÉãÇñKñ‚ÇµÇΩÇ∆Ç´Ç…åƒÇŒÇÍÇÈ
        if (file.getName().endsWith(filetype)) {
            found.add(file);
        }
    }
    public void visit(Directory directory) {   // ÉfÉBÉåÉNÉgÉäÇñKñ‚ÇµÇΩÇ∆Ç´Ç…åƒÇŒÇÍÇÈ
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }
}
