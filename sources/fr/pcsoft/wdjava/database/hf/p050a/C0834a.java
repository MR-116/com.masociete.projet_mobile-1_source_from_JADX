package fr.pcsoft.wdjava.database.hf.p050a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.C0810n;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.C0833j;
import fr.pcsoft.wdjava.database.hf.C0859l;
import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import java.io.File;

/* renamed from: fr.pcsoft.wdjava.database.hf.a.a */
public class C0834a extends C0833j {
    private static final String[] Zd = new String[]{C0834a.m5334z(C0834a.m5335z("|n\t3m\ny\u0004)n\u0000f\u001e2{\u001el\u001e>j\u001ex\u001e")), C0834a.m5334z(C0834a.m5335z("|n\t3m\ny\u0004)n\u0000h\u0014/f\u001as\u0012.f\u0000i\u001a2m")), C0834a.m5334z(C0834a.m5335z("qO9")), C0834a.m5334z(C0834a.m5335z("{f\u001a(f\u0000c\u001d>l\u0016y")), C0834a.m5334z(C0834a.m5335z("\u001aS8\u0004X+B4\u000f\b;^)\u0000F+\u000b7\u0000\b<Y²\u0000\\6D5AL*\u000b=\bK7B>\u0013\b;N{\rII:\u0012MO>AL0E5M,\u000b\b0d6_>AX0^)Ai1O)\u000eA;")), C0834a.m5334z(C0834a.m5335z("\u001cD5\u000fM'B4\u000f\b¿\u000b.\u000fMI:\u0012Mx\n-A+N{\u0005Á5J{\u000e])N)\u0015Mq")), C0834a.m5334z(C0834a.m5335z("|n\u0018)m\u001ct\u00183m\u001e\u0012.f\u0000o\u0019>w\fz\u0017(|\u001a")), C0834a.m5334z(C0834a.m5335z("\u001ax\u0018 x\u001a\u000b|=\u000f")), C0834a.m5334z(C0834a.m5335z("\u000bN5\u0015I+B-\u0004\b;N{\rM<_>\u0014ZO:\u000f[^5AK*Y(\u0004]-\u000b=\u0004Z2Â{\u000e]B5\u0004P6X/\u0000F+\u0005")), C0834a.m5334z(C0834a.m5335z("\u000bN5\u0015I+B-\u0004\b;N{\rM<_.\u0013MO:\u000f[G>AK*Y(\u0004]-\u000b8\u000e]-J5\u0015\b>]>\u0002\b*E>AK0E5\u0004P6D5AN:Y6Mq")), C0834a.m5334z(C0834a.m5335z("\u000bY:\u000f[>H/\bG1\u000b2\u000f^>G2\u0005Mq")), C0834a.m5334z(C0834a.m5335z("\bB5\u0005M)x\n-A+N")), C0834a.m5334z(C0834a.m5335z("\fn\u0017$k\u000b")), C0834a.m5334z(C0834a.m5335z("\u000bN5\u0015I+B-\u0004\b;\f>\u0019M<^/\bG1\u000b?F]1N{\u0013M.^±\u0015MJ-\u0004K^5\u0004\b<D5\u000fM'B4\u000f\b9N)\fÁ:\u0005")), C0834a.m5334z(C0834a.m5335z("1D{\u0012]<C{\u0015I=G>")), C0834a.m5334z(C0834a.m5335z("\u001aY)\u0004]-\u000b?\u0014Z>E/ADxJ(\u0012G<B:\u0015A0E{\u0005]M2\u0002@6N)AI*\u000b(\u0015I+N6\u0004F+\u0005")), C0834a.m5334z(C0834a.m5335z("|n\t3m\ny\u0004)n\u0000o\u001e\"g\u0011e\u001e9a\u0010e\u0004#i\fn")), C0834a.m5334z(C0834a.m5335z("\u000bN5\u0015I+B-\u0004\b;N{\u0007M-F>\u0015]-N{\u0005\u000f*E>AK0E5\u0004P6D5AL¶A:AN:Y6Mq")), C0834a.m5334z(C0834a.m5335z("\u000bN5\u0015I+B-\u0004\b;N{\u0013M2[7\b[,J<\u0004\b;^{\u0003]9M>\u0013\b>]>\u0002\b*E{\"]-X4\u0013\b6E>\u0019A,_:\u000f\\D.AN:Y6\u0006")), C0834a.m5334z(C0834a.m5335z("\u000bN5\u0015I+B-\u0004\b;N{\u0013M2[7\b[,J<\u0004\b;^{\u0003]9M>\u0013\b>]>\u0002\b*E>AK0E5\u0004P6D5AN:Y6Mq")), C0834a.m5334z(C0834a.m5335z("|n\t3w\u000bj\u0012-d\u001at\u0016$e\u0010t\u001a/l\rd\u0012%")), C0834a.m5334z(C0834a.m5335z("\u001bj\u000f$|\u0016f\u001eI\u000f1D,F\u0001")), C0834a.m5334z(C0834a.m5335z("\f~\u00192|\r")), C0834a.m5334z(C0834a.m5335z("\fn\u0017$k\u000b\u000b\u0016 pw")), C0834a.m5334z(C0834a.m5335z("v\u000b\u001d3g\u0012\u000b"))};
    private SQLiteDatabase Wd = null;
    private Cursor Xd = null;
    private long Yd = 0;

