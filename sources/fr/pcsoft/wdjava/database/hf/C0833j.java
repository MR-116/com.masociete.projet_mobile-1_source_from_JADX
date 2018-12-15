package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.p053f.C0852c;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0867b;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/* renamed from: fr.pcsoft.wdjava.database.hf.j */
public abstract class C0833j implements C0542t, Cloneable {
    protected static final char Sd = '\\';
    private static final String[] Wd = new String[]{C0833j.m5285z(C0833j.m5286z("p\u000f;W\u0003G]-WVV\u0011&\\\u0017R\u0018iVQ@\u0013iV\u0014t\u001e*W\u0005FS")), C0833j.m5285z(C0833j.m5286z("j3\rj")), C0833j.m5285z(C0833j.m5286z("v/\fs\"p]\u0000|2p%i")), C0833j.m5285z(C0833j.m5286z("v/\fs\"p]\u001c|?d(\f\u0012?{9\fjV")), C0833j.m5285z(C0833j.m5286z("\u0019]")), C0833j.m5285z(C0833j.m5286z("\u00152\u0007\u0012")), C0833j.m5285z(C0833j.m5286z("N\t:\u0012Q")), C0833j.m5285z(C0833j.m5286z("N\ti\u0015")), C0833j.m5285z(C0833j.m5286z("{(\u0005~")), C0833j.m5285z(C0833j.m5286z("\u0012\u0000")), C0833j.m5285z(C0833j.m5286z("N\u0019i\u0015")), C0833j.m5285z(C0833j.m5286z("g8\u0019~7v8")), C0833j.m5285z(C0833j.m5286z("|.\u0007g:y")), C0833j.m5285z(C0833j.m5286z("w8\u001de3p3")), C0833j.m5285z(C0833j.m5286z("x2\r")), C0833j.m5285z(C0833j.m5286z("y4\u0002w")), C0833j.m5285z(C0833j.m5286z("z\r @\u0017A\u0018<@VZ\biT\u0019[\u001e=[\u0019[]']\u0018\u0015\u000f,Q\u0019[\u0013<WX")), C0833j.m5285z(C0833j.m5286z("r/\fs\"p.\u001d")), C0833j.m5285z(C0833j.m5286z("z/")), C0833j.m5285z(C0833j.m5286z("t3\r")), C0833j.m5285z(C0833j.m5286z("y2\u001ew$")), C0833j.m5285z(C0833j.m5286z("`-\u0019w$")), C0833j.m5285z(C0833j.m5286z("{2\u001d")), C0833j.m5285z(C0833j.m5286z("v2\b~3f>\f")), C0833j.m5285z(C0833j.m5286z("y8\u000ff")), C0833j.m5285z(C0833j.m5286z("|;\u0007g:y")), C0833j.m5285z(C0833j.m5286z("q8\n}2p")), C0833j.m5285z(C0833j.m5286z("g4\u000ez\"")), C0833j.m5285z(C0833j.m5286z("x<\u0011")), C0833j.m5285z(C0833j.m5286z("|3")), C0833j.m5285z(C0833j.m5286z("e2\u001ew$")), C0833j.m5285z(C0833j.m5286z("y8\ba\"")), C0833j.m5285z(C0833j.m5286z("x4\u0007")), C0833j.m5285z(C0833j.m5286z("|3\u001af$")), C0833j.m5285z(C0833j.m5286z("v<\u001aw")), C0833j.m5285z(C0833j.m5286z("v2\u001c|\"")), C0833j.m5285z(C0833j.m5286z("a2\u0016q>t/")), C0833j.m5285z(C0833j.m5286z("t+\u000e")), C0833j.m5285z(C0833j.m5286z("y8\u0007u\"}")), C0833j.m5285z(C0833j.m5286z("f(\u0004")), C0833j.m5285z(C0833j.m5286z("f(\u000ba\"g")), C0833j.m5285z(C0833j.m5286z("v2\u0007q7a")), C0833j.m5285z(C0833j.m5286z("v8\u0000~")), C0833j.m5285z(C0833j.m5286z("g2\u001c|2")), C0833j.m5285z(C0833j.m5286z("f$\u001av7a8")), C0833j.m5285z(C0833j.m5286z("e4")), C0833j.m5285z(C0833j.m5286z("t?\u001a")), C0833j.m5285z(C0833j.m5286z("x4\r")), C0833j.m5285z(C0833j.m5286z("e<\u001d{8q8\u0011"))};
    protected String Rd = "";
    protected String Td = "";
    protected int Ud = 0;
    protected String Vd = null;

