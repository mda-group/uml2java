/* 
 * Automatically generated Java code with ATL 
 */ 
public class Moteur implements IMoteurStateMachine {
    //attributes 
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@2a0f6e77 (name: Porte, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) ctrl;
  

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
   
} 
public interface IMoteurStateMachine{
  
} 
public class Capteur implements ICapteurStateMachine {
    //attributes 
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@92c8613 (name: Controleur, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) ctrl;
  

    //methodes 
     public  void  contact(){
     }
     public  void  Capteur(){
     }
   
} 
public interface ICapteurStateMachine{
  
} 
public class Porte implements IPorteStateMachine {
    //attributes 
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@45d5c9fc (name: Moteur, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) mt;
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@92c8613 (name: Controleur, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) ctrl;
  

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
   
} 
public interface IPorteStateMachine{
  
} 
public class Controleur implements IControleurStateMachine {
    //attributes 
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@7e1897f1 (name: Capteur, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) cf;
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@7e1897f1 (name: Capteur, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) co;
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@256b255c (name: Telecommande, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) tele;
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@2a0f6e77 (name: Porte, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) pt;
  

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
   
} 
public interface IControleurStateMachine{
  
} 
public class Telecommande implements ITelecommandeStateMachine {
    //attributes 
    public  org.eclipse.uml2.uml.internal.impl.ClassImpl@92c8613 (name: Controleur, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false) ctrl;
  

    //methodes 
     public  void  demandeOuverture(){
     }
     public  void  demandeFermeture(){
     }
     public  void  Telecommande(){
     }
   
} 
public interface ITelecommandeStateMachine{
  
} 
