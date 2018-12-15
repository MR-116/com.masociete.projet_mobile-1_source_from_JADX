package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.WDObjet;
import java.io.InputStream;

public class WDChaineOptionnelle extends WDChaine {
    /* renamed from: c */
    public int f1937c = 0;
    /* renamed from: d */
    public int f1938d = -1;

    public WDChaineOptionnelle(char c) {
        super(c);
    }

    public WDChaineOptionnelle(double d) {
        super(d);
    }

    public WDChaineOptionnelle(int i) {
        super(i);
    }

    public WDChaineOptionnelle(long j) {
        super(j);
    }

    public WDChaineOptionnelle(WDObjet wDObjet) {
        super(wDObjet);
    }

    public WDChaineOptionnelle(InputStream inputStream) {
        super(inputStream);
    }

    public WDChaineOptionnelle(String str) {
        super(str);
    }

    public WDChaineOptionnelle(String str, int i) {
        super(str);
        this.f1937c = i;
    }

    public WDChaineOptionnelle(String str, int i, int i2) {
        super(str);
        this.f1937c = i;
        this.f1938d = i2;
    }

    public WDChaineOptionnelle(boolean z) {
        super(z);
    }

    public WDChaineOptionnelle(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: i */
    public final int m3255i() {
        return this.f1938d == -1 ? getString().length() : this.f1938d;
    }

    public boolean isChaineOptionnelle() {
        return true;
    }

    /* renamed from: j */
    public String m3256j() {
        String string = getString();
        return this.f1938d >= 0 ? string.substring(0, this.f1937c) + string.substring(this.f1937c + this.f1938d, string.length()) : string.substring(0, this.f1937c);
    }

    /* renamed from: k */
    public String m3257k() {
        String string = getString();
        return this.f1938d >= 0 ? string.substring(this.f1937c, this.f1937c + this.f1938d) : string;
    }

    /* renamed from: l */
    public final int m3258l() {
        return this.f1937c;
    }

    public cb opPlus(double d) {
        return opPlus(String.valueOf(d));
    }

    public cb opPlus(int i) {
        return opPlus(String.valueOf(i));
    }

    public cb opPlus(long j) {
        return opPlus(String.valueOf(j));
    }

    public cb opPlus(WDObjet wDObjet) {
        return opPlus(wDObjet.getString());
    }

    public cb opPlus(String str) {
        String string = getString();
        return str.equals("") ? new WDChaine(m3256j()) : str.startsWith(m3257k()) ? new WDChaine(m3256j() + str) : this.f1937c == 0 ? new WDChaineOptionnelle(string + str, 0, string.length()) : new WDChaine(string + str);
    }

    public cb opPlus(boolean z) {
        return opPlus(z ? "1" : "0");
    }
}
