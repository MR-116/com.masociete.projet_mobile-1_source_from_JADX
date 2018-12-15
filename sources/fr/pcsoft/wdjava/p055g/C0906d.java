package fr.pcsoft.wdjava.p055g;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0535j;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.ui.C0490q;
import fr.pcsoft.wdjava.ui.champs.fc;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.p083l.C1449i;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.StringTokenizer;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: fr.pcsoft.wdjava.g.d */
public class C0906d extends C0903a implements C0535j {
    /* renamed from: A */
    static final int f2452A = 1;
    /* renamed from: E */
    private static final String f2453E = C0906d.m6401z(C0906d.m6402z("tS\u001eVWUe/MtFT\u0015f@Fe\u0014wmwH\u0011qW"));
    /* renamed from: F */
    private static final String[] f2454F;
    /* renamed from: y */
    static final int f2455y = 0;
    /* renamed from: z */
    private static final String f2456z = C0906d.m6401z(C0906d.m6402z("tS\u001eVWUe s@BW"));
    /* renamed from: B */
    private String f2457B = "";
    /* renamed from: C */
    private Document f2458C;
    /* renamed from: D */
    private WDObjet f2459D = null;
    /* renamed from: x */
    private int f2460x = 0;

    static {
        r0 = new String[22];
        r0[0] = C0906d.m6401z(C0906d.m6402z("x\u0014,N\u001d~"));
        r0[1] = C0906d.m6401z(C0906d.m6402z("jW\u0000}APS\u0012~W\u0003^\u00152QQÓ\u0015`\u0012O_Pv]@O\u001dw\\W\u001a(_~"));
        r0[2] = C0906d.m6401z(C0906d.m6402z("`R\u0015qYPO\u001d"));
        r0[3] = C0906d.m6401z(C0906d.m6402z("o[\u0002uWVH"));
        r0[4] = C0906d.m6401z(C0906d.m6402z("u[\u001c"));
        r0[5] = C0906d.m6401z(C0906d.m6402z("w[\u0019~^Fu\u0005dWQN\u0005`W"));
        r0[6] = C0906d.m6401z(C0906d.m6402z("n[\b{_JI\u0015w}VL\u0015`FVH\u0015"));
        r0[7] = C0906d.m6401z(C0906d.m6402z("sU\u0003{FJU\u001e]GU_\u0002fGQ_"));
        r0[8] = C0906d.m6401z(C0906d.m6402z("Z_\u0003"));
        r0[9] = C0906d.m6401z(C0906d.m6402z("ji??\n\u001b\u000fI?\u0003"));
        r0[10] = C0906d.m6401z(C0906d.m6402z("FT\u0013}VJT\u0017"));
        r0[11] = C0906d.m6401z(C0906d.m6402z("JT\u0014w\\W"));
        r0[12] = C0906d.m6401z(C0906d.m6402z("o[\u0002uWVH9|[WS\u0011~W"));
        r0[13] = C0906d.m6401z(C0906d.m6402z("jT\u0014{QF{\u0016t[@R\u0011uWlO\u0006w@WO\u0002w"));
        r0[14] = C0906d.m6401z(C0906d.m6402z("uS\u0003{PO_?gDFH\u0004g@F"));
        r0[15] = C0906d.m6401z(C0906d.m6402z("o[\u0002uWVH1tTJY\u0018sUFu\u0005dWQN\u0005`W"));
        r0[16] = C0906d.m6401z(C0906d.m6402z("jT\u0014{QFy\u0002wSWS\u001f|"));
        r0[17] = C0906d.m6401z(C0906d.m6402z("ro9V"));
        r0[18] = C0906d.m6401z(C0906d.m6402z("p[\u0005dWQn\u0011{^O_?gDFH\u0004g@F"));
        r0[19] = C0906d.m6401z(C0906d.m6402z("o[\u0019aAFy\u0011`S@N3}\\WH\u001f~W"));
        r0[20] = C0906d.m6401z(C0906d.m6402z("tS\u001eVWUe s@BW_E[M~\u0015dm|e6w\\FN\u0002wmG_/F@BY\u0015"));
        r0[21] = C0906d.m6401z(C0906d.m6402z("bI\u0013w\\P_\u0005`z"));
        f2454F = r0;
    }

