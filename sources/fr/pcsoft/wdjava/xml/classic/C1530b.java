package fr.pcsoft.wdjava.xml.classic;

import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.xml.C1525a;
import fr.pcsoft.wdjava.xml.C1535e;
import fr.pcsoft.wdjava.xml.C1537g;
import java.util.ArrayList;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: fr.pcsoft.wdjava.xml.classic.b */
public class C1530b implements C1529e {
    /* renamed from: z */
    private static final String[] f4691z = new String[]{C1530b.m10680z(C1530b.m10681z("#SKd a")), C1530b.m10680z(C1530b.m10681z("#SKd ")), C1530b.m10680z(C1530b.m10681z("xfjF\f\u001eluU\u0003\u0014mn^\u001a\u0014pxI\u001c\u000elfD\u0007\u001e")), C1530b.m10680z(C1530b.m10681z("t~")), C1530b.m10680z(C1530b.m10681z("xfjF\f\t{sE\u0006\tawE\u0000\u0012jnE\u001d")), C1530b.m10680z(C1530b.m10681z("\u001eluU\u0005\u001arb_\u0001\u0004nfX\u0012\u0016")), C1530b.m10680z(C1530b.m10681z("xwZ\u0016\u0017aaE\u001d\u0018jnE\u001d")), C1530b.m10680z(C1530b.m10681z("xfjF\f\u000bqtC\u0007\u0012qiU\u0001\u001a}nD\u0016")), C1530b.m10680z(C1530b.m10681z("\u0005ef'\t:\u0013]U³¹ÚÏàº°ÐÈþ¥¢ÅÛí}\u0004\u0004\nW\b\u001a\u0013}k~!\u000e\n3\f»ÜÃâ¹²ÕÉå§­ÇÜö´ua\u001d'\u000eq\u001a")), C1530b.m10680z(C1530b.m10681z("xfjF\f\u001ajsX\u001a\u0019ksU\u001a\u0015{C\u0000\u000fi^")), C1530b.m10680z(C1530b.m10681z("xfjF\f\u0015qjU\u001a\u0015hfF\u001a\u001f{"))};
    /* renamed from: a */
    private C1528a f4692a = null;
    /* renamed from: b */
    private boolean f4693b = false;
    /* renamed from: c */
    private String f4694c = "";
    /* renamed from: d */
    private Document f4695d = null;
    /* renamed from: e */
    private Node f4696e = null;
    /* renamed from: f */
    private ArrayList f4697f = null;
    /* renamed from: g */
    private boolean f4698g = true;

    public C1530b(String str, Document document) {
        this.f4694c = str;
        this.f4695d = document;
        this.f4696e = this.f4695d.getDocumentElement();
    }

