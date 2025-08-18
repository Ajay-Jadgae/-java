class GameCharacters {
    public static void main(String[] args) {
        
        String hero = "Mario";
        String villain = "Bowser";
        String sidekick = "Luigi";
        String princess = "Peach";
        String enemy = "Goomba";
        
        String[] characters = {hero, villain, sidekick, princess, enemy};

        for (int game  = 0; game < characters.length; game++) {
            String character = characters[game];
            System.out.println(character);
        }
    }
}