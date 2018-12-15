package fr.pcsoft.wdjava.core.p043d.p044a;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p043d.C0688c;
import fr.pcsoft.wdjava.core.p043d.C0690f;
import fr.pcsoft.wdjava.core.poo.C0733z;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.xml.C1525a;
import fr.pcsoft.wdjava.xml.C1537g;
import fr.pcsoft.wdjava.xml.classic.C1529e;
import fr.pcsoft.wdjava.xml.classic.C1530b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.xml.parsers.DocumentBuilder;

/* renamed from: fr.pcsoft.wdjava.core.d.a.c */
public class C0683c implements C0682d {
    /* renamed from: z */
    private static final String[] f1738z = new String[]{C0683c.m2816z(C0683c.m2817z("i:RrD\u000b(BsL\u00185\\l@\u0019=IiF\u0004#TnJ\u0005.OeJ\u001e")), C0683c.m2816z(C0683c.m2817z("\"\u000exF")), C0683c.m2816z(C0683c.m2817z("\u000e3^uD\u000f2I")), C0683c.m2816z(C0683c.m2817z("\u001d8YOj\u00121QZ/\u000etAe#\u000f|T`%\u0012")), C0683c.m2816z(C0683c.m2817z("i\u0015y")), C0683c.m2816z(C0683c.m2817z("\r+Yc"))};
    /* renamed from: f */
    public HashMap f1739f;
    /* renamed from: g */
    private DocumentBuilder f1740g;
    /* renamed from: h */
    public LinkedHashMap f1741h;
    /* renamed from: i */
    private C1530b f1742i;

    public C0683c() {
        this.f1741h = new LinkedHashMap();
        this.f1739f = new HashMap();
        this.f1742i = null;
        this.f1740g = null;
        this.f1740g = C1525a.m10594c();
    }

    /* renamed from: z */
    private static String m2816z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 74;
                    break;
                case 1:
                    i2 = C0607n.Hn;
                    break;
                case 2:
                    i2 = 29;
                    break;
                case 3:
                    i2 = 32;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2817z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 9);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public WDObjet mo2581a(String str) {
        return (WDObjet) this.f1741h.get(str);
    }

    /* renamed from: a */
    public C1529e mo2582a() {
        return this.f1742i;
    }

    /* renamed from: a */
    public Object mo2583a(C1529e c1529e) throws C0690f, C1537g {
        Object obj;
        int b = c1529e.mo3816b();
        c1529e.mo3812a(f1738z[1], false, 2, 16, false, 1);
        if (c1529e.mo3815a(null)) {
            obj = (WDObjet) this.f1741h.get(c1529e.mo3818c());
            if (obj == null) {
                try {
                    throw new C0690f(C0745b.m3222b(f1738z[0], new String[0]));
                } catch (C0690f e) {
                    throw e;
                }
            }
        }
        obj = c1529e.mo3818c();
        c1529e.mo3819d();
        c1529e.mo3814a(b, 0);
        return obj;
    }

    /* renamed from: a */
    public void mo2584a(WDObjet wDObjet, C0688c c0688c) throws C0690f {
        int i;
        Throwable e;
        try {
            this.f1742i = new C1530b(f1738z[3], C1525a.m10583a(this.f1740g, wDObjet, null));
            this.f1742i.m10712p();
            if (this.f1742i.mo3823h().equals(f1738z[2])) {
                if (this.f1742i.mo3820e() == 1) {
                    try {
                        if (this.f1742i.mo3822g()) {
                            do {
                                if (this.f1742i.mo3820e() == 1) {
                                    Object obj;
                                    int i2;
                                    this.f1742i.mo3823h();
                                    int b = this.f1742i.mo3816b();
                                    String str = "";
                                    if (((WDObjet) c0688c).checkType(C0733z.class) != null) {
                                        obj = f1738z[4] + 0;
                                        i2 = 1;
                                    } else {
                                        String str2 = str;
                                        i2 = 0;
                                    }
                                    this.f1741h.put(obj, c0688c);
                                    this.f1739f.put(obj, new Integer(b));
                                    while (this.f1742i.mo3813a()) {
                                        if (this.f1742i.mo3820e() == 1) {
                                            Class e2;
                                            try {
                                                e2 = C0735q.m3130e(f1738z[5] + this.f1742i.mo3823h());
                                            } catch (ClassNotFoundException e3) {
                                                e2 = null;
                                            }
                                            if (e2 == null) {
                                                continue;
                                            } else if (C0733z.class.isAssignableFrom(e2)) {
                                                try {
                                                    Object newInstance = C0735q.m3118a(C0735q.m3116a(e2)).newInstance((Object[]) null);
                                                    int b2 = this.f1742i.mo3816b();
                                                    String str3 = f1738z[4] + i2;
                                                    i = i2 + 1;
                                                    try {
                                                        this.f1741h.put(str3, newInstance);
                                                        this.f1739f.put(str3, new Integer(b2));
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        WDErreurManager.m2885a(e);
                                                        i2 = i;
                                                    }
                                                } catch (Throwable e5) {
                                                    Throwable th = e5;
                                                    i = i2;
                                                    e = th;
                                                    WDErreurManager.m2885a(e);
                                                    i2 = i;
                                                }
                                                i2 = i;
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    for (Object obj2 : this.f1741h.keySet()) {
                                        String obj3 = obj2.toString();
                                        Integer num = (Integer) this.f1739f.get(obj3);
                                        if (num != null) {
                                            this.f1742i.mo3814a(num.intValue(), 0);
                                            ((C0688c) this.f1741h.get(obj3)).deserialize((C0682d) this);
                                        }
                                    }
                                    return;
                                }
                            } while (this.f1742i.mo3813a());
                            throw new C0690f(C0745b.m3222b(f1738z[0], new String[0]));
                        }
                    } catch (ClassNotFoundException e6) {
                        throw e6;
                    } catch (NoSuchMethodException e7) {
                        throw new C0690f(C0745b.m3222b(f1738z[0], new String[0]));
                    } catch (ClassNotFoundException e62) {
                        throw e62;
                    } catch (ClassNotFoundException e622) {
                        throw e622;
                    } catch (ClassNotFoundException e6222) {
                        throw e6222;
                    } catch (C1537g e8) {
                        throw new C0690f(C0745b.m3222b(f1738z[0], new String[0]));
                    }
                }
            }
            throw new C0690f(C0745b.m3222b(f1738z[0], new String[0]));
        } catch (ClassNotFoundException e62222) {
            throw e62222;
        } catch (ClassNotFoundException e622222) {
            throw e622222;
        }
    }

    /* renamed from: b */
    public void m2822b() {
        if (this.f1741h != null) {
            this.f1741h.clear();
            this.f1741h = null;
        }
        if (this.f1739f != null) {
            this.f1739f.clear();
            this.f1739f = null;
        }
        if (this.f1742i != null) {
            this.f1742i.m10709m();
            this.f1742i = null;
        }
        this.f1740g = null;
    }
}
