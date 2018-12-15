package fr.pcsoft.wdjava.core.allocation;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDBuffer;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDChaineA;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.core.types.WDDate;
import fr.pcsoft.wdjava.core.types.WDDateHeure;
import fr.pcsoft.wdjava.core.types.WDDuree;
import fr.pcsoft.wdjava.core.types.WDEntier1;
import fr.pcsoft.wdjava.core.types.WDEntier2;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.core.types.WDHeure;
import fr.pcsoft.wdjava.core.types.WDMonetaire;
import fr.pcsoft.wdjava.core.types.WDNumerique;
import fr.pcsoft.wdjava.core.types.WDProcedure;
import fr.pcsoft.wdjava.core.types.WDReel;
import fr.pcsoft.wdjava.core.types.collection.tableau.C0758k;
import java.lang.reflect.Constructor;
import java.util.HashMap;

/* renamed from: fr.pcsoft.wdjava.core.allocation.a */
public class C0611a {
    /* renamed from: a */
    private static HashMap<Class<? extends WDObjet>, C0613b<WDObjet>> f1494a = null;
    /* renamed from: z */
    private static final String[] f1495z = new String[]{C0611a.m2310z(C0611a.m2311z("g\u0011QH/]\u0015CK9\u000e\u0018D\u0007?\\DU|B[HI/Z\u001dOD9\u000e\u0018D\u0007\u000bj(@E0K\u001dTt5C\fMB|^\u001dS\u00075@\bSH/^\u0019BS5A\u0012\u000f")), C0611a.m2310z(C0611a.m2311z("H\u000e\u000fW?]\u0013GSrY\u0018KF*ORBH.KRU^,K\u000f\u000fD3B\u0010DD(G\u0013O\t(O\u001eMB=[Rvc\bO\u001eMB=[/HJ,B\u0019")), C0611a.m2310z(C0611a.m2311z("g\u0011QH/]\u0015CK9\u000e\u0018D\u0007?\\DU|[\u0012D\u00075@\u000fUF2M\u0019\u0001C9\u000e\u0010@\u0007?B\u001dRT9\u000e")), C0611a.m2310z(C0611a.m2311z("m.df\ba.")), C0611a.m2310z(C0611a.m2311z("\u000e\u0012D\u0007,A\u000fRÏ8K\\QF/\u000e\u0018D\u00071K\u0011CU9\u000e?sb\u001dz3s\t")), C0611a.m2310z(C0611a.m2311z("b\u001d\u0001D0O\u000fRB|")), C0611a.m2310z(C0611a.m2311z("b\u0019\u0001S%^\u0019\u0001T,Ç\u001fGNµ\u000e\u0012\u0006B/Z\\QF/\u000e\tO\u0007(W\fD\u0007/G\u0011QK9\u0000")), C0611a.m2310z(C0611a.m2311z("H\u000e\u000fW?]\u0013GSrY\u0018KF*ORBH.KRU^,K\u000f\u000fp\u0018x\u001dSN=@\b")), C0611a.m2310z(C0611a.m2311z("H\u000e\u000fW?]\u0013GSrY\u0018KF*ORBH.KRU^,K\u000f\u000fC=Z\u001dCF/KRvc\u000fA\tSD9j\u0013OI9K\u000f")), C0611a.m2310z(C0611a.m2311z("H\u000e\u000fW?]\u0013GSrY\u0018KF*OREF(O\u001e@T9\u0000\u0014G\t\u000bj4gx\u001fA\u0012OB$G\u0013O")), C0611a.m2310z(C0611a.m2311z("\r9su\u0019{.~s\u0005~9~b\u0010k1di\bq(`e\u0010k=txn")), C0611a.m2310z(C0611a.m2311z("\r9su\u0019{.~s\u0005~9~b\u0010k1di\bq(`e\u0010k=t"))};

    /* renamed from: a */
    public static WDObjet m2292a(int i) {
        return C0611a.m2294a(i, null);
    }

