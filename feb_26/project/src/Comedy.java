public class Comedy extends Film{
    String soundeffect;
    public Comedy(String name,String director,int lenght,int budget,int fees,String soundeffect){
        super(name,director,lenght,budget,fees);
        this.soundeffect=soundeffect;
    }
    public String printinfo(){
        return "Film name is "+getName()+"\n"+" It's director is "+getDirector()+", It lenghts "+getLenght()+" minutes and its budget was "+getBudget()+" million dollars and box office is "+getFees()+" million dollars"+"\n"+"The film has soundeffects: "+soundeffect+"\n";
    }
}
