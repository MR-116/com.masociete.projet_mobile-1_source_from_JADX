package p000a.p001a.p002a.p007b.p008a;

import p000a.p001a.p002a.eb;

/* renamed from: a.a.a.b.a.n */
public final class C0045n {
    /* renamed from: a */
    private final boolean f115a;

    C0045n(boolean z) {
        this.f115a = z;
    }

    /* renamed from: a */
    public void m245a(eb[] ebVarArr) {
        if (this.f115a && ebVarArr != null && ebVarArr.length >= 3) {
            eb ebVar = ebVarArr[0];
            ebVarArr[0] = ebVarArr[2];
            ebVarArr[2] = ebVar;
        }
    }

    /* renamed from: a */
    public boolean m246a() {
        return this.f115a;
    }
}
