package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0782g;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.collection.C0582d;
import fr.pcsoft.wdjava.core.types.collection.WDFile;
import fr.pcsoft.wdjava.core.types.collection.WDPile;

public class WDAPICollection {
    /* renamed from: z */
    private static final String[] f1133z = new String[]{m1583z(m1584z("7\u0000\u000b8(F\u001a\u0013-'@\u001c\u000b<")), m1583z(m1584z("7\u0017\u001b81X\u0016")), m1583z(m1584z("7\u0017\u001b84U\u0010\u001b")), m1583z(m1584z("7\u0012\u0014'-@\u0016")), m1583z(m1584z("7\u0003\u0017$=K\u001a\u0010.7")), m1583z(m1584z("7\u001f\u0017;,Q\f\u0017&>[")), m1583z(m1584z("7\u0016\u001d 9Z\u0014\u001b74]\u0014\u0010-")), m1583z(m1584z("7\u0017\u001b84U\u0010\u001b74]\u0014\u0010-")), m1583z(m1584z("7\u0016\u0010.1X\u0016")), m1583z(m1584z("7\u0007\u001f*4Q\u0012\u000b7+A\u0003\u000e:1Y\u0016\u0001$1S\u001d\u001b")), m1583z(m1584z("7\u001a\u0010;=F\u0016\u0001$1S\u001d\u001b")), m1583z(m1584z("7\u001a\u0010;=F\u0016")), m1583z(m1584z("7\u0015\u0017$=K\u001a\u0010.7")), m1583z(m1584z("7\u0016\u001381X\u0016")), m1583z(m1584z("7\u0000\u000b8(F\u001a\u0013-")), m1583z(m1584z("7\u0010\u0016-*W\u001b\u001b")), m1583z(m1584z("7\u0007\f!=")), m1583z(m1584z("7\u0012\u0014'-@\u0016\u0001$1S\u001d\u001b")), m1583z(m1584z("7\u0015\u0011&;@\u001a\u0011&'Z\u001c\u00107<]\u0000\u000e'")), m1583z(m1584z("7\u0016\f:=A\u0001\u000189G\u0000\u001f/=K\u0003\u001f:9Y")), m1583z(m1584z("7\u0016\u0012-5Q\u001d\n76[\u001d\u0001)4X\u001c\u000b-")), m1583z(m1584z("7\u0007\u001f*4Q\u0012\u000b7;\\\u0016\f+0Q\f\u000e)*K\u0003\f';Q\u0017\u000b:="))};

