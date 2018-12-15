package fr.pcsoft.wdjava.xml;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* renamed from: fr.pcsoft.wdjava.xml.e */
public class C1535e {
    /* renamed from: z */
    private static final String[] f4703z = new String[]{C1535e.m10723z(C1535e.m10724z("\u0013'a$V\u0007-/ Z\u0015$k3")), C1535e.m10723z(C1535e.m10724z("\u0012&a?K\u001e&e")), C1535e.m10723z(C1535e.m10724z("\u0019'")), C1535e.m10723z(C1535e.m10724z("\u0018%k$\u0002\u000f%n}K\u0012+n1]\u0016<k?A")), C1535e.m10723z(C1535e.m10724z("\u0001-p#F\u0018&")), C1535e.m10723z(C1535e.m10724z("\u001e&f5A\u0003")), C1535e.m10723z(C1535e.m10724z("\u0013'a$V\u0007-/#V\u0004<g=")), C1535e.m10723z(C1535e.m10724z("\u000e-q")), C1535e.m10723z(C1535e.m10724z("\u000f%n")), C1535e.m10723z(C1535e.m10724z("Ff2")), C1535e.m10723z(C1535e.m10724z("\u001a-v8@\u0013"))};

    /* renamed from: a */
    public static String m10722a(Document document, Node node, boolean z, String str) throws C1537g {
        Writer stringWriter = new StringWriter();
        try {
            Source dOMSource = new DOMSource(node);
            Result streamResult = new StreamResult(stringWriter);
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            try {
                newTransformer.setOutputProperty(f4703z[5], f4703z[7]);
                newTransformer.setOutputProperty(f4703z[10], f4703z[8]);
                newTransformer.setOutputProperty(f4703z[4], f4703z[9]);
                if (document.getDoctype() != null) {
                    if (document.getDoctype().getPublicId() != null) {
                        newTransformer.setOutputProperty(f4703z[0], document.getDoctype().getPublicId());
                    }
                    if (document.getDoctype().getSystemId() != null) {
                        newTransformer.setOutputProperty(f4703z[6], document.getDoctype().getSystemId());
                    }
                }
                if (z) {
                    newTransformer.setOutputProperty(f4703z[3], f4703z[2]);
                } else {
                    newTransformer.setOutputProperty(f4703z[3], f4703z[7]);
                }
                if (str != null) {
                    if (!str.equals("")) {
                        newTransformer.setOutputProperty(f4703z[1], str);
                    }
                }
                newTransformer.transform(dOMSource, streamResult);
                String stringWriter2 = stringWriter.toString();
                if (stringWriter != null) {
                    try {
                        stringWriter.close();
                    } catch (IOException e) {
                    } catch (C1537g e2) {
                        throw e2;
                    }
                }
                return stringWriter2;
            } catch (IOException e3) {
                throw e3;
            } catch (IOException e32) {
                throw e32;
            }
        } catch (IOException e322) {
            throw e322;
        } catch (IOException e3222) {
            throw e3222;
        } catch (IOException e32222) {
            throw e32222;
        } catch (TransformerException e4) {
            try {
                throw new C1537g(e4.getMessage());
            } catch (Throwable th) {
                if (stringWriter != null) {
                    try {
                        stringWriter.close();
                    } catch (IOException e5) {
                    } catch (C1537g e22) {
                        throw e22;
                    }
                }
            }
        }
    }

    /* renamed from: z */
    private static String m10723z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 119;
                    break;
                case 1:
                    i2 = 72;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 80;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10724z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 47);
        }
        return toCharArray;
    }
}
