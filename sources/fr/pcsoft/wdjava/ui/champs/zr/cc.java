package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.dc;
import fr.pcsoft.wdjava.ui.champs.ec;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.table.colonne.C1278a;

public class cc extends ec {
    /* renamed from: z */
    private static final String f3840z = m9040z(m9041z("%*[JO&1E^O=1"));
    /* renamed from: f */
    private boolean f3841f = true;
    /* renamed from: g */
    private lc f3842g;

    public cc(lc lcVar, gc gcVar, int i) {
        super(gcVar, i);
        this.f3842g = lcVar;
    }

    /* renamed from: z */
    private static String m9040z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 114;
                    break;
                case 1:
                    i2 = 110;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 11;
                    break;
                default:
                    i2 = 27;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9041z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 27);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected WDObjet mo3530a(EWDPropriete eWDPropriete) {
        WDObjet b;
        dc attribut = this.e.getAttribut(eWDPropriete);
        if (attribut != null) {
            try {
                if (attribut instanceof WDAttributZR) {
                    ec b2 = m9046b();
                    if (b2 != null) {
                        b = b2.m9107b(((WDAttributZR) attribut).getIndiceAttribut());
                        if (b != null) {
                            return b;
                        }
                    }
                }
            } catch (WDException e) {
                throw e;
            }
        }
        if (attribut != null) {
            b = attribut.getValeurDefautAttribut();
            if (b != null) {
                return b;
            }
        }
        return this.e.getValeurPropriete(eWDPropriete);
    }

    /* renamed from: a */
    public C0489p mo3531a() {
        return this.f3842g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected void mo3532a(fr.pcsoft.wdjava.core.EWDPropriete r5, fr.pcsoft.wdjava.core.WDObjet r6) {
        /*
        r4 = this;
        r1 = r4.e;
        r2 = r1.getAttribut(r5);
        r1 = r4.f3841f;	 Catch:{ WDException -> 0x0062 }
        if (r1 == 0) goto L_0x003d;
    L_0x000a:
        if (r2 == 0) goto L_0x0010;
    L_0x000c:
        r1 = r2 instanceof fr.pcsoft.wdjava.ui.champs.zr.WDAttributZR;	 Catch:{ WDException -> 0x0064 }
        if (r1 != 0) goto L_0x003d;
    L_0x0010:
        r1 = r4.f3842g;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = f3840z;
        r2 = r2.append(r3);
        r3 = r4.e;
        r3 = r3.getName();
        r2 = r2.append(r3);
        r3 = r5.ordinal();
        r3 = java.lang.String.valueOf(r3);
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = r4.e;
        r2 = r1.creerAttribut(r2, r5, r3);
    L_0x003d:
        if (r2 == 0) goto L_0x0068;
    L_0x003f:
        r3 = r4.m9046b();
        if (r3 == 0) goto L_0x0061;
    L_0x0045:
        r0 = r2;
        r0 = (fr.pcsoft.wdjava.ui.champs.zr.WDAttributZR) r0;	 Catch:{ WDException -> 0x0066 }
        r1 = r0;
        r1 = r1.getIndiceAttribut();	 Catch:{ WDException -> 0x0066 }
        r3.m9101a(r1, r6);	 Catch:{ WDException -> 0x0066 }
        r1 = r4.f3842g;	 Catch:{ WDException -> 0x0066 }
        r2 = (fr.pcsoft.wdjava.ui.champs.zr.WDAttributZR) r2;	 Catch:{ WDException -> 0x0066 }
        r3 = r4.d;	 Catch:{ WDException -> 0x0066 }
        r1.notifModifValeurAttribut(r2, r3, r6);	 Catch:{ WDException -> 0x0066 }
        r1 = r4.f3842g;	 Catch:{ WDException -> 0x0066 }
        r2 = r4.d;	 Catch:{ WDException -> 0x0066 }
        r3 = 1;
        r1.redessinerCellule(r2, r3);	 Catch:{ WDException -> 0x0066 }
    L_0x0061:
        return;
    L_0x0062:
        r1 = move-exception;
        throw r1;	 Catch:{ WDException -> 0x0064 }
    L_0x0064:
        r1 = move-exception;
        throw r1;
    L_0x0066:
        r1 = move-exception;
        throw r1;
    L_0x0068:
        r1 = r4.e;
        r1.affecterPropriete(r5, r6);
        r1 = r4.f3842g;
        r2 = r4.e;
        r1.onChampPropertyValueChanged(r2, r5, r6);
        goto L_0x0061;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.champs.zr.cc.a(fr.pcsoft.wdjava.core.EWDPropriete, fr.pcsoft.wdjava.core.WDObjet):void");
    }

    /* renamed from: a */
    public final void m9045a(boolean z) {
        this.f3841f = z;
    }

    /* renamed from: b */
    protected ec m9046b() {
        return (ec) this.f3842g.get(C0725i.m3069e(this.d));
    }

    public void prendreFocus() throws WDException {
        C1278a tableColumn = this.e.getTableColumn();
        if (tableColumn != null) {
            try {
                tableColumn.editCell(this.d);
            } catch (WDException e) {
                throw e;
            }
        }
    }
}
