package fr.pcsoft.wdjava.core.types.collection;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.parcours.p039a.C0566b;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0487y;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.g */
public abstract class C0753g extends C0487y implements C0582d {
    /* renamed from: z */
    private static final String[] f1952z = new String[]{C0753g.m3307z(C0753g.m3308z("\u0012'\b>Cp(\u00159Hn6\u001f>Qx,\u001f3Lx.\u001f3Zx.\u001f")), C0753g.m3307z(C0753g.m3308z("\u0012'\b>Ca-\t%Hx-\u00143Od2\n>Yb1\u0013#Rn+\u0014:]}+\u001e)")), C0753g.m3307z(C0753g.m3308z("\u0012'\b>Cx,\t)Ne+\u0015\"Cy-\b?Ca#\b/Sd0\t")), C0753g.m3307z(C0753g.m3308z("\u0012$\u0015\"_e+\u0015\"C-\u00143Xx1\n#")), C0753g.m3307z(C0753g.m3308z("\u0012'\b>Cp$\u001c)_e#\u000e%S=\n%Pt=\u001c%Pt=\u0016%Oe'")), C0753g.m3307z(C0753g.m3308z("\u0012'\b>Cp!\u0019)On1\u00159On'\u0016)Qt,\u000e")), C0753g.m3307z(C0753g.m3308z("\u00122\u0015?Ue+\u0015\"Cx,\t)Ne+\u0015\"Cx,\f-Px&\u001f"))};
    /* renamed from: a */
    protected IWDAllocateur f1953a;
    /* renamed from: b */
    private boolean f1954b = true;
    /* renamed from: c */
    protected List<WDObjet> f1955c;
    /* renamed from: d */
    protected int f1956d;
    /* renamed from: e */
    private C0757h f1957e;
    /* renamed from: f */
    private Condition f1958f;
    /* renamed from: g */
    private ReentrantLock f1959g;