    /* renamed from: a */
    private final int m5331a(SQLiteException sQLiteException) {
        try {
            return sQLiteException.getMessage().toLowerCase().startsWith(Zd[14]) ? C0542t.wd : 99;
        } catch (SQLiteException e) {
            throw e;
        }
    }

    /* renamed from: a */
    private final Object m5332a(int i, int i2) {
        try {
            if (this.Xd.isNull(i)) {
                return null;
            }
            switch (i2) {
                case 3:
                case 4:
                case 9:
                case 36:
                case 37:
                    try {
                        return Short.valueOf(this.Xd.getShort(i));
                    } catch (SQLiteException e) {
                        throw e;
                    }
                case 5:
                case 26:
                case 38:
                    return Integer.valueOf(this.Xd.getInt(i));
                case 6:
                    return Float.valueOf(this.Xd.getFloat(i));
                case 7:
                case 41:
                    return Double.valueOf(this.Xd.getDouble(i));
                case 24:
                case 25:
                case 27:
                    return Long.valueOf(this.Xd.getLong(i));
                case 28:
                case 30:
                    return new WDChaine(this.Xd.getBlob(i));
                case 99:
                case 100:
                    return null;
                default:
                    return this.Xd.getString(i);
            }
        } catch (SQLiteException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private void m5333a(SQLiteStatement sQLiteStatement, Object[] objArr) throws SQLiteException {
        int length = objArr.length;
        int i = 1;
        while (i <= length) {
            try {
                if (objArr[i - 1] instanceof WDObjet) {
                    byte[] donneeBinaire;
                    Object obj = null;
                    if (((WDObjet) objArr[i - 1]).isMemoBinaire()) {
                        donneeBinaire = ((WDObjet) objArr[i - 1]).getDonneeBinaire();
                        obj = 1;
                    } else {
                        try {
                            donneeBinaire = C0897o.m6254a(((WDObjet) objArr[i - 1]).getString(), null);
                            int i2 = 1;
                        } catch (Exception e) {
                            C0691a.m2857a(Zd[15], e);
                            donneeBinaire = null;
                        }
                    }
                    if (obj == null) {
                        try {
                            sQLiteStatement.bindBlob(i, ((WDObjet) objArr[i - 1]).getDonneeBinaire());
                        } catch (C0901s e2) {
                            throw e2;
                        }
                    }
                    if (donneeBinaire != null) {
                        try {
                            if (donneeBinaire.length > 0) {
                                sQLiteStatement.bindBlob(i, donneeBinaire);
                            }
                        } catch (C0901s e22) {
                            throw e22;
                        }
                    }
                    sQLiteStatement.bindNull(i);
                }
                i++;
            } catch (C0901s e222) {
                throw e222;
            }
        }
    }

    /* renamed from: z */
    private static String m5334z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 95;
                    break;
                case 1:
                    i2 = 43;
                    break;
                case 2:
                    i2 = 91;
                    break;
                case 3:
                    i2 = 97;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5335z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 40);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3089a(db dbVar, C0859l c0859l) {
        try {
            if (mo3121t()) {
                try {
                    if (this.Xd != null) {
                        if (!this.Xd.isClosed()) {
                            int i = 0;
                            int i2 = 0;
                            while (this.Xd.moveToNext()) {
                                try {
                                    int i3;
                                    Object[] objArr = new Object[dbVar.m3614S().size()];
                                    int i4 = 0;
                                    int i5 = 0;
                                    for (eb ebVar : dbVar.m3614S().values()) {
                                        if (ebVar.m5853j()) {
                                            i5++;
                                        } else {
                                            int k = ebVar.m5854k();
                                            int i6 = k - i5;
                                            switch (ebVar.m5848f()) {
                                                case 3:
                                                case 4:
                                                case 9:
                                                case 36:
                                                case 37:
                                                    objArr[k] = Short.valueOf(this.Xd.getShort(i6));
                                                    i3 = i4 + 16;
                                                    break;
                                                case 5:
                                                case 26:
                                                case 38:
                                                    objArr[k] = Integer.valueOf(this.Xd.getInt(i6));
                                                    i3 = i4 + 16;
                                                    break;
                                                case 6:
                                                    objArr[k] = Float.valueOf(this.Xd.getFloat(i6));
                                                    i3 = i4 + 16;
                                                    break;
                                                case 7:
                                                case 41:
                                                    objArr[k] = Double.valueOf(this.Xd.getDouble(i6));
                                                    i3 = i4 + 16;
                                                    break;
                                                case 24:
                                                case 25:
                                                case 27:
                                                    objArr[k] = Long.valueOf(this.Xd.getLong(i6));
                                                    i3 = i4 + 16;
                                                    break;
                                                case 28:
                                                case 30:
                                                    WDChaine wDChaine = new WDChaine(this.Xd.getBlob(i6));
                                                    objArr[k] = wDChaine;
                                                    i3 = (int) (((long) i4) + wDChaine.m2430h());
                                                    break;
                                                case 99:
                                                    i3 = i4;
                                                    break;
                                                case 100:
                                                    objArr[k] = Double.valueOf(this.Xd.getDouble(i6));
                                                    i3 = i4 + 16;
                                                    break;
                                                default:
                                                    String string = this.Xd.getString(i6);
                                                    objArr[k] = string;
                                                    i3 = (int) (((long) i4) + C0810n.m4089a(string));
                                                    break;
                                            }
                                            if (this.Xd.isNull(i6)) {
                                                objArr[k] = null;
                                                i3 = 0;
                                            }
                                            i4 = i3;
                                        }
                                    }
                                    i3 = i2 + i4;
                                    c0859l.m6035a(objArr, i);
                                    i++;
                                    i2 = i3;
                                } catch (IllegalStateException e) {
                                    throw e;
                                } catch (SQLiteException e2) {
                                    this.Ud = m5331a(e2);
                                    this.Td = e2.getLocalizedMessage();
                                    try {
                                        if (this.Xd == null) {
                                            return -1;
                                        }
                                        this.Xd.close();
                                        this.Xd = null;
                                        return -1;
                                    } catch (IllegalStateException e3) {
                                        throw e3;
                                    }
                                } catch (IllegalStateException e32) {
                                    throw e32;
                                } catch (IllegalStateException e322) {
                                    throw e322;
                                } catch (IllegalStateException e4) {
                                    WDErreurManager.m2883a(C0745b.m3222b(Zd[20], dbVar.mo2719a()));
                                    if (this.Xd != null) {
                                        this.Xd.close();
                                        this.Xd = null;
                                    }
                                } catch (Throwable th) {
                                    try {
                                        if (this.Xd != null) {
                                            this.Xd.close();
                                            this.Xd = null;
                                        }
                                    } catch (IllegalStateException e3222) {
                                        throw e3222;
                                    }
                                }
                            }
                            if (!(i2 == 0 || i == 0)) {
                                c0859l.m6041b((int) Math.min(500.0f, Math.max(10.0f, 943718.4f / ((float) (i2 / i)))));
                            }
                            try {
                                if (this.Xd != null) {
                                    this.Xd.close();
                                    this.Xd = null;
                                }
                                return i;
                            } catch (IllegalStateException e32222) {
                                throw e32222;
                            }
                        }
                    }
                    C0691a.m2856a(Zd[18]);
                    return 0;
                } catch (IllegalStateException e322222) {
                    throw e322222;
                } catch (IllegalStateException e3222222) {
                    throw e3222222;
                }
            }
            C0691a.m2856a(Zd[19]);
            return 0;
        } catch (IllegalStateException e32222222) {
            throw e32222222;
        }
    }

    /* renamed from: a */
    public Integer mo3090a(int i, boolean z) {
        int i2 = i - 1;
        try {
            if (mo3121t()) {
                try {
                    if (this.Xd != null) {
                        if (!this.Xd.isClosed()) {
                            try {
                                this.Xd.moveToNext();
                                Integer num = new Integer(this.Xd.getInt(i2));
                                if (!z) {
                                    return num;
                                }
                                try {
                                    if (this.Xd == null) {
                                        return num;
                                    }
                                    this.Xd.close();
                                    this.Xd = null;
                                    return num;
                                } catch (SQLiteException e) {
                                    throw e;
                                }
                            } catch (SQLiteException e2) {
                                this.Ud = m5331a(e2);
                                this.Td = e2.getLocalizedMessage();
                                if (z) {
                                    try {
                                        if (this.Xd != null) {
                                            this.Xd.close();
                                            this.Xd = null;
                                        }
                                    } catch (SQLiteException e22) {
                                        throw e22;
                                    }
                                }
                                return null;
                            } catch (Throwable th) {
                                if (z) {
                                    try {
                                        if (this.Xd != null) {
                                            this.Xd.close();
                                            this.Xd = null;
                                        }
                                    } catch (SQLiteException e222) {
                                        throw e222;
                                    }
                                }
                            }
                        }
                    }
                    C0691a.m2856a(Zd[8]);
                    return Integer.valueOf(0);
                } catch (SQLiteException e2222) {
                    throw e2222;
                } catch (SQLiteException e22222) {
                    throw e22222;
                }
            }
            C0691a.m2856a(Zd[9]);
            return Integer.valueOf(0);
        } catch (SQLiteException e222222) {
            throw e222222;
        }
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
                return Zd[22];
            case 97:
                try {
                    return Zd[21];
                } catch (SQLiteException e) {
                    throw e;
                }
            default:
                return super.mo3092a(i);
        }
    }

