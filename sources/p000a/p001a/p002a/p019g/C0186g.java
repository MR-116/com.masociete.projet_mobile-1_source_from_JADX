package p000a.p001a.p002a.p019g;

import fr.pcsoft.wdjava.core.application.C0536n;
import java.util.HashMap;
import java.util.Map;
import p000a.p001a.p002a.C0212s;

/* renamed from: a.a.a.g.g */
public enum C0186g {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+i"))}),
    ISO8859_2((String) 4, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+j"))}),
    ISO8859_3((String) 5, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+k"))}),
    ISO8859_4((String) 6, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+l"))}),
    ISO8859_5((String) 7, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+m"))}),
    ISO8859_6((String) 8, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+n"))}),
    ISO8859_7((String) 9, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+o"))}),
    ISO8859_8((String) 10, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+`"))}),
    ISO8859_9((String) 11, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+a"))}),
    ISO8859_10((String) 12, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+i4"))}),
    ISO8859_11((String) 13, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+i5"))}),
    ISO8859_13((String) 15, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+i7"))}),
    ISO8859_14((String) 16, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+i0"))}),
    ISO8859_15((String) 17, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+i1"))}),
    ISO8859_16((String) 18, (int) new String[]{C0186g.m1155z(C0186g.m1156z("M3\"+`<UT+i2"))}),
    SJIS((String) 20, (int) new String[]{C0186g.m1155z(C0186g.m1156z("W\b\u0004`,[*$U"))}),
    Cp1250((String) 21, (int) new String[]{C0186g.m1155z(C0186g.m1156z("s\t\u0003b7s\u0013@7j1P"))}),
    Cp1251((String) 22, (int) new String[]{C0186g.m1155z(C0186g.m1156z("s\t\u0003b7s\u0013@7j1Q"))}),
    Cp1252((String) 23, (int) new String[]{C0186g.m1155z(C0186g.m1156z("s\t\u0003b7s\u0013@7j1R"))}),
    Cp1256((String) 24, (int) new String[]{C0186g.m1155z(C0186g.m1156z("s\t\u0003b7s\u0013@7j1V"))}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{C0186g.m1155z(C0186g.m1156z("Q4++i2\"(")), C0186g.m1155z(C0186g.m1156z("Q\u000e\u0004e7`\u0005/o?"))}),
    UTF8((String) 26, (int) new String[]{C0186g.m1155z(C0186g.m1156z("Q4++`"))}),
    ASCII((String) new int[]{27, C0536n.f1002n}, (int) new String[]{C0186g.m1155z(C0186g.m1156z("Q3@G\u000bG)$"))}),
    Big5(28),
    GB18030((String) 29, (int) new String[]{C0186g.m1155z(C0186g.m1156z("C\"_5i6")), C0186g.m1155z(C0186g.m1156z("A5.Y\u001bJ")), C0186g.m1155z(C0186g.m1156z("C\"&"))}),
    EUC_KR((String) 30, (int) new String[]{C0186g.m1155z(C0186g.m1156z("A5.+\u0013V"))});
    
    /* renamed from: d */
    private static final Map<Integer, C0186g> f708d = null;
    /* renamed from: e */
    private static final Map<String, C0186g> f709e = null;
    /* renamed from: a */
    private final int[] f710a;
    /* renamed from: c */
    private final String[] f711c;

    static {
        f708d = new HashMap();
        f709e = new HashMap();
        for (C0186g c0186g : C0186g.values()) {
            for (int valueOf : c0186g.f710a) {
                f708d.put(Integer.valueOf(valueOf), c0186g);
            }
            f709e.put(c0186g.name(), c0186g);
            for (Object put : c0186g.f711c) {
                f709e.put(put, c0186g);
            }
        }
    }

    private C0186g(int i) {
        this(r3, r4, new int[]{i}, new String[0]);
    }

    private C0186g(int i, String... strArr) {
        this.f710a = new int[]{i};
        this.f711c = strArr;
    }

    private C0186g(int[] iArr, String... strArr) {
        this.f710a = iArr;
        this.f711c = strArr;
    }

    public static C0186g getCharacterSetECIByName(String str) {
        return (C0186g) f709e.get(str);
    }

    public static C0186g getCharacterSetECIByValue(int i) throws C0212s {
        if (i >= 0 && i < 900) {
            return (C0186g) f708d.get(Integer.valueOf(i));
        }
        try {
            throw C0212s.m1267a();
        } catch (C0212s e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m1155z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 4;
                    break;
                case 1:
                    i2 = 96;
                    break;
                case 2:
                    i2 = 109;
                    break;
                case 3:
                    i2 = 6;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1156z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 88);
        }
        return toCharArray;
    }

    public int getValue() {
        return this.f710a[0];
    }
}
