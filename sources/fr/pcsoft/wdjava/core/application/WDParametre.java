package fr.pcsoft.wdjava.core.application;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p035c.C0664f;
import fr.pcsoft.wdjava.core.poo.C0558c;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.cb;
import fr.pcsoft.wdjava.core.types.collection.C0582d;

public class WDParametre {
    /* renamed from: z */
    private static final String[] f1602z = new String[]{m2607z(m2608z("\u0016<Xhn`+Ujjf*K}nj)Khjx")), m2607z(m2608z("\u0016<Xhtv6Dlng*Cuej)Khjx<^hn")), m2607z(m2608z("\u0016<Xhtv6Dig,Inn`+Uij{*Ujjg8Gg<")), m2607z(m2608z("\u0016<Xhte8X{fj-Kxgp8_el)Oeny<Gea")), m2607z(m2608z("\u0016)Kixt>Oe{t+Uyde0Oet;Fj`&Kixz:C{|?")), m2607z(m2608z("S\u000b$JHF\u0016lN\u0005B\u001d`[]TWiUYPW~C[P\n$mop\u0017WNG\u0018~SD[")), m2607z(m2608z("p\u000bx_^GYfUYFYn_\u000bY^kJ[P\u0015*^N\u0015\u0015k\u001aFÜ\rbUOPY]~n[\fg_YT\rcUE\u0016\u001eoNn[\fg_YT\rcUEc\u0018fON\u0015\tkH\u000b\\\u0017~HDF\toY_\\\u0016d\u0014")), m2607z(m2608z("\u0016:Et}p+Ysd{&Cw{z*Ysiy<")), m2607z(m2608z("\u0016<Xhte8X{fj-Kxgp8_eew&Ovnx<Dn")), m2607z(m2608z("\u0016<Xhte8X{fj-Kxgp8_eew&Nsfp7Ysd{"))};

