package fr.pcsoft.wdjava.ui.pulltorefresh;

import fr.pcsoft.wdjava.api.WDAPIAnimation;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.WDFenetreInterne;

public class GWDFIFI_PULL_TO_REFRESH_EXPRESS extends WDFenetreInterne {
    private static final String[] Rc = new String[]{m10309z(m10310z("Obns\u0002;{sc\u0002;y}p\u0002zå~\u0019i")), m10309z(m10310z("K~pzPod<d\u0015}yye\u0018")), m10309z(m10310z("Rejs\u0002hn")), m10309z(m10310z("Ujh\u0006~Hud\u0013ng}\u0002~")), m10309z(m10310z("WB^I'CTH_\"^YCD5WJ_^5I")), m10309z(m10310z("]BCF%WGCB?DYYP\"^XT")), m10309z(m10310z("RF[I'CTZZ5XCY")), m10309z(m10310z("WB^I'CTNS6INO^")), m10309z(m10310z("-9.\"E*?*#")), m10309z(m10310z("Inps\u0011hn<b\u001f;yyp\u0002~xt")), m10309z(m10310z("Inpô\u0013snn6\u0000t~n6\u0002zmnwxcud"))};
    public C1485r Nc;
    public C1480m Oc;
    public C1481n Pc;
    public C1483p Qc;

    /* renamed from: z */
    private static String m10309z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 27;
                    break;
                case 1:
                    i2 = 11;
                    break;
                case 2:
                    i2 = 28;
                    break;
                case 3:
                    i2 = 22;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10310z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 112);
        }
        return toCharArray;
    }

    public void activerEcoute() {
    }

    protected void creerChamps() {
        this.Pc = new C1481n(this);
        this.Qc = new C1483p(this);
        this.Oc = new C1480m(this);
        this.Nc = new C1485r(this);
    }

    public void declarerGlobale(WDObjet[] wDObjetArr) {
        super.declarerGlobale(wDObjetArr);
        if (wDObjetArr != null) {
            int length = wDObjetArr.length;
        }
    }

    public void initialiserObjet() {
        super.initialiserObjet();
        super.setQuid(2548521529188775733L);
        super.setChecksum(Rc[8]);
        super.setNom(Rc[5]);
        super.setMenuContextuelSysteme();
        super.setNote(WDChaineMultilangue.getString("", ""));
        super.setTailleInitiale(69, 384);
        super.setTailleMin(-1, -1);
        super.setTailleMax(-1, -1);
        super.setCouleurFond(14737632);
        super.setPresenceLibelle(false);
        activerEcoute();
        this.Pc.initialiserObjet();
        super.ajouter(Rc[4], this.Pc);
        this.Qc.initialiserObjet();
        super.ajouter(Rc[6], this.Qc);
        this.Oc.initialiserObjet();
        super.ajouter(Rc[7], this.Oc);
        this.Nc.initialiserObjet();
        super.ajouter(Rc[3], this.Nc);
        super.terminerInitialisation();
    }

    public boolean isUniteAffichageLogique() {
        return false;
    }

    public void ptrRafraichissement() {
        super.ptrRafraichissement();
        setPlan(3);
        WDAPIAnimation.animationChangeParametre(this.Qc, Rc[2], new WDBooleen(true));
    }

    public void ptrRelacher() {
        super.ptrRelacher();
        if (getPlan().opEgal(1)) {
            WDAPIAnimation.animationChangeParametre(this.Qc, Rc[2], new WDBooleen(false));
            this.Qc.setAnimation(true);
        }
        this.Pc.setValeur(WDChaineMultilangue.getString(Rc[10], Rc[9]));
        setPlan(2);
    }

    public void ptrTirer() {
        super.ptrTirer();
        if (getPlan().opEgal(2)) {
            WDAPIAnimation.animationChangeParametre(this.Qc, Rc[2], new WDBooleen(true));
            this.Qc.setAnimation(true);
        }
        this.Pc.setValeur(WDChaineMultilangue.getString(Rc[0], Rc[1]));
        setPlan(1);
    }
}
