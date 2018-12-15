package fr.pcsoft.wdjava.database.hf.p053f;

import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.C0833j;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;
import fr.pcsoft.wdjava.database.hf.p050a.C0835b;
import java.sql.SQLException;
import java.sql.Statement;

/* renamed from: fr.pcsoft.wdjava.database.hf.f.d */
public class C0853d extends C0850a implements C0542t {
    private static final String[] Yd = new String[]{C0853d.m5931z(C0853d.m5932z("\u0006D\u001a'2\u0007")), C0853d.m5931z(C0853d.m5932z("8d+\u0000F7tx\u0001\b<`-\u0011")), C0853d.m5931z(C0853d.m5932z(";~x\u0007\u00136yx\u0000\u00077}=")), C0853d.m5931z(C0853d.m5932z("\u0002x60\u0003#[9\u0002\u0007\u001fU\u001a79\u0006@\u0014\u001d\u00120")), C0853d.m5931z(C0853d.m5932z("\u0006T\u00141%\u00011\u00155>}")), C0853d.m5931z(C0853d.m5932z("|1\u001e&)\u00181")), C0853d.m5931z(C0853d.m5932z("?u:\u0017\\")), C0853d.m5931z(C0853d.m5932z("{u:")), C0853d.m5931z(C0853d.m5932z("?u:\u0017\\&`4\u001d\u00120+")), C0853d.m5931z(C0853d.m5932z("u]\u00119/\u00011h")), C0853d.m5931z(C0853d.m5932z("uW\n;+u")), C0853d.m5931z(C0853d.m5932z("\u0006T\u00141%\u00011"))};

    /* renamed from: z */
    private static String m5931z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 85;
                    break;
                case 1:
                    i2 = 17;
                    break;
                case 2:
                    i2 = 88;
                    break;
                case 3:
                    i2 = 116;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5932z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 102);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo3159a(SQLException sQLException) {
        String toLowerCase = sQLException.getMessage().toLowerCase();
        return toLowerCase.startsWith(Yd[2]) ? C0542t.wd : toLowerCase.indexOf(Yd[1]) < 0 ? 99 : 1;
    }

    /* renamed from: a */
    public Object mo3091a(Object obj, int i) {
        return C0835b.m5371a(obj, i);
    }

    /* renamed from: a */
    public String mo3092a(int i) {
        switch (i) {
            case 42:
            case 44:
                return Yd[0];
            default:
                return super.mo3092a(i);
        }
    }

    /* renamed from: a */
    public String mo3094a(String str, String str2, String str3, String str4, int i) {
        return C0835b.m5374a(str, str2, str3, str4, i);
    }

    /* renamed from: a */
    public String mo3095a(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z) {
        return C0835b.m5375a(str, str2, str3, str4, j, j2, str5, z);
    }

    /* renamed from: a */
    public boolean mo3096a(db dbVar, eb ebVar) {
        boolean isAutoIncrement;
        Statement statement = null;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(Yd[11]).append(ebVar.m5818a(true, (C0833j) this)).append(Yd[10]).append(dbVar.mo2741a(true, (C0833j) this)).append(Yd[9]);
            statement = this.Wd.createStatement();
            statement.executeQuery(stringBuffer.toString());
            isAutoIncrement = statement.getResultSet().getMetaData().isAutoIncrement(1);
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    this.Ud = e.getErrorCode();
                    this.Td = e.getLocalizedMessage();
                }
            }
        } catch (SQLException e2) {
            this.Ud = e2.getErrorCode();
            this.Td = e2.getLocalizedMessage();
            isAutoIncrement = false;
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e3) {
                    this.Ud = e3.getErrorCode();
                    this.Td = e3.getLocalizedMessage();
                }
            }
        } catch (Throwable th) {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e32) {
                    this.Ud = e32.getErrorCode();
                    this.Td = e32.getLocalizedMessage();
                }
            }
        }
        return isAutoIncrement;
    }

    /* renamed from: a */
    public boolean mo3098a(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7;
        if (str.equals("")) {
            if (str4.equals("")) {
                str4 = WDProjet.getInstance().getNomApplication() + Yd[7];
            }
            if (str4.indexOf(46) == -1) {
                str4 = str4 + Yd[7];
            }
            str6 = Yd[8] + str4;
            str7 = str4;
        } else if (str.toLowerCase().startsWith(Yd[6])) {
            str7 = str4;
            str6 = str;
        } else {
            str6 = Yd[8] + str;
            str7 = str4;
        }
        return super.mo3098a(str6, str2, str3, str7, str5);
    }

    /* renamed from: b */
    public long mo3103b(db dbVar, eb ebVar) {
        SQLException e;
        Throwable th;
        Statement statement = null;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(Yd[4]).append(ebVar.m5818a(true, (C0833j) this)).append(Yd[5]).append(dbVar.mo2741a(true, (C0833j) this));
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
        return C0835b.m5373a(str);
    }

    /* renamed from: b */
    public String[] mo3107b(db dbVar) {
        return C0835b.m5376a(dbVar);
    }

    /* renamed from: d */
    public String mo3109d(db dbVar, eb ebVar) {
        return C0835b.m5372a(dbVar, ebVar);
    }

    /* renamed from: d */
    public boolean mo3110d() {
        return true;
    }

    /* renamed from: k */
    public int mo3114k() {
        return this.Ud;
    }

    /* renamed from: s */
    public String mo3120s() {
        return Yd[3];
    }

    /* renamed from: v */
    public boolean mo3160v() {
        return false;
    }

    /* renamed from: w */
    public boolean mo3161w() {
        return false;
    }
}
