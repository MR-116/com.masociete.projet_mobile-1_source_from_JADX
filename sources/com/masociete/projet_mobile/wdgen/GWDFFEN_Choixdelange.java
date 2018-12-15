package com.masociete.projet_mobile.wdgen;

import fr.pcsoft.wdjava.api.WDAPIFenetre_Commun;
import fr.pcsoft.wdjava.api.WDAPIHF;
import fr.pcsoft.wdjava.api.WDAPISys;
import fr.pcsoft.wdjava.api.WDAPIVM_Commun;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.ui.actionbar.WDActionBar;
import fr.pcsoft.wdjava.ui.activite.WDActivite;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.WDBoutonRadio;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.WDSelecteur;
import fr.pcsoft.wdjava.ui.menu.WDMenuPrincipal;
import fr.pcsoft.wdjava.ui.menu.WDOptionMenu;
import fr.pcsoft.wdjava.ui.p069g.C1409j;

public class GWDFFEN_Choixdelange extends WDFenetre {
    public GWDACTB_ActionBar mWD_ACTB_ActionBar;
    public GWDMMENU__Menu mWD_MENU__Menu;
    public GWDSEL_SansNom1 mWD_SEL_SansNom1;

    class GWDACTB_ActionBar extends WDActionBar {
        GWDACTB_ActionBar() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Choixdelange.this.getWDFenetreThis());
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
                super.setFenetre(GWDFFEN_Choixdelange.this.getWDFenetreThis());
                super.setConteneurMenu(GWDMMENU__Menu.this);
                super.setQuid(3097055360576191863L);
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
                WDAPIHF.getFichierSansCasseNiAccent("langues").getRubriqueSansCasseNiAccent("num_serie_tel").setValeur(WDAPISys.sysIMEI("Cellular Line"));
                WDAPIHF.getFichierSansCasseNiAccent("langues").getRubriqueSansCasseNiAccent("langue").setValeur(GWDFFEN_Choixdelange.this.mWD_SEL_SansNom1);
                WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("langues"));
                WDAPIFenetre_Commun.ouvreFille(GWDPProjet_Mobile.ms_Project.mWD_FEN_Identification);
                WDAPIFenetre_Commun.ferme(GWDPProjet_Mobile.ms_Project.mWD_FEN_Choixdelange);
                WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_selectlangue"));
                WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_selectlangue"));
                if (WDAPIHF.hTrouve(WDAPIHF.getRequeteSansCasseNiAccent("req_selectlangue")).opEgal(false)) {
                    WDAPIFenetre_Commun.ouvreFille(GWDPProjet_Mobile.ms_Project.mWD_FEN_Choixdelange);
                    return;
                }
                if (WDAPIHF.getFichierSansCasseNiAccent("req_selectlangue").getRubriqueSansCasseNiAccent("langue").opEgal(1)) {
                    WDAPIVM_Commun.nation(19);
                    WDAPIVM_Commun.changeAlphabet(C0607n.Gk);
                } else {
                    WDAPIVM_Commun.nation(5);
                    WDAPIVM_Commun.changeAlphabet(C0607n.bx);
                }
                if (WDAPIHF.hTrouve(WDAPIHF.getRequeteSansCasseNiAccent("req_selectidentite")).opEgal(false)) {
                    WDAPIFenetre_Commun.ouvreFille(GWDPProjet_Mobile.ms_Project.mWD_FEN_Identification);
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
            super.setFenetre(GWDFFEN_Choixdelange.this.getWDFenetreThis());
            super.setQuid(3097055360576126327L);
            super.setNom("MENU__Menu");
            super.setType(40001);
            super.setStyleOptionRepos(C0607n.Ps, C0607n.Kw, GWDFFEN_Choixdelange.this.creerPolice_GEN("Tahoma", -11.0d, 0));
            super.setStyleOptionSurvol(C0607n.Ps, C0607n.Kw, GWDFFEN_Choixdelange.this.creerPolice_GEN("Tahoma", -11.0d, 0));
            GWDFFEN_Choixdelange.this.activerEcoute();
            initialiserSousObjets();
        }
    }

    class GWDSEL_SansNom1 extends WDSelecteur {
        public GWDSEL_SansNom1_Option_0 mWD_SEL_SansNom1_Option_0 = new GWDSEL_SansNom1_Option_0();
        public GWDSEL_SansNom1_Option_1 mWD_SEL_SansNom1_Option_1 = new GWDSEL_SansNom1_Option_1();

        class GWDSEL_SansNom1_Option_0 extends WDBoutonRadio {
            GWDSEL_SansNom1_Option_0() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setLibelle(WDChaineMultilangue.getString("العربية", "العربية"));
                super.setHauteurOption(0);
                super.setValeurRenvoyee(new WDChaineU(""));
                super.setStyleLibelleOption(3355443, GWDSEL_SansNom1.this.creerPolice_GEN("Droid Sans", -9.0d, 0));
                super.terminerInitialisation();
            }
        }

        class GWDSEL_SansNom1_Option_1 extends WDBoutonRadio {
            GWDSEL_SansNom1_Option_1() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setLibelle(WDChaineMultilangue.getString("Français", "الفرنسية"));
                super.setHauteurOption(0);
                super.setValeurRenvoyee(new WDChaineU(""));
                super.setStyleLibelleOption(3355443, GWDSEL_SansNom1.this.creerPolice_GEN("Droid Sans", -9.0d, 0));
                super.terminerInitialisation();
            }
        }

        GWDSEL_SansNom1() {
        }

        public void initialiserSousObjets() {
            super.initialiserSousObjets();
            super.ajouterOption(this.mWD_SEL_SansNom1_Option_0);
            super.ajouterOption(this.mWD_SEL_SansNom1_Option_1);
            positionnerOptions();
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Choixdelange.this.getWDFenetreThis());
            super.setRectCompPrincipal(0, 0, 224, 79);
            super.setQuid(3097055618280187799L);
            super.setChecksum("875750900");
            super.setNom("SEL_SansNom1");
            super.setType(6);
            super.setLibelle(WDChaineMultilangue.getString("", ""));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(57, 27);
            super.setTailleInitiale(224, 79);
            super.setValeurInitiale("1");
            super.setPlan(0);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(1);
            super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);
            super.setNumTab(1);
            super.setLettreAppel(65535);
            super.setPersistant(false);
            super.setParamOptions(false, 1, true, true, false);
            super.setValeurRenvoyeeParProgrammation(false);
            super.setTauxParallaxe(0, 0);
            super.setPresenceLibelle(false);
            super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1));
            super.setParamAnimationChamp(18, 19, C1409j.f4188e);
            super.setParamAnimationChamp(19, 20, C1409j.f4188e);
            super.setImageCoche("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Radio.png?E12_A1A6A1A6A1A6A1A6A1A6A1A6_Radio", 6);
            activerEcoute();
            initialiserSousObjets();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    public static class WDActiviteFenetre extends WDActivite {
        protected WDFenetre getFenetre() {
            return GWDPProjet_Mobile.ms_Project.mWD_FEN_Choixdelange;
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
        this.mWD_SEL_SansNom1 = new GWDSEL_SansNom1();
        this.mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
        this.mWD_MENU__Menu = new GWDMMENU__Menu();
    }

    public void initialiserObjet() {
        super.setQuid(3097055360575733064L);
        super.setChecksum("872121138");
        super.setNom("FEN_Choixdelange");
        super.setType(1);
        super.setMenuContextuelSysteme();
        super.setNote("", WDChaineMultilangue.getString("", ""));
        super.setCouleur(0);
        super.setCouleurFond(16777215);
        super.setPositionInitiale(0, 0);
        super.setTailleInitiale(320, 247);
        super.setTitre(WDChaineMultilangue.getString("Choix de langue", "Choix de langue"));
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
        this.mWD_SEL_SansNom1.initialiserObjet();
        super.ajouter("SEL_SansNom1", this.mWD_SEL_SansNom1);
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
