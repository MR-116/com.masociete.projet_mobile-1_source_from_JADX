package fr.pcsoft.wdjava.ui.dialogue;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.report.C0697b;
import fr.pcsoft.wdjava.core.types.WDDate;
import fr.pcsoft.wdjava.core.types.WDHeure;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import java.io.File;

/* renamed from: fr.pcsoft.wdjava.ui.dialogue.g */
public class C1378g extends C1372f {
    /* renamed from: H */
    private static final String[] f4119H = new String[]{C1378g.m9881z(C1378g.m9882z("89\u0007\u000bL\u001e,\u001a\u000eJ\u0003m\n\u0012\u0005\u001e¤\u0002\u0002F\u0019(\u001b\u0015\u0005\t(N\u0003D\u0019(N\tJ\u0003m\u000f\u0012Q\u0002?\u0007\u0014Ì\bm\u000b\t\u0005\u0000\"\n\u0002\u0005\u001e,\u0000\u0014\u0005$\u0005#I")), C1378g.m9881z(C1378g.m9882z("89\u0007\u000bL\u001e,\u001a\u000eJ\u0003m\n\u0002VM/\u0001Q\b>N\u0003@M)\u0007\u0006I\u0002*\u001b\u0002\u0005\t(N\u0004J\u0003+\u0007\u0015H\f9\u0007\bKM#\u0001\t\u0005\f8\u001a\bW\u0004>\u0002\u0005\b#N\nJ\t(N\u0014D\u0003>N.m c")), C1378g.m9881z(C1378g.m9882z("89\u0007\u000bL\u001e,\u001a\u000eJ\u0003m\n\u0002\u0005\u0000>\t\u0005J\u0015m\u0002\u000eV\u0019(N\u0003@M;\u000f\u000b@\u0018?\u001dGK\u0002#N\u0006P\u0019\"\u001c\u000eV(N\u0002KM \u0001\u0003@M>\u000f\tVM\u0004&*\u000b")), C1378g.m9881z(C1378g.m9882z("89\u0007\u000bL\u001e,\u001a\u000eJ\u0003m\n\u0002\u0005\u0001,N\u0001@\u0003§\u001a\u0015@M)I\u0006V\u001e(\u001c\u0013\u0005\u0003\"\u0000GD\u00189\u0001\u0015L\u001e¤\u000bG@\u0003m\u0003\bA\bm\u001d\u0006K\u001em'/hC")), C1378g.m9881z(C1378g.m9882z("89\u0007\u000bL\u001e,\u001a\u000eJ\u0003m\n\u0012\u0005\u001e¤\u0002\u0002F\u0019(\u001b\u0015\u0005\tj\u0007\nD\n(N\tJ\u0003m\u000f\u0012Q\u0002?\u0007\u0014Ì\bm\u000b\t\u0005\u0000\"\n\u0002\u0005\u001e,\u0000\u0014\u0005$\u0005#I")), C1378g.m9881z(C1378g.m9882z("89\u0007\u000bL\u001e,\u001a\u000eJ\u0003m\n\u0012\u0005\u001e¤\u0002\u0002F\u0019(\u001b\u0015\u0005\tj\u0006\u0002P\u001f(N\tJ\u0003m\u000f\u0012Q\u0002?\u0007\u0014Ì\bm\u000b\t\u0005\u0000\"\n\u0002\u0005\u001e,\u0000\u0014\u0005$\u0005#I")), C1378g.m9881z(C1378g.m9882z("89\u0007\u000bL\u001e,\u001a\u000eJ\u0003m\n\u0012\u0005\u001e¤\u0002\u0002F\u0019(\u001b\u0015\u0005\t(N\u0001L\u000e%\u0007\u0002WM#\u0001\t\u0005\f8\u001a\bW\u0004>\u0002\u0005\b#N\nJ\t(N\u0014D\u0003>N.m c")), C1378g.m9881z(C1378g.m9882z("89\u0007\u000bL\u001e,\u001a\u000eJ\u0003m\n\u0012\u0005\u001e¤\u0002\u0002F\u0019(\u001b\u0015\u0005\t(N\u0015Ì\u001d(\u001c\u0013J\u0004?\u000bGK\u0002#N\u0006P\u0019\"\u001c\u000eV(N\u0002KM \u0001\u0003@M>\u000f\tVM\u0004&*\u000b")), C1378g.m9881z(C1378g.m9882z("89\u0007\u000bL\u001e,\u001a\u000eJ\u0003m\n\u0002VM/\u0001Q\b>N\u0003@M)\u0007\u0006I\u0002*\u001b\u0002\u0005\u001d(\u001c\u0014J\u0003#\u000f\u000bL\u001e¤\u000bGK\u0002#N\u0006P\u0019\"\u001c\u000eV(N\u0002KM \u0001\u0003@M>\u000f\tVM\u0004&*\u000b")), C1378g.m9881z(C1378g.m9882z("89\u0007\u000bL\u001e,\u001a\u000eJ\u0003m\n\u0012\u0005\u000e,\u0002\u0002K\t?\u0007\u0002WM#\u0001\t\u0005\f8\u001a\bW\u0004>\u0002\u0005\b#N\nJ\t(N\u0014D\u0003>N.m c"))};

