package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.cb;
import java.math.BigDecimal;
import java.util.ArrayList;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.p */
public class C0770p extends WDTableauSimple {
    /* renamed from: z */
    private static final String[] f2011z = new String[]{C0770p.m3547z(C0770p.m3548z("m{z]d\u0011osWz\u000bfyAe\u000b")), C0770p.m3547z(C0770p.m3548z("mwJ{\u000bjc"))};

    public C0770p(int i, int[] iArr, int i2, int i3) {
        this(i, iArr, i2, i3, null);
    }

    private C0770p(int i, int[] iArr, int i2, int i3, IWDAllocateur iWDAllocateur) {
        this.o = i3;
        this.m = iWDAllocateur;
        this.j = 1;
        this.i = 1;
        this.a = new int[]{iArr[0]};
        this.d = iArr[0];
        try {
            this.q = null;
            int i4 = iArr[i2];
            this.c = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                this.c.add(C0611a.m2294a(i3, this.m));
            }
        } catch (OutOfMemoryError e) {
            throw e;
        } catch (OutOfMemoryError e2) {
            WDErreurManager.m2883a(C0745b.m3222b(f2011z[0], new String[0]));
        }
        this.l |= 1;
    }

    public C0770p(int i, int[] iArr, int i2, IWDAllocateur iWDAllocateur) {
        this(i, iArr, i2, iWDAllocateur.getTypeWL(), iWDAllocateur);
    }

    /* renamed from: z */
    private static String m3547z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 78;
                    break;
                case 1:
                    i2 = 43;
                    break;
                case 2:
                    i2 = 54;
                    break;
                case 3:
                    i2 = 8;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3548z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 55);
        }
        return toCharArray;
    }

    public WDObjet get(int i) {
        if (i < 1) {
            return new WDChaine("");
        }
        WDObjet a;
        if (i > this.d) {
            for (int size = this.c.size(); size < i; size++) {
                this.c.add(null);
            }
            this.d = i;
            this.a[0] = this.d;
            a = C0611a.m2294a(this.o, this.m);
            this.c.set(C0725i.m3011a(i), a);
            return a;
        } else if (this.c.get(C0725i.m3011a(i)) != null) {
            return (WDObjet) this.c.get(C0725i.m3011a(i));
        } else {
            a = C0611a.m2294a(this.o, this.m);
            this.c.set(C0725i.m3011a(i), a);
            return a;
        }
    }

    public BigDecimal getBigDecimal() {
        return this.d > 0 ? get(1).getBigDecimal() : BigDecimal.ZERO;
    }

    public boolean getBoolean() {
        return this.d > 0 ? get(1).getBoolean() : false;
    }

    public String getDate() {
        return this.d > 0 ? get(1).getDate() : "";
    }

    public String getDateHeure() {
        return this.d > 0 ? get(1).getDateHeure() : "";
    }

    public double getDouble() {
        return this.d > 0 ? get(1).getDouble() : 0.0d;
    }

    public String getHeure() {
        return this.d > 0 ? get(1).getHeure() : "";
    }

    public int getInt() {
        return this.d > 0 ? get(1).getInt() : 0;
    }

    public long getLong() {
        return this.d > 0 ? get(1).getLong() : 0;
    }

    public String getNomType() {
        return C0745b.m3220a(f2011z[1], new String[0]);
    }

    public String getString() {
        return this.d > 0 ? get(1).getString() : "";
    }

    public WDObjet getValeur() {
        return this;
    }

    public boolean isTableau() {
        return true;
    }

    /* renamed from: j */
    public boolean mo2667j() {
        return false;
    }

    /* renamed from: l */
    public int mo2640l() {
        return this.j;
    }

    /* renamed from: o */
    public int mo2643o() {
        return this.h;
    }

    public boolean opCommencePar(WDObjet wDObjet) {
        return get(1).opCommencePar(wDObjet);
    }

    public cb opDec() {
        return get(1).opDec();
    }

    public boolean opDiff(WDObjet wDObjet) {
        return get(1).opDiff(wDObjet);
    }

    public cb opDiv(WDObjet wDObjet) {
        return get(1).opDiv(wDObjet);
    }

    public boolean opEgal(WDObjet wDObjet) {
        return get(1).opEgal(wDObjet);
    }

    public boolean opEgalSouple(WDObjet wDObjet) {
        return get(1).opEgalSouple(wDObjet);
    }

    public boolean opEgalTresSouple(WDObjet wDObjet) {
        return get(1).opEgalTresSouple(wDObjet);
    }

    public cb opInc() {
        return get(1).opInc();
    }

    public boolean opInf(WDObjet wDObjet) {
        return get(1).opInf(wDObjet);
    }

    public boolean opInfEgal(WDObjet wDObjet) {
        return get(1).opInfEgal(wDObjet);
    }

    public cb opMoins(WDObjet wDObjet) {
        return get(1).opMoins(wDObjet);
    }

    public cb opMult(WDObjet wDObjet) {
        return get(1).opMult(wDObjet);
    }

    public cb opPlus(WDObjet wDObjet) {
        return get(1).opPlus(wDObjet);
    }

    public boolean opSup(WDObjet wDObjet) {
        return get(1).opSup(wDObjet);
    }

    public boolean opSupEgal(WDObjet wDObjet) {
        return get(1).opSupEgal(wDObjet);
    }

    public void setValeur(WDObjet wDObjet) {
        get(1).setValeur(wDObjet);
    }
}
