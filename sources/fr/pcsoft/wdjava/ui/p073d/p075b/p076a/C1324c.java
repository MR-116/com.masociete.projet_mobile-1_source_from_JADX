package fr.pcsoft.wdjava.ui.p073d.p075b.p076a;

import android.support.v4.media.session.PlaybackStateCompat;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p047f.C0715d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.C0849z;
import fr.pcsoft.wdjava.database.hf.eb;
import fr.pcsoft.wdjava.ui.champs.jc;
import fr.pcsoft.wdjava.ui.champs.wc;
import fr.pcsoft.wdjava.ui.utils.C1515p;

/* renamed from: fr.pcsoft.wdjava.ui.d.b.a.c */
public abstract class C1324c extends C1323b {
    /* renamed from: z */
    private static final String[] f3956z = new String[]{C1324c.m9435z(C1324c.m9436z("wO61%\u0017C'<\"\u0002G4<(\u0011Y;=-\u0019V")), C1324c.m9435z(C1324c.m9436z("wO61%\u0017C'<\"\u0002G4<(\u0011Y4<?\u0000C'3%\u0017N10>")), C1324c.m9435z(C1324c.m9436z("wJ1&8\u0011Y.<(\u0011")), C1324c.m9435z(C1324c.m9436z("w@7;/\u0000O7;\"\u0015J1!)\u000bH7;3\u0007S(%#\u0006R=03\u0015E;0?\u000b@16$\u001dC**(\u001dT=68"))};
    /* renamed from: o */
    boolean f3957o = false;
    /* renamed from: p */
    protected boolean f3958p = true;
    /* renamed from: q */
    private boolean f3959q = false;

    public C1324c(wc wcVar) {
        super(wcVar);
    }

    /* renamed from: i */
    private void m9433i(int i) {
        int maxItemCountPerRow = i * this.j.getMaxItemCountPerRow();
        int min = m9437Q() ? Math.min(maxItemCountPerRow, mo3657E() * this.j.getMaxItemCountPerRow()) - (this.j.getMaxItemCountPerRow() - m9389H()) : maxItemCountPerRow;
        if (this.j.getItemCount() > 0) {
            int O = m9395O();
            if (O >= 0 ? this.d.m3685c(O, 2) : false) {
                try {
                    if (this.f3959q) {
                        min = m9437Q() ? min - (m9389H() * 1) : min - (this.j.getMaxItemCountPerRow() * 1);
                    }
                    try {
                        m9403c(min, false);
                        this.d.m3662a(this.e, !this.c, true, (long) maxItemCountPerRow, 0);
                    } catch (WDException e) {
                        throw e;
                    }
                } catch (WDException e2) {
                    throw e2;
                }
            }
            try {
                m9403c(this.j.getItemCount(), true);
                this.d.m3661a(this.e, this.c, true, (long) PlaybackStateCompat.ACTION_PREPARE);
                if (mo3660K() > 0) {
                    this.d.m3662a(this.e, this.c, true, (long) mo3660K(), 0);
                }
                mo3667b(true, true);
                return;
            } catch (WDException e22) {
                throw e22;
            }
        }
        mo3667b(false, true);
    }

