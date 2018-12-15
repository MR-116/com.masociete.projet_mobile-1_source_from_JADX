package fr.pcsoft.wdjava.core.poo;

public class WDInstanceDynamiqueRF extends WDInstanceFD {
    public WDInstanceDynamiqueRF() {
        this(C0733z.class);
    }

    public WDInstanceDynamiqueRF(Class cls) {
        super(null, cls);
    }

    protected final boolean isInstanceDynamique() {
        return true;
    }
}