    public C0753g(C0757h c0757h, int i, IWDAllocateur iWDAllocateur) {
        this.f1956d = i;
        this.f1953a = iWDAllocateur;
        this.f1959g = new ReentrantLock();
        this.f1958f = this.f1959g.newCondition();
        this.f1957e = c0757h;
        switch (C0756c.f1967a[this.f1957e.ordinal()]) {
            case 1:
            case 2:
                this.f1955c = new LinkedList();
                return;
            case 3:
                this.f1955c = new ArrayList();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m3302a(int i) {
        int i2 = m3336i();
        if (i != i2) {
            if (i == 0) {
                try {
                    m3337j();
                } catch (UnsupportedOperationException e) {
                    throw e;
                }
            } else if (i > i2) {
                try {
                    if (!this.f1954b) {
                        WDErreurManager.m2883a(C0745b.m3222b(f1952z[0], new String[0]));
                    }
                    while (i2 < i) {
                        try {
                            this.f1955c.add(C0611a.m2294a(this.f1956d, this.f1953a));
                            i2++;
                        } catch (UnsupportedOperationException e2) {
                            throw e2;
                        }
                    }
                    this.f1958f.signal();
                } catch (UnsupportedOperationException e22) {
                    throw e22;
                }
            } else {
                while (i < i2) {
                    try {
                        m3305k();
                        i++;
                    } catch (UnsupportedOperationException e222) {
                        throw e222;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private void m3303f(WDObjet wDObjet) {
        try {
            switch (C0756c.f1967a[this.f1957e.ordinal()]) {
                case 1:
                case 2:
                    ((LinkedList) this.f1955c).addLast(wDObjet);
                    return;
                case 3:
                    ((ArrayList) this.f1955c).add(wDObjet);
                    return;
                default:
                    return;
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    /* renamed from: g */
    private void m3304g(WDObjet wDObjet) {
        try {
            switch (C0756c.f1967a[this.f1957e.ordinal()]) {
                case 1:
                case 2:
                    ((LinkedList) this.f1955c).addFirst(wDObjet);
                    return;
                case 3:
                    ((ArrayList) this.f1955c).add(0, wDObjet);
                    return;
                default:
                    return;
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    /* renamed from: k */
    private WDObjet m3305k() {
        try {
            switch (C0756c.f1967a[this.f1957e.ordinal()]) {
                case 1:
                case 2:
                    return (WDObjet) ((LinkedList) this.f1955c).pollLast();
                case 3:
                    return (WDObjet) this.f1955c.remove(this.f1955c.size() - 1);
                default:
                    return null;
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    /* renamed from: l */
    private WDObjet m3306l() {
        try {
            switch (C0756c.f1967a[this.f1957e.ordinal()]) {
                case 1:
                case 2:
                    return (WDObjet) ((LinkedList) this.f1955c).pollFirst();
                case 3:
                    return (WDObjet) this.f1955c.remove(0);
                default:
                    return null;
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m3307z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 49;
                    break;
                case 1:
                    i2 = 98;
                    break;
                case 2:
                    i2 = 90;
                    break;
                case 3:
                    i2 = 108;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3308z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 28);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo2467a(int i, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1952z[3], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public int mo2468a(C0486m c0486m, int i, int i2, WDObjet[] wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1952z[3], getNomType()));
        return 0;
    }

    /* renamed from: a */
    public int mo2464a(WDObjet... wDObjetArr) {
        try {
            return wDObjetArr.length > 0 ? mo2475b(wDObjetArr[0]) : -1;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public WDObjet mo2485a() {
        return C0611a.m2294a(this.f1956d, this.f1953a);
    }

    /* renamed from: a */
    public WDObjet mo2469a(long j) {
        this.f1959g.lock();
        if (j >= 0) {
            try {
                if (j < ((long) this.f1955c.size())) {
                    WDObjet wDObjet = (WDObjet) this.f1955c.get((int) j);
                    return wDObjet;
                }
            } finally {
                this.f1959g.unlock();
            }
        }
        this.f1959g.unlock();
        return null;
    }

    /* renamed from: a */
    public WDObjet mo2470a(String str, boolean z) {
        if (z) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(f1952z[5], new String[0]));
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public IWDParcours mo2471a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, boolean z, boolean z2) {
        C0757h c0757h = this.f1957e;
        try {
            boolean z3 = (c0757h == C0757h.QUEUE || c0757h == C0757h.STACK) ? true : z;
            return new C0755b(this, wDObjet, wDObjet2, wDObjet3, wDObjet4, z3, z2);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public void mo2472a(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1952z[3], getNomType()));
    }

    /* renamed from: a */
    public void mo2473a(int i, C0486m c0486m) {
        WDErreurManager.m2883a(C0745b.m3222b(f1952z[3], getNomType()));
    }

    /* renamed from: a */
    public void mo2465a(WDObjet wDObjet) {
        mo2478c(wDObjet);
    }

    /* renamed from: a */
    public void mo2474a(WDObjet wDObjet, WDObjet wDObjet2) {
        int i = 0;
        if (this.f1957e == C0757h.LIST) {
            int i2 = wDObjet2.getInt();
            switch (i2) {
                case C0607n.xs /*-2023406814*/:
                    i = (int) mo2483h();
                    break;
                case C0607n.ih /*-2023406813*/:
                case C0607n.vn /*-2023406812*/:
                    IWDParcours y = WDAppelContexte.getContexte().m2737y();
                    if (y != null) {
                        try {
                            if (y.getSource() == this) {
                                i = y.getIndex();
                                if (i2 == C0607n.vn) {
                                    i++;
                                }
                                try {
                                    if (y instanceof C0566b) {
                                        ((C0566b) y).m1858a(i);
                                        break;
                                    }
                                } catch (UnsupportedOperationException e) {
                                    throw e;
                                }
                            }
                        } catch (UnsupportedOperationException e2) {
                            throw e2;
                        }
                    }
                    WDErreurManager.m2883a(C0745b.m3222b(f1952z[2], new String[0]));
                    break;
                case 1:
                    break;
                default:
                    WDErreurManager.m2883a(C0745b.m3222b(f1952z[6], new String[0]));
                    break;
            }
            this.f1959g.lock();
            try {
                if (!this.f1954b) {
                    WDErreurManager.m2883a(C0745b.m3222b(f1952z[0], new String[0]));
                }
                if (i >= 0) {
                    if (i <= this.f1955c.size()) {
                        WDListeWL wDListeWL = (WDListeWL) wDObjet.checkType(WDListeWL.class);
                        if (wDListeWL != null) {
                            for (WDObjet wDObjet3 : wDListeWL.c) {
                                WDObjet a = C0611a.m2294a(this.f1956d, this.f1953a);
                                a.setValeur(wDObjet3);
                                ((ArrayList) this.f1955c).add(i, a);
                                i++;
                            }
                        } else {
                            WDObjet a2 = C0611a.m2294a(this.f1956d, this.f1953a);
                            a2.setValeur(wDObjet);
                            ((ArrayList) this.f1955c).add(i, a2);
                        }
                        this.f1958f.signal();
                    }
                }
                this.f1959g.unlock();
            } catch (UnsupportedOperationException e22) {
                throw e22;
            } catch (Throwable th) {
                this.f1959g.unlock();
            }
        } else {
            WDErreurManager.m2883a(C0745b.m3222b(f1952z[3], getNomType()));
        }
    }

    /* renamed from: a */
    public void mo2466a(WDObjet wDObjet, WDObjet... wDObjetArr) {
        try {
            if (wDObjetArr.length > 0) {
                mo2474a(wDObjet, wDObjetArr[0]);
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public final void m3321a(boolean z) {
        this.f1959g.lock();
        try {
            this.f1954b = z;
            if (!this.f1954b) {
                if (this.f1955c.isEmpty()) {
                    this.f1958f.signalAll();
                }
            }
            this.f1959g.unlock();
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (Throwable th) {
            this.f1959g.unlock();
        }
    }

    /* renamed from: a */
    public final boolean m3322a(WDObjet wDObjet, boolean z, int i) {
        try {
            if (this.f1957e == C0757h.STACK) {
                throw new UnsupportedOperationException();
            }
            this.f1959g.lock();
            do {
                try {
                    if (this.f1955c.isEmpty()) {
                        if (z) {
                            if (this.f1954b) {
                                if (i == -1) {
                                    try {
                                        this.f1958f.await();
                                    } catch (InterruptedException e) {
                                        this.f1959g.unlock();
                                        return false;
                                    }
                                } else if (!this.f1958f.await((long) i, TimeUnit.MILLISECONDS)) {
                                    this.f1959g.unlock();
                                    return false;
                                }
                            }
                        }
                        this.f1959g.unlock();
                        return false;
                    }
                    WDObjet l = m3306l();
                    if (wDObjet != null) {
                        wDObjet.setValeur(l);
                    }
                    this.f1959g.unlock();
                    return true;
                } catch (InterruptedException e2) {
                    throw e2;
                } catch (InterruptedException e22) {
                    throw e22;
                } catch (Throwable th) {
                    this.f1959g.unlock();
                }
            } while (this.f1955c != null);
            this.f1959g.unlock();
            return false;
        } catch (InterruptedException e222) {
            throw e222;
        }
    }

    /* renamed from: b */
    public int mo2475b(WDObjet wDObjet) {
        if (this.f1957e == C0757h.LIST) {
            C0753g c0753g = (C0753g) wDObjet.checkType(C0753g.class);
            if (c0753g != null) {
                try {
                    if (c0753g.f1957e == C0757h.LIST) {
                        if (mo2487d() == c0753g.mo2487d() && C0611a.m2306a(this.f1953a, c0753g.f1953a)) {
                            this.f1959g.lock();
                            try {
                                if (!this.f1954b) {
                                    WDErreurManager.m2883a(C0745b.m3222b(f1952z[0], new String[0]));
                                }
                                int i = m3336i();
                                m3302a(c0753g.m3336i() + i);
                                for (WDObjet valeur : c0753g.f1955c) {
                                    int i2 = i + 1;
                                    ((WDObjet) this.f1955c.get(i)).setValeur(valeur);
                                    i = i2;
                                }
                                int size = this.f1955c.size();
                                return size;
                            } finally {
                                this.f1959g.unlock();
                            }
                        }
                    }
                } catch (UnsupportedOperationException e) {
                    throw e;
                } catch (UnsupportedOperationException e2) {
                    throw e2;
                }
            }
            return m3331e(wDObjet);
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1952z[3], getNomType()));
        return 0;
    }

    /* renamed from: b */
    public void mo2476b() {
        WDErreurManager.m2883a(C0745b.m3222b(f1952z[3], getNomType()));
    }

    /* renamed from: b */
    public void mo2477b(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1952z[3], getNomType()));
    }

    /* renamed from: b */
    public final boolean m3326b(WDObjet wDObjet, boolean z, int i) {
        try {
            if (this.f1957e == C0757h.QUEUE) {
                throw new UnsupportedOperationException();
            }
            this.f1959g.lock();
            do {
                try {
                    if (this.f1955c.isEmpty()) {
                        if (z) {
                            if (this.f1954b) {
                                if (i == -1) {
                                    try {
                                        this.f1958f.await();
                                    } catch (InterruptedException e) {
                                        this.f1959g.unlock();
                                        return false;
                                    }
                                } else if (!this.f1958f.await((long) i, TimeUnit.MILLISECONDS)) {
                                    this.f1959g.unlock();
                                    return false;
                                }
                            }
                        }
                        this.f1959g.unlock();
                        return false;
                    }
                    WDObjet k = m3305k();
                    if (wDObjet != null) {
                        wDObjet.setValeur(k);
                    }
                    this.f1959g.unlock();
                    return true;
                } catch (InterruptedException e2) {
                    throw e2;
                } catch (InterruptedException e22) {
                    throw e22;
                } catch (Throwable th) {
                    this.f1959g.unlock();
                }
            } while (this.f1955c != null);
            this.f1959g.unlock();
            return false;
        } catch (InterruptedException e222) {
            throw e222;
        }
    }

    /* renamed from: c */
    public int mo2478c(WDObjet wDObjet) {
        try {
            if (this.f1957e == C0757h.LIST) {
                if (!wDObjet.isVoid()) {
                    switch (wDObjet.getInt()) {
                        case C0607n.xs /*-2023406814*/:
                            m3326b(null, false, 0);
                            break;
                        case 1:
                            try {
                                m3322a(null, false, 0);
                                break;
                            } catch (UnsupportedOperationException e) {
                                throw e;
                            }
                        default:
                            WDErreurManager.m2883a(C0745b.m3222b(f1952z[1], new String[0]));
                            break;
                    }
                }
                this.f1959g.lock();
                try {
                    IWDParcours y = WDAppelContexte.getContexte().m2737y();
                    if (y != null) {
                        if (y.getSource() == this) {
                            int index = y.getIndex();
                            if (index >= 0) {
                                if (index <= this.f1955c.size()) {
                                    this.f1955c.remove(index);
                                    ((C0566b) y).m1868i();
                                }
                            }
                            this.f1959g.unlock();
                        }
                    }
                    WDErreurManager.m2883a(C0745b.m3222b(f1952z[2], new String[0]));
                    this.f1959g.unlock();
                } catch (UnsupportedOperationException e2) {
                    throw e2;
                } catch (UnsupportedOperationException e22) {
                    throw e22;
                } catch (Throwable th) {
                    this.f1959g.unlock();
                }
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(f1952z[3], getNomType()));
            }
            return 1;
        } catch (UnsupportedOperationException e222) {
            throw e222;
        }
    }

    /* renamed from: c */
    public void mo2479c() {
        WDErreurManager.m2883a(C0745b.m3222b(f1952z[3], getNomType()));
    }

    /* renamed from: d */
    public int mo2487d() {
        return this.f1956d;
    }

    /* renamed from: d */
    public final void m3330d(WDObjet wDObjet) {
        try {
            if (this.f1957e == C0757h.STACK) {
                throw new UnsupportedOperationException();
            }
            WDObjet a = C0611a.m2294a(this.f1956d, this.f1953a);
            a.setValeur(wDObjet);
            this.f1959g.lock();
            try {
                if (!this.f1954b) {
                    WDErreurManager.m2883a(C0745b.m3222b(f1952z[0], new String[0]));
                }
                m3304g(a);
                this.f1958f.signal();
            } finally {
                this.f1959g.unlock();
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public final int m3331e(WDObjet wDObjet) {
        WDObjet a = C0611a.m2294a(this.f1956d, this.f1953a);
        a.setValeur(wDObjet);
        this.f1959g.lock();
        try {
            if (!this.f1954b) {
                WDErreurManager.m2883a(C0745b.m3222b(f1952z[0], new String[0]));
            }
            m3303f(a);
            this.f1958f.signal();
            int size = this.f1955c.size();
            return size;
        } finally {
            this.f1959g.unlock();
        }
    }

    /* renamed from: e */
    public void mo2480e() {
        m3337j();
    }

    /* renamed from: f */
    public boolean mo2481f() {
        return true;
    }

    /* renamed from: g */
    public Class mo2482g() {
        try {
            return this.f1953a != null ? this.f1953a.getClasseWD() : null;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public WDObjet get(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(f1952z[5], new String[0]));
        return null;
    }

    public WDObjet getAjoutTermine() {
        try {
            if (this.f1957e == C0757h.LIST) {
                erreurAppelPropriete(EWDPropriete.PROP_AJOUTTERMINE);
            }
            try {
                return new WDBooleen(!this.f1954b);
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    public WDObjet getClone() {
        WDObjet n = mo2630n();
        this.f1959g.lock();
        try {
            for (WDObjet wDObjet : this.f1955c) {
                WDObjet a = C0611a.m2294a(this.f1956d, this.f1953a);
                a.setValeur(wDObjet);
                n.f1955c.add(a);
            }
            return n;
        } finally {
            n = this.f1959g;
            n.unlock();
        }
    }

    public WDObjet getElement(String str) {
        return getElement(str, true);
    }

    public WDObjet getElement(String str, boolean z) {
        return mo2470a(str, z);
    }

    public WDObjet getNbThreadAttente() {
        try {
            if (this.f1957e == C0757h.LIST) {
                erreurAppelPropriete(EWDPropriete.PROP_NBTHREADATTENTE);
            }
            this.f1959g.lock();
            try {
                WDObjet wDEntier4 = new WDEntier4(this.f1959g.getWaitQueueLength(this.f1958f));
                return wDEntier4;
            } finally {
                this.f1959g.unlock();
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public WDEntier4 getOccurrence() {
        return new WDEntier4(mo2483h());
    }

    public WDObjet getValeur() {
        return this;
    }

    public WDBooleen getVide() {
        try {
            return new WDBooleen(mo2483h() == 0);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    /* renamed from: h */
    public long mo2483h() {
        return (long) m3336i();
    }

    /* renamed from: i */
    public final int m3336i() {
        this.f1959g.lock();
        try {
            int size = this.f1955c.size();
            return size;
        } finally {
            this.f1959g.unlock();
        }
    }

    public boolean isEvaluable() {
        return false;
    }

    /* renamed from: j */
    public final void m3337j() {
        this.f1959g.lock();
        try {
            this.f1955c.clear();
        } finally {
            this.f1959g.unlock();
        }
    }

    /* renamed from: m */
    public final C0757h m3338m() {
        return this.f1957e;
    }

    /* renamed from: n */
    protected abstract C0753g mo2630n();

    public void opPriseReference(WDObjet wDObjet) {
        C0753g c0753g = (C0753g) wDObjet.checkType(getClass());
        if (c0753g != null) {
            try {
                if (c0753g.mo2487d() == c0753g.mo2487d() && C0611a.m2306a(this.f1953a, c0753g.f1953a)) {
                    this.f1959g.lock();
                    try {
                        this.f1955c.clear();
                        this.f1955c = c0753g.f1955c;
                        return;
                    } finally {
                        this.f1959g.unlock();
                    }
                }
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1952z[4], getNomType()));
    }

    public void razVariable() {
        m3337j();
    }

    public final void release() {
        try {
            m3337j();
            if (this.f1958f != null) {
                this.f1958f.signalAll();
                this.f1958f = null;
            }
            this.f1959g = null;
            this.f1953a = null;
            this.f1955c = null;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public void setAjoutTermine(boolean z) {
        try {
            if (this.f1957e == C0757h.LIST) {
                erreurAppelPropriete(EWDPropriete.PROP_AJOUTTERMINE);
            }
            m3321a(!z);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        this.f1959g.lock();
        try {
            WDSerie wDSerie = (WDSerie) wDObjet.checkType(WDSerie.class);
            int h;
            if (wDSerie != null) {
                h = (int) wDSerie.mo2483h();
                if (h > 0) {
                    if (!this.f1954b) {
                        WDErreurManager.m2883a(C0745b.m3222b(f1952z[0], new String[0]));
                    }
                }
                m3302a(h);
                for (int i = 0; i < h; i++) {
                    ((WDObjet) this.f1955c.get(i)).setValeur(wDSerie.mo2469a((long) i));
                }
            } else {
                C0753g c0753g = (C0753g) wDObjet.checkType(getClass());
                if (c0753g != null) {
                    if (c0753g.mo2487d() == c0753g.mo2487d() && C0611a.m2306a(this.f1953a, c0753g.f1953a)) {
                        int size = c0753g.f1955c.size();
                        if (size > 0) {
                            if (!this.f1954b) {
                                WDErreurManager.m2883a(C0745b.m3222b(f1952z[0], new String[0]));
                            }
                        }
                        m3302a(size);
                        for (h = 0; h < size; h++) {
                            ((WDObjet) this.f1955c.get(h)).setValeur((WDObjet) c0753g.f1955c.get(h));
                        }
                    }
                }
                WDErreurManager.m2883a(C0745b.m3222b(f1952z[4], getNomType()));
            }
            this.f1959g.unlock();
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        } catch (UnsupportedOperationException e22) {
            throw e22;
        } catch (UnsupportedOperationException e222) {
            throw e222;
        } catch (UnsupportedOperationException e2222) {
            throw e2222;
        } catch (Throwable th) {
            this.f1959g.unlock();
        }
    }
}
