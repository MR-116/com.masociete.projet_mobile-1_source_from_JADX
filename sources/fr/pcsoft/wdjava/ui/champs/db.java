package fr.pcsoft.wdjava.ui.champs;

import fr.pcsoft.wdjava.ui.C0489p;
import java.util.Iterator;

public interface db {
    C0489p getFils(String str);

    C0489p getFilsDirect(String str);

    Iterator getLstFils();

    void removeObjAPCode(C0489p c0489p);
}
