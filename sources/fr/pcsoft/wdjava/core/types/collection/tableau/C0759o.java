package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.api.WDAPICollection;
import fr.pcsoft.wdjava.api.WDAPITableau;
import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0723g;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p043d.C0688c;
import fr.pcsoft.wdjava.core.p043d.C0690f;
import fr.pcsoft.wdjava.core.p043d.p044a.C0679b;
import fr.pcsoft.wdjava.core.p043d.p044a.C0682d;
import fr.pcsoft.wdjava.core.p043d.p045b.C0684a;
import fr.pcsoft.wdjava.core.p043d.p045b.C0685b;
import fr.pcsoft.wdjava.core.p047f.C0718g;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.poo.C0558c;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0487y;
import fr.pcsoft.wdjava.core.types.C0548s;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.collection.WDSerie;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.C0810n;
import fr.pcsoft.wdjava.database.hf.ab;
import fr.pcsoft.wdjava.xml.C1537g;
import fr.pcsoft.wdjava.xml.classic.C1529e;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

@C0723g(a = {WDAPITableau.class, WDAPICollection.class})
/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.o */
public abstract class C0759o extends C0487y implements C0758k, C0688c, C0718g {
    /* renamed from: b */
    public static final int f1969b = 2;
    /* renamed from: e */
    protected static final int f1970e = 1;
    /* renamed from: f */
    protected static final int f1971f = 2;
    /* renamed from: k */
    public static final int f1972k = 10;
    /* renamed from: n */
    public static final int f1973n = 1;
    /* renamed from: p */
    protected static final int f1974p = 4;
    /* renamed from: z */
    private static final String[] f1975z = new String[]{C0759o.m3405z(C0759o.m3406z("7^`=\tWRq:\u000fXX`7\u0005K^`/\u0001X^j<")), C0759o.m3405z(C0759o.m3406z("7R|+\u001fP^c<\u000eG^a7\u001f@Vl5\u0005UBq:\fUD}<")), C0759o.m3405z(C0759o.m3406z("7Co;\fQV{&\u0003\\R|:\bQH~8\u0012UZq0\u000eBVb0\u0004Q")), C0759o.m3405z(C0759o.m3406z("7^`=\tWRq=\u0005DV|-\u001f@Vl5\u0005UBq:\bQEm1\u0005K^`/\u0001X^j<")), C0759o.m3405z(C0759o.m3406z("b@j&")), C0759o.m3405z(C0759o.m3406z("d@j&")), C0759o.m3405z(C0759o.m3406z("7R|+\u001fYRc;\u0012QHm5\u0001GDk&\tZRv0\u0013@V`-")), C0759o.m3405z(C0759o.m3406z("y@j&")), C0759o.m3405z(C0759o.m3406z("Xr]Y©xþC\u001c.`d\u000e\u001d54cO\u001b,qv[Y.q7]\u0016.`7^\u001834sK\n`w{O\n3qd\u000e\u001654sK\n`P^`6n")), C0759o.m3405z(C0759o.m3406z("}cK\u0014")), C0759o.m3405z(C0759o.m3406z("ue\\\u00189@n^\u001c")), C0759o.m3405z(C0759o.m3406z("7Qa+\rUCq*\u0005F^o5\tGVz0\u000fZHg7\u0003[E|<\u0003@")), C0759o.m3405z(C0759o.m3406z("7Zo,\u0016U^}&\u0010UEo4\u0005@Ek&\u0014F^qK")), C0759o.m3405z(C0759o.m3406z("7Zo,\u0016U^}&\u0010UEo4\u0005@Ek&\u0014F^")), C0759o.m3405z(C0759o.m3406z("7Zo,\u0016U^}&\u0010UEo4\u0005@Ek&\u0014F^qJ")), C0759o.m3405z(C0759o.m3406z("(2\u001fY\u0013[V~&\u0005ZT\u0014\u00182fvW-9dr\u0013[e%L\u000bK\u001d6)")), C0759o.m3405z(C0759o.m3406z("(8\u000bH~")), C0759o.m3405z(C0759o.m3406z("7Ao+\tUUb<\u001fGX{*\u001fQ[k4\u0005ZC")), C0759o.m3405z(C0759o.m3406z("7R|+\u001f@N~<\u001fDEa:\u0005PB|<\u001fWXc)\u0001FVg*\u000fZH|<\u0003\\R|:\bQHz8\u0002XRo,")), C0759o.m3405z(C0759o.m3406z("7Cw)\u0005K^`:\u000fYGo-\tV[k&\u0001RQk:\u0014UCg6\u000e")), C0759o.m3405z(C0759o.m3406z("7^`=\tWRq=\tYR`*\t[Yq0\u000eBVb0\u0004Q")), C0759o.m3405z(C0759o.m3406z("7Dk+\tU[g*\u0001@^a7\u001f@Vl5\u0005UBq7\u001fP^c<\u000eG^a7\u0013K]}6\u000e")), C0759o.m3405z(C0759o.m3406z("7R|+\u001fWXf<\u0012QYm<\u001fP^c<\u000eG^a7")), C0759o.m3405z(C0759o.m3406z("7R|+\u001fUQh<\u0003@Vz0\u000fZHj0\rQY}0\u000fZ")), C0759o.m3405z(C0759o.m3406z("7Qa7\u0003@^a7\u001fZX`&\u0004]D~6")), C0759o.m3405z(C0759o.m3406z("7Sg4\u0005ZDg6\u000eKCo;\fQV{&\tZAo5\tPR")), C0759o.m3405z(C0759o.m3406z("7Sg4\u0005ZDg6\u000eKCo;\fQV{&\tZAo5\tPRqK")), C0759o.m3405z(C0759o.m3406z("7^`=\tWRq-\u0001V[k8\u0015K^`/\u0001X^j<")), C0759o.m3405z(C0759o.m3406z("7Co;\fQV{&r"))};
    /* renamed from: a */
    protected int[] f1976a;
    /* renamed from: c */
    protected ArrayList<WDObjet> f1977c;
    /* renamed from: d */
    protected int f1978d;
    /* renamed from: g */
    protected int f1979g = 0;
    /* renamed from: h */
    protected int f1980h = 0;
    /* renamed from: i */
    protected int f1981i;
    /* renamed from: j */
    protected int f1982j;
    /* renamed from: l */
    protected int f1983l = 0;
    /* renamed from: m */
    protected IWDAllocateur f1984m = null;
    /* renamed from: o */
    protected int f1985o;
    /* renamed from: q */
    protected C0759o[] f1986q;

