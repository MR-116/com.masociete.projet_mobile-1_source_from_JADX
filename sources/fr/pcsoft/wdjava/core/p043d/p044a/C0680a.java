package fr.pcsoft.wdjava.core.p043d.p044a;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p043d.C0688c;
import fr.pcsoft.wdjava.core.p043d.C0690f;
import fr.pcsoft.wdjava.core.poo.C0729v;
import fr.pcsoft.wdjava.core.poo.C0733z;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.core.d.a.a */
public class C0680a implements C0679b {
    /* renamed from: F */
    private static final String[] f1727F = new String[]{C0680a.m2798z(C0680a.m2799z("-\u000e[Db\\\u000fZS\u0017i'xiD+\u0019[FgN\u000fZD\n3\"`sG+e;tTy/yfD?2ykD~+d)Xc-;tXp:;bYr%pnYve69")), C0680a.m2798z(C0680a.m2799z("-ulj[1<quDx%z:\u0015 d$%\b/")), C0680a.m2798z(C0680a.m2799z("2\u000fFUrD\u0018KTrC\u0003UK~B\u000b@Nx_\u0015LJ{")), C0680a.m2798z(C0680a.m2799z("-ePHtD\u0007QIc/")), C0680a.m2798z(C0680a.m2799z("D\u001eR*\u000f")), C0680a.m2798z(C0680a.m2799z("-o%(\t")), C0680a.m2798z(C0680a.m2799z("-o%9\u0012#v;\"\u0006/")), C0680a.m2798z(C0680a.m2799z("-o%'_c/r:\u00152#p\"\u00053e*")), C0680a.m2798z(C0680a.m2799z("\u001c@"))};
    /* renamed from: A */
    private LinkedList f1728A = null;
    /* renamed from: B */
    private Writer f1729B = null;
    /* renamed from: C */
    private String f1730C = null;
    /* renamed from: D */
    private int f1731D = 0;
    /* renamed from: E */
    private LinkedList f1732E = null;

    /* renamed from: z */
    private static String m2798z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 17;
                    break;
                case 1:
                    i2 = 74;
                    break;
                case 2:
                    i2 = 20;
                    break;
                case 3:
                    i2 = 7;
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
    private static char[] m2799z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 55);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo2571a(WDObjet wDObjet, boolean z) {
        try {
            if (this.f1732E == null) {
                this.f1732E = new LinkedList();
            } else {
                int indexOf = this.f1732E.indexOf(wDObjet);
                if (indexOf >= 0) {
                    try {
                        return String.valueOf(indexOf);
                    } catch (WDException e) {
                        throw e;
                    }
                }
            }
            try {
                this.f1732E.add(wDObjet);
                if (z) {
                    if (this.f1728A == null) {
                        this.f1728A = new LinkedList();
                    }
                    this.f1728A.add(wDObjet);
                }
                return String.valueOf(this.f1732E.size() - 1);
            } catch (WDException e2) {
                throw e2;
            } catch (WDException e22) {
                throw e22;
            }
        } catch (WDException e222) {
            throw e222;
        }
    }

    /* renamed from: a */
    public void mo2572a() {
        try {
            this.f1729B = null;
            if (this.f1732E != null) {
                this.f1732E.clear();
                this.f1732E = null;
            }
            try {
                if (this.f1728A != null) {
                    this.f1728A.clear();
                    this.f1728A = null;
                }
            } catch (WDException e) {
                throw e;
            }
        } catch (WDException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public final void m2802a(int i) {
        this.f1731D = Math.max(0, i);
    }

    /* renamed from: a */
    public void mo2573a(C0688c c0688c, WDObjet wDObjet) throws C0690f {
        ByteArrayOutputStream byteArrayOutputStream;
        WDException e;
        Exception e2;
        Throwable th;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                this.f1729B = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, mo2576b()));
                mo2574a(f1727F[1]);
                mo2574a(f1727F[0]);
                c0688c.serialize((C0679b) this);
                if (this.f1728A != null && this.f1728A.size() > 0) {
                    for (int i = 0; i < this.f1728A.size(); i++) {
                        WDObjet wDObjet2 = (WDObjet) this.f1728A.get(i);
                        if (wDObjet2 instanceof C0688c) {
                            ((C0688c) wDObjet2).serialize((C0679b) this);
                        }
                    }
                }
                m2802a(0);
                mo2574a(f1727F[3]);
                this.f1729B.flush();
                wDObjet.setValeur(byteArrayOutputStream.toByteArray());
                try {
                    if (this.f1729B != null) {
                        this.f1729B.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                } catch (IOException e3) {
                }
            } catch (IOException e4) {
                throw e4;
            } catch (IOException e42) {
                throw e42;
            } catch (WDException e5) {
                e = e5;
            } catch (Exception e6) {
                e2 = e6;
            }
        } catch (WDException e7) {
            e = e7;
            byteArrayOutputStream = null;
            try {
                throw new C0690f(e.getMessage());
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (this.f1729B != null) {
                        this.f1729B.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                } catch (IOException e8) {
                }
                throw th;
            }
        } catch (Exception e9) {
            e2 = e9;
            byteArrayOutputStream = null;
            throw new C0690f(C0745b.m3222b(f1727F[2], new String[0]), e2.getMessage());
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            if (this.f1729B != null) {
                this.f1729B.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public void mo2574a(String str) throws IOException {
        if (this.f1729B != null) {
            int i = 0;
            while (i < this.f1731D) {
                try {
                    this.f1729B.write(C0607n.Gc);
                    i++;
                } catch (IOException e) {
                    throw e;
                }
            }
            this.f1729B.write(str);
            this.f1729B.write(f1727F[8]);
        }
    }

    /* renamed from: a */
    public void mo2575a(String str, WDObjet wDObjet) throws IOException {
        try {
            if (wDObjet instanceof C0729v) {
                if (!wDObjet.isAllloue()) {
                    mo2574a(C0808l.m4021a(f1727F[5], str));
                    return;
                }
            }
            WDObjet wDObjet2 = (WDObjet) wDObjet.checkType(C0733z.class);
            if (wDObjet2 != null) {
                try {
                    if (wDObjet2.isNull()) {
                        mo2574a(C0808l.m4021a(f1727F[5], str));
                        return;
                    }
                    String a = mo2571a(wDObjet2, true);
                    mo2574a(C0808l.m4021a(f1727F[7], str, a));
                    return;
                } catch (IOException e) {
                    throw e;
                }
            }
            wDObjet2 = wDObjet.getValeur();
            try {
                if (wDObjet2 instanceof C0688c) {
                    ((C0688c) wDObjet2).serialize((C0679b) this);
                    return;
                }
                mo2574a(C0808l.m4021a(f1727F[6], str, wDObjet2.getValeurXMLPourSerialisation()));
            } catch (IOException e2) {
                throw e2;
            }
        } catch (IOException e22) {
            throw e22;
        } catch (IOException e222) {
            throw e222;
        }
    }

    /* renamed from: b */
    public String mo2576b() {
        return f1727F[4];
    }

    /* renamed from: b */
    public final void mo2577b(String str) {
        this.f1730C = str;
    }

    /* renamed from: c */
    public final void mo2578c() {
        try {
            if (this.f1731D > 0) {
                this.f1731D--;
            }
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: d */
    public final void mo2579d() {
        this.f1731D++;
    }

    /* renamed from: e */
    public final String mo2580e() {
        return this.f1730C;
    }

    /* renamed from: f */
    public final int m2811f() {
        return this.f1731D;
    }
}
