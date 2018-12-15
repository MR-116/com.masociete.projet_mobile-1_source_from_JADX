package fr.pcsoft.wdjava.core.poo;

public class WDInstanceDynamique extends WDInstance {
    public WDInstanceDynamique() {
        this(C0733z.class);
    }

    public WDInstanceDynamique(Class cls) {
        super(null, cls);
    }

    public C0729v creerInstanceNonAllouee() {
        return new WDInstanceDynamique(this.a);
    }

    protected final boolean isInstanceDynamique() {
        return true;
    }

    public void razVariable() {
        liberer();
    }
}
