package fr.pcsoft.wdjava.ui.pulltorefresh;

import fr.pcsoft.wdjava.api.WDAPIAnimation;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.WDFenetreInterne;

public class GWDFIFI_PULL_TO_REFRESH extends WDFenetreInterne {
    private static final String[] Rc = new String[]{m10307z(m10308z("\u0014\"D\u0002H`;Y\u0012H`9W\u0001H!¥U\u000fS2")), m10307z(m10308z("\t%@\u0002H3.")), m10307z(m10308z("\u0010>Z\u000b\u001a4$\u0016\u0015_&9S\u0014R")), m10307z(m10308z("\u0012.ZY(.DGJ/>DGH!-D\u0006Ô##_\u0015")), m10307z(m10308z("\u0012.Z\u0002[3.\u0016\u0013U`9S\u0001H%8^")), m10307z(m10308z("\u000e*B\u000eL%\b_\u0015Y5'W\u000eH%")), m10307z(m10308z("\f\u0002t8m\u0018\u0014b.h\u0005\u0019i5\f\nu/\u0012")), m10307z(m10308z("\f\u0002t8m\u0018\u0014d\"|\u0012\u000ee/")), m10307z(m10308z("\u0006\u0002i7o\f\u0007i3u\u001f\u0019s!h\u0005\u0018~")), m10307z(m10308z("\t\u0006q8m\u0018\u0014p+\u0003\u0003s")), m10307z(m10308z("vy\u0004S\u000fq\u0000R"))};
    public C1478k Nc;
    public C1482o Oc;
    public C1479l Pc;
    public C1484q Qc;

    /* renamed from: z */
    private static String m10307z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 64;
                    break;
                case 1:
                    i2 = 75;
                    break;
                case 2:
                    i2 = 54;
                    break;
                case 3:
                    i2 = 103;
                    break;
                default:
                    i2 = 58;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10308z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 58);
        }
        return toCharArray;
    }

    public void activerEcoute() {
    }

    protected void creerChamps() {
        this.Pc = new C1479l(this);
        this.Oc = new C1482o(this);
        this.Nc = new C1478k(this);
        this.Qc = new C1484q(this);
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
        super.setChecksum(Rc[10]);
        super.setNom(Rc[8]);
        super.setMenuContextuelSysteme();
        super.setNote(WDChaineMultilangue.getString("", ""));
        super.setTailleInitiale(384, 69);
        super.setTailleMin(-1, -1);
        super.setTailleMax(-1, -1);
        super.setCouleurFond(14737632);
        super.setPresenceLibelle(false);
        activerEcoute();
        this.Pc.initialiserObjet();
        super.ajouter(Rc[6], this.Pc);
        this.Oc.initialiserObjet();
        super.ajouter(Rc[9], this.Oc);
        this.Nc.initialiserObjet();
        super.ajouter(Rc[7], this.Nc);
        this.Qc.initialiserObjet();
        super.ajouter(Rc[5], this.Qc);
        super.terminerInitialisation();
    }

    public boolean isUniteAffichageLogique() {
        return false;
    }

    public void ptrRafraichissement() {
        super.ptrRafraichissement();
        setPlan(3);
        WDAPIAnimation.animationChangeParametre(this.Oc, Rc[1], new WDBooleen(true));
    }

    public void ptrRelacher() {
        super.ptrRelacher();
        if (getPlan().opEgal(1)) {
            WDAPIAnimation.animationChangeParametre(this.Oc, Rc[1], new WDBooleen(false));
            this.Oc.setAnimation(true);
        }
        this.Pc.setValeur(WDChaineMultilangue.getString(Rc[3], Rc[4]));
        setPlan(2);
    }

    public void ptrTirer() {
        super.ptrTirer();
        if (getPlan().opEgal(2)) {
            WDAPIAnimation.animationChangeParametre(this.Oc, Rc[1], new WDBooleen(true));
            this.Oc.setAnimation(true);
        }
        this.Pc.setValeur(WDChaineMultilangue.getString(Rc[0], Rc[2]));
        setPlan(1);
    }
}
