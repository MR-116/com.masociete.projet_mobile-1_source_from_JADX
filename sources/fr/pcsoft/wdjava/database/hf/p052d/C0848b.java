package fr.pcsoft.wdjava.database.hf.p052d;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.WDHF_Connexion;
import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: fr.pcsoft.wdjava.database.hf.d.b */
public class C0848b extends DefaultHandler implements C0542t {
    private static final String Ce = C0848b.m5782z(C0848b.m5783z("\u0016SH\u0002\u001d\rUI\u0002"));
    private static final String De = C0848b.m5782z(C0848b.m5783z("\u0011^"));
    private static final String Ee = C0848b.m5782z(C0848b.m5783z("\u0014RG\u0000\u0001\u0006Y"));
    private static final String Fe = C0848b.m5782z(C0848b.m5783z("\u001bij "));
    private static final String Ge = C0848b.m5782z(C0848b.m5783z("\u001crb%;0"));
    private static final String He = C0848b.m5782z(C0848b.m5783z("\u001cOIa`m)?ai"));
    private static final String Rd = C0848b.m5782z(C0848b.m5783z("\u0007yv)*!so>=\u0011y`--!"));
    private static final String Sd = C0848b.m5782z(C0848b.m5783z("\u0014~t).<}r%7;"));
    private static final String Ud = C0848b.m5782z(C0848b.m5783z("\u0001UK\t\u000b\u0001]K\u001c"));
    private static final String Wd = C0848b.m5782z(C0848b.m5783z("\u0006SS\u001e\u001b\u0010"));
    private static final String Xd = C0848b.m5782z(C0848b.m5783z("\u0001EV\t"));
    private static final String Yd = C0848b.m5782z(C0848b.m5783z("\u0007ID\u001e\u0011\u0004IC"));
    private static final String Zd = C0848b.m5782z(C0848b.m5783z("\u0006YH\u001f\u0007\u0005]T\u000f\u0017\u0000NU"));
    private static final String ae = C0848b.m5782z(C0848b.m5783z("\u0000OC\u001e"));
    private static final String ce = C0848b.m5782z(C0848b.m5783z("\u0001ev)"));
    private static final String de = C0848b.m5782z(C0848b.m5783z("\u0016]J\u000f\r\u0019YC"));
    private static final String ee = C0848b.m5782z(C0848b.m5783z("\u0013UE\u0004\u0011\u0010N"));
    private static final String fe = C0848b.m5782z(C0848b.m5783z("\u0018XV"));
    private static final String he = C0848b.m5782z(C0848b.m5783z("\u0013ue\u0002-9pU9(%st8="));
    private static final String ie = C0848b.m5782z(C0848b.m5783z("\u001bsk\u001c0,oo=-0"));
    private static final String me = C0848b.m5782z(C0848b.m5783z("\u0001EV\t\u0007\u0016PC"));
    private static final String oe = C0848b.m5782z(C0848b.m5783z("\u0003}j)-'"));
    private static final String re = C0848b.m5782z(C0848b.m5783z("\u0001]O\u0000\u0014\u0010"));
    private static final String se = C0848b.m5782z(C0848b.m5783z("\u001cRB\u0005\u001b\u0010NS\u000e\n\u001cMS\t"));
    private static final String te = C0848b.m5782z(C0848b.m5783z("\u0007ID\u001e\u0011\u0004IC\u0013\u0016\u001aQ"));
    private static final String ue = C0848b.m5782z(C0848b.m5783z("\u001bsk"));
    private static final String we = C0848b.m5782z(C0848b.m5783z("\u0016SK\u001c\u0017\u0006YC"));
    private static final String xe = C0848b.m5782z(C0848b.m5783z("\u0016sh\"=-ui\""));
    private static final String ye = C0848b.m5782z(C0848b.m5783z("\u0016SK\u001c\u0017\u0006]H\u0018\u001d"));
    private static final String ze = C0848b.m5782z(C0848b.m5783z("\u0003yt?1:rU8* r9*0"));
    private boolean Ae = false;
    private WDHF_Contexte Be = null;
    private eb Td = null;
    private String Vd = "";
    private boolean be = false;
    private db ge = null;
    private boolean je = false;
    private String ke = "";
    private int le = 1;
    private WDHF_Connexion ne = null;
    private boolean pe = false;
    private boolean qe = false;
    private boolean ve = false;

    public C0848b(WDHF_Contexte wDHF_Contexte) {
        this.Be = wDHF_Contexte;
    }

