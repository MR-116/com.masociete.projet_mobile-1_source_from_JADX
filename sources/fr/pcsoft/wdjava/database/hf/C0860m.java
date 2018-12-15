package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.database.hf.m */
public class C0860m implements C0542t, Cloneable {
    private static final String ae = C0860m.m6067z(C0860m.m6068z("\u0005\u0013=2\u00042A+2Q#\r 9\u0010'\u0004o3V5\u000f*w\u00142\u0013*\"\u0003`)\ty"));
    private String Rd = "";
    private String Sd = "";
    private String Td = "";
    private String Ud = "";
    private int Vd = 0;
    private String Wd = "";
    private int Xd = 0;
    private String Yd = "";
    private String Zd = "";

    public C0860m(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6) {
        this.Vd = i;
        this.Rd = str;
        this.Ud = str2;
        this.Xd = i2;
        this.Wd = str3;
        this.Yd = str4;
        this.Zd = str5;
        this.Td = str6;
        this.Sd = WDAppelContexte.getContexte().m2731r();
    }

    public C0860m(int i, String str, String str2) {
        this.Vd = i;
        this.Rd = str;
        this.Wd = str2;
        this.Sd = WDAppelContexte.getContexte().m2731r();
    }

    /* renamed from: z */
    private static String m6067z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 64;
                    break;
                case 1:
                    i2 = 97;
                    break;
                case 2:
                    i2 = 79;
                    break;
                case 3:
                    i2 = 87;
                    break;
                default:
                    i2 = 113;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6068z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 113);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String m6069a() {
        return this.Zd;
    }

    /* renamed from: b */
    public String m6070b() {
        return this.Wd;
    }

    /* renamed from: c */
    public void m6071c() {
        this.Rd = null;
        this.Ud = null;
        this.Wd = null;
        this.Yd = null;
        this.Sd = null;
        this.Zd = null;
        this.Td = null;
    }

    /* renamed from: d */
    public int m6072d() {
        return this.Xd;
    }

    /* renamed from: e */
    public String m6073e() {
        return this.Rd;
    }

    /* renamed from: f */
    public String m6074f() {
        return this.Sd;
    }

    /* renamed from: g */
    public C0860m m6075g() {
        try {
            return (C0860m) super.clone();
        } catch (Exception e) {
            C0691a.m2863b(ae, e);
            return this;
        }
    }

    /* renamed from: h */
    public String m6076h() {
        return this.Td;
    }

    /* renamed from: i */
    public int m6077i() {
        return this.Vd;
    }

    /* renamed from: j */
    public String m6078j() {
        return this.Ud;
    }

    /* renamed from: k */
    public String m6079k() {
        return this.Yd;
    }
}
