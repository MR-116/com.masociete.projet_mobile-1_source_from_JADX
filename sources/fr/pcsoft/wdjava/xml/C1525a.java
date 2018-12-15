package fr.pcsoft.wdjava.xml;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.file.C0893k;
import fr.pcsoft.wdjava.file.C0895m;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
import fr.pcsoft.wdjava.ui.p083l.C1449i;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.net.URL;
import java.nio.charset.Charset;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: fr.pcsoft.wdjava.xml.a */
public class C1525a {
    /* renamed from: a */
    private static ThreadLocal<DocumentBuilder> f4671a = null;
    /* renamed from: b */
    private static final String f4672b = C1525a.m10598z(C1525a.m10599z("\u000b)\t4\u001a\u00062"));
    /* renamed from: z */
    private static final String[] f4673z;

    static {
        r0 = new String[11];
        r0[0] = C1525a.m10598z(C1525a.m10599z("K\u001e)\u0015 -\u00146\u001c*:\u0019\"\u0016-%\u00070"));
        r0[1] = C1525a.m10598z(C1525a.m10599z("K\u00036\u000b:=\u0014;\u001197\u0007'\u001a:;\u0019\"\u0010< \u000f!\u000b -\u001e0\u001c-&\u0003"));
        r0[2] = C1525a.m10598z(C1525a.m10599z("\u0010+\b7\f"));
        r0[3] = C1525a.m10598z(C1525a.m10599z("\u00002\u0010)EGi\u0013.\bF1Ww\u0010\u001a!KkOXvK!\u0012\u0004(\u0017v"));
        r0[4] = C1525a.m10598z(C1525a.m10599z("K\u001dTtF5m"));
        r0[5] = C1525a.m10598z(C1525a.m10599z("!(\u00128\u0013\u0001\"D\f-$h"));
        r0[6] = C1525a.m10598z(C1525a.m10599z("$'D/\u001e\u0004#\u0011+_\f3D4\u001a\u0005$\u0016<_\u0006'\t<\f\u0018'\u0007<>\u001f'\u0016<_\u0006a\u0005y\u000f\t5D)\nH¬\u0010+\u001aH+\u000b=\u0016\u000e/<_\u0018'\u0016y\u0016\u00062\u00166\f\u0018#\u0007-\u0016\u0007(J"));
        r0[7] = C1525a.m10598z(C1525a.m10599z("\u0006'\t<\f\u0018'\u0007<>\u001f'\u0016<"));
        r0[8] = C1525a.m10598z(C1525a.m10599z("K\u00036\u000b +\u0014!\u0018+!\t*\u0006/)\u00147\u001c*:\u0019<\u00143"));
        r0[9] = C1525a.m10598z(C1525a.m10599z("=\u0012\"tN^\n!"));
        r0[10] = C1525a.m10598z(C1525a.m10599z("\u000e/\b<Q\r(\u00076\u001b\u0001(\u0003"));
        f4673z = r0;
    }

