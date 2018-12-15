package com.masociete.projet_mobile.wdgen;

import com.masociete.projet_mobile.BuildConfig;
import com.masociete.projet_mobile.C0485R;
import fr.pcsoft.wdjava.api.WDAPIFenetre_Commun;
import fr.pcsoft.wdjava.api.WDAPIGPS;
import fr.pcsoft.wdjava.api.WDAPIHF;
import fr.pcsoft.wdjava.api.WDAPIToast;
import fr.pcsoft.wdjava.api.WDAPIVM_Commun;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.EWDInfoPlateforme;
import fr.pcsoft.wdjava.core.application.WDAbstractLanceur;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.types.WDChaineU;

public class GWDPProjet_Mobile extends WDProjet {
    public static GWDPProjet_Mobile ms_Project = new GWDPProjet_Mobile();
    public GWDFFEN_Choixdelange mWD_FEN_Choixdelange = new GWDFFEN_Choixdelange();
    public GWDFFEN_Identification mWD_FEN_Identification = new GWDFFEN_Identification();
    public GWDFFEN_Information mWD_FEN_Information = new GWDFFEN_Information();
    public GWDFFEN_Informations1 mWD_FEN_Informations1 = new GWDFFEN_Informations1();
    public GWDFFEN_Mes_incidents mWD_FEN_Mes_incidents = new GWDFFEN_Mes_incidents();
    public GWDFFEN_Signaler_incident mWD_FEN_Signaler_incident = new GWDFFEN_Signaler_incident();
    public GWDFIFI_Options mWD_FI_Options = new GWDFIFI_Options();

    public static class WDLanceur extends WDAbstractLanceur {
        public void init() {
            GWDPProjet_Mobile.GWDPProjet_Mobile_InitProjet(null);
        }

        public void run() {
            GWDPProjet_Mobile.ms_Project.lancerProjet();
        }
    }

    public GWDFFEN_Identification getFEN_Identification() {
        this.mWD_FEN_Identification.verifierOuverte();
        return this.mWD_FEN_Identification;
    }

    public GWDFFEN_Information getFEN_Information() {
        this.mWD_FEN_Information.verifierOuverte();
        return this.mWD_FEN_Information;
    }

    public GWDFFEN_Signaler_incident getFEN_Signaler_incident() {
        this.mWD_FEN_Signaler_incident.verifierOuverte();
        return this.mWD_FEN_Signaler_incident;
    }

    public GWDFFEN_Choixdelange getFEN_Choixdelange() {
        this.mWD_FEN_Choixdelange.verifierOuverte();
        return this.mWD_FEN_Choixdelange;
    }

    public GWDFFEN_Informations1 getFEN_Informations1() {
        this.mWD_FEN_Informations1.verifierOuverte();
        return this.mWD_FEN_Informations1;
    }

    public GWDFFEN_Mes_incidents getFEN_Mes_incidents() {
        this.mWD_FEN_Mes_incidents.verifierOuverte();
        return this.mWD_FEN_Mes_incidents;
    }

    public GWDFIFI_Options getFI_Options() {
        WDAppelContexte.getContexte();
        GWDFIFI_Options fiCtx = (GWDFIFI_Options) WDContexte.getFenetreInterne("FI_Options");
        return fiCtx != null ? fiCtx : this.mWD_FI_Options;
    }

    public GWDPProjet_Mobile() {
        ajouterFenetre("FEN_Identification", this.mWD_FEN_Identification);
        ajouterFenetre("FEN_Information", this.mWD_FEN_Information);
        ajouterFenetre("FEN_Signaler_incident", this.mWD_FEN_Signaler_incident);
        ajouterFenetre("FEN_Choixdelange", this.mWD_FEN_Choixdelange);
        ajouterFenetre("FEN_Informations1", this.mWD_FEN_Informations1);
        ajouterFenetre("FEN_Mes_incidents", this.mWD_FEN_Mes_incidents);
        ajouterFenetreInterne("FI_Options");
        ajouterRequeteWDR(new GWDRREQ_selectlangue());
        ajouterRequeteWDR(new GWDRREQ_selectidentite());
        ajouterRequeteWDR(new GWDRREQ_updateuser());
        ajouterRequeteWDR(new GWDRREQ_updateincident());
    }

    public void initProjet() {
        WDAPIHF.hCreationSiInexistant(new WDChaineU(C0607n.Vc), new WDChaineU("116@2018"));
        if (WDAPIGPS.gpsEtat().opEgal(2)) {
            WDAPIToast.toastAffiche("Pour faciliter notre intervention, il est obligatoire d'activer votre GPS.");
            WDAPIFenetre_Commun.ferme();
        }
        WDAPIGPS.gpsInitParametre(4, 66);
        WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_selectlangue"));
        WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_selectlangue"));
        if (WDAPIHF.getFichierSansCasseNiAccent("req_selectlangue").getRubriqueSansCasseNiAccent("langue").opEgal(1)) {
            WDAPIVM_Commun.nation(19);
            WDAPIVM_Commun.changeAlphabet(C0607n.Gk);
            return;
        }
        WDAPIVM_Commun.nation(5);
        WDAPIVM_Commun.changeAlphabet(C0607n.bx);
    }

