package fr.pcsoft.wdjava.database.hf.p053f;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.C0833j;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;
import java.sql.SQLException;
import java.sql.Statement;

/* renamed from: fr.pcsoft.wdjava.database.hf.f.c */
public class C0852c extends C0850a implements C0542t {
    private static final String[] Yd = new String[]{C0852c.m5917z(C0852c.m5918z("h\u001eq=\f~WX\u001b6*9C\u0018.*\u0016c \rU\u001ex7\u0010o\u001as:\u0016")), C0852c.m5917z(C0852c.m5918z("*3S\u0012#_;Bt")), C0852c.m5917z(C0852c.m5918z("n\u0012u=\u000fk\u001b>eZ&A?")), C0852c.m5917z(C0852c.m5918z("~\u001ex-\u000bd\u00036\u0001,Y>Q\u001a'N")), C0852c.m5917z(C0852c.m5918z("~\u001e{1")), C0852c.m5917z(C0852c.m5918z("c\u0019b")), C0852c.m5917z(C0852c.m5918z("h\u001eq=\f~")), C0852c.m5917z(C0852c.m5918z("f\u0018x3\u0016o\u000fb")), C0852c.m5917z(C0852c.m5918z("~\u0012n ")), C0852c.m5917z(C0852c.m5918z("*3S\u0012#_;Bt,_;Z")), C0852c.m5917z(C0852c.m5918z("y\u001aw8\u000ec\u0019bt7D$_\u0013,O3")), C0852c.m5917z(C0852c.m5918z("~\u001ex-\u000bd\u0003")), C0852c.m5917z(C0852c.m5918z("i\u001fw&")), C0852c.m5917z(C0852c.m5918z("f\u0018x3\u0000f\u0018t")), C0852c.m5917z(C0852c.m5918z("|\u0016d7\nk\u0005>")), C0852c.m5917z(C0852c.m5918z("l\u001by5\u0016")), C0852c.m5917z(C0852c.m5918z("c\u0019bt7D$_\u0013,O3")), C0852c.m5917z(C0852c.m5918z("n\u0016b1\u0016c\u001as")), C0852c.m5917z(C0852c.m5918z("n\u0016b1")), C0852c.m5917z(C0852c.m5918z("h\u001eq=\f~WC\u001a1C0X\u0011&")), C0852c.m5917z(C0852c.m5918z("y\u001aw8\u000ec\u0019b")), C0852c.m5917z(C0852c.m5918z("c\u0019bt,E#6\u001a7F;65\u0017~\u0018I=\fi\u0005s9\u0007d\u0003")), C0852c.m5917z(C0852c.m5918z("n\u0018c6\u000eo")), C0852c.m5917z(C0852c.m5918z("N%Y\u0004B^6T\u0018'*>Pt'R>E\u00001*")), C0852c.m5917z(C0852c.m5918z("i\u0018{z\u000fs\u0004g8L`\u0013t7LN\u0005\"\u0007x")), C0852c.m5917z(C0852c.m5918z("Y2Z\u0011!^W[\u0015:\"")), C0852c.m5917z(C0852c.m5918z("#WP\u0006-GW")), C0852c.m5917z(C0852c.m5918z("*;_\u0019+^W")), C0852c.m5917z(C0852c.m5918z("*1D\u001b/*")), C0852c.m5917z(C0852c.m5918z("Y2Z\u0011!^")), C0852c.m5917z(C0852c.m5918z("]\u001ex\u0010\u0007|=w\"\u0003@3T\u0017=G\u000eE\u0005.")), C0852c.m5917z(C0852c.m5918z("&W")), C0852c.m5917z(C0852c.m5918z("Y2Z\u0011!^W")), C0852c.m5917z(C0852c.m5918z("*;_\u0019+^W&")), C0852c.m5917z(C0852c.m5918z("&W]\u0011;*")), C0852c.m5917z(C0852c.m5918z("&WC\u001a+[\"St")), C0852c.m5917z(C0852c.m5918z("&WF\u0006+G6D\rBA2Ot")), C0852c.m5917z(C0852c.m5918z("I%S\u00156OWB\u0015 F26")), C0852c.m5917z(C0852c.m5918z("#^"))};

