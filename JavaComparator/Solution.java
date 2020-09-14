class Checker implements Comparator<Player>{
    
    @Override
    public int compare(Player player1, Player player2){
        return (player1.score != player2.score) ? player2.score - player1.score : player1.name.compareTo(player2.name);
    }
}