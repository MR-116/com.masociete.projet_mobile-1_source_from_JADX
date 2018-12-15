package fr.pcsoft.wdjava.ui.dialogue;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.report.C0697b;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDDate;
import fr.pcsoft.wdjava.core.types.WDHeure;
import fr.pcsoft.wdjava.core.types.collection.C0582d;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.utils.C1504c;
import java.io.File;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.f */
public abstract class C1372f {
    /* renamed from: A */
    public static final int f4082A = 2;
    /* renamed from: B */
    public static final String f4083B = C1372f.m9829z(C1372f.m9830z("/\u000b"));
    /* renamed from: C */
    public static final String f4084C = C1372f.m9829z(C1372f.m9830z("8Q#sj\u0019u\"Uf\u0003]\u0000R|\u001cY*RM\u0000@"));
    /* renamed from: D */
    public static final String f4085D = C1372f.m9829z(C1372f.m9830z("/\n"));
    /* renamed from: E */
    public static final int f4086E = 1111;
    /* renamed from: F */
    public static final int f4087F = 1;
    /* renamed from: G */
    public static final int f4088G = 32;
    /* renamed from: H */
    private static final String[] f4089H;
    /* renamed from: a */
    public static final int f4090a = 3;
    /* renamed from: b */
    public static final int f4091b = 4;
    /* renamed from: c */
    public static final String f4092c = C1372f.m9829z(C1372f.m9830z("8Q#sj\u0019u\"Uf\u0003]\t^n\u0003W*u`\u0017"));
    /* renamed from: d */
    public static final int f4093d = 1;
    /* renamed from: e */
    public static final int f4094e = 5;
    /* renamed from: f */
    public static final int f4095f = 64;
    /* renamed from: g */
    public static final int f4096g = 2;
    /* renamed from: h */
    public static final int f4097h = 0;
    /* renamed from: i */
    public static String f4098i = C1372f.m9829z(C1372f.m9830z("\tJcGl\u001cW+C!\u0018\\'Vy\u000e\u00168^!\u000bQ,[`\bM(\u0019X+u>PM\u0000@\u0000Va\u000e_(EF\u0002H!"));
    /* renamed from: j */
    public static final int f4099j = 4;
    /* renamed from: k */
    public static final int f4100k = 6;
    /* renamed from: l */
    public static final int f4101l = 5;
    /* renamed from: m */
    public static final int f4102m = 1;
    /* renamed from: n */
    public static final String f4103n = C1372f.m9829z(C1372f.m9830z("/\t"));
    /* renamed from: o */
    public static final int f4104o = 65536;
    /* renamed from: p */
    public static final int f4105p = 3;
    /* renamed from: q */
    public static final int f4106q = 0;
    /* renamed from: r */
    public static final int f4107r = 7;
    /* renamed from: s */
    public static final int f4108s = 48;
    /* renamed from: t */
    public static final int f4109t = 2;
    /* renamed from: u */
    public static final int f4110u = 65536;
    /* renamed from: v */
    public static final int f4111v = 4;
    /* renamed from: w */
    protected static C1372f f4112w = null;
    /* renamed from: x */
    public static final char f4113x = '\b';
    /* renamed from: y */
    public static final int f4114y = 0;
    /* renamed from: z */
    protected static final int f4115z = 1;

    static {
        String[] strArr = new String[3];
        strArr[0] = C1372f.m9829z(C1372f.m9830z("&U=X|\u001cQ/[jO\\(\u0017l\u0007Y?Pj\u001d\u0018!R/\b]>Cf\u0000V#Vf\u001d]mSjOU>Pm\u0000@a\u0017`\u0001\u0018=V|\u001c]mRaOU)XjO\\¤P}\u000e\\¤\u0019"));
        strArr[1] = C1372f.m9829z(C1372f.m9830z("Lw\u0006"));
        strArr[2] = C1372f.m9829z(C1372f.m9830z("Ly\u0003yZ#}\u001f"));
        f4089H = strArr;
    }

    /* renamed from: a */
    public static synchronized C1372f m9828a() {
        C1372f c1372f;
        synchronized (C1372f.class) {
            try {
                if (f4112w == null) {
                    if (C1504c.m10455a()) {
                        f4112w = new C1378g();
                    } else {
                        try {
                            f4112w = (C1372f) Class.forName(f4098i).newInstance();
                        } catch (Exception e) {
                            C0691a.m2857a(f4089H[0], e);
                            f4112w = new C1378g();
                        }
                    }
                }
                c1372f = f4112w;
            } catch (Exception e2) {
                throw e2;
            } catch (Exception e22) {
                throw e22;
            }
        }
        return c1372f;
    }

