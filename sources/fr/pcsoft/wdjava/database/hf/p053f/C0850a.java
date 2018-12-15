package fr.pcsoft.wdjava.database.hf.p053f;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.utils.C0810n;
import fr.pcsoft.wdjava.database.hf.C0833j;
import fr.pcsoft.wdjava.database.hf.C0859l;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;

/* renamed from: fr.pcsoft.wdjava.database.hf.f.a */
public abstract class C0850a extends C0833j {
    private static final String[] Yd = new String[]{C0850a.m5870z(C0850a.m5871z("$\u0015r\u000ed\u001e\u0011`\rrM\u001cgAe\u001bw\u0011þ\u001f\u001dpA{\bXqg\f\nc\u0015r\u0018\n\"\u0005rM\u0016m\f7\t\u001d\"\u0007~\u000e\u0010k\u0004eM\u001cc\u000fdM\u0014g\u00127\u0000\u001dv\u0000s\f\fcAs\bXn\u00007\u000e\u0017l\u000fr\u0015\u0011m\u000f9")), C0850a.m5870z(C0850a.m5871z("N<P(A(*]+S/;](Y9*M4A,:N$")), C0850a.m5870z(C0850a.m5871z("N=P3R8*])Q2;M/Y( K.Y2:C2R")), C0850a.m5870z(C0850a.m5871z("N=P3R8*])Q25G2D,?G>U,+G")), C0850a.m5870z(C0850a.m5871z("N=P3R8*])Q2<G\"X#6G9^\"6]#V>=")), C0850a.m5870z(C0850a.m5871z("\u0016\u001dq\u0002v\u001d\u001d\"FKJ\u0005")), C0850a.m5870z(C0850a.m5871z("M>P.ZM")), C0850a.m5870z(C0850a.m5871z(">=N$T9"))};
    protected Connection Wd = null;
    private Statement Xd = null;

    /* renamed from: a */
    private final void m5868a(PreparedStatement preparedStatement, int i, byte[] bArr, InputStream[] inputStreamArr) throws SQLException {
        if (mo3160v()) {
            InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            inputStreamArr[i - 1] = byteArrayInputStream;
            preparedStatement.setBinaryStream(i, byteArrayInputStream, bArr.length);
            return;
        }
        if (bArr.length > 4096) {
            Object obj = new byte[4096];
            System.arraycopy(bArr, 0, obj, 0, 4096);
            bArr = obj;
        }
        preparedStatement.setBytes(i, bArr);
    }

    /* renamed from: a */
    private InputStream[] m5869a(PreparedStatement preparedStatement, Object[] objArr) throws SQLException {
        InputStream[] inputStreamArr = new InputStream[objArr.length];
        int i = 1;
        while (i <= objArr.length) {
            try {
                if (objArr[i - 1] instanceof WDObjet) {
                    Object obj = null;
                    if (((WDObjet) objArr[i - 1]).isMemoBinaire()) {
                        m5868a(preparedStatement, i, ((WDObjet) objArr[i - 1]).getDonneeBinaire(), inputStreamArr);
                        obj = 1;
                    } else {
                        File j = C0897o.m6290j(((WDObjet) objArr[i - 1]).getString());
                        if (j.exists()) {
                            try {
                                Object obj2;
                                inputStreamArr[i - 1] = new FileInputStream(j);
                                if (mo3160v()) {
                                    preparedStatement.setBinaryStream(i, inputStreamArr[i - 1], (int) j.length());
                                    obj2 = 1;
                                } else {
                                    try {
                                        preparedStatement.setBytes(i, C0897o.m6254a(j.getPath(), null));
                                        int i2 = 1;
                                    } catch (C0901s e) {
                                        obj2 = null;
                                    }
                                }
                                obj = obj2;
                            } catch (FileNotFoundException e2) {
                            }
                        }
                    }
                    if (obj == null) {
                        try {
                            m5868a(preparedStatement, i, ((WDObjet) objArr[i - 1]).getDonneeBinaire(), inputStreamArr);
                        } catch (C0901s e3) {
                            throw e3;
                        }
                    }
                    continue;
                }
                i++;
            } catch (C0901s e32) {
                throw e32;
            }
        }
        return inputStreamArr;
    }