    /* renamed from: z */
    private static String m5782z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 85;
                    break;
                case 1:
                    i2 = 28;
                    break;
                case 2:
                    i2 = 6;
                    break;
                case 3:
                    i2 = 76;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5783z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 88);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void m5784a() {
        this.ke = null;
        this.ne = null;
        this.ge = null;
        this.Td = null;
        this.Vd = null;
        this.Be = null;
    }

    public void characters(char[] cArr, int i, int i2) throws SAXException {
        boolean z = true;
        String trim = new String(cArr, i, i2).trim();
        try {
            if (!trim.equals("")) {
                try {
                    if (!this.be) {
                        return;
                    }
                    if (this.pe) {
                        try {
                            if (this.ne != null) {
                                try {
                                    if (this.ke.equals(Wd)) {
                                        this.ne.m4955d(trim);
                                        return;
                                    }
                                    try {
                                        if (this.ke.equals(ae)) {
                                            this.ne.m4957e(trim);
                                        } else if (this.ke.equals(fe)) {
                                            if (this.le >= 2) {
                                                trim = C0725i.m3061c(C0808l.m4039b(C0725i.m3039a(trim, He)));
                                            }
                                            this.ne.m4946a(trim);
                                        } else {
                                            try {
                                                if (this.ke.equals(De)) {
                                                    this.ne.m4952c(trim);
                                                }
                                            } catch (SAXException e) {
                                                throw e;
                                            }
                                        }
                                    } catch (SAXException e2) {
                                        throw e2;
                                    }
                                } catch (SAXException e22) {
                                    throw e22;
                                }
                            }
                        } catch (SAXException e222) {
                            throw e222;
                        }
                    } else {
                        try {
                            if (!this.Ae) {
                                return;
                            }
                            if (this.ve) {
                                try {
                                    if (this.qe) {
                                        try {
                                            if (this.je) {
                                                try {
                                                    if (this.ke == Zd) {
                                                        try {
                                                            this.Td.m5827a(this.Vd, !Boolean.getBoolean(trim));
                                                            this.ke = "";
                                                            return;
                                                        } catch (SAXException e2222) {
                                                            throw e2222;
                                                        }
                                                    }
                                                    return;
                                                } catch (SAXException e22222) {
                                                    throw e22222;
                                                }
                                            }
                                        } catch (SAXException e222222) {
                                            throw e222222;
                                        }
                                    }
                                    try {
                                        if (this.ke.equals(Xd)) {
                                            this.Td.m5850g(Integer.parseInt(trim));
                                            return;
                                        }
                                        try {
                                            if (this.ke.equals(me)) {
                                                this.Td.m5820a(Integer.parseInt(trim));
                                                return;
                                            }
                                            try {
                                                if (this.ke.equals(Zd)) {
                                                    eb ebVar = this.Td;
                                                    if (Boolean.getBoolean(trim)) {
                                                        z = false;
                                                    }
                                                    ebVar.m5837b(z);
                                                    return;
                                                }
                                                try {
                                                    if (this.ke.equals(re)) {
                                                        this.Td.m5846e(Integer.parseInt(trim));
                                                    }
                                                } catch (SAXException e2222222) {
                                                    throw e2222222;
                                                }
                                            } catch (SAXException e22222222) {
                                                throw e22222222;
                                            } catch (SAXException e222222222) {
                                                throw e222222222;
                                            }
                                        } catch (SAXException e2222222222) {
                                            throw e2222222222;
                                        }
                                    } catch (SAXException e22222222222) {
                                        throw e22222222222;
                                    }
                                } catch (SAXException e222222222222) {
                                    throw e222222222222;
                                }
                            }
                        } catch (SAXException e2222222222222) {
                            throw e2222222222222;
                        } catch (SAXException e22222222222222) {
                            throw e22222222222222;
                        }
                    }
                } catch (SAXException e222222222222222) {
                    throw e222222222222222;
                } catch (SAXException e2222222222222222) {
                    throw e2222222222222222;
                }
            }
        } catch (SAXException e22222222222222222) {
            throw e22222222222222222;
        }
    }

    public void endElement(String str, String str2, String str3) throws SAXException {
        String str4 = "";
        try {
            if (str2.equals(Ee)) {
                this.be = false;
                return;
            }
            try {
                if (str2.equals(Ce)) {
                    this.pe = false;
                    if (this.ne != null) {
                        this.Be.m4996a(this.ne);
                        this.ne = null;
                        return;
                    }
                    return;
                }
                try {
                    if (str2.equals(ee)) {
                        this.Ae = false;
                        if (this.ge != null) {
                            this.Be.m4998a(this.ge);
                            this.ge = null;
                            return;
                        }
                        return;
                    }
                    try {
                        if (str2.equals(Yd)) {
                            this.ve = false;
                            if (this.ge != null) {
                                this.ge.mo2750h(this.Td);
                            }
                            this.Td = null;
                            return;
                        }
                        try {
                            if (str2.equals(we)) {
                                this.qe = false;
                                return;
                            }
                            try {
                                if (str2.equals(ye)) {
                                    this.je = false;
                                    this.Vd = "";
                                }
                            } catch (SAXException e) {
                                throw e;
                            }
                        } catch (SAXException e2) {
                            throw e2;
                        }
                    } catch (SAXException e22) {
                        throw e22;
                    } catch (SAXException e222) {
                        throw e222;
                    }
                } catch (SAXException e2222) {
                    throw e2222;
                } catch (SAXException e22222) {
                    throw e22222;
                }
            } catch (SAXException e222222) {
                throw e222222;
            } catch (SAXException e2222222) {
                throw e2222222;
            }
        } catch (SAXException e22222222) {
            throw e22222222;
        }
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        String str4 = "";
        try {
            if (this.be) {
                if (!this.pe) {
                    try {
                        if (!this.ve) {
                            try {
                                if (str2.equals(Ce)) {
                                    if (this.ne == null) {
                                        this.ne = new WDHF_Connexion(attributes.getValue(ue), Integer.parseInt(attributes.getValue(ce)));
                                    }
                                    this.pe = true;
                                    return;
                                }
                                try {
                                    if (str2.equals(ee)) {
                                        this.Ae = true;
                                        if (this.ge == null) {
                                            try {
                                                this.ge = new db(attributes.getValue(ue));
                                                if (attributes.getValue(xe) == null) {
                                                    this.ge.m3728q("");
                                                } else {
                                                    this.ge.m3728q(attributes.getValue(xe));
                                                }
                                                try {
                                                    this.ge.m3694d(attributes.getValue(Sd));
                                                    if (attributes.getValue(he) != null) {
                                                        this.ge.m3712h(attributes.getValue(he).equals("1"));
                                                    }
                                                    try {
                                                        if (attributes.getValue(ie) != null) {
                                                            this.ge.m3718k(attributes.getValue(ie));
                                                            return;
                                                        }
                                                        return;
                                                    } catch (SAXException e) {
                                                        throw e;
                                                    }
                                                } catch (SAXException e2) {
                                                    throw e2;
                                                }
                                            } catch (SAXException e22) {
                                                throw e22;
                                            }
                                        }
                                        return;
                                    }
                                    try {
                                        if (str2.equals(Yd)) {
                                            this.ve = true;
                                            if (this.Td == null) {
                                                this.Td = new eb(attributes.getValue(ue));
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } catch (SAXException e222) {
                                        throw e222;
                                    } catch (SAXException e2222) {
                                        throw e2222;
                                    }
                                } catch (SAXException e22222) {
                                    throw e22222;
                                } catch (SAXException e222222) {
                                    throw e222222;
                                }
                            } catch (SAXException e2222222) {
                                throw e2222222;
                            } catch (SAXException e22222222) {
                                throw e22222222;
                            }
                        }
                    } catch (SAXException e222222222) {
                        throw e222222222;
                    }
                }
                try {
                    this.ke = str2;
                    if (this.ve) {
                        try {
                            if (str2.equals(se)) {
                                try {
                                    if (attributes.getValue(Ge).equals("0")) {
                                        this.Td.m5836b(attributes.getValue(oe));
                                        this.Td.m5828a(attributes.getValue(Fe).equals("1"));
                                        return;
                                    }
                                    this.Td.m5845d(true);
                                    return;
                                } catch (SAXException e2222222222) {
                                    throw e2222222222;
                                }
                            }
                            try {
                                if (str2.equals(we)) {
                                    this.qe = true;
                                    return;
                                }
                                try {
                                    if (str2.equals(ye)) {
                                        this.je = true;
                                        if (this.Vd.equals("")) {
                                            this.Vd = attributes.getValue(ue);
                                            return;
                                        }
                                        return;
                                    }
                                    try {
                                        if (this.ke.equals(Ud)) {
                                            this.Td.m5843d(1);
                                            return;
                                        }
                                        try {
                                            if (this.ke.equals(de)) {
                                                this.Td.m5843d(2);
                                            }
                                        } catch (SAXException e22222222222) {
                                            throw e22222222222;
                                        }
                                    } catch (SAXException e222222222222) {
                                        throw e222222222222;
                                    }
                                } catch (SAXException e2222222222222) {
                                    throw e2222222222222;
                                } catch (SAXException e22222222222222) {
                                    throw e22222222222222;
                                }
                            } catch (SAXException e222222222222222) {
                                throw e222222222222222;
                            }
                        } catch (SAXException e2222222222222222) {
                            throw e2222222222222222;
                        }
                    }
                } catch (SAXException e22222222222222222) {
                    throw e22222222222222222;
                }
            } else if (str2.equals(Ee)) {
                this.be = true;
                str4 = attributes.getValue(ze);
                if (str4 != null) {
                    try {
                        this.le = C0725i.m3064d(str4);
                    } catch (SAXException e222222222222222222) {
                        throw e222222222222222222;
                    }
                }
                str4 = attributes.getValue(Rd);
                if (str4 != null) {
                    try {
                        this.Be.m5010c(str4);
                    } catch (SAXException e2222222222222222222) {
                        throw e2222222222222222222;
                    }
                }
            }
        } catch (SAXException e22222222222222222222) {
            throw e22222222222222222222;
        } catch (SAXException e222222222222222222222) {
            throw e222222222222222222222;
        }
    }
}
