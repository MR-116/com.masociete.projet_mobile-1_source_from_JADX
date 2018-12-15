package fr.pcsoft.wdjava.database.hf.p053f;

import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.C0833j;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0867b;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0869d;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.database.hf.f.e */
public class C0854e extends C0850a implements C0542t {
    private static final String Yd = C0854e.m5950z(C0854e.m5951z("Bzc07Bo\u0017&O#o\u00069*Hhc\u001b\u000efYc3=Dqc\u0006\u0016xS!\u001f\nhH0U8Cy\u00110Oe].\u0010O6\u001c\rRJ:\u001bc4!O\u001c;\u0001\u0016{YcHO,id\\OOn\f%O_}\u00019*+\u0019q"));
    private static final String[] Zd;

    static {
        r0 = new String[42];
        r0[0] = C0854e.m5950z(C0854e.m5951z("\"\u001c\u0005' F\u001c"));
        r0[1] = C0854e.m5950z(C0854e.m5951z("Xy\u000f0,_\u001c\u000e47#"));
        r0[2] = C0854e.m5950z(C0854e.m5951z("\\U-1\n}v\"\u0003\u000eAx\u000160Xm\u000f&\nyJ&\u0007"));
        r0[3] = C0854e.m5950z(C0854e.m5951z("(y\u0011'*^n\u001c=)T\f;!Nd\n:!T~\u0002&*"));
        r0[4] = C0854e.m5950z(C0854e.m5951z("(y\u0011'*^n\u001c=)Tq\u0006&<J{\u0006*-Jo\u0006"));
        r0[5] = C0854e.m5950z(C0854e.m5951z("Gy\r"));
        r0[6] = C0854e.m5950z(C0854e.m5951z("Xi\u0001&;Yu\r2"));
        r0[7] = C0854e.m5950z(C0854e.m5951z("'\u001c"));
        r0[8] = C0854e.m5950z(C0854e.m5951z("Hn\u00064;N\u001c\u00174-Gyc"));
        r0[9] = C0854e.m5950z(C0854e.m5951z("+o\u0006!OBx\u0006;;Bh\u001a*&Eo\u0006';+"));
        r0[10] = C0854e.m5950z(C0854e.m5951z("+s\u00053"));
        r0[11] = C0854e.m5950z(C0854e.m5951z("Xy\u0017U&Oy\r!&_e\u001c<!Xy\u0011!O"));
        r0[12] = C0854e.m5950z(C0854e.m5951z("+s\rU"));
        r0[13] = C0854e.m5950z(C0854e.m5951z("+z\u0011:\"+"));
        r0[14] = C0854e.m5950z(C0854e.m5951z("Xy\u000f0,_"));
        r0[15] = C0854e.m5950z(C0854e.m5951z("Xy\u000f0,_\u001c\u0017:?+"));
        r0[16] = C0854e.m5950z(C0854e.m5951z("+r\f!OEi\u000f9"));
        r0[17] = C0854e.m5950z(C0854e.m5951z("o]7\u0010\u001bbQ&"));
        r0[18] = C0854e.m5950z(C0854e.m5951z("eI.\u0010\u001db_kFC;\u0015"));
        r0[19] = C0854e.m5950z(C0854e.m5951z("}]1\u0017\u0006e]1\fG"));
        r0[20] = C0854e.m5950z(C0854e.m5951z("eI.\u0010\u001db_kDV'\fjU&Oy\r!&_ekDC:\u0015"));
        r0[21] = C0854e.m5950z(C0854e.m5951z("eI.\u0010\u001db_kD_'\fj"));
        r0[22] = C0854e.m5950z(C0854e.m5951z("eI.\u0010\u001db_k@C;\u0015"));
        r0[23] = C0854e.m5950z(C0854e.m5951z("mP,\u0014\u001b"));
        r0[24] = C0854e.m5950z(C0854e.m5951z("eI.\u0010\u001db_kDV'\fj"));
        r0[25] = C0854e.m5950z(C0854e.m5951z("U-\f\u0006eH"));
        r0[26] = C0854e.m5950z(C0854e.m5951z("bQ\"\u0012\n"));
        r0[27] = C0854e.m5950z(C0854e.m5951z("bR7U&Oy\r!&_ekDC:\u0015"));
        r0[28] = C0854e.m5950z(C0854e.m5951z("fS-\u0010\u0016"));
        r0[29] = C0854e.m5950z(C0854e.m5951z("hT\"\u0007G:\u0015"));
        r0[30] = C0854e.m5950z(C0854e.m5951z("+x\u00063.^p\u0017U"));
        r0[31] = C0854e.m5950z(C0854e.m5951z("yY\"\u0019"));
        r0[32] = C0854e.m5950z(C0854e.m5951z("}]1\u0016\u0007jNk"));
        r0[33] = C0854e.m5950z(C0854e.m5951z("iU7"));
        r0[34] = C0854e.m5950z(C0854e.m5951z("Y;\u0001"));
        r0[35] = C0854e.m5950z(C0854e.m5951z("hS.[\u0002b_1\u001a\u001cdZ7[\u0005o^ [\u001czP0\u0010\u001d}Y1[<Zp\u0010\u0010\u001d}Y11\u001dbJ&\u0007"));
        r0[36] = C0854e.m5950z(C0854e.m5951z("'\u001crD]\""));
        r0[37] = C0854e.m5950z(C0854e.m5951z("Hs\r#*Yhk#.Y\u000b4='"));
        r0[38] = C0854e.m5950z(C0854e.m5951z("'\u001crG_\"\u0010dOH'\u001bd\\C,\u0011dYH,\u0015oRO,\u0010dRF"));
        r0[39] = C0854e.m5950z(C0854e.m5951z("'\u001crEW\"\u0010dOH'\u001bd\\"));
        r0[40] = C0854e.m5950z(C0854e.m5951z("Yy\u00139.Hyk'*[p\u00026*#n\u0006%#J\u0006],Dr\u00150=_\u0014\u00154=Ht\u0002'C"));
        r0[41] = C0854e.m5950z(C0854e.m5951z("Yy\u00139.Hyk6 Ej\u0006';#j\u0002',C}\u0011Y"));
        Zd = r0;
    }

