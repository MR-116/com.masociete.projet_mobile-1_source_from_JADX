package com.masociete.projet_mobile.wdgen;

import fr.pcsoft.wdjava.api.WDAPIFenetre_Commun;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.ui.actionbar.WDActionBar;
import fr.pcsoft.wdjava.ui.activite.WDActivite;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.image.WDChampImage;
import fr.pcsoft.wdjava.ui.champs.libelle.WDLibelle;
import fr.pcsoft.wdjava.ui.p069g.C1409j;

public class GWDFFEN_Information extends WDFenetre {
    public GWDACTB_ActionBar mWD_ACTB_ActionBar;
    public GWDIMG_Image mWD_IMG_Image;
    public GWDLIB_Description_inf_Cadre mWD_LIB_Description_inf_Cadre;
    public GWDLIB_Description_inf_Valeur mWD_LIB_Description_inf_Valeur;
    public GWDLIB_Fond mWD_LIB_Fond;
    public GWDLIB_Titre_inf_Cadre mWD_LIB_Titre_inf_Cadre;
    public GWDLIB_Titre_inf_Valeur mWD_LIB_Titre_inf_Valeur;

    class GWDACTB_ActionBar extends WDActionBar {
        GWDACTB_ActionBar() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Information.this.getWDFenetreThis());
            super.setNom("ACTB_ActionBar");
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setParamBoutonGauche(true, 1, WDChaineMultilangue.getString("", ""), WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\logonew.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\logonew.png"));
            super.setParamBoutonDroit(false, 0, WDChaineMultilangue.getString("", ""), WDChaineMultilangue.getString("", ""));
            super.setStyleActionBar(C0607n.Sj, 16777215, false);
            super.setImageFond(WDChaineMultilangue.getString("", ""));
            super.terminerInitialisation();
        }
    }

    class GWDIMG_Image extends WDChampImage {
        GWDIMG_Image() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Information.this.getWDFenetreThis());
            super.setQuid(3095629105211924539L);
            super.setChecksum("1064980672");
            super.setNom("IMG_Image");
            super.setType(30001);
            super.setLibelle(WDChaineMultilangue.getString("", ""));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setNavigable(false);
            super.setEtatInitial(1);
            super.setPositionInitiale(2, 16);
            super.setTailleInitiale(316, 171);
            super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
            super.setPlan(0);
            super.setLiaisonFichier("express_information", "multimedia_inf");
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(6);
            super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);
            super.setTransparence(1);
            super.setParamImage(6, 2, true, 100);
            super.setSymetrie(0);
            super.setZoneClicage(true);
            super.setPCodeMultitouch(false);
            super.setChargementEnTacheDeFond(true);
            super.setOrientationExif(true);
            super.setParamAnimation(1, 1, false, C1409j.f4188e, true, false);
            super.setAnimationInitiale(false);
            super.setTauxParallaxe(0, 0);
            super.setPresenceLibelle(false);
            super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    class GWDLIB_Description_inf_Cadre extends WDLibelle {
        GWDLIB_Description_inf_Cadre() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Information.this.getWDFenetreThis());
            super.setQuid(3095629229766726035L);
            super.setChecksum("1065728333");
            super.setNom("LIB_Description_inf_Cadre");
            super.setType(3);
            super.setTypeSaisie(0);
            super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
            super.setLibelle(WDChaineMultilangue.getString("Description", "description de l'information"));
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setEtatInitial(1);
            super.setPositionInitiale(16, 287);
            super.setTailleInitiale(288, 72);
            super.setPlan(0);
            super.setCadrageHorizontal(0);
            super.setCadrageVertical(0);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(2);
            super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
            super.setEllipse(0);
            super.setTauxParallaxe(0, 0);
            super.setPresenceLibelle(true);
            super.setStyleLibelle(10066329, -1, creerPolice_GEN("Droid Sans", -7.0d, 0), 3, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    class GWDLIB_Description_inf_Valeur extends WDLibelle {
        GWDLIB_Description_inf_Valeur() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Information.this.getWDFenetreThis());
            super.setQuid(3095629229766529427L);
            super.setChecksum("1065531725");
            super.setNom("LIB_Description_inf_Valeur");
            super.setType(3);
            super.setTypeSaisie(0);
            super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
            super.setLibelle(WDChaineMultilangue.getString("<description_inf>", "<description_inf>"));
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setEtatInitial(1);
            super.setPositionInitiale(16, 313);
            super.setTailleInitiale(288, 25);
            super.setPlan(0);
            super.setCadrageHorizontal(0);
            super.setCadrageVertical(0);
            super.setLiaisonFichier("express_information", "description_inf");
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(3);
            super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
            super.setEllipse(0);
            super.setTauxParallaxe(0, 0);
            super.setPresenceLibelle(true);
            super.setStyleLibelle(3355443, -1, creerPolice_GEN("Droid Sans Mono", -7.0d, 0), 3, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    class GWDLIB_Fond extends WDLibelle {
        GWDLIB_Fond() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Information.this.getWDFenetreThis());
            super.setQuid(3095629105212186683L);
            super.setChecksum("1065240536");
            super.setNom("LIB_Fond");
            super.setType(3);
            super.setTypeSaisie(0);
            super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
            super.setLibelle(WDChaineMultilangue.getString("", ""));
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setEtatInitial(0);
            super.setPositionInitiale(0, 0);
            super.setTailleInitiale(320, 472);
            super.setPlan(0);
            super.setCadrageHorizontal(0);
            super.setCadrageVertical(0);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(1);
            super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);
            super.setEllipse(0);
            super.setTauxParallaxe(0, 0);
            super.setPresenceLibelle(true);
            super.setStyleLibelle(3355443, 16777215, creerPolice_GEN("Droid Sans Mono", -7.0d, 0), 3, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, 16777215, 4, 4, 1, 1), 0, 0, 0, 0);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    class GWDLIB_Titre_inf_Cadre extends WDLibelle {
        GWDLIB_Titre_inf_Cadre() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Information.this.getWDFenetreThis());
            super.setQuid(3095629229767053730L);
            super.setChecksum("1066056028");
            super.setNom("LIB_Titre_inf_Cadre");
            super.setType(3);
            super.setTypeSaisie(0);
            super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
            super.setLibelle(WDChaineMultilangue.getString("Titre", "titre de l'information"));
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setEtatInitial(1);
            super.setPositionInitiale(16, C0607n.af);
            super.setTailleInitiale(288, 72);
            super.setPlan(0);
            super.setCadrageHorizontal(0);
            super.setCadrageVertical(0);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(4);
            super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
            super.setEllipse(0);
            super.setTauxParallaxe(0, 0);
            super.setPresenceLibelle(true);
            super.setStyleLibelle(10066329, -1, creerPolice_GEN("Droid Sans", -7.0d, 0), 3, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    class GWDLIB_Titre_inf_Valeur extends WDLibelle {
        GWDLIB_Titre_inf_Valeur() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Information.this.getWDFenetreThis());
            super.setQuid(3095629229766857107L);
            super.setChecksum("1065859405");
            super.setNom("LIB_Titre_inf_Valeur");
            super.setType(3);
            super.setTypeSaisie(0);
            super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
            super.setLibelle(WDChaineMultilangue.getString("<titre_inf>", "<titre_inf>"));
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setEtatInitial(1);
            super.setPositionInitiale(16, 235);
            super.setTailleInitiale(288, 25);
            super.setPlan(0);
            super.setCadrageHorizontal(0);
            super.setCadrageVertical(0);
            super.setLiaisonFichier("express_information", "titre_inf");
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(5);
            super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
            super.setEllipse(0);
            super.setTauxParallaxe(0, 0);
            super.setPresenceLibelle(true);
            super.setStyleLibelle(3355443, -1, creerPolice_GEN("Droid Sans Mono", -7.0d, 0), 3, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    public static class WDActiviteFenetre extends WDActivite {
        protected WDFenetre getFenetre() {
            return GWDPProjet_Mobile.ms_Project.mWD_FEN_Information;
        }
    }

    public void declarerGlobale(WDObjet[] WD_tabParam) {
        super.declarerGlobale(WD_tabParam);
        if (WD_tabParam != null) {
            int WD_ntabParamLen = WD_tabParam.length;
        }
        WDAPIFenetre_Commun.fichierVersEcran();
    }

    public void fermetureFenetreFille() {
        super.fermetureFenetreFille();
        WDAPIFenetre_Commun.fichierVersEcran();
    }

    public void activerEcoute() {
    }

    protected void creerChamps() {
        this.mWD_LIB_Fond = new GWDLIB_Fond();
        this.mWD_LIB_Description_inf_Cadre = new GWDLIB_Description_inf_Cadre();
        this.mWD_LIB_Description_inf_Valeur = new GWDLIB_Description_inf_Valeur();
        this.mWD_LIB_Titre_inf_Cadre = new GWDLIB_Titre_inf_Cadre();
        this.mWD_LIB_Titre_inf_Valeur = new GWDLIB_Titre_inf_Valeur();
        this.mWD_IMG_Image = new GWDIMG_Image();
        this.mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
    }

    public void initialiserObjet() {
        super.setQuid(3095629083727253159L);
        super.setChecksum("1060062128");
        super.setNom("FEN_Information");
        super.setType(1);
        super.setMenuContextuelSysteme();
        super.setNote("", WDChaineMultilangue.getString("", ""));
        super.setCouleur(0);
        super.setCouleurFond(15527148);
        super.setPositionInitiale(0, 0);
        super.setTailleInitiale(320, 460);
        super.setTitre(WDChaineMultilangue.getString("Gendarmerie Nle à votre service", "الدرك الوطني في خدمتكم"));
        super.setTailleMin(-1, -1);
        super.setTailleMax(20000, 20000);
        super.setVisibleInitial(true);
        super.setPositionFenetre(3);
        super.setPersistant(true);
        super.setGFI(true);
        super.setAnimationFenetre(0);
        super.setImageFond(WDChaineMultilangue.getString("", ""), 4, 0, 1);
        super.setCouleurTexteAutomatique(C0607n.xv);
        super.setCouleurBarreSysteme(C0607n.Kw);
        activerEcoute();
        this.mWD_LIB_Fond.initialiserObjet();
        super.ajouter("LIB_Fond", this.mWD_LIB_Fond);
        this.mWD_LIB_Description_inf_Cadre.initialiserObjet();
        super.ajouter("LIB_Description_inf_Cadre", this.mWD_LIB_Description_inf_Cadre);
        this.mWD_LIB_Description_inf_Valeur.initialiserObjet();
        super.ajouter("LIB_Description_inf_Valeur", this.mWD_LIB_Description_inf_Valeur);
        this.mWD_LIB_Titre_inf_Cadre.initialiserObjet();
        super.ajouter("LIB_Titre_inf_Cadre", this.mWD_LIB_Titre_inf_Cadre);
        this.mWD_LIB_Titre_inf_Valeur.initialiserObjet();
        super.ajouter("LIB_Titre_inf_Valeur", this.mWD_LIB_Titre_inf_Valeur);
        this.mWD_IMG_Image.initialiserObjet();
        super.ajouter("IMG_Image", this.mWD_IMG_Image);
        this.mWD_ACTB_ActionBar.initialiserObjet();
        super.ajouterActionBar(this.mWD_ACTB_ActionBar);
        super.terminerInitialisation();
    }

    public boolean isUniteAffichageLogique() {
        return false;
    }

    public int getModeActionBar() {
        return 1;
    }

    public boolean isMaximisee() {
        return true;
    }

    public boolean isAvecBarreDeTitre() {
        return true;
    }

    public int getModeBarreSysteme() {
        return 1;
    }

    public boolean isAvecAscenseurAuto() {
        return true;
    }

    public boolean isThemeDark() {
        return false;
    }

    public boolean isMasquageAutomatiqueActionBar() {
        return false;
    }

    public String getNomGabarit() {
        return "200 ACTIVANDROID 5#WM";
    }
}
