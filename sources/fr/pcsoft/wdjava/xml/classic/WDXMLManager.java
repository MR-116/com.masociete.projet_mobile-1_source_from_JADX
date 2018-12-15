package fr.pcsoft.wdjava.xml.classic;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.xml.C1525a;
import fr.pcsoft.wdjava.xml.C1535e;
import fr.pcsoft.wdjava.xml.C1537g;
import java.io.StringReader;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class WDXMLManager {
    /* renamed from: a */
    private static HashMap f4681a = null;
    /* renamed from: z */
    private static final String[] f4682z = new String[]{m10635z(m10636z("CJzW\\%@e^V2MqTQ-Sc")), m10635z(m10636z("\\=Etl\u0014,")), m10635z(m10636z("\\`Xtw^")), m10635z(m10636z("CJzW\\$]tNN%\\cDF8[dOB.F")), m10635z(m10636z("CJzW\\$]tNN%\\cDJ.WoRP4SyO"))};

    /* renamed from: a */
    private static final synchronized C1530b m10600a(String str, boolean z) {
        C1530b c1530b;
        synchronized (WDXMLManager.class) {
            c1530b = null;
            if (f4681a != null) {
                c1530b = (C1530b) f4681a.get(str.toLowerCase());
            }
            if (c1530b == null && z) {
                try {
                    WDErreurManager.m2883a(C0745b.m3222b(f4682z[4], str));
                } catch (DOMException e) {
                    throw e;
                }
            }
        }
        return c1530b;
    }

    /* renamed from: a */
    public static final String m10601a(String str, String str2, int i) throws C1537g {
        C1530b a = m10600a(str, true);
        String str3 = "";
        if (str2 != null) {
            try {
                if (!str2.equals("")) {
                    return a.m10683a(str2, i);
                }
            } catch (DOMException e) {
                throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
            }
        }
        return a.mo3818c();
    }

    /* renamed from: a */
    public static final String m10602a(String str, String str2, int i, int i2) throws C1537g {
        String trim = str == null ? "" : str.trim();
        String str3 = "";
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setExpandEntityReferences(false);
        newInstance.setIgnoringComments(false);
        newInstance.setNamespaceAware(false);
        newInstance.setValidating(false);
        DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
        newDocumentBuilder.setEntityResolver(new C1532d());
        if (!trim.equals("")) {
            Document parse;
            try {
                parse = newDocumentBuilder.parse(new InputSource(new StringReader(trim)));
            } catch (DOMException e) {
                throw e;
            } catch (DOMException e2) {
                if (e2.code == (short) 3) {
                    parse = newDocumentBuilder.parse(new InputSource(new StringReader(f4682z[2] + trim + f4682z[1])));
                } else {
                    throw e2;
                }
            } catch (Exception e3) {
                throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e3.getMessage());
            }
            Element documentElement = parse.getDocumentElement();
            if (documentElement != null) {
                Object toLowerCase;
                boolean z = (i2 & 16) == 16;
                if (z) {
                    toLowerCase = str2.toLowerCase();
                }
                NodeList elementsByTagName = documentElement.getElementsByTagName(C0607n.Vc);
                int i3 = -1;
                int i4 = 1;
                while (i3 < elementsByTagName.getLength()) {
                    try {
                        Node item;
                        if (i3 != -1) {
                            item = elementsByTagName.item(i3);
                        } else if (documentElement instanceof Node) {
                            item = documentElement;
                        } else {
                            continue;
                            i3++;
                        }
                        String nodeName = item.getNodeName();
                        if (z) {
                            nodeName = nodeName.toLowerCase();
                        }
                        if (!nodeName.equals(toLowerCase)) {
                            continue;
                        } else if (i4 == i) {
                            try {
                                str3 = C1535e.m10722a(parse, item, false, "");
                                if (str3.indexOf(60) > -1) {
                                    i4 = str3.indexOf(62);
                                    if (i4 > -1) {
                                        str3 = str3.substring(i4 + 1, str3.length());
                                    }
                                }
                                i4 = str3.lastIndexOf(60);
                                if (i4 > -1) {
                                    str3 = str3.substring(0, i4);
                                }
                                return C0808l.m4051i(str3);
                            } catch (Exception e4) {
                                return str3;
                            }
                        } else {
                            i4++;
                        }
                        i3++;
                    } catch (DOMException e5) {
                        throw e5;
                    } catch (DOMException e52) {
                        throw e52;
                    }
                }
            }
        }
        return str3;
    }

    /* renamed from: a */
    private static final synchronized void m10603a(C1530b c1530b, String str) {
        synchronized (WDXMLManager.class) {
            try {
                if (f4681a == null) {
                    f4681a = new HashMap();
                }
                f4681a.put(str.toLowerCase(), c1530b);
            } catch (DOMException e) {
                throw e;
            }
        }
        return;
    }

    /* renamed from: a */
    public static final void m10604a(String str, WDObjet wDObjet) throws C1537g {
        if (m10600a(str, false) != null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f4682z[3], str));
            } catch (C1537g e) {
                throw e;
            }
        }
        m10603a(new C1530b(str, C1525a.m10583a(C1525a.m10594c(), wDObjet, null)), str);
    }

    /* renamed from: a */
    public static final boolean m10605a(String str) {
        C1530b a = m10600a(str, true);
        a.mo3819d();
        return a.m10712p();
    }

    /* renamed from: a */
    public static final boolean m10606a(String str, int i) throws C1537g {
        try {
            return m10600a(str, true).m10692b(i);
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: a */
    public static final boolean m10607a(String str, int i, int i2) throws C1537g {
        return m10600a(str, true).mo3814a(i, i2);
    }

    /* renamed from: a */
    public static final boolean m10608a(String str, WDObjet wDObjet, int i, int i2) throws C1537g {
        int i3;
        boolean z;
        String string;
        int i4 = 32;
        C1530b a = m10600a(str, true);
        boolean z2 = (i & 4) == 4;
        int i5 = (i & 1) == 1 ? 1 : 0;
        if ((i & 2) == 2) {
            i5 += 2;
        }
        if (!z2 && r3 == 0) {
            i5 = 3;
        }
        if ((i & 32) != 32) {
            i4 = 0;
        }
        if ((i & 16) == 16) {
            i4 += 16;
        }
        if ((i & 64) == 64) {
            i4 += 64;
        }
        if (i4 == 0) {
            i4 = 80;
        }
        if ((i2 & 16) == 16) {
            i3 = i2 - 16;
            z = true;
        } else {
            z = false;
            i3 = i2;
        }
        if (wDObjet != null) {
            try {
                if (!wDObjet.isValeurNull()) {
                    string = wDObjet.getString();
                    a.mo3812a(string, z2, i5, i4, z, i3);
                    return a.mo3815a(null);
                }
            } catch (DOMException e) {
                throw e;
            } catch (DOMException e2) {
                throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e2.getMessage());
            }
        }
        string = null;
        a.mo3812a(string, z2, i5, i4, z, i3);
        return a.mo3815a(null);
    }

    /* renamed from: a */
    public static final boolean m10609a(String str, String str2) throws C1537g {
        try {
            return m10600a(str, true).m10697c(str2);
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: a */
    public static final boolean m10610a(String str, String str2, String str3, int i, boolean z) throws C1537g {
        try {
            return m10600a(str, true).m10693b(str2, str3, i, z);
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: a */
    public static final boolean m10611a(String str, String str2, String str3, boolean z) throws C1537g {
        try {
            return m10600a(str, true).m10694b(str2, str3, z);
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: b */
    public static final boolean m10612b(String str) {
        C1530b a = m10600a(str, false);
        if (a == null) {
            return false;
        }
        a.m10714u();
        m10620f(str);
        a.m10709m();
        return true;
    }

    /* renamed from: b */
    public static final boolean m10613b(String str, String str2) throws C1537g {
        try {
            m10600a(str, true).m10684a(str2);
            return true;
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: b */
    public static final boolean m10614b(String str, String str2, int i) throws C1537g {
        try {
            return m10600a(str, true).m10688a(m10600a(str2, true), i);
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: b */
    public static final boolean m10615b(String str, String str2, String str3, boolean z) throws C1537g {
        try {
            return m10600a(str, true).m10689a(str2, str3, z);
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: c */
    public static final String m10616c(String str) throws C1537g {
        String str2 = "";
        try {
            return m10600a(str, true).m10718y();
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: c */
    public static final boolean m10617c(String str, String str2) throws C1537g {
        try {
            m10603a(m10600a(str, true).m10698d(str2), str2);
            return true;
        } catch (Exception e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    public static final String construireChaine(String str, int i, String str2) throws C1537g {
        String str3 = "";
        try {
            return m10600a(str, true).m10682a(i, str2);
        } catch (Exception e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: d */
    public static final void m10618d(String str) {
        m10600a(str, true).mo3819d();
    }

    /* renamed from: e */
    public static final String m10619e(String str) throws C1537g {
        String str2 = "";
        try {
            return m10600a(str, true).mo3823h();
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: f */
    public static final synchronized void m10620f(String str) {
        synchronized (WDXMLManager.class) {
            try {
                if (f4681a != null) {
                    f4681a.remove(str.toLowerCase());
                }
            } catch (DOMException e) {
                throw e;
            }
        }
        return;
    }

    /* renamed from: g */
    public static final String m10621g(String str) throws C1537g {
        String str2 = "";
        try {
            return m10600a(str, true).m10711o();
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: h */
    public static final boolean m10622h(String str) {
        return m10600a(str, true).m10706j();
    }

    /* renamed from: i */
    public static final boolean m10623i(String str) throws C1537g {
        C1530b a = m10600a(str, true);
        try {
            return a.m10715v() ? a.mo3817b(null) : a.mo3821f();
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: j */
    public static final boolean m10624j(String str) throws C1537g {
        C1530b a = m10600a(str, true);
        try {
            return a.m10715v() ? a.mo3815a(null) : a.mo3813a();
        } catch (DOMException e) {
            throw new WDException(e.getMessage());
        }
    }

    /* renamed from: k */
    public static final int m10625k(String str) throws C1537g {
        return m10600a(str, true).mo3816b();
    }

    /* renamed from: l */
    public static final String m10626l(String str) throws C1537g {
        String str2 = "";
        try {
            return m10600a(str, true).m10713r();
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: m */
    public static final boolean m10627m(String str) throws C1537g {
        C1530b a = m10600a(str, true);
        a.mo3819d();
        try {
            return a.m10716w();
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: n */
    public static final boolean m10628n(String str) throws C1537g {
        try {
            return m10600a(str, true).m10707k();
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: o */
    public static final String m10629o(String str) throws C1537g {
        String str2 = "";
        try {
            return m10600a(str, true).m10704h(null);
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: p */
    public static final int m10630p(String str) throws C1537g {
        try {
            return m10600a(str, true).mo3820e();
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: q */
    public static final boolean m10631q(String str) throws C1537g {
        C1530b a = m10600a(str, true);
        a.mo3819d();
        try {
            return a.m10705i();
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: r */
    public static final boolean m10632r(String str) throws C1537g {
        C1530b a = m10600a(str, true);
        a.mo3819d();
        try {
            return a.m10717x();
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]), e.getMessage());
        }
    }

    /* renamed from: s */
    public static final boolean m10633s(String str) throws C1537g {
        C1530b a = m10600a(str, true);
        a.mo3819d();
        try {
            return a.mo3822g();
        } catch (DOMException e) {
            throw new C1537g(C0745b.m3222b(f4682z[0], new String[0]));
        }
    }

    /* renamed from: t */
    public static final boolean m10634t(String str) {
        return m10600a(str, true).m10708l();
    }

    /* renamed from: z */
    private static String m10635z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 96;
                    break;
                case 1:
                    i2 = 18;
                    break;
                case 2:
                    i2 = 55;
                    break;
                case 3:
                    i2 = 27;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10636z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 3);
        }
        return toCharArray;
    }
}