    /* renamed from: z */
    private static String m9829z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 111;
                    break;
                case 1:
                    i2 = 56;
                    break;
                case 2:
                    i2 = 77;
                    break;
                case 3:
                    i2 = 55;
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
    private static char[] m9830z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 15);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected abstract int mo3740a(int i, String str, int i2, C0508h c0508h);

    /* renamed from: a */
    public final int m9832a(int i, String str, String[] strArr, int i2) {
        String str2 = "";
        if (strArr != null && strArr.length > 0) {
            str = str + "\n" + C0808l.m4024a(strArr, "\n");
        }
        int i3;
        switch (i) {
            case 0:
            case 1111:
                if (mo3740a(0, str, 1, null) != 65536) {
                    return 1;
                }
                mo3751a(str);
                return 1;
            case 1:
                if (mo3740a(1, str, 1, null) != 65536) {
                    return 1;
                }
                mo3757c(str);
                return 1;
            case 2:
                switch (i2) {
                    case 0:
                        i3 = 1;
                        break;
                    case 1:
                        i3 = 0;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                switch (mo3740a(2, str, i3 + 1, null)) {
                    case 6:
                        return 1;
                    case 65536:
                        return mo3759d(str, i3);
                    default:
                        return 0;
                }
            case 3:
                switch (i2) {
                    case 0:
                        i3 = 1;
                        break;
                    case 1:
                        i3 = 0;
                        break;
                    case 2:
                        i3 = 2;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                switch (mo3740a(3, str, i3 + 1, null)) {
                    case 6:
                        return 1;
                    case 7:
                        return 0;
                    case 65536:
                        return mo3742a(str, i3);
                    default:
                        return 2;
                }
            case 4:
                if (mo3740a(4, str, 1, null) != 65536) {
                    return 1;
                }
                mo3755b(str);
                return 1;
            case 5:
                switch (i2) {
                    case 0:
                        i3 = 1;
                        break;
                    case 1:
                        i3 = 0;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                switch (mo3740a(5, str, i3 + 1, null)) {
                    case 1:
                        return 1;
                    case 65536:
                        return !mo3756b(str, i3) ? 0 : 1;
                    default:
                        return 0;
                }
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public abstract int mo3741a(C0883q c0883q, File file, File file2);

    /* renamed from: a */
    protected abstract int mo3742a(String str, int i);

    /* renamed from: a */
    public final int m9835a(String str, WDObjet wDObjet, WDObjet wDObjet2, int i, int i2, String str2) {
        String[] strArr;
        int i3;
        int i4;
        if (wDObjet2 == null) {
            strArr = new String[]{C0745b.m3224c(f4089H[1], new String[0]), C0745b.m3224c(f4089H[2], new String[0])};
            i3 = 2;
        } else {
            C0582d c0582d = (C0582d) wDObjet2.checkType(C0582d.class);
            if (c0582d != null) {
                i3 = (int) c0582d.mo2483h();
                if (i3 == 0) {
                    strArr = new String[]{C0745b.m3224c(f4089H[1], new String[0])};
                    i3 = 1;
                } else {
                    strArr = new String[i3];
                    for (int i5 = 0; i5 < i3; i5++) {
                        strArr[i5] = c0582d.mo2469a((long) i5).getString();
                    }
                }
            } else {
                strArr = new String[]{wDObjet2.getString()};
                i3 = 1;
            }
        }
        if (i < 0 || i >= i3) {
            i4 = i < 0 ? 0 : i3 - 1;
        } else {
            i4 = i;
        }
        int i6 = (i2 < 0 || i2 >= i3) ? i3 - 1 : i2;
        int[] iArr = new int[i3];
        for (int i7 = 0; i7 < i3; i7++) {
            iArr[i7] = i7 + 1;
        }
        int i8 = 0;
        if (str2.equals(f4103n)) {
            i8 = 32;
        } else {
            if (str2.equals(f4085D)) {
                i8 = 48;
            } else {
                if (str2.equals(f4085D)) {
                    i8 = 48;
                }
            }
        }
        return mo3743a(str, wDObjet, strArr, iArr, i4, i6, i8, str2, 0, 0);
    }

    /* renamed from: a */
    public abstract int mo3743a(String str, WDObjet wDObjet, String[] strArr, int[] iArr, int i, int i2, int i3, String str2, int i4, int i5);

    /* renamed from: a */
    public abstract int mo3744a(String[] strArr);

    /* renamed from: a */
    public abstract WDObjet mo3745a(String str, WDObjet wDObjet);

    /* renamed from: a */
    public abstract WDDate mo3746a(WDDate wDDate, String str);

    /* renamed from: a */
    public abstract WDHeure mo3747a(WDHeure wDHeure, boolean z, String str);

    /* renamed from: a */
    public String m9841a(C0508h c0508h) {
        String titreSuivant = WDProjet.getInstance().getTitreSuivant();
        return titreSuivant == null ? "" : titreSuivant;
    }

    /* renamed from: a */
    public abstract String mo3748a(C0883q c0883q, String str, String str2, String str3, String str4);

    /* renamed from: a */
    public abstract String mo3749a(C0883q c0883q, String str, String str2, String str3, String str4, String str5, int i);

    /* renamed from: a */
    public abstract void mo3750a(C0697b c0697b);

    /* renamed from: a */
    public abstract void mo3751a(String str);

    /* renamed from: a */
    public abstract void mo3752a(String str, String str2, String str3);

    /* renamed from: a */
    public abstract boolean mo3753a(int i, String str);

    /* renamed from: b */
    public abstract String mo3754b(C0883q c0883q, String str, String str2, String str3, String str4, String str5, int i);

    /* renamed from: b */
    protected abstract void mo3755b(String str);

    /* renamed from: b */
    public abstract boolean mo3756b(String str, int i);

    /* renamed from: c */
    protected abstract void mo3757c(String str);

    /* renamed from: c */
    public abstract void mo3758c(String str, int i);

    /* renamed from: d */
    public abstract int mo3759d(String str, int i);
}