    /* renamed from: a */
    public static int m10576a(Node node, boolean z) {
        int i = 0;
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            if (!z || firstChild.getNodeType() != (short) 8) {
                i++;
            }
            firstChild = firstChild.getNextSibling();
        }
        return i;
    }

    /* renamed from: a */
    public static final C1536f m10577a(Element element, String str, String str2, String str3) {
        String a = C1525a.m10580a(str, str3, element);
        if (a == null) {
            return null;
        }
        int indexOf = a.indexOf(58);
        String substring = indexOf != -1 ? a.substring(0, indexOf) : null;
        a = a.substring(indexOf + 1);
        if (substring != null || str2 == null) {
            str2 = C1525a.m10581a((Node) element, substring);
        }
        return str2 != null ? new C1536f(str2, a) : null;
    }

    /* renamed from: a */
    public static final C1536f m10578a(Node node) {
        return new C1536f(node.getNamespaceURI(), node.getLocalName());
    }

    /* renamed from: a */
    public static final String m10579a(String str) {
        StringBuffer stringBuffer = new StringBuffer(C0808l.m4057o(str));
        int length = stringBuffer.length();
        int i = 0;
        while (i < length) {
            if (!C1525a.m10587a(stringBuffer.charAt(i), i == 0)) {
                stringBuffer.setCharAt(i, C1449i.hb);
            }
            i++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final String m10580a(String str, String str2, Element element) {
        Attr attributeNodeNS = str2 != null ? element.getAttributeNodeNS(str2, str) : element.getAttributeNode(str);
        return attributeNodeNS != null ? attributeNodeNS.getValue() : null;
    }

    /* renamed from: a */
    public static String m10581a(Node node, String str) {
        Node node2;
        switch (node.getNodeType()) {
            case (short) 1:
                node2 = node;
                break;
            case (short) 2:
                node2 = ((Attr) node).getOwnerElement();
                break;
            default:
                node2 = node.getParentNode();
                break;
        }
        while (node2 != null && node2.getNodeType() == (short) 1) {
            String a = str == null ? C1525a.m10580a(f4673z[2], null, (Element) node2) : C1525a.m10580a(str, f4673z[3], (Element) node2);
            if (a != null) {
                return a;
            }
            node2 = node2.getParentNode();
        }
        return null;
    }

    /* renamed from: a */
    private static final DocumentBuilder m10582a() {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setExpandEntityReferences(false);
            newInstance.setIgnoringComments(false);
            newInstance.setNamespaceAware(true);
            newInstance.setValidating(false);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            newDocumentBuilder.setEntityResolver(new C1526b());
            return newDocumentBuilder;
        } catch (ParserConfigurationException e) {
            WDErreurManager.m2884a(e.getMessage(), C0745b.m3222b(f4673z[8], new String[0]));
            return null;
        }
    }

    /* renamed from: a */
    public static Document m10583a(DocumentBuilder documentBuilder, WDObjet wDObjet, String str) throws C1537g {
        Throwable th;
        StringReader stringReader;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            String c;
            Document parse;
            if (wDObjet.isMemoBinaire()) {
                byte[] donneeBinaire = wDObjet.getDonneeBinaire();
                C0895m b = C0897o.m6257b(donneeBinaire);
                c = b != null ? b.m6228c() : wDObjet.isUnicode() ? f4673z[9] : str;
                if (c != null) {
                    if (!Charset.isSupported(c)) {
                        c = System.getProperty(f4673z[10]);
                    }
                }
                if (donneeBinaire != null) {
                    if (donneeBinaire.length > 0) {
                        try {
                            InputStream byteArrayInputStream2 = new ByteArrayInputStream(donneeBinaire);
                            if (b != null) {
                                try {
                                    byteArrayInputStream2.read(new byte[b.m6221a()]);
                                } catch (Exception e) {
                                    throw e;
                                } catch (Exception e2) {
                                    throw e2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    byteArrayInputStream = byteArrayInputStream2;
                                }
                            }
                            InputSource inputSource = new InputSource(byteArrayInputStream2);
                            if (c != null) {
                                inputSource.setEncoding(c);
                            }
                            parse = documentBuilder.parse(inputSource);
                            if (byteArrayInputStream2 == null) {
                                return parse;
                            }
                            byteArrayInputStream2.close();
                            return parse;
                        } catch (Throwable th3) {
                            th = th3;
                            if (byteArrayInputStream != null) {
                                byteArrayInputStream.close();
                            }
                            throw th;
                        }
                    }
                }
                return documentBuilder.newDocument();
            }
            c = wDObjet.getString();
            c = c == null ? "" : c.trim();
            if (c.equals("")) {
                return documentBuilder.newDocument();
            }
            try {
                stringReader = new StringReader(c);
                try {
                    parse = documentBuilder.parse(new InputSource(stringReader));
                    if (stringReader == null) {
                        return parse;
                    }
                    stringReader.close();
                    return parse;
                } catch (Throwable th4) {
                    th = th4;
                    if (stringReader != null) {
                        stringReader.close();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                stringReader = null;
                if (stringReader != null) {
                    stringReader.close();
                }
                throw th;
            }
        } catch (Exception e22) {
            throw e22;
        } catch (Exception e222) {
            throw e222;
        } catch (Exception e2222) {
            throw e2222;
        } catch (Exception e22222) {
            throw e22222;
        } catch (Exception e222222) {
            throw e222222;
        } catch (Exception e2222222) {
            throw e2222222;
        } catch (Exception e22222222) {
            throw new C1537g(C0745b.m3222b(f4673z[0], new String[0]), e22222222.getMessage());
        }
    }

    /* renamed from: a */
    public static Document m10584a(DocumentBuilder documentBuilder, String str) throws C1537g {
        IOException e;
        InputStream c0893k;
        SAXException e2;
        Throwable th;
        InputStream b = C0743a.m3205b(str);
        if (b == null) {
            try {
                URL b2 = C0897o.m6262b(str, null);
                if (b2 == null) {
                    throw new C1537g(f4673z[5]);
                }
                b = b2.openStream();
            } catch (IOException e3) {
                throw e3;
            } catch (IOException e32) {
                throw new C1537g(e32.getMessage());
            }
        }
        try {
            c0893k = new C0893k(b);
            try {
                ((C0893k) c0893k).m6219a();
                InputSource inputSource = new InputSource(c0893k);
                inputSource.setSystemId(str);
                if (((C0893k) c0893k).m6220b() != null) {
                    inputSource.setEncoding(((C0893k) c0893k).m6220b().m6228c());
                }
                Document parse = documentBuilder.parse(inputSource);
                if (c0893k != null) {
                    try {
                        c0893k.close();
                    } catch (IOException e4) {
                    } catch (C1537g e5) {
                        throw e5;
                    }
                }
                return parse;
            } catch (IOException e322) {
                throw e322;
            } catch (SAXException e6) {
                e2 = e6;
                throw new C1537g(C0745b.m3222b(f4673z[0], new String[0]), e2.getMessage());
            } catch (IOException e7) {
                e322 = e7;
            }
        } catch (IOException e8) {
            IOException iOException = e8;
            c0893k = b;
            e322 = iOException;
            try {
                throw new C1537g(e322.getMessage());
            } catch (Throwable th2) {
                th = th2;
                if (c0893k != null) {
                    try {
                        c0893k.close();
                    } catch (IOException e9) {
                    } catch (C1537g e52) {
                        throw e52;
                    }
                }
                throw th;
            }
        } catch (SAXException e10) {
            SAXException sAXException = e10;
            c0893k = b;
            e2 = sAXException;
            throw new C1537g(C0745b.m3222b(f4673z[0], new String[0]), e2.getMessage());
        } catch (Throwable th3) {
            Throwable th4 = th3;
            c0893k = b;
            th = th4;
            if (c0893k != null) {
                c0893k.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static Node m10585a(Node node, int i, boolean z) {
        int i2 = 0;
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            if (!z || firstChild.getNodeType() != (short) 8) {
                if (i2 == i) {
                    return firstChild;
                }
                i2++;
            }
            firstChild = firstChild.getNextSibling();
        }
        return null;
    }

    /* renamed from: a */
    public static final <T extends Node> T m10586a(Node node, Class<T> cls) {
        for (T firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (cls.isInstance(firstChild)) {
                return firstChild;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static final boolean m10587a(char c, boolean z) {
        return (c == C1449i.hb || ((c >= qb.f3195j && c <= qb.f3192g) || ((c >= qb.f3206v && c <= qb.f3196k) || !(c <= '¿' || c == '×' || c == '÷')))) ? true : !z ? c == '-' || c == '.' || (c >= '0' && c <= '9') : false;
    }

    /* renamed from: b */
    private static final String m10588b(Node node, boolean z) {
        int i = 0;
        NodeList childNodes = node.getChildNodes();
        if (childNodes == null || childNodes.getLength() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        while (i < childNodes.getLength()) {
            Node item = childNodes.item(i);
            short nodeType = item.getNodeType();
            if (nodeType == (short) 3 || (z && nodeType == (short) 4)) {
                stringBuffer.append(item.getNodeValue());
                i2 = 1;
            } else {
                if (item.getNodeType() == (short) 5) {
                    String nodeName = item.getNodeName();
                    if (nodeName != null && nodeName.matches(f4673z[4])) {
                        stringBuffer.append((char) C0725i.m3064d(nodeName.substring(1)));
                        i2 = 1;
                    }
                }
                if (i2 != 0) {
                    break;
                }
            }
            i++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static Document m10589b() {
        return C1525a.m10582a().newDocument();
    }

    /* renamed from: b */
    public static Document m10590b(DocumentBuilder documentBuilder, String str) throws C1537g, C0901s {
        Exception e;
        InputStream inputStream;
        C0893k c0893k = null;
        try {
            File j = C0897o.m6290j(str);
            if (j.exists()) {
                InputStream c0893k2 = new C0893k(new FileInputStream(j));
                try {
                    c0893k2.m6219a();
                    InputSource inputSource = new InputSource(c0893k2);
                    if (c0893k2.m6220b() != null) {
                        inputSource.setEncoding(c0893k2.m6220b().m6228c());
                    }
                    Document parse = documentBuilder.parse(inputSource);
                    if (c0893k2 != null) {
                        try {
                            c0893k2.close();
                        } catch (IOException e2) {
                        } catch (C1537g e3) {
                            throw e3;
                        }
                    }
                    return parse;
                } catch (IOException e4) {
                    throw e4;
                } catch (Exception e5) {
                    e = e5;
                    inputStream = c0893k2;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    inputStream = c0893k2;
                    if (c0893k != null) {
                        try {
                            c0893k.close();
                        } catch (IOException e6) {
                        } catch (C1537g e32) {
                            throw e32;
                        }
                    }
                    throw th2;
                }
            }
            throw new C0901s(C0745b.m3222b(f4673z[1], str));
        } catch (IOException e42) {
            throw e42;
        } catch (Exception e7) {
            e = e7;
        }
        try {
            throw new C1537g(C0745b.m3222b(f4673z[0], new String[0]), e.getMessage());
        } catch (Throwable th3) {
            th2 = th3;
            if (c0893k != null) {
                c0893k.close();
            }
            throw th2;
        }
    }

    /* renamed from: b */
    public static final <T extends Node> T m10591b(T t) {
        if (!WDProjet.getInstance().isVersionCompatible(C0657a.HONEYCOMB.getNumero())) {
            try {
                Field declaredField = t.getClass().getDeclaredField(f4673z[7]);
                declaredField.setAccessible(true);
                declaredField.set(t, Boolean.TRUE);
            } catch (Exception e) {
                C0691a.m2857a(f4673z[6], e);
            }
        }
        return t;
    }

    /* renamed from: b */
    public static final <T extends Node> T m10592b(Node node, Class<T> cls) {
        for (T nextSibling = node.getNextSibling(); nextSibling != null; nextSibling = nextSibling.getNextSibling()) {
            if (cls.isInstance(nextSibling)) {
                return nextSibling;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final String m10593c(Node node, boolean z) {
        switch (node.getNodeType()) {
            case (short) 1:
            case (short) 2:
            case (short) 5:
            case (short) 6:
            case (short) 9:
            case (short) 12:
                return (z || node.getLocalName() == null) ? node.getNodeName() : node.getLocalName();
            case (short) 8:
                return f4672b;
            default:
                return "";
        }
    }

    /* renamed from: c */
    public static final DocumentBuilder m10594c() {
        DocumentBuilder documentBuilder = f4671a != null ? (DocumentBuilder) f4671a.get() : null;
        if (documentBuilder != null) {
            return documentBuilder;
        }
        f4671a = new C1533d();
        return (DocumentBuilder) f4671a.get();
    }

    /* renamed from: c */
    public static final void m10595c(Node node) {
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            short nodeType = item.getNodeType();
            if (nodeType == (short) 3 || nodeType == (short) 4) {
                node.removeChild(item);
            }
        }
    }

    /* renamed from: d */
    public static final String m10596d(Node node, boolean z) {
        String str = "";
        switch (node.getNodeType()) {
            case (short) 1:
                str = C1525a.m10588b(node, z);
                break;
            case (short) 2:
            case (short) 3:
            case (short) 4:
                str = node.getNodeValue();
                break;
            case (short) 8:
                str = "";
                break;
        }
        return str == null ? "" : str;
    }

    /* renamed from: d */
    public static final boolean m10597d(Node node) {
        short nodeType = node.getNodeType();
        return nodeType == (short) 3 || nodeType == (short) 4;
    }

    /* renamed from: z */
    private static String m10598z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 104;
                    break;
                case 1:
                    i2 = 70;
                    break;
                case 2:
                    i2 = 100;
                    break;
                case 3:
                    i2 = 89;
                    break;
                default:
                    i2 = C0607n.bx;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10599z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.bx);
        }
        return toCharArray;
    }
}
