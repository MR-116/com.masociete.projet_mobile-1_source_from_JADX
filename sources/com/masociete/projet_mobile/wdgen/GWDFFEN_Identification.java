package com.masociete.projet_mobile.wdgen;

import fr.pcsoft.wdjava.api.WDAPIFenetre_Commun;
import fr.pcsoft.wdjava.api.WDAPIHF;
import fr.pcsoft.wdjava.api.WDAPISys;
import fr.pcsoft.wdjava.api.WDAPIVM_Commun;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.actionbar.WDActionBar;
import fr.pcsoft.wdjava.ui.activite.WDActivite;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.saisie.WDChampSaisieSimple;
import fr.pcsoft.wdjava.ui.menu.WDMenuPrincipal;
import fr.pcsoft.wdjava.ui.menu.WDOptionMenu;

public class GWDFFEN_Identification extends WDFenetre {
    public GWDACTB_ActionBar mWD_ACTB_ActionBar;
    public GWDMMENU__Menu mWD_MENU__Menu;
    public GWDSAI_Nom_u mWD_SAI_Nom_u;
    public GWDSAI_Tel_u mWD_SAI_Tel_u;

    class GWDACTB_ActionBar extends WDActionBar {
        GWDACTB_ActionBar() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Identification.this.getWDFenetreThis());
            super.setNom("ACTB_ActionBar");
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setParamBoutonGauche(true, 1, WDChaineMultilangue.getString("", ""), WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\logonew.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\logonew.png"));
            super.setParamBoutonDroit(false, 0, WDChaineMultilangue.getString("", ""), WDChaineMultilangue.getString("", ""));
            super.setStyleActionBar(C0607n.Sj, 16777215, false);
            super.setImageFond(WDChaineMultilangue.getString("", ""));
            super.terminerInitialisation();
        }
    }

    class GWDMMENU__Menu extends WDMenuPrincipal {
        public GWDMOPT_OK mWD_OPT_OK = new GWDMOPT_OK(true);

        class GWDMOPT_OK extends WDOptionMenu {
            public GWDMOPT_OK(boolean b) {
                super(b, true);
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetre(GWDFFEN_Identification.this.getWDFenetreThis());
                super.setConteneurMenu(GWDMMENU__Menu.this);
                super.setQuid(3095620489364686446L);
                super.setNom("OPT_OK");
                super.setType(40001);
                super.setLibelle(WDChaineMultilangue.getString("OK", "OK"));
                super.setEtat(0);
                super.setImage("");
                super.setVisible(true);
                super.setCochee(false);
                super.setNumero(1);
                super.setAffichageDansActionBar(true);
                super.setIconePredefinie(7);
                activerEcoute();
            }

            public void selectionOptionMenu() {
                super.selectionOptionMenu();
                new WDChaineU().setValeur(WDAPIVM_Commun.projetInfo(2));
                WDAPIFenetre_Commun.ecranVersFichier();
                WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("num_serie_tel").setValeur(WDAPISys.sysIMEI("Cellular Line"));
                WDAPIHF.hEnregistre(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));
                WDAPIFenetre_Commun.ferme(GWDPProjet_Mobile.ms_Project.mWD_FEN_Identification);
                WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_selectidentite"), new WDEntier4(0), new WDObjet[]{WDAPISys.sysIMEI("Cellular Line")});
                WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_selectidentite"));
                if (WDAPIHF.hTrouve(WDAPIHF.getRequeteSansCasseNiAccent("req_selectidentite")).opEgal(false)) {
                    WDAPIFenetre_Commun.ouvreFille(GWDPProjet_Mobile.ms_Project.mWD_FEN_Identification);
                } else {
                    WDAPIFenetre_Commun.ouvreFille(GWDPProjet_Mobile.ms_Project.mWD_FEN_Informations1);
                }
            }

            public void activerEcoute() {
                activerEcouteurSelectionMenu();
            }
        }

        GWDMMENU__Menu() {
        }

        public void initialiserSousObjets() {
            this.mWD_OPT_OK.initialiserObjet();
            super.ajouterMenu(this.mWD_OPT_OK);
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Identification.this.getWDFenetreThis());
            super.setQuid(3095620489364620910L);
            super.setNom("MENU__Menu");
            super.setType(40001);
            super.setStyleOptionRepos(C0607n.Ps, C0607n.Kw, GWDFFEN_Identification.this.creerPolice_GEN("Tahoma", -11.0d, 0));
            super.setStyleOptionSurvol(C0607n.Ps, C0607n.Kw, GWDFFEN_Identification.this.creerPolice_GEN("Tahoma", -11.0d, 0));
            GWDFFEN_Identification.this.activerEcoute();
            initialiserSousObjets();
        }
    }

    class GWDSAI_Nom_u extends WDChampSaisieSimple {
        GWDSAI_Nom_u() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Identification.this.getWDFenetreThis());
            super.setRectLibelle(0, 0, 288, 18);
            super.setRectCompPrincipal(0, 18, 288, 37);
            super.setQuid(3095620489373796059L);
            super.setChecksum("931243226");
            super.setNom("SAI_Nom_u");
            super.setType(20001);
            super.setLibelle(WDChaineMultilangue.getString("Nom", "الإسم"));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setTaille(70);
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(16, 31);
            super.setTailleInitiale(288, 57);
            super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
            super.setPlan(0);
            super.setCadrageHorizontal(0);
            super.setMotDePasse(false);
            super.setLiaisonFichier("utilisateur", "nom_u");
            super.setTypeSaisie(0);
            super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("1", "1")));
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(2);
            super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
            super.setEllipse(0);
            super.setIndication(WDChaineMultilangue.getString("Saisir votre nom", "ادخال الإسم"));
            super.setNumTab(1);
            super.setModeAscenseur(2, 2);
            super.setEffacementAutomatique(true);
            super.setFinSaisieAutomatique(false);
            super.setLettreAppel(65535);
            super.setSelectionEnAffichage(true);
            super.setPersistant(false);
            super.setClavierEnSaisie(true);
            super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));
            super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));
            super.setRetraitGauche(0);
            super.setMiseABlancSiZero(true);
            super.setVerifieOrthographe(true);
            super.setTauxParallaxe(0, 0);
            super.setBoutonSuppression(0);
            super.setPresenceLibelle(true);
            super.setStyleLibelle(3355443, creerPolice_GEN("Droid Sans", -7.0d, 0), 3, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Edt.png?E5_3NP_8_8_8_8", new int[]{1, 4, 1, 4, 2, 4, 1, 4, 1}, new int[]{8, 8, 8, 8}, -1, 3, 5));
            super.setStyleSaisie(3355443, creerPolice_GEN("Droid Sans", -7.0d, 0));
            activerEcoute();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    class GWDSAI_Tel_u extends WDChampSaisieSimple {
        GWDSAI_Tel_u() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Identification.this.getWDFenetreThis());
            super.setRectLibelle(0, 0, 288, 18);
            super.setRectCompPrincipal(0, 18, 288, 32);
            super.setQuid(3095620489373664987L);
            super.setChecksum("931158615");
            super.setNom("SAI_Tel_u");
            super.setType(20004);
            super.setLibelle(WDChaineMultilangue.getString("Numéro Tel.", "رقم الهاتف"));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setTaille(0);
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(16, 100);
            super.setTailleInitiale(288, 52);
            super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
            super.setPlan(0);
            super.setCadrageHorizontal(0);
            super.setMotDePasse(false);
            super.setLiaisonFichier("utilisateur", "tel_u");
            super.setTypeSaisie(1);
            super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("+99 999 999", "+99 999 999")));
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(1);
            super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
            super.setEllipse(0);
            super.setIndication(WDChaineMultilangue.getString("Numéro de téléphone", "رقم الهاتف"));
            super.setNumTab(2);
            super.setModeAscenseur(2, 2);
            super.setEffacementAutomatique(true);
            super.setFinSaisieAutomatique(false);
            super.setLettreAppel(65535);
            super.setSelectionEnAffichage(true);
            super.setPersistant(false);
            super.setClavierEnSaisie(true);
            super.setMasqueAffichage(new WDChaineU(WDChaineMultilangue.getString("", "")));
            super.setParamBtnActionClavier(0, WDChaineMultilangue.getString("", ""));
            super.setRetraitGauche(0);
            super.setMiseABlancSiZero(true);
            super.setVerifieOrthographe(true);
            super.setTauxParallaxe(0, 0);
            super.setBoutonSuppression(0);
            super.setPresenceLibelle(true);
            super.setStyleLibelle(3355443, creerPolice_GEN("Droid Sans", -7.0d, 0), 3, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Edt.png?E5_3NP_8_8_8_8", new int[]{1, 4, 1, 4, 2, 4, 1, 4, 1}, new int[]{8, 8, 8, 8}, -1, 3, 5));
            super.setStyleSaisie(3355443, creerPolice_GEN("Droid Sans", -7.0d, 0));
            activerEcoute();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    public static class WDActiviteFenetre extends WDActivite {
        protected WDFenetre getFenetre() {
            return GWDPProjet_Mobile.ms_Project.mWD_FEN_Identification;
        }
    }

    public void declarerGlobale(WDObjet[] WD_tabParam) {
        super.declarerGlobale(WD_tabParam);
        if (WD_tabParam != null) {
            int WD_ntabParamLen = WD_tabParam.length;
        }
        WDAPIFenetre_Commun.fichierVersEcran();
    }

    public void activerEcoute() {
    }

    protected void creerChamps() {
        this.mWD_SAI_Tel_u = new GWDSAI_Tel_u();
        this.mWD_SAI_Nom_u = new GWDSAI_Nom_u();
        this.mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
        this.mWD_MENU__Menu = new GWDMMENU__Menu();
    }

    public void initialiserObjet() {
        super.setQuid(3095620489364358766L);
        super.setChecksum("924595030");
        super.setNom("FEN_Identification");
        super.setType(1);
        super.setMenuContextuelSysteme();
        super.setNote("", WDChaineMultilangue.getString("", ""));
        super.setCouleur(0);
        super.setCouleurFond(16777215);
        super.setPositionInitiale(0, 0);
        super.setTailleInitiale(320, 247);
        super.setTitre(WDChaineMultilangue.getString("Identification", "المعلومات الشخصية"));
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
        this.mWD_SAI_Tel_u.initialiserObjet();
        super.ajouter("SAI_Tel_u", this.mWD_SAI_Tel_u);
        this.mWD_SAI_Nom_u.initialiserObjet();
        super.ajouter("SAI_Nom_u", this.mWD_SAI_Nom_u);
        this.mWD_ACTB_ActionBar.initialiserObjet();
        super.ajouterActionBar(this.mWD_ACTB_ActionBar);
        this.mWD_MENU__Menu.initialiserObjet();
        ajouterMenuPrincipal(this.mWD_MENU__Menu);
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
