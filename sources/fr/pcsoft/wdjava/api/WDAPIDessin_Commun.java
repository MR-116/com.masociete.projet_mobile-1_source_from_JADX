package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0663e;
import fr.pcsoft.wdjava.core.p035c.C0666h;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.collection.tableau.C0758k;
import fr.pcsoft.wdjava.ui.C1489s;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0509v;
import fr.pcsoft.wdjava.ui.champs.image.C0520c;
import fr.pcsoft.wdjava.ui.dessin.C0519e;
import fr.pcsoft.wdjava.ui.dessin.C0544g;
import fr.pcsoft.wdjava.ui.dessin.WDImage;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1336b;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p064a.C1032b;
import fr.pcsoft.wdjava.ui.utils.C1502a;
import fr.pcsoft.wdjava.ui.utils.C1508i;

public class WDAPIDessin_Commun {
    /* renamed from: a */
    private static int f1139a = 0;
    /* renamed from: b */
    protected static C0519e f1140b = null;
    /* renamed from: c */
    protected static final int f1141c = 4;
    /* renamed from: d */
    protected static C0544g f1142d = null;
    /* renamed from: z */
    private static final String[] f1143z = new String[]{m1603z(m1604z("|\b?\u0017\u0016\u000f\u0005%\u000b\u0010\u0012\r'\u0011")), m1603z(m1604z("|\b?\u001d\u0017\u001c\u001e5\u0007\r\u001a\u0013#\u001b\f\u0013\t5\u0006")), m1603z(m1604z("|\b?\u0017\u0016\u000f\u0005%\u000b\u0010\u0012\r'\u0011\u0006\u001a\u000f2\u0015\u0017")), m1603z(m1604z("|\b?\u0006\u001c\u001c\u0018!\u001a\u001e\u0013\t")), m1603z(m1604z("|\b0\u001d\u0001\u001a\u0000?\u001b\t\u001e\u000f)\u0000\u001c")), m1603z(m1604z("|\b?\u0018\u0010\u0018\u0002%")), m1603z(m1604z("|\n/\u0006\u0014\u001e\u0018?\u001d\u0014\u001e\u000b%\u000b\u0010\u0011\u001a!\u0018\u0010\u001b\t")), m1603z(m1604z("|\b?\u0017\u0011\u001e\u001e'\u0011\u0006\u0016\u0001!\u0013\u001c")), m1603z(m1604z("D\u0007")), m1603z(m1604z("|\b?\u0015\u000b\u001c")), m1603z(m1604z("|\b?\u0006\u001c\u001c\u0018!\u001a\u001e\u0013\t?\u0010\u001c\u0018\u001e!\u0010\u001c")), m1603z(m1604z("|\b?\u0006\u001c\u0012\u001c,\u001d\n\f\r'\u0011")), m1603z(m1604z("|\b?\u0017\u0011\u001e\u0002'\u0011\u0006\u0012\u0003$\u0011")), m1603z(m1604z("|\b0\u001d\u0001\u001a\u0000?\u0017\u0016\n\u0000%\u0001\u000b")), m1603z(m1604z("|\b?\u0019\u0016\u001b\u0005&\u001d\u001c\u0000\u001f!\u0000\f\r\r4\u001d\u0016\u0011")), m1603z(m1604z("|\b?\u0012\u0010\u0011\u0013$\u0011\n\f\u0005.")), m1603z(m1604z("u\t.t\u0014\u001a\u0001/\u001d\u000b\u001af")), m1603z(m1604z("|\b?\u0007\u0018\n\u001a%\u000b\u0010\u0012\r'\u0011\u0006\u000f\u0002'")), m1603z(m1604z("/\"\u0007")), m1603z(m1604z("|\b?\u0007\u0000\u0012\t4\u0006\u0010\u001a\u0013(\u001b\u000b\u0016\u0016/\u001a\r\u001e\u0000%")), m1603z(m1604z("|\b?\u0006\u0016\u000b\r4\u001d\u0016\u0011")), m1603z(m1604z("|\u0002\"\u000b\t\u0010\u0005.\u0000\u0006\u0016\u0002#\u001b\u000b\r\t#\u0000")), m1603z(m1604z("|\n/\u0006\u0014\u001e\u0018?\u0000\u0018\u001d\u0000%\u0015\f\u0000\u0005.\u0002\u0018\u0013\u0005$\u0011\u0006\u001b\u001c/\u0018\u0000\u0018\u0003.\u0011")), m1603z(m1604z("|\b?\u0004\u0016\u0013\u0015'\u001b\u0017\u001a")), m1603z(m1604z("|\b?\u0010\u001c\u001d\u00194\u000b\u001d\u001a\u001f3\u001d\u0017")), m1603z(m1604z("|\t2\u0006\u001c\n\u001e?\u0004\u0018\f\u001f!\u0013\u001c\u0000\u001c!\u0006\u0018\u0012")), m1603z(m1604z("|\b?\u0007\u0000\u0012\t4\u0006\u0010\u001a\u00136\u0011\u000b\u000b\u0005#\u0015\u0015\u001a")), m1603z(m1604z("|\b?\u0017\u0016\r\b%")), m1603z(m1604z("|\b?\u001d\u0017\t\t2\u0007\u001c\u0000\u000f/\u0001\u0015\u001a\u00192")), m1603z(m1604z("|\b?\u0019\u0016\u001b\u0005&\u001d\u001c\u0000\u0018%\u001d\u0017\u000b\t")), m1603z(m1604z("|\b?\u0012\u0016\u0011\b")), m1603z(m1604z("|\b?\u0017\u001c\r\u000f,\u0011")), m1603z(m1604z("|\b?\u0000\u001c\u0007\u0018%")), m1603z(m1604z("|\u00183\u0018")), m1603z(m1604z("|\t2\u0006\u0006\u000b\t)\u001a\r\u001a\u0013)\u001a\u000f\u001e\u0000)\u0010\u001c")), m1603z(m1604z("|\t2\u0006\u0006\f\r4\u000b\u0010\u0011\u001a!\u0018\u0010\u001b\t")), m1603z(m1604z("|\t2\u0006\u0006\u0013\u0019-\u000b\u0010\u0011\u001a!\u0018\u0010\u001b\t")), m1603z(m1604z("|\b?\u0012\f\f\u0005/\u001a\u0017\u001a")), m1603z(m1604z("5<\u0007")), m1603z(m1604z("|\b3\u0015\f\t\t?\u001d\u0014\u001e\u000b%\u000b\u0013\u000f\t'")), m1603z(m1604z("|\b?\u0004\u0016\u0013\u0005#\u0011")), m1603z(m1604z("|\b?\u0019\u0016\u001b\u0005&\u001d\u001c\u0000\u00005\u0019\u0010\u0011\u00033\u001d\r\u001a")), m1603z(m1604z("|\b?\u0006\u001c\u001b\u0005-\u0011\u0017\f\u0005/\u001a\u0017\u001a")), m1603z(m1604z("|\b?\u0010\u001c\u001c\u00035\u0004\u001c")), m1603z(m1604z("|\b?\u0019\u0016\u001b\u0005&\u001d\u001c\u0000\u00183\u0018")), m1603z(m1604z("|\b?\u0004\u0016\u0016\u00024")), m1603z(m1604z("|\b?\u0007\r\u0006\u0000/"))};