    /* renamed from: c */
    public static String m5284c(db dbVar, eb ebVar) {
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        String a = dbVar.mo2741a(true, null);
        String a2 = dbVar.mo2741a(false, null);
        if (ebVar.m5853j()) {
            stringBuffer = (ebVar.m5809K() == 1 || ebVar.m5801C()) ? new StringBuffer(Wd[3]) : new StringBuffer(Wd[2]);
            stringBuffer.append(a2).append("_").append(ebVar.m5818a(false, null)).append(Wd[1]);
            stringBuffer.append(Wd[5]).append(a).append("(");
            for (String append : ebVar.m5861t().keySet()) {
                if (i > 0) {
                    stringBuffer.append(Wd[4]);
                }
                stringBuffer.append(append);
                i++;
            }
            stringBuffer.append(")");
        } else if (ebVar.m5801C() || ebVar.mo3138c() || ebVar.m5809K() == 1) {
            stringBuffer = new StringBuffer(Wd[3]);
            stringBuffer.append(a2).append("_").append(ebVar.m5818a(false, null)).append(Wd[1]);
            stringBuffer.append(Wd[5]).append(a);
            stringBuffer.append("(").append(ebVar.m5818a(true, null)).append(")");
        } else if (ebVar.m5809K() == 2) {
            stringBuffer = new StringBuffer(Wd[2]);
            stringBuffer.append(a2).append("_").append(ebVar.m5818a(false, null)).append(Wd[1]);
            stringBuffer.append(Wd[5]).append(a);
            stringBuffer.append("(").append(ebVar.m5818a(true, null)).append(")");
        }
        return stringBuffer.toString();
    }

