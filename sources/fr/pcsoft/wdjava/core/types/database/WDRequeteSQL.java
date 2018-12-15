package fr.pcsoft.wdjava.core.types.database;

import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.requete.C0778b;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0537e;

public class WDRequeteSQL extends C0778b {
    public WDRequeteSQL(C0537e c0537e) {
        super(c0537e);
        WDHF_Contexte.getInstance().m5001a((C0778b) this);
    }
}
