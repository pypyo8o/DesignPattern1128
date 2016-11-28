package ch14;

public abstract class Support {
    private String name;                    // Ç±ÇÃÉgÉâÉuÉãâåàé“ÇÃñºëO
    private Support next;                 // ÇΩÇÁÇ¢âÒÇµÇÃêÊ
    public Support(String name) {           // ÉgÉâÉuÉãâåàé“ÇÃê∂ê¨
        this.name = name;
    }
    public Support setNext(Support next) {  // ÇΩÇÁÇ¢âÒÇµÇÃêÊÇê›íË
        this.next = next;
        return next;
    }
    public void support(Trouble trouble) {  // ÉgÉâÉuÉãâåàÇÃéËèá
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }
    public String toString() {              // ï∂éöóÒï\åª
        return "[" + name + "]";
    }
    protected abstract boolean resolve(Trouble trouble); // âåàópÉÅÉ\ÉbÉh
    protected void done(Trouble trouble) {  // âåà
        System.out.println(trouble + " is resolved by " + this + ".");
    }
    protected void fail(Trouble trouble) {  // ñ¢âåà
        System.out.println(trouble + " cannot be resolved.");
    }
}

