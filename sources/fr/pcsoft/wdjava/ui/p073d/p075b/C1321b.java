package fr.pcsoft.wdjava.ui.p073d.p075b;

import android.support.v4.media.session.PlaybackStateCompat;
import fr.pcsoft.wdjava.api.WDAPIHF;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p047f.C0712l;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.C0849z;
import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.WDHF_Manager;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;
import fr.pcsoft.wdjava.database.hf.requete.C0778b;

/* renamed from: fr.pcsoft.wdjava.ui.d.b.b */
public abstract class C1321b implements C1320c {
    /* renamed from: z */
    private static final String f3940z = C1321b.m9345z(C1321b.m9346z("@;>*,"));
    /* renamed from: a */
    protected eb f3941a;
    /* renamed from: b */
    protected String[] f3942b = new String[5];
    /* renamed from: c */
    protected boolean f3943c = true;
    /* renamed from: d */
    protected db f3944d;
    /* renamed from: e */
    protected eb f3945e;
    /* renamed from: f */
    protected int f3946f = 0;
    /* renamed from: g */
    protected eb f3947g;
    /* renamed from: h */
    protected eb f3948h;
    /* renamed from: i */
    protected WDChaine f3949i = new WDChaine();

    /* renamed from: z */
    private static String m9345z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 99;
                    break;
                case 1:
                    i2 = 24;
                    break;
                case 2:
                    i2 = 29;
                    break;
                case 3:
                    i2 = 9;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9346z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 15);
        }
        return toCharArray;
    }

    /* renamed from: A */
    public eb m9347A() {
        return this.f3948h;
    }

    /* renamed from: B */
    public db m9348B() {
        if (this.f3944d == null) {
            String str = this.f3942b[0];
            if (!C0808l.m4053k(str)) {
                try {
                    this.f3944d = WDHF_Manager.m5199e(str);
                } catch (WDException e) {
                    this.f3944d = null;
                }
            }
        }
        return this.f3944d;
    }

    /* renamed from: C */
    protected long mo3655C() {
        try {
            return this.f3944d == null ? 0 : this.f3944d.m3626a(0, "", null, true);
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: D */
    public eb m9350D() {
        return this.f3945e;
    }

    /* renamed from: a */
    public WDObjet mo3607a(C0712l c0712l) {
        return c0712l.mo2597a();
    }

    /* renamed from: a */
    public void mo3609a() {
        this.f3942b = null;
        this.f3944d = null;
        this.f3945e = null;
        this.f3947g = null;
        this.f3941a = null;
        this.f3948h = null;
        this.f3949i = null;
    }

    /* renamed from: a */
    public void mo3638a(int i, boolean z) {
        if (i >= 0) {
            WDHF_Manager.m5078a(i, z ? 2 : 0);
        }
    }

    /* renamed from: a */
    public void m9354a(Integer num) {
        try {
            if (this.f3944d == null) {
                return;
            }
            if (num.intValue() >= 0) {
                try {
                    this.f3944d.m3664a(num, this.f3944d.m3716j(), false);
                    if (this.f3945e.m5855l() != null) {
                        this.f3945e.m5855l().m6030a(num);
                    }
                } catch (WDException e) {
                    throw e;
                }
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public void mo3639a(String str, String[] strArr, String str2, boolean z) {
        this.f3942b[0] = str;
        this.f3942b[1] = strArr[0];
        this.f3942b[2] = strArr[1];
        this.f3942b[3] = strArr[2];
        this.f3942b[4] = strArr[3];
        this.f3949i.setValeur(str2);
        this.f3943c = z;
    }

    /* renamed from: a */
    public boolean mo3640a(WDObjet wDObjet, boolean z) {
        try {
            if (this.f3949i != null) {
                this.f3949i.setValeur(wDObjet);
            }
            if (z) {
                try {
                    if (this.f3944d != null) {
                        if (this.f3945e != null) {
                            try {
                                if (this.f3949i.equals("")) {
                                    this.f3944d.ab();
                                } else {
                                    this.f3944d.m3633a(this.f3945e, 2, this.f3949i);
                                }
                                return true;
                            } catch (WDException e) {
                                throw e;
                            }
                        }
                    }
                } catch (WDException e2) {
                    throw e2;
                } catch (WDException e22) {
                    throw e22;
                }
            }
            return false;
        } catch (WDException e222) {
            throw e222;
        }
    }

    /* renamed from: b */
    public final int m9357b(boolean z) {
        if (z) {
            try {
                this.f3944d.m3657a(this.f3945e, 16384);
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            int b;
            if (!this.f3944d.m3716j()) {
                if (this.f3944d.m3729q() == null) {
                    try {
                        if (!this.f3944d.m3661a(this.f3945e, this.f3943c, true, (long) PlaybackStateCompat.ACTION_PREPARE)) {
                            return -1;
                        }
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
            }
            try {
                b = this.f3944d.m3670b(this.f3945e, (int) C0542t.f1184Z);
            } catch (WDException e22) {
                try {
                    if (this.f3944d.m3716j()) {
                        if (e22.getCode() == 70019) {
                            try {
                                if (!this.f3944d.m3661a(this.f3945e, this.f3943c, true, (long) PlaybackStateCompat.ACTION_PREPARE)) {
                                    return -1;
                                }
                                b = this.f3944d.m3670b(this.f3945e, (int) C0542t.f1184Z);
                            } catch (WDException e222) {
                                throw e222;
                            }
                        }
                    }
                    throw e222;
                } catch (WDException e2222) {
                    throw e2222;
                } catch (WDException e22222) {
                    throw e22222;
                }
            }
            if (!this.f3943c) {
                b = 1000 - b;
            }
            if (b <= -1) {
                return -1;
            }
            b = (b * mo3631k()) / 1000;
            try {
                b = this.f3943c ? b - 1 : b + 1;
                if (b >= 1000) {
                    return b;
                }
                int t = mo3652t();
                try {
                    this.f3944d.m3662a(this.f3945e, !this.f3943c, true, 1, 0);
                    b = 0;
                    while (!this.f3944d.m3599B()) {
                        try {
                            int i = b + 1;
                            this.f3944d.m3662a(this.f3945e, !this.f3943c, true, 1, 0);
                            b = i;
                        } catch (WDException e222222) {
                            throw e222222;
                        } catch (WDException e2222222) {
                            throw e2222222;
                        }
                    }
                    this.f3944d.m3685c(t, 0);
                    return b;
                } catch (WDException e22222222) {
                    throw e22222222;
                }
            } catch (WDException e222222222) {
                throw e222222222;
            }
        } catch (WDException e2222222222) {
            throw e2222222222;
        } catch (WDException e22222222222) {
            throw e22222222222;
        }
    }

    /* renamed from: b */
    public void mo3620b(String str) {
        mo3644e(str);
    }

    /* renamed from: c */
    public abstract int mo3656c(boolean z);

    /* renamed from: c */
    public void mo3641c(int i) {
        if (i >= 0) {
            try {
                WDHF_Manager.m5138b(i);
            } catch (WDException e) {
                throw e;
            }
        }
    }

    /* renamed from: c */
    public boolean mo3642c(String str) {
        try {
            mo3621c();
            this.f3942b[2] = str;
            this.f3947g = null;
            if (this.f3944d != null) {
                if (str.equals("")) {
                    this.f3947g = this.f3945e;
                } else {
                    this.f3947g = this.f3944d.m3714i(str);
                }
            }
            try {
                if (this.f3945e == null) {
                    if (this.f3944d != null) {
                        return false;
                    }
                }
                return true;
            } catch (WDException e) {
                throw e;
            } catch (WDException e2) {
                throw e2;
            }
        } catch (WDException e22) {
            throw e22;
        } catch (WDException e222) {
            throw e222;
        }
    }

    /* renamed from: d */
    public boolean mo3622d() {
        return this.f3943c;
    }

    /* renamed from: d */
    public boolean mo3643d(String str) {
        try {
            this.f3942b[3] = str;
            this.f3941a = null;
            if (this.f3944d != null) {
                if (!str.equals("")) {
                    this.f3941a = this.f3944d.m3714i(str);
                }
            }
            try {
                return this.f3941a != null;
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    public void mo3624e() {
        /*
        r4 = this;
        r2 = 1;
        r0 = r4.f3945e;	 Catch:{ WDException -> 0x00be }
        if (r0 == 0) goto L_0x000d;
    L_0x0005:
        r0 = r4.f3945e;	 Catch:{ WDException -> 0x00c0 }
        r0 = r0.isReleased();	 Catch:{ WDException -> 0x00c0 }
        if (r0 == 0) goto L_0x0022;
    L_0x000d:
        r0 = r4.f3942b;	 Catch:{ WDException -> 0x00c2 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ WDException -> 0x00c2 }
        r1 = "";
        r0 = r0.equals(r1);	 Catch:{ WDException -> 0x00c2 }
        if (r0 == 0) goto L_0x00c4;
    L_0x001a:
        r0 = r4.f3944d;	 Catch:{ WDException -> 0x00c2 }
        r0 = r0.mo2739O();	 Catch:{ WDException -> 0x00c2 }
        r4.f3945e = r0;	 Catch:{ WDException -> 0x00c2 }
    L_0x0022:
        r0 = r4.f3947g;	 Catch:{ WDException -> 0x00d2 }
        if (r0 == 0) goto L_0x002e;
    L_0x0026:
        r0 = r4.f3947g;	 Catch:{ WDException -> 0x00d4 }
        r0 = r0.isReleased();	 Catch:{ WDException -> 0x00d4 }
        if (r0 == 0) goto L_0x0056;
    L_0x002e:
        r0 = r4.f3942b;	 Catch:{ WDException -> 0x00d6 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ WDException -> 0x00d6 }
        r1 = r4.f3942b;	 Catch:{ WDException -> 0x00d6 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ WDException -> 0x00d6 }
        r0 = r0.equals(r1);	 Catch:{ WDException -> 0x00d6 }
        if (r0 != 0) goto L_0x00da;
    L_0x003e:
        r0 = r4.f3942b;	 Catch:{ WDException -> 0x00d8 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ WDException -> 0x00d8 }
        r0 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r0);	 Catch:{ WDException -> 0x00d8 }
        if (r0 != 0) goto L_0x00da;
    L_0x0049:
        r0 = r4.f3944d;	 Catch:{ WDException -> 0x00d8 }
        r1 = r4.f3942b;	 Catch:{ WDException -> 0x00d8 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ WDException -> 0x00d8 }
        r0 = r0.m3726p(r1);	 Catch:{ WDException -> 0x00d8 }
        r4.f3947g = r0;	 Catch:{ WDException -> 0x00d8 }
    L_0x0056:
        r0 = r4.f3941a;	 Catch:{ WDException -> 0x00e0 }
        if (r0 == 0) goto L_0x0062;
    L_0x005a:
        r0 = r4.f3941a;	 Catch:{ WDException -> 0x00e2 }
        r0 = r0.isReleased();	 Catch:{ WDException -> 0x00e2 }
        if (r0 == 0) goto L_0x007c;
    L_0x0062:
        r0 = r4.f3942b;	 Catch:{ WDException -> 0x00e4 }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ WDException -> 0x00e4 }
        r1 = "";
        r0 = r0.equals(r1);	 Catch:{ WDException -> 0x00e4 }
        if (r0 != 0) goto L_0x007c;
    L_0x006f:
        r0 = r4.f3944d;	 Catch:{ WDException -> 0x00e4 }
        r1 = r4.f3942b;	 Catch:{ WDException -> 0x00e4 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ WDException -> 0x00e4 }
        r0 = r0.m3726p(r1);	 Catch:{ WDException -> 0x00e4 }
        r4.f3941a = r0;	 Catch:{ WDException -> 0x00e4 }
    L_0x007c:
        r0 = r4.f3948h;	 Catch:{ WDException -> 0x00e6 }
        if (r0 == 0) goto L_0x0088;
    L_0x0080:
        r0 = r4.f3948h;	 Catch:{ WDException -> 0x00e8 }
        r0 = r0.isReleased();	 Catch:{ WDException -> 0x00e8 }
        if (r0 == 0) goto L_0x00a2;
    L_0x0088:
        r0 = r4.f3942b;	 Catch:{ WDException -> 0x00ea }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ WDException -> 0x00ea }
        r1 = "";
        r0 = r0.equals(r1);	 Catch:{ WDException -> 0x00ea }
        if (r0 != 0) goto L_0x00a2;
    L_0x0095:
        r0 = r4.f3944d;	 Catch:{ WDException -> 0x00ea }
        r1 = r4.f3942b;	 Catch:{ WDException -> 0x00ea }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ WDException -> 0x00ea }
        r0 = r0.m3726p(r1);	 Catch:{ WDException -> 0x00ea }
        r4.f3948h = r0;	 Catch:{ WDException -> 0x00ea }
    L_0x00a2:
        r0 = r4.f3949i;	 Catch:{ WDException -> 0x00ec }
        r1 = "";
        r0 = r0.opEgal(r1);	 Catch:{ WDException -> 0x00ec }
        if (r0 != 0) goto L_0x00b6;
    L_0x00ac:
        r0 = r4.f3944d;	 Catch:{ WDException -> 0x00ec }
        r1 = r4.f3945e;	 Catch:{ WDException -> 0x00ec }
        r2 = 2;
        r3 = r4.f3949i;	 Catch:{ WDException -> 0x00ec }
        r0.m3633a(r1, r2, r3);	 Catch:{ WDException -> 0x00ec }
    L_0x00b6:
        r0 = r4.mo3655C();
        r0 = (int) r0;
        r4.f3946f = r0;
        return;
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;
    L_0x00c4:
        r0 = r4.f3944d;
        r1 = r4.f3942b;
        r1 = r1[r2];
        r0 = r0.m3726p(r1);
        r4.f3945e = r0;
        goto L_0x0022;
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00d6 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;
    L_0x00da:
        r0 = r4.f3945e;
        r4.f3947g = r0;
        goto L_0x0056;
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;
    L_0x00e6:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00e8 }
    L_0x00e8:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00ea }
    L_0x00ea:
        r0 = move-exception;
        throw r0;
    L_0x00ec:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.d.b.b.e():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    public boolean mo3644e(java.lang.String r7) throws fr.pcsoft.wdjava.core.erreur.WDException {
        /*
        r6 = this;
        r3 = 0;
        r2 = 0;
        r1 = 1;
        r6.mo3621c();	 Catch:{ WDException -> 0x008d }
        r0 = "";
        r0 = r7.equals(r0);	 Catch:{ WDException -> 0x008d }
        if (r0 != 0) goto L_0x00bf;
    L_0x000e:
        r0 = r7.toLowerCase();	 Catch:{ WDException -> 0x008f }
        r0 = fr.pcsoft.wdjava.core.utils.C0808l.m4057o(r0);	 Catch:{ WDException -> 0x008f }
        r0 = fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5199e(r0);	 Catch:{ WDException -> 0x008f }
        r6.f3944d = r0;	 Catch:{ WDException -> 0x008f }
        r0 = r6.f3944d;	 Catch:{ WDException -> 0x008f }
        r3 = 0;
        r4 = 3;
        r0 = r0.mo2743b(r3, r4);	 Catch:{ WDException -> 0x008f }
        if (r0 != 0) goto L_0x0043;
    L_0x0026:
        r0 = 1089; // 0x441 float:1.526E-42 double:5.38E-321;
        r0 = fr.pcsoft.wdjava.api.WDAPIHF.hErreurInfo(r0);	 Catch:{ WDException -> 0x008f }
        r0 = r0.getString();	 Catch:{ WDException -> 0x008f }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ WDException -> 0x008f }
        r4 = 0;
        r5 = 1070; // 0x42e float:1.5E-42 double:5.287E-321;
        r5 = fr.pcsoft.wdjava.api.WDAPIHF.hErreurInfo(r5);	 Catch:{ WDException -> 0x008f }
        r5 = r5.getString();	 Catch:{ WDException -> 0x008f }
        r3[r4] = r5;	 Catch:{ WDException -> 0x008f }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2884a(r0, r3);	 Catch:{ WDException -> 0x008f }
    L_0x0043:
        r0 = r6.f3944d;	 Catch:{ WDException -> 0x0091 }
        r3 = r6.f3942b;	 Catch:{ WDException -> 0x0091 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ WDException -> 0x0091 }
        r0 = r0.mo2721b(r3);	 Catch:{ WDException -> 0x0091 }
        r0 = (fr.pcsoft.wdjava.database.hf.eb) r0;	 Catch:{ WDException -> 0x0091 }
        r6.f3941a = r0;	 Catch:{ WDException -> 0x0091 }
        r0 = r6.f3942b;	 Catch:{ WDException -> 0x0091 }
        r3 = 1;
        r0 = r0[r3];	 Catch:{ WDException -> 0x0091 }
        r3 = "";
        r0 = r0.equals(r3);	 Catch:{ WDException -> 0x0091 }
        if (r0 == 0) goto L_0x0093;
    L_0x005f:
        r0 = r6.f3944d;	 Catch:{ WDException -> 0x0091 }
        r0 = r0.mo2739O();	 Catch:{ WDException -> 0x0091 }
        r6.f3945e = r0;	 Catch:{ WDException -> 0x0091 }
    L_0x0067:
        r0 = r6.f3944d;	 Catch:{ WDException -> 0x009b }
        r3 = r6.f3942b;	 Catch:{ WDException -> 0x009b }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ WDException -> 0x009b }
        r0 = r0.mo2721b(r3);	 Catch:{ WDException -> 0x009b }
        r0 = (fr.pcsoft.wdjava.database.hf.eb) r0;	 Catch:{ WDException -> 0x009b }
        r6.f3947g = r0;	 Catch:{ WDException -> 0x009b }
        r0 = r6.f3945e;	 Catch:{ WDException -> 0x009b }
        if (r0 == 0) goto L_0x008b;
    L_0x007a:
        r0 = r6.f3947g;	 Catch:{ WDException -> 0x009d }
        if (r0 != 0) goto L_0x00a1;
    L_0x007e:
        r0 = r6.f3942b;	 Catch:{ WDException -> 0x009f }
        r3 = 2;
        r0 = r0[r3];	 Catch:{ WDException -> 0x009f }
        r3 = "";
        r0 = r0.equals(r3);	 Catch:{ WDException -> 0x009f }
        if (r0 != 0) goto L_0x00a1;
    L_0x008b:
        r0 = r2;
    L_0x008c:
        return r0;
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        throw r0;
    L_0x0091:
        r0 = move-exception;
        throw r0;
    L_0x0093:
        r0 = r6.f3942b;
        r0 = r0[r1];
        r6.mo3646g(r0);
        goto L_0x0067;
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r0 = r6.f3949i;	 Catch:{ WDException -> 0x00bb }
        if (r0 == 0) goto L_0x00b9;
    L_0x00a5:
        r0 = r6.f3949i;	 Catch:{ WDException -> 0x00bd }
        r2 = "";
        r0 = r0.opEgal(r2);	 Catch:{ WDException -> 0x00bd }
        if (r0 != 0) goto L_0x00b9;
    L_0x00af:
        r0 = r6.f3944d;	 Catch:{ WDException -> 0x00bd }
        r2 = r6.f3945e;	 Catch:{ WDException -> 0x00bd }
        r3 = 2;
        r4 = r6.f3949i;	 Catch:{ WDException -> 0x00bd }
        r0.m3633a(r2, r3, r4);	 Catch:{ WDException -> 0x00bd }
    L_0x00b9:
        r0 = r1;
        goto L_0x008c;
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;
    L_0x00bf:
        r6.f3944d = r3;
        r0 = r2;
        goto L_0x008c;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.d.b.b.e(java.lang.String):boolean");
    }

    /* renamed from: f */
    public int mo3626f() {
        return mo3631k();
    }

    /* renamed from: f */
    public boolean mo3645f(String str) {
        try {
            this.f3942b[4] = str;
            this.f3948h = null;
            if (this.f3944d != null) {
                if (!str.equals("")) {
                    this.f3948h = this.f3944d.m3714i(str);
                }
            }
            try {
                return this.f3948h != null;
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* renamed from: g */
    public boolean mo3646g(String str) {
        this.f3942b[1] = str;
        if (this.f3944d != null) {
            boolean startsWith = str.startsWith("-");
            if (startsWith) {
                str = str.substring(1, str.length());
            }
            try {
                if (this.f3945e != null) {
                    if (this.f3945e.mo3137b().equalsIgnoreCase(str)) {
                        try {
                            if (this.f3943c == (!startsWith)) {
                                return false;
                            }
                        } catch (WDException e) {
                            throw e;
                        }
                    }
                }
                try {
                    if (str.equals("")) {
                        this.f3945e = this.f3944d.mo2739O();
                    } else {
                        this.f3943c = !startsWith;
                        this.f3945e = this.f3944d.m3714i(str);
                    }
                } catch (WDException e2) {
                    throw e2;
                } catch (WDException e22) {
                    throw e22;
                }
            } catch (WDException e222) {
                throw e222;
            } catch (WDException e2222) {
                throw e2222;
            }
        } else {
            this.f3945e = null;
        }
        try {
            mo3621c();
            if (this.f3945e == null) {
                if (this.f3944d != null) {
                    return false;
                }
            }
            return true;
        } catch (WDException e22222) {
            throw e22222;
        } catch (WDException e222222) {
            throw e222222;
        }
    }

    /* renamed from: h */
    public boolean mo3628h() {
        try {
            return this.f3941a != null;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: i */
    public void mo3629i() throws WDException {
        if (this.f3944d == null) {
            String str = this.f3942b[0];
            try {
                if (!C0808l.m4053k(str)) {
                    this.f3944d = WDHF_Manager.m5199e(str);
                }
            } catch (WDException e) {
                throw e;
            }
        }
        try {
            if (this.f3944d != null) {
                if (!(!this.f3944d.isRequete() || ((C0778b) this.f3944d).hb() || ((C0778b) this.f3944d).m3760a("", 0, null, false))) {
                    try {
                        WDErreurManager.m2884a(WDAPIHF.hErreurInfo(C0542t.Vc).getString(), WDAPIHF.hErreurInfo(C0542t.mb).getString());
                    } catch (WDException e2) {
                        throw e2;
                    }
                }
                WDHF_Contexte.getInstance().m4999a(this.f3944d, true);
                int t = mo3652t();
                try {
                    mo3624e();
                    mo3633m();
                    if (t >= 0) {
                        this.f3944d.m3685c(t, 0);
                    }
                } catch (WDException e22) {
                    throw e22;
                }
            }
        } catch (WDException e222) {
            throw e222;
        } catch (WDException e2222) {
            throw e2222;
        }
    }

    /* renamed from: j */
    public String mo3630j() {
        return mo3651s();
    }

    /* renamed from: k */
    public int mo3631k() {
        return this.f3946f;
    }

    /* renamed from: l */
    public final boolean mo3632l() {
        try {
            if (this.f3944d != null) {
                if (this.f3945e != null) {
                    try {
                        if (this.f3947g != null) {
                            return true;
                        }
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            return false;
        } catch (WDException e2) {
            throw e2;
        } catch (WDException e22) {
            throw e22;
        }
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ Object mo3634n() {
        return m9348B();
    }

    /* renamed from: o */
    public C0849z mo3647o() {
        return this.f3941a;
    }

    /* renamed from: p */
    public String mo3648p() {
        String str = "";
        if (this.f3945e != null) {
            str = this.f3945e.mo3137b();
        } else if (this.f3942b != null) {
            str = this.f3942b[1];
        }
        return !this.f3943c ? "-" + str : str;
    }

    /* renamed from: q */
    public C0849z mo3649q() {
        return this.f3947g;
    }

    /* renamed from: r */
    public String mo3650r() {
        return this.f3949i != null ? this.f3949i.getString() : "";
    }

    /* renamed from: s */
    public String mo3651s() {
        try {
            return this.f3944d != null ? this.f3944d.mo2719a() : this.f3942b[0];
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: t */
    public int mo3652t() {
        try {
            return this.f3944d != null ? this.f3944d.m3669b(this.f3945e) : -1;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: u */
    public String mo3653u() {
        return this.f3947g != null ? this.f3947g.mo3137b() : this.f3942b != null ? this.f3942b[2] : "";
    }

    /* renamed from: v */
    public String mo3654v() {
        return this.f3941a != null ? this.f3941a.mo3137b() : this.f3942b != null ? this.f3942b[3] : "";
    }

    /* renamed from: z */
    protected final String m9383z() {
        try {
            return this.f3947g != null ? this.f3947g.getString() : f3940z;
        } catch (WDException e) {
            throw e;
        }
    }
}