    /* renamed from: a */
    public static long m3397a(C0758k c0758k, int i, int i2) {
        long j = 1;
        switch (i) {
            case 1:
                return (long) c0758k.mo2640l();
            case 2:
                return (i2 < 0 || i2 > c0758k.mo2640l()) ? 0 : c0758k.mo2640l() == 1 ? c0758k.mo2644p() : c0758k.mo2632a(i2);
            case 3:
                return (long) c0758k.mo2487d();
            case 4:
                return (long) C0810n.m4088a(c0758k.mo2487d());
            case 5:
                return ((long) C0810n.m4088a(c0758k.mo2487d())) * c0758k.mo2483h();
            case 6:
                return c0758k.mo2667j() ? 1 : 0;
            case 7:
                return c0758k.mo2483h();
            case 8:
                return c0758k.mo2640l() == 2 ? c0758k.mo2632a(1) : 0;
            case 9:
                return c0758k.mo2640l() == 2 ? c0758k.mo2632a(2) : 0;
            case 10:
                if (!c0758k.mo2642n()) {
                    j = 0;
                }
                return j;
            case 11:
                return (long) c0758k.mo2639k();
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private final void m3398a(WDObjet wDObjet, boolean z) {
        C0759o c0759o = (C0759o) wDObjet.checkType(C0759o.class);
        if (c0759o == null || !mo2660a(c0759o)) {
            if (wDObjet.isValeurNull()) {
                m3404u();
            } else if (wDObjet.isSerie()) {
                m3399a((WDSerie) wDObjet);
            } else if (this.f1981i == 1) {
                WDErreurManager.m2883a(C0745b.m3222b(f1975z[19], new String[0]));
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(f1975z[20], "" + this.f1982j, "" + (this.f1981i - 1)));
            }
        } else if (z) {
            mo2654a((C0758k) c0759o);
        } else {
            m3401b(c0759o);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m3399a(fr.pcsoft.wdjava.core.types.collection.WDSerie r13) {
        /*
        r12 = this;
        r11 = 10;
        r10 = 2;
        r9 = -1;
        r1 = 1;
        r4 = 0;
        r5 = new int[r11];
        java.util.Arrays.fill(r5, r9);
        r0 = 0;
        r2 = 0;
        r13.m3363a(r5, r0, r2);	 Catch:{ f -> 0x0057 }
    L_0x0010:
        r3 = r4;
        r2 = r4;
        r0 = r4;
    L_0x0013:
        if (r3 >= r11) goto L_0x009d;
    L_0x0015:
        r6 = r5[r3];	 Catch:{ f -> 0x0068 }
        if (r6 <= r9) goto L_0x009d;
    L_0x0019:
        r2 = r2 + 1;
        r6 = r12.f1982j;	 Catch:{ f -> 0x006a }
        if (r2 <= r6) goto L_0x003b;
    L_0x001f:
        r6 = r12.f1984m;	 Catch:{ f -> 0x006c }
        if (r6 == 0) goto L_0x0072;
    L_0x0023:
        r6 = r12.f1984m;	 Catch:{ f -> 0x006e }
        r6 = r6.isDynamique();	 Catch:{ f -> 0x006e }
        if (r6 != 0) goto L_0x0072;
    L_0x002b:
        r6 = fr.pcsoft.wdjava.core.poo.C0734p.class;
        r7 = r12.f1984m;	 Catch:{ f -> 0x0070 }
        r7 = r7.getClasseWD();	 Catch:{ f -> 0x0070 }
        r6 = r6.isAssignableFrom(r7);	 Catch:{ f -> 0x0070 }
        if (r6 == 0) goto L_0x0072;
    L_0x0039:
        r2 = r2 + -1;
    L_0x003b:
        r6 = r12.f1982j;	 Catch:{ f -> 0x0090 }
        if (r6 != r1) goto L_0x0045;
    L_0x003f:
        r6 = r5[r3];	 Catch:{ f -> 0x0092 }
        r7 = r12.f1978d;	 Catch:{ f -> 0x0092 }
        if (r6 > r7) goto L_0x004d;
    L_0x0045:
        r6 = r5[r3];	 Catch:{ f -> 0x0094 }
        r7 = r12.f1976a;	 Catch:{ f -> 0x0094 }
        r7 = r7[r3];	 Catch:{ f -> 0x0094 }
        if (r6 <= r7) goto L_0x0096;
    L_0x004d:
        r6 = r12.isTableauFixe();	 Catch:{ f -> 0x0094 }
        if (r6 != 0) goto L_0x0096;
    L_0x0053:
        r0 = r1;
    L_0x0054:
        r3 = r3 + 1;
        goto L_0x0013;
    L_0x0057:
        r0 = move-exception;
        r0 = f1975z;
        r2 = 22;
        r0 = r0[r2];
        r2 = new java.lang.String[r4];
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r2);
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);
        goto L_0x0010;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ f -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ f -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ f -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ f -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;
    L_0x0072:
        r6 = f1975z;
        r7 = 23;
        r6 = r6[r7];
        r7 = new java.lang.String[r10];
        r8 = java.lang.String.valueOf(r2);
        r7[r4] = r8;
        r8 = r12.f1982j;
        r8 = java.lang.String.valueOf(r8);
        r7[r1] = r8;
        r6 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r6, r7);
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r6);
        goto L_0x003b;
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ f -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ f -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r6 = r12.f1976a;
        r6 = r6[r3];
        r5[r3] = r6;
        goto L_0x0054;
    L_0x009d:
        r1 = r12.f1982j;	 Catch:{ f -> 0x00d3 }
        if (r2 == r1) goto L_0x00c1;
    L_0x00a1:
        r1 = f1975z;	 Catch:{ f -> 0x00d3 }
        r3 = 23;
        r1 = r1[r3];	 Catch:{ f -> 0x00d3 }
        r3 = 2;
        r3 = new java.lang.String[r3];	 Catch:{ f -> 0x00d3 }
        r6 = 0;
        r2 = java.lang.String.valueOf(r2);	 Catch:{ f -> 0x00d3 }
        r3[r6] = r2;	 Catch:{ f -> 0x00d3 }
        r2 = 1;
        r6 = r12.f1982j;	 Catch:{ f -> 0x00d3 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ f -> 0x00d3 }
        r3[r2] = r6;	 Catch:{ f -> 0x00d3 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r3);	 Catch:{ f -> 0x00d3 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);	 Catch:{ f -> 0x00d3 }
    L_0x00c1:
        if (r0 == 0) goto L_0x00cf;
    L_0x00c3:
        r0 = r12.f1982j;
        r0 = new int[r0];
        r1 = r12.f1982j;
        java.lang.System.arraycopy(r5, r4, r0, r4, r1);
        r12.mo2659a(r0, r4);
    L_0x00cf:
        r12.m3400a(r13, r12);
        return;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.types.collection.tableau.o.a(fr.pcsoft.wdjava.core.types.collection.WDSerie):void");
    }

    /* renamed from: a */
    private void m3400a(WDSerie wDSerie, C0759o c0759o) {
        WDObjet[] i = wDSerie.m3374i();
        int length = i.length;
        for (int i2 = 0; i2 < length; i2++) {
            WDObjet wDObjet = i[i2];
            WDObjet wDObjet2 = c0759o.get(i2 + 1);
            if (wDObjet.isSerie() && (wDObjet2 instanceof C0759o)) {
                m3400a((WDSerie) wDObjet, (C0759o) wDObjet2);
            } else {
                wDObjet2.setValeur(wDObjet);
            }
        }
    }

    /* renamed from: b */
    private void m3401b(C0759o c0759o) {
        this.f1984m = c0759o.f1984m;
        this.f1981i = c0759o.f1981i;
        this.f1980h = c0759o.f1980h;
        this.f1982j = c0759o.f1982j;
        this.f1978d = c0759o.f1978d;
        this.f1976a = c0759o.f1976a;
        this.f1985o = c0759o.f1985o;
        this.f1986q = c0759o.f1986q;
        this.f1977c = c0759o.f1977c;
        this.f1979g = 0;
        if (c0759o.mo2481f()) {
            this.f1983l |= 1;
        }
    }

    /* renamed from: b */
    private void m3402b(String str) {
        if (str == null || str.equals("")) {
            str = "0";
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        int[] iArr = new int[stringTokenizer.countTokens()];
        WDChaine wDChaine = new WDChaine();
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            wDChaine.setValeur(stringTokenizer.nextToken());
            int i2 = wDChaine.getInt();
            if (Math.abs(i2) < 1 || Math.abs(i2) > mo2643o()) {
                WDErreurManager.m2883a(C0745b.m3222b(f1975z[0], String.valueOf(i2), String.valueOf(mo2643o())));
            }
            iArr[i] = i2;
            i++;
        }
        mo2658a(iArr);
    }

    /* renamed from: c */
    private long[] m3403c(long j) {
        if (j <= 0 || j > mo2483h()) {
            return null;
        }
        int[] v = m3456v();
        int length = v.length;
        long[] jArr = new long[length];
        int i = 0;
        int i2 = 0;
        while (i < length - 1) {
            int i3;
            double d = (double) v[i + 1];
            for (i3 = i + 2; i3 < length; i3++) {
                d *= (double) v[i3];
            }
            i3 = (int) Math.ceil(((double) j) / d);
            int i4 = i2 + 1;
            jArr[i2] = (long) i3;
            j = (long) (((double) j) - Math.max(0.0d, d * ((double) (i3 - 1))));
            i++;
            i2 = i4;
        }
        jArr[i2] = j;
        return jArr;
    }

    /* renamed from: u */
    private void m3404u() {
        this.f1983l &= -2;
        this.f1981i = 0;
        this.f1980h = 0;
        this.f1982j = 0;
        this.f1978d = 0;
        this.f1976a = null;
        this.f1979g = 0;
        mo2668s();
        this.f1977c = null;
        this.f1986q = null;
    }

    /* renamed from: z */
    private static String m3405z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 20;
                    break;
                case 1:
                    i2 = 23;
                    break;
                case 2:
                    i2 = 46;
                    break;
                case 3:
                    i2 = 121;
                    break;
                default:
                    i2 = 64;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3406z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 64);
        }
        return toCharArray;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public int mo2467a(int r13, fr.pcsoft.wdjava.core.WDObjet[] r14) {
        /*
        r12 = this;
        r6 = 0;
        r5 = -1;
        r2 = 2;
        r11 = 1;
        r4 = 0;
        r0 = r12.mo2635i();	 Catch:{ Exception -> 0x0030 }
        if (r0 == 0) goto L_0x00d7;
    L_0x000b:
        r0 = r14.length;	 Catch:{ Exception -> 0x0032 }
        if (r0 != r11) goto L_0x0058;
    L_0x000e:
        r0 = 0;
        r0 = r14[r0];	 Catch:{ Exception -> 0x0032 }
        r0 = r0 instanceof fr.pcsoft.wdjava.core.poo.WDInstance;	 Catch:{ Exception -> 0x0032 }
        if (r0 == 0) goto L_0x0058;
    L_0x0015:
        r0 = r14[r4];
        r0 = (fr.pcsoft.wdjava.core.poo.WDInstance) r0;
        r1 = r12.f1977c;
        if (r1 == 0) goto L_0x0039;
    L_0x001d:
        r1 = r12.f1977c;
        r1 = r1.size();
    L_0x0023:
        if (r4 >= r1) goto L_0x002f;
    L_0x0025:
        r2 = r12.f1977c;	 Catch:{ Exception -> 0x0034 }
        r2 = r2.get(r4);	 Catch:{ Exception -> 0x0034 }
        if (r2 != r0) goto L_0x0036;
    L_0x002d:
        r5 = r4 + 1;
    L_0x002f:
        return r5;
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r4 = r4 + 1;
        goto L_0x0023;
    L_0x0039:
        r0 = r12.f1986q;
        r1 = r0.length;
        r0 = r4;
    L_0x003d:
        if (r4 >= r1) goto L_0x002f;
    L_0x003f:
        r2 = r12.f1986q;
        r2 = r2[r4];
        r2 = r2.mo2467a(r13, r14);
        if (r2 <= 0) goto L_0x004c;
    L_0x0049:
        r5 = r0 + r2;
        goto L_0x002f;
    L_0x004c:
        r2 = r12.f1976a;
        r3 = r12.f1981i;
        r3 = r3 + -1;
        r2 = r2[r3];
        r0 = r0 + r2;
        r4 = r4 + 1;
        goto L_0x003d;
    L_0x0058:
        r0 = r14[r4];
        r0 = r0.getString();
        r1 = ";";
        r2 = r0.split(r1);
        r0 = r2.length;
        r3 = new fr.pcsoft.wdjava.core.WDObjet[r0];
        r1 = r14.length;	 Catch:{ Exception -> 0x00bd }
        r1 = r1 + -1;
        if (r0 > r1) goto L_0x0071;
    L_0x006c:
        r1 = r14.length;	 Catch:{ Exception -> 0x00bf }
        r6 = r0 + 2;
        if (r1 <= r6) goto L_0x0080;
    L_0x0071:
        r1 = f1975z;	 Catch:{ Exception -> 0x00bf }
        r6 = 2;
        r1 = r1[r6];	 Catch:{ Exception -> 0x00bf }
        r6 = 0;
        r6 = new java.lang.String[r6];	 Catch:{ Exception -> 0x00bf }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r6);	 Catch:{ Exception -> 0x00bf }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);	 Catch:{ Exception -> 0x00bf }
    L_0x0080:
        r1 = r14.length;	 Catch:{ Exception -> 0x00c1 }
        r1 = r1 + -1;
        if (r1 <= r0) goto L_0x00a9;
    L_0x0085:
        r1 = r0 + 1;
        r1 = r14[r1];	 Catch:{ Exception -> 0x00c3 }
        r1 = r1.isEntier();	 Catch:{ Exception -> 0x00c3 }
        if (r1 != 0) goto L_0x009e;
    L_0x008f:
        r1 = f1975z;	 Catch:{ Exception -> 0x00c3 }
        r4 = 3;
        r1 = r1[r4];	 Catch:{ Exception -> 0x00c3 }
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ Exception -> 0x00c3 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r4);	 Catch:{ Exception -> 0x00c3 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);	 Catch:{ Exception -> 0x00c3 }
    L_0x009e:
        r1 = r2.length;
        r1 = r1 + 1;
        r1 = r14[r1];
        r4 = r1.getInt();
        if (r4 < 0) goto L_0x002f;
    L_0x00a9:
        r1 = r14.length;	 Catch:{ Exception -> 0x00c5 }
        if (r1 <= r11) goto L_0x00b1;
    L_0x00ac:
        r1 = 1;
        r5 = 0;
        java.lang.System.arraycopy(r14, r1, r3, r5, r0);	 Catch:{ Exception -> 0x00c5 }
    L_0x00b1:
        if (r13 != r11) goto L_0x00c9;
    L_0x00b3:
        r0 = r12.m3453r();	 Catch:{ Exception -> 0x00c7 }
        r5 = r12.mo2650a(r0, r3, r2);	 Catch:{ Exception -> 0x00c7 }
        goto L_0x002f;
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r0 = move-exception;
        throw r0;
    L_0x00c9:
        r1 = r12.m3453r();
        r5 = r4 + -1;
        r0 = r12;
        r4 = r13;
        r5 = r0.mo2651a(r1, r2, r3, r4, r5);
        goto L_0x002f;
    L_0x00d7:
        r0 = r12.mo2640l();	 Catch:{ Exception -> 0x0105 }
        if (r0 != r11) goto L_0x011f;
    L_0x00dd:
        r0 = r14.length;	 Catch:{ Exception -> 0x0107 }
        if (r0 < r11) goto L_0x011f;
    L_0x00e0:
        r0 = r14.length;	 Catch:{ Exception -> 0x0107 }
        if (r0 > r2) goto L_0x011f;
    L_0x00e3:
        r0 = r14.length;
        if (r0 != r2) goto L_0x028d;
    L_0x00e6:
        r0 = r14[r11];
        r0 = r0.getInt();
    L_0x00ec:
        if (r0 < 0) goto L_0x002f;
    L_0x00ee:
        if (r13 != r11) goto L_0x010b;
    L_0x00f0:
        r0 = r12.m3453r();	 Catch:{ Exception -> 0x0109 }
        r1 = 1;
        r1 = new fr.pcsoft.wdjava.core.WDObjet[r1];	 Catch:{ Exception -> 0x0109 }
        r2 = 0;
        r3 = 0;
        r3 = r14[r3];	 Catch:{ Exception -> 0x0109 }
        r1[r2] = r3;	 Catch:{ Exception -> 0x0109 }
        r2 = -1;
        r3 = 0;
        r5 = r12.mo2649a(r0, r1, r2, r3);	 Catch:{ Exception -> 0x0109 }
        goto L_0x002f;
    L_0x0105:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0107 }
    L_0x0107:
        r0 = move-exception;
        throw r0;
    L_0x0109:
        r0 = move-exception;
        throw r0;
    L_0x010b:
        r1 = r12.m3453r();
        r2 = new fr.pcsoft.wdjava.core.WDObjet[r11];
        r3 = r14[r4];
        r2[r4] = r3;
        r4 = r0 + -1;
        r0 = r12;
        r3 = r13;
        r5 = r0.mo2647a(r1, r2, r3, r4, r5, r6);
        goto L_0x002f;
    L_0x011f:
        r0 = r12.mo2640l();	 Catch:{ Exception -> 0x019f }
        if (r0 != r2) goto L_0x027b;
    L_0x0125:
        r0 = r14.length;	 Catch:{ Exception -> 0x01a1 }
        if (r0 < r2) goto L_0x027b;
    L_0x0128:
        r0 = 0;
        r0 = r14[r0];	 Catch:{ Exception -> 0x01a1 }
        r0 = r0.isChaine();	 Catch:{ Exception -> 0x01a1 }
        if (r0 == 0) goto L_0x01e1;
    L_0x0131:
        r1 = new java.util.StringTokenizer;
        r0 = r14[r4];
        r0 = r0.getString();
        r2 = ";";
        r1.<init>(r0, r2);
        r0 = r1.countTokens();
        r6 = new int[r0];
        r0 = r4;
    L_0x0145:
        r2 = r1.hasMoreTokens();	 Catch:{ Exception -> 0x01a5 }
        if (r2 == 0) goto L_0x01a8;
    L_0x014b:
        r2 = r1.nextToken();	 Catch:{ Exception -> 0x01a5 }
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ Exception -> 0x01a5 }
        if (r2 < r11) goto L_0x015b;
    L_0x0155:
        r3 = r12.mo2643o();	 Catch:{ Exception -> 0x01a3 }
        if (r2 <= r3) goto L_0x019a;
    L_0x015b:
        r3 = f1975z;	 Catch:{ Exception -> 0x01a3 }
        r7 = 0;
        r3 = r3[r7];	 Catch:{ Exception -> 0x01a3 }
        r7 = 2;
        r7 = new java.lang.String[r7];	 Catch:{ Exception -> 0x01a3 }
        r8 = 0;
        r9 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01a3 }
        r9.<init>();	 Catch:{ Exception -> 0x01a3 }
        r10 = "";
        r9 = r9.append(r10);	 Catch:{ Exception -> 0x01a3 }
        r9 = r9.append(r2);	 Catch:{ Exception -> 0x01a3 }
        r9 = r9.toString();	 Catch:{ Exception -> 0x01a3 }
        r7[r8] = r9;	 Catch:{ Exception -> 0x01a3 }
        r8 = 1;
        r9 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01a3 }
        r9.<init>();	 Catch:{ Exception -> 0x01a3 }
        r10 = "";
        r9 = r9.append(r10);	 Catch:{ Exception -> 0x01a3 }
        r10 = r12.mo2643o();	 Catch:{ Exception -> 0x01a3 }
        r9 = r9.append(r10);	 Catch:{ Exception -> 0x01a3 }
        r9 = r9.toString();	 Catch:{ Exception -> 0x01a3 }
        r7[r8] = r9;	 Catch:{ Exception -> 0x01a3 }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r7);	 Catch:{ Exception -> 0x01a3 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r3);	 Catch:{ Exception -> 0x01a3 }
    L_0x019a:
        r6[r0] = r2;	 Catch:{ Exception -> 0x01a5 }
        r0 = r0 + 1;
        goto L_0x0145;
    L_0x019f:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01a1 }
    L_0x01a1:
        r0 = move-exception;
        throw r0;
    L_0x01a3:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01a5 }
    L_0x01a5:
        r0 = move-exception;
        goto L_0x002f;
    L_0x01a8:
        r0 = r14.length;
        r0 = r0 + -2;
        r1 = r6.length;
        if (r0 != r1) goto L_0x01c9;
    L_0x01ae:
        r0 = r14.length;
        r0 = r0 + -1;
        r0 = r14[r0];
        r4 = r0.getInt();
    L_0x01b7:
        if (r4 < 0) goto L_0x002f;
    L_0x01b9:
        r1 = r12.m3453r();
        r4 = r4 + -1;
        r0 = r12;
        r2 = r14;
        r3 = r13;
        r5 = r6;
        r5 = r0.mo2648a(r1, r2, r3, r4, r5);
        goto L_0x002f;
    L_0x01c9:
        r0 = r14.length;	 Catch:{ Exception -> 0x01df }
        r0 = r0 + -1;
        r1 = r6.length;	 Catch:{ Exception -> 0x01df }
        if (r0 == r1) goto L_0x01b7;
    L_0x01cf:
        r0 = f1975z;	 Catch:{ Exception -> 0x01df }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ Exception -> 0x01df }
        r1 = 0;
        r1 = new java.lang.String[r1];	 Catch:{ Exception -> 0x01df }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ Exception -> 0x01df }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ Exception -> 0x01df }
        goto L_0x01b7;
    L_0x01df:
        r0 = move-exception;
        throw r0;
    L_0x01e1:
        r0 = r14.length;
        r1 = 3;
        if (r0 != r1) goto L_0x0250;
    L_0x01e5:
        r0 = r14[r2];
        r0 = r0.getInt();
    L_0x01eb:
        if (r0 < 0) goto L_0x002f;
    L_0x01ed:
        r1 = r14[r4];
        r5 = r1.getInt();
        if (r5 < r11) goto L_0x01fb;
    L_0x01f5:
        r1 = r12.mo2643o();	 Catch:{ Exception -> 0x0267 }
        if (r5 <= r1) goto L_0x023a;
    L_0x01fb:
        r1 = f1975z;	 Catch:{ Exception -> 0x0267 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ Exception -> 0x0267 }
        r2 = 2;
        r2 = new java.lang.String[r2];	 Catch:{ Exception -> 0x0267 }
        r3 = 0;
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0267 }
        r7.<init>();	 Catch:{ Exception -> 0x0267 }
        r8 = "";
        r7 = r7.append(r8);	 Catch:{ Exception -> 0x0267 }
        r7 = r7.append(r5);	 Catch:{ Exception -> 0x0267 }
        r7 = r7.toString();	 Catch:{ Exception -> 0x0267 }
        r2[r3] = r7;	 Catch:{ Exception -> 0x0267 }
        r3 = 1;
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0267 }
        r7.<init>();	 Catch:{ Exception -> 0x0267 }
        r8 = "";
        r7 = r7.append(r8);	 Catch:{ Exception -> 0x0267 }
        r8 = r12.mo2643o();	 Catch:{ Exception -> 0x0267 }
        r7 = r7.append(r8);	 Catch:{ Exception -> 0x0267 }
        r7 = r7.toString();	 Catch:{ Exception -> 0x0267 }
        r2[r3] = r7;	 Catch:{ Exception -> 0x0267 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ Exception -> 0x0267 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);	 Catch:{ Exception -> 0x0267 }
    L_0x023a:
        r1 = r12.m3453r();
        if (r13 != r11) goto L_0x026b;
    L_0x0240:
        r0 = 1;
        r0 = new fr.pcsoft.wdjava.core.WDObjet[r0];	 Catch:{ Exception -> 0x0269 }
        r2 = 0;
        r3 = 1;
        r3 = r14[r3];	 Catch:{ Exception -> 0x0269 }
        r0[r2] = r3;	 Catch:{ Exception -> 0x0269 }
        r2 = 0;
        r5 = r12.mo2649a(r1, r0, r5, r2);	 Catch:{ Exception -> 0x0269 }
        goto L_0x002f;
    L_0x0250:
        r0 = r14.length;	 Catch:{ Exception -> 0x0265 }
        r1 = 3;
        if (r0 <= r1) goto L_0x028a;
    L_0x0254:
        r0 = f1975z;	 Catch:{ Exception -> 0x0265 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0265 }
        r1 = 0;
        r1 = new java.lang.String[r1];	 Catch:{ Exception -> 0x0265 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ Exception -> 0x0265 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ Exception -> 0x0265 }
        r0 = r4;
        goto L_0x01eb;
    L_0x0265:
        r0 = move-exception;
        throw r0;
    L_0x0267:
        r0 = move-exception;
        throw r0;
    L_0x0269:
        r0 = move-exception;
        throw r0;
    L_0x026b:
        r2 = new fr.pcsoft.wdjava.core.WDObjet[r11];
        r3 = r14[r11];
        r2[r4] = r3;
        r4 = r0 + -1;
        r0 = r12;
        r3 = r13;
        r5 = r0.mo2647a(r1, r2, r3, r4, r5, r6);
        goto L_0x002f;
    L_0x027b:
        r0 = f1975z;
        r0 = r0[r2];
        r1 = new java.lang.String[r4];
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);
        goto L_0x002f;
    L_0x028a:
        r0 = r4;
        goto L_0x01eb;
    L_0x028d:
        r0 = r4;
        goto L_0x00ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.types.collection.tableau.o.a(int, fr.pcsoft.wdjava.core.WDObjet[]):int");
    }

    /* renamed from: a */
    public abstract int mo2646a(WDObjet wDObjet, int i);

    /* renamed from: a */
    protected int m3409a(WDObjet wDObjet, WDObjet[] wDObjetArr, WDCallback wDCallback) {
        Object obj = new WDObjet[(wDObjetArr.length + 1)];
        obj[0] = wDObjet;
        if (wDObjetArr.length > 0) {
            System.arraycopy(wDObjetArr, 0, obj, 1, wDObjetArr.length);
        }
        WDObjet execute = wDCallback.execute(obj);
        WDEntier4 wDEntier4 = execute != null ? (WDEntier4) execute.checkType(WDEntier4.class) : null;
        if (wDEntier4 == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f1975z[18], new String[0]));
        }
        return wDEntier4.getInt();
    }

    /* renamed from: a */
    public int mo2468a(C0486m c0486m, int i, int i2, WDObjet[] wDObjetArr) {
        if (mo2640l() > 1) {
            WDErreurManager.m2883a(C0745b.m3222b(f1975z[1], new String[0]));
        }
        WDCallback a = WDCallback.m2239a(c0486m, -1, true);
        return i == 1 ? mo2649a(m3453r(), wDObjetArr, -1, a) : mo2647a(m3453r(), wDObjetArr, i, i2, -1, a);
    }

    /* renamed from: a */
    public abstract int mo2647a(WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2, int i, int i2, int i3, WDCallback wDCallback);

    /* renamed from: a */
    public abstract int mo2648a(WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2, int i, int i2, int[] iArr);

    /* renamed from: a */
    public abstract int mo2649a(WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2, int i, WDCallback wDCallback);

    /* renamed from: a */
    public abstract int mo2650a(WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2, String[] strArr);

    /* renamed from: a */
    public abstract int mo2651a(WDObjet[] wDObjetArr, String[] strArr, WDObjet[] wDObjetArr2, int i, int i2);

    /* renamed from: a */
    public synchronized long mo2632a(int i) {
        long p;
        p = this.f1982j == 1 ? mo2644p() : (this.f1976a == null || i <= 0 || i > this.f1976a.length) ? 0 : (long) this.f1976a[i - 1];
        return p;
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return C0611a.m2294a(this.f1985o, this.f1984m);
    }

    /* renamed from: a */
    public WDObjet mo2469a(long j) {
        return mo2633b(1 + j);
    }

    /* renamed from: a */
    public WDObjet mo2470a(String str, boolean z) {
        return getElement(str, z);
    }

    /* renamed from: a */
    public IWDParcours mo2471a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        return new C0762d(this, this, wDObjet, wDObjet2, wDObjet3, z, z2);
    }

