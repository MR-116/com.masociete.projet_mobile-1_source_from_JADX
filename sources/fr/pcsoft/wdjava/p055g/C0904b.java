package fr.pcsoft.wdjava.p055g;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.p058k.C0930a;
import fr.pcsoft.wdjava.ui.C0490q;
import fr.pcsoft.wdjava.ui.champs.fc;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.gc;
import java.io.File;

/* renamed from: fr.pcsoft.wdjava.g.b */
public class C0904b extends C0903a {
    /* renamed from: A */
    private static final String[] f2447A;
    /* renamed from: x */
    private static final String f2448x = C0904b.m6352z(C0904b.m6353z("lex,4g"));
    /* renamed from: z */
    private static final String f2449z = C0904b.m6352z(C0904b.m6353z("|@Y*\u0010]vh13NGÝ\u001a\u0007NvS\u000b*[V\r\u0010"));
    /* renamed from: y */
    private String f2450y = "";

    static {
        r0 = new String[20];
        r0[0] = C0904b.m6352z(C0904b.m6353z("bGS\u0007\u0016NhQ\b\u001cHAV\t\u0010d\\A\u000b\u0007_\\E\u000b"));
        r0[1] = C0904b.m6352z(C0904b.m6353z("gHE\t\u0010^[~\u0000\u001c_@V\u0002\u0010"));
        r0[2] = C0904b.m6352z(C0904b.m6353z("bGS\u0007\u0016NjE\u000b\u0014_@X\u0000"));
        r0[3] = C0904b.m6352z(C0904b.m6353z("}@D\u0007\u0017GLx\u001b\u0003N[C\u001b\u0007N"));
        r0[4] = C0904b.m6352z(C0904b.m6353z("gHE\t\u0010^[v\b\u0013BJ_\u000f\u0012NfB\u0018\u0010Y]B\u001c\u0010"));
        r0[5] = C0904b.m6352z(C0904b.m6353z("hAR\r\u001eX\\Z"));
        r0[6] = C0904b.m6352z(C0904b.m6353z("gHE\t\u0010^["));
        r0[7] = C0904b.m6352z(C0904b.m6353z("}H["));
        r0[8] = C0904b.m6352z(C0904b.m6353z("p\u0007k2Zv"));
        r0[9] = C0904b.m6352z(C0904b.m6353z("fHO\u0007\u0018BZR\u000b:^_R\u001c\u0001^[R"));
        r0[10] = C0904b.m6352z(C0904b.m6353z("H^\u0002\u0019NfB\u0018\u0010Y]B\u001c\u0010"));
        r0[11] = C0904b.m6352z(C0904b.m6353z("{FD\u0007\u0001BFY!\u0000]LE\u001a\u0000YL"));
        r0[12] = C0904b.m6352z(C0904b.m6353z("xHB\u0018\u0010Y}V\u0007\u0019GLx\u001b\u0003N[C\u001b\u0007N"));
        r0[13] = C0904b.m6352z(C0904b.m6353z("gH^\u001d\u0006NjV\u001c\u0014H]t\u0001\u001b_[X\u0002\u0010"));
        r0[14] = C0904b.m6352z(C0904b.m6353z("jZT\u000b\u001bXLB\u001c="));
        r0[15] = C0904b.m6352z(C0904b.m6353z("wuE"));
        r0[16] = C0904b.m6352z(C0904b.m6353z("wuY"));
        r0[17] = C0904b.m6352z(C0904b.m6353z("z|~*"));
        r0[18] = C0904b.m6352z(C0904b.m6353z("\u0003uk\u001c\\"));
        r0[19] = C0904b.m6352z(C0904b.m6353z("\u0003uk\u0000\\"));
        f2447A = r0;
    }

    protected C0904b(String str) {
        this.f2450y = C0897o.m6281f(str);
    }

