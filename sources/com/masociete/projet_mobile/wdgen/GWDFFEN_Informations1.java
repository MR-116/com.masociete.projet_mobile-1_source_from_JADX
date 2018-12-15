package com.masociete.projet_mobile.wdgen;

import fr.pcsoft.wdjava.api.WDAPIFenetre_Commun;
import fr.pcsoft.wdjava.api.WDAPIHF;
import fr.pcsoft.wdjava.api.WDAPINet;
import fr.pcsoft.wdjava.api.WDAPIRPL;
import fr.pcsoft.wdjava.api.WDAPISys;
import fr.pcsoft.wdjava.api.WDAPIToast;
import fr.pcsoft.wdjava.api.WDAPIVM_Commun;
import fr.pcsoft.wdjava.api.WDAPIZoneRepetee;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.executor.WDProcExecutorTimer;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDVoid;
import fr.pcsoft.wdjava.ui.actionbar.WDActionBar;
import fr.pcsoft.wdjava.ui.activite.WDActivite;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.image.WDChampImage;
import fr.pcsoft.wdjava.ui.champs.libelle.WDLibelle;
import fr.pcsoft.wdjava.ui.champs.slidingmenu.WDSlidingMenu;
import fr.pcsoft.wdjava.ui.champs.zr.WDAttributZR;
import fr.pcsoft.wdjava.ui.champs.zr.WDZoneRepeteeFichierEnMemoire;
import fr.pcsoft.wdjava.ui.menu.WDMenuPrincipal;
import fr.pcsoft.wdjava.ui.menu.WDOptionMenu;
import fr.pcsoft.wdjava.ui.p069g.C1409j;

public class GWDFFEN_Informations1 extends WDFenetre {
    public GWDACTB_ActionBar mWD_ACTB_ActionBar;
    public GWDFEN_Informations1_LeftSliding mWD_FEN_Informations1_LeftSliding;
    public GWDMMENU__Menu mWD_MENU__Menu;
    public GWDZR_EXPRESS_Information mWD_ZR_EXPRESS_Information;

