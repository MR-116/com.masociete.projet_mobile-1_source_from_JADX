package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.database.hf.requete.parsing.C0867b;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0868c;
import fr.pcsoft.wdjava.p058k.C0931b;

/* renamed from: fr.pcsoft.wdjava.database.hf.k */
public class C0858k extends C0833j {
    private static final String Wd = C0858k.m5989z(C0858k.m5990z("jQE\u0002"));

    /* renamed from: z */
    private static String m5989z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 36;
                    break;
                case 1:
                    i2 = 4;
                    break;
                case 2:
                    i2 = 9;
                    break;
                case 3:
                    i2 = 78;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5990z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 72);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3089a(db dbVar, C0859l c0859l) {
        return 0;
    }

    /* renamed from: a */
    public Integer mo3090a(int i, boolean z) {
        return null;
    }

    /* renamed from: a */
    public final Object mo3091a(Object obj, int i) {
        return obj;
    }

    /* renamed from: a */
    public String mo3173a(eb ebVar, Object obj, int i) {
        if (obj == null) {
            return Wd;
        }
        String obj2 = obj.toString();
        return ebVar.m5865x() ? obj2.equals("") ? "0" : obj2 : m5295a(obj2, i);
    }

    /* renamed from: a */
    public String mo3174a(String str) {
        String a = super.mo3174a(str);
        return a.indexOf(32) >= 0 ? new StringBuilder(a.length() + 2).append(C0931b.f2543a).append(a).append(C0931b.f2545c).toString() : a;
    }

    /* renamed from: a */
    public String mo3093a(String str, String str2) {
        return null;
    }

    /* renamed from: a */
    public String mo3094a(String str, String str2, String str3, String str4, int i) {
        return null;
    }

    /* renamed from: a */
    public String mo3095a(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z) {
        return null;
    }

    /* renamed from: a */
    public boolean mo3096a(db dbVar, eb ebVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo3097a(String str, int i, Object[] objArr) {
        return false;
    }

    /* renamed from: a */
    public boolean mo3098a(String str, String str2, String str3, String str4, String str5) {
        return false;
    }

    /* renamed from: a */
    public boolean mo3099a(String str, boolean z) {
        return false;
    }

    /* renamed from: a */
    public boolean mo3100a(String str, Object[] objArr) {
        return false;
    }

    /* renamed from: a */
    public boolean mo3101a(String[] strArr) {
        return false;
    }

    /* renamed from: a */
    public Object[] mo3102a(Object[] objArr, int i, int i2) {
        return null;
    }

    /* renamed from: b */
    public long mo3103b(db dbVar, eb ebVar) {
        return 0;
    }

    /* renamed from: b */
    public String mo3104b() {
        return "";
    }

    /* renamed from: b */
    public String mo3105b(String str) {
        return null;
    }

    /* renamed from: b */
    public boolean mo3106b(String str, int i) {
        return false;
    }

    /* renamed from: b */
    public String[] mo3107b(db dbVar) {
        return null;
    }

    /* renamed from: c */
    public boolean mo3108c() {
        return false;
    }

    /* renamed from: d */
    public String mo3109d(db dbVar, eb ebVar) {
        return null;
    }

    /* renamed from: d */
    public boolean mo3110d() {
        return false;
    }

    /* renamed from: e */
    public C0867b mo3163e() {
        return new C0868c(this);
    }

    /* renamed from: g */
    public boolean mo3111g() {
        return false;
    }

    /* renamed from: i */
    public Object mo3112i() {
        return null;
    }

    /* renamed from: j */
    public boolean mo3113j() {
        return false;
    }

    /* renamed from: k */
    public int mo3114k() {
        return 0;
    }

    /* renamed from: l */
    public boolean mo3115l() {
        return false;
    }

    /* renamed from: n */
    public String mo3116n() {
        return null;
    }

    /* renamed from: o */
    public boolean mo3117o() {
        return false;
    }

    /* renamed from: q */
    public void mo3119q() {
    }

    /* renamed from: s */
    public String mo3120s() {
        return null;
    }

    /* renamed from: t */
    public boolean mo3121t() {
        return false;
    }

    /* renamed from: u */
    public boolean mo3122u() {
        return false;
    }
}
