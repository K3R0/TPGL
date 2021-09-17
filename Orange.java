/**
 *
 * @author roudet
 */
public class Orange {
    private double prix;
    private String origine;
	
    public Orange() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Orange(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Orange de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        Orange fruit_orange = new Orange(50, "Islande");
        //Creation d'une orange avec la provenance d'Islande
        System.out.println(fruit_orange.toString());
        //Affiche les informations de l'orange crée
        Orange orange_20 = new Orange(20, "Islande");
        //Création d'une deuxieme orange d'Islande avec un prix différent
        System.out.println(fruit_orange.equals(orange_20));
	System.out.println("premier test Orange");
   }
}
