package fr.pcsoft.wdjava.contact.data;

import android.database.Cursor;
import fr.pcsoft.wdjava.contact.WDContact;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.poo.p038a.C0584d;
import fr.pcsoft.wdjava.geo.C0909c;

/* renamed from: fr.pcsoft.wdjava.contact.data.m */
public class C0586m extends C0584d<WDContact, WDContactAdressePostale> {
    /* renamed from: z */
    private static final String[] f1369z = new String[]{C0586m.m2074z(C0586m.m2075z("^P>\n\u001a")), C0586m.m2074z(C0586m.m2075z("^P>\n\u0019")), C0586m.m2074z(C0586m.m2075z("^P>\n\u001c")), C0586m.m2074z(C0586m.m2075z("^P>\n\u0016")), C0586m.m2074z(C0586m.m2075z("^P>\n\u001f\n")), C0586m.m2074z(C0586m.m2075z("^P>\n\u0017")), C0586m.m2074z(C0586m.m2075z("eX.")), C0586m.m2074z(C0586m.m2075z("L_.EOTU8\u0004G^\u001f)\u001e\\I^8EGNT'D^UB>\nB\u0017P.\u000f\\_B94X\b")), C0586m.m2074z(C0586m.m2075z("^P>\n\u001d")), C0586m.m2074z(C0586m.m2075z("nH:\u000e\u000e{U8\u000e]ITj\u0005AT\u0011>\u0019AOG£E")), C0586m.m2074z(C0586m.m2075z("\\Cd\u001bMI^,\u001f\u0000MU \nX[\u001f-\u000eA\u0014f\u000e*JHT9\u0018K"))};

    public C0586m(WDContact wDContact) {
        super(wDContact);
    }

    /* renamed from: z */
    private static String m2074z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 58;
                    break;
                case 1:
                    i2 = 49;
                    break;
                case 2:
                    i2 = 74;
                    break;
                case 3:
                    i2 = 107;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2075z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 46);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected Cursor m2076a(WDContact wDContact) {
        return WDContact.m1807a(wDContact, f1369z[7], f1369z[6], f1369z[8], f1369z[2], f1369z[1], f1369z[0], f1369z[4], f1369z[3], f1369z[5]);
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return new WDContactAdressePostale();
    }

    /* renamed from: a */
    public void mo2474a(WDObjet wDObjet, WDObjet wDObjet2) {
        C0909c c0909c = (C0909c) wDObjet.checkType(C0909c.class);
        if (c0909c != null) {
            WDObjet wDObjet3 = (WDObjet) c0909c;
            wDObjet = new WDContactAdressePostale();
            wDObjet.setProp(EWDPropriete.PROP_TYPE, wDObjet3.getProp(EWDPropriete.PROP_TYPE));
            wDObjet.setProp(EWDPropriete.PROP_ETIQUETTE, wDObjet3.getProp(EWDPropriete.PROP_ETIQUETTE));
            wDObjet.setProp(EWDPropriete.PROP_VILLE, wDObjet3.getProp(EWDPropriete.PROP_VILLE));
            wDObjet.setProp(EWDPropriete.PROP_PAYS, wDObjet3.getProp(EWDPropriete.PROP_PAYS));
            wDObjet.setProp(EWDPropriete.PROP_REGION, wDObjet3.getProp(EWDPropriete.PROP_REGION));
            wDObjet.setProp(EWDPropriete.PROP_CODEPOSTAL, wDObjet3.getProp(EWDPropriete.PROP_CODEPOSTAL));
            wDObjet.setProp(EWDPropriete.PROP_RUE, wDObjet3.getProp(EWDPropriete.PROP_RUE));
        }
        super.mo2474a(wDObjet, wDObjet2);
    }

    /* renamed from: c */
    protected WDContactAdressePostale m2081c(Cursor cursor) {
        return new WDContactAdressePostale(cursor);
    }

    /* renamed from: d */
    public int mo2487d() {
        return C0607n.sc;
    }

    /* renamed from: g */
    public Class<WDContactAdressePostale> mo2482g() {
        return WDContactAdressePostale.class;
    }

    public WDObjet get(int i) {
        WDObjet wDObjet = super.get(i);
        WDContactAdressePostale wDContactAdressePostale = (WDContactAdressePostale) wDObjet.checkType(WDContactAdressePostale.class);
        if (wDContactAdressePostale != null) {
            try {
                WDObjet wDObjet2 = (WDObjet) Class.forName(f1369z[10]).newInstance();
                wDObjet2.setProp(EWDPropriete.PROP_TYPE, wDContactAdressePostale.getProp(EWDPropriete.PROP_TYPE));
                wDObjet2.setProp(EWDPropriete.PROP_ETIQUETTE, wDContactAdressePostale.getProp(EWDPropriete.PROP_ETIQUETTE));
                wDObjet2.setProp(EWDPropriete.PROP_VILLE, wDContactAdressePostale.getProp(EWDPropriete.PROP_VILLE));
                wDObjet2.setProp(EWDPropriete.PROP_PAYS, wDContactAdressePostale.getProp(EWDPropriete.PROP_PAYS));
                wDObjet2.setProp(EWDPropriete.PROP_REGION, wDContactAdressePostale.getProp(EWDPropriete.PROP_REGION));
                wDObjet2.setProp(EWDPropriete.PROP_CODEPOSTAL, wDContactAdressePostale.getProp(EWDPropriete.PROP_CODEPOSTAL));
                wDObjet2.setProp(EWDPropriete.PROP_RUE, wDContactAdressePostale.getProp(EWDPropriete.PROP_RUE));
                return wDObjet2;
            } catch (Exception e) {
                C0691a.m2857a(f1369z[9], e);
            }
        }
        return wDObjet;
    }
}