    /* renamed from: z */
    private static String m5285z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 53;
                    break;
                case 1:
                    i2 = 125;
                    break;
                case 2:
                    i2 = 73;
                    break;
                case 3:
                    i2 = 50;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5286z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 118);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public abstract int mo3089a(db dbVar, C0859l c0859l);

    /* renamed from: a */
    public abstract Integer mo3090a(int i, boolean z);

    /* renamed from: a */
    public abstract Object mo3091a(Object obj, int i);

    /* renamed from: a */
    public String m5290a() {
        return this.Td;
    }

    /* renamed from: a */
    public String mo3092a(int i) {
        switch (i) {
            case 7:
                return Wd[12];
            case 8:
                return Wd[25];
            case 22:
                return Wd[29];
            case 23:
                return Wd[13];
            case 24:
                return Wd[19];
            case 25:
                return Wd[18];
            case 26:
                return Wd[22];
            case 27:
                return Wd[37];
            case 28:
                return Wd[39];
            case 29:
                return Wd[32];
            case 30:
                return Wd[28];
            case 31:
                return Wd[35];
            case 32:
                return Wd[15];
            case 33:
                return Wd[8];
            case 42:
                return Wd[24];
            case 43:
                return Wd[27];
            case 44:
                return Wd[47];
            case 45:
                return Wd[21];
            case 46:
                return Wd[20];
            case 50:
            case 51:
                return Wd[40];
            case 54:
            case 55:
                return Wd[38];
            case 56:
                return Wd[33];
            case 57:
                return Wd[48];
            case 59:
                return Wd[43];
            case 61:
                return Wd[46];
            case 66:
                return Wd[14];
            case 67:
                return Wd[45];
            case 68:
                return Wd[30];
            case 72:
            case 110:
                return Wd[42];
            case 84:
                return Wd[11];
            case 88:
                return Wd[41];
            case 94:
                return Wd[26];
            case 97:
                return Wd[44];
            case 103:
                return Wd[23];
            case 106:
                return Wd[34];
            case 131:
                return Wd[31];
            case C0538a.tb /*132*/:
                return Wd[17];
            case C0538a.Lb /*144*/:
                return Wd[36];
            default:
                C0691a.m2856a(Wd[16]);
                return "";
        }
    }

    /* renamed from: a */
    public String mo3158a(db dbVar) {
        StringBuffer stringBuffer = new StringBuffer(" ");
        int i = 0;
        for (eb ebVar : dbVar.m3614S().values()) {
            int i2;
            if (ebVar.m5853j()) {
                i2 = i;
            } else {
                if (i > 0) {
                    stringBuffer.append(",");
                }
                stringBuffer.append(ebVar.m5800B());
                i2 = i + 1;
            }
            i = i2;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public String mo3173a(eb ebVar, Object obj, int i) {
        if (obj == null) {
            return Wd[8];
        }
        if (!ebVar.m5865x()) {
            String obj2 = obj.toString();
            switch (ebVar.m5848f()) {
                case 11:
                    if (obj instanceof Time) {
                        return Wd[7] + obj2 + Wd[9];
                    }
                    if (obj instanceof Timestamp) {
                        return Wd[6] + obj2 + Wd[9];
                    }
                    break;
                case 14:
                    if (obj instanceof Date) {
                        return Wd[10] + obj2 + Wd[9];
                    }
                    if (obj instanceof Timestamp) {
                        return Wd[6] + obj2 + Wd[9];
                    }
                    break;
                case 30:
                    return Wd[8];
                case 34:
                    if (obj instanceof Timestamp) {
                        return Wd[6] + obj2 + Wd[9];
                    }
                    if (obj instanceof Date) {
                        return Wd[6] + new Timestamp(((Date) obj).getTime()) + Wd[9];
                    }
                    if (obj instanceof Time) {
                        return Wd[6] + new Timestamp(((Time) obj).getTime()) + Wd[9];
                    }
                    break;
            }
            return m5295a(obj2, i);
        } else if ((obj instanceof Number) && Double.isInfinite(((Number) obj).doubleValue())) {
            return ((Number) obj).doubleValue() == Double.POSITIVE_INFINITY ? ebVar.m5851h().toString() : ebVar.m5858p().toString();
        } else {
            int f = ebVar.m5848f();
            switch (f) {
                case 3:
                case 4:
                case 5:
                case 9:
                case 26:
                case 36:
                case 38:
                    return obj instanceof Number ? String.valueOf(((Number) obj).intValue()) : obj instanceof WDObjet ? String.valueOf(((WDObjet) obj).getInt()) : String.valueOf(C0725i.m3064d(obj.toString()));
                case 6:
                case 7:
                    return obj instanceof Number ? obj.toString() : obj instanceof WDObjet ? String.valueOf(((WDObjet) obj).getDouble()) : String.valueOf(C0725i.m3084m(obj.toString()));
                case 17:
                case 41:
                    if (obj instanceof Number) {
                        return String.valueOf(((Number) obj).doubleValue());
                    }
                    if (!(obj instanceof WDObjet)) {
                        return String.valueOf(C0725i.m3084m(obj.toString()));
                    }
                    return String.valueOf(f == 41 ? ((WDObjet) obj).getBigDecimal() : ((WDObjet) obj).getCurrency());
                case 24:
                case 25:
                case 27:
                    return obj instanceof Number ? String.valueOf(((Number) obj).longValue()) : obj instanceof WDObjet ? String.valueOf(((WDObjet) obj).getLong()) : String.valueOf(C0725i.m3055c(obj.toString()));
                case 37:
                    boolean booleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : obj instanceof WDObjet ? ((WDObjet) obj).getBoolean() : C0725i.m3072e(obj.toString());
                    return booleanValue ? "1" : "0";
                default:
                    return obj.toString();
            }
        }
    }

    /* renamed from: a */
    public String mo3174a(String str) {
        String trim = mo3104b().trim();
        return !C0808l.m4053k(trim) ? new StringBuffer(str.length() + (trim.length() * 2)).append(trim).append(str).append(trim).toString() : str;
    }

    /* renamed from: a */
    public final String m5295a(String str, int i) {
        Object obj = null;
        Object obj2 = (i == 2 || i == 64 || i == 128) ? 1 : null;
        StringBuffer stringBuffer = new StringBuffer(str.length() + 2);
        stringBuffer.append("'");
        if (i == 64 || i == 128) {
            stringBuffer.append("%");
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case '%':
                case '_':
                    if (obj2 == null) {
                        stringBuffer.append(charAt);
                        break;
                    }
                    stringBuffer.append(Sd).append(charAt);
                    int i3 = 1;
                    break;
                case '\'':
                    stringBuffer.append(charAt).append(charAt);
                    break;
                case '\\':
                    if (!(this instanceof C0852c)) {
                        stringBuffer.append(charAt);
                        break;
                    }
                    stringBuffer.append(charAt).append(charAt);
                    break;
                default:
                    stringBuffer.append(charAt);
                    break;
            }
        }
        if (i == 2 || i == 64) {
            stringBuffer.append("%");
        }
        stringBuffer.append("'");
        if (obj != null) {
            String n = mo3116n();
            if (!C0808l.m4053k(n)) {
                stringBuffer.append(' ').append(n);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public abstract String mo3093a(String str, String str2);

    /* renamed from: a */
    public abstract String mo3094a(String str, String str2, String str3, String str4, int i);

    /* renamed from: a */
    public abstract String mo3095a(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z);

    /* renamed from: a */
    public abstract boolean mo3096a(db dbVar, eb ebVar);

    /* renamed from: a */
    public abstract boolean mo3097a(String str, int i, Object[] objArr);

    /* renamed from: a */
    public abstract boolean mo3098a(String str, String str2, String str3, String str4, String str5);

    /* renamed from: a */
    public abstract boolean mo3099a(String str, boolean z);

    /* renamed from: a */
    public abstract boolean mo3100a(String str, Object[] objArr);

    /* renamed from: a */
    public abstract boolean mo3101a(String[] strArr);

    /* renamed from: a */
    public abstract Object[] mo3102a(Object[] objArr, int i, int i2);

    /* renamed from: b */
    public abstract long mo3103b(db dbVar, eb ebVar);

    /* renamed from: b */
    public abstract String mo3104b();

    /* renamed from: b */
    public abstract String mo3105b(String str);

    /* renamed from: b */
    public abstract boolean mo3106b(String str, int i);

    /* renamed from: b */
    public abstract String[] mo3107b(db dbVar);

    /* renamed from: c */
    public abstract boolean mo3108c();

    /* renamed from: d */
    public abstract String mo3109d(db dbVar, eb ebVar);

    /* renamed from: d */
    public abstract boolean mo3110d();

    /* renamed from: e */
    public C0867b mo3163e() {
        return new C0867b(this);
    }

    /* renamed from: f */
    public String m5315f() {
        return this.Rd;
    }

    /* renamed from: g */
    public abstract boolean mo3111g();

    /* renamed from: h */
    public void m5317h() {
        this.Ud = 0;
        this.Td = "";
    }

    /* renamed from: i */
    public abstract Object mo3112i();

    /* renamed from: j */
    public abstract boolean mo3113j();

    /* renamed from: k */
    public abstract int mo3114k();

    /* renamed from: l */
    public abstract boolean mo3115l();

    /* renamed from: m */
    public int m5322m() {
        return this.Ud;
    }

    /* renamed from: n */
    public abstract String mo3116n();

    /* renamed from: o */
    public abstract boolean mo3117o();

    /* renamed from: p */
    public void mo3118p() {
        this.Rd = null;
        this.Td = null;
    }

    /* renamed from: q */
    public abstract void mo3119q();

    /* renamed from: r */
    public C0833j m5327r() {
        try {
            return (C0833j) super.clone();
        } catch (Exception e) {
            C0691a.m2863b(Wd[0], e);
            return this;
        }
    }

    /* renamed from: s */
    public abstract String mo3120s();

    /* renamed from: t */
    public abstract boolean mo3121t();

    /* renamed from: u */
    public abstract boolean mo3122u();
}
