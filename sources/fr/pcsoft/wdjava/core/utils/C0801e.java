package fr.pcsoft.wdjava.core.utils;

/* renamed from: fr.pcsoft.wdjava.core.utils.e */
abstract class C0801e {
    /* renamed from: a */
    protected String f2056a = "";

    public C0801e(String str) {
        this.f2056a = str;
    }

    /* renamed from: a */
    public abstract boolean mo2757a(zb zbVar);

    public boolean equals(Object obj) {
        return obj instanceof C0801e ? ((C0801e) obj).f2056a.equals(this.f2056a) : super.equals(obj);
    }

    public int hashCode() {
        return this.f2056a.hashCode();
    }
}