    /* renamed from: z */
    private static String m9881z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 109;
                    break;
                case 1:
                    i2 = 77;
                    break;
                case 2:
                    i2 = 110;
                    break;
                case 3:
                    i2 = 103;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9882z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 37);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo3740a(int i, String str, int i2, C0508h c0508h) {
        C0691a.m2856a(f4119H[1]);
        return 65536;
    }

    /* renamed from: a */
    public int mo3741a(C0883q c0883q, File file, File file2) {
        C0691a.m2856a(f4119H[1]);
        return 0;
    }

    /* renamed from: a */
    protected int mo3742a(String str, int i) {
        C0691a.m2856a(f4119H[1]);
        return 0;
    }

    /* renamed from: a */
    public int mo3743a(String str, WDObjet wDObjet, String[] strArr, int[] iArr, int i, int i2, int i3, String str2, int i4, int i5) {
        C0691a.m2856a(f4119H[8]);
        return iArr[i2];
    }

    /* renamed from: a */
    public int mo3744a(String[] strArr) {
        C0691a.m2856a(f4119H[2]);
        return -1;
    }

    /* renamed from: a */
    public WDObjet mo3745a(String str, WDObjet wDObjet) {
        C0691a.m2856a(f4119H[9]);
        return null;
    }

    /* renamed from: a */
    public WDDate mo3746a(WDDate wDDate, String str) {
        C0691a.m2856a(f4119H[0]);
        return null;
    }

    /* renamed from: a */
    public WDHeure mo3747a(WDHeure wDHeure, boolean z, String str) {
        C0691a.m2856a(f4119H[5]);
        return null;
    }

    /* renamed from: a */
    public String mo3748a(C0883q c0883q, String str, String str2, String str3, String str4) {
        C0691a.m2856a(f4119H[7]);
        return "";
    }

    /* renamed from: a */
    public String mo3749a(C0883q c0883q, String str, String str2, String str3, String str4, String str5, int i) {
        C0691a.m2856a(f4119H[4]);
        return "";
    }

    /* renamed from: a */
    public void mo3750a(C0697b c0697b) {
        System.err.println(c0697b.toString());
        WDProjet.getInstance().terminerApplication();
    }

    /* renamed from: a */
    public void mo3751a(String str) {
        System.out.println(str);
    }

    /* renamed from: a */
    public void mo3752a(String str, String str2, String str3) {
        C0691a.m2856a(f4119H[3]);
    }

    /* renamed from: a */
    public boolean mo3753a(int i, String str) {
        System.err.println(str);
        return false;
    }

    /* renamed from: b */
    public String mo3754b(C0883q c0883q, String str, String str2, String str3, String str4, String str5, int i) {
        C0691a.m2856a(f4119H[6]);
        return "";
    }

    /* renamed from: b */
    protected void mo3755b(String str) {
        System.out.println(str);
    }

    /* renamed from: b */
    public boolean mo3756b(String str, int i) {
        C0691a.m2856a(f4119H[1]);
        return false;
    }

    /* renamed from: c */
    protected void mo3757c(String str) {
        System.err.println(str);
    }

    /* renamed from: c */
    public void mo3758c(String str, int i) {
        System.err.println(str);
    }

    /* renamed from: d */
    public int mo3759d(String str, int i) {
        C0691a.m2856a(f4119H[1]);
        return 0;
    }
}
