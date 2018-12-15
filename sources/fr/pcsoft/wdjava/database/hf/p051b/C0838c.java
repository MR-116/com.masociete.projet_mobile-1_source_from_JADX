package fr.pcsoft.wdjava.database.hf.p051b;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.C0849z;
import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.WDHF_Manager;
import fr.pcsoft.wdjava.database.hf.ab;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;

/* renamed from: fr.pcsoft.wdjava.database.hf.b.c */
public class C0838c extends C0837b {
    /* renamed from: z */
    private static final String f2241z = C0838c.m5412z(C0838c.m5413z("f\u0002-h-"));
    /* renamed from: f */
    protected String f2242f = null;
    /* renamed from: g */
    protected String f2243g = null;
    /* renamed from: h */
    protected String f2244h = null;

    public C0838c(String str, String str2) {
        if (str != null) {
            String[] split = str.split(f2241z);
            if (split.length > 1) {
                this.e = C0808l.m4057o(split[0].toLowerCase());
                this.b = C0808l.m4057o(split[1].toLowerCase());
                if (str2 != null) {
                    split = str2.split(f2241z);
                    if (split.length > 1) {
                        this.f2243g = C0808l.m4057o(split[0].toLowerCase());
                        this.f2242f = C0808l.m4057o(split[1].toLowerCase());
                        this.f2244h = C0808l.m4057o(split[2].toLowerCase());
                    }
                }
            }
        }
    }

    public C0838c(String str, String str2, String str3, String str4, String str5) {
        this.e = str;
        this.b = str2;
        this.f2243g = str3;
        this.f2242f = str4;
        this.f2244h = str5;
    }

    /* renamed from: z */
    private static String m5412z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 61;
                    break;
                case 1:
                    i2 = 94;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 82;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5413z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 112);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public WDObjet mo2597a() {
        db dbVar = (db) mo3129h();
        if (dbVar != null) {
            eb ebVar = (eb) dbVar.mo2718a(this.b);
            if (ebVar != null) {
                db dbVar2 = (db) mo3133l();
                if (dbVar2 != null) {
                    eb ebVar2 = (eb) dbVar2.mo2718a(this.f2242f);
                    if (ebVar2 != null) {
                        eb ebVar3 = (eb) dbVar2.mo2718a(this.f2244h);
                        if (ebVar3 != null) {
                            int b = dbVar2.m3669b(ebVar2);
                            WDObjet valeur = ebVar.getValeur();
                            WDObjet valeur2 = (dbVar2.m3659a(ebVar2, valeur, true, true, 0) && dbVar2.m3724o()) ? ebVar3.getValeur() : m5400c(valeur) ? new WDChaine() : null;
                            if (b >= 0) {
                                WDHF_Manager.m5078a(b, 0);
                            }
                            if (valeur2 != null) {
                                return valeur2;
                            }
                        }
                    }
                }
            }
        }
        return a;
    }

    /* renamed from: b */
    public void mo2601b() {
        super.mo2601b();
        this.f2243g = null;
        this.f2242f = null;
        this.f2244h = null;
    }

    /* renamed from: c */
    public void mo3124c(String str) {
        this.f2244h = C0808l.m4057o(str.toLowerCase());
        mo2599a(((eb) ((db) mo3133l()).mo2718a(str)) != null);
        this.d = null;
    }

    /* renamed from: e */
    public boolean mo3126e() {
        return true;
    }

    /* renamed from: f */
    public String mo3127f() {
        return this.f2244h;
    }

    /* renamed from: i */
    public C0849z mo3130i() {
        db dbVar = (db) mo3133l();
        return dbVar != null ? dbVar.mo2718a(this.f2244h) : null;
    }

    /* renamed from: k */
    protected String mo3132k() {
        StringBuffer stringBuffer = new StringBuffer(this.e);
        stringBuffer.append(".").append(this.b).append(C0607n.Gc);
        stringBuffer.append(this.f2243g).append(".").append(this.f2242f).append(".").append(this.f2244h);
        return stringBuffer.toString();
    }

    /* renamed from: l */
    public ab mo3133l() {
        ab b = WDHF_Contexte.getInstance().m5004b(this.f2243g);
        if (b != null) {
            return b;
        }
        b = WDHF_Contexte.getInstance().m5021h(this.f2243g);
        return b == null ? null : b;
    }
}