    /* renamed from: a */
    protected static final C0519e m1596a(WDObjet wDObjet, int i) {
        String[] strArr;
        C0519e c0519e = (C0519e) wDObjet.checkType(C0519e.class);
        if (c0519e == null) {
            try {
                c0519e = (C0519e) C1502a.m10417a(wDObjet, C0520c.class);
            } catch (C0666h e) {
                strArr = new String[2];
                strArr[0] = C0745b.m3222b(f1143z[25], String.valueOf(i));
                strArr[1] = e.getMessage();
                WDErreurManager.m2886a(strArr);
            } catch (C0663e e2) {
                strArr = new String[2];
                strArr[0] = C0745b.m3222b(f1143z[25], String.valueOf(i));
                strArr[1] = e2.m2671a(1010);
                WDErreurManager.m2886a(strArr);
            }
        }
        return c0519e;
    }

    /* renamed from: a */
    protected static final void m1597a() {
        f1142d = null;
        f1140b = null;
        f1139a = 0;
    }

    /* renamed from: a */
    private static final boolean m1598a(C0519e c0519e, C0519e c0519e2, int i, int i2, int i3) {
        int[] iArr = new int[]{i, i2, i3};
        if (m1600a(iArr)) {
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            if (c0519e == c0519e2 || c0519e2 == null) {
                C0544g imageMemoire = c0519e.getImageMemoire(1);
                if (imageMemoire != null) {
                    return imageMemoire.mo2336a(i4, i5, i6);
                }
            }
            C1336b imagePeintre = c0519e.getImagePeintre(0, true);
            if (imagePeintre != null && imagePeintre.mo3721a(i4, i5, i6)) {
                c0519e2.setImagePeintre(imagePeintre);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static final boolean m1599a(fr.pcsoft.wdjava.ui.dessin.C0519e r7, fr.pcsoft.wdjava.ui.dessin.C0519e r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17) {
        /*
        r3 = 0;
        switch(r9) {
            case -1: goto L_0x000b;
            case 10: goto L_0x0023;
            default: goto L_0x0004;
        };
    L_0x0004:
        r1 = r3;
    L_0x0005:
        if (r1 == 0) goto L_0x000a;
    L_0x0007:
        r7.majAffichage();
    L_0x000a:
        return r1;
    L_0x000b:
        r1 = 2;
        r2 = 0;
        r2 = r8.getImagePeintre(r1, r2);
        if (r2 == 0) goto L_0x0004;
    L_0x0013:
        r1 = 1;
        r1 = r7.getImageMemoire(r1);
        r3 = r14;
        r4 = r15;
        r5 = r16;
        r6 = r17;
        r1 = r1.mo2343b(r2, r3, r4, r5, r6);
        goto L_0x0005;
    L_0x0023:
        if (r8 != 0) goto L_0x007f;
    L_0x0025:
        r2 = fr.pcsoft.wdjava.ui.utils.C1508i.m10481a();
    L_0x0029:
        if (r2 == 0) goto L_0x0004;
    L_0x002b:
        r1 = 0;
        r1 = java.lang.Math.max(r1, r10);
        r4 = 0;
        r4 = java.lang.Math.max(r4, r11);
        if (r12 < 0) goto L_0x003d;
    L_0x0037:
        r5 = r2.mo3727d();
        if (r12 <= r5) goto L_0x0041;
    L_0x003d:
        r12 = r2.mo3727d();
    L_0x0041:
        if (r13 < 0) goto L_0x004b;
    L_0x0043:
        r5 = r2.mo3725b();
        r0 = r17;
        if (r0 <= r5) goto L_0x004f;
    L_0x004b:
        r13 = r2.mo3725b();
    L_0x004f:
        if (r1 != 0) goto L_0x005f;
    L_0x0051:
        if (r4 != 0) goto L_0x005f;
    L_0x0053:
        r5 = r2.mo3727d();
        if (r12 != r5) goto L_0x005f;
    L_0x0059:
        r5 = r2.mo3725b();
        if (r13 == r5) goto L_0x0063;
    L_0x005f:
        r2 = r2.mo3717a(r1, r4, r12, r13);
    L_0x0063:
        r1 = 1;
        r1 = r7.getImageMemoire(r1);
        if (r1 == 0) goto L_0x0004;
    L_0x006a:
        if (r16 >= 0) goto L_0x008c;
    L_0x006c:
        r5 = r1.mo2339b();
    L_0x0070:
        if (r17 >= 0) goto L_0x0089;
    L_0x0072:
        r6 = r1.mo2344c();
    L_0x0076:
        if (r2 == 0) goto L_0x0086;
    L_0x0078:
        r3 = r14;
        r4 = r15;
        r1 = r1.mo2338a(r2, r3, r4, r5, r6);
        goto L_0x0005;
    L_0x007f:
        r1 = 0;
        r2 = 0;
        r2 = r8.getImagePeintre(r1, r2);
        goto L_0x0029;
    L_0x0086:
        r1 = 1;
        goto L_0x0005;
    L_0x0089:
        r6 = r17;
        goto L_0x0076;
    L_0x008c:
        r5 = r16;
        goto L_0x0070;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.api.WDAPIDessin_Commun.a(fr.pcsoft.wdjava.ui.dessin.e, fr.pcsoft.wdjava.ui.dessin.e, int, int, int, int, int, int, int, int, int):boolean");
    }

    /* renamed from: a */
    private static final boolean m1600a(int[] iArr) {
        iArr[0] = Math.min(360, Math.max(-360, iArr[0]));
        iArr[1] = Math.min(100, Math.max(-100, iArr[1]));
        iArr[2] = Math.min(100, Math.max(-100, iArr[2]));
        return true;
    }

    /* renamed from: b */
    protected static final C0520c m1601b(WDObjet wDObjet, int i) {
        String[] strArr;
        try {
            return (C0520c) C1502a.m10417a(wDObjet, C0520c.class);
        } catch (C0666h e) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1143z[25], String.valueOf(i));
            strArr[1] = e.getMessage();
            WDErreurManager.m2886a(strArr);
            return null;
        } catch (C0663e e2) {
            strArr = new String[2];
            strArr[0] = C0745b.m3222b(f1143z[25], String.valueOf(i));
            strArr[1] = e2.m2671a(1010);
            WDErreurManager.m2886a(strArr);
            return null;
        }
    }

    /* renamed from: b */
    protected static final C0544g m1602b() {
        if (f1142d != null && !f1142d.mo2351f()) {
            return f1142d;
        }
        if (!(f1140b == null || ((f1140b instanceof C0520c) && ((C0520c) f1140b).isReleased()))) {
            f1142d = f1140b.getImageMemoire(f1139a);
            if (f1142d != null) {
                return f1142d;
            }
        }
        return new C0545c();
    }

    public static WDEntier4 couleurLuminosite(int i) {
        return new WDEntier4(C1031a.m7464h(C1031a.m7465i(i))[2]);
    }

    public static WDEntier4 couleurSaturation(int i) {
        return new WDEntier4(C1031a.m7464h(C1031a.m7465i(i))[1]);
    }

    public static WDEntier4 couleurTeinte(int i) {
        return new WDEntier4(C1031a.m7464h(C1031a.m7465i(i))[0]);
    }

    public static void dArc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        dArc(i, i2, i3, i4, i5, i6, i7, i8, C1032b.f2968a);
    }

    public static synchronized void dArc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[9], 4);
            try {
                m1602b().mo2330a(i, i2, i3, i4, i5, i6, i7, i8, C1032b.f2968a, i9, 1);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static void dCercle(int i, int i2, int i3, int i4) {
        dCercle(i, i2, i3, i4, C1032b.f2968a, C1032b.f2968a);
    }

    public static void dCercle(int i, int i2, int i3, int i4, int i5) {
        dCercle(i, i2, i3, i4, i5, C1032b.f2968a);
    }

    public static synchronized void dCercle(int i, int i2, int i3, int i4, int i5, int i6) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[31], 4);
            try {
                m1602b().mo2328a(i, i2, i3, i4, i5, i6);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static synchronized void dChangeMode(int i) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[12], 4);
            try {
                C0544g b = m1602b();
                switch (i) {
                    case 7:
                        b.mo2342b(true);
                        break;
                    case 13:
                        b.mo2342b(false);
                        b.mo2334a(false);
                        break;
                    case 256:
                        b.mo2334a(true);
                        break;
                }
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static final WDObjet dChargeImage(WDObjet wDObjet) {
        return dChargeImage(wDObjet, 0, -1, -1);
    }

    public static final WDObjet dChargeImage(WDObjet wDObjet, int i) {
        return dChargeImage(wDObjet, i, -1, -1);
    }

    public static final WDObjet dChargeImage(WDObjet wDObjet, int i, int i2) {
        return dChargeImage(wDObjet, i, i2, -1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final fr.pcsoft.wdjava.core.WDObjet dChargeImage(fr.pcsoft.wdjava.core.WDObjet r4, int r5, int r6, int r7) {
        /*
        r0 = f1143z;
        r1 = 7;
        r0 = r0[r1];
        r1 = 4;
        r2 = fr.pcsoft.wdjava.core.context.C0677k.m2776a(r0, r1);
        r0 = new fr.pcsoft.wdjava.ui.dessin.WDImage;
        r0.<init>();
        r0.mo3680a(r4, r6, r7, r5);	 Catch:{ s -> 0x002e }
        r1 = r0.m9566s();	 Catch:{ s -> 0x002e }
        if (r1 != 0) goto L_0x002a;
    L_0x0018:
        r1 = f1143z;	 Catch:{ s -> 0x002e }
        r3 = 6;
        r1 = r1[r3];	 Catch:{ s -> 0x002e }
        r3 = 0;
        r3 = new java.lang.String[r3];	 Catch:{ s -> 0x002e }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r3);	 Catch:{ s -> 0x002e }
        r3 = 610001; // 0x94ed1 float:8.54793E-40 double:3.013805E-318;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2878a(r2, r1, r3);	 Catch:{ s -> 0x002e }
    L_0x002a:
        r2.m2735v();
    L_0x002d:
        return r0;
    L_0x002e:
        r1 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2876a(r2, r1);	 Catch:{ all -> 0x0036 }
        r2.m2735v();
        goto L_0x002d;
    L_0x0036:
        r0 = move-exception;
        r2.m2735v();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.api.WDAPIDessin_Commun.dChargeImage(fr.pcsoft.wdjava.core.WDObjet, int, int, int):fr.pcsoft.wdjava.core.WDObjet");
    }

    public static WDBooleen dCopie(WDObjet wDObjet, WDObjet wDObjet2) {
        return dCopie(wDObjet, wDObjet2, -1, -1, -1, -1, -1, -1, -1, -1);
    }

    public static WDBooleen dCopie(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        return dCopie(wDObjet, wDObjet2, i, -1, -1, -1, -1, -1, -1, -1);
    }

    public static WDBooleen dCopie(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2) {
        return dCopie(wDObjet, wDObjet2, i, i2, -1, -1, -1, -1, -1, -1);
    }

    public static WDBooleen dCopie(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3) {
        return dCopie(wDObjet, wDObjet2, i, i2, i3, -1, -1, -1, -1, -1);
    }

    public static WDBooleen dCopie(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3, int i4) {
        return dCopie(wDObjet, wDObjet2, i, i2, i3, i4, -1, -1, -1, -1);
    }

    public static WDBooleen dCopie(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3, int i4, int i5) {
        return dCopie(wDObjet, wDObjet2, i, i2, i3, i4, i5, -1, -1, -1);
    }

    public static WDBooleen dCopie(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3, int i4, int i5, int i6) {
        return dCopie(wDObjet, wDObjet2, i, i2, i3, i4, i5, i6, -1, -1);
    }

    public static WDBooleen dCopie(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return dCopie(wDObjet, wDObjet2, i, i2, i3, i4, i5, i6, i7, -1);
    }

    public static synchronized WDBooleen dCopie(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        WDBooleen wDBooleen;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[0], 4);
            try {
                wDBooleen = new WDBooleen(m1599a(m1596a(wDObjet2, 2), m1596a(wDObjet, 1), 10, i, i2, i3, i4, i5, i6, i7, i8));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static WDBooleen dCopieImage(WDObjet wDObjet, WDObjet wDObjet2) {
        return dCopieImage(wDObjet, wDObjet2, 10, -1, -1, -1, -1, -1, -1, -1, -1);
    }

    public static WDBooleen dCopieImage(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        return dCopieImage(wDObjet, wDObjet2, i, -1, -1, -1, -1, -1, -1, -1, -1);
    }

    public static WDBooleen dCopieImage(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2) {
        return dCopieImage(wDObjet, wDObjet2, i, i2, -1, -1, -1, -1, -1, -1, -1);
    }

    public static WDBooleen dCopieImage(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3) {
        return dCopieImage(wDObjet, wDObjet2, i, i2, i3, -1, -1, -1, -1, -1, -1);
    }

    public static WDBooleen dCopieImage(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3, int i4) {
        return dCopieImage(wDObjet, wDObjet2, i, i2, i3, i4, -1, -1, -1, -1, -1);
    }

    public static WDBooleen dCopieImage(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3, int i4, int i5) {
        return dCopieImage(wDObjet, wDObjet2, i, i2, i3, i4, i5, -1, -1, -1, -1);
    }

    public static WDBooleen dCopieImage(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3, int i4, int i5, int i6) {
        return dCopieImage(wDObjet, wDObjet2, i, i2, i3, i4, i5, i6, -1, -1, -1);
    }

    public static WDBooleen dCopieImage(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return dCopieImage(wDObjet, wDObjet2, i, i2, i3, i4, i5, i6, i7, -1, -1);
    }

    public static WDBooleen dCopieImage(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return dCopieImage(wDObjet, wDObjet2, i, i2, i3, i4, i5, i6, i7, i8, -1);
    }

    public static synchronized WDBooleen dCopieImage(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        WDBooleen wDBooleen;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[0], 4);
            C0519e c0519e = null;
            try {
                int i10;
                if (wDObjet.isNumerique() && wDObjet.opEgal(1)) {
                    i10 = 10;
                } else {
                    c0519e = m1596a(wDObjet, 1);
                    i10 = i;
                }
                wDBooleen = new WDBooleen(m1599a(m1596a(wDObjet2, 2), c0519e, i10, i2, i3, i5, i4, i6, i7, i9, i8));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static final WDObjet dCopieImageEcran() {
        return dCopieImageEcran();
    }

    public static final WDObjet dCopieImageEcran(int i) {
        return dCopieImageEcran(i, -1, -1, -1);
    }

    public static final WDObjet dCopieImageEcran(int i, int i2) {
        return dCopieImageEcran(i, i2, -1, -1);
    }

    public static final WDObjet dCopieImageEcran(int i, int i2, int i3) {
        return dCopieImageEcran(i, i2, i3, -1);
    }

    public static final WDObjet dCopieImageEcran(int i, int i2, int i3, int i4) {
        WDContexte a = C0677k.m2776a(f1143z[2], 4);
        try {
            WDObjet wDImage;
            C1336b a2 = C1508i.m10481a();
            if (a2 != null) {
                int d = a2.mo3727d();
                int b = a2.mo3725b();
                int max = Math.max(0, Math.min(d, i));
                int max2 = Math.max(0, Math.min(b, i2));
                int max3 = i3 < 0 ? d : Math.max(0, Math.min(d, i3));
                int max4 = i4 < 0 ? b : Math.max(0, Math.min(b, i4));
                C1336b a3 = (max == 0 && max2 == 0 && max3 == d && max4 == b) ? a2 : a2.mo3717a(max, max2, max3, max4);
                wDImage = new WDImage(a3);
            } else {
                wDImage = new WDImage();
                a.m2735v();
            }
            return wDImage;
        } finally {
            a.m2735v();
        }
    }

    public static void dCorde(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        dCorde(i, i2, i3, i4, i5, i6, i7, i8, C1032b.f2968a, C1032b.f2968a);
    }

    public static void dCorde(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        dCorde(i, i2, i3, i4, i5, i6, i7, i8, i9, C1032b.f2968a);
    }

    public static synchronized void dCorde(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[27], 4);
            try {
                m1602b().mo2330a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, 2);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static WDEntier4 dDebutDessin(WDObjet wDObjet) {
        return dDebutDessin(wDObjet, 0);
    }

    public static synchronized WDEntier4 dDebutDessin(WDObjet wDObjet, int i) {
        WDEntier4 wDEntier4;
        boolean z = true;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[24], 4);
            try {
                C0519e a2 = m1596a(wDObjet, 1);
                f1140b = a2;
                f1139a = i;
                f1142d = a2.getImageMemoire(i);
                if (f1142d != null) {
                    f1142d.mo2347c((i & 2) == 2);
                }
                if (f1142d == null) {
                    z = false;
                }
                wDEntier4 = new WDEntier4(z);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDEntier4;
    }

    public static final WDObjet dDecoupe(WDObjet wDObjet, int i, int i2, int i3, int i4) {
        WDContexte a = C0677k.m2776a(f1143z[43], 4);
        try {
            WDObjet wDImage;
            C1336b imagePeintre = m1596a(wDObjet, 1).getImagePeintre(0, false);
            if (imagePeintre != null) {
                wDImage = new WDImage(imagePeintre.mo3717a(i, i2, i3, i4));
            } else {
                wDImage = new WDImage();
                a.m2735v();
            }
            return wDImage;
        } finally {
            a.m2735v();
        }
    }

    public static synchronized void dFinDessin() {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[15], 4);
            try {
                C0509v c0509v = (C0509v) a.m2722h();
                if (c0509v != null) {
                    c0509v.parcourirChamp(new C0547d(), true);
                }
                m1597a();
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static synchronized void dFinDessin(WDObjet wDObjet) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[15], 4);
            try {
                C0519e a2 = m1596a(wDObjet, 1);
                if (a2 == f1140b) {
                    m1597a();
                }
                if (a2 instanceof C0520c) {
                    ((C0520c) a2).libererImageMemoire();
                }
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static void dFond(int i) {
        dFond(i, 0, 4, 255);
    }

    public static void dFond(int i, int i2) {
        dFond(i, i2, 4, 255);
    }

    public static void dFond(int i, int i2, int i3) {
        dFond(i, i2, i3, 255);
    }

    public static synchronized void dFond(int i, int i2, int i3, int i4) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[30], 4);
            try {
                m1602b().mo2327a(i, i2, i3, i4);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static final void dFusionne(WDObjet wDObjet, WDObjet wDObjet2) {
        dFusionne(wDObjet, wDObjet2, 100.0d);
    }

    public static final void dFusionne(WDObjet wDObjet, WDObjet wDObjet2, double d) {
        WDContexte a = C0677k.m2776a(f1143z[37], 4);
        try {
            C0519e a2 = m1596a(wDObjet, 1);
            C0519e a3 = m1596a(wDObjet2, 2);
            C0544g imageMemoire = a2.getImageMemoire(1);
            if (imageMemoire != null) {
                imageMemoire.mo2337a(a3.getImagePeintre(0, false), d);
            }
            a.m2735v();
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static final void dIncrusteCouleur(WDObjet wDObjet, int i) {
        dIncrusteCouleur(wDObjet, i, 100.0d);
    }

    public static final void dIncrusteCouleur(WDObjet wDObjet, int i, double d) {
        WDContexte a = C0677k.m2776a(f1143z[1], 4);
        try {
            m1596a(wDObjet, 1).getImagePeintre(0, false).mo3720a(C1031a.m7467k(i), d);
        } finally {
            a.m2735v();
        }
    }

    public static synchronized WDBooleen dInverseCouleur(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[28], 4);
            try {
                C0544g imageMemoire = m1596a(wDObjet, 1).getImageMemoire(1);
                wDBooleen = new WDBooleen(imageMemoire != null ? imageMemoire.mo2335a() : false);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static void dLigne(int i, int i2, int i3, int i4) {
        dLigne(i, i2, i3, i4, C1032b.f2968a, -1);
    }

    public static void dLigne(int i, int i2, int i3, int i4, int i5) {
        dLigne(i, i2, i3, i4, i5, -1);
    }

    public static synchronized void dLigne(int i, int i2, int i3, int i4, int i5, int i6) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[5], 4);
            try {
                m1602b().mo2346c(i, i2, i3, i4, i5, i6);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static WDBooleen dModifieLuminosite(WDObjet wDObjet, int i) {
        return dModifieLuminosite(wDObjet, i, null);
    }

    public static synchronized WDBooleen dModifieLuminosite(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        WDBooleen wDBooleen;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[41], 4);
            try {
                C0519e a2 = m1596a(wDObjet, 1);
                C0519e c0519e = null;
                if (wDObjet2 != null) {
                    c0519e = m1596a(wDObjet2, 2);
                }
                wDBooleen = new WDBooleen(m1598a(a2, c0519e, 0, 0, i));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static WDBooleen dModifieSaturation(WDObjet wDObjet, int i) {
        return dModifieSaturation(wDObjet, i, null);
    }

    public static synchronized WDBooleen dModifieSaturation(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        WDBooleen wDBooleen;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[14], 4);
            try {
                C0519e a2 = m1596a(wDObjet, 1);
                C0519e c0519e = null;
                if (wDObjet2 != null) {
                    c0519e = m1596a(wDObjet2, 2);
                }
                wDBooleen = new WDBooleen(m1598a(a2, c0519e, 0, i, 0));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static WDBooleen dModifieTSL(WDObjet wDObjet, int i, int i2, int i3) {
        return dModifieTSL(wDObjet, i, i2, i3, null);
    }

    public static synchronized WDBooleen dModifieTSL(WDObjet wDObjet, int i, int i2, int i3, WDObjet wDObjet2) {
        WDBooleen wDBooleen;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[44], 4);
            try {
                C0519e a2 = m1596a(wDObjet, 1);
                C0519e c0519e = null;
                if (wDObjet2 != null) {
                    c0519e = m1596a(wDObjet2, 2);
                }
                wDBooleen = new WDBooleen(m1598a(a2, c0519e, i, i2, i3));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static WDBooleen dModifieTeinte(WDObjet wDObjet, int i) {
        return dModifieTeinte(wDObjet, i, null);
    }

    public static synchronized WDBooleen dModifieTeinte(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        WDBooleen wDBooleen;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[29], 4);
            try {
                C0519e a2 = m1596a(wDObjet, 1);
                C0519e c0519e = null;
                if (wDObjet2 != null) {
                    c0519e = m1596a(wDObjet2, 2);
                }
                wDBooleen = new WDBooleen(m1598a(a2, c0519e, i, 0, 0));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static WDEntier4 dPixelCouleur(int i, int i2) {
        return dPixelCouleur(null, i, i2);
    }

    public static WDEntier4 dPixelCouleur(WDObjet wDObjet, int i, int i2) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2776a(f1143z[13], 4);
        C0519e e;
        if (wDObjet == null) {
            try {
                e = m1602b().mo2350e();
                if (e == null) {
                    wDEntier4 = new WDEntier4(0);
                }
                wDEntier4 = new WDEntier4(C1031a.m7461e(e.getCouleurPixel(C0725i.m3011a(i), C0725i.m3011a(i2))));
                a.m2735v();
            } catch (C1489s e2) {
                wDEntier4 = new WDEntier4(0);
            } finally {
                a.m2735v();
            }
        } else {
            e = m1596a(wDObjet, 1);
            wDEntier4 = new WDEntier4(C1031a.m7461e(e.getCouleurPixel(C0725i.m3011a(i), C0725i.m3011a(i2))));
            a.m2735v();
        }
        return wDEntier4;
    }

    public static WDEntier4 dPixelOpacite(int i, int i2) {
        return dPixelOpacite(null, i, i2);
    }

    public static WDEntier4 dPixelOpacite(WDObjet wDObjet, int i, int i2) {
        WDEntier4 wDEntier4;
        WDContexte a = C0677k.m2776a(f1143z[4], 4);
        C0519e c0519e;
        if (wDObjet == null) {
            try {
                C0519e e = m1602b().mo2350e();
                if (e == null) {
                    wDEntier4 = new WDEntier4(-1);
                } else {
                    c0519e = e;
                    wDEntier4 = new WDEntier4(c0519e.getOpacitePixel(i, i2));
                    a.m2735v();
                }
            } catch (C1489s e2) {
                wDEntier4 = new WDEntier4(255);
            } finally {
                a.m2735v();
            }
        } else {
            c0519e = m1596a(wDObjet, 1);
            wDEntier4 = new WDEntier4(c0519e.getOpacitePixel(i, i2));
            a.m2735v();
        }
        return wDEntier4;
    }

    public static void dPoint(int i, int i2) {
        dPoint(i, i2, C1032b.f2968a, 255);
    }

    public static void dPoint(int i, int i2, int i3) {
        dPoint(i, i2, i3, 255);
    }

    public static synchronized void dPoint(int i, int i2, int i3, int i4) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[45], 4);
            try {
                m1602b().mo2345c(i, i2, i3, i4);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static void dPolice(String str) {
        dPolice(str, 12, 1, 0);
    }

    public static void dPolice(String str, int i) {
        dPolice(str, i, 1, 0);
    }

    public static void dPolice(String str, int i, int i2) {
        dPolice(str, i, i2, 0);
    }

    public static synchronized void dPolice(String str, int i, int i2, int i3) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[40], 4);
            try {
                m1602b().mo2333a(str, i, i2, i3);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static void dPolygone(int i, int i2, int i3, int i4, int i5) {
        dPolygone(i, i2, i3, i4, i5, new int[0]);
    }

    public static synchronized void dPolygone(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6 = C1032b.f2968a;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[23], 4);
            try {
                int i7;
                double[] dArr = new double[Math.max(4, i * 2)];
                dArr[0] = (double) i2;
                dArr[1] = (double) i3;
                dArr[2] = (double) i4;
                dArr[3] = (double) i5;
                int min = Math.min(iArr.length, (i - 2) * 2);
                for (i7 = 0; i7 < min; i7++) {
                    dArr[i7 + 4] = (double) iArr[i7];
                }
                i7 = iArr.length > (i + -2) * 2 ? iArr[(i - 2) * 2] : C1032b.f2968a;
                if (iArr.length > ((i - 2) * 2) + 1) {
                    i6 = iArr[((i - 2) * 2) + 1];
                }
                m1602b().mo2332a(i, dArr, i7, i6);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static void dPolygone(WDObjet wDObjet) {
        dPolygone(wDObjet, C1032b.f2968a, C1032b.f2968a);
    }

    public static void dPolygone(WDObjet wDObjet, int i) {
        dPolygone(wDObjet, i, C1032b.f2968a);
    }

    public static synchronized void dPolygone(WDObjet wDObjet, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[23], 4);
            WDObjet wDObjet2 = null;
            try {
                int l;
                if (wDObjet.isTableau()) {
                    l = ((C0758k) wDObjet).mo2640l();
                    wDObjet2 = wDObjet;
                } else {
                    l = 0;
                }
                if (wDObjet2 == null || l > 2) {
                    WDErreurManager.m2874a(10166, C0745b.m3222b(f1143z[22], new String[0]));
                }
                if (((C0758k) wDObjet2).mo2481f()) {
                    int p;
                    double[] dArr;
                    double[] dArr2;
                    int i5;
                    if (l <= 1) {
                        p = (int) (((C0758k) wDObjet2).mo2644p() / 2);
                        if (p > 100000) {
                            WDErreurManager.m2883a(C0745b.m3222b(f1143z[21], String.valueOf(p)));
                        }
                        dArr2 = new double[(p * 2)];
                        i3 = 1;
                        while (i4 <= p * 2) {
                            i5 = i4 + 1;
                            dArr2[i4 - 1] = (double) wDObjet2.get(i3).getInt();
                            dArr2[i5 - 1] = (double) wDObjet2.get(i3 + 1).getInt();
                            i3 += 2;
                            i4 = i5 + 1;
                        }
                        dArr = dArr2;
                    } else if (((C0758k) wDObjet2).mo2632a(2) == 1) {
                        p = (int) (((C0758k) wDObjet2).mo2632a(1) / 2);
                        if (p > 100000) {
                            WDErreurManager.m2883a(C0745b.m3222b(f1143z[21], String.valueOf(p)));
                        }
                        dArr2 = new double[(p * 2)];
                        i3 = 1;
                        while (i4 <= p * 2) {
                            i5 = i4 + 1;
                            dArr2[i4 - 1] = (double) wDObjet2.get(i3).get(1).getInt();
                            dArr2[i5 - 1] = (double) wDObjet2.get(i3 + 1).get(1).getInt();
                            i3 += 2;
                            i4 = i5 + 1;
                        }
                        dArr = dArr2;
                    } else {
                        p = (int) ((C0758k) wDObjet2).mo2632a(1);
                        if (p > 100000) {
                            WDErreurManager.m2883a(C0745b.m3222b(f1143z[21], String.valueOf(p)));
                        }
                        dArr2 = new double[(p * 2)];
                        while (i4 <= p) {
                            i5 = i3 + 1;
                            dArr2[i3] = (double) wDObjet2.get(i4).get(1).getInt();
                            i3 = i5 + 1;
                            dArr2[i5] = (double) wDObjet2.get(i4).get(2).getInt();
                            i4++;
                        }
                        dArr = dArr2;
                    }
                    m1602b().mo2332a(p, dArr, i, i2);
                    a.m2735v();
                }
            } finally {
                a.m2735v();
            }
        }
    }

    public static void dPortion(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        dPortion(i, i2, i3, i4, i5, i6, i7, i8, C1032b.f2968a, C1032b.f2968a);
    }

    public static void dPortion(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        dPortion(i, i2, i3, i4, i5, i6, i7, i8, i9, C1032b.f2968a);
    }

    public static synchronized void dPortion(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[27], 4);
            try {
                m1602b().mo2330a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, 3);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static void dRectangle(int i, int i2, int i3, int i4) {
        dRectangle(i, i2, i3, i4, C1032b.f2968a, C1032b.f2968a);
    }

    public static void dRectangle(int i, int i2, int i3, int i4, int i5) {
        dRectangle(i, i2, i3, i4, i5, C1032b.f2968a);
    }

    public static synchronized void dRectangle(int i, int i2, int i3, int i4, int i5, int i6) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[3], 4);
            try {
                m1602b().mo2341b(i, i2, i3, i4, i5, i6);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static synchronized void dRectangleDegrade(int i, int i2, int i3, int i4, int i5, int i6) {
        synchronized (WDAPIDessin_Commun.class) {
            dRectangleDegrade(i, i2, i3, i4, i5, i6, 0);
        }
    }

    public static synchronized void dRectangleDegrade(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[10], 4);
            try {
                m1602b().mo2329a(i, i2, i3, i4, i5, i6, i7);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static synchronized WDBooleen dRedimensionne(WDObjet wDObjet, int i, int i2) {
        WDBooleen dRedimensionne;
        synchronized (WDAPIDessin_Commun.class) {
            dRedimensionne = dRedimensionne(wDObjet, i, i2, 3);
        }
        return dRedimensionne;
    }

    public static synchronized WDBooleen dRedimensionne(WDObjet wDObjet, int i, int i2, int i3) {
        WDBooleen wDBooleen;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[42], 4);
            try {
                wDBooleen = new WDBooleen(m1596a(wDObjet, 1).appliquerRedimensionnement(i, i2, i3));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static void dRemplissage(int i, int i2) {
        dRemplissage(i, i2, C1032b.f2968a, -1);
    }

    public static void dRemplissage(int i, int i2, int i3) {
        dRemplissage(i, i2, i3, -1);
    }

    public static synchronized void dRemplissage(int i, int i2, int i3, int i4) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[11], 4);
            if (i3 == C1032b.f2968a) {
                m1602b().mo2349d(i, i2, -1, i4);
                a.m2735v();
            } else if (i3 == -1) {
                a.m2735v();
            } else {
                try {
                    m1602b().mo2349d(i, i2, i3, i4);
                    a.m2735v();
                } catch (Throwable th) {
                    a.m2735v();
                }
            }
        }
    }

    public static synchronized WDBooleen dRotation(WDObjet wDObjet, double d) {
        WDBooleen dRotation;
        synchronized (WDAPIDessin_Commun.class) {
            dRotation = dRotation(wDObjet, d, Integer.MIN_VALUE, Integer.MIN_VALUE, -1);
        }
        return dRotation;
    }

    public static synchronized WDBooleen dRotation(WDObjet wDObjet, double d, int i) {
        WDBooleen dRotation;
        synchronized (WDAPIDessin_Commun.class) {
            dRotation = dRotation(wDObjet, d, Integer.MIN_VALUE, Integer.MIN_VALUE, i);
        }
        return dRotation;
    }

    public static synchronized WDBooleen dRotation(WDObjet wDObjet, double d, int i, int i2) {
        WDBooleen dRotation;
        synchronized (WDAPIDessin_Commun.class) {
            dRotation = dRotation(wDObjet, d, i, i2, -1);
        }
        return dRotation;
    }

    public static synchronized WDBooleen dRotation(WDObjet wDObjet, double d, int i, int i2, int i3) {
        WDBooleen wDBooleen;
        int i4 = 1;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[20], 4);
            try {
                int i5;
                C0519e a2 = m1596a(wDObjet, 1);
                if (i3 == -1) {
                    if (!(a2 instanceof C0520c)) {
                        i4 = 0;
                    }
                    i5 = i4;
                } else {
                    i5 = i3;
                }
                wDBooleen = new WDBooleen(a2.appliquerRotation(d, i, i2, i5));
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static WDObjet dSauveImageJPEG(WDObjet wDObjet, String str) {
        return dSauveImageJPEG(wDObjet, str, 80, 0);
    }

    public static WDObjet dSauveImageJPEG(WDObjet wDObjet, String str, int i) {
        return dSauveImageJPEG(wDObjet, str, i, 0);
    }

    public static WDObjet dSauveImageJPEG(WDObjet wDObjet, String str, int i, int i2) {
        boolean z;
        WDObjet wDBooleen;
        WDContexte a = C0677k.m2776a(f1143z[39], 4);
        boolean equals = str.equals(f1143z[16]);
        try {
            C1336b c1336b;
            C0519e a2 = m1596a(wDObjet, 1);
            if (C0536n.f998b) {
                z = C1508i.f4611d;
                C1508i.f4611d = false;
                C1336b imagePeintre = a2.getImagePeintre(1, false);
                C1508i.f4611d = z;
                c1336b = imagePeintre;
            } else {
                c1336b = a2.getImagePeintre(1, false);
            }
            if (c1336b == null) {
                wDBooleen = new WDBooleen(false);
                a.m2735v();
            } else if (equals) {
                wDBooleen = new WDChaine(c1336b.mo3724a(i, i2, f1143z[38]));
                a.m2735v();
            } else {
                wDBooleen = new WDBooleen(c1336b.mo3723a(str, i, i2, f1143z[38]));
                a.m2735v();
            }
        } catch (C1489s e) {
            try {
                WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
                if (equals) {
                    wDBooleen = new WDChaine();
                    a.m2735v();
                } else {
                    wDBooleen = new WDBooleen(false);
                }
            } finally {
                a.m2735v();
            }
        } catch (Throwable th) {
            C1508i.f4611d = z;
        }
        return wDBooleen;
    }

    public static WDObjet dSauveImagePNG(WDObjet wDObjet, String str) {
        return dSauveImagePNG(wDObjet, str, C1032b.f2968a);
    }

    public static WDObjet dSauveImagePNG(WDObjet wDObjet, String str, int i) {
        WDObjet wDBooleen;
        WDContexte a = C0677k.m2776a(f1143z[17], 4);
        boolean equals = str.equals(f1143z[16]);
        try {
            C1336b imagePeintre = m1596a(wDObjet, 1).getImagePeintre(1, false);
            if (imagePeintre == null) {
                wDBooleen = new WDBooleen(false);
            } else if (equals) {
                wDBooleen = new WDChaine(imagePeintre.mo3724a(0, i, f1143z[18]));
                a.m2735v();
            } else {
                wDBooleen = new WDBooleen(imagePeintre.mo3723a(str, 0, i, f1143z[18]));
                a.m2735v();
            }
        } catch (C1489s e) {
            WDErreurManager.m2879a(a, e.getMessage(), e.m1561f());
            if (equals) {
                wDBooleen = new WDChaine();
                a.m2735v();
            } else {
                wDBooleen = new WDBooleen(false);
            }
        } finally {
            a.m2735v();
        }
        return wDBooleen;
    }

    public static void dStylo(int i) {
        dStylo(i, 0, 1, 255);
    }

    public static void dStylo(int i, int i2) {
        dStylo(i, i2, 1, 255);
    }

    public static void dStylo(int i, int i2, int i3) {
        dStylo(i, i2, i3, 255);
    }

    public static synchronized void dStylo(int i, int i2, int i3, int i4) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[46], 4);
            try {
                m1602b().mo2340b(i, i2, i3, i4);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static synchronized WDBooleen dSymetrieHorizontale(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[19], 4);
            try {
                wDBooleen = new WDBooleen(m1596a(wDObjet, 1).appliquerSymetrieHorizontale());
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static synchronized WDBooleen dSymetrieVerticale(WDObjet wDObjet) {
        WDBooleen wDBooleen;
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[26], 4);
            try {
                wDBooleen = new WDBooleen(m1596a(wDObjet, 1).appliquerSymetrieVerticale());
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        return wDBooleen;
    }

    public static void dTexte(int i, int i2, String str) {
        dTexte(i, i2, str, C1032b.f2968a, true);
    }

    public static void dTexte(int i, int i2, String str, int i3) {
        dTexte(i, i2, str, i3, true);
    }

    public static synchronized void dTexte(int i, int i2, String str, int i3, boolean z) {
        synchronized (WDAPIDessin_Commun.class) {
            WDContexte a = C0677k.m2776a(f1143z[32], 4);
            try {
                m1602b().mo2331a(i, i2, str, i3, z);
                a.m2735v();
            } catch (Throwable th) {
                a.m2735v();
            }
        }
    }

    public static WDChaine gLien(String str) {
        return new WDChaine(new StringBuilder(str.length() + (f1143z[8].length() * 2)).append(f1143z[8]).append(str).append(f1143z[8]).toString());
    }

    public static WDEntier4 rvb(int i, int i2, int i3) {
        return new WDEntier4(((65536 * i3) + (i2 * 256)) + i);
    }

    public static WDEntier4 rvbBleu(int i) {
        return new WDEntier4(C1031a.m7469m(i).m7501i());
    }

    public static WDEntier4 rvbRouge(int i) {
        return new WDEntier4(C1031a.m7469m(i).m7502j());
    }

    public static WDEntier4 rvbVert(int i) {
        return new WDEntier4(C1031a.m7469m(i).m7500e());
    }

    public static WDEntier4 tsl(int i, int i2, int i3) {
        WDContexte a = C0677k.m2778a(f1143z[33], false);
        if (i < 0 || i > 360) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1143z[34], new String[0]));
            } catch (Throwable th) {
                a.m2735v();
            }
        }
        if (i2 < 0 || i2 > 100) {
            WDErreurManager.m2883a(C0745b.m3222b(f1143z[35], new String[0]));
        }
        if (i3 < 0 || i3 > 100) {
            WDErreurManager.m2883a(C0745b.m3222b(f1143z[36], new String[0]));
        }
        WDEntier4 wDEntier4 = new WDEntier4(C1031a.m7461e(C1031a.m7456b(i, i3, i2)));
        a.m2735v();
        return wDEntier4;
    }

    /* renamed from: z */
    private static String m1603z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 95;
                    break;
                case 1:
                    i2 = 76;
                    break;
                case 2:
                    i2 = 96;
                    break;
                case 3:
                    i2 = 84;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1604z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 89);
        }
        return toCharArray;
    }
}