    /* renamed from: a */
    private Node m10661a(Integer num, Node node) {
        if (m10672g(node) == null) {
            return null;
        }
        Node node2 = num.intValue() + -1 >= 0 ? m10671f(m10672g(node))[num.intValue() - 1] : null;
        if (node2 == null) {
            try {
                if (this.f4692a.m10647h().size() > 0) {
                    Integer num2 = (Integer) this.f4692a.m10647h().pop();
                    if (num2 != null) {
                        return m10661a(num2, m10672g(node));
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                throw e;
            }
        }
        this.f4692a.m10647h().push(new Integer(num.intValue() - 1));
        return node2;
    }

    /* renamed from: a */
    private Node m10662a(boolean z) throws C1537g {
        try {
            if (this.f4696e != null) {
                return this.f4696e;
            }
            if (z) {
                m10679t();
            }
            throw new C1537g(C0745b.m3222b(f4691z[2], this.f4694c));
        } catch (C1537g e) {
            throw e;
        } catch (C1537g e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m10663a(org.w3c.dom.Node r6, java.lang.String r7) {
        /*
        r5 = this;
        r1 = r6.getChildNodes();
        if (r1 == 0) goto L_0x000c;
    L_0x0006:
        r0 = r1.getLength();	 Catch:{ IndexOutOfBoundsException -> 0x002d }
        if (r0 != 0) goto L_0x0015;
    L_0x000c:
        r0 = r5.f4695d;	 Catch:{ IndexOutOfBoundsException -> 0x002d }
        r0 = r0.createTextNode(r7);	 Catch:{ IndexOutOfBoundsException -> 0x002d }
        r6.appendChild(r0);	 Catch:{ IndexOutOfBoundsException -> 0x002d }
    L_0x0015:
        r0 = 0;
    L_0x0016:
        r2 = r1.getLength();
        if (r0 >= r2) goto L_0x0031;
    L_0x001c:
        r2 = r1.item(r0);
        r3 = r2.getNodeType();	 Catch:{ IndexOutOfBoundsException -> 0x002f }
        r4 = 3;
        if (r3 != r4) goto L_0x002a;
    L_0x0027:
        r2.setNodeValue(r7);	 Catch:{ IndexOutOfBoundsException -> 0x002f }
    L_0x002a:
        r0 = r0 + 1;
        goto L_0x0016;
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = move-exception;
        throw r0;
    L_0x0031:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.xml.classic.b.a(org.w3c.dom.Node, java.lang.String):void");
    }

    /* renamed from: a */
    private boolean m10664a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    private boolean m10665a(String str, String str2, int i, boolean z) {
        if (z) {
            str = str.toLowerCase();
            str2 = str2.toLowerCase();
        }
        switch (i) {
            case 2:
                return str.startsWith(str2);
            case 4:
                try {
                    return str.indexOf(str2) >= 0;
                } catch (IndexOutOfBoundsException e) {
                    throw e;
                }
            default:
                try {
                    return str.equals(str2);
                } catch (IndexOutOfBoundsException e2) {
                    throw e2;
                }
        }
    }

    /* renamed from: b */
    private Node m10666b(Integer num, Node node) {
        if (m10672g(node) == null) {
            return null;
        }
        Node[] f = m10671f(m10672g(node));
        Node node2 = f.length > num.intValue() + 1 ? f[num.intValue() + 1] : null;
        if (node2 == null) {
            try {
                if (this.f4692a.m10647h().size() > 0) {
                    Integer num2 = (Integer) this.f4692a.m10647h().pop();
                    if (num2 != null) {
                        return m10666b(num2, m10672g(node));
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                throw e;
            }
        }
        this.f4692a.m10647h().push(new Integer(num.intValue() + 1));
        return node2;
    }

    /* renamed from: b */
    private boolean m10667b(String str) {
        if (str != null) {
            try {
                if (!str.equals("")) {
                    return str.matches(f4691z[8]);
                }
            } catch (IndexOutOfBoundsException e) {
                throw e;
            }
        }
        return false;
    }

    /* renamed from: c */
    private Node m10668c(Node node) {
        int i = 0;
        Node item;
        if (node.getNodeType() == (short) 2) {
            Node ownerElement = ((Attr) node).getOwnerElement();
            if (ownerElement != null) {
                NamedNodeMap attributes = ownerElement.getAttributes();
                int i2 = 0;
                while (i2 < attributes.getLength()) {
                    try {
                        if (attributes.item(i2).getNodeName().equals(node.getNodeName()) && i2 < attributes.getLength() - 1) {
                            Node item2 = attributes.item(i2 + 1);
                            String toLowerCase = item2.getNodeName().toLowerCase();
                            try {
                                if (toLowerCase.startsWith(f4691z[0])) {
                                    continue;
                                } else if (!toLowerCase.startsWith(f4691z[1])) {
                                    return item2;
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw e;
                            } catch (IndexOutOfBoundsException e2) {
                                throw e2;
                            }
                        }
                        i2++;
                    } catch (IndexOutOfBoundsException e22) {
                        throw e22;
                    }
                }
                NodeList childNodes = ownerElement.getChildNodes();
                if (childNodes != null) {
                    try {
                        if (childNodes.getLength() != 0) {
                            while (i < childNodes.getLength()) {
                                item = childNodes.item(i);
                                try {
                                    if (m10664a(item.getNodeType())) {
                                        return item;
                                    }
                                    i++;
                                } catch (IndexOutOfBoundsException e222) {
                                    throw e222;
                                }
                            }
                        }
                    } catch (IndexOutOfBoundsException e2222) {
                        throw e2222;
                    }
                }
                return null;
            }
            return null;
        }
        try {
            item = node.getNextSibling();
        } catch (IndexOutOfBoundsException e3) {
            item = null;
        }
        while (item != null) {
            try {
                if (m10664a(item.getNodeType())) {
                    return item;
                }
                try {
                    item = item.getNextSibling();
                } catch (IndexOutOfBoundsException e4) {
                    item = null;
                }
            } catch (IndexOutOfBoundsException e22222) {
                throw e22222;
            }
        }
        return item;
    }

    /* renamed from: d */
    private boolean m10669d(Node node) {
        boolean z = false;
        Node[] f = m10671f(node);
        int i = 0;
        while (!z) {
            try {
                if (i >= f.length) {
                    break;
                }
                this.f4692a.m10647h().push(new Integer(i));
                Node node2 = f[i];
                z = m10674j(node2);
                if (!z) {
                    z = m10669d(node2);
                    if (z) {
                        continue;
                    } else {
                        try {
                            this.f4692a.m10647h().pop();
                        } catch (IndexOutOfBoundsException e) {
                            throw e;
                        }
                    }
                }
                i++;
            } catch (IndexOutOfBoundsException e2) {
                throw e2;
            }
        }
        return z;
    }

    /* renamed from: e */
    private Node m10670e(Node node) {
        Node ownerElement;
        Node item;
        if (node.getNodeType() == (short) 2) {
            ownerElement = ((Attr) node).getOwnerElement();
            if (ownerElement != null) {
                NamedNodeMap attributes = ownerElement.getAttributes();
                int i = 0;
                while (i < attributes.getLength()) {
                    try {
                        if (attributes.item(i).getNodeName().equals(node.getNodeName()) && i > 0) {
                            item = attributes.item(i - 1);
                            String toLowerCase = item.getNodeName().toLowerCase();
                            try {
                                if (toLowerCase.startsWith(f4691z[0])) {
                                    continue;
                                } else if (!toLowerCase.startsWith(f4691z[1])) {
                                    return item;
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw e;
                            } catch (IndexOutOfBoundsException e2) {
                                throw e2;
                            }
                        }
                        i++;
                    } catch (IndexOutOfBoundsException e22) {
                        throw e22;
                    }
                }
            }
            return null;
        }
        item = node.getPreviousSibling();
        while (item != null) {
            try {
                if (m10664a(item.getNodeType())) {
                    break;
                }
                item = item.getPreviousSibling();
            } catch (IndexOutOfBoundsException e222) {
                throw e222;
            }
        }
        if (item == null) {
            ownerElement = node.getParentNode();
            if (ownerElement != null) {
                try {
                    if (ownerElement != m10710n()) {
                        if (node.getAttributes() == null && node.getNodeType() != (short) 8) {
                            NamedNodeMap attributes2 = ownerElement.getAttributes();
                            if (attributes2 != null) {
                                int length = attributes2.getLength() - 1;
                                while (length >= 0) {
                                    ownerElement = attributes2.item(length);
                                    String toLowerCase2 = ownerElement.getNodeName().toLowerCase();
                                    try {
                                        if (!toLowerCase2.startsWith(f4691z[0])) {
                                            if (!toLowerCase2.startsWith(f4691z[1])) {
                                                return ownerElement;
                                            }
                                        }
                                        length--;
                                    } catch (IndexOutOfBoundsException e2222) {
                                        throw e2222;
                                    } catch (IndexOutOfBoundsException e22222) {
                                        throw e22222;
                                    }
                                }
                            }
                        }
                    }
                } catch (IndexOutOfBoundsException e222222) {
                    throw e222222;
                } catch (IndexOutOfBoundsException e2222222) {
                    throw e2222222;
                }
            }
        }
        return item;
    }

    /* renamed from: f */
    private Node[] m10671f(Node node) {
        int i = 0;
        NamedNodeMap attributes = node.getAttributes();
        int length = attributes != null ? attributes.getLength() : 0;
        NodeList childNodes = node.getChildNodes();
        ArrayList arrayList = new ArrayList(length + childNodes.getLength());
        if (attributes != null) {
            length = 0;
            while (length < attributes.getLength()) {
                String toLowerCase = attributes.item(length).getNodeName().toLowerCase();
                try {
                    if (!toLowerCase.startsWith(f4691z[0])) {
                        if (!toLowerCase.startsWith(f4691z[1])) {
                            arrayList.add(attributes.item(length));
                        }
                    }
                    length++;
                } catch (IndexOutOfBoundsException e) {
                    throw e;
                } catch (IndexOutOfBoundsException e2) {
                    throw e2;
                }
            }
        }
        while (i < childNodes.getLength()) {
            try {
                if (m10664a(childNodes.item(i).getNodeType())) {
                    arrayList.add(childNodes.item(i));
                }
                i++;
            } catch (IndexOutOfBoundsException e22) {
                throw e22;
            } catch (IndexOutOfBoundsException e222) {
                throw e222;
            }
        }
        arrayList.trimToSize();
        return (Node[]) arrayList.toArray(new Node[arrayList.size()]);
    }

    /* renamed from: g */
    private Node m10672g(Node node) {
        try {
            if (node.getNodeType() == (short) 2) {
                return ((Attr) node).getOwnerElement();
            }
            Node parentNode = node.getParentNode();
            if (parentNode != null) {
                try {
                    if (parentNode.getNodeType() != (short) 9) {
                        return parentNode;
                    }
                } catch (IndexOutOfBoundsException e) {
                    throw e;
                }
            }
            return null;
        } catch (IndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    /* renamed from: i */
    private int m10673i(Node node) {
        int i;
        int i2 = 0;
        Node g = m10672g(node);
        if (g != null) {
            Node[] f = m10671f(g);
            int i3 = 0;
            i = 0;
            while (i2 < f.length) {
                Node node2 = f[i2];
                try {
                    if (node2.getNodeType() == (short) 1) {
                        if (!C1525a.m10593c(node, false).equals(C1525a.m10593c(node2, false))) {
                            continue;
                        } else if (node2.equals(node)) {
                            i3 = i + 1;
                        } else {
                            i++;
                            if (i3 > 0) {
                                i2 = i3;
                                break;
                            }
                        }
                    }
                    i2++;
                } catch (IndexOutOfBoundsException e) {
                    throw e;
                } catch (IndexOutOfBoundsException e2) {
                    throw e2;
                }
            }
            i2 = i3;
        } else {
            i = 0;
        }
        return i > 0 ? i2 : -1;
    }

    /* renamed from: j */
    private boolean m10674j(Node node) {
        int i = 2;
        boolean z = true;
        boolean z2 = false;
        try {
            if (m10664a(node.getNodeType())) {
                try {
                    boolean a = this.f4692a.m10643d() ? this.f4692a.m10641b() == null ? true : m10665a(C1525a.m10596d(node, false), this.f4692a.m10641b(), this.f4692a.m10644e(), this.f4692a.m10646g()) : false;
                    if (!a) {
                        try {
                            if (this.f4692a.m10637a() != 0) {
                                if (node.getNodeType() != (short) 2) {
                                    i = 1;
                                }
                                try {
                                    if ((this.f4692a.m10637a() & i) == i) {
                                        if (this.f4692a.m10641b() == null) {
                                            z2 = true;
                                        } else {
                                            try {
                                                if ((this.f4692a.m10644e() & 32) != 32) {
                                                    z = false;
                                                }
                                                z2 = m10665a(C1525a.m10593c(node, z), this.f4692a.m10641b(), this.f4692a.m10644e(), this.f4692a.m10646g());
                                            } catch (IndexOutOfBoundsException e) {
                                                throw e;
                                            }
                                        }
                                        if (z2) {
                                            try {
                                                m10675k(node);
                                            } catch (IndexOutOfBoundsException e2) {
                                                throw e2;
                                            }
                                        }
                                    }
                                } catch (IndexOutOfBoundsException e22) {
                                    throw e22;
                                }
                            }
                        } catch (IndexOutOfBoundsException e222) {
                            throw e222;
                        }
                    }
                    z2 = a;
                    if (z2) {
                        m10675k(node);
                    }
                } catch (IndexOutOfBoundsException e2222) {
                    throw e2222;
                }
            }
            return z2;
        } catch (IndexOutOfBoundsException e22222) {
            throw e22222;
        }
    }

    /* renamed from: k */
    private void m10675k(Node node) {
        this.f4693b = true;
        this.f4698g = false;
        this.f4696e = node;
    }

    /* renamed from: l */
    private boolean m10676l(Node node) {
        Node[] f = m10671f(node);
        boolean z = false;
        int length = f.length - 1;
        while (!z && length >= 0) {
            this.f4692a.m10647h().push(new Integer(length));
            Node node2 = f[length];
            z = m10674j(node2);
            if (!z) {
                z = m10676l(node2);
                if (z) {
                    continue;
                } else {
                    try {
                        this.f4692a.m10647h().pop();
                    } catch (IndexOutOfBoundsException e) {
                        throw e;
                    }
                }
            }
            length--;
        }
        return z;
    }

    /* renamed from: q */
    private Node m10677q() {
        int i = 0;
        try {
            if (this.f4696e == null) {
                return null;
            }
            if (this.f4696e.hasAttributes()) {
                NamedNodeMap attributes = this.f4696e.getAttributes();
                int i2 = 0;
                while (i2 < attributes.getLength()) {
                    Node item = attributes.item(i2);
                    String toLowerCase = item.getNodeName().toLowerCase();
                    try {
                        if (!toLowerCase.startsWith(f4691z[0])) {
                            if (!toLowerCase.startsWith(f4691z[1])) {
                                return item;
                            }
                        }
                        i2++;
                    } catch (IndexOutOfBoundsException e) {
                        throw e;
                    } catch (IndexOutOfBoundsException e2) {
                        throw e2;
                    }
                }
            }
            NodeList childNodes = this.f4696e.getChildNodes();
            if (childNodes != null) {
                try {
                    if (childNodes.getLength() != 0) {
                        while (i < childNodes.getLength()) {
                            Node item2 = childNodes.item(i);
                            try {
                                if (m10664a(item2.getNodeType())) {
                                    return item2;
                                }
                                i++;
                            } catch (IndexOutOfBoundsException e22) {
                                throw e22;
                            }
                        }
                        return null;
                    }
                } catch (IndexOutOfBoundsException e222) {
                    throw e222;
                }
            }
            return null;
        } catch (IndexOutOfBoundsException e2222) {
            throw e2222;
        }
    }

    /* renamed from: s */
    private Node m10678s() {
        try {
            if (this.f4696e == null) {
                return null;
            }
            int length;
            Node item;
            NodeList childNodes = this.f4696e.getChildNodes();
            if (childNodes != null) {
                try {
                    if (childNodes.getLength() != 0) {
                        length = childNodes.getLength() - 1;
                        while (length >= 0) {
                            item = childNodes.item(length);
                            try {
                                if (m10664a(item.getNodeType())) {
                                    return item;
                                }
                                length--;
                            } catch (IndexOutOfBoundsException e) {
                                throw e;
                            }
                        }
                        return null;
                    }
                } catch (IndexOutOfBoundsException e2) {
                    throw e2;
                }
            }
            if (!this.f4696e.hasAttributes()) {
                return null;
            }
            NamedNodeMap attributes = this.f4696e.getAttributes();
            length = attributes.getLength() - 1;
            while (length >= 0) {
                item = attributes.item(length);
                String toLowerCase = item.getNodeName().toLowerCase();
                try {
                    if (!toLowerCase.startsWith(f4691z[0])) {
                        if (!toLowerCase.startsWith(f4691z[1])) {
                            return item;
                        }
                    }
                    length--;
                } catch (IndexOutOfBoundsException e22) {
                    throw e22;
                } catch (IndexOutOfBoundsException e222) {
                    throw e222;
                }
            }
            return null;
        } catch (IndexOutOfBoundsException e2222) {
            throw e2222;
        }
    }

    /* renamed from: t */
    private void m10679t() {
        this.f4693b = false;
        this.f4698g = true;
    }

    /* renamed from: z */
    private static String m10680z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 91;
                    break;
                case 1:
                    i2 = 62;
                    break;
                case 2:
                    i2 = 39;
                    break;
                case 3:
                    i2 = 10;
                    break;
                default:
                    i2 = 83;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10681z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 83);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public synchronized String m10682a(int i, String str) throws Exception {
        String a;
        boolean z = true;
        synchronized (this) {
            Node node = this.f4695d;
            if ((i & 1) == 1) {
                node = m10662a(false);
            }
            try {
                Document document = this.f4695d;
                if ((i & 2) == 2) {
                    z = false;
                }
                a = C1535e.m10722a(document, node, z, str);
            } catch (Exception e) {
                throw e;
            }
        }
        return a;
    }

    /* renamed from: a */
    public synchronized String m10683a(String str, int i) throws C1537g {
        String str2;
        int i2 = 0;
        synchronized (this) {
            Node a = m10662a(false);
            try {
                if (a.hasAttributes()) {
                    boolean z;
                    if ((i & 16) == 16) {
                        i -= 16;
                        z = true;
                    } else {
                        z = false;
                    }
                    str2 = null;
                    NamedNodeMap attributes = a.getAttributes();
                    while (i2 < attributes.getLength()) {
                        Node item = attributes.item(i2);
                        if (m10665a(item.getNodeName(), str, i, z)) {
                            str2 = item.getNodeValue();
                            break;
                        }
                        i2++;
                    }
                    if (str2 == null) {
                        throw new C1537g(C0745b.m3222b(f4691z[9], str));
                    }
                } else {
                    throw new C1537g(C0745b.m3222b(f4691z[9], str));
                }
            } catch (C1537g e) {
                throw e;
            } catch (C1537g e2) {
                throw e2;
            }
        }
        return str2;
    }

    /* renamed from: a */
    public synchronized void m10684a(String str) throws C1537g {
        Node a = m10662a(false);
        try {
            switch (a.getNodeType()) {
                case (short) 1:
                    m10663a(a, str);
                    break;
                case (short) 2:
                case (short) 4:
                case (short) 8:
                    a.setNodeValue(str);
                    break;
            }
        } catch (C1537g e) {
            throw e;
        }
        return;
    }

    /* renamed from: a */
    public synchronized void mo3812a(String str, boolean z, int i, int i2, boolean z2, int i3) throws C1537g {
        this.f4692a = new C1528a(str, z, i, i2, z2, i3);
        this.f4692a.m10639a(m10662a(true));
    }

    /* renamed from: a */
    public synchronized boolean mo3813a() throws C1537g {
        boolean z = true;
        synchronized (this) {
            Node c = m10668c(m10662a(true));
            if (c != null) {
                try {
                    m10675k(c);
                } catch (C1537g e) {
                    throw e;
                }
            } else {
                m10679t();
                z = false;
            }
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized boolean mo3814a(int r8, int r9) throws fr.pcsoft.wdjava.xml.C1537g {
        /*
        r7 = this;
        r6 = 1;
        monitor-enter(r7);
        r0 = r7.f4697f;	 Catch:{ g -> 0x0090 }
        if (r0 == 0) goto L_0x0018;
    L_0x0006:
        if (r8 < 0) goto L_0x0018;
    L_0x0008:
        r0 = r7.f4697f;	 Catch:{ g -> 0x0094 }
        r0 = r0.size();	 Catch:{ g -> 0x0094 }
        if (r8 >= r0) goto L_0x0018;
    L_0x0010:
        r0 = r7.f4697f;	 Catch:{ g -> 0x0096 }
        r0 = r0.get(r8);	 Catch:{ g -> 0x0096 }
        if (r0 != 0) goto L_0x005d;
    L_0x0018:
        r0 = new java.lang.StringBuilder;	 Catch:{ g -> 0x0096 }
        r0.<init>();	 Catch:{ g -> 0x0096 }
        r1 = f4691z;	 Catch:{ g -> 0x0096 }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ g -> 0x0096 }
        r2 = 1;
        r2 = new java.lang.String[r2];	 Catch:{ g -> 0x0096 }
        r3 = 0;
        r4 = f4691z;	 Catch:{ g -> 0x0096 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ g -> 0x0096 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3221b(r4);	 Catch:{ g -> 0x0096 }
        r2[r3] = r4;	 Catch:{ g -> 0x0096 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ g -> 0x0096 }
        r0 = r0.append(r1);	 Catch:{ g -> 0x0096 }
        r1 = "\n";
        r0 = r0.append(r1);	 Catch:{ g -> 0x0096 }
        r1 = f4691z;	 Catch:{ g -> 0x0096 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ g -> 0x0096 }
        r2 = 1;
        r2 = new java.lang.String[r2];	 Catch:{ g -> 0x0096 }
        r3 = 0;
        r4 = java.lang.String.valueOf(r8);	 Catch:{ g -> 0x0096 }
        r2[r3] = r4;	 Catch:{ g -> 0x0096 }
        r1 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);	 Catch:{ g -> 0x0096 }
        r0 = r0.append(r1);	 Catch:{ g -> 0x0096 }
        r0 = r0.toString();	 Catch:{ g -> 0x0096 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ g -> 0x0096 }
    L_0x005d:
        r0 = r7.f4697f;	 Catch:{ all -> 0x0098 }
        r0 = r0.get(r8);	 Catch:{ all -> 0x0098 }
        r0 = (fr.pcsoft.wdjava.xml.classic.C1531c) r0;	 Catch:{ all -> 0x0098 }
        r1 = r0.f4700b;	 Catch:{ g -> 0x009b }
        r7.f4693b = r1;	 Catch:{ g -> 0x009b }
        r1 = r0.f4702d;	 Catch:{ g -> 0x009b }
        r7.f4698g = r1;	 Catch:{ g -> 0x009b }
        r1 = r9 & 8;
        r2 = 8;
        if (r1 != r2) goto L_0x0077;
    L_0x0073:
        r1 = r0.f4699a;	 Catch:{ g -> 0x009b }
        r7.f4692a = r1;	 Catch:{ g -> 0x009b }
    L_0x0077:
        r0 = r0.f4701c;	 Catch:{ all -> 0x0098 }
        if (r0 == 0) goto L_0x009f;
    L_0x007b:
        r1 = r0.getOwnerDocument();	 Catch:{ g -> 0x009d }
        if (r1 == 0) goto L_0x009f;
    L_0x0081:
        r7.f4696e = r0;	 Catch:{ g -> 0x009d }
    L_0x0083:
        r0 = r9 & 2;
        r1 = 2;
        if (r0 == r1) goto L_0x008e;
    L_0x0088:
        r0 = r7.f4697f;	 Catch:{ g -> 0x00a3 }
        r1 = 0;
        r0.set(r8, r1);	 Catch:{ g -> 0x00a3 }
    L_0x008e:
        monitor-exit(r7);
        return r6;
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ g -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ g -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ g -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0098 }
    L_0x0098:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0098 }
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0098 }
    L_0x009f:
        r0 = 0;
        r7.f4696e = r0;	 Catch:{ all -> 0x0098 }
        goto L_0x0083;
    L_0x00a3:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0098 }
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.xml.classic.b.a(int, int):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized boolean m10688a(fr.pcsoft.wdjava.xml.classic.C1530b r6, int r7) throws fr.pcsoft.wdjava.xml.C1537g {
        /*
        r5 = this;
        r0 = 0;
        r1 = 1;
        monitor-enter(r5);
        r2 = 0;
        r3 = r5.m10662a(r2);	 Catch:{ all -> 0x0038 }
        r2 = 0;
        r2 = r6.m10662a(r2);	 Catch:{ all -> 0x0038 }
        if (r2 != 0) goto L_0x0017;
    L_0x000f:
        r2 = r6.m10710n();	 Catch:{ all -> 0x0038 }
        if (r2 != 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r5);
        return r0;
    L_0x0017:
        r0 = r2;
        r2 = r5.f4695d;	 Catch:{ all -> 0x0038 }
        r4 = 1;
        r4 = r2.importNode(r0, r4);	 Catch:{ all -> 0x0038 }
        r0 = 16;
        if (r7 == r0) goto L_0x0060;
    L_0x0023:
        r0 = r3.getNodeType();	 Catch:{ IndexOutOfBoundsException -> 0x0036 }
        switch(r0) {
            case 1: goto L_0x003b;
            case 2: goto L_0x002c;
            default: goto L_0x002a;
        };	 Catch:{ IndexOutOfBoundsException -> 0x0036 }
    L_0x002a:
        r0 = r1;
        goto L_0x0015;
    L_0x002c:
        r0 = r5.m10672g(r3);	 Catch:{ IndexOutOfBoundsException -> 0x0036 }
        r0 = (org.w3c.dom.Element) r0;	 Catch:{ IndexOutOfBoundsException -> 0x0036 }
        r0.appendChild(r4);	 Catch:{ IndexOutOfBoundsException -> 0x0036 }
        goto L_0x002a;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
    L_0x003b:
        r0 = r5.m10672g(r3);	 Catch:{ all -> 0x0038 }
        r0 = (org.w3c.dom.Element) r0;	 Catch:{ all -> 0x0038 }
        if (r0 != 0) goto L_0x0045;
    L_0x0043:
        r0 = r1;
        goto L_0x0015;
    L_0x0045:
        if (r7 != r1) goto L_0x004d;
    L_0x0047:
        r0.insertBefore(r4, r3);	 Catch:{ IndexOutOfBoundsException -> 0x004b }
        goto L_0x002a;
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0038 }
    L_0x004d:
        r2 = r3.getNextSibling();	 Catch:{ IndexOutOfBoundsException -> 0x0059 }
    L_0x0051:
        if (r2 == 0) goto L_0x005c;
    L_0x0053:
        r0.insertBefore(r4, r2);	 Catch:{ IndexOutOfBoundsException -> 0x0057 }
        goto L_0x002a;
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0038 }
    L_0x0059:
        r2 = move-exception;
        r2 = 0;
        goto L_0x0051;
    L_0x005c:
        r0.appendChild(r4);	 Catch:{ all -> 0x0038 }
        goto L_0x002a;
    L_0x0060:
        r3.appendChild(r4);	 Catch:{ all -> 0x0038 }
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.xml.classic.b.a(fr.pcsoft.wdjava.xml.classic.b, int):boolean");
    }

    /* renamed from: a */
    public synchronized boolean m10689a(String str, String str2, boolean z) throws C1537g {
        Node a;
        if (this.f4695d.getDocumentElement() != null) {
            a = m10662a(false);
            Node createElement;
            switch (a.getNodeType()) {
                case (short) 1:
                    createElement = this.f4695d.createElement(str);
                    createElement.appendChild(this.f4695d.createTextNode(str2));
                    ((Element) a).appendChild(createElement);
                    a = createElement;
                    break;
                case (short) 2:
                    createElement = this.f4695d.createElement(str);
                    createElement.appendChild(this.f4695d.createTextNode(str2));
                    ((Element) m10672g(a)).appendChild(createElement);
                    a = createElement;
                    break;
                default:
                    a = null;
                    break;
            }
        }
        a = this.f4695d.createElement(str);
        a.appendChild(this.f4695d.createTextNode(str2));
        this.f4695d.appendChild(a);
        z = true;
        if (z && a != null) {
            try {
                m10675k(a);
            } catch (C1537g e) {
                throw e;
            }
        }
        return a != null;
    }

    /* renamed from: a */
    public synchronized boolean mo3815a(Node node) throws C1537g {
        boolean z;
        if (node == null) {
            node = m10662a(true);
        }
        z = false;
        try {
            if (this.f4692a != null) {
                Node node2;
                Node node3;
                if ((this.f4692a.m10642c() & 16) == 16) {
                    boolean d = m10669d(node);
                    node2 = node;
                    while (!d) {
                        if (this.f4692a.m10647h().empty()) {
                            break;
                        }
                        Integer num = (Integer) this.f4692a.m10647h().pop();
                        if (num != null) {
                            node2 = m10666b(num, node2);
                            if (node2 != null) {
                                z = m10674j(node2);
                                if (z) {
                                    node3 = node2;
                                } else {
                                    z = m10669d(node2);
                                    node3 = node2;
                                }
                                node2 = node3;
                                d = z;
                            }
                        }
                        z = d;
                        node3 = node2;
                        node2 = node3;
                        d = z;
                    }
                    z = d;
                }
                if (!z) {
                    if ((this.f4692a.m10642c() & 32) == 32) {
                        node3 = m10668c(this.f4692a.m10645f());
                        if (node3 != null) {
                            this.f4692a.m10639a(node3);
                            z = m10674j(node3);
                            if (!z) {
                                z = mo3815a(node3);
                            }
                        }
                    }
                }
                if (!z) {
                    if ((this.f4692a.m10642c() & 64) == 64) {
                        if ((this.f4692a.m10642c() & 16) == 16) {
                            node3 = m10668c(this.f4692a.m10645f());
                            if (node3 != null) {
                                if (node3.getNodeType() == (short) 1) {
                                    this.f4692a.m10639a(node3);
                                    z = m10674j(node3);
                                    if (!z) {
                                        z = mo3815a(node3);
                                    }
                                }
                            }
                        }
                        if (!z) {
                            node3 = m10672g(this.f4692a.m10645f());
                            while (node3 != null) {
                                node2 = m10668c(node3);
                                if (node2 != null) {
                                    this.f4692a.m10639a(node2);
                                    z = m10674j(node2);
                                    if (!z) {
                                        z = mo3815a(node2);
                                    }
                                } else {
                                    node3 = m10672g(node3);
                                }
                            }
                        }
                    }
                }
            }
            if (!z) {
                m10679t();
            }
        } catch (C1537g e) {
            throw e;
        } catch (C1537g e2) {
            throw e2;
        } catch (C1537g e22) {
            throw e22;
        } catch (C1537g e222) {
            throw e222;
        } catch (C1537g e2222) {
            throw e2222;
        } catch (C1537g e22222) {
            throw e22222;
        }
        return z;
    }

    /* renamed from: b */
    public synchronized int mo3816b() throws C1537g {
        Node a = m10662a(false);
        C1531c c1531c = new C1531c();
        try {
            c1531c.f4699a = this.f4692a;
            c1531c.f4700b = this.f4693b;
            c1531c.f4702d = this.f4698g;
            c1531c.f4701c = a;
            if (this.f4697f == null) {
                this.f4697f = new ArrayList();
            }
            this.f4697f.add(c1531c);
        } catch (C1537g e) {
            throw e;
        }
        return this.f4697f.size() - 1;
    }

    /* renamed from: b */
    public synchronized boolean m10692b(int i) throws C1537g {
        boolean z = false;
        synchronized (this) {
            Node a = m10662a(false);
            try {
                if (a.getNodeType() == (short) 1) {
                    Node[] f = m10671f(a);
                    for (Node node : f) {
                        int i2 = node.getNodeType() == (short) 2 ? 2 : 0;
                        if (node.getNodeType() == (short) 8 || node.getNodeType() == (short) 1) {
                            i2 = 1;
                        }
                        if ((i2 & i) == i2) {
                            z = true;
                            break;
                        }
                    }
                }
            } catch (C1537g e) {
                throw e;
            } catch (C1537g e2) {
                throw e2;
            }
        }
        return z;
    }

    /* renamed from: b */
    public synchronized boolean m10693b(String str, String str2, int i, boolean z) throws C1537g {
        Node node = null;
        boolean z2 = true;
        synchronized (this) {
            Node createElement;
            if (this.f4695d.getDocumentElement() != null) {
                Node a = m10662a(false);
                switch (a.getNodeType()) {
                    case (short) 1:
                        Element element = (Element) m10672g(a);
                        if (element != null) {
                            createElement = this.f4695d.createElement(str);
                            try {
                                createElement.appendChild(this.f4695d.createTextNode(str2));
                                if (i != 1) {
                                    try {
                                        node = a.getNextSibling();
                                    } catch (IndexOutOfBoundsException e) {
                                    }
                                    if (node == null) {
                                        element.appendChild(createElement);
                                        break;
                                    }
                                    element.insertBefore(createElement, node);
                                    break;
                                }
                                element.insertBefore(createElement, a);
                                break;
                            } catch (IndexOutOfBoundsException e2) {
                                throw e2;
                            } catch (IndexOutOfBoundsException e22) {
                                throw e22;
                            } catch (IndexOutOfBoundsException e222) {
                                throw e222;
                            }
                        }
                        break;
                    case (short) 2:
                        createElement = this.f4695d.createAttribute(str);
                        createElement.setNodeValue(str2);
                        ((Element) m10672g(a)).setAttributeNode((Attr) createElement);
                        break;
                    default:
                        createElement = node;
                        break;
                }
            }
            createElement = this.f4695d.createElement(str);
            createElement.appendChild(this.f4695d.createTextNode(str2));
            this.f4695d.appendChild(createElement);
            if (z && createElement != null) {
                m10675k(createElement);
            }
            z2 = createElement != null;
        }
        return z2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public synchronized boolean m10694b(java.lang.String r5, java.lang.String r6, boolean r7) throws fr.pcsoft.wdjava.xml.C1537g {
        /*
        r4 = this;
        r1 = 0;
        monitor-enter(r4);
        r2 = 0;
        r0 = 0;
        r0 = r4.m10662a(r0);	 Catch:{ all -> 0x0042 }
        r3 = r0.getNodeType();	 Catch:{ all -> 0x0042 }
        switch(r3) {
            case 1: goto L_0x0030;
            case 2: goto L_0x001c;
            default: goto L_0x000f;
        };
    L_0x000f:
        r0 = r2;
    L_0x0010:
        if (r7 == 0) goto L_0x0017;
    L_0x0012:
        if (r0 == 0) goto L_0x0017;
    L_0x0014:
        r4.m10675k(r0);	 Catch:{ g -> 0x0040 }
    L_0x0017:
        if (r0 == 0) goto L_0x0045;
    L_0x0019:
        r0 = 1;
    L_0x001a:
        monitor-exit(r4);
        return r0;
    L_0x001c:
        r2 = r4.f4695d;	 Catch:{ all -> 0x0042 }
        r2 = r2.createAttribute(r5);	 Catch:{ all -> 0x0042 }
        r2.setNodeValue(r6);	 Catch:{ all -> 0x0042 }
        r0 = r4.m10672g(r0);	 Catch:{ all -> 0x0042 }
        r0 = (org.w3c.dom.Element) r0;	 Catch:{ all -> 0x0042 }
        r0.setAttributeNode(r2);	 Catch:{ all -> 0x0042 }
        r0 = r2;
        goto L_0x0010;
    L_0x0030:
        r2 = r4.f4695d;	 Catch:{ all -> 0x0042 }
        r2 = r2.createAttribute(r5);	 Catch:{ all -> 0x0042 }
        r2.setNodeValue(r6);	 Catch:{ all -> 0x0042 }
        r0 = (org.w3c.dom.Element) r0;	 Catch:{ all -> 0x0042 }
        r0.setAttributeNode(r2);	 Catch:{ all -> 0x0042 }
        r0 = r2;
        goto L_0x0010;
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0045:
        r0 = r1;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.xml.classic.b.b(java.lang.String, java.lang.String, boolean):boolean");
    }

    /* renamed from: b */
    public synchronized boolean mo3817b(Node node) throws C1537g {
        boolean z;
        if (node == null) {
            node = m10662a(true);
        }
        z = false;
        try {
            if (this.f4692a != null) {
                Node node2;
                Node node3;
                if ((this.f4692a.m10642c() & 16) == 16) {
                    boolean l = m10676l(node);
                    node2 = node;
                    while (!l) {
                        if (this.f4692a.m10647h().empty()) {
                            break;
                        }
                        Integer num = (Integer) this.f4692a.m10647h().pop();
                        if (num != null) {
                            node2 = m10661a(num, node2);
                            if (node2 != null) {
                                z = m10674j(node2);
                                if (z) {
                                    node3 = node2;
                                } else {
                                    z = m10676l(node2);
                                    node3 = node2;
                                }
                                node2 = node3;
                                l = z;
                            }
                        }
                        z = l;
                        node3 = node2;
                        node2 = node3;
                        l = z;
                    }
                    z = l;
                }
                if (!z) {
                    if ((this.f4692a.m10642c() & 32) == 32) {
                        node3 = m10670e(this.f4692a.m10645f());
                        if (node3 != null) {
                            this.f4692a.m10639a(node3);
                            z = m10674j(node3);
                            if (!z) {
                                z = mo3817b(node3);
                            }
                        }
                    }
                }
                if (!z) {
                    if ((this.f4692a.m10642c() & 64) == 64) {
                        if ((this.f4692a.m10642c() & 16) == 16) {
                            node3 = m10670e(this.f4692a.m10645f());
                            if (node3 != null) {
                                this.f4692a.m10639a(node3);
                                z = m10674j(node3);
                                if (!z) {
                                    z = mo3817b(node3);
                                }
                            }
                        }
                        if (!z) {
                            node3 = m10672g(this.f4692a.m10645f());
                            while (node3 != null) {
                                node2 = m10670e(node3);
                                if (node2 != null) {
                                    this.f4692a.m10639a(node2);
                                    z = m10674j(node2);
                                    if (!z) {
                                        z = mo3817b(node2);
                                    }
                                } else {
                                    node3 = m10672g(node3);
                                }
                            }
                        }
                    }
                }
            }
            if (!z) {
                m10679t();
            }
        } catch (C1537g e) {
            throw e;
        } catch (C1537g e2) {
            throw e2;
        } catch (C1537g e22) {
            throw e22;
        } catch (C1537g e222) {
            throw e222;
        } catch (C1537g e2222) {
            throw e2222;
        }
        return z;
    }

    /* renamed from: c */
    public synchronized String mo3818c() throws C1537g {
        String str;
        Node a = m10662a(false);
        if (a == null) {
            try {
                str = "";
            } catch (C1537g e) {
                throw e;
            }
        } else {
            str = C1525a.m10596d(a, false);
        }
        return str;
    }

    /* renamed from: c */
    public synchronized boolean m10697c(String str) throws C1537g {
        boolean z;
        int i = 0;
        synchronized (this) {
            if (m10662a(false) == null) {
                z = false;
            } else {
                try {
                    if (m10667b(str)) {
                        Node g = m10672g(this.f4696e);
                        if (g == null) {
                            g = this.f4695d;
                        }
                        switch (this.f4696e.getNodeType()) {
                            case (short) 1:
                                Node createElement = this.f4695d.createElement(str);
                                NamedNodeMap attributes = this.f4696e.getAttributes();
                                if (attributes != null) {
                                    for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                                        Node item = attributes.item(i2);
                                        ((Element) createElement).setAttribute(item.getNodeName(), item.getNodeValue());
                                    }
                                }
                                NodeList childNodes = this.f4696e.getChildNodes();
                                while (i < childNodes.getLength()) {
                                    createElement.appendChild(childNodes.item(i).cloneNode(true));
                                    i++;
                                }
                                g.replaceChild(createElement, this.f4696e);
                                this.f4696e = createElement;
                                break;
                            case (short) 2:
                                Node createAttribute = this.f4695d.createAttribute(str);
                                createAttribute.setNodeValue(this.f4696e.getNodeValue());
                                ((Element) g).removeAttributeNode((Attr) this.f4696e);
                                ((Element) g).setAttributeNodeNS(createAttribute);
                                this.f4696e = createAttribute;
                                break;
                        }
                        z = true;
                    } else {
                        throw new C1537g(C0745b.m3222b(f4691z[10], str));
                    }
                } catch (C1537g e) {
                    throw e;
                } catch (C1537g e2) {
                    throw e2;
                }
            }
        }
        return z;
    }

    /* renamed from: d */
    public synchronized C1530b m10698d(String str) throws C1537g, ParserConfigurationException {
        Document newDocument;
        Node a = m10662a(false);
        newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        newDocument.appendChild(newDocument.importNode(a, true));
        return new C1530b(str, newDocument);
    }

    /* renamed from: d */
    public void mo3819d() {
        this.f4692a = null;
    }

    /* renamed from: e */
    public synchronized int mo3820e() throws C1537g {
        int i = 2;
        synchronized (this) {
            if (m10662a(false) == null) {
                i = -1;
            } else {
                try {
                    if (this.f4696e.getNodeType() != (short) 2) {
                        i = 1;
                    }
                } catch (C1537g e) {
                    throw e;
                }
            }
        }
        return i;
    }

    /* renamed from: f */
    public synchronized boolean mo3821f() throws C1537g {
        boolean z = true;
        synchronized (this) {
            Node e = m10670e(m10662a(true));
            if (e != null) {
                try {
                    m10675k(e);
                } catch (C1537g e2) {
                    throw e2;
                }
            } else {
                m10679t();
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    public synchronized boolean mo3822g() throws C1537g {
        boolean z;
        Node q = m10677q();
        if (q != null) {
            try {
                m10675k(q);
                z = true;
            } catch (C1537g e) {
                throw e;
            }
        } else {
            m10679t();
            z = false;
        }
        return z;
    }

    /* renamed from: h */
    public synchronized String mo3823h() throws C1537g {
        String str;
        Node a = m10662a(false);
        if (a == null) {
            try {
                str = "";
            } catch (C1537g e) {
                throw e;
            }
        } else {
            str = C1525a.m10593c(a, false);
        }
        return str;
    }

    /* renamed from: h */
    public synchronized String m10704h(Node node) throws C1537g {
        String str;
        if (node == null) {
            node = m10662a(false);
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            if (node.getNodeType() == (short) 2) {
                stringBuffer.append(f4691z[3]).append(node.getNodeName());
                str = m10704h(m10672g(node)) + stringBuffer.toString();
            } else {
                Node g = m10672g(node);
                if (g != null) {
                    stringBuffer = new StringBuffer(m10704h(g));
                }
                stringBuffer.append("/").append(C1525a.m10593c(node, true));
                int i = m10673i(node);
                if (i > 0) {
                    stringBuffer.append("[").append(i).append("]");
                }
                str = stringBuffer.toString();
            }
        } catch (C1537g e) {
            throw e;
        } catch (C1537g e2) {
            throw e2;
        }
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: i */
    public synchronized boolean m10705i() throws fr.pcsoft.wdjava.xml.C1537g {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f4696e;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x001d;
    L_0x0005:
        r1 = r2.f4696e;	 Catch:{ all -> 0x0022 }
        r0 = r2.f4696e;	 Catch:{ all -> 0x0022 }
        r0 = r2.m10672g(r0);	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x0025;
    L_0x000f:
        r2.f4696e = r0;	 Catch:{ all -> 0x0022 }
        r0 = r2.m10677q();	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x0025;
    L_0x0017:
        r2.m10675k(r0);	 Catch:{ all -> 0x0022 }
        r0 = 1;
    L_0x001b:
        monitor-exit(r2);
        return r0;
    L_0x001d:
        r2.m10679t();	 Catch:{ all -> 0x0022 }
        r0 = 0;
        goto L_0x001b;
    L_0x0022:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x0025:
        r0 = r1;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.xml.classic.b.i():boolean");
    }

    /* renamed from: j */
    public boolean m10706j() {
        return this.f4698g;
    }

    /* renamed from: k */
    public synchronized boolean m10707k() throws fr.pcsoft.wdjava.xml.C1537g {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.xml.classic.b.k():boolean. bs: [B:6:0x000c, B:17:0x001c]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r5 = this;
        monitor-enter(r5);
        r1 = 0;
        r3 = r5.m10662a(r1);	 Catch:{ all -> 0x0019 }
        r2 = r5.m10672g(r3);	 Catch:{ all -> 0x0019 }
        if (r2 != 0) goto L_0x001c;
    L_0x000c:
        r1 = r5.f4695d;	 Catch:{ g -> 0x0017 }
        r1.removeChild(r3);	 Catch:{ g -> 0x0017 }
        r1 = 0;	 Catch:{ g -> 0x0017 }
        r5.f4696e = r1;	 Catch:{ g -> 0x0017 }
    L_0x0014:
        r1 = 1;
        monitor-exit(r5);
        return r1;
    L_0x0017:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0019 }
    L_0x0019:
        r1 = move-exception;
        monitor-exit(r5);
        throw r1;
    L_0x001c:
        r1 = r3.getNodeType();	 Catch:{ g -> 0x002f }
        r4 = 2;	 Catch:{ g -> 0x002f }
        if (r1 != r4) goto L_0x0031;	 Catch:{ g -> 0x002f }
    L_0x0023:
        r0 = r2;	 Catch:{ g -> 0x002f }
        r0 = (org.w3c.dom.Element) r0;	 Catch:{ g -> 0x002f }
        r1 = r0;	 Catch:{ g -> 0x002f }
        r3 = (org.w3c.dom.Attr) r3;	 Catch:{ g -> 0x002f }
        r1.removeAttributeNode(r3);	 Catch:{ g -> 0x002f }
    L_0x002c:
        r5.f4696e = r2;	 Catch:{ all -> 0x0019 }
        goto L_0x0014;	 Catch:{ all -> 0x0019 }
    L_0x002f:
        r1 = move-exception;	 Catch:{ all -> 0x0019 }
        throw r1;	 Catch:{ all -> 0x0019 }
    L_0x0031:
        r2.removeChild(r3);	 Catch:{ all -> 0x0019 }
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.xml.classic.b.k():boolean");
    }

    /* renamed from: l */
    public boolean m10708l() {
        return this.f4693b;
    }

    /* renamed from: m */
    public void m10709m() {
        try {
            this.f4694c = null;
            this.f4695d = null;
            this.f4696e = null;
            if (this.f4692a != null) {
                this.f4692a.m10648i();
                this.f4692a = null;
            }
            if (this.f4697f != null) {
                Iterator it = this.f4697f.iterator();
                while (it.hasNext()) {
                    C1531c c1531c = (C1531c) it.next();
                    if (c1531c != null) {
                        try {
                            c1531c.m10719a();
                        } catch (IndexOutOfBoundsException e) {
                            throw e;
                        }
                    }
                }
                this.f4697f.clear();
                this.f4697f = null;
            }
        } catch (IndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    /* renamed from: n */
    public Node m10710n() {
        return this.f4695d.getDocumentElement();
    }

    /* renamed from: o */
    public synchronized String m10711o() throws C1537g {
        String str;
        try {
            if (m10662a(false).getNodeType() != (short) 1) {
                str = "";
            } else {
                str = this.f4696e.getNamespaceURI();
                if (str == null) {
                    str = "";
                }
            }
        } catch (C1537g e) {
            throw e;
        }
        return str;
    }

    /* renamed from: p */
    public synchronized boolean m10712p() {
        boolean z;
        try {
            if (this.f4695d.getDocumentElement() != null) {
                this.f4696e = this.f4695d.getDocumentElement();
                z = true;
            } else {
                z = false;
            }
        } catch (IndexOutOfBoundsException e) {
            throw e;
        }
        return z;
    }

    /* renamed from: r */
    public synchronized String m10713r() throws C1537g {
        String c;
        Node a = m10662a(false);
        if (a != null) {
            try {
                if (m10672g(a) != null) {
                    c = C1525a.m10593c(m10672g(this.f4696e), false);
                }
            } catch (C1537g e) {
                throw e;
            }
        }
        c = "";
        return c;
    }

    /* renamed from: u */
    public synchronized void m10714u() {
        this.f4695d = null;
        this.f4696e = null;
        this.f4692a = null;
    }

    /* renamed from: v */
    public boolean m10715v() {
        try {
            return this.f4692a != null;
        } catch (IndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: w */
    public synchronized boolean m10716w() throws fr.pcsoft.wdjava.xml.C1537g {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f4696e;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x001d;
    L_0x0005:
        r1 = r2.f4696e;	 Catch:{ all -> 0x0022 }
        r0 = r2.f4696e;	 Catch:{ all -> 0x0022 }
        r0 = r2.m10672g(r0);	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x0025;
    L_0x000f:
        r2.f4696e = r0;	 Catch:{ all -> 0x0022 }
        r0 = r2.m10678s();	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x0025;
    L_0x0017:
        r2.m10675k(r0);	 Catch:{ all -> 0x0022 }
        r0 = 1;
    L_0x001b:
        monitor-exit(r2);
        return r0;
    L_0x001d:
        r2.m10679t();	 Catch:{ all -> 0x0022 }
        r0 = 0;
        goto L_0x001b;
    L_0x0022:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x0025:
        r0 = r1;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.xml.classic.b.w():boolean");
    }

    /* renamed from: x */
    public synchronized boolean m10717x() throws C1537g {
        if (this.f4696e != null) {
            Node g = m10672g(this.f4696e);
            if (g == null) {
                try {
                    m10679t();
                    throw new C1537g(C0745b.m3222b(f4691z[7], new String[0]));
                } catch (C1537g e) {
                    throw e;
                }
            } else {
                m10675k(g);
            }
        } else {
            m10679t();
            throw new C1537g(C0745b.m3222b(f4691z[2], this.f4694c));
        }
        return true;
    }

    /* renamed from: y */
    public synchronized String m10718y() throws C1537g {
        String prefix;
        m10662a(false);
        prefix = this.f4696e.getPrefix();
        if (prefix == null) {
            prefix = "";
        }
        return prefix;
    }
}
