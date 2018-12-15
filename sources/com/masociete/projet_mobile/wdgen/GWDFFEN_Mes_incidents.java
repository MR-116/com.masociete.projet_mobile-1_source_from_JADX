package com.masociete.projet_mobile.wdgen;

import fr.pcsoft.wdjava.api.WDAPIFenetre_Commun;
import fr.pcsoft.wdjava.api.WDAPIHF;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import fr.pcsoft.wdjava.ui.actionbar.WDActionBar;
import fr.pcsoft.wdjava.ui.activite.WDActivite;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.image.WDChampImage;
import fr.pcsoft.wdjava.ui.champs.libelle.WDLibelle;
import fr.pcsoft.wdjava.ui.champs.multimedia.WDChampMultimedia;
import fr.pcsoft.wdjava.ui.champs.saisie.WDChampSaisieSimple;
import fr.pcsoft.wdjava.ui.champs.zr.WDZoneRepeteeFichierAccesDirect;
import fr.pcsoft.wdjava.ui.p069g.C1409j;

public class GWDFFEN_Mes_incidents extends WDFenetre {
    public GWDACTB_ActionBar mWD_ACTB_ActionBar;
    public GWDLIB_Fond mWD_LIB_Fond;
    public GWDMM_mVocal mWD_MM_mVocal;
    public GWDZR_EXPRESS_Incident mWD_ZR_EXPRESS_Incident;