    class GWDACTB_ActionBar extends WDActionBar {
        GWDACTB_ActionBar() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Informations1.this.getWDFenetreThis());
            super.setNom("ACTB_ActionBar");
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setParamBoutonGauche(true, 3, WDChaineMultilangue.getString("", ""), WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\logonew.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\logonew.png"));
            super.setParamBoutonDroit(false, 0, WDChaineMultilangue.getString("", ""), WDChaineMultilangue.getString("", ""));
            super.setStyleActionBar(C0607n.Sj, 16777215, false);
            super.setImageFond(WDChaineMultilangue.getString("", ""));
            super.terminerInitialisation();
        }
    }

    class GWDFEN_Informations1_LeftSliding extends WDSlidingMenu {
        GWDFEN_Informations1_LeftSliding() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Informations1.this.getWDFenetreThis());
            super.setFenetreInterne("FI_Options");
            super.setParamSlidingMenu(0, true, 0);
            super.terminerInitialisation();
        }
    }

    class GWDMMENU__Menu extends WDMenuPrincipal {
        public GWDMOPT_Signaler mWD_OPT_Signaler = new GWDMOPT_Signaler(true);

        class GWDMOPT_Signaler extends WDOptionMenu {
            public GWDMOPT_Signaler(boolean b) {
                super(b, true);
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetre(GWDFFEN_Informations1.this.getWDFenetreThis());
                super.setConteneurMenu(GWDMMENU__Menu.this);
                super.setQuid(3098102666781471303L);
                super.setNom("OPT_Signaler");
                super.setType(40001);
                super.setLibelle(WDChaineMultilangue.getString("Signaler", "اضافة"));
                super.setEtat(0);
                super.setImage("");
                super.setVisible(true);
                super.setCochee(false);
                super.setNumero(1);
                super.setAffichageDansActionBar(true);
                super.setIconePredefinie(4);
                activerEcoute();
            }

            public void selectionOptionMenu() {
                super.selectionOptionMenu();
                WDAPIFenetre_Commun.ouvreFille(GWDPProjet_Mobile.ms_Project.mWD_FEN_Signaler_incident);
            }

            public void activerEcoute() {
                activerEcouteurSelectionMenu();
            }
        }

        GWDMMENU__Menu() {
        }

        public void initialiserSousObjets() {
            this.mWD_OPT_Signaler.initialiserObjet();
            super.ajouterMenu(this.mWD_OPT_Signaler);
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Informations1.this.getWDFenetreThis());
            super.setQuid(3097606387622026617L);
            super.setNom("MENU__Menu");
            super.setType(40001);
            super.setStyleOptionRepos(C0607n.Ps, C0607n.Kw, GWDFFEN_Informations1.this.creerPolice_GEN("Tahoma", -11.0d, 0));
            super.setStyleOptionSurvol(C0607n.Ps, C0607n.Kw, GWDFFEN_Informations1.this.creerPolice_GEN("Tahoma", -11.0d, 0));
            GWDFFEN_Informations1.this.activerEcoute();
            initialiserSousObjets();
        }
    }

    class GWDZR_EXPRESS_Information extends WDZoneRepeteeFichierEnMemoire {
        public GWDATT_AttLibelle mWD_ATT_AttLibelle = new GWDATT_AttLibelle();
        public GWDATT_AttVignette mWD_ATT_AttVignette = new GWDATT_AttVignette();
        public GWDIMG_Vignette mWD_IMG_Vignette = new GWDIMG_Vignette();
        public GWDLIB_Libelle1 mWD_LIB_Libelle1 = new GWDLIB_Libelle1();

        class GWDATT_AttLibelle extends WDAttributZR {
            GWDATT_AttLibelle() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setNom("ATT_AttLibellé");
                super.setLiaisonFichier("express_information", "titre_inf");
                super.setChampAssocie(GWDZR_EXPRESS_Information.this.mWD_LIB_Libelle1);
                super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);
                GWDZR_EXPRESS_Information.this.activerEcoute();
                super.terminerInitialisation();
            }
        }

        class GWDATT_AttVignette extends WDAttributZR {
            GWDATT_AttVignette() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setNom("ATT_AttVignette");
                super.setLiaisonFichier("express_information", "multimedia_inf");
                super.setChampAssocie(GWDZR_EXPRESS_Information.this.mWD_IMG_Vignette);
                super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);
                GWDZR_EXPRESS_Information.this.activerEcoute();
                super.terminerInitialisation();
            }
        }

        class GWDIMG_Vignette extends WDChampImage {
            GWDIMG_Vignette() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetre(GWDFFEN_Informations1.this.getWDFenetreThis());
                super.setQuid(3097606387632905671L);
                super.setChecksum("802428064");
                super.setNom("IMG_Vignette");
                super.setType(8);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setNavigable(false);
                super.setEtatInitial(0);
                super.setPositionInitiale(4, 4);
                super.setTailleInitiale(47, 47);
                super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
                super.setPlan(0);
                super.setLiaisonFichier("express_information", "multimedia_inf");
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(2);
                super.setAncrageInitial(2, 1000, 1000, 1000, 1000, 0);
                super.setTransparence(1);
                super.setParamImage(2097160, 0, true, 100);
                super.setSymetrie(0);
                super.setZoneClicage(false);
                super.setPCodeMultitouch(false);
                super.setChargementEnTacheDeFond(true);
                super.setOrientationExif(true);
                super.setParamAnimation(1, 1, false, C1409j.f4188e, true, false);
                super.setAnimationInitiale(false);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(false);
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 0, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDLIB_Libelle1 extends WDLibelle {
            GWDLIB_Libelle1() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetre(GWDFFEN_Informations1.this.getWDFenetreThis());
                super.setQuid(3097606387632840135L);
                super.setChecksum("802360248");
                super.setNom("LIB_Libellé1");
                super.setType(3);
                super.setTypeSaisie(0);
                super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
                super.setLibelle(WDChaineMultilangue.getString("Avis de recherche", "0"));
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setEtatInitial(0);
                super.setPositionInitiale(57, 16);
                super.setTailleInitiale(259, 22);
                super.setPlan(0);
                super.setCadrageHorizontal(0);
                super.setCadrageVertical(0);
                super.setLiaisonFichier("express_information", "titre_inf");
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(1);
                super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
                super.setEllipse(32768);
                super.setTauxParallaxe(0, 0);
                super.setPresenceLibelle(true);
                super.setStyleLibelle(3355443, -1, creerPolice_GEN("Arial", -8.0d, 1), 3, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        GWDZR_EXPRESS_Information() {
        }

        public void initialiserSousObjets() {
            super.initialiserSousObjets();
            this.mWD_ATT_AttLibelle.initialiserObjet();
            super.ajouterAttributZR(this.mWD_ATT_AttLibelle);
            this.mWD_ATT_AttVignette.initialiserObjet();
            super.ajouterAttributZR(this.mWD_ATT_AttVignette);
            this.mWD_LIB_Libelle1.initialiserObjet();
            super.ajouterChamp("LIB_Libellé1", this.mWD_LIB_Libelle1);
            this.mWD_IMG_Vignette.initialiserObjet();
            super.ajouterChamp("IMG_Vignette", this.mWD_IMG_Vignette);
            creerAttributAuto();
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Informations1.this.getWDFenetreThis());
            super.setRectCompPrincipal(0, 0, 320, 55);
            super.setQuid(3097606387632643527L);
            super.setChecksum("802175952");
            super.setNom("ZR_EXPRESS_Information");
            super.setType(30);
            super.setLibelle(WDChaineMultilangue.getString("", ""));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(0, 0);
            super.setTailleInitiale(320, 247);
            super.setValeurInitiale("");
            super.setPlan(0);
            super.setSourceRemplissage("express_information", "idexpress_information", "idexpress_information", false, "", false);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(1);
            super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);
            super.setNumTab(1);
            super.setModeAscenseur(1, 1);
            super.setModeSelection(99);
            super.setSaisieEnCascade(false);
            super.setLettreAppel(65535);
            super.setEnregistrementSortieLigne(true);
            super.setPersistant(false);
            super.setParamAffichage(0, 1, 317, 55);
            super.setBtnEnrouleDeroule(true);
            super.setScrollRapide(false, null);
            super.setDeplacementParDnd(0);
            super.setSwipe(0, "", false, false, "", false, false);
            super.setRecyclageChamp(false);
            super.setTauxParallaxe(0, 0);
            super.setPresenceLibelle(false);
            super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            super.setStyleSeparateurVerticaux(true, 15132390);
            super.setStyleSeparateurHorizontaux(1, 15132390);
            super.setDessinerLigneVide(false);
            super.setPullToRefresh("", -1);
            super.setCouleurCellule(-1, 16777215, 16777215, 13941760);
            super.setImagePlusMoins("");
            activerEcoute();
            initialiserSousObjets();
            super.terminerInitialisation();
        }

        public void selectionLigne() {
            super.selectionLigne();
            WDAPIFenetre_Commun.ouvreFille(GWDPProjet_Mobile.ms_Project.mWD_FEN_Information);
        }

        public WDObjet raffraichissementPTR() {
            super.raffraichissementPTR();
            WDObjet vWD_ResConnexion = new WDBooleen();
            vWD_ResConnexion.setValeur(WDAPINet.internetConnecte());
            if (!vWD_ResConnexion.opEgal(true)) {
                WDAPIToast.toastAffiche("Problème de connexion");
            } else if (WDAPIRPL.replicOuvre("replic_mobile_inf", "", "41.188.113.206", "admin", "2018").opEgal(true)) {
                if (WDAPIRPL.replicInfo("replic_mobile_inf", 2).opEgal(false)) {
                    WDAPIRPL.replicInitialise("replic_mobile_inf");
                }
                WDAPIRPL.replicSynchronise("replic_mobile_inf", 4);
                WDAPIToast.toastAffiche("Données synchronisées");
            } else {
                WDAPIToast.toastAffiche("Problème de connexion");
            }
            if (WDObjet.ErreurDetectee.opEgal(true)) {
                WDAPIToast.toastAffiche("Erreur de connexion");
            }
            return new WDVoid("raffraichissementPTR");
        }

        public void activerEcoute() {
            super.activerEcouteurSelection();
        }
    }

    public static class WDActiviteFenetre extends WDActivite {
        protected WDFenetre getFenetre() {
            return GWDPProjet_Mobile.ms_Project.mWD_FEN_Informations1;
        }
    }

    public void fWD_actualiserInfos_autoWX() {
        initExecProcLocale("actualiserInfos");
        try {
            WDObjet vWD_ResConnexion = new WDBooleen();
            vWD_ResConnexion.setValeur(WDAPINet.internetConnecte());
            if (WDAPIFenetre_Commun.fenEtat(GWDPProjet_Mobile.ms_Project.mWD_FEN_Informations1).opEgal(0)) {
                if (!vWD_ResConnexion.opEgal(true)) {
                    WDAPIToast.toastAffiche("Problème de connexion");
                } else if (WDAPIRPL.replicOuvre("replic_mobile_inf", "", "41.188.113.206", "admin", "2018").opEgal(true)) {
                    if (WDAPIRPL.replicInfo("replic_mobile_inf", 2).opEgal(false)) {
                        WDAPIRPL.replicInitialise("replic_mobile_inf");
                    }
                    WDAPIRPL.replicSynchronise("replic_mobile_inf", 4);
                    WDAPIToast.toastAffiche("Données synchronisées");
                } else {
                    WDAPIToast.toastAffiche("Problème de connexion");
                }
                if (WDObjet.ErreurDetectee.opEgal(true)) {
                    WDAPIToast.toastAffiche("Erreur de connexion");
                }
            }
            finExecProcLocale();
        } catch (Throwable th) {
            finExecProcLocale();
        }
    }

    public void fWD_actualiserInfos() {
        WDProcExecutorTimer.getInstance().initExecAutoProcedure_GEN("actualiserInfos", 1, 5900, 30130, 1, new WDObjet[0]);
    }

    public void runAutoProc() {
        fWD_actualiserInfos();
    }

    public void declarerGlobale(WDObjet[] WD_tabParam) {
        super.declarerGlobale(WD_tabParam);
        if (WD_tabParam != null) {
            int WD_ntabParamLen = WD_tabParam.length;
        }
    }

    public void init() {
        super.init();
        WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_selectidentite"), new WDEntier4(0), new WDObjet[]{WDAPISys.sysIMEI("Cellular Line")});
        WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_selectidentite"));
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

    public void fermetureFenetreFille() {
        super.fermetureFenetreFille();
        WDAPIZoneRepetee.zoneRepeteeAffiche(this.mWD_ZR_EXPRESS_Information, new WDChaineU(C0607n.rq));
    }

    public void activerEcoute() {
    }

    protected void creerChamps() {
        this.mWD_ZR_EXPRESS_Information = new GWDZR_EXPRESS_Information();
        this.mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
        this.mWD_FEN_Informations1_LeftSliding = new GWDFEN_Informations1_LeftSliding();
        this.mWD_MENU__Menu = new GWDMMENU__Menu();
    }

    public void initialiserObjet() {
        super.setQuid(3097606387621764473L);
        super.setChecksum("794073227");
        super.setNom("FEN_Informations1");
        super.setType(1);
        super.setMenuContextuelSysteme();
        super.setNote("", WDChaineMultilangue.getString("", ""));
        super.setCouleur(0);
        super.setCouleurFond(16777215);
        super.setPositionInitiale(0, 0);
        super.setTailleInitiale(320, 247);
        super.setTitre(WDChaineMultilangue.getString("La Gendarmerie à votre service", "الدرك الوطني في خدمتكم"));
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
        this.mWD_ZR_EXPRESS_Information.initialiserObjet();
        super.ajouter("ZR_EXPRESS_Information", this.mWD_ZR_EXPRESS_Information);
        this.mWD_ACTB_ActionBar.initialiserObjet();
        super.ajouterActionBar(this.mWD_ACTB_ActionBar);
        this.mWD_FEN_Informations1_LeftSliding.initialiserObjet();
        super.ajouterSlidingMenu(this.mWD_FEN_Informations1_LeftSliding, 0);
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
        return false;
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
