package fr.pcsoft.wdjava.core;

import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import java.math.BigDecimal;

/* renamed from: fr.pcsoft.wdjava.core.s */
final class C0746s extends WDBooleen {
    C0746s(boolean z) {
        super(z);
    }

    /* renamed from: c */
    private boolean m3241c() {
        return WDAppelContexte.getContexte().m2707a(true);
    }

    public BigDecimal getBigDecimal() {
        return getValeur().getBigDecimal();
    }

    public boolean getBoolean() {
        return getValeur().getBoolean();
    }

    public double getDouble() {
        return getValeur().getDouble();
    }

    public int getInt() {
        return getValeur().getInt();
    }

    public long getLong() {
        return getValeur().getLong();
    }

    public String getString() {
        return getValeur().getString();
    }

    public WDObjet getValeur() {
        return new WDBooleen(m3241c());
    }

    public boolean opDiff(boolean z) {
        return m3241c() != z;
    }

    public boolean opEgal(boolean z) {
        return m3241c() == z;
    }
}