    class GWDACTB_ActionBar extends WDActionBar {
        GWDACTB_ActionBar() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Mes_incidents.this.getWDFenetreThis());
            super.setNom("ACTB_ActionBar");
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setParamBoutonGauche(true, 1, WDChaineMultilangue.getString("", ""), WDChaineMultilangue.getString("C:\\Mes Projets Mobile\\Projet_Mobile\\logonew.png", "C:\\Mes Projets Mobile\\Projet_Mobile\\logonew.png"));
            super.setParamBoutonDroit(false, 0, WDChaineMultilangue.getString("", ""), WDChaineMultilangue.getString("", ""));
            super.setStyleActionBar(C0607n.Sj, 16777215, false);
            super.setImageFond(WDChaineMultilangue.getString("", ""));
            super.terminerInitialisation();
        }
    }

    class GWDLIB_Fond extends WDLibelle {
        GWDLIB_Fond() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Mes_incidents.this.getWDFenetreThis());
            super.setQuid(3099802627718754833L);
            super.setChecksum("772042106");
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

    class GWDMM_mVocal extends WDChampMultimedia {
        GWDMM_mVocal() {
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Mes_incidents.this.getWDFenetreThis());
            super.setQuid(3117863927346812312L);
            super.setChecksum("851966921");
            super.setNom("MM_mVocal");
            super.setType(39);
            super.setLibelle(WDChaineMultilangue.getString("Multimédia", "Multimedia"));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
            super.setNavigable(true);
            super.setEtatInitial(0);
            super.setPositionInitiale(4, 155);
            super.setTailleInitiale(C0607n.oq, 54);
            super.setPlan(0);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(3);
            super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);
            super.setNumTab(2);
            super.setModeAffichage(6);
            super.setParamControles(1);
            super.setTauxParallaxe(0, 0);
            super.setPresenceLibelle(false);
            super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -1, 0, C0607n.Xv);
            super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
            activerEcoute();
            super.terminerInitialisation();
        }

        public void init() {
            super.init();
            setValeur(WDAPIHF.getFichierSansCasseNiAccent("express_incident").getRubriqueSansCasseNiAccent("multimedia_vocal"));
        }

        public void activerEcoute() {
        }
    }

    class GWDZR_EXPRESS_Incident extends WDZoneRepeteeFichierAccesDirect {
        public GWDdate_incident mWD_date_incident = new GWDdate_incident();
        public GWDdescription_incident mWD_description_incident = new GWDdescription_incident();
        public GWDheure_incident mWD_heure_incident = new GWDheure_incident();
        public GWDmultimedia_incident mWD_multimedia_incident = new GWDmultimedia_incident();
        public GWDtitre_incident mWD_titre_incident = new GWDtitre_incident();

        class GWDdate_incident extends WDChampSaisieSimple {
            GWDdate_incident() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetre(GWDFFEN_Mes_incidents.this.getWDFenetreThis());
                super.setRectCompPrincipal(0, 2, 102, 44);
                super.setQuid(3099803121646990360L);
                super.setChecksum("779131174");
                super.setNom("date_incident");
                super.setType(20002);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setTaille(0);
                super.setNavigable(true);
                super.setEtatInitial(1);
                super.setPositionInitiale(C0607n.f1465w, 85);
                super.setTailleInitiale(102, 48);
                super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
                super.setPlan(0);
                super.setCadrageHorizontal(2);
                super.setMotDePasse(false);
                super.setLiaisonFichier("express_incident", "date_incident");
                super.setTypeSaisie(2);
                super.setFormatMemorise("AAAAMMJJ");
                super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("UseDatePickerDateMask", "UseDatePickerDateMask")));
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(4);
                super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
                super.setEllipse(0);
                super.setIndication(WDChaineMultilangue.getString("", ""));
                super.setNumTab(3);
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
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -2, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
                super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Edt.png?E5_3NP_8_8_8_8", new int[]{1, 4, 1, 4, 2, 4, 1, 4, 1}, new int[]{8, 8, 8, 8}, -1, 3, 5));
                super.setStyleSaisie(3355443, creerPolice_GEN("Roboto", -9.0d, 0));
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDdescription_incident extends WDChampSaisieSimple {
            GWDdescription_incident() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetre(GWDFFEN_Mes_incidents.this.getWDFenetreThis());
                super.setRectCompPrincipal(0, 2, 312, 33);
                super.setQuid(3099803121646007273L);
                super.setChecksum("778055165");
                super.setNom("description_incident");
                super.setType(20001);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setTaille(C0536n.f1006y);
                super.setNavigable(true);
                super.setEtatInitial(1);
                super.setPositionInitiale(2, 43);
                super.setTailleInitiale(312, 37);
                super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
                super.setPlan(0);
                super.setCadrageHorizontal(0);
                super.setMotDePasse(false);
                super.setLiaisonFichier("express_incident", "description_incident");
                super.setTypeSaisie(0);
                super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(2);
                super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
                super.setEllipse(0);
                super.setIndication(WDChaineMultilangue.getString("", ""));
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
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -2, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
                super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Edt.png?E5_3NP_8_8_8_8", new int[]{1, 4, 1, 4, 2, 4, 1, 4, 1}, new int[]{8, 8, 8, 8}, -1, 3, 5));
                super.setStyleSaisie(3355443, creerPolice_GEN("Roboto", -9.0d, 0));
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDheure_incident extends WDChampSaisieSimple {
            GWDheure_incident() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetre(GWDFFEN_Mes_incidents.this.getWDFenetreThis());
                super.setRectLibelle(0, 2, 2, 44);
                super.setRectCompPrincipal(2, 2, 98, 44);
                super.setQuid(3099803121647252520L);
                super.setChecksum("779439795");
                super.setNom("heure_incident");
                super.setType(20003);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setTaille(0);
                super.setNavigable(true);
                super.setEtatInitial(1);
                super.setPositionInitiale(C0607n.f1465w, C0538a.Nb);
                super.setTailleInitiale(100, 48);
                super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
                super.setPlan(0);
                super.setCadrageHorizontal(2);
                super.setMotDePasse(false);
                super.setLiaisonFichier("express_incident", "heure_incident");
                super.setTypeSaisie(3);
                super.setFormatMemorise("HHMM");
                super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("UseDatePickerTimeMask", "UseDatePickerTimeMask")));
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(5);
                super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
                super.setEllipse(0);
                super.setIndication(WDChaineMultilangue.getString("", ""));
                super.setNumTab(4);
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
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -2, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
                super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Edt.png?E5_3NP_8_8_8_8", new int[]{1, 4, 1, 4, 2, 4, 1, 4, 1}, new int[]{8, 8, 8, 8}, -1, 3, 5));
                super.setStyleSaisie(3355443, creerPolice_GEN("Roboto", -9.0d, 0));
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        class GWDmultimedia_incident extends WDChampImage {
            GWDmultimedia_incident() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetre(GWDFFEN_Mes_incidents.this.getWDFenetreThis());
                super.setQuid(3099803121646269433L);
                super.setChecksum("778320061");
                super.setNom("multimedia_incident");
                super.setType(30001);
                super.setLibelle(WDChaineMultilangue.getString("photo", "photo"));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setNavigable(false);
                super.setEtatInitial(0);
                super.setPositionInitiale(2, 85);
                super.setTailleInitiale(114, 66);
                super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
                super.setPlan(0);
                super.setLiaisonFichier("express_incident", "multimedia_incident");
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(3);
                super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
                super.setTransparence(1);
                super.setParamImage(10, 0, true, 100);
                super.setSymetrie(0);
                super.setZoneClicage(true);
                super.setPCodeMultitouch(false);
                super.setChargementEnTacheDeFond(false);
                super.setOrientationExif(false);
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

        class GWDtitre_incident extends WDChampSaisieSimple {
            GWDtitre_incident() {
            }

            public void initialiserObjet() {
                super.initialiserObjet();
                super.setFenetre(GWDFFEN_Mes_incidents.this.getWDFenetreThis());
                super.setRectCompPrincipal(0, 2, 312, 31);
                super.setQuid(3099803121645155258L);
                super.setChecksum("777203150");
                super.setNom("titre_incident");
                super.setType(20001);
                super.setLibelle(WDChaineMultilangue.getString("", ""));
                super.setMenuContextuelSysteme();
                super.setNote("", WDChaineMultilangue.getString("", ""));
                super.setTaille(50);
                super.setNavigable(true);
                super.setEtatInitial(1);
                super.setPositionInitiale(2, 2);
                super.setTailleInitiale(312, 35);
                super.setValeurInitiale(WDChaineMultilangue.getString("", ""));
                super.setPlan(0);
                super.setCadrageHorizontal(0);
                super.setMotDePasse(false);
                super.setLiaisonFichier("express_incident", "titre_incident");
                super.setTypeSaisie(0);
                super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
                super.setTailleMin(0, 0);
                super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
                super.setVisibleInitial(true);
                super.setAltitude(1);
                super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);
                super.setEllipse(0);
                super.setIndication(WDChaineMultilangue.getString("", ""));
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
                super.setStyleLibelle(3355443, creerPolice_GEN("Roboto", -9.0d, 0), -2, 0, C0607n.Xv);
                super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 15132390, 6710886, -1, 4, 4, 1, 1), 0, 0, 0, 0);
                super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Projet_Mobile\\ActivAndroid 5_Edt.png?E5_3NP_8_8_8_8", new int[]{1, 4, 1, 4, 2, 4, 1, 4, 1}, new int[]{8, 8, 8, 8}, -1, 3, 5));
                super.setStyleSaisie(3355443, creerPolice_GEN("Roboto", -9.0d, 0));
                activerEcoute();
                super.terminerInitialisation();
            }

            public void activerEcoute() {
            }
        }

        GWDZR_EXPRESS_Incident() {
        }

        public void initialiserSousObjets() {
            super.initialiserSousObjets();
            this.mWD_titre_incident.initialiserObjet();
            super.ajouterChamp("titre_incident", this.mWD_titre_incident);
            this.mWD_description_incident.initialiserObjet();
            super.ajouterChamp("description_incident", this.mWD_description_incident);
            this.mWD_multimedia_incident.initialiserObjet();
            super.ajouterChamp("multimedia_incident", this.mWD_multimedia_incident);
            this.mWD_date_incident.initialiserObjet();
            super.ajouterChamp("date_incident", this.mWD_date_incident);
            this.mWD_heure_incident.initialiserObjet();
            super.ajouterChamp("heure_incident", this.mWD_heure_incident);
            creerAttributAuto();
        }

        public void initialiserObjet() {
            super.initialiserObjet();
            super.setFenetre(GWDFFEN_Mes_incidents.this.getWDFenetreThis());
            super.setRectCompPrincipal(0, 0, 316, 217);
            super.setQuid(3099803121644303212L);
            super.setChecksum("776363872");
            super.setNom("ZR_EXPRESS_Incident");
            super.setType(30);
            super.setLibelle(WDChaineMultilangue.getString("Zone répétée", ""));
            super.setMenuContextuelSysteme();
            super.setNote("", WDChaineMultilangue.getString("", ""));
            super.setNavigable(true);
            super.setEtatInitial(4);
            super.setPositionInitiale(2, 2);
            super.setTailleInitiale(316, 456);
            super.setValeurInitiale("");
            super.setPlan(0);
            super.setSourceRemplissage("express_incident", "date_incident", "", false, "", false);
            super.setTailleMin(0, 0);
            super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
            super.setVisibleInitial(true);
            super.setAltitude(2);
            super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);
            super.setNumTab(1);
            super.setModeAscenseur(1, 1);
            super.setModeSelection(99);
            super.setSaisieEnCascade(false);
            super.setLettreAppel(65535);
            super.setEnregistrementSortieLigne(false);
            super.setPersistant(false);
            super.setParamAffichage(0, 1, 313, 217);
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
            super.setCouleurCellule(-1, -1, 16777215, 13941760);
            super.setImagePlusMoins("");
            activerEcoute();
            initialiserSousObjets();
            super.terminerInitialisation();
        }

        public void activerEcoute() {
        }
    }

    public static class WDActiviteFenetre extends WDActivite {
        protected WDFenetre getFenetre() {
            return GWDPProjet_Mobile.ms_Project.mWD_FEN_Mes_incidents;
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
        this.mWD_LIB_Fond = new GWDLIB_Fond();
        this.mWD_ZR_EXPRESS_Incident = new GWDZR_EXPRESS_Incident();
        this.mWD_MM_mVocal = new GWDMM_mVocal();
        this.mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
    }

    public void initialiserObjet() {
        super.setQuid(3099802627718689297L);
        super.setChecksum("776895211");
        super.setNom("FEN_Mes_incidents");
        super.setType(1);
        super.setMenuContextuelSysteme();
        super.setNote("", WDChaineMultilangue.getString("", ""));
        super.setCouleur(0);
        super.setCouleurFond(15527148);
        super.setPositionInitiale(0, 0);
        super.setTailleInitiale(320, 460);
        super.setTitre(WDChaineMultilangue.getString("Mes incidents", "الدرك الوطني في خدمتكم"));
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
        this.mWD_ZR_EXPRESS_Incident.initialiserObjet();
        super.ajouter("ZR_EXPRESS_Incident", this.mWD_ZR_EXPRESS_Incident);
        this.mWD_MM_mVocal.initialiserObjet();
        super.ajouter("MM_mVocal", this.mWD_MM_mVocal);
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
