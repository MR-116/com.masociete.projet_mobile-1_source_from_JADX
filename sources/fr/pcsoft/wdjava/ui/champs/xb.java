package fr.pcsoft.wdjava.ui.champs;

import java.util.EventObject;

public class xb extends EventObject {
    /* renamed from: a */
    private int f3777a = 0;
    /* renamed from: b */
    private int f3778b = 0;
    /* renamed from: c */
    private boolean f3779c = false;

    public xb(Object obj, int i, int i2, boolean z) {
        super(obj);
        this.f3778b = i;
        this.f3777a = i2;
        this.f3779c = z;
    }

    /* renamed from: a */
    public int m8927a() {
        return this.f3778b;
    }

    /* renamed from: b */
    public int m8928b() {
        return this.f3777a;
    }

    /* renamed from: c */
    public boolean m8929c() {
        return this.f3779c;
    }
}
