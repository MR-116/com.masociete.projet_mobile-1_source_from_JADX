package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.io.InputStream;

public class WDChaineA extends WDChaine {
    public static final C0613b<WDChaineA> CREATOR = new C0751b();
    /* renamed from: c */
    private String f1550c = null;

    public WDChaineA() {
        m2435i();
    }

    public WDChaineA(char c) {
        super(c);
        m2435i();
    }

    public WDChaineA(double d) {
        super(d);
        m2435i();
    }

    public WDChaineA(int i) {
        super(i);
        m2435i();
    }

    public WDChaineA(long j) {
        super(j);
        m2435i();
    }

    public WDChaineA(WDObjet wDObjet) {
        super(wDObjet);
    }

    public WDChaineA(InputStream inputStream) {
        super(inputStream);
        m2435i();
    }

    public WDChaineA(String str) {
        super(str);
        m2435i();
    }

    public WDChaineA(String str, String str2) {
        this.b = str;
        this.f1550c = str2;
    }

    public WDChaineA(boolean z) {
        super(z);
        m2435i();
    }

    public WDChaineA(byte[] bArr) {
        super(bArr);
        m2435i();
    }

    public WDChaineA(byte[] bArr, String str) {
        this.a = bArr;
        this.f1550c = str;
    }

    /* renamed from: i */
    private final void m2435i() {
        this.f1550c = WDProjet.getInstance().getCharset();
    }

    /* renamed from: a */
    protected WDChaine mo2544a(String str) {
        return new WDChaineA(str);
    }

    /* renamed from: a */
    protected WDChaine mo2545a(byte[] bArr) {
        return new WDChaineA(bArr);
    }

    /* renamed from: a */
    protected void mo2546a(byte[] bArr, String str) {
        if (C0808l.m4053k(str)) {
            m2435i();
        } else {
            this.f1550c = str;
        }
        super.mo2546a(bArr, str);
    }

    /* renamed from: d */
    public String mo2547d() {
        return this.f1550c != null ? this.f1550c : WDProjet.getInstance().getCharset();
    }

    public int getTypeVar() {
        return 19;
    }

    public void razVariable() {
        m2435i();
        super.razVariable();
    }

    public void release() {
        super.release();
        this.f1550c = null;
    }

    public void setValeur(int i) {
        m2435i();
        super.setValeur(i);
    }

    public void setValeur(WDObjet wDObjet) {
        WDChaineA wDChaineA = (WDChaineA) wDObjet.checkType(WDChaineA.class);
        if (wDChaineA != null) {
            this.f1550c = wDChaineA.mo2547d();
        } else {
            m2435i();
        }
        super.setValeur(wDObjet);
    }

    public void setValeur(String str) {
        m2435i();
        super.setValeur(str);
    }

    public void setValeur(byte[] bArr) {
        m2435i();
        super.setValeur(bArr);
    }
}