    /* renamed from: z */
    private static String m5917z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 10;
                    break;
                case 1:
                    i2 = 119;
                    break;
                case 2:
                    i2 = 22;
                    break;
                case 3:
                    i2 = 84;
                    break;
                default:
                    i2 = 98;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5918z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 98);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3094a(String str, String str2, String str3, String str4, int i) {
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append(Yd[29]).append(str).append(Yd[28]).append(str2).append(str3).append(str4);
        if (i > -1) {
            stringBuffer.append(Yd[27]).append(i);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public String mo3095a(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z) {
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append(Yd[29]).append(str).append(Yd[28]).append(str2).append(str3).append(str4).append(Yd[27]).append(j).append(Yd[31]).append(j2);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public boolean mo3096a(db dbVar, eb ebVar) {
        boolean isAutoIncrement;
        Statement statement = null;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(Yd[32]).append(ebVar.m5818a(true, (C0833j) this)).append(Yd[28]).append(dbVar.mo2741a(true, (C0833j) this)).append(Yd[33]);
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

    /* renamed from: b */
    public long mo3103b(db dbVar, eb ebVar) {
        SQLException e;
        Throwable th;
        Statement statement = null;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(Yd[25]).append(ebVar.m5818a(true, (C0833j) this)).append(Yd[26]).append(dbVar.mo2741a(true, (C0833j) this));
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
        return Yd[23] + str;
    }

    /* renamed from: b */
    public boolean mo3106b(String str, int i) {
        if (i > 0) {
            str = str + Yd[27] + i;
        }
        return super.mo3106b(str, i);
    }

    /* renamed from: b */
    public String[] mo3107b(db dbVar) {
        StringBuffer stringBuffer = new StringBuffer(Yd[37]);
        stringBuffer.append(dbVar.mo2741a(true, (C0833j) this)).append("(");
        StringBuffer stringBuffer2 = new StringBuffer();
        int i = 0;
        for (eb ebVar : dbVar.m3614S().values()) {
            if (!ebVar.m5853j()) {
                stringBuffer.append(mo3109d(dbVar, ebVar));
                stringBuffer.append(Yd[31]);
            }
            if (ebVar.mo3138c()) {
                if (i == 0) {
                    stringBuffer2.append(Yd[36]);
                    i = true;
                } else {
                    stringBuffer2.append(Yd[35]);
                }
            } else if (ebVar.m5801C()) {
                if (i != 0 || dbVar.m3619Y()) {
                    stringBuffer2.append(Yd[35]);
                } else {
                    stringBuffer2.append(Yd[36]);
                    boolean z = true;
                }
            } else if (ebVar.m5809K() == 1) {
                stringBuffer2.append(Yd[35]);
            } else if (ebVar.m5809K() == 2) {
                stringBuffer2.append(Yd[34]);
            }
            int i2;
            if (ebVar.m5853j()) {
                stringBuffer2.append(ebVar.m5818a(true, (C0833j) this)).append("(");
                i2 = 0;
                for (String append : ebVar.m5861t().keySet()) {
                    if (i2 > 0) {
                        stringBuffer2.append(Yd[31]);
                    }
                    stringBuffer2.append(append);
                    i2++;
                }
                stringBuffer2.append(")");
            } else if (ebVar.mo3136a() || ebVar.mo3138c()) {
                stringBuffer2.append("(").append(ebVar.m5818a(true, (C0833j) this));
                i2 = ebVar.m5848f();
                if ((i2 == 2 || i2 == 39) && ebVar.mo3139d() > 256) {
                    stringBuffer2.append("(").append(ebVar.mo3139d()).append(Yd[38]);
                } else {
                    stringBuffer2.append(")");
                }
            }
        }
        String append2 = stringBuffer.toString().trim();
        if (append2.lastIndexOf(44) == append2.length() - 1) {
            append2 = append2.substring(0, append2.length() - 1);
        }
        append2 = append2 + stringBuffer2.toString().trim();
        return new String[]{append2 + ")"};
    }

    /* renamed from: d */
    public String mo3109d(db dbVar, eb ebVar) {
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append(ebVar.m5818a(true, (C0833j) this)).append(" ");
        boolean z;
        switch (ebVar.m5848f()) {
            case 2:
            case 39:
                int d = ebVar.mo3139d();
                if (d <= 256) {
                    stringBuffer.append(Yd[14]).append(d).append(")");
                    z = true;
                    break;
                }
                stringBuffer.append(Yd[8]);
                z = false;
                break;
            case 3:
                stringBuffer.append(Yd[20]);
                z = true;
                break;
            case 4:
                stringBuffer.append(Yd[11]);
                z = true;
                break;
            case 5:
                stringBuffer.append(Yd[5]);
                z = true;
                break;
            case 6:
                stringBuffer.append(Yd[15]);
                z = true;
                break;
            case 7:
                stringBuffer.append(Yd[22]);
                z = true;
                break;
            case 9:
                stringBuffer.append(Yd[10]);
                z = true;
                break;
            case 11:
                stringBuffer.append(Yd[4]);
                z = true;
                break;
            case 12:
                stringBuffer.append(Yd[12]);
                z = true;
                break;
            case 14:
                stringBuffer.append(Yd[18]);
                z = true;
                break;
            case 17:
            case 41:
                stringBuffer.append(Yd[2]);
                z = true;
                break;
            case 24:
                stringBuffer.append(Yd[0]);
                z = false;
                break;
            case 25:
                stringBuffer.append(Yd[6]);
                z = true;
                break;
            case 26:
                stringBuffer.append(Yd[16]);
                z = true;
                break;
            case 27:
                stringBuffer.append(Yd[19]);
                z = true;
                break;
            case 28:
                stringBuffer.append(Yd[14]).append(ebVar.mo3139d()).append(")");
                z = true;
                break;
            case 29:
            case 40:
                stringBuffer.append(Yd[7]);
                z = true;
                break;
            case 30:
                stringBuffer.append(Yd[13]);
                z = true;
                break;
            case 34:
                stringBuffer.append(Yd[17]);
                z = true;
                break;
            case 35:
                stringBuffer.append(Yd[5]);
                z = true;
                break;
            case 36:
                stringBuffer.append(Yd[3]);
                z = true;
                break;
            case 37:
                stringBuffer.append(Yd[11]);
                z = true;
                break;
            case 38:
                stringBuffer.append(Yd[21]);
                z = false;
                break;
            default:
                z = true;
                break;
        }
        if (ebVar.m5806H() != null && r0) {
            stringBuffer.append(Yd[1]).append(mo3173a(ebVar, (Object) ebVar.m5806H(), 0));
        } else if (ebVar.m5807I()) {
            stringBuffer.append(Yd[9]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public boolean mo3110d() {
        return true;
    }

    /* renamed from: k */
    public int mo3114k() {
        switch (this.Ud) {
            case 1054:
                return 3;
            case 1062:
                return 1;
            case C0607n.Bh /*1146*/:
                return C0542t.wd;
            default:
                return 99;
        }
    }

    /* renamed from: s */
    public String mo3120s() {
        return Yd[30];
    }

    /* renamed from: x */
    public String m5930x() {
        return Yd[24];
    }
}