    /* renamed from: a */
    public String mo3093a(String str, String str2) {
        return str;
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
        return true;
    }

    /* renamed from: a */
    public boolean mo3097a(String str, int i, Object[] objArr) {
        return m5348a(str, objArr, i, true);
    }

    /* renamed from: a */
    public boolean mo3098a(String str, String str2, String str3, String str4, String str5) {
        try {
            if (this.Wd != null) {
                C0691a.m2856a(Zd[5]);
                this.Wd.close();
            }
            if (str4.equals("")) {
                str4 = C0725i.m3031a(WDProjet.getInstance().getNomAPK(), false) + Zd[2];
            }
            if (str4.equalsIgnoreCase(str) || str.equals("")) {
                String b = C0725i.m3050b(str4);
                if (new File(WDAppManager.m2581h(), b).exists()) {
                    str4 = b;
                }
                this.Wd = WDAppManager.m2544C().openOrCreateDatabase(str4, 0, null);
            } else {
                String a = C0808l.m4018a(str, Zd[3], C0897o.m6277e(WDHF_Contexte.getInstance().m5040t()));
                File j = C0897o.m6290j(a);
                try {
                    File file;
                    boolean z;
                    if (!j.exists()) {
                        if (a.length() > 0 && a.charAt(0) != File.separatorChar) {
                            file = new File(C0897o.m6242a(WDAppManager.m2581h().getPath()) + a);
                            if (!file.exists()) {
                                try {
                                    file.getParentFile().mkdirs();
                                    if (file.createNewFile()) {
                                        z = true;
                                        if (!z) {
                                            WDErreurManager.m2883a(C0745b.m3222b(Zd[6], file.getPath()));
                                        }
                                    }
                                } catch (Exception e) {
                                    C0691a.m2857a(Zd[4], e);
                                }
                                z = false;
                                if (z) {
                                    WDErreurManager.m2883a(C0745b.m3222b(Zd[6], file.getPath()));
                                }
                            }
                            this.Wd = SQLiteDatabase.openDatabase(file.getPath(), null, 268435473);
                        }
                    }
                    file = j;
                    if (file.exists()) {
                        file.getParentFile().mkdirs();
                        if (file.createNewFile()) {
                            z = true;
                            if (z) {
                                WDErreurManager.m2883a(C0745b.m3222b(Zd[6], file.getPath()));
                            }
                        }
                        z = false;
                        if (z) {
                            WDErreurManager.m2883a(C0745b.m3222b(Zd[6], file.getPath()));
                        }
                    }
                    this.Wd = SQLiteDatabase.openDatabase(file.getPath(), null, 268435473);
                } catch (Exception e2) {
                    throw e2;
                } catch (Exception e22) {
                    throw e22;
                }
            }
            this.Rd = str4;
        } catch (Exception e222) {
            throw e222;
        } catch (Exception e2222) {
            throw e2222;
        } catch (Exception e22222) {
            throw e22222;
        } catch (SQLiteException e3) {
            WDErreurManager.m2883a(C0745b.m3222b(Zd[1], "", str4) + "\n" + C0745b.m3222b(Zd[0], str4, "0", e3.getMessage()));
        }
        try {
            return this.Wd != null;
        } catch (Exception e222222) {
            throw e222222;
        }
    }