    /* renamed from: a */
    public static final WDObjet m2293a(int i, WDObjet wDObjet) {
        switch (i) {
            case 1:
                return new C0617f(wDObjet);
            case 2:
            case 6:
                return new fb(wDObjet);
            case 3:
            case 7:
                return new ib(wDObjet);
            case 4:
            case 8:
                return new lb(wDObjet);
            case 5:
            case 9:
            case 14:
                return new pb(wDObjet);
            case 10:
                return new zb(wDObjet);
            case 12:
                return new gc(wDObjet);
            case 13:
                return new wb(wDObjet);
            case 16:
            case 81:
                return new C0632u(wDObjet);
            case 17:
            case 19:
                return new C0626o(wDObjet);
            case 24:
                return new C0636y(wDObjet);
            case 25:
                return new tb(wDObjet);
            case 26:
                return new bb(wDObjet);
            case 27:
                return new cb(wDObjet);
            case 28:
            case 30:
                return new C0620i(wDObjet);
            case 61:
                return new cc(wDObjet);
            default:
                C0691a.m2856a(f1495z[6]);
                return null;
        }
    }

    /* renamed from: a */
    public static WDObjet m2294a(int i, IWDAllocateur iWDAllocateur) {
        switch (i) {
            case 1:
                return new WDBooleen();
            case 2:
            case 6:
                return new WDEntier1();
            case 3:
            case 7:
                return new WDEntier2();
            case 4:
            case 8:
                return new WDEntier4();
            case 5:
            case 9:
            case 14:
                return new WDEntier8();
            case 10:
                return new WDMonetaire();
            case 12:
                return new WDReel();
            case 13:
                return new WDNumerique();
            case 16:
            case 81:
                return new WDChaineU();
            case 17:
            case 19:
                return new WDChaineA();
            case 20:
                return C0611a.m2307b(f1495z[8]);
            case 24:
                return new WDDate();
            case 25:
                return new WDHeure();
            case 26:
                return new WDDateHeure();
            case 27:
                return new WDDuree();
            case 28:
            case 30:
                return new WDBuffer();
            case 31:
                return C0611a.m2307b(f1495z[7]);
            case 36:
            case 37:
            case 111:
                return C0611a.m2296a(iWDAllocateur, false);
            case 61:
                return new WDProcedure();
            case 70:
                return C0611a.m2307b(f1495z[9]);
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f1495z[10], C0725i.m3045b(i)));
                return null;
        }
    }

    /* renamed from: a */
    public static final WDObjet m2295a(int i, String str) {
        switch (i) {
            case 1:
                return new C0616e(str);
            case 2:
            case 6:
                return new eb(str);
            case 3:
            case 7:
                return new hb(str);
            case 4:
            case 8:
                return new kb(str);
            case 5:
            case 9:
            case 14:
                return new ob(str);
            case 10:
                return new yb(str);
            case 12:
                return new fc(str);
            case 13:
                return new vb(str);
            case 16:
            case 81:
                return new C0630s(str);
            case 17:
            case 19:
                return new C0624m(str);
            case 24:
                return new C0635x(str);
            case 25:
                return new sb(str);
            case 26:
                return new ab(str);
            case 28:
            case 30:
                return new C0619h(str);
            case 61:
                return new bc(str);
            default:
                C0691a.m2856a(f1495z[6]);
                return null;
        }
    }

    /* renamed from: a */
    public static fr.pcsoft.wdjava.core.WDObjet m2296a(fr.pcsoft.wdjava.core.allocation.IWDAllocateur r4, boolean r5) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.core.allocation.a.a(fr.pcsoft.wdjava.core.allocation.IWDAllocateur, boolean):fr.pcsoft.wdjava.core.WDObjet. bs: [B:1:0x0002, B:7:0x0019]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        if (r4 != 0) goto L_0x0008;
    L_0x0002:
        r1 = new fr.pcsoft.wdjava.core.poo.WDInstanceDynamique;	 Catch:{ Exception -> 0x0024 }
        r1.<init>();	 Catch:{ Exception -> 0x0024 }
    L_0x0007:
        return r1;	 Catch:{ Exception -> 0x0024 }
    L_0x0008:
        r1 = r4.isDynamique();	 Catch:{ Exception -> 0x0024 }
        if (r1 == 0) goto L_0x0037;	 Catch:{ Exception -> 0x0024 }
    L_0x000e:
        r2 = new fr.pcsoft.wdjava.core.poo.WDInstanceDynamique;	 Catch:{ Exception -> 0x0024 }
        r1 = r4.getClasseWD();	 Catch:{ Exception -> 0x0024 }
        r2.<init>(r1);	 Catch:{ Exception -> 0x0024 }
        if (r5 == 0) goto L_0x0020;
    L_0x0019:
        r0 = r2;	 Catch:{ Exception -> 0x0022 }
        r0 = (fr.pcsoft.wdjava.core.poo.WDInstanceDynamique) r0;	 Catch:{ Exception -> 0x0022 }
        r1 = r0;	 Catch:{ Exception -> 0x0022 }
        r1.m3101a();	 Catch:{ Exception -> 0x0022 }
    L_0x0020:
        r1 = r2;
        goto L_0x0007;
    L_0x0022:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0024 }
    L_0x0024:
        r1 = move-exception;
        r1 = f1495z;
        r2 = 11;
        r1 = r1[r2];
        r2 = 0;
        r2 = new java.lang.String[r2];
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);
        r1 = 0;
        goto L_0x0007;
    L_0x0037:
        r1 = r4.creerInstance();	 Catch:{ Exception -> 0x0024 }
        if (r1 != 0) goto L_0x0043;	 Catch:{ Exception -> 0x0024 }
    L_0x003d:
        r1 = new fr.pcsoft.wdjava.core.poo.WDInstanceDynamique;	 Catch:{ Exception -> 0x0024 }
        r1.<init>();	 Catch:{ Exception -> 0x0024 }
        goto L_0x0007;	 Catch:{ Exception -> 0x0024 }
    L_0x0043:
        r2 = fr.pcsoft.wdjava.core.poo.C0734p.class;	 Catch:{ Exception -> 0x0024 }
        r3 = r4.getClasseWD();	 Catch:{ Exception -> 0x0024 }
        r2 = r2.isAssignableFrom(r3);	 Catch:{ Exception -> 0x0024 }
        if (r2 != 0) goto L_0x0007;	 Catch:{ Exception -> 0x0024 }
    L_0x004f:
        r2 = r1 instanceof fr.pcsoft.wdjava.core.poo.C0558c;	 Catch:{ Exception -> 0x0024 }
        if (r2 == 0) goto L_0x0007;	 Catch:{ Exception -> 0x0024 }
    L_0x0053:
        r2 = new fr.pcsoft.wdjava.core.poo.WDInstance;	 Catch:{ Exception -> 0x0024 }
        r1 = (fr.pcsoft.wdjava.core.poo.C0558c) r1;	 Catch:{ Exception -> 0x0024 }
        r2.<init>(r1);	 Catch:{ Exception -> 0x0024 }
        r1 = r2;
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.allocation.a.a(fr.pcsoft.wdjava.core.allocation.IWDAllocateur, boolean):fr.pcsoft.wdjava.core.WDObjet");
    }

    /* renamed from: a */
    public static final WDObjet m2297a(Class<? extends WDObjet> cls) {
        try {
            if (f1494a == null) {
                f1494a = new HashMap();
            }
            try {
                C0613b c0613b = (C0613b) f1494a.get(cls);
                if (c0613b == null) {
                    c0613b = (C0613b) cls.getField(f1495z[3]).get(null);
                    f1494a.put(cls, c0613b);
                }
                return c0613b.mo2622a();
            } catch (Exception e) {
                Exception exception = e;
                try {
                    C0691a.m2856a(f1495z[5] + cls.getName() + f1495z[4]);
                    return (WDObjet) cls.newInstance();
                } catch (Exception e2) {
                    C0691a.m2857a(f1495z[2] + cls.getName(), exception);
                    return null;
                }
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    public static final WDBooleen m2298a(boolean z) {
        return new C0614c(z);
    }

    /* renamed from: a */
    public static final WDBuffer m2299a(byte[] bArr) {
        return new C0621j(bArr);
    }

    /* renamed from: a */
    public static final WDChaine m2300a(String str) {
        return WDProjet.getInstance().isModeAnsi() ? new C0622k(str) : new C0629r(str);
    }

    /* renamed from: a */
    public static final WDChaine m2301a(String str, WDObjet wDObjet) {
        WDChaineA wDChaineA = (WDChaineA) wDObjet.checkType(WDChaineA.class);
        return wDChaineA != null ? new C0625n(str, wDChaineA.mo2547d()) : ((WDChaineU) wDObjet.checkType(WDChaineU.class)) != null ? new C0631t(str) : C0611a.m2300a(str);
    }

    /* renamed from: a */
    public static final WDChaine m2302a(byte[] bArr, WDObjet wDObjet) {
        return ((WDChaineA) wDObjet.checkType(WDChaineA.class)) != null ? new C0627p(bArr) : ((WDChaineU) wDObjet.checkType(WDChaineU.class)) != null ? new C0633v(bArr) : C0611a.m2299a(bArr);
    }

    /* renamed from: a */
    public static final WDEntier8 m2303a(long j) {
        return new qb(j);
    }

    /* renamed from: a */
    public static final WDReel m2304a(double d) {
        return new dc(d);
    }

    /* renamed from: a */
    public static final C0758k m2305a(int[] iArr, int i, IWDAllocateur iWDAllocateur) {
        try {
            Constructor declaredConstructor = Class.forName(f1495z[1]).getDeclaredConstructor(new Class[]{Integer.TYPE, int[].class, Integer.TYPE, Integer.TYPE, IWDAllocateur.class});
            declaredConstructor.setAccessible(true);
            return (C0758k) declaredConstructor.newInstance(new Object[]{Integer.valueOf(iArr.length), iArr, Integer.valueOf(0), Integer.valueOf(i), iWDAllocateur});
        } catch (Exception e) {
            C0691a.m2857a(f1495z[0], e);
            return null;
        }
    }

    /* renamed from: a */
    public static final boolean m2306a(IWDAllocateur iWDAllocateur, IWDAllocateur iWDAllocateur2) {
        return (iWDAllocateur == null || iWDAllocateur2 == null) ? iWDAllocateur == null && iWDAllocateur2 == null : iWDAllocateur.getTypeWL() == iWDAllocateur2.getTypeWL() && iWDAllocateur.isDynamique() == iWDAllocateur2.isDynamique() && iWDAllocateur.getClasseWD().equals(iWDAllocateur2.getClasseWD());
    }

    /* renamed from: b */
    private static final WDObjet m2307b(String str) {
        try {
            return C0611a.m2297a(Class.forName(str));
        } catch (Exception e) {
            C0691a.m2857a(f1495z[2] + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public static final WDEntier4 m2308b(int i) {
        return new mb(i);
    }

    /* renamed from: c */
    public static final WDObjet m2309c(int i) {
        switch (i) {
            case 1:
                return new C0615d();
            case 2:
            case 6:
                return new db();
            case 3:
            case 7:
                return new gb();
            case 4:
            case 8:
                return new jb();
            case 5:
            case 9:
            case 14:
                return new nb();
            case 10:
                return new xb();
            case 12:
                return new ec();
            case 13:
                return new ub();
            case 16:
            case 81:
                return new C0628q();
            case 17:
            case 19:
                return new C0623l();
            case 24:
                return new C0634w();
            case 25:
                return new rb();
            case 26:
                return new C0637z();
            case 28:
            case 30:
                return new C0618g();
            case 61:
                return new ac();
            default:
                C0691a.m2856a(f1495z[6]);
                return null;
        }
    }

    /* renamed from: z */
    private static String m2310z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 46;
                    break;
                case 1:
                    i2 = C0607n.Hn;
                    break;
                case 2:
                    i2 = 33;
                    break;
                case 3:
                    i2 = 39;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2311z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 92);
        }
        return toCharArray;
    }
}