    /* renamed from: a */
    private static final <T extends C0582d> T m1582a(WDObjet wDObjet, int i, Class<T> cls, boolean z) {
        T t = wDObjet != null ? (C0582d) wDObjet.checkType(cls) : null;
        if (t == null) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1133z[19], String.valueOf(i));
            String str = f1133z[18];
            String[] strArr2 = new String[1];
            strArr2[0] = wDObjet != null ? wDObjet.getNomType() : "";
            strArr[1] = C0745b.m3222b(str, strArr2);
            WDErreurManager.m2886a(strArr);
            return null;
        } else if (!z || t.mo2481f()) {
            return t;
        } else {
            WDErreurManager.m2883a(C0745b.m3222b(f1133z[20], new String[0]));
            return t;
        }
    }

    public static WDEntier4 ajoute(WDObjet wDObjet) {
        return ajoute(wDObjet, null);
    }

    public static WDEntier4 ajoute(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1133z[3]);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(m1582a(wDObjet, 1, C0582d.class, true).mo2475b(wDObjet2));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet ajouteLigne(WDObjet wDObjet, WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2775a(f1133z[17]);
        try {
            WDObjet wDEntier4 = new WDEntier4(m1582a(wDObjet, 1, C0582d.class, true).mo2464a(wDObjetArr));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 cherche(WDObjet wDObjet, int i, WDObjet[] wDObjetArr) {
        WDContexte a = C0677k.m2775a(f1133z[15]);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(m1582a(wDObjet, 1, C0582d.class, true).mo2467a(i, wDObjetArr));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet chercheParProcedure(WDObjet wDObjet, C0486m c0486m, int i) {
        return chercheParProcedure(wDObjet, c0486m, i, 1, new WDObjet[0]);
    }

    public static final WDObjet chercheParProcedure(WDObjet wDObjet, C0486m c0486m, int i, int i2) {
        return chercheParProcedure(wDObjet, c0486m, i, i2, new WDObjet[0]);
    }

    public static final WDObjet chercheParProcedure(WDObjet wDObjet, C0486m c0486m, int i, int i2, WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2775a(f1133z[21]);
        try {
            WDObjet wDEntier4 = new WDEntier4(m1582a(wDObjet, 1, C0582d.class, true).mo2468a(c0486m, i, i2, wDObjetArr));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen defile(WDObjet wDObjet) {
        return defile(wDObjet, null, 0, new WDEntier4(-1));
    }

    public static WDBooleen defile(WDObjet wDObjet, WDObjet wDObjet2) {
        return defile(wDObjet, wDObjet2, 0, new WDEntier4(-1));
    }

    public static WDBooleen defile(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        return defile(wDObjet, wDObjet2, i, new WDEntier4(-1));
    }

    public static WDBooleen defile(WDObjet wDObjet, WDObjet wDObjet2, int i, WDObjet wDObjet3) {
        int i2 = -1;
        boolean z = true;
        WDContexte a = C0677k.m2775a(f1133z[1]);
        try {
            WDFile wDFile = (WDFile) m1582a(wDObjet, 1, WDFile.class, true);
            int a2 = C0725i.m3013a(wDObjet3, C0782g.CENTISECOND);
            if (i != 1) {
                z = false;
            }
            if (a2 != -1) {
                i2 = a2 * 10;
            }
            WDBooleen wDBooleen = new WDBooleen(wDFile.m3322a(wDObjet2, z, i2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen depile(WDObjet wDObjet) {
        return depile(wDObjet, null, 0, new WDEntier4(-1));
    }

    public static WDBooleen depile(WDObjet wDObjet, WDObjet wDObjet2) {
        return depile(wDObjet, wDObjet2, 0, new WDEntier4(-1));
    }

    public static WDBooleen depile(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        return depile(wDObjet, wDObjet2, i, new WDEntier4(-1));
    }

    public static WDBooleen depile(WDObjet wDObjet, WDObjet wDObjet2, int i, WDObjet wDObjet3) {
        int i2 = -1;
        boolean z = true;
        WDContexte a = C0677k.m2775a(f1133z[1]);
        try {
            WDPile wDPile = (WDPile) m1582a(wDObjet, 1, WDPile.class, true);
            int a2 = C0725i.m3013a(wDObjet3, C0782g.CENTISECOND);
            if (i != 1) {
                z = false;
            }
            if (a2 != -1) {
                i2 = a2 * 10;
            }
            WDBooleen wDBooleen = new WDBooleen(wDPile.m3326b(wDObjet2, z, i2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final void deplace(WDObjet wDObjet, int i, int i2) {
        deplace(wDObjet, i, i2, 0);
    }

    public static final void deplace(WDObjet wDObjet, int i, int i2, int i3) {
        WDContexte a = C0677k.m2775a(f1133z[2]);
        try {
            C0582d a2 = m1582a(wDObjet, 1, C0582d.class, true);
            if (i3 == Integer.MIN_VALUE) {
                a2.mo2477b(i, i2);
            } else {
                a2.mo2472a(i, i2);
            }
            a.m2735v();
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static final void deplaceLigne(WDObjet wDObjet, int i, int i2) {
        deplaceLigne(wDObjet, i, i2, 0);
    }

    public static final void deplaceLigne(WDObjet wDObjet, int i, int i2, int i3) {
        WDContexte a = C0677k.m2775a(f1133z[7]);
        try {
            C0582d a2 = m1582a(wDObjet, 1, C0582d.class, true);
            if (i3 == Integer.MIN_VALUE) {
                a2.mo2477b(i, i2);
            } else {
                a2.mo2472a(i, i2);
            }
            a.m2735v();
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static final void echangeLigne(WDObjet wDObjet, int i, int i2) {
        WDContexte a = C0677k.m2775a(f1133z[6]);
        try {
            m1582a(wDObjet, 1, C0582d.class, true).mo2477b(i, i2);
        } finally {
            a.m2735v();
        }
    }

    public static void empile(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1133z[13]);
        try {
            ((WDPile) m1582a(wDObjet, 1, WDPile.class, true)).m3331e(wDObjet2);
        } finally {
            a.m2735v();
        }
    }

    public static void enfile(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1133z[8]);
        try {
            ((WDFile) m1582a(wDObjet, 1, WDFile.class, true)).m3331e(wDObjet2);
        } finally {
            a.m2735v();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static fr.pcsoft.wdjava.core.WDObjet fileInfo(fr.pcsoft.wdjava.core.WDObjet r4, int r5) {
        /*
        r0 = f1133z;
        r1 = 12;
        r0 = r0[r1];
        r2 = fr.pcsoft.wdjava.core.context.C0677k.m2775a(r0);
        r0 = 1;
        r1 = fr.pcsoft.wdjava.core.types.collection.C0753g.class;
        r3 = 1;
        r0 = m1582a(r4, r0, r1, r3);	 Catch:{ all -> 0x003c }
        r0 = (fr.pcsoft.wdjava.core.types.collection.C0753g) r0;	 Catch:{ all -> 0x003c }
        switch(r5) {
            case 3: goto L_0x002e;
            case 7: goto L_0x0020;
            default: goto L_0x0017;
        };	 Catch:{ all -> 0x003c }
    L_0x0017:
        r0 = new fr.pcsoft.wdjava.core.types.WDChaine;	 Catch:{ all -> 0x003c }
        r0.<init>();	 Catch:{ all -> 0x003c }
        r2.m2735v();
    L_0x001f:
        return r0;
    L_0x0020:
        r1 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ all -> 0x003c }
        r0 = r0.m3336i();	 Catch:{ all -> 0x003c }
        r1.<init>(r0);	 Catch:{ all -> 0x003c }
        r2.m2735v();
        r0 = r1;
        goto L_0x001f;
    L_0x002e:
        r1 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ all -> 0x003c }
        r0 = r0.mo2487d();	 Catch:{ all -> 0x003c }
        r1.<init>(r0);	 Catch:{ all -> 0x003c }
        r2.m2735v();
        r0 = r1;
        goto L_0x001f;
    L_0x003c:
        r0 = move-exception;
        r2.m2735v();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.api.WDAPICollection.fileInfo(fr.pcsoft.wdjava.core.WDObjet, int):fr.pcsoft.wdjava.core.WDObjet");
    }

    public static void insere(WDObjet wDObjet, WDObjet wDObjet2) {
        insere(wDObjet, null);
    }

    public static void insere(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        WDContexte a = C0677k.m2775a(f1133z[11]);
        try {
            m1582a(wDObjet, 1, C0582d.class, true).mo2474a(wDObjet3, wDObjet2);
        } finally {
            a.m2735v();
        }
    }

    public static final void insereLigne(WDObjet wDObjet, WDObjet wDObjet2, WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2775a(f1133z[10]);
        try {
            m1582a(wDObjet, 1, C0582d.class, true).mo2466a(wDObjet2, wDObjetArr);
        } finally {
            a.m2735v();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static fr.pcsoft.wdjava.core.WDObjet listeInfo(fr.pcsoft.wdjava.core.WDObjet r4, int r5) {
        /*
        r0 = f1133z;
        r1 = 5;
        r0 = r0[r1];
        r2 = fr.pcsoft.wdjava.core.context.C0677k.m2775a(r0);
        r0 = 1;
        r1 = fr.pcsoft.wdjava.core.types.collection.C0753g.class;
        r3 = 1;
        r0 = m1582a(r4, r0, r1, r3);	 Catch:{ all -> 0x003b }
        r0 = (fr.pcsoft.wdjava.core.types.collection.C0753g) r0;	 Catch:{ all -> 0x003b }
        switch(r5) {
            case 3: goto L_0x002d;
            case 7: goto L_0x001f;
            default: goto L_0x0016;
        };	 Catch:{ all -> 0x003b }
    L_0x0016:
        r0 = new fr.pcsoft.wdjava.core.types.WDChaine;	 Catch:{ all -> 0x003b }
        r0.<init>();	 Catch:{ all -> 0x003b }
        r2.m2735v();
    L_0x001e:
        return r0;
    L_0x001f:
        r1 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ all -> 0x003b }
        r0 = r0.m3336i();	 Catch:{ all -> 0x003b }
        r1.<init>(r0);	 Catch:{ all -> 0x003b }
        r2.m2735v();
        r0 = r1;
        goto L_0x001e;
    L_0x002d:
        r1 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ all -> 0x003b }
        r0 = r0.mo2487d();	 Catch:{ all -> 0x003b }
        r1.<init>(r0);	 Catch:{ all -> 0x003b }
        r2.m2735v();
        r0 = r1;
        goto L_0x001e;
    L_0x003b:
        r0 = move-exception;
        r2.m2735v();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.api.WDAPICollection.listeInfo(fr.pcsoft.wdjava.core.WDObjet, int):fr.pcsoft.wdjava.core.WDObjet");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static fr.pcsoft.wdjava.core.WDObjet pileInfo(fr.pcsoft.wdjava.core.WDObjet r4, int r5) {
        /*
        r0 = f1133z;
        r1 = 4;
        r0 = r0[r1];
        r2 = fr.pcsoft.wdjava.core.context.C0677k.m2775a(r0);
        r0 = 1;
        r1 = fr.pcsoft.wdjava.core.types.collection.C0753g.class;
        r3 = 1;
        r0 = m1582a(r4, r0, r1, r3);	 Catch:{ all -> 0x003b }
        r0 = (fr.pcsoft.wdjava.core.types.collection.C0753g) r0;	 Catch:{ all -> 0x003b }
        switch(r5) {
            case 3: goto L_0x002d;
            case 7: goto L_0x001f;
            default: goto L_0x0016;
        };	 Catch:{ all -> 0x003b }
    L_0x0016:
        r0 = new fr.pcsoft.wdjava.core.types.WDChaine;	 Catch:{ all -> 0x003b }
        r0.<init>();	 Catch:{ all -> 0x003b }
        r2.m2735v();
    L_0x001e:
        return r0;
    L_0x001f:
        r1 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ all -> 0x003b }
        r0 = r0.m3336i();	 Catch:{ all -> 0x003b }
        r1.<init>(r0);	 Catch:{ all -> 0x003b }
        r2.m2735v();
        r0 = r1;
        goto L_0x001e;
    L_0x002d:
        r1 = new fr.pcsoft.wdjava.core.types.WDEntier4;	 Catch:{ all -> 0x003b }
        r0 = r0.mo2487d();	 Catch:{ all -> 0x003b }
        r1.<init>(r0);	 Catch:{ all -> 0x003b }
        r2.m2735v();
        r0 = r1;
        goto L_0x001e;
    L_0x003b:
        r0 = move-exception;
        r2.m2735v();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.api.WDAPICollection.pileInfo(fr.pcsoft.wdjava.core.WDObjet, int):fr.pcsoft.wdjava.core.WDObjet");
    }

    public static WDObjet supprime(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1133z[14]);
        try {
            WDObjet wDEntier4 = new WDEntier4(m1582a(wDObjet, 1, C0582d.class, true).mo2478c(wDObjet2));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final void supprimeLigne(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(f1133z[9]);
        try {
            m1582a(wDObjet, 1, C0582d.class, true).mo2465a(wDObjet2);
        } finally {
            a.m2735v();
        }
    }

    public static void supprimeTout(WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(f1133z[0]);
        try {
            m1582a(wDObjet, 1, C0582d.class, true).mo2480e();
        } finally {
            a.m2735v();
        }
    }

    public static void trie(WDObjet wDObjet) {
        trie(wDObjet, 1);
    }

    public static void trie(WDObjet wDObjet, int i) {
        trie(wDObjet, i, null);
    }

    public static void trie(WDObjet wDObjet, int i, C0486m c0486m) {
        WDContexte a = C0677k.m2775a(f1133z[16]);
        try {
            m1582a(wDObjet, 1, C0582d.class, true).mo2473a(i, c0486m);
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1583z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 20;
                    break;
                case 1:
                    i2 = 83;
                    break;
                case 2:
                    i2 = 94;
                    break;
                case 3:
                    i2 = 104;
                    break;
                default:
                    i2 = C0607n.co;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1584z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.co);
        }
        return toCharArray;
    }
}
