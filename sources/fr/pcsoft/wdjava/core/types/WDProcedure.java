package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0613b;
import fr.pcsoft.wdjava.core.application.C0612h;
import fr.pcsoft.wdjava.core.application.WDProcedureInterne;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.LinkedList;

public class WDProcedure extends cb implements C0612h {
    public static final C0613b<WDProcedure> CREATOR = new C0788m();
    /* renamed from: z */
    private static final String[] f1529z = new String[]{m2379z(m2380z("\u0018ycusddtfyv}{qyaze~sdzr~{qtceoetc")), m2379z(m2380z("\u0018}hju~iows")), m2379z(m2380z("oTJ@\u0016RCYJ[KLNLTWH\u001aUYN_\u001aIW\u001bNUHFZ_[LETC")), m2379z(m2380z("\u0018hhwincze~xv`ikufsxh`"))};
    /* renamed from: a */
    private LinkedList<WDCallback> f1530a = null;

    public WDProcedure(WDCallback wDCallback) {
        m2378a(wDCallback);
    }

    public WDProcedure(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    public WDProcedure(C0612h c0612h) {
        m2378a(c0612h.getCallback(-1));
    }

    public WDProcedure(String str) {
        setValeur(str);
    }

    /* renamed from: a */
    private final void m2378a(WDCallback wDCallback) {
        try {
            if (this.f1530a != null) {
                this.f1530a.clear();
            } else if (wDCallback != null) {
                this.f1530a = new LinkedList();
            }
            if (wDCallback != null) {
                try {
                    this.f1530a.add(wDCallback);
                } catch (InvalidParameterException e) {
                    throw e;
                }
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        } catch (InvalidParameterException e22) {
            throw e22;
        }
    }

    /* renamed from: z */
    private static String m2379z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 59;
                    break;
                case 1:
                    i2 = 45;
                    break;
                case 2:
                    i2 = 58;
                    break;
                case 3:
                    i2 = 37;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2380z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 54);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected double mo2354a(WDObjet wDObjet) {
        throw new InvalidParameterException(f1529z[2]);
    }

    public final WDObjet executer(WDObjet... wDObjetArr) {
        WDObjet wDObjet = null;
        Iterator it = this.f1530a.iterator();
        while (it.hasNext()) {
            wDObjet = ((WDCallback) it.next()).execute(wDObjetArr);
        }
        return wDObjet == null ? new WDVoid() : wDObjet;
    }

    public WDCallback getCallback(int i) {
        try {
            int size = this.f1530a != null ? this.f1530a.size() : 0;
            if (size == 0 || size > 1) {
                try {
                    WDErreurManager.m2883a(C0745b.m3222b(f1529z[3], new String[0]));
                } catch (InvalidParameterException e) {
                    throw e;
                }
            }
            return (WDCallback) this.f1530a.get(0);
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public Object getJSONValue() {
        C0745b.m3222b(f1529z[0], getNomType());
        return null;
    }

    public String getNomType() {
        return C0745b.m3220a(f1529z[1], new String[0]);
    }

    public WDProcedure getProcedure() {
        return this;
    }

    public String getString() {
        return null;
    }

    public int getTypeVar() {
        return 61;
    }

    public WDObjet getValeur() {
        return this;
    }

    public boolean isNull() {
        try {
            if (this.f1530a != null) {
                if (!this.f1530a.isEmpty()) {
                    return false;
                }
            }
            return true;
        } catch (InvalidParameterException e) {
            throw e;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public cb opMoins(WDObjet wDObjet) {
        WDProcedure procedure = wDObjet.getProcedure();
        try {
            if (this.f1530a != null) {
                if (!(this.f1530a.isEmpty() || procedure.f1530a == null)) {
                    Iterator it = this.f1530a.iterator();
                    while (it.hasNext()) {
                        this.f1530a.remove((WDCallback) it.next());
                    }
                }
            }
            return this;
        } catch (InvalidParameterException e) {
            throw e;
        } catch (InvalidParameterException e2) {
            throw e2;
        }
    }

    public cb opPlus(WDObjet wDObjet) {
        setApres(wDObjet.getProcedure());
        return this;
    }

    public void opPriseReference(WDObjet wDObjet) {
        this.f1530a = wDObjet.getProcedure().f1530a;
    }

    public void razVariable() {
        this.f1530a = null;
    }

    public void release() {
        this.f1530a = null;
    }

    public void setApres(WDObjet wDObjet) {
        WDProcedure procedure = wDObjet.getProcedure();
        try {
            if (procedure.f1530a == null) {
                return;
            }
            if (!procedure.f1530a.isEmpty()) {
                try {
                    if (this.f1530a == null) {
                        this.f1530a = new LinkedList();
                    }
                    this.f1530a.addAll(procedure.f1530a);
                } catch (InvalidParameterException e) {
                    throw e;
                }
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        } catch (InvalidParameterException e22) {
            throw e22;
        }
    }

    public void setAvant(WDObjet wDObjet) {
        WDProcedure procedure = wDObjet.getProcedure();
        try {
            if (procedure.f1530a == null) {
                return;
            }
            if (!procedure.f1530a.isEmpty()) {
                try {
                    if (this.f1530a == null) {
                        this.f1530a = new LinkedList();
                    }
                    this.f1530a.addAll(0, procedure.f1530a);
                } catch (InvalidParameterException e) {
                    throw e;
                }
            }
        } catch (InvalidParameterException e2) {
            throw e2;
        } catch (InvalidParameterException e22) {
            throw e22;
        }
    }

    public void setValeur(WDObjet wDObjet) {
        LinkedList linkedList = null;
        if (wDObjet != this) {
            try {
                if (wDObjet.isValeurNull()) {
                    this.f1530a = null;
                    return;
                }
                WDProcedure procedure = wDObjet.getProcedure();
                try {
                    if (procedure.f1530a != null) {
                        linkedList = new LinkedList(procedure.f1530a);
                    }
                    this.f1530a = linkedList;
                } catch (InvalidParameterException e) {
                    throw e;
                }
            } catch (InvalidParameterException e2) {
                throw e2;
            }
        }
    }

    public void setValeur(WDProcedureInterne wDProcedureInterne) {
        m2378a(wDProcedureInterne.getCallback(-1));
    }

    public void setValeur(String str) {
        m2378a(WDCallback.m2244a(str, -1, true));
    }
}
