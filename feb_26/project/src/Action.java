public class Action extends Film{
    private String speceffect;

    public Action(String name,String director,int lenght,int budget, int fees, String speceffect){
        super(name,director,lenght,budget,fees);
        this.speceffect=speceffect;
    }
    public String printinfo(){
        return "Film name is "+getName()+"\n"+" It's director is "+getDirector()+", It lenghts "+getLenght()+" minutes and its budget was "+getBudget()+" million dollars and box office is "+getFees()+" million dollars"+"\n"+"The film has these speceffects: "+speceffect+"\n";
    }

}
