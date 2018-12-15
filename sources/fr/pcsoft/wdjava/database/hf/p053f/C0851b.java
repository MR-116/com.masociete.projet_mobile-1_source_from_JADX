package fr.pcsoft.wdjava.database.hf.p053f;

import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;

/* renamed from: fr.pcsoft.wdjava.database.hf.f.b */
public class C0851b extends C0850a implements C0542t {
    private static final String[] Yd = new String[]{C0851b.m5903z(C0851b.m5904z(":c}\u001e<:~|\u00056")), C0851b.m5903z(C0851b.m5904z(":w`\u0006\":")), C0851b.m5903z(C0851b.m5904z("It~\f,N\u0011")), C0851b.m5903z(C0851b.m5904z(":ww\u001d,R\u0011t\u0000=Ie\u0012")), C0851b.m5903z(C0851b.m5904z("MX\\\r\nl{S?\u000ePup\n0^s\u0000")), C0851b.m5903z(C0851b.m5904z("y^_g\u0006x\\\u001c-\r(\u001fX*\f4up{+hXD,\u001d"))};

    /* renamed from: z */
    private static String m5903z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 26;
                    break;
                case 1:
                    i2 = 49;
                    break;
                case 2:
                    i2 = 50;
                    break;
                case 3:
                    i2 = 73;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5904z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 111);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3158a(db dbVar) {
        StringBuffer stringBuffer = new StringBuffer(" ");
        int i = 0;
        for (Object append : dbVar.m3614S().keySet()) {
            if (i > 0) {
                stringBuffer.append(",");
            }
            stringBuffer.append("\"").append(append).append("\"");
            i++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public String mo3094a(String str, String str2, String str3, String str4, int i) {
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append(Yd[2]).append(str).append(Yd[1]).append(str2).append(str3).append(str4).append(Yd[3]).append(i).append(Yd[0]);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public String mo3095a(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z) {
        return null;
    }

    /* renamed from: a */
    public boolean mo3096a(db dbVar, eb ebVar) {
        return false;
    }

    /* renamed from: b */
    public long mo3103b(db dbVar, eb ebVar) {
        return 0;
    }

    /* renamed from: b */
    public String mo3105b(String str) {
        return null;
    }

    /* renamed from: b */
    public String[] mo3107b(db dbVar) {
        return null;
    }

    /* renamed from: d */
    public String mo3109d(db dbVar, eb ebVar) {
        return null;
    }

    /* renamed from: d */
    public boolean mo3110d() {
        return false;
    }

    /* renamed from: k */
    public int mo3114k() {
        return 0;
    }

    /* renamed from: s */
    public String mo3120s() {
        return Yd[4];
    }

    /* renamed from: x */
    public String m5916x() {
        return Yd[5];
    }
}