    static {
        ms_Project.setLangueProjet(new int[]{1, 31}, new int[]{0, C0607n.Vu}, 1, false);
        ms_Project.setNomAnalyseProjet("projet_mobile");
        ms_Project.setModeGestionFichier(true);
        ms_Project.setCreationAutomatiqueFichierDonnees(true);
        ms_Project.setNomCollectionProcedure(new String[0]);
        ms_Project.setPaletteCouleurGabarit(new int[]{3754721, 2531578, 7191649, 8759296, 13806676, 13206059, 11099384, 12084626, 12012126, 6639172, 10855829});
    }

    public String getVersionApplication() {
        return BuildConfig.VERSION_NAME;
    }

    public String getNomSociete() {
        return "";
    }

    public String getNomAPK() {
        return "116";
    }

    public int getIdNomApplication() {
        return C0485R.string.app_name;
    }

    public boolean isModeAnsi() {
        return false;
    }

    public boolean isAffectationTableauParCopie() {
        return true;
    }

    public boolean isAssistanceAutoHFActive() {
        return true;
    }

    public String getPackageRacine() {
        return BuildConfig.APPLICATION_ID;
    }

    public int getIdIconeApplication() {
        return C0485R.drawable.logoportrait_2;
    }

    public int getInfoPlateforme(EWDInfoPlateforme info) {
        switch (info) {
            case DPI_ECRAN:
                return 240;
            case HAUTEUR_BARRE_SYSTEME:
            case HAUTEUR_BARRE_TITRE:
                return 25;
            case HAUTEUR_ACTION_BAR:
                return 48;
            case HAUTEUR_BARRE_BAS:
                return 0;
            case HAUTEUR_ECRAN:
                return 533;
            case LARGEUR_ECRAN:
                return 320;
            default:
                return 0;
        }
    }

    public boolean isActiveThemeMaterialDesign() {
        return true;
    }

    public String getAdresseEmail() {
        return "";
    }

    public boolean isIgnoreErreurCertificatHTTPS() {
        return false;
    }

    public boolean isUniteAffichageLogique() {
        return false;
    }

    public String getFichierWDM() {
        return null;
    }

    protected void declarerRessources() {
        super.ajouterFichierAssocie("C:\\Mes Projets Mobile\\Projet_Mobile\\STOP.PNG?E5", C0485R.drawable.stop_18_selector, "");
        super.ajouterFichierAssocie("C:\\Mes Projets Mobile\\Projet_Mobile\\MICRO.PNG?E5", C0485R.drawable.micro_17_selector, "");
        super.ajouterFichierAssocie("C:\\Mes Projets Mobile\\Projet_Mobile\\JOUER.PNG?E5", C0485R.drawable.jouer_16_selector, "");
        super.ajouterFichierAssocie("C:\\Mes Projets Mobile\\Projet_Mobile\\IMAGEALBUM.PNG?E5", C0485R.drawable.imagealbum_15_selector, "");
        super.ajouterFichierAssocie("C:\\Mes Projets Mobile\\Projet_Mobile\\APPAREILPHOTO.PNG?E5", C0485R.drawable.appareilphoto_14_selector, "");
        super.ajouterFichierAssocie("C:\\Mes Projets Mobile\\Projet_Mobile\\ACTIVANDROID 5_BTN_STD.PNG?E5_3NP_8_8_10_10", C0485R.drawable.activandroid_5_btn_std_13_np3_8_8_10_10_selector, "");
        super.ajouterFichierAssocie("C:\\Mes Projets Mobile\\Projet_Mobile\\ACTIVANDROID 5_BREAK.PNG", C0485R.drawable.activandroid_5_break_12, "");
        super.ajouterFichierAssocie("C:\\Mes Projets Mobile\\Projet_Mobile\\ACTIVANDROID 5_EDT.PNG?E5_3NP_8_8_8_8", C0485R.drawable.activandroid_5_edt_11_np3_8_8_8_8_selector, "");
        super.ajouterFichierAssocie("C:\\Mes Projets Mobile\\Projet_Mobile\\LOGONEW.PNG", C0485R.drawable.logonew_10, "");
        super.ajouterFichierAssocie("C:\\Mes Projets Mobile\\Projet_Mobile\\ACTIVANDROID 5_RADIO.PNG?E12_A1A6A1A6A1A6A1A6A1A6A1A6_Radio", C0485R.drawable.activandroid_5_radio_9_selector_anim, "");
        super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\PROJET_MOBILE\\SECURITE_48.PNG", C0485R.drawable.securite_48_8, "");
        super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\PROJET_MOBILE\\QUITTER.PNG", C0485R.drawable.quitter_7, "");
        super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\PROJET_MOBILE\\PARAMETRE.PNG", C0485R.drawable.parametre_6, "");
        super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\PROJET_MOBILE\\LOGOO_36.PNG", C0485R.drawable.logoo_36_5, "");
        super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\PROJET_MOBILE\\IOS_ZR_ARROW.PNG", C0485R.drawable.ios_zr_arrow_4, "");
    }

    static void GWDPProjet_Mobile_InitProjet(String[] args) {
        ms_Project.initialiserProjet("Projet_Mobile", "Android", args);
    }

    protected static void GWDPProjet_Mobile_TermineProjet() {
        ms_Project = null;
    }
}