    /* renamed from: a */
    public boolean mo3099a(String str, boolean z) {
        Cursor cursor = null;
        try {
            if (mo3121t()) {
                if (!z) {
                    try {
                        if (!str.trim().toUpperCase().startsWith(Zd[12])) {
                            this.Wd.execSQL(str);
                            if (!(z || cursor == null)) {
                                this.Xd = null;
                                try {
                                    cursor.close();
                                } catch (SQLiteException e) {
                                    this.Ud = m5331a(e);
                                    this.Td = e.getLocalizedMessage();
                                    return false;
                                }
                            }
                            m5317h();
                            return true;
                        }
                    } catch (SQLiteException e2) {
                        this.Ud = m5331a(e2);
                        this.Td = e2.getLocalizedMessage();
                        if (cursor == null) {
                            return false;
                        }
                        try {
                            this.Xd = null;
                            try {
                                cursor.close();
                                return false;
                            } catch (SQLiteException e22) {
                                this.Ud = m5331a(e22);
                                this.Td = e22.getLocalizedMessage();
                                return false;
                            }
                        } catch (IllegalStateException e3) {
                            throw e3;
                        }
                    } catch (Throwable th) {
                        if (!(z || cursor == null)) {
                            try {
                                this.Xd = null;
                                try {
                                    cursor.close();
                                } catch (SQLiteException e222) {
                                    this.Ud = m5331a(e222);
                                    this.Td = e222.getLocalizedMessage();
                                    return false;
                                }
                            } catch (IllegalStateException e32) {
                                throw e32;
                            }
                        }
                    }
                }
                cursor = this.Wd.rawQuery(str, null);
                this.Xd = cursor;
                try {
                    this.Xd = null;
                    cursor.close();
                    m5317h();
                    return true;
                } catch (IllegalStateException e322) {
                    throw e322;
                }
            }
            C0691a.m2856a(Zd[13]);
            return false;
        } catch (SQLiteException e4) {
            throw e4;
        }
    }