    /* renamed from: a */
    protected final C0761b m3421a(Class cls, String str) {
        C0691a.m2860a(this.f1984m != null, f1975z[8]);
        if (this.f1984m.getTypeWL() != 111) {
            int max = Math.max(str.lastIndexOf(46), str.lastIndexOf(58));
            if (max <= 0 || max >= str.length() - 1) {
                Field a = C0735q.m3120a(cls, str, f1975z[7]);
                if (a == null) {
                    a = C0735q.m3120a(cls, str, f1975z[4]);
                }
                Field a2 = a == null ? C0735q.m3120a(cls, str, f1975z[5]) : a;
                if (a2 == null) {
                    WDErreurManager.m2883a(C0745b.m3222b(f1975z[6], str, C0735q.m3116a(cls)));
                }
                a2.setAccessible(true);
                return new C0773v(this, a2);
            }
            return new C0765h(this, cls, str.substring(0, max), str.substring(max + 1));
        }
        EWDPropriete propByName = EWDPropriete.getPropByName(str);
        if (propByName != null) {
            return new C0763f(this, propByName);
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1975z[6], str, C0725i.m3045b(this.f1984m.getTypeWL())));
        return null;
    }

    /* renamed from: a */
    public void mo2473a(int i, C0486m c0486m) {
        if (c0486m == null) {
            switch (i) {
                case 1:
                    mo2664b(true);
                    return;
                case 2:
                    mo2664b(false);
                    return;
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1975z[13], new String[0]));
                    return;
            }
        } else if ((c0486m instanceof WDObjet) && ((WDObjet) c0486m).checkType(C0548s.class) != null) {
            int i2 = ((WDObjet) c0486m).getInt();
            switch (i) {
                case 1:
                    mo2652a(i2, true);
                    return;
                case 2:
                    mo2652a(i2, false);
                    return;
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1975z[13], new String[0]));
                    return;
            }
        } else if (i == 5) {
            m3427a(c0486m);
        } else if (mo2635i()) {
            if (i != 4) {
                WDErreurManager.m2883a(C0745b.m3222b(f1975z[14], new String[0]));
            }
            mo2655a(c0486m.toString());
        } else {
            if (i != 3) {
                WDErreurManager.m2883a(C0745b.m3222b(f1975z[12], new String[0]));
            }
            m3402b(c0486m.toString());
        }
    }

    /* renamed from: a */
    public abstract void mo2652a(int i, boolean z);

    /* renamed from: a */
    public void m3424a(long j, WDObjet wDObjet) {
        long[] c = m3403c(j);
        if (c != null) {
            WDObjet wDObjet2 = null;
            for (int i = 0; i < c.length - 1; i++) {
                wDObjet2 = wDObjet2 != null ? wDObjet2.get(c[i]) : get(c[i]);
            }
            if (wDObjet2 == null || !(wDObjet2 instanceof C0759o)) {
                this.f1977c.set(C0725i.m3011a((int) c[c.length - 1]), wDObjet);
            } else {
                ((C0759o) wDObjet2).f1977c.set(C0725i.m3011a((int) c[c.length - 1]), wDObjet);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo2653a(WDCallback wDCallback);

    /* renamed from: a */
    public void mo2474a(WDObjet wDObjet, WDObjet wDObjet2) {
        mo2646a(wDObjet, wDObjet2.getInt());
    }

    /* renamed from: a */
    public void m3427a(C0486m c0486m) {
        mo2653a(WDCallback.m2239a(c0486m, -1, true));
    }

    /* renamed from: a */
    public abstract void mo2655a(String str);

    /* renamed from: a */
    public abstract void mo2656a(String str, String str2, String str3);

    /* renamed from: a */
    public abstract void mo2657a(StringBuffer stringBuffer, String str, String str2);

    /* renamed from: a */
    public final void m3431a(boolean z) {
        if (z) {
            this.f1983l |= 2;
        } else {
            this.f1983l &= -3;
        }
    }

    /* renamed from: a */
    public abstract void mo2658a(int[] iArr);

    /* renamed from: a */
    protected abstract boolean mo2660a(C0759o c0759o);

    /* renamed from: b */
    public abstract int mo2663b(int i);

    /* renamed from: b */
    public abstract int mo2475b(WDObjet wDObjet);

    /* renamed from: b */
    public WDObjet mo2633b(long j) {
        long[] c = m3403c(j);
        if (c == null) {
            return null;
        }
        WDObjet wDObjet = null;
        for (int i = 0; i < c.length; i++) {
            wDObjet = wDObjet != null ? wDObjet.get(c[i]) : get(c[i]);
        }
        return wDObjet;
    }

    /* renamed from: b */
    public final WDObjet m3437b(WDObjet wDObjet, int i) {
        int i2 = 0;
        if (this.f1982j > 2) {
            WDErreurManager.m2883a(C0745b.m3222b(f1975z[25], new String[0]));
        }
        if (wDObjet == null) {
            if (this.f1982j > 1) {
                WDErreurManager.m2883a(C0745b.m3222b(f1975z[26], new String[0]));
            }
            Iterator c0767l = new C0767l(this);
        } else if (this.f1982j == 1) {
            if (!mo2635i()) {
                WDErreurManager.m2883a(C0745b.m3222b(f1975z[24], getNomType()));
            }
            r1 = new C0768m(this, wDObjet.getString());
        } else {
            int i3 = wDObjet.getInt();
            if (i3 < 1 || i3 > this.f1978d) {
                WDErreurManager.m2883a(C0745b.m3222b(f1975z[27], "1", String.valueOf(this.f1978d), String.valueOf(i3)));
            }
            r1 = new C0760a(this, C0725i.m3011a(i3 - 1));
        }
        WDObjet wDObjet2 = null;
        while (c0767l.hasNext()) {
            WDObjet wDObjet3 = (WDObjet) c0767l.next();
            if (wDObjet2 != null) {
                wDObjet3 = wDObjet2.opPlus(wDObjet3);
            }
            i2++;
            wDObjet2 = wDObjet3;
        }
        return i == 2 ? wDObjet2.opDiv(i2) : wDObjet2;
    }

    /* renamed from: b */
    public abstract void mo2664b(boolean z);

    public void binderFichier(ab abVar, boolean z) {
        if (z && this.f1982j == 1 && this.f1984m != null) {
            Class classeWD = this.f1984m.getClasseWD();
            if (classeWD != null && C0718g.class.isAssignableFrom(classeWD)) {
                mo2480e();
                IWDParcours a = abVar.mo2717a(true);
                while (a.testParcours()) {
                    try {
                        WDObjet creerInstance = this.f1984m.creerInstance();
                        C0718g c0718g = (C0718g) creerInstance.checkType(C0718g.class);
                        if (c0718g != null) {
                            c0718g.binderFichier(abVar, z);
                            mo2475b(creerInstance);
                        }
                    } finally {
                        a.finParcours();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public int mo2478c(WDObjet wDObjet) {
        return mo2663b(wDObjet.getInt());
    }

    /* renamed from: c */
    public abstract void mo2665c(String str);

    /* renamed from: d */
    public int mo2487d() {
        return this.f1985o;
    }

    public void deserialize(C0682d c0682d) throws C0690f {
        C1529e a = c0682d.mo2582a();
        a.mo3812a(f1975z[10], false, 2, 16, false, 1);
        if (a.mo3815a(null)) {
            int[] iArr;
            Object a2;
            a.mo3819d();
            String c = a.mo3818c();
            int indexOf = c.indexOf(91);
            if (indexOf >= 0) {
                int indexOf2 = c.indexOf(93, indexOf);
                if (indexOf2 >= 0) {
                    String[] split = c.substring(indexOf + 1, indexOf2).split(",");
                    iArr = new int[split.length];
                    indexOf = 0;
                    while (indexOf < split.length) {
                        try {
                            iArr[indexOf] = C0725i.m3064d(split[indexOf]);
                            indexOf++;
                        } catch (C1537g e) {
                            throw e;
                        } catch (C1537g e2) {
                            throw e2;
                        } catch (C1537g e22) {
                            throw e22;
                        } catch (C1537g e222) {
                            throw e222;
                        } catch (C1537g e3) {
                            throw new C0690f(C0745b.m3222b(f1975z[11], new String[0]));
                        }
                    }
                    if (iArr != null) {
                        throw new C0690f(C0745b.m3222b(f1975z[11], new String[0]));
                    }
                    mo2668s();
                    if (this.f1984m == null) {
                        allouerTableau(iArr.length, iArr, 0, this.f1984m);
                    } else {
                        allouerTableau(iArr.length, iArr, 0, this.f1985o);
                    }
                    indexOf = 1;
                    while (a.mo3813a()) {
                        if (a.mo3820e() == 1) {
                            if (a.mo3823h().equals(f1975z[9])) {
                                continue;
                            } else {
                                a2 = c0682d.mo2583a(a);
                                if (a2 != null) {
                                    try {
                                        if (a2 instanceof C0558c) {
                                            mo2633b((long) indexOf).setValeurXMLDeserialisation(a2.toString());
                                        } else if (this.f1984m == null && this.f1984m.isDynamique()) {
                                            mo2633b((long) indexOf).setValeur((WDObjet) a2);
                                        } else {
                                            m3424a((long) indexOf, (WDObjet) a2);
                                        }
                                    } catch (C1537g e2222) {
                                        throw e2222;
                                    } catch (C1537g e22222) {
                                        throw e22222;
                                    }
                                }
                                indexOf++;
                            }
                        }
                    }
                    return;
                }
            }
            iArr = null;
            if (iArr != null) {
                mo2668s();
                if (this.f1984m == null) {
                    allouerTableau(iArr.length, iArr, 0, this.f1985o);
                } else {
                    allouerTableau(iArr.length, iArr, 0, this.f1984m);
                }
                indexOf = 1;
                while (a.mo3813a()) {
                    if (a.mo3820e() == 1) {
                        if (a.mo3823h().equals(f1975z[9])) {
                            continue;
                        } else {
                            a2 = c0682d.mo2583a(a);
                            if (a2 != null) {
                                if (a2 instanceof C0558c) {
                                    mo2633b((long) indexOf).setValeurXMLDeserialisation(a2.toString());
                                } else {
                                    if (this.f1984m == null) {
                                    }
                                    m3424a((long) indexOf, (WDObjet) a2);
                                }
                            }
                            indexOf++;
                        }
                    }
                }
                return;
            }
            throw new C0690f(C0745b.m3222b(f1975z[11], new String[0]));
        }
        throw new C0690f(C0745b.m3222b(f1975z[11], new String[0]));
    }

    public void deserialize(C0685b c0685b) throws C0690f {
        try {
            if (this.f1982j > 1) {
                throw new C0690f(C0745b.m3222b(f1975z[21], new String[0]));
            }
            int a = c0685b.mo2585a();
            try {
                if (a != this.f1978d) {
                    mo2659a(new int[]{a}, 0);
                }
                int i = 0;
                while (i < a) {
                    try {
                        c0685b.mo2586a(i, (WDObjet) this.f1977c.get(i));
                        i++;
                    } catch (C0690f e) {
                        throw e;
                    }
                }
            } catch (C0690f e2) {
                throw e2;
            }
        } catch (C0690f e22) {
            throw e22;
        }
    }

    /* renamed from: f */
    public boolean mo2481f() {
        return (this.f1983l & 1) > 0;
    }

    /* renamed from: g */
    public Class mo2482g() {
        return (!mo2635i() || this.f1984m == null) ? null : this.f1984m.getClasseWD();
    }

    public WDObjet get(int i) {
        if (i < 1 || i > this.f1978d) {
            if (i == this.f1978d + 1 && this.f1982j == 1 && (this.f1983l & 2) > 0) {
                mo2475b(null);
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(f1975z[27], "" + this.f1981i, "" + this.f1978d, "" + i));
                return null;
            }
        }
        return this.f1977c == null ? this.f1986q[C0725i.m3011a(i)] : (WDObjet) this.f1977c.get(C0725i.m3011a(i));
    }

    public WDObjet getClone() {
        int i;
        int i2 = 0;
        C0759o c0759o = (C0759o) super.getClone();
        if (this.f1977c != null) {
            int size = this.f1977c.size();
            c0759o.f1977c = new ArrayList(size);
            for (i = 0; i < size; i++) {
                c0759o.f1977c.add(((WDObjet) this.f1977c.get(i)).getClone());
            }
        }
        if (this.f1986q != null) {
            c0759o.f1986q = (C0759o[]) this.f1986q.clone();
            i = this.f1986q.length;
            while (i2 < i) {
                c0759o.f1986q[i2] = (C0759o) this.f1986q[i2].getClone();
                i2++;
            }
        }
        if (this.f1976a != null) {
            c0759o.f1976a = (int[]) this.f1976a.clone();
        }
        return c0759o;
    }

    public WDObjet getElement(String str) {
        return getElement(str, true);
    }

    public WDObjet getElement(String str, boolean z) {
        if (z) {
            WDErreurManager.m2883a(C0745b.m3222b(f1975z[17], new String[0]));
        }
        return null;
    }

    public String getNomType() {
        return C0745b.m3220a(f1975z[28], String.valueOf(C0725i.m3045b(this.f1985o)));
    }

    public WDEntier4 getOccurrence() {
        return new WDEntier4(mo2483h());
    }

    public int getTypeVar() {
        return 34;
    }

    public WDObjet getValeur() {
        return this;
    }

    public WDBooleen getVide() {
        return new WDBooleen(mo2483h() == 0);
    }

    /* renamed from: h */
    public synchronized long mo2483h() {
        long j;
        j = 0;
        int i = 1;
        while (i <= mo2640l()) {
            j = i == 1 ? mo2644p() : j * mo2632a(i);
            i++;
        }
        return j;
    }

    /* renamed from: i */
    public final boolean mo2635i() {
        return this.f1985o == 37 || this.f1985o == 36 || this.f1985o == 111;
    }

    public boolean isEvaluable() {
        return false;
    }

    public boolean isInstanceLocale() {
        return false;
    }

    public boolean isNull() {
        return !mo2481f();
    }

    public boolean isTableau() {
        return true;
    }

    public boolean isTableauAssociatif() {
        return false;
    }

    public boolean isVariableInterne() {
        return super.isVariableInterne() || (this.f1983l & 4) > 0;
    }

    /* renamed from: k */
    public int mo2639k() {
        return 8;
    }

    /* renamed from: l */
    public synchronized int mo2640l() {
        return this.f1982j;
    }

    /* renamed from: m */
    public final String mo2641m() {
        Class g = mo2482g();
        return g != null ? C0735q.m3116a(g) : "";
    }

    /* renamed from: n */
    public boolean mo2642n() {
        return false;
    }

    /* renamed from: o */
    public int mo2643o() {
        return this.f1980h;
    }

    public void opCopie(WDObjet wDObjet) {
        m3398a(wDObjet, true);
    }

    public void opPriseReference(WDObjet wDObjet) {
        m3398a(wDObjet, false);
    }

    /* renamed from: p */
    public synchronized long mo2644p() {
        long size;
        size = this.f1977c != null ? (long) this.f1977c.size() : this.f1986q != null ? (long) this.f1986q.length : 0;
        return size;
    }

    /* renamed from: q */
    public IWDAllocateur mo2645q() {
        return this.f1984m;
    }

    /* renamed from: r */
    public WDObjet[] m3453r() {
        return this.f1977c == null ? this.f1986q : (WDObjet[]) this.f1977c.toArray(new WDObjet[this.f1977c.size()]);
    }

    public void razVariable() {
        int i = 0;
        int length;
        if (this.f1977c == null) {
            length = this.f1986q.length;
            while (i < length) {
                this.f1986q[i].razVariable();
                i++;
            }
            return;
        }
        int size = this.f1977c.size();
        for (length = 0; length < size; length++) {
            ((WDObjet) this.f1977c.get(length)).razVariable();
        }
    }

    public void release() {
        mo2668s();
        this.f1986q = null;
        this.f1977c = null;
        this.f1984m = null;
        this.f1976a = null;
    }

    /* renamed from: s */
    protected void mo2668s() {
    }

    public void serialize(C0679b c0679b) throws IOException {
        String str = "";
        if (this.f1982j == 1) {
            str = String.valueOf(this.f1978d);
        } else {
            int i = 0;
            while (i < this.f1976a.length) {
                try {
                    if (i > 0) {
                        str = str + ",";
                    }
                    String str2 = str + this.f1976a[i];
                    i++;
                    str = str2;
                } catch (IOException e) {
                    throw e;
                }
            }
        }
        String e2 = c0679b.mo2580e();
        if (C0808l.m4053k(e2)) {
            e2 = "t";
        }
        c0679b.mo2574a(C0808l.m4021a(f1975z[15], e2, str));
        c0679b.mo2579d();
        long h = mo2483h();
        for (long j = 1; j <= h; j++) {
            WDObjet b = mo2633b(j);
            if (b != null) {
                try {
                    c0679b.mo2575a(f1975z[9], b);
                } catch (IOException e3) {
                    throw e3;
                }
            }
        }
        c0679b.mo2578c();
        c0679b.mo2574a(C0808l.m4021a(f1975z[16], e2));
    }

    public void serialize(C0684a c0684a) throws C0690f {
        try {
            if (this.f1982j > 1) {
                throw new C0690f(C0745b.m3222b(f1975z[21], new String[0]));
            }
            c0684a.mo2593f();
            if (this.f1977c != null) {
                int size = this.f1977c.size();
                int i = 0;
                while (i < size) {
                    try {
                        c0684a.mo2588a((WDObjet) this.f1977c.get(i));
                        i++;
                    } catch (C0690f e) {
                        throw e;
                    }
                }
            }
            c0684a.mo2591d();
        } catch (C0690f e2) {
            throw e2;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        boolean z = WDProjet.getInstance().isAffectationTableauParCopie() && !wDObjet.isVariableInterne();
        m3398a(wDObjet, z);
    }

    /* renamed from: t */
    public ArrayList<WDObjet> m3455t() {
        return this.f1977c;
    }

    /* renamed from: v */
    public int[] m3456v() {
        int[] iArr = new int[this.f1982j];
        for (int i = 1; i <= iArr.length; i++) {
            iArr[i - 1] = (int) mo2632a(i);
        }
        return iArr;
    }

    /* renamed from: w */
    public C0759o[] m3457w() {
        return this.f1986q;
    }
}
