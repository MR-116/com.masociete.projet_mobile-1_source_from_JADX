package fr.pcsoft.wdjava.ui.p065b;

import fr.pcsoft.wdjava.core.application.C0535j;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.p040a.C0608c;

/* renamed from: fr.pcsoft.wdjava.ui.b.m */
public abstract class C1102m<T> implements C0535j {
    /* renamed from: a */
    private C0608c<String, T> f3332a;

    public C1102m() {
        WDProjet.getInstance().ajouterEcouteurProjet(this);
    }

    /* renamed from: b */
    private final String m7973b(String str, int i, int i2) {
        return new StringBuilder(str.length() + 4).append(str.toLowerCase()).append('|').append(i).append('|').append(i2).toString();
    }

    /* renamed from: a */
    protected abstract C0608c<String, T> mo3348a();

    /* renamed from: a */
    public void m7975a(String str, int i, int i2) {
        if (this.f3332a != null) {
            this.f3332a.mo2492a(m7973b(str, i, i2));
        }
    }

    /* renamed from: a */
    public void m7976a(String str, T t, int i, int i2) {
        if (t != null) {
            String b = m7973b(str, i, i2);
            if (this.f3332a == null) {
                this.f3332a = mo3348a();
            }
            this.f3332a.mo2493a(b, t);
        }
    }

    /* renamed from: c */
    public T m7977c(String str, int i, int i2) {
        String toLowerCase = str.toLowerCase();
        if (this.f3332a == null) {
            this.f3332a = mo3348a();
            return null;
        }
        return this.f3332a.mo2495b(m7973b(toLowerCase, i, i2));
    }

    public void onChangementTitre(String str) {
    }

    public void onCharsetChanged(String str) {
    }

    public void onFermetureProjet() {
    }

    public void onLowMemory() {
        if (this.f3332a != null) {
            this.f3332a.mo2494a();
        }
    }
}
