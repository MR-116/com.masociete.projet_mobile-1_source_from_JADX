package fr.pcsoft.wdjava.p055g;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.C0490q;
import fr.pcsoft.wdjava.ui.champs.fc;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import java.util.StringTokenizer;

/* renamed from: fr.pcsoft.wdjava.g.c */
public class C0905c extends C0903a {
    /* renamed from: z */
    private static final String[] f2451z = new String[]{C0905c.m6374z(C0905c.m6375z("#>\u0007\u0019[\u0013#\u000f")), C0905c.m6374z(C0905c.m6375z("1\u0003+>")), C0905c.m6374z(C0905c.m6375z("67\u000e")), C0905c.m6374z(C0905c.m6375z(";x>&\u001f="))};

    public C0905c(String str) {
    }

    /* renamed from: f */
    private final SharedPreferences m6373f() {
        return WDAppManager.m2557a(WDProjet.getInstance().getNomAPK());
    }

    /* renamed from: z */
    private static String m6374z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 96;
                    break;
                case 1:
                    i2 = 86;
                    break;
                case 2:
                    i2 = 98;
                    break;
                case 3:
                    i2 = 122;
                    break;
                default:
                    i2 = 48;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6375z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 48);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3192a() {
        return 0;
    }

    /* renamed from: a */
    public WDEntier4 mo3193a(fc fcVar) {
        return null;
    }

    /* renamed from: a */
    public String mo3194a(C0490q c0490q) {
        StringBuffer stringBuffer = new StringBuffer("");
        if (c0490q.isFenetre()) {
            stringBuffer.append(c0490q.getName());
        } else if (c0490q.isColonne()) {
            stringBuffer.append(mo3189b(c0490q));
        } else if (c0490q.isChamp()) {
            stringBuffer.append(c0490q.getFenetreMere().getNomFenetre());
            stringBuffer.append(mo3187a("", (fc) c0490q, "."));
            stringBuffer.append(".").append(c0490q.getName());
        }
        String toLowerCase = C0808l.m4057o(stringBuffer.toString()).toLowerCase();
        c0490q.setNomNoeudPersistance(toLowerCase, mo3192a());
        return toLowerCase;
    }

    /* renamed from: a */
    public void mo3195a(fc fcVar, String str) {
        mo3196a(fcVar, f2451z[2], str);
    }

    /* renamed from: a */
    public void mo3196a(fc fcVar, String str, String str2) {
        String nomNoeudPersistance = fcVar.getNomNoeudPersistance();
        if (nomNoeudPersistance.equals("") || fcVar.getTypeSupportPersistance() != mo3192a()) {
            nomNoeudPersistance = mo3194a((C0490q) fcVar);
            fcVar.setNomNoeudPersistance(nomNoeudPersistance, mo3192a());
        }
        if (str2 == null) {
            str2 = "";
        }
        SharedPreferences f = m6373f();
        if (f != null) {
            Editor edit = f.edit();
            edit.putString(nomNoeudPersistance + mo3209d() + str, str2);
            edit.putLong(nomNoeudPersistance + mo3209d() + f2451z[1], fcVar.getQUID());
            edit.putString(nomNoeudPersistance + mo3209d() + f2451z[0], fcVar.getChecksum());
            edit.commit();
        }
    }

    /* renamed from: a */
    public void mo3197a(String str, String str2) {
        String[] b = mo3205b(str);
        SharedPreferences f = m6373f();
        if (f != null) {
            Editor edit = f.edit();
            edit.putString(b[0] + mo3209d() + b[1], str2);
            edit.commit();
        }
    }

    /* renamed from: a */
    public void mo3198a(String str, String str2, String str3, String str4, String str5) {
    }

    /* renamed from: a */
    public void mo3199a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
    }

    /* renamed from: a */
    public void mo3200a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    /* renamed from: a */
    public boolean mo3201a(String str) {
        boolean z = false;
        String[] b = mo3205b(str);
        SharedPreferences f = m6373f();
        if (f != null) {
            Editor edit = f.edit();
            String str2 = b[0] + mo3209d() + b[1];
            if (f.contains(str2)) {
                edit.remove(str2);
                z = true;
            } else {
                boolean z2 = false;
                for (String str3 : f.getAll().keySet()) {
                    if (str3.startsWith(b[0]) && str3.lastIndexOf(mo3209d()) == b[0].length()) {
                        edit.remove(str3);
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                edit.commit();
            }
        }
        return z;
    }

    /* renamed from: a */
    public WDEntier4[] mo3202a(WDFenetre wDFenetre) {
        return null;
    }

    /* renamed from: b */
    public String mo3203b(fc fcVar) {
        return mo3204b(fcVar, f2451z[2]);
    }

    /* renamed from: b */
    public String mo3204b(fc fcVar, String str) {
        String a = mo3194a((C0490q) fcVar);
        SharedPreferences f = m6373f();
        if (f == null) {
            return null;
        }
        return (f.getLong(new StringBuilder().append(a).append(mo3209d()).append(f2451z[1]).toString(), 0) == fcVar.getQUID() && f.getString(a + mo3209d() + f2451z[0], "").equals(fcVar.getChecksum())) ? f.getString(a + mo3209d() + str, null) : null;
    }

    /* renamed from: b */
    public String[] mo3205b(String str) {
        if (str == null) {
            str = "";
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str.replaceAll(f2451z[3], "."), ".");
        StringBuffer stringBuffer = new StringBuffer("");
        String str2 = "";
        while (stringTokenizer.hasMoreElements()) {
            String nextToken = stringTokenizer.nextToken();
            if (stringTokenizer.countTokens() != 0) {
                if (!stringBuffer.equals("")) {
                    stringBuffer.append("/");
                }
                stringBuffer.append(nextToken);
                nextToken = str2;
            }
            str2 = nextToken;
        }
        return new String[]{C0808l.m4057o(stringBuffer.toString()).toLowerCase(), C0808l.m4057o(str2.toString()).toLowerCase()};
    }

    /* renamed from: c */
    public String mo3206c(String str) {
        String[] b = mo3205b(str);
        SharedPreferences f = m6373f();
        return f != null ? f.getString(b[0] + mo3209d() + b[1], null) : null;
    }

    /* renamed from: c */
    public WDEntier4[] mo3207c() {
        return null;
    }

    /* renamed from: c */
    public WDEntier4[] mo3208c(C0490q c0490q) {
        return null;
    }

    /* renamed from: d */
    public String mo3209d() {
        return ".";
    }

    /* renamed from: e */
    public boolean mo3210e() {
        SharedPreferences f = m6373f();
        if (f == null) {
            return false;
        }
        Editor edit = f.edit();
        edit.clear();
        edit.commit();
        return true;
    }
}