    /* renamed from: c */
    public static String m5949c(String str, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        switch (i) {
            case 11:
                stringBuffer.append(Zd[41]).append(str).append(Zd[39]);
                break;
            case 14:
                stringBuffer.append(Zd[37]).append(str).append(Zd[36]);
                break;
            case 34:
                stringBuffer.append(Zd[40]).append(str).append(Zd[38]);
                break;
        }
        return stringBuffer.toString();
    }

    /* renamed from: z */
    private static String m5950z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 11;
                    break;
                case 1:
                    i2 = 60;
                    break;
                case 2:
                    i2 = 67;
                    break;
                case 3:
                    i2 = 117;
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
    private static char[] m5951z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 111);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected Object mo3162a(eb ebVar, ResultSet resultSet, int i) throws SQLException {
        return resultSet.getTimestamp(i);
    }

    /* renamed from: a */
    public String mo3092a(int i) {
        switch (i) {
            case 50:
            case 51:
                return Zd[6];
            case 54:
            case 55:
                return Zd[5];
            default:
                return super.mo3092a(i);
        }
    }

    /* renamed from: a */
    public String mo3093a(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer(Zd[11]);
        stringBuffer.append(str2);
        stringBuffer.append(Zd[12]);
        stringBuffer.append(str);
        stringBuffer.append(Zd[9]);
        stringBuffer.append(str2);
        stringBuffer.append(Zd[10]);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public String mo3094a(String str, String str2, String str3, String str4, int i) {
        StringBuffer stringBuffer = new StringBuffer("");
        if (i > -1) {
            stringBuffer.append(Zd[15]).append(i);
        } else {
            stringBuffer.append(Zd[14]);
        }
        stringBuffer.append(str).append(Zd[13]).append(str2).append(str3).append(str4);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public String mo3095a(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z) {
        if (j != 0) {
            return "";
        }
        return mo3094a(str, str2, str3, str4, (int) j2);
    }

    /* renamed from: a */
    public boolean mo3096a(db dbVar, eb ebVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo3098a(String str, String str2, String str3, String str4, String str5) {
        boolean a = super.mo3098a(str, str2, str3, str4, str5);
        if (a) {
            try {
                if (this.Wd != null) {
                    try {
                        if (this.Wd.getMetaData().supportsTransactionIsolationLevel(1)) {
                            this.Wd.setTransactionIsolation(1);
                        }
                    } catch (SQLException e) {
                        WDErreurManager.m2883a(C0745b.m3222b(Zd[3], str, str4) + "\n" + C0745b.m3222b(Zd[4], str4, String.valueOf(e.getErrorCode()), e.getMessage()));
                    }
                }
            } catch (SQLException e2) {
                throw e2;
            }
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo3100a(String str, Object[] objArr) {
        return super.mo3100a(str, objArr);
    }

    /* renamed from: b */
    public long mo3103b(db dbVar, eb ebVar) {
        SQLException e;
        Throwable th;
        Statement statement = null;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(Zd[1]).append(ebVar.m5818a(true, (C0833j) this)).append(Zd[0]).append(dbVar.mo2741a(true, (C0833j) this));
            Statement createStatement = this.Wd.createStatement();
            try {
                createStatement.executeQuery(stringBuffer.toString());
                long j = createStatement.getResultSet().next() ? createStatement.getResultSet().getLong(1) : 0;
                if (createStatement != null) {
                    try {
                        createStatement.close();
                    } catch (SQLException e2) {
                        this.Ud = e2.getErrorCode();
                        this.Td = e2.getLocalizedMessage();
                        return -1;
                    }
                }
                return j;
            } catch (SQLException e3) {
                e2 = e3;
                statement = createStatement;
                try {
                    this.Ud = e2.getErrorCode();
                    this.Td = e2.getLocalizedMessage();
                    if (statement != null) {
                        return -1;
                    }
                    try {
                        statement.close();
                        return -1;
                    } catch (SQLException e22) {
                        this.Ud = e22.getErrorCode();
                        this.Td = e22.getLocalizedMessage();
                        return -1;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (statement != null) {
                        try {
                            statement.close();
                        } catch (SQLException e222) {
                            this.Ud = e222.getErrorCode();
                            this.Td = e222.getLocalizedMessage();
                            return -1;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                statement = createStatement;
                if (statement != null) {
                    statement.close();
                }
                throw th;
            }
        } catch (SQLException e4) {
            e222 = e4;
            this.Ud = e222.getErrorCode();
            this.Td = e222.getLocalizedMessage();
            if (statement != null) {
                return -1;
            }
            statement.close();
            return -1;
        }
    }

    /* renamed from: b */
    public String mo3105b(String str) {
        String b = mo3104b();
        b = (b == null || b.equals("") || !str.startsWith(b) || !str.endsWith(b) || str.length() <= 1) ? str : str.substring(1, str.length() - 1);
        return C0808l.m4021a(Yd, b, str);
    }

    /* renamed from: b */
    public String[] mo3107b(db dbVar) {
        String c;
        int i = 0;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer(Zd[8]);
        stringBuffer.append(dbVar.mo2741a(true, (C0833j) this)).append("(");
        for (eb ebVar : dbVar.m3614S().values()) {
            if (!ebVar.m5853j()) {
                stringBuffer.append(mo3109d(dbVar, ebVar));
                stringBuffer.append(Zd[7]);
            }
            c = C0833j.m5284c(dbVar, ebVar);
            if (!(c == null || c.equals(""))) {
                arrayList.add(c.toString());
            }
        }
        c = stringBuffer.toString().trim();
        if (c.lastIndexOf(44) == c.length() - 1) {
            c = c.substring(0, c.length() - 1);
        }
        arrayList.add(0, c + ")");
        arrayList.trimToSize();
        String[] strArr = new String[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            strArr[i] = (String) it.next();
            i++;
        }
        return strArr;
    }

    /* renamed from: d */
    public String mo3109d(db dbVar, eb ebVar) {
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append(ebVar.m5818a(true, (C0833j) this)).append(" ");
        switch (ebVar.m5848f()) {
            case 2:
            case 39:
                stringBuffer.append(Zd[32]).append(ebVar.mo3139d()).append(")");
                break;
            case 3:
                stringBuffer.append(Zd[22]);
                break;
            case 4:
                stringBuffer.append(Zd[18]);
                break;
            case 5:
                stringBuffer.append(Zd[21]);
                break;
            case 6:
                stringBuffer.append(Zd[31]);
                break;
            case 7:
            case 41:
                stringBuffer.append(Zd[23]);
                break;
            case 9:
                stringBuffer.append(Zd[22]);
                break;
            case 11:
                stringBuffer.append(Zd[17]);
                break;
            case 12:
                stringBuffer.append(Zd[29]);
                break;
            case 14:
                stringBuffer.append(Zd[17]);
                break;
            case 17:
                stringBuffer.append(Zd[28]);
                break;
            case 24:
                stringBuffer.append(Zd[20]);
                break;
            case 25:
                stringBuffer.append(Zd[24]);
                break;
            case 26:
                stringBuffer.append(Zd[21]);
                break;
            case 27:
                stringBuffer.append(Zd[24]);
                break;
            case 28:
                stringBuffer.append(Zd[19]).append(ebVar.mo3139d()).append(")");
                break;
            case 29:
            case 40:
                stringBuffer.append(Zd[34]);
                break;
            case 30:
                stringBuffer.append(Zd[26]);
                break;
            case 34:
                stringBuffer.append(Zd[17]);
                break;
            case 35:
                stringBuffer.append(Zd[24]);
                break;
            case 36:
                stringBuffer.append(Zd[25]);
                break;
            case 37:
                stringBuffer.append(Zd[33]);
                break;
            case 38:
                stringBuffer.append(Zd[27]);
                break;
        }
        if (!(ebVar.m5806H() == null || ebVar.mo3138c())) {
            stringBuffer.append(Zd[30]).append(mo3173a(ebVar, (Object) ebVar.m5806H(), 0));
        }
        if (!(ebVar.m5807I() || ebVar.m5810L())) {
            stringBuffer.append(Zd[16]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public boolean mo3110d() {
        return false;
    }

    /* renamed from: e */
    public C0867b mo3163e() {
        return new C0869d(this);
    }

    /* renamed from: i */
    public Object mo3112i() {
        return null;
    }

    /* renamed from: k */
    public int mo3114k() {
        return 0;
    }

    /* renamed from: s */
    public String mo3120s() {
        return Zd[2];
    }

    /* renamed from: w */
    public boolean mo3161w() {
        return false;
    }

    /* renamed from: x */
    public String m5970x() {
        return Zd[35];
    }
}
