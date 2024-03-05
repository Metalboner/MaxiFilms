public class Drama extends Film{

    boolean goodending;
    public Drama(String name,String director,int lenght,int budget,int fees, boolean goodending){
        super(name,director,lenght,budget,fees);
        this.goodending=goodending;
    }
    public String printinfo(){
        String str = "";
        if (goodending){
            str = "happy end";
        }else{
            str="bad end";
        }
        return "Film name is "+getName()+"\n"+" It's director is "+getDirector()+", It lenghts "+getLenght()+" minutes and its budget was "+getBudget()+" million dollars and box office is "+getFees()+" million dollars"+"\n"+"The film has "+str+"\n";
    }

}