    /* renamed from: z */
    private static String m5870z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 109;
                    break;
                case 1:
                    i2 = C0607n.co;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 97;
                    break;
                default:
                    i2 = 23;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5871z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 23);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3089a(db dbVar, C0859l c0859l) {
        try {
            if (this.Xd == null) {
                return 0;
            }
            int i = 0;
            ResultSet resultSet = this.Xd.getResultSet();
            int i2 = 0;
            while (resultSet.next()) {
                int i3;
                Object[] objArr = new Object[dbVar.m3614S().size()];
                int i4 = 0;
                int i5 = 0;
                for (eb ebVar : dbVar.m3614S().values()) {
                    try {
                        if (ebVar.m5853j()) {
                            i5++;
                        } else {
                            int k = ebVar.m5854k();
                            int i6 = (k - i5) + 1;
                            String string;
                            switch (resultSet.getMetaData().getColumnType(i6)) {
                                case -7:
                                    objArr[k] = new Byte(resultSet.getByte(i6));
                                    i3 = i4 + 12;
                                    break;
                                case -5:
                                case 2:
                                    objArr[k] = new Long(resultSet.getLong(i6));
                                    i3 = i4 + 16;
                                    break;
                                case -4:
                                case -3:
                                case -2:
                                case C0607n.Rg /*2004*/:
                                    WDChaine a = m5874a(resultSet, i6);
                                    objArr[k] = a;
                                    i3 = (int) (((long) i4) + a.m2430h());
                                    break;
                                case 0:
                                    objArr[k] = null;
                                    i3 = i4;
                                    break;
                                case 1:
                                    string = resultSet.getString(i6);
                                    objArr[k] = string;
                                    i3 = (int) (((long) i4) + C0810n.m4089a(string));
                                    break;
                                case 3:
                                case 8:
                                    objArr[k] = new Double(resultSet.getDouble(i6));
                                    i3 = i4 + 16;
                                    break;
                                case 4:
                                    objArr[k] = new Integer(resultSet.getInt(i6));
                                    i3 = i4 + 16;
                                    break;
                                case 5:
                                    objArr[k] = new Short(resultSet.getShort(i6));
                                    i3 = i4 + 16;
                                    break;
                                case 6:
                                    objArr[k] = new Float(resultSet.getFloat(i6));
                                    i3 = i4 + 16;
                                    break;
                                case 16:
                                    objArr[k] = new Boolean(resultSet.getBoolean(i6));
                                    i3 = i4 + 16;
                                    break;
                                case 91:
                                    objArr[k] = resultSet.getDate(i6);
                                    i3 = i4 + 24;
                                    break;
                                case 92:
                                    objArr[k] = resultSet.getTime(i6);
                                    i3 = i4 + 24;
                                    break;
                                case 93:
                                    objArr[k] = mo3162a(ebVar, resultSet, i6);
                                    i3 = i4 + 24;
                                    break;
                                case 2000:
                                    objArr[k] = resultSet.getObject(i6);
                                    i3 = i4 + 8;
                                    break;
                                case C0607n.Hj /*2005*/:
                                    string = "";
                                    Clob clob = resultSet.getClob(i6);
                                    if (clob != null) {
                                        string = clob.getSubString(1, (int) clob.length());
                                    }
                                    objArr[k] = string;
                                    i3 = (int) (((long) i4) + C0810n.m4089a(string));
                                    break;
                                default:
                                    string = resultSet.getString(i6);
                                    objArr[k] = string;
                                    i3 = (int) (((long) i4) + C0810n.m4089a(string));
                                    break;
                            }
                            if (resultSet.wasNull()) {
                                objArr[k] = null;
                                i3 = 0;
                            }
                            i4 = i3;
                        }
                    } catch (SQLException e) {
                        throw e;
                    } catch (SQLException e2) {
                        throw e2;
                    } catch (SQLException e22) {
                        try {
                            this.Ud = mo3159a(e22);
                            this.Td = e22.getLocalizedMessage();
                            if (this.Xd == null) {
                                return -1;
                            }
                            try {
                                this.Xd.close();
                            } catch (SQLException e3) {
                            }
                            this.Xd = null;
                            return -1;
                        } catch (Throwable th) {
                            if (this.Xd != null) {
                                try {
                                    this.Xd.close();
                                } catch (SQLException e4) {
                                }
                                this.Xd = null;
                            }
                        }
                    }
                }
                i3 = i2 + i4;
                c0859l.m6035a(objArr, i);
                i++;
                i2 = i3;
            }
            if (!(i2 == 0 || i == 0)) {
                c0859l.m6041b((int) Math.min(500.0f, Math.max(10.0f, 943718.4f / ((float) (i2 / i)))));
            }
            resultSet.close();
            if (this.Xd != null) {
                try {
                    this.Xd.close();
                } catch (SQLException e5) {
                }
                this.Xd = null;
            }
            return i;
        } catch (SQLException e222) {
            throw e222;
        }
    }

    /* renamed from: a */
    protected int mo3159a(SQLException sQLException) {
        return sQLException.getErrorCode();
    }

    /* renamed from: a */
    public WDChaine m5874a(ResultSet resultSet, int i) throws SQLException {
        try {
            return mo3160v() ? new WDChaine(resultSet.getBinaryStream(i)) : new WDChaine(resultSet.getBytes(i));
        } catch (SQLException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public Integer mo3090a(int i, boolean z) {
        SQLException e;
        Throwable th;
        try {
            if (this.Xd == null) {
                return null;
            }
            ResultSet resultSet;
            try {
                resultSet = this.Xd.getResultSet();
                try {
                    resultSet.next();
                    Integer num = new Integer(resultSet.getInt(i));
                    if (z) {
                        try {
                            if (this.Xd != null) {
                                if (resultSet != null) {
                                    try {
                                        resultSet.close();
                                    } catch (SQLException e2) {
                                    }
                                }
                                this.Xd.close();
                                this.Xd = null;
                            }
                        } catch (SQLException e3) {
                            throw e3;
                        }
                    }
                    return num;
                } catch (SQLException e4) {
                    e = e4;
                    try {
                        this.Ud = mo3159a(e);
                        this.Td = e.getLocalizedMessage();
                        if (z) {
                            return null;
                        }
                        try {
                            if (this.Xd != null) {
                                return null;
                            }
                            if (resultSet != null) {
                                try {
                                    resultSet.close();
                                } catch (SQLException e5) {
                                    return null;
                                }
                            }
                            this.Xd.close();
                            this.Xd = null;
                            return null;
                        } catch (SQLException e32) {
                            throw e32;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (z) {
                            try {
                                if (this.Xd != null) {
                                    if (resultSet != null) {
                                        try {
                                            resultSet.close();
                                        } catch (SQLException e6) {
                                            throw th;
                                        }
                                    }
                                    this.Xd.close();
                                    this.Xd = null;
                                }
                            } catch (SQLException e322) {
                                throw e322;
                            }
                        }
                        throw th;
                    }
                }
            } catch (SQLException e7) {
                e = e7;
                resultSet = null;
                this.Ud = mo3159a(e);
                this.Td = e.getLocalizedMessage();
                if (z) {
                    return null;
                }
                if (this.Xd != null) {
                    return null;
                }
                if (resultSet != null) {
                    resultSet.close();
                }
                this.Xd.close();
                this.Xd = null;
                return null;
            } catch (Throwable th3) {
                resultSet = null;
                th = th3;
                if (z) {
                    if (this.Xd != null) {
                        if (resultSet != null) {
                            resultSet.close();
                        }
                        this.Xd.close();
                        this.Xd = null;
                    }
                }
                throw th;
            }
        } catch (SQLException e3222) {
            throw e3222;
        }
    }

    /* renamed from: a */
    protected Object mo3162a(eb ebVar, ResultSet resultSet, int i) throws SQLException {
        try {
            switch (ebVar.m5848f()) {
                case 11:
                    return resultSet.getTime(i);
                case 14:
                    return resultSet.getDate(i);
                default:
                    return resultSet.getTimestamp(i);
            }
        } catch (SQLException e) {
            throw e;
        }
        throw e;
    }

    /* renamed from: a */
    public Object mo3091a(Object obj, int i) {
        switch (i) {
            case 11:
                return obj instanceof Time ? C0725i.m3051b((Time) obj) : obj instanceof Timestamp ? C0725i.m3051b((Timestamp) obj) : obj.toString();
            case 14:
                return obj instanceof Date ? C0725i.m3070e((Date) obj) : obj instanceof Timestamp ? C0725i.m3070e((Timestamp) obj) : obj.toString();
            case 34:
                return obj instanceof Timestamp ? C0725i.m3032a((Timestamp) obj) : obj instanceof Date ? C0725i.m3032a((Date) obj) : obj instanceof Time ? C0725i.m3032a((Time) obj) : obj.toString();
            default:
                return obj;
        }
    }

    /* renamed from: a */
    public String mo3093a(String str, String str2) {
        return str;
    }

    /* renamed from: a */
    public String mo3094a(String str, String str2, String str3, String str4, int i) {
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append(Yd[7]).append(str).append(Yd[6]).append(str2).append(str3).append(str4);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public void m5880a(String str, String str2, String str3) {
        try {
            Class.forName(str);
        } catch (NoClassDefFoundError e) {
            WDErreurManager.m2883a(C0745b.m3222b(Yd[2], str2, str3) + "\n" + C0745b.m3222b(Yd[1], str));
        } catch (ClassNotFoundException e2) {
            WDErreurManager.m2883a(C0745b.m3222b(Yd[2], str2, str3) + "\n" + C0745b.m3222b(Yd[1], str));
        }
    }

    /* renamed from: a */
    public boolean mo3097a(String str, int i, Object[] objArr) {
        PreparedStatement prepareStatement;
        SQLException e;
        Throwable th;
        int i2;
        InputStream[] inputStreamArr = null;
        try {
            if (this.Wd == null) {
                return false;
            }
            int i3;
            try {
                prepareStatement = this.Wd.prepareStatement(str);
                try {
                    inputStreamArr = m5869a(prepareStatement, objArr);
                    prepareStatement.executeUpdate();
                    i3 = 0;
                    while (i3 < inputStreamArr.length) {
                        try {
                            if (inputStreamArr[i3] != null) {
                                try {
                                    inputStreamArr[i3].close();
                                } catch (IOException e2) {
                                }
                            }
                            i3++;
                        } catch (IOException e3) {
                            throw e3;
                        }
                    }
                    if (prepareStatement != null) {
                        try {
                            prepareStatement.close();
                        } catch (SQLException e4) {
                            this.Ud = mo3159a(e4);
                            this.Td = e4.getLocalizedMessage();
                            return false;
                        }
                    }
                    m5317h();
                    return true;
                } catch (SQLException e5) {
                    e4 = e5;
                    try {
                        this.Ud = mo3159a(e4);
                        this.Td = e4.getLocalizedMessage();
                        while (i3 < inputStreamArr.length) {
                            try {
                                if (inputStreamArr[i3] != null) {
                                    try {
                                        inputStreamArr[i3].close();
                                    } catch (IOException e6) {
                                    }
                                }
                            } catch (IOException e32) {
                                throw e32;
                            }
                        }
                        if (prepareStatement != null) {
                            return false;
                        }
                        try {
                            prepareStatement.close();
                            return false;
                        } catch (SQLException e42) {
                            this.Ud = mo3159a(e42);
                            this.Td = e42.getLocalizedMessage();
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        while (i2 < inputStreamArr.length) {
                            try {
                                if (inputStreamArr[i2] != null) {
                                    try {
                                        inputStreamArr[i2].close();
                                    } catch (IOException e7) {
                                    }
                                }
                            } catch (IOException e322) {
                                throw e322;
                            }
                        }
                        if (prepareStatement != null) {
                            try {
                                prepareStatement.close();
                            } catch (SQLException e422) {
                                this.Ud = mo3159a(e422);
                                this.Td = e422.getLocalizedMessage();
                                return false;
                            }
                        }
                        throw th;
                    }
                }
            } catch (SQLException e8) {
                e422 = e8;
                prepareStatement = null;
                this.Ud = mo3159a(e422);
                this.Td = e422.getLocalizedMessage();
                for (i3 = 0; i3 < inputStreamArr.length; i3++) {
                    if (inputStreamArr[i3] != null) {
                        inputStreamArr[i3].close();
                    }
                }
                if (prepareStatement != null) {
                    return false;
                }
                prepareStatement.close();
                return false;
            } catch (Throwable th3) {
                th = th3;
                prepareStatement = null;
                for (i2 = 0; i2 < inputStreamArr.length; i2++) {
                    if (inputStreamArr[i2] != null) {
                        inputStreamArr[i2].close();
                    }
                }
                if (prepareStatement != null) {
                    prepareStatement.close();
                }
                throw th;
            }
        } catch (IOException e3222) {
            throw e3222;
        }
    }

    /* renamed from: a */
    public boolean mo3098a(String str, String str2, String str3, String str4, String str5) {
        m5880a(str5, str4, str);
        try {
            this.Wd = DriverManager.getConnection(str, str2, str3);
        } catch (SQLException e) {
            WDErreurManager.m2883a(C0745b.m3222b(Yd[2], str, str4) + "\n" + C0745b.m3222b(Yd[3], str4, String.valueOf(e.getErrorCode()), e.getMessage()));
        } catch (Exception e2) {
            WDErreurManager.m2883a(C0745b.m3222b(Yd[2], str, str4));
        }
        try {
            this.Rd = str4;
            return this.Wd != null;
        } catch (SQLException e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    public boolean mo3099a(String str, boolean z) {
        Statement createStatement;
        SQLException e;
        Throwable th;
        try {
            if (this.Wd == null) {
                return false;
            }
            try {
                createStatement = this.Wd.createStatement();
                try {
                    createStatement.execute(str);
                    this.Xd = createStatement;
                    if (!(z || createStatement == null)) {
                        this.Xd = null;
                        try {
                            createStatement.close();
                        } catch (SQLException e2) {
                            this.Ud = mo3159a(e2);
                            this.Td = e2.getLocalizedMessage();
                            return false;
                        }
                    }
                    m5317h();
                    return true;
                } catch (SQLException e3) {
                    e2 = e3;
                    try {
                        this.Ud = mo3159a(e2);
                        this.Td = e2.getLocalizedMessage();
                        if (createStatement != null) {
                            return false;
                        }
                        this.Xd = null;
                        try {
                            createStatement.close();
                            return false;
                        } catch (SQLException e22) {
                            this.Ud = mo3159a(e22);
                            this.Td = e22.getLocalizedMessage();
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        this.Xd = null;
                        try {
                            createStatement.close();
                            throw th;
                        } catch (SQLException e222) {
                            this.Ud = mo3159a(e222);
                            this.Td = e222.getLocalizedMessage();
                            return false;
                        }
                    }
                }
            } catch (SQLException e4) {
                e222 = e4;
                createStatement = null;
                this.Ud = mo3159a(e222);
                this.Td = e222.getLocalizedMessage();
                if (createStatement != null) {
                    return false;
                }
                this.Xd = null;
                createStatement.close();
                return false;
            } catch (Throwable th3) {
                th = th3;
                createStatement = null;
                if (!(z || createStatement == null)) {
                    this.Xd = null;
                    createStatement.close();
                }
                throw th;
            }
        } catch (SQLException e5) {
            throw e5;
        }
    }

    /* renamed from: a */
    public boolean mo3100a(String str, Object[] objArr) {
        PreparedStatement prepareStatement;
        SQLException e;
        int i;
        InputStream[] inputStreamArr = null;
        int i2 = 0;
        try {
            if (this.Wd == null) {
                return false;
            }
            try {
                prepareStatement = mo3161w() ? this.Wd.prepareStatement(str, 1) : this.Wd.prepareStatement(str);
                try {
                    inputStreamArr = m5869a(prepareStatement, objArr);
                    prepareStatement.executeUpdate();
                    this.Xd = prepareStatement;
                    if (inputStreamArr != null) {
                        while (i2 < inputStreamArr.length) {
                            try {
                                if (inputStreamArr[i2] != null) {
                                    try {
                                        inputStreamArr[i2].close();
                                    } catch (IOException e2) {
                                    }
                                }
                                i2++;
                            } catch (IOException e3) {
                                throw e3;
                            }
                        }
                    }
                    m5317h();
                    return true;
                } catch (SQLException e4) {
                    e = e4;
                    try {
                        this.Ud = mo3159a(e);
                        this.Td = e.getLocalizedMessage();
                        if (prepareStatement != null) {
                            prepareStatement.close();
                        }
                    } catch (SQLException e5) {
                        this.Ud = mo3159a(e);
                        this.Td = e.getLocalizedMessage();
                    } catch (Throwable th) {
                        if (inputStreamArr != null) {
                            while (i2 < inputStreamArr.length) {
                                try {
                                    if (inputStreamArr[i2] != null) {
                                        try {
                                            inputStreamArr[i2].close();
                                        } catch (IOException e6) {
                                        }
                                    }
                                    i2++;
                                } catch (IOException e32) {
                                    throw e32;
                                }
                            }
                        }
                    }
                    if (inputStreamArr != null) {
                        return false;
                    }
                    while (i < inputStreamArr.length) {
                        try {
                            if (inputStreamArr[i] != null) {
                                try {
                                    inputStreamArr[i].close();
                                } catch (IOException e7) {
                                }
                            }
                        } catch (IOException e322) {
                            throw e322;
                        }
                    }
                    return false;
                }
            } catch (SQLException e8) {
                e = e8;
                prepareStatement = null;
                this.Ud = mo3159a(e);
                this.Td = e.getLocalizedMessage();
                if (prepareStatement != null) {
                    prepareStatement.close();
                }
                if (inputStreamArr != null) {
                    return false;
                }
                for (i = 0; i < inputStreamArr.length; i++) {
                    if (inputStreamArr[i] != null) {
                        inputStreamArr[i].close();
                    }
                }
                return false;
            }
        } catch (IOException e3222) {
            throw e3222;
        }
    }

    /* renamed from: a */
    public boolean mo3101a(String[] strArr) {
        SQLException e;
        Throwable th;
        try {
            if (this.Wd == null) {
                return false;
            }
            Statement createStatement;
            try {
                createStatement = this.Wd.createStatement();
                int i = 0;
                while (i < strArr.length) {
                    try {
                        createStatement.execute(strArr[i]);
                        i++;
                    } catch (SQLException e2) {
                        e = e2;
                    }
                }
                if (createStatement != null) {
                    this.Xd = null;
                    try {
                        createStatement.close();
                    } catch (SQLException e3) {
                        this.Ud = mo3159a(e3);
                        this.Td = e3.getLocalizedMessage();
                        return false;
                    }
                }
                m5317h();
                return true;
            } catch (SQLException e4) {
                e3 = e4;
                createStatement = null;
                try {
                    this.Ud = mo3159a(e3);
                    this.Td = e3.getLocalizedMessage();
                    if (createStatement == null) {
                        return false;
                    }
                    this.Xd = null;
                    try {
                        createStatement.close();
                        return false;
                    } catch (SQLException e32) {
                        this.Ud = mo3159a(e32);
                        this.Td = e32.getLocalizedMessage();
                        return false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (createStatement != null) {
                        this.Xd = null;
                        try {
                            createStatement.close();
                        } catch (SQLException e322) {
                            this.Ud = mo3159a(e322);
                            this.Td = e322.getLocalizedMessage();
                            return false;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                createStatement = null;
                if (createStatement != null) {
                    this.Xd = null;
                    createStatement.close();
                }
                throw th;
            }
        } catch (SQLException e5) {
            throw e5;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public java.lang.Object[] mo3102a(java.lang.Object[] r13, int r14, int r15) {
        /*
        r12 = this;
        r0 = 0;
        r3 = 0;
        r1 = r12.Xd;	 Catch:{ SQLException -> 0x0007 }
        if (r1 != 0) goto L_0x0009;
    L_0x0006:
        return r3;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        r1 = r12.Xd;	 Catch:{ SQLException -> 0x0038 }
        r5 = r1.getResultSet();	 Catch:{ SQLException -> 0x0038 }
        r1 = 1;
        r2 = r0;
    L_0x0011:
        if (r1 == 0) goto L_0x001c;
    L_0x0013:
        if (r2 >= r15) goto L_0x001c;
    L_0x0015:
        r1 = r5.next();	 Catch:{ SQLException -> 0x0038 }
        r2 = r2 + 1;
        goto L_0x0011;
    L_0x001c:
        if (r2 < r15) goto L_0x0198;
    L_0x001e:
        r2 = new java.lang.Object[r14];	 Catch:{ SQLException -> 0x0038 }
        r4 = r0;
        r1 = r0;
    L_0x0022:
        r0 = r13.length;	 Catch:{ SQLException -> 0x0038 }
        if (r4 >= r0) goto L_0x0153;
    L_0x0025:
        r0 = r13[r4];	 Catch:{ SQLException -> 0x0038 }
        r0 = (fr.pcsoft.wdjava.database.hf.eb) r0;	 Catch:{ SQLException -> 0x0038 }
        r6 = r0.m5853j();	 Catch:{ SQLException -> 0x0036 }
        if (r6 == 0) goto L_0x0071;
    L_0x002f:
        r0 = r1 + 1;
    L_0x0031:
        r1 = r4 + 1;
        r4 = r1;
        r1 = r0;
        goto L_0x0022;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        r1 = r12.mo3159a(r0);	 Catch:{ all -> 0x00ab }
        r12.Ud = r1;	 Catch:{ all -> 0x00ab }
        r0 = r0.getLocalizedMessage();	 Catch:{ all -> 0x00ab }
        r12.Td = r0;	 Catch:{ all -> 0x00ab }
        r0 = r12.Xd;
        if (r0 == 0) goto L_0x0006;
    L_0x0049:
        r0 = r12.Xd;	 Catch:{ SQLException -> 0x0063 }
        r0 = r0.getResultSet();	 Catch:{ SQLException -> 0x0063 }
        if (r0 == 0) goto L_0x005a;
    L_0x0051:
        r0 = r12.Xd;	 Catch:{ SQLException -> 0x0063 }
        r0 = r0.getResultSet();	 Catch:{ SQLException -> 0x0063 }
        r0.close();	 Catch:{ SQLException -> 0x0063 }
    L_0x005a:
        r0 = r12.Xd;	 Catch:{ SQLException -> 0x0063 }
        r0.close();	 Catch:{ SQLException -> 0x0063 }
        r0 = 0;
        r12.Xd = r0;	 Catch:{ SQLException -> 0x0063 }
        goto L_0x0006;
    L_0x0063:
        r0 = move-exception;
        r1 = r12.mo3159a(r0);
        r12.Ud = r1;
        r0 = r0.getLocalizedMessage();
        r12.Td = r0;
        goto L_0x0006;
    L_0x0071:
        r6 = r0.m5854k();	 Catch:{ SQLException -> 0x0038 }
        r0 = r6 - r1;
        r7 = r0 + 1;
        r0 = r5.getMetaData();	 Catch:{ SQLException -> 0x0038 }
        r0 = r0.getColumnType(r7);	 Catch:{ SQLException -> 0x0038 }
        switch(r0) {
            case -7: goto L_0x00d6;
            case -5: goto L_0x00ca;
            case -4: goto L_0x014c;
            case -3: goto L_0x014c;
            case -2: goto L_0x014c;
            case 0: goto L_0x012a;
            case 1: goto L_0x00ee;
            case 2: goto L_0x00ca;
            case 3: goto L_0x00fc;
            case 4: goto L_0x0115;
            case 5: goto L_0x012f;
            case 6: goto L_0x0108;
            case 8: goto L_0x00fc;
            case 16: goto L_0x00e2;
            case 91: goto L_0x00f5;
            case 92: goto L_0x013c;
            case 93: goto L_0x0144;
            case 2000: goto L_0x0122;
            case 2004: goto L_0x014c;
            case 2005: goto L_0x0095;
            default: goto L_0x0084;
        };	 Catch:{ SQLException -> 0x0038 }
    L_0x0084:
        r0 = r5.getString(r7);	 Catch:{ SQLException -> 0x0038 }
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
    L_0x008a:
        r0 = r5.wasNull();	 Catch:{ SQLException -> 0x0151 }
        if (r0 == 0) goto L_0x0195;
    L_0x0090:
        r0 = 0;
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0151 }
        r0 = r1;
        goto L_0x0031;
    L_0x0095:
        r0 = "";
        r7 = r5.getClob(r7);	 Catch:{ SQLException -> 0x0038 }
        if (r7 == 0) goto L_0x00a8;
    L_0x009d:
        r8 = r7.length();	 Catch:{ SQLException -> 0x0038 }
        r10 = 1;
        r0 = (int) r8;	 Catch:{ SQLException -> 0x0038 }
        r0 = r7.getSubString(r10, r0);	 Catch:{ SQLException -> 0x0038 }
    L_0x00a8:
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x00ab:
        r0 = move-exception;
        r1 = r12.Xd;
        if (r1 == 0) goto L_0x00c9;
    L_0x00b0:
        r1 = r12.Xd;	 Catch:{ SQLException -> 0x0186 }
        r1 = r1.getResultSet();	 Catch:{ SQLException -> 0x0186 }
        if (r1 == 0) goto L_0x00c1;
    L_0x00b8:
        r1 = r12.Xd;	 Catch:{ SQLException -> 0x0186 }
        r1 = r1.getResultSet();	 Catch:{ SQLException -> 0x0186 }
        r1.close();	 Catch:{ SQLException -> 0x0186 }
    L_0x00c1:
        r1 = r12.Xd;	 Catch:{ SQLException -> 0x0186 }
        r1.close();	 Catch:{ SQLException -> 0x0186 }
        r1 = 0;
        r12.Xd = r1;	 Catch:{ SQLException -> 0x0186 }
    L_0x00c9:
        throw r0;
    L_0x00ca:
        r0 = new java.lang.Long;	 Catch:{ SQLException -> 0x0038 }
        r8 = r5.getLong(r7);	 Catch:{ SQLException -> 0x0038 }
        r0.<init>(r8);	 Catch:{ SQLException -> 0x0038 }
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x00d6:
        r0 = new java.lang.Byte;	 Catch:{ SQLException -> 0x0038 }
        r7 = r5.getByte(r7);	 Catch:{ SQLException -> 0x0038 }
        r0.<init>(r7);	 Catch:{ SQLException -> 0x0038 }
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x00e2:
        r0 = new java.lang.Boolean;	 Catch:{ SQLException -> 0x0038 }
        r7 = r5.getBoolean(r7);	 Catch:{ SQLException -> 0x0038 }
        r0.<init>(r7);	 Catch:{ SQLException -> 0x0038 }
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x00ee:
        r0 = r5.getString(r7);	 Catch:{ SQLException -> 0x0038 }
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x00f5:
        r0 = r5.getDate(r7);	 Catch:{ SQLException -> 0x0038 }
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x00fc:
        r0 = new java.lang.Double;	 Catch:{ SQLException -> 0x0038 }
        r8 = r5.getDouble(r7);	 Catch:{ SQLException -> 0x0038 }
        r0.<init>(r8);	 Catch:{ SQLException -> 0x0038 }
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x0108:
        r0 = new java.lang.Float;	 Catch:{ SQLException -> 0x0038 }
        r7 = r5.getFloat(r7);	 Catch:{ SQLException -> 0x0038 }
        r0.<init>(r7);	 Catch:{ SQLException -> 0x0038 }
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x0115:
        r0 = new java.lang.Integer;	 Catch:{ SQLException -> 0x0038 }
        r7 = r5.getInt(r7);	 Catch:{ SQLException -> 0x0038 }
        r0.<init>(r7);	 Catch:{ SQLException -> 0x0038 }
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x0122:
        r0 = r5.getObject(r7);	 Catch:{ SQLException -> 0x0038 }
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x012a:
        r0 = 0;
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x012f:
        r0 = new java.lang.Short;	 Catch:{ SQLException -> 0x0038 }
        r7 = r5.getShort(r7);	 Catch:{ SQLException -> 0x0038 }
        r0.<init>(r7);	 Catch:{ SQLException -> 0x0038 }
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x013c:
        r0 = r5.getTime(r7);	 Catch:{ SQLException -> 0x0038 }
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x0144:
        r0 = r5.getTimestamp(r7);	 Catch:{ SQLException -> 0x0038 }
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x014c:
        r0 = 0;
        r2[r6] = r0;	 Catch:{ SQLException -> 0x0038 }
        goto L_0x008a;
    L_0x0151:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLException -> 0x0038 }
    L_0x0153:
        r0 = r2;
    L_0x0154:
        r1 = r12.Xd;
        if (r1 == 0) goto L_0x0171;
    L_0x0158:
        r1 = r12.Xd;	 Catch:{ SQLException -> 0x0177 }
        r1 = r1.getResultSet();	 Catch:{ SQLException -> 0x0177 }
        if (r1 == 0) goto L_0x0169;
    L_0x0160:
        r1 = r12.Xd;	 Catch:{ SQLException -> 0x0177 }
        r1 = r1.getResultSet();	 Catch:{ SQLException -> 0x0177 }
        r1.close();	 Catch:{ SQLException -> 0x0177 }
    L_0x0169:
        r1 = r12.Xd;	 Catch:{ SQLException -> 0x0177 }
        r1.close();	 Catch:{ SQLException -> 0x0177 }
        r1 = 0;
        r12.Xd = r1;	 Catch:{ SQLException -> 0x0177 }
    L_0x0171:
        r12.m5317h();
        r3 = r0;
        goto L_0x0006;
    L_0x0177:
        r0 = move-exception;
        r1 = r12.mo3159a(r0);
        r12.Ud = r1;
        r0 = r0.getLocalizedMessage();
        r12.Td = r0;
        goto L_0x0006;
    L_0x0186:
        r0 = move-exception;
        r1 = r12.mo3159a(r0);
        r12.Ud = r1;
        r0 = r0.getLocalizedMessage();
        r12.Td = r0;
        goto L_0x0006;
    L_0x0195:
        r0 = r1;
        goto L_0x0031;
    L_0x0198:
        r0 = r3;
        goto L_0x0154;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.f.a.a(java.lang.Object[], int, int):java.lang.Object[]");
    }

    /* renamed from: b */
    public String mo3104b() {
        try {
            if (this.Vd == null && this.Wd != null) {
                try {
                    this.Vd = this.Wd.getMetaData().getIdentifierQuoteString();
                } catch (Exception e) {
                    this.Vd = "";
                    C0691a.m2857a(Yd[0], e);
                }
            }
            try {
                return this.Vd == null ? "" : this.Vd;
            } catch (SQLException e2) {
                throw e2;
            }
        } catch (SQLException e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    public boolean mo3106b(String str, int i) {
        Statement statement = null;
        try {
            if (this.Wd == null) {
                return false;
            }
            try {
                statement = this.Wd.createStatement();
                statement.executeUpdate(str);
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException e) {
                        this.Ud = mo3159a(e);
                        this.Td = e.getLocalizedMessage();
                        return false;
                    }
                }
                m5317h();
                return true;
            } catch (SQLException e2) {
                this.Ud = mo3159a(e2);
                this.Td = e2.getLocalizedMessage();
                if (statement == null) {
                    return false;
                }
                try {
                    statement.close();
                    return false;
                } catch (SQLException e22) {
                    this.Ud = mo3159a(e22);
                    this.Td = e22.getLocalizedMessage();
                    return false;
                }
            } catch (Throwable th) {
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException e222) {
                        this.Ud = mo3159a(e222);
                        this.Td = e222.getLocalizedMessage();
                        return false;
                    }
                }
            }
        } catch (SQLException e3) {
            throw e3;
        }
    }

    /* renamed from: c */
    public boolean mo3108c() {
        return true;
    }

    /* renamed from: g */
    public boolean mo3111g() {
        try {
            return this.Wd != null ? !this.Wd.isClosed() : false;
        } catch (SQLException e) {
            throw e;
        } catch (SQLException e2) {
            return false;
        }
    }

    /* renamed from: i */
    public Object mo3112i() {
        ResultSet generatedKeys;
        SQLException e;
        Throwable th;
        if (this.Xd != null) {
            try {
                generatedKeys = this.Xd.getGeneratedKeys();
                try {
                    if (generatedKeys.next()) {
                        Object object = generatedKeys.getObject(1);
                        if (generatedKeys != null) {
                            try {
                                generatedKeys.close();
                            } catch (SQLException e2) {
                            }
                        }
                        try {
                            this.Xd.close();
                            this.Xd = null;
                            return object;
                        } catch (SQLException e3) {
                            this.Ud = mo3159a(e3);
                            this.Td = e3.getLocalizedMessage();
                            return null;
                        }
                    }
                    if (generatedKeys != null) {
                        try {
                            generatedKeys.close();
                        } catch (SQLException e4) {
                        }
                    }
                    try {
                        this.Xd.close();
                        this.Xd = null;
                    } catch (SQLException e32) {
                        this.Ud = mo3159a(e32);
                        this.Td = e32.getLocalizedMessage();
                        return null;
                    }
                } catch (SQLException e5) {
                    e32 = e5;
                    try {
                        this.Ud = mo3159a(e32);
                        this.Td = e32.getLocalizedMessage();
                        if (generatedKeys != null) {
                            try {
                                generatedKeys.close();
                            } catch (SQLException e6) {
                            }
                        }
                        try {
                            this.Xd.close();
                            this.Xd = null;
                            return null;
                        } catch (SQLException e322) {
                            this.Ud = mo3159a(e322);
                            this.Td = e322.getLocalizedMessage();
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (generatedKeys != null) {
                            try {
                                generatedKeys.close();
                            } catch (SQLException e7) {
                            }
                        }
                        try {
                            this.Xd.close();
                            this.Xd = null;
                            throw th;
                        } catch (SQLException e3222) {
                            this.Ud = mo3159a(e3222);
                            this.Td = e3222.getLocalizedMessage();
                            return null;
                        }
                    }
                }
            } catch (SQLException e8) {
                e3222 = e8;
                generatedKeys = null;
                this.Ud = mo3159a(e3222);
                this.Td = e3222.getLocalizedMessage();
                if (generatedKeys != null) {
                    generatedKeys.close();
                }
                this.Xd.close();
                this.Xd = null;
                return null;
            } catch (Throwable th3) {
                th = th3;
                generatedKeys = null;
                if (generatedKeys != null) {
                    generatedKeys.close();
                }
                this.Xd.close();
                this.Xd = null;
                throw th;
            }
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo3113j() {
        try {
            if (this.Xd != null) {
                try {
                    this.Xd.close();
                } catch (SQLException e) {
                }
            }
            if (this.Wd != null) {
                this.Wd.close();
            }
        } catch (SQLException e2) {
            throw e2;
        } catch (SQLException e22) {
            WDErreurManager.m2883a(C0745b.m3222b(Yd[4], new String[0]) + "\n" + C0745b.m3222b(Yd[3], "", String.valueOf(e22.getErrorCode()), e22.getMessage()));
        }
        return true;
    }

    /* renamed from: k */
    public int mo3114k() {
        return 0;
    }

    /* renamed from: l */
    public boolean mo3115l() {
        try {
            if (this.Wd == null) {
                return true;
            }
            if (this.Wd.getAutoCommit()) {
                return true;
            }
            this.Wd.rollback();
            this.Wd.setAutoCommit(true);
            return true;
        } catch (SQLException e) {
            throw e;
        } catch (SQLException e2) {
            this.Ud = mo3159a(e2);
            this.Td = e2.getLocalizedMessage();
            return false;
        }
    }

    /* renamed from: n */
    public String mo3116n() {
        return Yd[5];
    }

    /* renamed from: o */
    public boolean mo3117o() {
        try {
            if (this.Wd != null) {
                if (this.Wd.getAutoCommit()) {
                    this.Wd.setAutoCommit(false);
                }
            }
            return true;
        } catch (SQLException e) {
            throw e;
        } catch (SQLException e2) {
            this.Ud = mo3159a(e2);
            this.Td = e2.getLocalizedMessage();
            return false;
        }
    }

    /* renamed from: p */
    public void mo3118p() {
        super.mo3118p();
        if (mo3111g()) {
            mo3113j();
        }
        this.Wd = null;
        this.Xd = null;
    }

    /* renamed from: q */
    public void mo3119q() {
        try {
            if (this.Xd != null) {
                this.Xd.close();
                this.Xd = null;
            }
            try {
                if (this.Wd == null) {
                    return;
                }
                if (!this.Wd.isClosed()) {
                    this.Wd.close();
                    this.Wd = null;
                }
            } catch (SQLException e) {
                throw e;
            } catch (SQLException e2) {
                throw e2;
            }
        } catch (SQLException e22) {
            WDErreurManager.m2883a(C0745b.m3222b(Yd[4], new String[0]) + "\n" + C0745b.m3222b(Yd[3], "", String.valueOf(e22.getErrorCode()), e22.getMessage()));
        }
    }

    /* renamed from: t */
    public boolean mo3121t() {
        try {
            return this.Wd != null ? !this.Wd.isClosed() : false;
        } catch (SQLException e) {
            throw e;
        } catch (SQLException e2) {
            return false;
        }
    }

    /* renamed from: u */
    public boolean mo3122u() {
        try {
            if (this.Wd == null) {
                return true;
            }
            if (this.Wd.getAutoCommit()) {
                return true;
            }
            this.Wd.commit();
            this.Wd.setAutoCommit(true);
            return true;
        } catch (SQLException e) {
            throw e;
        } catch (SQLException e2) {
            this.Ud = mo3159a(e2);
            this.Td = e2.getLocalizedMessage();
            return false;
        }
    }

    /* renamed from: v */
    public boolean mo3160v() {
        return true;
    }

    /* renamed from: w */
    public boolean mo3161w() {
        return true;
    }
}
