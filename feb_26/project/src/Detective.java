public class Detective extends Film{
    private boolean investcompleted;

        public Detective(String name,String director, int lenght,int budget,int fees, boolean investcompleted){
            super(name,director,lenght,budget,fees);
            this.investcompleted=investcompleted;
        }
    public String printinfo(){
        return "Film name is "+getName()+"\n"+" It's director is "+getDirector()+", It lenghts "+getLenght()+" minutes and its budget was "+getBudget()+" million dollars and box office is "+getFees()+" million dollars"+"\n"+"The film has its investigation completed: "+investcompleted+"\n";
    }

}
