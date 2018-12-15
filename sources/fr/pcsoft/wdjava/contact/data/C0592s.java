package fr.pcsoft.wdjava.contact.data;

import android.database.Cursor;
import fr.pcsoft.wdjava.contact.WDContact;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.parcours.p039a.C0567c;
import fr.pcsoft.wdjava.core.poo.p038a.C0584d;

/* renamed from: fr.pcsoft.wdjava.contact.data.s */
public class C0592s extends C0584d<WDContact, WDContactNote> {
    /* renamed from: z */
    private static final String[] f1375z = new String[]{C0592s.m2129z(C0592s.m2130z("}\u0010q\n5e\u001agK=oPvQ&x\u0011g\n=\u001bx\u000b:d\np")), C0592s.m2129z(C0592s.m2130z("T\u0017q")), C0592s.m2129z(C0592s.m2130z("o\u001faEe"))};

    public C0592s(WDContact wDContact) {
        super(wDContact);
    }

    /* renamed from: z */
    private static String m2129z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 11;
                    break;
                case 1:
                    i2 = 126;
                    break;
                case 2:
                    i2 = 21;
                    break;
                case 3:
                    i2 = 36;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2130z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 84);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected Cursor m2131a(WDContact wDContact) {
        return WDContact.m1807a(wDContact, f1375z[0], f1375z[1], f1375z[2]);
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return new WDContactNote();
    }

    /* renamed from: a */
    public IWDParcours mo2471a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        return new C0567c(this, wDObjet, wDObjet2, wDObjet3, z, z2);
    }

    /* renamed from: a */
    public void mo2474a(WDObjet wDObjet, WDObjet wDObjet2) {
        WDObjet wDContactNote = new WDContactNote();
        wDContactNote.setValeur(wDObjet);
        super.mo2474a(wDContactNote, wDObjet2);
    }

    /* renamed from: c */
    protected WDContactNote m2137c(Cursor cursor) {
        return new WDContactNote(cursor);
    }

    /* renamed from: d */
    public int mo2487d() {
        return C0607n.Jj;
    }

    /* renamed from: g */
    public Class<WDContactNote> mo2482g() {
        return WDContactNote.class;
    }
}