    /* renamed from: j */
    private void m9434j(int i) {
        int maxItemCountPerRow = i * this.j.getMaxItemCountPerRow();
        if (this.j.getItemCount() > 0) {
            int I = m9390I();
            boolean z = false;
            if (I >= 0) {
                z = this.d.m3685c(I, 2);
            }
            if (z) {
                this.d.m3662a(this.e, this.c, true, (long) ((maxItemCountPerRow - m9403c(maxItemCountPerRow, true)) + 1), 0);
            } else {
                try {
                    m9403c(this.j.getItemCount(), true);
                    this.d.m3661a(this.e, this.c, true, (long) PlaybackStateCompat.ACTION_PREPARE);
                    if (this.d.m3599B()) {
                        mo3621c();
                    } else {
                        try {
                            if (mo3660K() > 0) {
                                this.d.m3662a(this.e, this.c, true, (long) mo3660K(), 0);
                            }
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                } catch (WDException e2) {
                    throw e2;
                }
            }
        }
        mo3667b(true, true);
    }

    /* renamed from: z */
    private static String m9435z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 84;
                    break;
                case 1:
                    i2 = 6;
                    break;
                case 2:
                    i2 = C0607n.co;
                    break;
                case 3:
                    i2 = 117;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9436z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 108);
        }
        return toCharArray;
    }

    /* renamed from: Q */
    protected boolean m9437Q() {
        return this.f3957o;
    }

    /* renamed from: R */
    protected abstract int mo3669R();

    /* renamed from: a */
    public int mo3665a(C0849z c0849z, String str, int i, int i2) {
        try {
            if (!mo3632l()) {
                return -1;
            }
            C0849z c0849z2;
            if (c0849z == null) {
                c0849z2 = this.e;
                if (c0849z2 == null) {
                    return -1;
                }
            }
            c0849z2 = c0849z;
            int i3 = 0;
            if (i == 2 || i2 > 1) {
                try {
                    WDErreurManager.m2883a(C0745b.m3222b(f3956z[3], this.j.getName()));
                } catch (WDException e) {
                    throw e;
                }
            }
            if (i == 0) {
                i3 = 4096;
            }
            try {
                if (this.d.mo2721b(c0849z2.mo3137b()) == null) {
                    return -1;
                }
                i3 += 16384;
                eb ebVar = (eb) c0849z2;
                int b = this.d.m3669b(ebVar);
                this.d.m3659a(ebVar, new WDChaine(str), this.c, true, (long) i3);
                while (i2 > 1) {
                    try {
                        if (!this.d.m3724o()) {
                            break;
                        }
                        this.d.m3662a(ebVar, this.c, true, 1, 0);
                        i2--;
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
                this.d.m3709g(ebVar);
                i3 = -1;
                try {
                    if (this.d.m3724o()) {
                        i3 = mo3666a(ebVar != this.e, false);
                        if (i3 >= 0) {
                            i3++;
                        }
                    }
                    if (b == -1) {
                        return i3;
                    }
                    try {
                        this.d.m3685c(b, 0);
                        return i3;
                    } catch (WDException e22) {
                        throw e22;
                    }
                } catch (WDException e222) {
                    throw e222;
                } catch (WDException e2222) {
                    throw e2222;
                }
            } catch (WDException e22222) {
                throw e22222;
            }
        } catch (WDException e222222) {
            throw e222222;
        }
    }

    /* renamed from: a */
    public int mo3666a(boolean z, boolean z2) {
        try {
            this.j.invalidateDrawCache();
            if (z) {
                this.d.m3657a(this.e, 16384);
            }
            try {
                int b;
                if (!this.d.m3716j()) {
                    if (this.d.m3729q() == null) {
                        try {
                            if (!this.d.m3661a(this.e, this.c, true, (long) PlaybackStateCompat.ACTION_PREPARE)) {
                                ((jc) this.j).listeAffiche(1);
                                return -1;
                            }
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                }
                try {
                    b = this.d.m3670b(this.e, (int) C0542t.f1184Z);
                } catch (WDException e2) {
                    try {
                        if (this.d.m3716j()) {
                            if (e2.getCode() == 70019) {
                                try {
                                    if (this.d.m3661a(this.e, this.c, true, (long) PlaybackStateCompat.ACTION_PREPARE)) {
                                        b = this.d.m3670b(this.e, (int) C0542t.f1184Z);
                                    } else {
                                        ((jc) this.j).listeAffiche(1);
                                        return -1;
                                    }
                                } catch (WDException e22) {
                                    throw e22;
                                }
                            }
                        }
                        throw e22;
                    } catch (WDException e222) {
                        throw e222;
                    } catch (WDException e2222) {
                        throw e2222;
                    }
                }
                if (!this.c) {
                    b = 1000 - b;
                }
                if (b > -1) {
                    b = (b * mo3631k()) / 1000;
                    try {
                        int t;
                        int i;
                        int i2 = this.c ? b - 1 : b + 1;
                        Object obj = null;
                        if (i2 < 1000) {
                            t = mo3652t();
                            try {
                                this.d.m3662a(this.e, !this.c, true, 1, 0);
                                i2 = 0;
                                while (!this.d.m3599B()) {
                                    try {
                                        i = i2 + 1;
                                        this.d.m3662a(this.e, !this.c, true, 1, 0);
                                        i2 = i;
                                    } catch (WDException e22222) {
                                        throw e22222;
                                    } catch (WDException e222222) {
                                        throw e222222;
                                    }
                                }
                                this.d.m3685c(t, 0);
                                obj = 1;
                                i = i2;
                            } catch (WDException e2222222) {
                                throw e2222222;
                            }
                        }
                        i = i2;
                        t = mo3626f();
                        if (this.j.getItemCount() + i > t) {
                            b = t - 1;
                            if (i >= 1000) {
                                int t2 = mo3652t();
                                i = b;
                                while (true) {
                                    try {
                                        this.d.m3662a(this.e, this.c, true, 1, 0);
                                        if (this.d.m3599B()) {
                                            break;
                                        }
                                        i--;
                                    } catch (WDException e22222222) {
                                        throw e22222222;
                                    }
                                }
                                this.d.m3685c(t2, 0);
                            }
                            try {
                                if (t <= mo3668d(true)) {
                                    m9403c(this.j.getItemCount(), true);
                                    this.d.m3661a(this.e, this.c, true, (long) PlaybackStateCompat.ACTION_PREPARE);
                                    if (this.d.m3599B()) {
                                        mo3621c();
                                        return i;
                                    }
                                    mo3667b(true, true);
                                    return i;
                                }
                                mo3670f(true);
                                C1515p.m10541a();
                                return i;
                            } catch (WDException e222222222) {
                                throw e222222222;
                            } catch (WDException e2222222222) {
                                throw e2222222222;
                            }
                        }
                        if (obj != null) {
                            int maxItemCountPerRow = i % this.j.getMaxItemCountPerRow();
                            if (maxItemCountPerRow > 0) {
                                try {
                                    this.d.m3662a(this.e, !this.c, true, (long) maxItemCountPerRow, 0);
                                } catch (WDException e22222222222) {
                                    throw e22222222222;
                                }
                            }
                        }
                        m9403c(this.j.getItemCount(), true);
                        mo3667b(true, true);
                        mo3619b(i, false);
                        return i;
                    } catch (WDException e222222222222) {
                        throw e222222222222;
                    }
                }
                ((jc) this.j).listeAffiche(1);
                return -1;
            } catch (WDException e2222222222222) {
                throw e2222222222222;
            } catch (WDException e22222222222222) {
                throw e22222222222222;
            }
        } catch (WDException e222222222222222) {
            throw e222222222222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public java.lang.Object mo3608a(int r11) {
        /*
        r10 = this;
        r9 = 0;
        r0 = r10.mo3626f();
        if (r0 == 0) goto L_0x000d;
    L_0x0007:
        r1 = r10.mo3632l();	 Catch:{ WDException -> 0x0091 }
        if (r1 != 0) goto L_0x0051;
    L_0x000d:
        r1 = new java.lang.StringBuilder;	 Catch:{ WDException -> 0x0091 }
        r1.<init>();	 Catch:{ WDException -> 0x0091 }
        r2 = f3956z;	 Catch:{ WDException -> 0x0091 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ WDException -> 0x0091 }
        r3 = 0;
        r3 = new java.lang.String[r3];	 Catch:{ WDException -> 0x0091 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ WDException -> 0x0091 }
        r1 = r1.append(r2);	 Catch:{ WDException -> 0x0091 }
        r2 = "\n";
        r1 = r1.append(r2);	 Catch:{ WDException -> 0x0091 }
        r2 = f3956z;	 Catch:{ WDException -> 0x0091 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ WDException -> 0x0091 }
        r3 = 2;
        r3 = new java.lang.String[r3];	 Catch:{ WDException -> 0x0091 }
        r4 = 0;
        r5 = r10.j;	 Catch:{ WDException -> 0x0091 }
        r5 = r5.getName();	 Catch:{ WDException -> 0x0091 }
        r3[r4] = r5;	 Catch:{ WDException -> 0x0091 }
        r4 = 1;
        r5 = r11 + 1;
        r5 = java.lang.String.valueOf(r5);	 Catch:{ WDException -> 0x0091 }
        r3[r4] = r5;	 Catch:{ WDException -> 0x0091 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ WDException -> 0x0091 }
        r1 = r1.append(r2);	 Catch:{ WDException -> 0x0091 }
        r1 = r1.toString();	 Catch:{ WDException -> 0x0091 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r1);	 Catch:{ WDException -> 0x0091 }
    L_0x0051:
        r8 = 0;
        if (r11 < 0) goto L_0x00d0;
    L_0x0054:
        if (r11 >= r0) goto L_0x00d0;
    L_0x0056:
        r0 = r10.mo3660K();
        if (r11 < r0) goto L_0x0095;
    L_0x005c:
        r1 = r10.j;	 Catch:{ WDException -> 0x0093 }
        r1 = r1.getItemCount();	 Catch:{ WDException -> 0x0093 }
        r1 = r1 + r0;
        if (r11 >= r1) goto L_0x0095;
    L_0x0065:
        r1 = r10.j;
        r0 = r11 - r0;
        r1 = r1.getItemAt(r0);
    L_0x006d:
        if (r1 != 0) goto L_0x0090;
    L_0x006f:
        r0 = f3956z;	 Catch:{ WDException -> 0x00ce }
        r2 = 1;
        r0 = r0[r2];	 Catch:{ WDException -> 0x00ce }
        r2 = 2;
        r2 = new java.lang.String[r2];	 Catch:{ WDException -> 0x00ce }
        r3 = 0;
        r4 = r11 + 1;
        r4 = java.lang.String.valueOf(r4);	 Catch:{ WDException -> 0x00ce }
        r2[r3] = r4;	 Catch:{ WDException -> 0x00ce }
        r3 = 1;
        r4 = r10.j;	 Catch:{ WDException -> 0x00ce }
        r4 = r4.getName();	 Catch:{ WDException -> 0x00ce }
        r2[r3] = r4;	 Catch:{ WDException -> 0x00ce }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r2);	 Catch:{ WDException -> 0x00ce }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ WDException -> 0x00ce }
    L_0x0090:
        return r1;
    L_0x0091:
        r0 = move-exception;
        throw r0;
    L_0x0093:
        r0 = move-exception;
        throw r0;
    L_0x0095:
        r0 = r10.d;	 Catch:{ WDException -> 0x00cc }
        r1 = r10.e;	 Catch:{ WDException -> 0x00cc }
        r2 = r10.c;	 Catch:{ WDException -> 0x00cc }
        r3 = 1;
        r4 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        r0.m3661a(r1, r2, r3, r4);	 Catch:{ WDException -> 0x00cc }
        if (r11 <= 0) goto L_0x00b0;
    L_0x00a3:
        r0 = r10.d;	 Catch:{ WDException -> 0x00cc }
        r1 = r10.e;	 Catch:{ WDException -> 0x00cc }
        r2 = r10.c;	 Catch:{ WDException -> 0x00cc }
        r3 = 1;
        r4 = (long) r11;	 Catch:{ WDException -> 0x00cc }
        r6 = 0;
        r0.m3662a(r1, r2, r3, r4, r6);	 Catch:{ WDException -> 0x00cc }
    L_0x00b0:
        r0 = r10.d;
        r0 = r0.m3599B();
        if (r0 != 0) goto L_0x00d0;
    L_0x00b8:
        r0 = r10.j;
        r1 = r0.createBindingItem();
        r1.mo3393a(r11, r9);
        r0 = r1;
        r0 = (fr.pcsoft.wdjava.ui.champs.ad) r0;
        r2 = r10.mo3652t();
        r0.mo3417a(r2);
        goto L_0x006d;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r0 = move-exception;
        throw r0;
    L_0x00d0:
        r1 = r8;
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.d.b.a.c.a(int):java.lang.Object");
    }

    /* renamed from: a */
    public boolean mo3615a(WDObjet wDObjet) {
        try {
            if (this.a == null || !mo3632l()) {
                return false;
            }
            int b = this.d.m3669b(this.a);
            try {
                this.d.m3659a(this.a, wDObjet, this.c, true, 0);
                this.d.m3709g(this.e);
                if (!this.d.m3724o()) {
                    return false;
                }
                mo3666a(this.e != this.a, true);
                this.d.m3685c(b, 0);
                return true;
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public boolean mo3640a(WDObjet wDObjet, boolean z) {
        boolean a = super.mo3640a(wDObjet, z);
        if (a) {
            try {
                mo3612a("I");
            } catch (WDException e) {
                throw e;
            }
        }
        return a;
    }

    /* renamed from: b */
    public C0715d mo3616b() {
        return C0715d.DIRECT_ACCESS;
    }

    /* renamed from: b */
    public void mo3617b(int i) {
        try {
            this.j.invalidateDrawCache();
            this.j.setSelectionParProgrammation(true);
            if (this.d != null) {
                if (this.e != null) {
                    mo3624e();
                    if (i >= 0) {
                        m9403c(this.j.getItemCount(), true);
                        this.d.m3661a(this.e, this.c, true, (long) PlaybackStateCompat.ACTION_PREPARE);
                        int maxItemCountPerRow = i - (i % this.j.getMaxItemCountPerRow());
                        if (maxItemCountPerRow > 0) {
                            try {
                                this.d.m3662a(this.e, this.c, true, (long) maxItemCountPerRow, 0);
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                        try {
                            if (!mo3671h(maxItemCountPerRow)) {
                                mo3667b(true, true);
                                mo3659G();
                                this.j.notifyDataSetChanged();
                            }
                            mo3662M();
                        } catch (WDException e2) {
                            throw e2;
                        }
                    }
                }
            }
            this.j.setSelectionParProgrammation(false);
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    /* renamed from: b */
    public void mo3618b(int r8, int r9) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.ui.d.b.a.c.b(int, int):void. bs: [B:11:0x0020, B:39:0x007f, B:48:0x008c]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r7 = this;
        r3 = 0;
        r2 = 1;
        r0 = r7.mo3632l();	 Catch:{ WDException -> 0x0009 }
        if (r0 != 0) goto L_0x000b;
    L_0x0008:
        return;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r0 = r7.j;
        r6 = r0.isSelectionParProgrammation();
        r0 = r7.j;
        r0.setSelectionParProgrammation(r2);
        if (r9 != r8) goto L_0x001e;
    L_0x0018:
        r0 = r7.j;
        r0.setSelectionParProgrammation(r6);
        goto L_0x0008;
    L_0x001e:
        if (r8 != 0) goto L_0x0047;
    L_0x0020:
        r0 = r7.j;	 Catch:{ all -> 0x006e }
        r0 = r0.getItemCount();	 Catch:{ all -> 0x006e }
        r1 = 1;	 Catch:{ all -> 0x006e }
        r7.m9403c(r0, r1);	 Catch:{ all -> 0x006e }
        r0 = r7.d;	 Catch:{ all -> 0x006e }
        r1 = r7.e;	 Catch:{ all -> 0x006e }
        r2 = r7.c;	 Catch:{ all -> 0x006e }
        r3 = 1;	 Catch:{ all -> 0x006e }
        r4 = 24576; // 0x6000 float:3.4438E-41 double:1.2142E-319;	 Catch:{ all -> 0x006e }
        r0.m3661a(r1, r2, r3, r4);	 Catch:{ all -> 0x006e }
        r0 = 1;	 Catch:{ all -> 0x006e }
        r1 = 1;	 Catch:{ all -> 0x006e }
        r7.mo3667b(r0, r1);	 Catch:{ all -> 0x006e }
        r0 = 0;	 Catch:{ all -> 0x006e }
        r7.f3959q = r0;	 Catch:{ all -> 0x006e }
    L_0x003e:
        r7.mo3659G();	 Catch:{ all -> 0x006e }
        r0 = r7.j;
        r0.setSelectionParProgrammation(r6);
        goto L_0x0008;
    L_0x0047:
        r0 = r7.mo3661L();	 Catch:{ WDException -> 0x0075 }
        if (r0 == 0) goto L_0x007b;
    L_0x004d:
        r0 = 1;
        r7.f3959q = r0;	 Catch:{ WDException -> 0x0077 }
        r0 = r7.j;	 Catch:{ WDException -> 0x0077 }
        r0 = r0.getItemCount();	 Catch:{ WDException -> 0x0077 }
        r1 = 0;	 Catch:{ WDException -> 0x0077 }
        r7.m9403c(r0, r1);	 Catch:{ WDException -> 0x0077 }
        r0 = r7.d;	 Catch:{ WDException -> 0x0077 }
        r1 = r7.e;	 Catch:{ WDException -> 0x0077 }
        r4 = r7.c;	 Catch:{ WDException -> 0x0077 }
        if (r4 != 0) goto L_0x0079;
    L_0x0062:
        r3 = 1;
        r4 = 24576; // 0x6000 float:3.4438E-41 double:1.2142E-319;
        r0.m3661a(r1, r2, r3, r4);	 Catch:{ all -> 0x006e }
        r0 = 0;	 Catch:{ all -> 0x006e }
        r1 = 0;	 Catch:{ all -> 0x006e }
        r7.mo3667b(r0, r1);	 Catch:{ all -> 0x006e }
        goto L_0x003e;
    L_0x006e:
        r0 = move-exception;
        r1 = r7.j;
        r1.setSelectionParProgrammation(r6);
        throw r0;
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x006e }
    L_0x0079:
        r2 = r3;
        goto L_0x0062;
    L_0x007b:
        if (r9 >= r8) goto L_0x0088;
    L_0x007d:
        r0 = r8 - r9;
        r7.m9434j(r0);	 Catch:{ WDException -> 0x0086 }
    L_0x0082:
        r0 = 0;
        r7.f3959q = r0;	 Catch:{ all -> 0x006e }
        goto L_0x003e;	 Catch:{ all -> 0x006e }
    L_0x0086:
        r0 = move-exception;	 Catch:{ all -> 0x006e }
        throw r0;	 Catch:{ all -> 0x006e }
    L_0x0088:
        if (r9 <= r8) goto L_0x0082;
    L_0x008a:
        r0 = r9 - r8;
        r7.m9433i(r0);	 Catch:{ WDException -> 0x0090 }
        goto L_0x0082;
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x006e }
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.d.b.a.c.b(int, int):void");
    }

    /* renamed from: b */
    protected void mo3667b(boolean z, boolean z2) {
        boolean z3 = true;
        try {
            if (mo3632l()) {
                try {
                    if (this.d.m3599B()) {
                        m9450e(z);
                        return;
                    }
                    boolean z4 = this.c;
                    if (!z2) {
                        try {
                            if (this.c) {
                                z3 = false;
                            }
                            z4 = z3;
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                    int d = mo3668d(mo3661L());
                    int E = mo3657E();
                    try {
                        int i;
                        int maxItemCountPerRow;
                        if (this.f3959q && mo3661L()) {
                            i = 0;
                            maxItemCountPerRow = d - (this.j.getMaxItemCountPerRow() * 1);
                        } else {
                            i = 0;
                            maxItemCountPerRow = d;
                        }
                        while (this.j.getRowCount(1) <= E && i < r10) {
                            try {
                                if (i > 0) {
                                    try {
                                        this.d.m3662a(this.e, z4, true, 1, 0);
                                    } catch (WDException e2) {
                                        throw e2;
                                    }
                                }
                                try {
                                    if (!this.d.m3599B()) {
                                        int t = mo3652t();
                                        d = z2 ? z ? this.j.getItemCount() : i : 0;
                                        m9405c(d, t);
                                        i++;
                                    } else {
                                        return;
                                    }
                                } catch (WDException e22) {
                                    throw e22;
                                }
                            } catch (WDException e222) {
                                throw e222;
                            } catch (WDException e2222) {
                                throw e2222;
                            }
                        }
                    } catch (WDException e22222) {
                        throw e22222;
                    }
                } catch (WDException e222222) {
                    throw e222222;
                }
            }
        } catch (WDException e2222222) {
            throw e2222222;
        }
    }

    /* renamed from: c */
    public void mo3621c() {
        m9403c(this.j.getItemCount(), true);
        this.f = 0;
    }

    /* renamed from: d */
    public int mo3668d(boolean z) {
        this.f3957o = z;
        return super.mo3668d(z);
    }

    /* renamed from: e */
    protected void m9450e(boolean z) {
        boolean isSelectionParProgrammation = this.j.isSelectionParProgrammation();
        this.j.setSelectionParProgrammation(true);
        try {
            if (this.j.getItemCount() == 0 && z) {
                int R = mo3669R();
                this.d.m3661a(this.e, !this.c, true, (long) PlaybackStateCompat.ACTION_PREPARE);
                if (this.d.m3599B()) {
                    mo3621c();
                    this.j.setSelectionParProgrammation(isSelectionParProgrammation);
                    return;
                }
                if (R > 0) {
                    this.d.m3662a(this.e, !this.c, true, (long) R, 0);
                    if (this.d.m3599B()) {
                        mo3621c();
                        this.j.setSelectionParProgrammation(isSelectionParProgrammation);
                        return;
                    }
                }
                mo3667b(true, true);
            } else if (!z) {
                int K = mo3660K() - 1;
                this.d.m3661a(this.e, this.c, true, (long) PlaybackStateCompat.ACTION_PREPARE);
                if (this.d.m3599B()) {
                    mo3621c();
                    this.j.setSelectionParProgrammation(isSelectionParProgrammation);
                    return;
                }
                if (K > 0) {
                    this.d.m3662a(this.e, this.c, true, (long) K, 0);
                }
                mo3667b(false, false);
            }
            this.j.setSelectionParProgrammation(isSelectionParProgrammation);
        } catch (WDException e) {
            throw e;
        } catch (WDException e2) {
            throw e2;
        } catch (Throwable th) {
            this.j.setSelectionParProgrammation(isSelectionParProgrammation);
        }
    }

    /* renamed from: f */
    public abstract void mo3670f(boolean z);

    /* renamed from: g */
    public void mo3627g() {
    }

    /* renamed from: h */
    public abstract boolean mo3671h(int i);

    /* renamed from: m */
    public void mo3633m() {
        this.d.m3661a(this.e, this.c, true, (long) PlaybackStateCompat.ACTION_PREPARE);
        mo3667b(true, true);
    }

    /* renamed from: w */
    public boolean mo3635w() {
        return this.f3958p;
    }
}