    /* renamed from: a */
    public boolean mo3100a(String str, Object[] objArr) {
        return m5348a(str, objArr, 0, false);
    }

    /* renamed from: a */
    public boolean m5348a(String str, Object[] objArr, int i, boolean z) {
        SQLiteStatement sQLiteStatement = null;
        try {
            if (mo3121t()) {
                try {
                    sQLiteStatement = this.Wd.compileStatement(str);
                    if (objArr != null) {
                        if (objArr.length > 0) {
                            m5333a(sQLiteStatement, objArr);
                        }
                    }
                    if (z) {
                        sQLiteStatement.execute();
                    } else {
                        this.Yd = sQLiteStatement.executeInsert();
                    }
                    if (sQLiteStatement != null) {
                        try {
                            sQLiteStatement.close();
                        } catch (SQLiteException e) {
                            throw e;
                        }
                    }
                    m5317h();
                    return true;
                } catch (SQLiteException e2) {
                    throw e2;
                } catch (SQLiteException e22) {
                    throw e22;
                } catch (SQLiteException e222) {
                    try {
                        this.Ud = m5331a(e222);
                        this.Td = e222.getLocalizedMessage();
                        if (sQLiteStatement == null) {
                            return false;
                        }
                        try {
                            sQLiteStatement.close();
                            return false;
                        } catch (SQLiteException e3) {
                            throw e3;
                        }
                    } catch (Throwable th) {
                        if (sQLiteStatement != null) {
                            try {
                                sQLiteStatement.close();
                            } catch (SQLiteException e32) {
                                throw e32;
                            }
                        }
                    }
                }
            }
            C0691a.m2856a(Zd[13]);
            return false;
        } catch (SQLiteException e322) {
            throw e322;
        }
    }

