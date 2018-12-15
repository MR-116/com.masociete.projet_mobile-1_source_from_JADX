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

/* renamed from: fr.pcsoft.wdjava.database.hf.b.d */
public class C0839d extends C0838c {
    /* renamed from: z */
    private static final String f2245z = C0839d.m5423z(C0839d.m5424z("Hz$9/"));
    /* renamed from: i */
    protected String f2246i = null;
    /* renamed from: j */
    protected String f2247j = null;
    /* renamed from: k */
    protected String f2248k = null;

    public C0839d(String str, String str2, String str3) {
        if (str != null) {
            String[] split = str.split(f2245z);
            if (split.length > 1) {
                this.e = C0808l.m4057o(split[0].toLowerCase());
                this.b = C0808l.m4057o(split[1].toLowerCase());
                if (str2 != null) {
                    split = str2.split(f2245z);
                    if (split.length > 1) {
                        this.g = C0808l.m4057o(split[0].toLowerCase());
                        this.f = C0808l.m4057o(split[1].toLowerCase());
                        this.h = C0808l.m4057o(split[2].toLowerCase());
                        if (str3 != null) {
                            split = str3.split(f2245z);
                            if (split.length > 1) {
                                this.f2248k = C0808l.m4057o(split[0].toLowerCase());
                                this.f2246i = C0808l.m4057o(split[1].toLowerCase());
                                this.f2247j = C0808l.m4057o(split[2].toLowerCase());
                            }
                        }
                    }
                }
            }
        }
    }

    public C0839d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.e = str;
        this.b = str2;
        this.g = str3;
        this.f = str4;
        this.h = str5;
        this.f2248k = str6;
        this.f2246i = str7;
        this.f2247j = str8;
    }

    /* renamed from: m */
    private db m5422m() {
        db b = WDHF_Contexte.getInstance().m5004b(this.g);
        if (b != null) {
            return b;
        }
        b = WDHF_Contexte.getInstance().m5021h(this.g);
        return b == null ? null : b;
    }

    /* renamed from: z */
    private static String m5423z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 19;
                    break;
                case 1:
                    i2 = 38;
                    break;
                case 2:
                    i2 = 10;
                    break;
                case 3:
                    i2 = 3;
                    break;
                default:
                    i2 = 114;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5424z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 114);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public WDObjet mo2597a() {
        db dbVar = (db) mo3129h();
        if (dbVar != null) {
            eb ebVar = (eb) dbVar.mo2718a(this.b);
            if (ebVar != null) {
                db m = m5422m();
                if (m != null) {
                    eb ebVar2 = (eb) m.mo2718a(this.f);
                    if (ebVar2 != null) {
                        eb ebVar3 = (eb) m.mo2718a(this.h);
                        if (ebVar3 != null) {
                            db dbVar2 = (db) mo3133l();
                            if (dbVar2 != null) {
                                eb ebVar4 = (eb) dbVar2.mo2718a(this.f2246i);
                                if (ebVar4 != null) {
                                    eb ebVar5 = (eb) dbVar2.mo2718a(this.f2247j);
                                    if (ebVar5 != null) {
                                        WDObjet valeur;
                                        int b = m.m3669b(ebVar2);
                                        WDObjet valeur2 = ebVar.getValeur();
                                        if (m.m3659a(ebVar2, valeur2, true, true, 0) && m.m3724o()) {
                                            int b2 = dbVar2.m3669b(ebVar4);
                                            valeur = (dbVar2.m3659a(ebVar4, ebVar3.getValeur(), true, true, 0) && dbVar2.m3724o()) ? ebVar5.getValeur() : null;
                                            if (b2 >= 0) {
                                                WDHF_Manager.m5078a(b2, 0);
                                            }
                                        } else {
                                            valeur = m5400c(valeur2) ? new WDChaine() : null;
                                        }
                                        if (b >= 0) {
                                            WDHF_Manager.m5078a(b, 0);
                                        }
                                        if (valeur != null) {
                                            return valeur;
                                        }
                                    }
                                }
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
        this.f2248k = null;
        this.f2246i = null;
        this.f2247j = null;
    }

    /* renamed from: c */
    public void mo3124c(String str) {
        this.f2247j = C0808l.m4057o(str.toLowerCase());
        mo2599a(((eb) ((db) mo3133l()).mo2718a(str)) != null);
        this.d = null;
    }

    /* renamed from: e */
    public boolean mo3126e() {
        return true;
    }

    /* renamed from: f */
    public String mo3127f() {
        return this.f2247j;
    }

    /* renamed from: i */
    public C0849z mo3130i() {
        db dbVar = (db) mo3133l();
        return dbVar != null ? dbVar.mo2718a(this.f2247j) : null;
    }

    /* renamed from: k */
    protected String mo3132k() {
        StringBuffer stringBuffer = new StringBuffer(this.e);
        stringBuffer.append(".").append(this.b).append(C0607n.Gc);
        stringBuffer.append(this.g).append(".").append(this.f).append(".").append(this.h).append(C0607n.Gc);
        stringBuffer.append(this.f2248k).append(".").append(this.f2246i).append(".").append(this.f2247j);
        return stringBuffer.toString();
    }

    /* renamed from: l */
    public ab mo3133l() {
        ab b = WDHF_Contexte.getInstance().m5004b(this.f2248k);
        if (b != null) {
            return b;
        }
        b = WDHF_Contexte.getInstance().m5021h(this.f2248k);
        return b == null ? null : b;
    }
}
