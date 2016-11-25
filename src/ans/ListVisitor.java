package ans;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentdir = "";                         // åªç›íçñ⁄ÇµÇƒÇ¢ÇÈÉfÉBÉåÉNÉgÉäñº
    public void visit(File file) {                  // ÉtÉ@ÉCÉãÇñKñ‚ÇµÇΩÇ∆Ç´Ç…åƒÇŒÇÍÇÈ
        System.out.println(currentdir + "/" + file);
    }
    public void visit(Directory directory) {   // ÉfÉBÉåÉNÉgÉäÇñKñ‚ÇµÇΩÇ∆Ç´Ç…åƒÇŒÇÍÇÈ
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