    /* renamed from: a */
    public boolean mo3101a(String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                if (!mo3099a(strArr[i], false)) {
                    return false;
                }
                i++;
            } catch (SQLiteException e) {
                throw e;
            }
        }
        return true;
    }

    /* renamed from: a */
    public Object[] mo3102a(Object[] objArr, int i, int i2) {
        try {
            if (mo3121t()) {
                try {
                    if (this.Xd != null) {
                        if (!this.Xd.isClosed()) {
                            Object[] objArr2;
                            boolean z = true;
                            int i3 = 0;
                            while (z && i3 < i2) {
                                try {
                                    z = this.Xd.moveToNext();
                                    i3++;
                                } catch (SQLiteException e) {
                                    throw e;
                                } catch (SQLiteException e2) {
                                    try {
                                        this.Ud = m5331a(e2);
                                        this.Td = e2.getLocalizedMessage();
                                        return null;
                                    } finally {
                                        try {
                                            if (this.Xd != null) {
                                                this.Xd.close();
                                                this.Xd = null;
                                            }
                                        } catch (SQLiteException e22) {
                                            throw e22;
                                        }
                                    }
                                }
                            }
                            if (i3 >= i2) {
                                Object[] objArr3 = new Object[i];
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < objArr.length) {
                                    int i6;
                                    eb ebVar = (eb) objArr[i4];
                                    if (ebVar.m5853j()) {
                                        i6 = i5 + 1;
                                    } else {
                                        objArr3[ebVar.m5854k()] = m5332a(ebVar.m5854k() - i5, ebVar.m5848f());
                                        i6 = i5;
                                    }
                                    i4++;
                                    i5 = i6;
                                }
                                objArr2 = objArr3;
                            } else {
                                objArr2 = null;
                            }
                            try {
                                if (this.Xd != null) {
                                    this.Xd.close();
                                    this.Xd = null;
                                }
                                m5317h();
                                return objArr2;
                            } catch (SQLiteException e222) {
                                throw e222;
                            }
                        }
                    }
                    C0691a.m2856a(Zd[8]);
                    return null;
                } catch (SQLiteException e2222) {
                    throw e2222;
                } catch (SQLiteException e22222) {
                    throw e22222;
                }
            }
            C0691a.m2856a(Zd[9]);
            return null;
        } catch (SQLiteException e222222) {
            throw e222222;
        }
    }

    /* renamed from: b */
    public long mo3103b(db dbVar, eb ebVar) {
        long j = -1;
        try {
            if (mo3121t()) {
                SQLiteStatement sQLiteStatement = null;
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(Zd[23]).append(ebVar.m5818a(true, (C0833j) this)).append(Zd[24]).append(dbVar.mo2741a(true, (C0833j) this));
                    sQLiteStatement = this.Wd.compileStatement(stringBuffer.toString());
                    j = sQLiteStatement.simpleQueryForLong() + 1;
                    if (sQLiteStatement != null) {
                        try {
                            sQLiteStatement.close();
                        } catch (SQLiteException e) {
                            throw e;
                        }
                    }
                } catch (SQLiteException e2) {
                    this.Ud = m5331a(e2);
                    this.Td = e2.getLocalizedMessage();
                    if (sQLiteStatement != null) {
                        try {
                            sQLiteStatement.close();
                        } catch (SQLiteException e3) {
                            throw e3;
                        }
                    }
                } catch (Throwable th) {
                    if (sQLiteStatement != null) {
                        try {
                            sQLiteStatement.close();
                        } catch (SQLiteException e32) {
                            throw e32;
                        }
                    }
                }
            }
            C0691a.m2856a(Zd[13]);
            return j;
        } catch (SQLiteException e322) {
            throw e322;
        }
    }

    /* renamed from: b */
    public String mo3104b() {
        return "\"";
    }

    /* renamed from: b */
    public String mo3105b(String str) {
        return C0835b.m5373a(str);
    }

    /* renamed from: b */
    public boolean mo3106b(String str, int i) {
        return m5348a(str, null, i, true);
    }

    /* renamed from: b */
    public String[] mo3107b(db dbVar) {
        return C0835b.m5376a(dbVar);
    }

    /* renamed from: c */
    public boolean mo3108c() {
        return true;
    }

    /* renamed from: d */
    public String mo3109d(db dbVar, eb ebVar) {
        return C0835b.m5372a(dbVar, ebVar);
    }

    /* renamed from: d */
    public boolean mo3110d() {
        return true;
    }

    /* renamed from: g */
    public boolean mo3111g() {
        return mo3121t();
    }

    /* renamed from: i */
    public Object mo3112i() {
        return new Long(this.Yd);
    }

    /* renamed from: j */
    public boolean mo3113j() {
        try {
            if (this.Xd != null) {
                this.Xd.close();
                this.Xd = null;
            }
            try {
                if (mo3121t()) {
                    this.Wd.close();
                } else {
                    C0691a.m2856a(Zd[17]);
                }
                try {
                    boolean z = !this.Wd.isOpen();
                    if (z) {
                        try {
                            this.Wd = null;
                        } catch (SQLiteException e) {
                            throw e;
                        }
                    }
                    return z;
                } catch (SQLiteException e2) {
                    throw e2;
                }
            } catch (SQLiteException e22) {
                throw e22;
            }
        } catch (SQLiteException e222) {
            throw e222;
        }
    }

    /* renamed from: k */
    public int mo3114k() {
        return this.Ud;
    }

    /* renamed from: l */
    public boolean mo3115l() {
        try {
            if (!this.Wd.inTransaction()) {
                return false;
            }
            try {
                this.Wd.endTransaction();
                return true;
            } catch (Exception e) {
                C0691a.m2857a(Zd[10], e);
                return false;
            }
        } catch (SQLiteException e2) {
            throw e2;
        }
    }

    /* renamed from: n */
    public String mo3116n() {
        return Zd[7];
    }

    /* renamed from: o */
    public boolean mo3117o() {
        try {
            this.Wd.beginTransaction();
            return true;
        } catch (Exception e) {
            C0691a.m2857a(Zd[10], e);
            return false;
        }
    }

    /* renamed from: p */
    public void mo3118p() {
        try {
            super.mo3118p();
            if (mo3111g()) {
                mo3113j();
            }
            this.Xd = null;
            this.Wd = null;
        } catch (SQLiteException e) {
            throw e;
        }
    }

    /* renamed from: q */
    public void mo3119q() {
        try {
            if (this.Xd != null) {
                this.Xd.close();
                this.Xd = null;
            }
            if (this.Wd != null) {
                this.Wd.close();
                this.Wd = null;
            }
        } catch (SQLiteException e) {
            throw e;
        } catch (SQLiteException e2) {
            WDErreurManager.m2883a(C0745b.m3222b(Zd[16], new String[0]) + "\n" + C0745b.m3222b(Zd[0], "", String.valueOf(0), e2.getMessage()));
        }
    }

    /* renamed from: s */
    public String mo3120s() {
        return Zd[11];
    }

    /* renamed from: t */
    public boolean mo3121t() {
        try {
            if (this.Wd != null) {
                if (this.Wd.isOpen()) {
                    return true;
                }
            }
            return false;
        } catch (SQLiteException e) {
            throw e;
        } catch (SQLiteException e2) {
            throw e2;
        }
    }

    /* renamed from: u */
    public boolean mo3122u() {
        try {
            if (!this.Wd.inTransaction()) {
                return false;
            }
            try {
                this.Wd.setTransactionSuccessful();
                this.Wd.endTransaction();
                return true;
            } catch (Exception e) {
                C0691a.m2857a(Zd[10], e);
                return false;
            }
        } catch (SQLiteException e2) {
            throw e2;
        }
    }
}