    /* renamed from: z */
    private static String m6352z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 43;
                    break;
                case 1:
                    i2 = 41;
                    break;
                case 2:
                    i2 = 55;
                    break;
                case 3:
                    i2 = 110;
                    break;
                default:
                    i2 = 117;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6353z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 117);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3192a() {
        return 3;
    }

    /* renamed from: a */
    public WDEntier4 mo3193a(fc fcVar) {
        String a = mo3194a((C0490q) fcVar);
        if (!C0930a.m6749a(a, f2447A[5], "", this.f2450y).equals(fcVar.getChecksum())) {
            return null;
        }
        WDChaine wDChaine = new WDChaine(C0930a.m6749a(a, f2447A[6], null, this.f2450y));
        return wDChaine != null ? new WDEntier4(wDChaine.getString()) : null;
    }

    /* renamed from: a */
    public String mo3194a(C0490q c0490q) {
        StringBuffer stringBuffer = new StringBuffer("");
        if (c0490q.isFenetre()) {
            stringBuffer.append(c0490q.getName());
        } else if (c0490q.isColonne()) {
            stringBuffer.append(mo3194a((C0490q) c0490q.getPere()));
            stringBuffer.append(".").append(c0490q.getName());
        } else if (c0490q.isChamp()) {
            stringBuffer.append(c0490q.getFenetreMere().getNomFenetre());
            stringBuffer.append(mo3187a("", (gc) c0490q, "."));
            stringBuffer.append(".").append(c0490q.getName());
        }
        String o = C0808l.m4057o(stringBuffer.toString());
        c0490q.setNomNoeudPersistance(o, mo3192a());
        return o;
    }

    /* renamed from: a */
    public void mo3195a(fc fcVar, String str) {
        mo3196a(fcVar, f2447A[7], str);
    }

    /* renamed from: a */
    public void mo3196a(fc fcVar, String str, String str2) {
        String nomNoeudPersistance = fcVar.getNomNoeudPersistance();
        if (nomNoeudPersistance.equals("") || fcVar.getTypeSupportPersistance() != mo3192a()) {
            nomNoeudPersistance = mo3194a((C0490q) fcVar);
            fcVar.setNomNoeudPersistance(nomNoeudPersistance, mo3192a());
        }
        C0930a.m6750a(nomNoeudPersistance, new WDChaine(str), new WDChaine(str2.replaceAll("\n", f2447A[16]).replaceAll("\r", f2447A[15])), this.f2450y);
        C0930a.m6750a(nomNoeudPersistance, new WDChaine(f2447A[17]), new WDChaine("" + fcVar.getQUID()), this.f2450y);
        C0930a.m6750a(nomNoeudPersistance, new WDChaine(f2447A[5]), new WDChaine(fcVar.getChecksum()), this.f2450y);
    }

    /* renamed from: a */
    public void mo3197a(String str, String str2) {
        String[] b = mo3205b(str);
        C0930a.m6750a(b[0], new WDChaine(b[1]), new WDChaine(str2.replaceAll("\n", f2447A[16]).replaceAll("\r", f2447A[15])), this.f2450y);
    }

    /* renamed from: a */
    public void mo3198a(String str, String str2, String str3, String str4, String str5) {
        C0930a.m6750a(str, new WDChaine(f2447A[10]), new WDChaine(str2), this.f2450y);
        C0930a.m6750a(str, new WDChaine(f2447A[10]), new WDChaine(str2), this.f2450y);
        C0930a.m6750a(str, new WDChaine(f2447A[11]), new WDChaine(str3), this.f2450y);
        C0930a.m6750a(str, new WDChaine(f2447A[9]), new WDChaine(str4), this.f2450y);
        C0930a.m6750a(str, new WDChaine(f2447A[5]), new WDChaine(str5), this.f2450y);
    }

    /* renamed from: a */
    public void mo3199a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        if (z) {
            C0930a.m6750a(str, new WDChaine(f2447A[2]), new WDChaine(str3), this.f2450y);
            C0930a.m6750a(str, new WDChaine(f2447A[0]), new WDChaine(str4), this.f2450y);
            C0930a.m6750a(str, new WDChaine(f2447A[1]), new WDChaine(str5), this.f2450y);
            C0930a.m6750a(str, new WDChaine(f2447A[4]), new WDChaine(str6), this.f2450y);
            C0930a.m6750a(str, new WDChaine(f2447A[3]), new WDChaine(str7), this.f2450y);
            return;
        }
        C0930a.m6750a(str, new WDChaine(f2447A[6]), new WDChaine(str2), this.f2450y);
        C0930a.m6750a(str, new WDChaine(f2447A[5]), new WDChaine(str8), this.f2450y);
    }

    /* renamed from: a */
    public void mo3200a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            C0930a.m6750a(f2449z, new WDChaine(f2447A[10]), new WDChaine(str), this.f2450y);
            C0930a.m6750a(f2449z, new WDChaine(f2447A[11]), new WDChaine(str2), this.f2450y);
            C0930a.m6750a(f2449z, new WDChaine(f2447A[9]), new WDChaine(z), this.f2450y);
        }
        C0930a.m6750a(f2449z, new WDChaine(f2447A[13]), new WDChaine(z2), this.f2450y);
        C0930a.m6750a(f2449z, new WDChaine(f2447A[14]), new WDChaine(z3), this.f2450y);
        C0930a.m6750a(f2449z, new WDChaine(f2447A[12]), new WDChaine(z4), this.f2450y);
    }

    /* renamed from: a */
    public boolean mo3201a(String str) {
        String[] b = mo3205b(str);
        boolean a = C0930a.m6750a(b[0] + "." + b[1], WDObjet.NULL, WDObjet.NULL, this.f2450y);
        return !a ? C0930a.m6750a(b[0], new WDChaine(b[1]), WDObjet.NULL, this.f2450y) : a;
    }

    /* renamed from: a */
    public WDEntier4[] mo3202a(WDFenetre wDFenetre) {
        String a = mo3194a((C0490q) wDFenetre);
        WDEntier4[] wDEntier4Arr = new WDEntier4[5];
        if (!C0930a.m6749a(a, f2447A[5], "", this.f2450y).equals(wDFenetre.getChecksum())) {
            return null;
        }
        String[] split;
        String a2 = C0930a.m6749a(a, f2447A[10], null, this.f2450y);
        if (a2 != null) {
            split = a2.split(",");
            if (split.length >= 2) {
                wDEntier4Arr[0] = new WDEntier4(split[0]);
                wDEntier4Arr[1] = new WDEntier4(split[1]);
            }
        }
        a2 = C0930a.m6749a(a, f2447A[11], null, this.f2450y);
        if (a2 != null) {
            split = a2.split(",");
            if (split.length >= 2) {
                wDEntier4Arr[2] = new WDEntier4(split[0]);
                wDEntier4Arr[3] = new WDEntier4(split[1]);
            }
        }
        String a3 = C0930a.m6749a(a, f2447A[9], null, this.f2450y);
        if (a3 != null) {
            wDEntier4Arr[4] = new WDEntier4(a3);
        }
        return wDEntier4Arr;
    }

    /* renamed from: b */
    public String mo3203b(fc fcVar) {
        return mo3204b(fcVar, f2447A[7]);
    }

    /* renamed from: b */
    public String mo3204b(fc fcVar, String str) {
        String a = mo3194a((C0490q) fcVar);
        String a2 = C0930a.m6749a(a, f2447A[17], "", this.f2450y);
        String a3 = C0930a.m6749a(a, f2447A[5], "", this.f2450y);
        if (!a2.equals("" + fcVar.getQUID()) || !a3.equals(fcVar.getChecksum())) {
            return null;
        }
        a = C0930a.m6749a(a, str, null, this.f2450y);
        return a != null ? a.replaceAll(f2447A[19], "\n").replaceAll(f2447A[18], "\r") : null;
    }

    /* renamed from: b */
    public String[] mo3205b(String str) {
        if (str == null) {
            str = "";
        }
        String replaceAll = str.replaceAll(f2447A[8], ".");
        int lastIndexOf = replaceAll.lastIndexOf(".");
        if (lastIndexOf > -1) {
            String substring = replaceAll.substring(lastIndexOf + 1, replaceAll.length());
            replaceAll = replaceAll.substring(0, lastIndexOf);
            return new String[]{replaceAll, substring};
        }
        return new String[]{f2448x, replaceAll};
    }

    /* renamed from: c */
    public String mo3206c(String str) {
        String[] b = mo3205b(str);
        String a = C0930a.m6749a(b[0], b[1], null, this.f2450y);
        return a != null ? a.replaceAll(f2447A[19], "\n").replaceAll(f2447A[18], "\r") : null;
    }

    /* renamed from: c */
    public WDEntier4[] mo3207c() {
        String[] split;
        WDEntier4[] wDEntier4Arr = new WDEntier4[8];
        String a = C0930a.m6749a(f2449z, f2447A[10], null, this.f2450y);
        if (a != null) {
            split = a.split(",");
            if (split.length >= 2) {
                wDEntier4Arr[0] = new WDEntier4(split[0]);
                wDEntier4Arr[1] = new WDEntier4(split[1]);
            }
        }
        a = C0930a.m6749a(f2449z, f2447A[11], null, this.f2450y);
        if (a != null) {
            split = a.split(",");
            if (split.length >= 2) {
                wDEntier4Arr[2] = new WDEntier4(split[0]);
                wDEntier4Arr[3] = new WDEntier4(split[1]);
            }
        }
        a = C0930a.m6749a(f2449z, f2447A[9], null, this.f2450y);
        if (a != null) {
            wDEntier4Arr[4] = new WDEntier4(a);
        }
        a = C0930a.m6749a(f2449z, f2447A[13], null, this.f2450y);
        if (a != null) {
            wDEntier4Arr[5] = new WDEntier4(a);
        }
        a = C0930a.m6749a(f2449z, f2447A[14], null, this.f2450y);
        if (a != null) {
            wDEntier4Arr[6] = new WDEntier4(a);
        }
        a = C0930a.m6749a(f2449z, f2447A[12], null, this.f2450y);
        if (a != null) {
            wDEntier4Arr[7] = new WDEntier4(a);
        }
        return wDEntier4Arr;
    }

    /* renamed from: c */
    public WDEntier4[] mo3208c(C0490q c0490q) {
        String a = mo3194a(c0490q);
        WDEntier4[] wDEntier4Arr = new WDEntier4[5];
        String a2 = C0930a.m6749a(a, f2447A[2], null, this.f2450y);
        if (a2 != null) {
            wDEntier4Arr[0] = new WDEntier4(a2);
        }
        a2 = C0930a.m6749a(a, f2447A[0], null, this.f2450y);
        if (a2 != null) {
            wDEntier4Arr[1] = new WDEntier4(a2);
        }
        a2 = C0930a.m6749a(a, f2447A[1], null, this.f2450y);
        if (a2 != null) {
            wDEntier4Arr[2] = new WDEntier4(a2);
        }
        a2 = C0930a.m6749a(a, f2447A[4], null, this.f2450y);
        if (a2 != null) {
            wDEntier4Arr[3] = new WDEntier4(a2);
        }
        a = C0930a.m6749a(a, f2447A[3], null, this.f2450y);
        if (a != null) {
            wDEntier4Arr[4] = new WDEntier4(a);
        }
        return wDEntier4Arr;
    }

    /* renamed from: d */
    public String mo3209d() {
        return ".";
    }

    /* renamed from: e */
    public boolean mo3210e() {
        File file = new File(this.f2450y);
        return file.exists() ? file.delete() : false;
    }
}