    public C0906d(Object obj, int i) {
        DocumentBuilderFactory newInstance;
        this.f2460x = i;
        if (this.f2460x == 0) {
            File j = C0897o.m6290j(obj.toString());
            try {
                this.f2457B = j.getPath();
                if (j.exists()) {
                    try {
                        this.f2458C = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(j);
                    } catch (Exception e) {
                        C0691a.m2863b(f2454F[1], e);
                    }
                } else {
                    this.f2458C = m6400f();
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        WDChaine wDChaine;
        InputStream byteArrayInputStream;
        if (obj != null) {
            try {
                if (obj instanceof WDObjet) {
                    wDChaine = obj;
                    this.f2459D = wDChaine;
                    if (this.f2459D.getString().equals("")) {
                        byteArrayInputStream = new ByteArrayInputStream(C0725i.m3082k(this.f2459D.getString()));
                        newInstance = DocumentBuilderFactory.newInstance();
                        try {
                            this.f2458C = newInstance.newDocumentBuilder().parse(byteArrayInputStream);
                        } catch (Exception e3) {
                            try {
                                this.f2458C = newInstance.newDocumentBuilder().newDocument();
                            } catch (ParserConfigurationException e4) {
                            }
                        }
                    } else {
                        try {
                            this.f2458C = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
                        } catch (Exception e5) {
                        }
                    }
                }
            } catch (Exception e22) {
                throw e22;
            }
        }
        wDChaine = new WDChaine("");
        this.f2459D = wDChaine;
        if (this.f2459D.getString().equals("")) {
            byteArrayInputStream = new ByteArrayInputStream(C0725i.m3082k(this.f2459D.getString()));
            newInstance = DocumentBuilderFactory.newInstance();
            this.f2458C = newInstance.newDocumentBuilder().parse(byteArrayInputStream);
        } else {
            this.f2458C = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        }
        WDProjet.getInstance().ajouterEcouteurProjet(this);
    }

    /* renamed from: a */
    private Element m6395a(String str, boolean z) {
        if (this.f2458C == null) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "/");
        Element element = null;
        Element element2 = null;
        while (stringTokenizer.hasMoreElements()) {
            element = m6396a(element2, stringTokenizer.nextToken(), z);
            if (element == null) {
                return null;
            }
            element2 = element;
        }
        return element;
    }

    /* renamed from: a */
    private Element m6396a(Element element, String str, boolean z) {
        NodeList elementsByTagName;
        if (element == null) {
            elementsByTagName = this.f2458C.getElementsByTagName(str);
            if (elementsByTagName != null && elementsByTagName.getLength() >= 1) {
                return (Element) elementsByTagName.item(0);
            }
            if (z) {
                Object createElement = this.f2458C.createElement(str);
                this.f2458C.appendChild(createElement);
                return createElement;
            }
        }
        elementsByTagName = element.getElementsByTagName(str);
        if (elementsByTagName != null && elementsByTagName.getLength() >= 1) {
            return (Element) elementsByTagName.item(0);
        }
        if (z) {
            createElement = this.f2458C.createElement(str);
            element.appendChild(createElement);
            return createElement;
        }
        return null;
    }

    /* renamed from: a */
    private void m6397a(Element element, String str, String str2) {
        if (element != null) {
            Element a = m6396a(element, str, true);
            Node firstChild = a.getFirstChild();
            if (firstChild == null || firstChild.getNodeType() != (short) 3) {
                a.appendChild(this.f2458C.createTextNode(str2));
            } else {
                firstChild.setNodeValue(str2);
            }
        }
    }

    /* renamed from: a */
    private boolean m6398a(Element element, String str) {
        if (element == null) {
            return false;
        }
        Node a = m6396a(element, str, false);
        if (a == null) {
            return false;
        }
        element.removeChild(a);
        return true;
    }

    /* renamed from: b */
    private String m6399b(Element element, String str) {
        int i = 0;
        if (element != null) {
            Element a = m6396a(element, str, false);
            if (a != null) {
                NodeList childNodes = a.getChildNodes();
                while (i < childNodes.getLength()) {
                    Node item = childNodes.item(i);
                    if (item.getNodeType() == (short) 3) {
                        String nodeValue = item.getNodeValue();
                        if (!nodeValue.equals("\n")) {
                            return nodeValue;
                        }
                    }
                    i++;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    private Document m6400f() {
        try {
            Document newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            newDocument.createElement(f2456z);
            return newDocument;
        } catch (ParserConfigurationException e) {
            return null;
        }
    }

    /* renamed from: z */
    private static String m6401z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 35;
                    break;
                case 1:
                    i2 = 58;
                    break;
                case 2:
                    i2 = 112;
                    break;
                case 3:
                    i2 = 18;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6402z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 50);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3192a() {
        return 1;
    }

    /* renamed from: a */
    public WDEntier4 mo3193a(fc fcVar) {
        Element a = m6395a(mo3194a((C0490q) fcVar), false);
        if (a == null) {
            return null;
        }
        if (!fcVar.getChecksum().equals(m6399b(a, f2454F[2]))) {
            return null;
        }
        String b = m6399b(a, f2454F[3]);
        return b != null ? new WDEntier4(b) : null;
    }

    /* renamed from: a */
    public String mo3194a(C0490q c0490q) {
        StringBuffer stringBuffer = new StringBuffer("");
        if (c0490q.isFenetre()) {
            stringBuffer.append(f2456z);
            stringBuffer.append("/").append(c0490q.getName());
        } else if (c0490q.isColonne()) {
            stringBuffer.append(mo3194a((C0490q) c0490q.getPere()));
            stringBuffer.append("/").append(c0490q.getName());
        } else if (c0490q.isChamp()) {
            stringBuffer.append(f2456z);
            stringBuffer.append("/").append(c0490q.getFenetreMere().getNomFenetre());
            stringBuffer.append(mo3187a("", (fc) c0490q, "/"));
            stringBuffer.append("/").append(c0490q.getName());
        }
        String replace = stringBuffer.toString().replace(' ', C1449i.hb);
        c0490q.setNomNoeudPersistance(replace, mo3192a());
        return replace;
    }

    /* renamed from: a */
    public void mo3195a(fc fcVar, String str) {
        mo3196a(fcVar, f2454F[4], str);
    }

    /* renamed from: a */
    public void mo3196a(fc fcVar, String str, String str2) {
        String nomNoeudPersistance = fcVar.getNomNoeudPersistance();
        if (nomNoeudPersistance.equals("") || fcVar.getTypeSupportPersistance() != mo3192a()) {
            nomNoeudPersistance = mo3194a((C0490q) fcVar);
            fcVar.setNomNoeudPersistance(nomNoeudPersistance, mo3192a());
        }
        Element a = m6395a(nomNoeudPersistance, true);
        if (a != null) {
            m6397a(a, str, str2);
            m6397a(a, f2454F[2], fcVar.getChecksum());
            m6397a(a, f2454F[17], "" + fcVar.getQUID());
        }
    }

    /* renamed from: a */
    public void mo3197a(String str, String str2) {
        String[] b = mo3205b(str);
        Element a = m6395a(b[0].toString(), true);
        if (a != null) {
            m6397a(a, b[1], str2);
        }
    }

    /* renamed from: a */
    public void mo3198a(String str, String str2, String str3, String str4, String str5) {
        Element a = m6395a(str, true);
        if (a != null) {
            m6397a(a, f2454F[5], str2);
            m6397a(a, f2454F[7], str3);
            m6397a(a, f2454F[6], str4);
            m6397a(a, f2454F[2], str5);
        }
    }

    /* renamed from: a */
    public void mo3199a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        Element a = m6395a(str, true);
        if (a == null) {
            return;
        }
        if (z) {
            m6397a(a, f2454F[16], str3);
            m6397a(a, f2454F[13], str4);
            m6397a(a, f2454F[12], str5);
            m6397a(a, f2454F[15], str6);
            m6397a(a, f2454F[14], str7);
            return;
        }
        m6397a(a, f2454F[3], str2);
        m6397a(a, f2454F[2], str2);
    }

    /* renamed from: a */
    public void mo3200a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        Element a = m6395a(f2454F[20], true);
        if (a != null) {
            if (z4) {
                m6397a(a, f2454F[5], str);
                m6397a(a, f2454F[7], str2);
                m6397a(a, f2454F[6], z ? "1" : "0");
            }
            m6397a(a, f2454F[19], z2 ? "1" : "0");
            m6397a(a, f2454F[21], z3 ? "1" : "0");
            m6397a(a, f2454F[18], z4 ? "1" : "0");
        }
    }

    /* renamed from: a */
    public boolean mo3201a(String str) {
        String[] b = mo3205b(str);
        Element a = m6395a(b[0].toString(), false);
        if (a != null) {
            m6398a(a, b[1]);
        }
        return false;
    }

    /* renamed from: a */
    public WDEntier4[] mo3202a(WDFenetre wDFenetre) {
        WDEntier4[] wDEntier4Arr = new WDEntier4[5];
        Element a = m6395a(mo3194a((C0490q) wDFenetre), false);
        if (a == null) {
            return wDEntier4Arr;
        }
        if (!wDFenetre.getChecksum().equals(m6399b(a, f2454F[2]))) {
            return null;
        }
        String[] split;
        String b = m6399b(a, f2454F[5]);
        if (b != null) {
            split = b.split(",");
            if (split.length >= 2) {
                wDEntier4Arr[0] = new WDEntier4(split[0]);
                wDEntier4Arr[1] = new WDEntier4(split[1]);
            }
        }
        b = m6399b(a, f2454F[7]);
        if (b != null) {
            split = b.split(",");
            if (split.length >= 2) {
                wDEntier4Arr[2] = new WDEntier4(split[0]);
                wDEntier4Arr[3] = new WDEntier4(split[1]);
            }
        }
        String b2 = m6399b(a, f2454F[6]);
        if (b2 == null) {
            return wDEntier4Arr;
        }
        wDEntier4Arr[4] = new WDEntier4(b2);
        return wDEntier4Arr;
    }

    /* renamed from: b */
    public String mo3203b(fc fcVar) {
        return mo3204b(fcVar, f2454F[4]);
    }

    /* renamed from: b */
    public String mo3204b(fc fcVar, String str) {
        Element a = m6395a(mo3194a((C0490q) fcVar), false);
        if (a == null) {
            return null;
        }
        return (new StringBuilder().append("").append(fcVar.getQUID()).toString().equals(m6399b(a, f2454F[17])) && fcVar.getChecksum().equals(m6399b(a, f2454F[2]))) ? m6399b(a, str) : null;
    }

    /* renamed from: b */
    public void mo3190b() {
        if (this.f2458C != null) {
            try {
                Source dOMSource = new DOMSource(this.f2458C);
                File j = C0897o.m6290j(this.f2457B);
                Writer stringWriter = new StringWriter();
                Result streamResult = this.f2460x == 0 ? new StreamResult(j) : new StreamResult(stringWriter);
                Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
                newTransformer.setOutputProperty(f2454F[11], f2454F[8]);
                newTransformer.setOutputProperty(f2454F[10], f2454F[9]);
                newTransformer.transform(dOMSource, streamResult);
                if (this.f2460x == 1) {
                    this.f2459D.setValeur(stringWriter.toString());
                }
                stringWriter.close();
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                C0691a.m2863b("", e2);
            }
        }
    }

    /* renamed from: b */
    public String[] mo3205b(String str) {
        if (str == null) {
            str = "";
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str.replaceAll(f2454F[0], "/").replace(' ', C1449i.hb), "/");
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("/").append(f2456z);
        String str2 = "";
        while (stringTokenizer.hasMoreElements()) {
            String nextToken = stringTokenizer.nextToken();
            if (stringTokenizer.countTokens() != 0) {
                stringBuffer.append("/").append(nextToken);
                nextToken = str2;
            }
            str2 = nextToken;
        }
        return new String[]{stringBuffer.toString(), str2};
    }

    /* renamed from: c */
    public String mo3206c(String str) {
        String[] b = mo3205b(str);
        Element a = m6395a(b[0].toString(), false);
        return a != null ? m6399b(a, b[1]) : null;
    }

    /* renamed from: c */
    public WDEntier4[] mo3207c() {
        WDEntier4[] wDEntier4Arr = new WDEntier4[8];
        Element a = m6395a(f2454F[20], false);
        if (a != null) {
            String[] split;
            String b = m6399b(a, f2454F[5]);
            if (b != null) {
                split = b.split(",");
                if (split.length >= 2) {
                    wDEntier4Arr[0] = new WDEntier4(split[0]);
                    wDEntier4Arr[1] = new WDEntier4(split[1]);
                }
            }
            b = m6399b(a, f2454F[7]);
            if (b != null) {
                split = b.split(",");
                if (split.length >= 2) {
                    wDEntier4Arr[2] = new WDEntier4(split[0]);
                    wDEntier4Arr[3] = new WDEntier4(split[1]);
                }
            }
            b = m6399b(a, f2454F[6]);
            if (b != null) {
                wDEntier4Arr[4] = new WDEntier4(b);
            }
            b = m6399b(a, f2454F[19]);
            if (b != null) {
                wDEntier4Arr[5] = new WDEntier4(b);
            }
            b = m6399b(a, f2454F[21]);
            if (b != null) {
                wDEntier4Arr[6] = new WDEntier4(b);
            }
            String b2 = m6399b(a, f2454F[18]);
            if (b2 != null) {
                wDEntier4Arr[7] = new WDEntier4(b2);
            }
        }
        return wDEntier4Arr;
    }

    /* renamed from: c */
    public WDEntier4[] mo3208c(C0490q c0490q) {
        WDEntier4[] wDEntier4Arr = new WDEntier4[5];
        Element a = m6395a(mo3194a(c0490q), false);
        if (a != null) {
            String str = "";
            str = m6399b(a, f2454F[16]);
            if (str != null) {
                wDEntier4Arr[0] = new WDEntier4(str);
            }
            str = m6399b(a, f2454F[13]);
            if (str != null) {
                wDEntier4Arr[1] = new WDEntier4(str);
            }
            str = m6399b(a, f2454F[12]);
            if (str != null) {
                wDEntier4Arr[2] = new WDEntier4(str);
            }
            str = m6399b(a, f2454F[15]);
            if (str != null) {
                wDEntier4Arr[3] = new WDEntier4(str);
            }
            String b = m6399b(a, f2454F[14]);
            if (b != null) {
                wDEntier4Arr[4] = new WDEntier4(b);
            }
        }
        return wDEntier4Arr;
    }

    /* renamed from: d */
    public String mo3209d() {
        return "/";
    }

    /* renamed from: e */
    public boolean mo3210e() {
        if (this.f2460x == 0) {
            File j = C0897o.m6290j(this.f2457B);
            if (j.exists()) {
                return j.delete();
            }
        } else if (this.f2459D != null) {
            this.f2459D.setValeur("");
            return true;
        }
        return false;
    }

    public void onChangementTitre(String str) {
    }

    public void onCharsetChanged(String str) {
    }

    public void onFermetureProjet() {
        mo3190b();
    }

    public void onLowMemory() {
    }
}
