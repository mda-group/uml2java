/* 
 * Automatically generated Java code with ATL 
 */ 
public class Moteur{
    //attributes 
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@4922d00a (name: Porte, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) ctrl;
    private IMoteurStateMachine moteurState;

    //methodes 
     public  void  pousser(){
     }
     public  void  tirer(){
     }
     public  void  stoppe(){
     }
     public  void  arreter(){
     }
     public  void  tire(){
     }
     public  void  pousse(){
     }
     public  void  Moteur(){
     }
     public  void setState(IMoteurStateMachine moteurState){
       this.moteurState=moteurState; 
     }

} 
public interface IMoteurStateMachine{
  
} 
public class Capteur{
    //attributes 
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@4639b5ab (name: Controleur, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) ctrl;
    private ICapteurStateMachine capteurState;

    //methodes 
     public  void  contact(){
     }
     public  void  Capteur(){
     }
     public  void setState(ICapteurStateMachine capteurState){
       this.capteurState=capteurState; 
     }

} 
public interface ICapteurStateMachine{
  
} 
public class Porte{
    //attributes 
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@16cbf0d2 (name: Moteur, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) mt;
    private IPorteStateMachine porteState;  public  org.eclipse.uml2.uml.internal.impl.ClassImpl@4639b5ab (name: Controleur, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) ctrl;
    private IPorteStateMachine porteState;

    //methodes 
     public  void  ouvre(){
     }
     public  void  ferme(){
     }
     public  void  pause(){
     }
     public  void  fermee(){
     }
     public  void  ouverte(){
     }
     public  void  bloque(){
     }
     public  void  reprend(){
     }
     public  void  Porte(){
     }
     public  void setState(IPorteStateMachine porteState){
       this.porteState=porteState; 
     }

} 
public interface IPorteStateMachine{
  
} 
public class Controleur{
    //attributes 
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@5e778288 (name: Capteur, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) cf;
    private IControleurStateMachine controleurState;  public  org.eclipse.uml2.uml.internal.impl.ClassImpl@5e778288 (name: Capteur, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) co;
    private IControleurStateMachine controleurState;  public  org.eclipse.uml2.uml.internal.impl.ClassImpl@7a15a53 (name: Telecommande, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) tele;
    private IControleurStateMachine controleurState;  public  org.eclipse.uml2.uml.internal.impl.ClassImpl@4922d00a (name: Porte, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) pt;
    private IControleurStateMachine controleurState;

    //methodes 
     public  void  enregistreContact(){
     }
     public  void  ouvre(){
     }
     public  void  ferme(){
     }
     public  void  urgence(){
     }
     public  void  contact(){
     }
     public  void  repriseCle(){
     }
     public  void  Controleur(){
     }
     public  void setState(IControleurStateMachine controleurState){
       this.controleurState=controleurState; 
     }

} 
public interface IControleurStateMachine{
  
} 
public class Telecommande{
    //attributes 
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@4639b5ab (name: Controleur, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) ctrl;
    private ITelecommandeStateMachine telecommandeState;

    //methodes 
     public  void  demandeOuverture(){
     }
     public  void  demandeFermeture(){
     }
     public  void  Telecommande(){
     }
     public  void setState(ITelecommandeStateMachine telecommandeState){
       this.telecommandeState=telecommandeState; 
     }

} 
public interface ITelecommandeStateMachine{
  
} 