    public static WDObjet traiterParametre(WDObjet wDObjet, int i, boolean z, int i2) {
        try {
            if (wDObjet == WDObjet.NULL) {
                return C0611a.m2292a(i2);
            }
            int typeVar = wDObjet.getTypeVar();
            boolean isVariableInterne = wDObjet.isVariableInterne();
            if (z || isVariableInterne) {
                if (i2 == 0 || typeVar == i2) {
                    return !isVariableInterne ? wDObjet.getClone() : wDObjet;
                } else {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 13:
                        case 14:
                        case 16:
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 30:
                        case 31:
                        case 61:
                        case 70:
                        case 81:
                            WDObjet a = C0611a.m2292a(i2);
                            a.setValeur(wDObjet);
                            return a;
                        default:
                            throw new C0664f(C0745b.m3222b(f1602z[7], C0725i.m3045b(typeVar), C0725i.m3045b(i2)));
                    }
                    WDErreurManager.m2883a(C0745b.m3222b(f1602z[0], String.valueOf(i)) + "\n" + e.getMessage());
                    return wDObjet;
                }
            } else if (i2 == 0 || i2 == typeVar) {
                return wDObjet;
            } else {
                throw new C0664f(C0745b.m3222b(f1602z[1], C0725i.m3045b(typeVar), C0725i.m3045b(i2)));
            }
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            WDErreurManager.m2883a(C0745b.m3222b(f1602z[0], String.valueOf(i)) + "\n" + e2.getMessage());
            return wDObjet;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static fr.pcsoft.wdjava.core.WDObjet traiterParametreClasse(fr.pcsoft.wdjava.core.WDObjet r7, int r8, boolean r9, java.lang.Class r10, int r11) {
        /*
        r4 = 2;
        r6 = 1;
        r5 = 0;
        r0 = r7.isValeurNull();	 Catch:{ WDException -> 0x000f }
        if (r0 == 0) goto L_0x0011;
    L_0x0009:
        r0 = new fr.pcsoft.wdjava.core.poo.WDInstanceDynamique;	 Catch:{ WDException -> 0x000f }
        r0.<init>(r10);	 Catch:{ WDException -> 0x000f }
    L_0x000e:
        return r0;
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r2 = 0;
        r0 = r7.isAllloue();	 Catch:{ WDException -> 0x0092 }
        if (r0 != 0) goto L_0x0023;
    L_0x0018:
        r0 = r7 instanceof fr.pcsoft.wdjava.core.poo.C0729v;	 Catch:{ WDException -> 0x0092 }
        if (r0 == 0) goto L_0x0023;
    L_0x001c:
        r0 = r7;
        r0 = (fr.pcsoft.wdjava.core.poo.C0729v) r0;
        r2 = r0.m3102b();
    L_0x0023:
        if (r2 != 0) goto L_0x00cc;
    L_0x0025:
        r0 = fr.pcsoft.wdjava.core.poo.C0558c.class;
        r0 = r7.checkType(r0);
        r0 = (fr.pcsoft.wdjava.core.poo.C0558c) r0;
        if (r0 == 0) goto L_0x0094;
    L_0x002f:
        r0 = r0.getClass();
    L_0x0033:
        if (r0 == 0) goto L_0x008c;
    L_0x0035:
        r1 = r10.isAssignableFrom(r0);	 Catch:{ WDException -> 0x005b }
        if (r1 != 0) goto L_0x008c;
    L_0x003b:
        r1 = new fr.pcsoft.wdjava.core.c.f;	 Catch:{ WDException -> 0x005b }
        r2 = f1602z;	 Catch:{ WDException -> 0x005b }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ WDException -> 0x005b }
        r3 = 2;
        r3 = new java.lang.String[r3];	 Catch:{ WDException -> 0x005b }
        r4 = 0;
        r0 = fr.pcsoft.wdjava.core.C0725i.m3029a(r0);	 Catch:{ WDException -> 0x005b }
        r3[r4] = r0;	 Catch:{ WDException -> 0x005b }
        r0 = 1;
        r4 = fr.pcsoft.wdjava.core.C0725i.m3029a(r10);	 Catch:{ WDException -> 0x005b }
        r3[r0] = r4;	 Catch:{ WDException -> 0x005b }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ WDException -> 0x005b }
        r1.<init>(r0);	 Catch:{ WDException -> 0x005b }
        throw r1;	 Catch:{ WDException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = f1602z;
        r2 = r2[r5];
        r3 = new java.lang.String[r6];
        r4 = java.lang.String.valueOf(r8);
        r3[r5] = r4;
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);
        r1 = r1.append(r2);
        r2 = "\n";
        r1 = r1.append(r2);
        r0 = r0.getMessage();
        r0 = r1.append(r0);
        r0 = r0.toString();
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);
    L_0x008c:
        r0 = traiterParametre(r7, r8, r9, r11);
        goto L_0x000e;
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r0 = fr.pcsoft.wdjava.core.types.collection.WDSerie.class;
        r0 = r7.checkType(r0);
        r0 = (fr.pcsoft.wdjava.core.types.collection.WDSerie) r0;
        if (r0 == 0) goto L_0x00cc;
    L_0x009e:
        r1 = r10.getName();	 Catch:{ WDException -> 0x00b6, Exception -> 0x00b8 }
        r1 = fr.pcsoft.wdjava.core.poo.C0735q.m3118a(r1);	 Catch:{ WDException -> 0x00b6, Exception -> 0x00b8 }
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ WDException -> 0x00b6, Exception -> 0x00b8 }
        r1 = r1.newInstance(r3);	 Catch:{ WDException -> 0x00b6, Exception -> 0x00b8 }
        r1 = (fr.pcsoft.wdjava.core.WDObjet) r1;	 Catch:{ WDException -> 0x00b6, Exception -> 0x00b8 }
        r1.setValeur(r0);	 Catch:{ WDException -> 0x00b6, Exception -> 0x00cf }
        r0 = r2;
        r7 = r1;
        goto L_0x0033;
    L_0x00b6:
        r0 = move-exception;
        throw r0;
    L_0x00b8:
        r0 = move-exception;
    L_0x00b9:
        r0 = f1602z;
        r0 = r0[r4];
        r1 = new java.lang.String[r6];
        r3 = fr.pcsoft.wdjava.core.poo.C0735q.m3128d(r10);
        r1[r5] = r3;
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);
    L_0x00cc:
        r0 = r2;
        goto L_0x0033;
    L_0x00cf:
        r0 = move-exception;
        r7 = r1;
        goto L_0x00b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.application.WDParametre.traiterParametreClasse(fr.pcsoft.wdjava.core.WDObjet, int, boolean, java.lang.Class, int):fr.pcsoft.wdjava.core.WDObjet");
    }

    public static WDObjet traiterParametreCombinaison(WDObjet wDObjet, int i, boolean z, Class cls) {
        return wDObjet;
    }

    public static WDObjet traiterParametreEnumeration(WDObjet wDObjet, int i, boolean z, Class cls) {
        WDObjet wDObjet2;
        try {
            wDObjet2 = (WDObjet) Class.forName(f1602z[5]).getMethod("a", new Class[]{WDObjet.class, Class.class}).invoke(null, new Object[]{wDObjet, cls});
        } catch (Exception e) {
            C0691a.m2857a(f1602z[6], e);
            wDObjet2 = null;
        }
        if (wDObjet2 == null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1602z[0], String.valueOf(i)) + "\n" + C0745b.m3222b(f1602z[1], C0725i.m3029a(wDObjet.getClass()), C0725i.m3058c(cls)));
            } catch (Exception e2) {
                throw e2;
            }
        }
        if (z) {
            try {
                wDObjet = wDObjet.getClone();
            } catch (Exception e22) {
                throw e22;
            }
        }
        return wDObjet;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static fr.pcsoft.wdjava.core.WDObjet traiterParametreTableau(fr.pcsoft.wdjava.core.WDObjet r10, int r11, boolean r12, int[] r13, int r14, java.lang.Class r15) {
        /*
        r2 = r10.isValeurNull();	 Catch:{ WDException -> 0x0009 }
        if (r2 == 0) goto L_0x000b;
    L_0x0006:
        r3 = fr.pcsoft.wdjava.core.WDObjet.NULL;	 Catch:{ WDException -> 0x0009 }
    L_0x0008:
        return r3;
    L_0x0009:
        r2 = move-exception;
        throw r2;
    L_0x000b:
        r2 = r10 instanceof fr.pcsoft.wdjava.core.types.collection.tableau.C0758k;	 Catch:{ f -> 0x0042 }
        if (r2 == 0) goto L_0x00db;
    L_0x000f:
        if (r14 == 0) goto L_0x00db;
    L_0x0011:
        r0 = r10;
        r0 = (fr.pcsoft.wdjava.core.types.collection.tableau.C0758k) r0;	 Catch:{ f -> 0x0042 }
        r2 = r0;
        r3 = r2.mo2640l();	 Catch:{ f -> 0x0042 }
        r4 = r13.length;	 Catch:{ f -> 0x0040 }
        if (r3 == r4) goto L_0x0071;
    L_0x001c:
        r2 = new fr.pcsoft.wdjava.core.c.f;	 Catch:{ f -> 0x0040 }
        r4 = f1602z;	 Catch:{ f -> 0x0040 }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ f -> 0x0040 }
        r5 = 2;
        r5 = new java.lang.String[r5];	 Catch:{ f -> 0x0040 }
        r6 = 0;
        r7 = r13.length;	 Catch:{ f -> 0x0040 }
        r7 = java.lang.String.valueOf(r7);	 Catch:{ f -> 0x0040 }
        r5[r6] = r7;	 Catch:{ f -> 0x0040 }
        r6 = 1;
        r3 = java.lang.String.valueOf(r3);	 Catch:{ f -> 0x0040 }
        r5[r6] = r3;	 Catch:{ f -> 0x0040 }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ f -> 0x0040 }
        r4 = 2338; // 0x922 float:3.276E-42 double:1.155E-320;
        r2.<init>(r3, r4);	 Catch:{ f -> 0x0040 }
        throw r2;	 Catch:{ f -> 0x0040 }
    L_0x0040:
        r2 = move-exception;
        throw r2;	 Catch:{ f -> 0x0042 }
    L_0x0042:
        r2 = move-exception;
        r3 = r2.mo2326e();
        r4 = 2;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = f1602z;
        r7 = 0;
        r6 = r6[r7];
        r7 = 1;
        r7 = new java.lang.String[r7];
        r8 = 0;
        r9 = java.lang.String.valueOf(r11);
        r7[r8] = r9;
        r6 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r6, r7);
        r4[r5] = r6;
        r5 = 1;
        r2 = r2.getMessage();
        r4[r5] = r2;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2874a(r3, r4);
    L_0x006a:
        r2 = 34;
        r3 = traiterParametre(r10, r11, r12, r2);
        goto L_0x0008;
    L_0x0071:
        r3 = 0;
    L_0x0072:
        r4 = r13.length;	 Catch:{ f -> 0x0042 }
        if (r3 >= r4) goto L_0x00b9;
    L_0x0075:
        r4 = r3 + 1;
        r4 = r2.mo2632a(r4);	 Catch:{ f -> 0x0042 }
        r6 = r13[r3];	 Catch:{ f -> 0x00b4 }
        if (r6 == 0) goto L_0x00b6;
    L_0x007f:
        r6 = r13[r3];	 Catch:{ f -> 0x00b2 }
        r6 = (long) r6;	 Catch:{ f -> 0x00b2 }
        r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r6 == 0) goto L_0x00b6;
    L_0x0086:
        r2 = new fr.pcsoft.wdjava.core.c.f;	 Catch:{ f -> 0x00b2 }
        r6 = f1602z;	 Catch:{ f -> 0x00b2 }
        r7 = 8;
        r6 = r6[r7];	 Catch:{ f -> 0x00b2 }
        r7 = 3;
        r7 = new java.lang.String[r7];	 Catch:{ f -> 0x00b2 }
        r8 = 0;
        r9 = r13[r3];	 Catch:{ f -> 0x00b2 }
        r9 = java.lang.String.valueOf(r9);	 Catch:{ f -> 0x00b2 }
        r7[r8] = r9;	 Catch:{ f -> 0x00b2 }
        r8 = 1;
        r3 = r3 + 1;
        r3 = java.lang.String.valueOf(r3);	 Catch:{ f -> 0x00b2 }
        r7[r8] = r3;	 Catch:{ f -> 0x00b2 }
        r3 = 2;
        r4 = java.lang.String.valueOf(r4);	 Catch:{ f -> 0x00b2 }
        r7[r3] = r4;	 Catch:{ f -> 0x00b2 }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r6, r7);	 Catch:{ f -> 0x00b2 }
        r2.<init>(r3);	 Catch:{ f -> 0x00b2 }
        throw r2;	 Catch:{ f -> 0x00b2 }
    L_0x00b2:
        r2 = move-exception;
        throw r2;	 Catch:{ f -> 0x0042 }
    L_0x00b4:
        r2 = move-exception;
        throw r2;	 Catch:{ f -> 0x00b2 }
    L_0x00b6:
        r3 = r3 + 1;
        goto L_0x0072;
    L_0x00b9:
        r3 = r2.mo2487d();	 Catch:{ f -> 0x00d9 }
        if (r14 != r3) goto L_0x00c5;
    L_0x00bf:
        r2 = r2.mo2482g();	 Catch:{ f -> 0x00d7 }
        if (r15 == r2) goto L_0x00db;
    L_0x00c5:
        r2 = new fr.pcsoft.wdjava.core.c.f;	 Catch:{ f -> 0x00d7 }
        r3 = f1602z;	 Catch:{ f -> 0x00d7 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ f -> 0x00d7 }
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ f -> 0x00d7 }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ f -> 0x00d7 }
        r2.<init>(r3);	 Catch:{ f -> 0x00d7 }
        throw r2;	 Catch:{ f -> 0x00d7 }
    L_0x00d7:
        r2 = move-exception;
        throw r2;	 Catch:{ f -> 0x0042 }
    L_0x00d9:
        r2 = move-exception;
        throw r2;	 Catch:{ f -> 0x00d7 }
    L_0x00db:
        r2 = fr.pcsoft.wdjava.core.types.collection.WDSerie.class;
        r2 = r10.checkType(r2);	 Catch:{ f -> 0x0042 }
        r2 = (fr.pcsoft.wdjava.core.types.collection.WDSerie) r2;	 Catch:{ f -> 0x0042 }
        if (r2 == 0) goto L_0x006a;
    L_0x00e5:
        r3 = 0;
        if (r15 == 0) goto L_0x00f5;
    L_0x00e8:
        r4 = fr.pcsoft.wdjava.core.poo.C0560r.class;
        r4 = r4.isAssignableFrom(r15);	 Catch:{ f -> 0x0102 }
        if (r4 == 0) goto L_0x00f5;
    L_0x00f0:
        r3 = new fr.pcsoft.wdjava.core.application.i;	 Catch:{ f -> 0x0042 }
        r3.<init>(r15);	 Catch:{ f -> 0x0042 }
    L_0x00f5:
        r3 = fr.pcsoft.wdjava.core.allocation.C0611a.m2305a(r13, r14, r3);	 Catch:{ f -> 0x0042 }
        r3 = (fr.pcsoft.wdjava.core.WDObjet) r3;	 Catch:{ f -> 0x0042 }
        if (r3 == 0) goto L_0x006a;
    L_0x00fd:
        r3.setValeur(r2);	 Catch:{ f -> 0x0042 }
        goto L_0x0008;
    L_0x0102:
        r2 = move-exception;
        throw r2;	 Catch:{ f -> 0x0042 }
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.application.WDParametre.traiterParametreTableau(fr.pcsoft.wdjava.core.WDObjet, int, boolean, int[], int, java.lang.Class):fr.pcsoft.wdjava.core.WDObjet");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static fr.pcsoft.wdjava.core.WDObjet traiterParametreTableauAssociatif(fr.pcsoft.wdjava.core.WDObjet r7, int r8, boolean r9, int r10, java.lang.Class r11) {
        /*
        r6 = 0;
        r1 = r7.isValeurNull();	 Catch:{ Exception -> 0x000a }
        if (r1 == 0) goto L_0x000c;
    L_0x0007:
        r1 = fr.pcsoft.wdjava.core.WDObjet.NULL;	 Catch:{ Exception -> 0x000a }
    L_0x0009:
        return r1;
    L_0x000a:
        r1 = move-exception;
        throw r1;
    L_0x000c:
        r1 = r7.isTableauAssociatif();	 Catch:{ Exception -> 0x0028 }
        if (r1 == 0) goto L_0x0058;
    L_0x0012:
        if (r9 == 0) goto L_0x005f;
    L_0x0014:
        r1 = new fr.pcsoft.wdjava.core.c.f;	 Catch:{ Exception -> 0x0026 }
        r2 = f1602z;	 Catch:{ Exception -> 0x0026 }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0026 }
        r3 = 0;
        r3 = new java.lang.String[r3];	 Catch:{ Exception -> 0x0026 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ Exception -> 0x0026 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0026 }
        throw r1;	 Catch:{ Exception -> 0x0026 }
    L_0x0026:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0028 }
    L_0x0028:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = f1602z;
        r3 = r3[r6];
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = java.lang.String.valueOf(r8);
        r4[r6] = r5;
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);
        r2 = r2.append(r3);
        r3 = "\n";
        r2 = r2.append(r3);
        r1 = r1.getMessage();
        r1 = r2.append(r1);
        r1 = r1.toString();
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);
    L_0x0058:
        r1 = 62;
        r1 = traiterParametre(r7, r8, r9, r1);
        goto L_0x0009;
    L_0x005f:
        r0 = r7;
        r0 = (fr.pcsoft.wdjava.core.types.collection.tableau.C0758k) r0;	 Catch:{ Exception -> 0x0028 }
        r1 = r0;
        r2 = r1.mo2487d();	 Catch:{ Exception -> 0x0083 }
        if (r10 != r2) goto L_0x006f;
    L_0x0069:
        r1 = r1.mo2482g();	 Catch:{ Exception -> 0x0081 }
        if (r11 == r1) goto L_0x0058;
    L_0x006f:
        r1 = new fr.pcsoft.wdjava.core.c.f;	 Catch:{ Exception -> 0x0081 }
        r2 = f1602z;	 Catch:{ Exception -> 0x0081 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0081 }
        r3 = 0;
        r3 = new java.lang.String[r3];	 Catch:{ Exception -> 0x0081 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ Exception -> 0x0081 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0081 }
        throw r1;	 Catch:{ Exception -> 0x0081 }
    L_0x0081:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0028 }
    L_0x0083:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0081 }
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.application.WDParametre.traiterParametreTableauAssociatif(fr.pcsoft.wdjava.core.WDObjet, int, boolean, int, java.lang.Class):fr.pcsoft.wdjava.core.WDObjet");
    }

    public static final void traiterParametreTraitementNonBloquant(WDObjet... wDObjetArr) {
        if (wDObjetArr != null) {
            int length = wDObjetArr.length;
            int i = 0;
            while (i < length) {
                WDObjet wDObjet = wDObjetArr[i];
                try {
                    if (!wDObjet.isValeurNull()) {
                        if (wDObjet.isAllloue()) {
                            try {
                                if (wDObjet.isVariableInterne()) {
                                    continue;
                                } else {
                                    WDObjet wDObjet2;
                                    C0582d c0582d = (C0582d) wDObjet.checkType(C0582d.class);
                                    if (c0582d != null) {
                                        wDObjet2 = (WDObjet) c0582d;
                                    } else {
                                        C0558c c0558c = (C0558c) wDObjet.checkType(C0558c.class);
                                        if (c0558c != null) {
                                            wDObjet2 = (WDObjet) c0558c;
                                        } else {
                                            wDObjet2 = (cb) wDObjet.checkType(cb.class);
                                            if (wDObjet2 != null) {
                                                try {
                                                    wDObjet2 = !wDObjet2.m1756b() ? C0611a.m2293a(wDObjet2.getTypeVar(), wDObjet2) : wDObjet;
                                                } catch (WDException e) {
                                                    throw e;
                                                }
                                            }
                                            wDObjet2 = wDObjet.getClone();
                                        }
                                    }
                                    wDObjetArr[i] = wDObjet2;
                                }
                            } catch (WDException e2) {
                                throw e2;
                            }
                        }
                        continue;
                    }
                    i++;
                } catch (WDException e22) {
                    throw e22;
                } catch (WDException e222) {
                    throw e222;
                }
            }
        }
    }

    /* renamed from: z */
    private static String m2607z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 53;
                    break;
                case 1:
                    i2 = 121;
                    break;
                case 2:
                    i2 = 10;
                    break;
                case 3:
                    i2 = 58;
                    break;
                default:
                    i2 = 43;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2608z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 43);
        }
        return toCharArray;
    }
}
