package fr.pcsoft.wdjava.database.hf.requete.parsing;

import fr.pcsoft.wdjava.core.p035c.C0539d;

public class WDInvalidSQLException extends C0539d {
    /* renamed from: b */
    private boolean f2355b = false;

    public WDInvalidSQLException(String str) {
        super(str);
    }

    public WDInvalidSQLException(String str, boolean z) {
        super(str);
        this.f2355b = z;
    }

    /* renamed from: k */
    public final boolean m6100k() {
        return this.f2355b;
    }
}
