package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.WDObjet;

public final class WDNull extends WDEntier4 {
    /* renamed from: b */
    private static WDNull f1939b = null;

    private WDNull() {
    }

    /* renamed from: c */
    public static WDNull m3259c() {
        if (f1939b == null) {
            f1939b = new WDNull();
        }
        return f1939b;
    }

    public Object getJSONValue() {
        return null;
    }

    public WDObjet getValeur() {
        return this;
    }

    public boolean isNull() {
        return true;
    }

    public boolean isValeurNull() {
        return true;
    }

    public cb opDec() {
        return this;
    }

    public cb opInc() {
        return this;
    }

    public cb opMoinsUnaire() {
        return this;
    }

    public void setValeur(boolean z) {
    }
}
